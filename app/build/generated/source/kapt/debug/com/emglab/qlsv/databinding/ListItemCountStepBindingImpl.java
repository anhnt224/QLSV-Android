package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemCountStepBindingImpl extends ListItemCountStepBinding  {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemCountStepBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ListItemCountStepBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
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
        if (BR.countSteps == variableId) {
            setCountSteps((com.emglab.qlsv.models.entity.CountSteps) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCountSteps(@Nullable com.emglab.qlsv.models.entity.CountSteps CountSteps) {
        this.mCountSteps = CountSteps;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.countSteps);
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
        int countStepsSteps = 0;
        java.lang.String countStepsTimer = null;
        com.emglab.qlsv.models.entity.CountSteps countSteps = mCountSteps;
        java.lang.String integerToStringCountStepsSteps = null;
        java.util.Date countStepsDate = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (countSteps != null) {
                    // read countSteps.steps
                    countStepsSteps = countSteps.getSteps();
                    // read countSteps.timer
                    countStepsTimer = countSteps.getTimer();
                    // read countSteps.date
                    countStepsDate = countSteps.getDate();
                }


                // read Integer.toString(countSteps.steps)
                integerToStringCountStepsSteps = java.lang.Integer.toString(countStepsSteps);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, integerToStringCountStepsSteps);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, countStepsTimer);
            com.emglab.qlsv.binding.BindingAdapterKt.converDateToStringDDMMYYYY(this.mboundView3, countStepsDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): countSteps
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}