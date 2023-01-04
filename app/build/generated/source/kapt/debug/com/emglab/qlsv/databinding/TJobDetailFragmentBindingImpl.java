package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TJobDetailFragmentBindingImpl extends TJobDetailFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
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
    private final android.widget.TextView mboundView16;
    @NonNull
    private final android.widget.TextView mboundView17;
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
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TJobDetailFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private TJobDetailFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
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
        this.mboundView16 = (android.widget.TextView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (android.widget.TextView) bindings[17];
        this.mboundView17.setTag(null);
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
        this.mboundView7 = (android.widget.TextView) bindings[7];
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
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.job == variableId) {
            setJob((com.emglab.qlsv.models.entity.Job) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setJob(@Nullable com.emglab.qlsv.models.entity.Job Job) {
        this.mJob = Job;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.job);
        super.requestRebind();
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
        java.lang.String jobTitle = null;
        java.lang.String jobContactName = null;
        java.lang.String jobWorkType = null;
        java.lang.String jobContactEmail = null;
        java.lang.String jobGetDescription = null;
        java.lang.String jobWorkAddress = null;
        java.lang.String jobDegreeRequire = null;
        java.lang.String jobSexRequire = null;
        java.lang.String jobWorkPosition = null;
        java.lang.String jobGetBenefitStr = null;
        java.lang.String jobSalary = null;
        java.lang.String jobCompanyName = null;
        com.emglab.qlsv.models.entity.Job job = mJob;
        java.lang.String jobGetQuantity = null;
        java.lang.String jobGetDeadline = null;
        java.lang.String jobWorkExperience = null;
        java.lang.String jobGetWorkRequireStr = null;
        java.lang.String jobContactPhone = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (job != null) {
                    // read job.title
                    jobTitle = job.getTitle();
                    // read job.contactName
                    jobContactName = job.getContactName();
                    // read job.workType
                    jobWorkType = job.getWorkType();
                    // read job.contactEmail
                    jobContactEmail = job.getContactEmail();
                    // read job.getDescription()
                    jobGetDescription = job.getDescription();
                    // read job.workAddress
                    jobWorkAddress = job.getWorkAddress();
                    // read job.degreeRequire
                    jobDegreeRequire = job.getDegreeRequire();
                    // read job.sexRequire
                    jobSexRequire = job.getSexRequire();
                    // read job.workPosition
                    jobWorkPosition = job.getWorkPosition();
                    // read job.getBenefitStr()
                    jobGetBenefitStr = job.getBenefitStr();
                    // read job.salary
                    jobSalary = job.getSalary();
                    // read job.companyName
                    jobCompanyName = job.getCompanyName();
                    // read job.getQuantity()
                    jobGetQuantity = job.getQuantity();
                    // read job.getDeadline()
                    jobGetDeadline = job.getDeadline();
                    // read job.workExperience
                    jobWorkExperience = job.getWorkExperience();
                    // read job.getWorkRequireStr()
                    jobGetWorkRequireStr = job.getWorkRequireStr();
                    // read job.contactPhone
                    jobContactPhone = job.getContactPhone();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, jobTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, jobWorkType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, jobWorkPosition);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, jobGetDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, jobGetBenefitStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, jobGetWorkRequireStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, jobContactName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView16, jobContactPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView17, jobContactEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, jobCompanyName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, jobWorkAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, jobSalary);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, jobGetDeadline);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, jobWorkExperience);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, jobDegreeRequire);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, jobSexRequire);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, jobGetQuantity);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): job
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}