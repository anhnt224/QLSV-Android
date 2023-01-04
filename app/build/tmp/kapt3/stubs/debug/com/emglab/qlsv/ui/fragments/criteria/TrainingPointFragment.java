package com.emglab.qlsv.ui.fragments.criteria;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0017H\u0002J\u0016\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0013H\u0002J\b\u0010$\u001a\u00020\u0017H\u0002J\u0016\u0010%\u001a\u00020\u00172\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0013H\u0002J\b\u0010(\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/criteria/TrainingPointFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "()V", "binding", "Lcom/emglab/qlsv/databinding/TrainingPointFragmentBinding;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "semester", "Lcom/emglab/qlsv/models/entity/Semester;", "getSemester", "()Lcom/emglab/qlsv/models/entity/Semester;", "setSemester", "(Lcom/emglab/qlsv/models/entity/Semester;)V", "semesters", "", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/criteria/TrainingPointViewModel;", "chooseSemester", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "openCriteriaDetail", "setLineChart", "trainingPoints", "Lcom/emglab/qlsv/models/entity/TrainingPoint;", "setUpViewModel", "showBarChart", "criteriaReports", "Lcom/emglab/qlsv/models/entity/CriteriaReport;", "subscribeUI", "Companion", "app_debug"})
public final class TrainingPointFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable {
    private com.emglab.qlsv.ui.viewmodels.criteria.TrainingPointViewModel viewModel;
    private com.emglab.qlsv.databinding.TrainingPointFragmentBinding binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    @org.jetbrains.annotations.Nullable()
    private com.emglab.qlsv.models.entity.Semester semester;
    private java.util.List<com.emglab.qlsv.models.entity.Semester> semesters;
    public static final com.emglab.qlsv.ui.fragments.criteria.TrainingPointFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.di.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emglab.qlsv.models.entity.Semester getSemester() {
        return null;
    }
    
    public final void setSemester(@org.jetbrains.annotations.Nullable()
    com.emglab.qlsv.models.entity.Semester p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setLineChart(java.util.List<com.emglab.qlsv.models.entity.TrainingPoint> trainingPoints) {
    }
    
    private final void setUpViewModel() {
    }
    
    private final void subscribeUI() {
    }
    
    private final void chooseSemester() {
    }
    
    private final void showBarChart(java.util.List<com.emglab.qlsv.models.entity.CriteriaReport> criteriaReports) {
    }
    
    private final void openCriteriaDetail() {
    }
    
    public TrainingPointFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/criteria/TrainingPointFragment$Companion;", "", "()V", "newInstance", "Lcom/emglab/qlsv/ui/fragments/criteria/TrainingPointFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.ui.fragments.criteria.TrainingPointFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}