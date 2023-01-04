package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.student.ListActivitiesOfStudentFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeListActivitiesOfStudent
          .ListActivitiesOfStudentFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeListActivitiesOfStudent {
  private TListFragmentBuilderModule_ContributeListActivitiesOfStudent() {}

  @Binds
  @IntoMap
  @FragmentKey(ListActivitiesOfStudentFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListActivitiesOfStudentFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListActivitiesOfStudentFragmentSubcomponent
      extends AndroidInjector<ListActivitiesOfStudentFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListActivitiesOfStudentFragment> {}
  }
}
