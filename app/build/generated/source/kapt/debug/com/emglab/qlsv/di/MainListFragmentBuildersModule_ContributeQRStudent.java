package com.emglab.qlsv.di;

import androidx.fragment.app.Fragment;
import com.emglab.qlsv.ui.fragments.user.QrStudentFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      MainListFragmentBuildersModule_ContributeQRStudent.QrStudentFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class MainListFragmentBuildersModule_ContributeQRStudent {
  private MainListFragmentBuildersModule_ContributeQRStudent() {}

  @Binds
  @IntoMap
  @FragmentKey(QrStudentFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      QrStudentFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface QrStudentFragmentSubcomponent extends AndroidInjector<QrStudentFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<QrStudentFragment> {}
  }
}
