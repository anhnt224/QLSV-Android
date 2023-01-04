package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.account.TeacherInfoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeTeacherInfoFragment.TeacherInfoFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeTeacherInfoFragment {
  private TListFragmentBuilderModule_ContributeTeacherInfoFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TeacherInfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TeacherInfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TeacherInfoFragmentSubcomponent extends AndroidInjector<TeacherInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TeacherInfoFragment> {}
  }
}
