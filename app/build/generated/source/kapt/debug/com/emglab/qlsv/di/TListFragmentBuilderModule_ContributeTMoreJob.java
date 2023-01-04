package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.job.TMoreJobFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = TListFragmentBuilderModule_ContributeTMoreJob.TMoreJobFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTMoreJob {
  private TListFragmentBuilderModule_ContributeTMoreJob() {}

  @Binds
  @IntoMap
  @FragmentKey(TMoreJobFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TMoreJobFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TMoreJobFragmentSubcomponent extends AndroidInjector<TMoreJobFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TMoreJobFragment> {}
  }
}
