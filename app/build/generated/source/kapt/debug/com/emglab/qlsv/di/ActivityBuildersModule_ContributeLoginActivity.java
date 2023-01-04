package com.emglab.qlsv.di;

import android.app.Activity;
import com.emglab.qlsv.LoginActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuildersModule_ContributeLoginActivity {
  private ActivityBuildersModule_ContributeLoginActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(LoginActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      LoginActivitySubcomponent.Builder builder);

  @Subcomponent(modules = LoginListFragmentBuildersModule.class)
  public interface LoginActivitySubcomponent extends AndroidInjector<LoginActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginActivity> {}
  }
}
