package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.user.MessageListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeMessageListFragment.MessageListFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeMessageListFragment {
  private MainListFragmentBuildersModule_ContributeMessageListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(MessageListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      MessageListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface MessageListFragmentSubcomponent extends AndroidInjector<MessageListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MessageListFragment> {}
  }
}
