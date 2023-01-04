package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.form.TEditFormFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTEditFormFragment.TEditFormFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTEditFormFragment {
  private TListFragmentBuilderModule_ContributeTEditFormFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TEditFormFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TEditFormFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TEditFormFragmentSubcomponent extends AndroidInjector<TEditFormFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TEditFormFragment> {}
  }
}
