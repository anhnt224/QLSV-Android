package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.TListNotificationsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTListNotificationsFragment
          .TListNotificationsFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTListNotificationsFragment {
  private TListFragmentBuilderModule_ContributeTListNotificationsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TListNotificationsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TListNotificationsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TListNotificationsFragmentSubcomponent
      extends AndroidInjector<TListNotificationsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TListNotificationsFragment> {}
  }
}
