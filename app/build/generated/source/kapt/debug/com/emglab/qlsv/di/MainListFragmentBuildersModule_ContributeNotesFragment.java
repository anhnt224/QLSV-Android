package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.user.NotesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeNotesFragment.NotesFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeNotesFragment {
  private MainListFragmentBuildersModule_ContributeNotesFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(NotesFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      NotesFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface NotesFragmentSubcomponent extends AndroidInjector<NotesFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NotesFragment> {}
  }
}
