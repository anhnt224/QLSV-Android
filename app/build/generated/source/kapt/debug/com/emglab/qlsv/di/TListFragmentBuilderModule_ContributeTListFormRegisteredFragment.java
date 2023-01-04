package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.form.TListFormRegisteredFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTListFormRegisteredFragment
          .TListFormRegisteredFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTListFormRegisteredFragment {
  private TListFragmentBuilderModule_ContributeTListFormRegisteredFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TListFormRegisteredFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TListFormRegisteredFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TListFormRegisteredFragmentSubcomponent
      extends AndroidInjector<TListFormRegisteredFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TListFormRegisteredFragment> {}
  }
}
