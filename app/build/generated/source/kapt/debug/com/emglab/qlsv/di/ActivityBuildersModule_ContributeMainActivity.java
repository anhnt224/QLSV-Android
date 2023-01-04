package com.emglab.qlsv.di;

import android.app.Activity;
import com.emglab.qlsv.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuildersModule_ContributeMainActivity {
  private ActivityBuildersModule_ContributeMainActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent(modules = MainListFragmentBuildersModule.class)
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
