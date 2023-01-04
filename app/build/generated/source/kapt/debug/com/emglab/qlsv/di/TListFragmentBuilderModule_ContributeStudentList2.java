package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.modules_teacher.contactParent.StudentList2Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeStudentList2.StudentList2FragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeStudentList2 {
  private TListFragmentBuilderModule_ContributeStudentList2() {}

  @Binds
  @IntoMap
  @FragmentKey(StudentList2Fragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      StudentList2FragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface StudentList2FragmentSubcomponent extends AndroidInjector<StudentList2Fragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<StudentList2Fragment> {}
  }
}
