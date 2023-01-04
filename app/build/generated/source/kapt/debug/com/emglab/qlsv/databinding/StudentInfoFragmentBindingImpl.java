package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class StudentInfoFragmentBindingImpl extends StudentInfoFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(19);
        sIncludes.setIncludes(0, 
            new String[] {"layout_loading"},
            new int[] {16},
            new int[] {com.emglab.qlsv.R.layout.layout_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lineChart, 17);
        sViewsWithIds.put(R.id.viewNote, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.emglab.qlsv.databinding.LayoutLoadingBinding mboundView01;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public StudentInfoFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private StudentInfoFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.github.mikephil.charting.charts.LineChart) bindings[17]
            , (android.widget.LinearLayout) bindings[18]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.emglab.qlsv.databinding.LayoutLoadingBinding) bindings[16];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        mboundView01.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.status == variableId) {
            setStatus((com.emglab.qlsv.common.Status) variable);
        }
        else if (BR.studentInfo == variableId) {
            setStudentInfo((com.emglab.qlsv.models.entity.StudentInfo) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.emglab.qlsv.common.RetryCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStatus(@Nullable com.emglab.qlsv.common.Status Status) {
        this.mStatus = Status;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.status);
        super.requestRebind();
    }
    public void setStudentInfo(@Nullable com.emglab.qlsv.models.entity.StudentInfo StudentInfo) {
        this.mStudentInfo = StudentInfo;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.studentInfo);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.emglab.qlsv.common.RetryCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String studentInfoBirthDay = null;
        com.emglab.qlsv.common.Status status = mStatus;
        java.lang.String studentInfoLevelStudent = null;
        java.lang.String studentInfoSex = null;
        java.lang.String studentInfoProgramType = null;
        java.lang.String studentInfoStatus = null;
        com.emglab.qlsv.models.entity.StudentInfo studentInfo = mStudentInfo;
        java.lang.String studentInfoGetCurrentCPA = null;
        java.lang.String studentInfoName = null;
        java.lang.String studentInfoFaculty = null;
        java.lang.String studentInfoLevelWarning = null;
        java.lang.String studentInfoSumTC = null;
        com.emglab.qlsv.common.RetryCallback callback = mCallback;
        java.lang.String studentInfoTcDue = null;
        java.lang.String studentInfoEmail = null;
        java.lang.String studentInfoAddress = null;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (studentInfo != null) {
                    // read studentInfo.birthDay
                    studentInfoBirthDay = studentInfo.getBirthDay();
                    // read studentInfo.levelStudent
                    studentInfoLevelStudent = studentInfo.getLevelStudent();
                    // read studentInfo.sex
                    studentInfoSex = studentInfo.getSex();
                    // read studentInfo.programType
                    studentInfoProgramType = studentInfo.getProgramType();
                    // read studentInfo.status
                    studentInfoStatus = studentInfo.getStatus();
                    // read studentInfo.getCurrentCPA()
                    studentInfoGetCurrentCPA = studentInfo.getCurrentCPA();
                    // read studentInfo.name
                    studentInfoName = studentInfo.getName();
                    // read studentInfo.faculty
                    studentInfoFaculty = studentInfo.getFaculty();
                    // read studentInfo.levelWarning
                    studentInfoLevelWarning = studentInfo.getLevelWarning();
                    // read studentInfo.sumTC
                    studentInfoSumTC = studentInfo.getSumTC();
                    // read studentInfo.tcDue
                    studentInfoTcDue = studentInfo.getTcDue();
                    // read studentInfo.email
                    studentInfoEmail = studentInfo.getEmail();
                    // read studentInfo.address
                    studentInfoAddress = studentInfo.getAddress();
                }
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView01.setStatus(status);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView01.setCallback(callback);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, studentInfoProgramType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, studentInfoLevelStudent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, studentInfoLevelWarning);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, studentInfoSumTC);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, studentInfoTcDue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, studentInfoGetCurrentCPA);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, studentInfoName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, studentInfoSex);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, studentInfoBirthDay);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, studentInfoEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, studentInfoAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, studentInfoStatus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, studentInfoFaculty);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): studentInfo
        flag 2 (0x3L): callback
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}