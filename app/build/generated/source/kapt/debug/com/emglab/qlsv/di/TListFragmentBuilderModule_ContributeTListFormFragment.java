package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.form.TListFormFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTListFormFragment.TListFormFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTListFormFragment {
  private TListFragmentBuilderModule_ContributeTListFormFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TListFormFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TListFormFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TListFormFragmentSubcomponent extends AndroidInjector<TListFormFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TListFormFragment> {}
  }
}
