package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.teacher.fragment.student.ListStudentFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      TListFragmentBuilderModule_ContributeListStudentFragment.ListStudentFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class TListFragmentBuilderModule_ContributeListStudentFragment {
  private TListFragmentBuilderModule_ContributeListStudentFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ListStudentFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListStudentFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListStudentFragmentSubcomponent extends AndroidInjector<ListStudentFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListStudentFragment> {}
  }
}
