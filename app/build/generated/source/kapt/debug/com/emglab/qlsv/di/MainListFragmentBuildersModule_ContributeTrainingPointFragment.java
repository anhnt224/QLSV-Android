package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.criteria.TrainingPointFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeTrainingPointFragment
          .TrainingPointFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeTrainingPointFragment {
  private MainListFragmentBuildersModule_ContributeTrainingPointFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TrainingPointFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TrainingPointFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TrainingPointFragmentSubcomponent
      extends AndroidInjector<TrainingPointFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TrainingPointFragment> {}
  }
}
