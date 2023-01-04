package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.student.TStudentNoteFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTStudentNoteFragment.TStudentNoteFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTStudentNoteFragment {
  private TListFragmentBuilderModule_ContributeTStudentNoteFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TStudentNoteFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TStudentNoteFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TStudentNoteFragmentSubcomponent extends AndroidInjector<TStudentNoteFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TStudentNoteFragment> {}
  }
}
