package com.emglab.qlsv.di;

import android.app.Activity;
import com.emglab.qlsv.TeacherActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityBuildersModule_ContributeTeacherActivity.TeacherActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuildersModule_ContributeTeacherActivity {
  private ActivityBuildersModule_ContributeTeacherActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(TeacherActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      TeacherActivitySubcomponent.Builder builder);

  @Subcomponent(modules = TListFragmentBuilderModule.class)
  public interface TeacherActivitySubcomponent extends AndroidInjector<TeacherActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TeacherActivity> {}
  }
}
