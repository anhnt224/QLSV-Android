package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTutorBindingImpl extends FragmentTutorBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView18, 6);
        sViewsWithIds.put(R.id.closeButton, 7);
        sViewsWithIds.put(R.id.shareButton, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTutorBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentTutorBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            );
        this.findTutorButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView17.setTag(null);
        this.textView19.setTag(null);
        this.textView20.setTag(null);
        this.tutorRegistrationButton.setTag(null);
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
        if (BR.tutorJob == variableId) {
            setTutorJob((com.emglab.qlsv.models.entity.TutorJob) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTutorJob(@Nullable com.emglab.qlsv.models.entity.TutorJob TutorJob) {
        this.mTutorJob = TutorJob;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tutorJob);
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
        java.lang.String tutorJobDescription = null;
        java.lang.String tutorJobTutorRegistrationTitle = null;
        java.lang.String tutorJobTitle = null;
        java.lang.String tutorJobCopyright = null;
        com.emglab.qlsv.models.entity.TutorJob tutorJob = mTutorJob;
        java.lang.String tutorJobFindTutorTitle = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tutorJob != null) {
                    // read tutorJob.description
                    tutorJobDescription = tutorJob.getDescription();
                    // read tutorJob.tutorRegistrationTitle
                    tutorJobTutorRegistrationTitle = tutorJob.getTutorRegistrationTitle();
                    // read tutorJob.title
                    tutorJobTitle = tutorJob.getTitle();
                    // read tutorJob.copyright
                    tutorJobCopyright = tutorJob.getCopyright();
                    // read tutorJob.findTutorTitle
                    tutorJobFindTutorTitle = tutorJob.getFindTutorTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.findTutorButton, tutorJobFindTutorTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView17, tutorJobTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView19, tutorJobCopyright);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView20, tutorJobDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tutorRegistrationButton, tutorJobTutorRegistrationTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tutorJob
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}