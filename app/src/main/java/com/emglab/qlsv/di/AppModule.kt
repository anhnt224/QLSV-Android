package com.emglab.qlsv.di

import androidx.room.Room
import android.content.Context
import android.content.SharedPreferences
import com.emglab.qlsv.App
import com.emglab.qlsv.BuildConfig
import com.emglab.qlsv.dao.*
import com.emglab.qlsv.data.AppDatabase
import com.emglab.qlsv.utilities.*

import com.emglab.qlsv.utilities.LiveDataCallAdapterFactory
import com.emglab.qlsv.webservices.*
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * AppModule will provide app-wide dependencies for a part of the application.
 * It should initialize objects used across our application, such as Room database, Retrofit, Shared Preference, etc.
 */
@Module(includes = [ViewModelsModule::class])
class AppModule {

    @Singleton // Annotation informs Dagger compiler that the instance should be created only once in the entire lifecycle of the application.
    @Provides // Annotation informs Dagger compiler that this method is the constructor for the Context return type.
    fun provideContext(app: App): Context = app // Using provide as a prefix is a common convention but not a requirement.

    @Provides
    @Singleton
    fun provideHttpClient(): OkHttpClient {
        // We need to prepare a custom OkHttp client because need to use our custom call interceptor.
        // to be able to authenticate our requests.
        val builder = OkHttpClient.Builder()
        // We add the interceptor to OkHttpClient.
        // It will add authentication headers to every call we make.
        builder.interceptors().add(AuthenticationInterceptor())

        // Configure this client not to retry when a connectivity problem is encountered.
        builder.retryOnConnectionFailure(false)
        builder.readTimeout(15, TimeUnit.SECONDS)

        // Log requests and responses.
        // Add logging as the last interceptor, because this will also log the information which
        // you added or manipulated with previous interceptors to your request.
        builder.interceptors().add(HttpLoggingInterceptor().apply {
            // For production environment to enhance apps performance we will be skipping any
            // logging operation. We will show logs just for debug builds.
            level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
        })
        return builder.build()
    }

    @Provides
    @Singleton
    fun provideApiService(httpClient: OkHttpClient): WebService {
        return Retrofit.Builder() // Create retrofit builder.
            .baseUrl(API_SERVICE_BASE_URL) // Base url for the api has to end with a slash.
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setDateFormat(DATE_FORMAT_PATTERN).create())) // Use GSON converter for JSON to POJO object mapping.
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .client(httpClient) // Here we set the custom OkHttp client we just created.
            .build().create(WebService::class.java) // We create an API using the interface we defined.
    }

    @Provides
    @Singleton
    fun provideFormService(httpClient: OkHttpClient): FormWebService {
        return Retrofit.Builder() // Create retrofit builder.
            .baseUrl(API_SERVICE_FORM_BASE_URL) // Base url for the api has to end with a slash.
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setDateFormat(DATE_FORMAT_PATTERN).create())) // Use GSON converter for JSON to POJO object mapping.
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .client(httpClient) // Here we set the custom OkHttp client we just created.
            .build().create(FormWebService::class.java) // We create an API using the interface we defined.
    }

    @Provides
    @Singleton
    fun provideRunWebService(httpClient: OkHttpClient): RunWebService {
        return Retrofit.Builder() // Create retrofit builder.
            .baseUrl(API_SERVICE_RUN_URL) // Base url for the api has to end with a slash.
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setDateFormat(DATE_FORMAT_PATTERN).create())) // Use GSON converter for JSON to POJO object mapping.
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .client(httpClient) // Here we set the custom OkHttp client we just created.
            .build().create(RunWebService::class.java) // We create an API using the interface we defined.
    }

    @Provides
    @Singleton
    fun provideTimeTableService(httpClient: OkHttpClient): TimeTableWebService {
        return Retrofit.Builder() // Create retrofit builder.
            .baseUrl(API_TIMETABLE) // Base url for the api has to end with a slash.
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setDateFormat(DATE_FORMAT_PATTERN).create())) // Use GSON converter for JSON to POJO object mapping.
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .client(httpClient) // Here we set the custom OkHttp client we just created.
            .build().create(TimeTableWebService::class.java) // We create an API using the interface we defined.
    }

    @Provides
    @Singleton
    fun provideGiftService(httpClient: OkHttpClient): GiftWebService {
        return Retrofit.Builder()
            .baseUrl(API_UPLOAD_SERVICE_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setDateFormat(DATE_FORMAT_PATTERN).create())) // Use GSON converter for JSON to POJO object mapping.
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .client(httpClient) // Here we set the custom OkHttp client we just created.
            .build().create(GiftWebService::class.java) // We create an API using the interface we defined.
    }

    @Provides
    @Singleton
    fun provideDb(app: App): AppDatabase {
        return Room.databaseBuilder(app, AppDatabase::class.java, DATABASE_NAME)
            // At current moment we don't want to provide migrations and specifically want database to be cleared when upgrade the version.
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideActivityDao(db: AppDatabase): ActivityDAO {
        return db.activityDAO()
    }

    @Provides
    @Singleton
    fun provideSVGroupDAO(db: AppDatabase): SVGroupDAO {
        return db.svGroupDAO()
    }

    @Provides
    @Singleton
    fun provideUserDAO(db: AppDatabase): UserDAO {
        return db.userDAO()
    }

    @Provides
    @Singleton
    fun provideCriteriaDAO(db: AppDatabase): CriteriaDAO {
        return db.criteriaDAO()
    }

//    @Provides
//    @Singleton
//    fun provideCriteriaGroupDAO(db: AppDatabase): CriteriaGroupDAO {
//        return db.criteriaGroupDAO()
//    }

    @Provides
    @Singleton
    fun provideUserCheckInActivityDAO(db: AppDatabase): UserCheckInActivityDAO {
        return db.userCheckInActivityDAO()
    }

    @Provides
    @Singleton
    fun provideScheduleStudnetDAO(db: AppDatabase): ScheduleStudnetDAO {
        return db.scheduleStudnetDAO()
    }

    @Provides
    @Singleton
    fun provideWeekNumberDAO(db: AppDatabase): WeekNumberDAO {
        return db.weekNumberDAO()
    }

    @Provides
    @Singleton
    fun provideCountStepsDAO(db: AppDatabase): CountStepsDAO {
        return db.countStepsDAO()
    }

    @Provides
    @Singleton
    fun provideTimetable(db: AppDatabase): TimetableDAO{
        return  db.timetableDAO()
    }

    @Provides
    @Singleton
    fun provideRunningLocationDao(db: AppDatabase): RunningLocationDao{
        return db.runningLocationDao()
    }

    @Provides
    @Singleton
    fun provideRunningWayDao(db: AppDatabase): RunningWayDao {
        return db.runningWayDao()
    }

    @Provides
    @Singleton
    fun provideSharedPreferences(context: Context): SharedPreferences
            = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)

    @Provides
    @Singleton
    fun provideImageMotelDao(db: AppDatabase): ImageMotelDao {
        return db.imageMotelDao()
    }

    @Provides
    @Singleton
    fun provideRunResult(db: AppDatabase): RunDataDao {
        return db.runDataDao()
    }

}