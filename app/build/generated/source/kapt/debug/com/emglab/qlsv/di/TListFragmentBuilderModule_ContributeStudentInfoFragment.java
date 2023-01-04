package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.student.StudentInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeStudentInfoFragment.StudentInfoFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeStudentInfoFragment {
  private TListFragmentBuilderModule_ContributeStudentInfoFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(StudentInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      StudentInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface StudentInfoFragmentSubcomponent extends AndroidInjector<StudentInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<StudentInfoFragment> {}
  }
}
