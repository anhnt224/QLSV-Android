package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.form.TFormRegisteredFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTFormRegisteredFragment
          .TFormRegisteredFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTFormRegisteredFragment {
  private TListFragmentBuilderModule_ContributeTFormRegisteredFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TFormRegisteredFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TFormRegisteredFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TFormRegisteredFragmentSubcomponent
      extends AndroidInjector<TFormRegisteredFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TFormRegisteredFragment> {}
  }
}
