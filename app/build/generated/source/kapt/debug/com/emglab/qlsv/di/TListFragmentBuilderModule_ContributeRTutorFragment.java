package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.TTutorFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeRTutorFragment.TTutorFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeRTutorFragment {
  private TListFragmentBuilderModule_ContributeRTutorFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TTutorFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TTutorFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TTutorFragmentSubcomponent extends AndroidInjector<TTutorFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TTutorFragment> {}
  }
}
