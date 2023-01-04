package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.student.TeacherMarkFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTeacherMarkFragment.TeacherMarkFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTeacherMarkFragment {
  private TListFragmentBuilderModule_ContributeTeacherMarkFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TeacherMarkFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TeacherMarkFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TeacherMarkFragmentSubcomponent extends AndroidInjector<TeacherMarkFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TeacherMarkFragment> {}
  }
}
