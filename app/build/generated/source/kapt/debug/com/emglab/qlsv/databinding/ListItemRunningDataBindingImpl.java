package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemRunningDataBindingImpl extends ListItemRunningDataBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView14, 6);
        sViewsWithIds.put(R.id.linearLayout12, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemRunningDataBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ListItemRunningDataBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.textView12.setTag(null);
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
        if (BR.runningData == variableId) {
            setRunningData((com.emglab.qlsv.models.req.RunningDataRequest) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRunningData(@Nullable com.emglab.qlsv.models.req.RunningDataRequest RunningData) {
        this.mRunningData = RunningData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.runningData);
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
        java.lang.String runningDataGetTimeStr = null;
        java.lang.String runningDataTitle = null;
        java.lang.String runningDataGetDistanceStr = null;
        java.lang.String runningDataGetDistanceUnit = null;
        java.lang.String runningDataTimeStart = null;
        com.emglab.qlsv.models.req.RunningDataRequest runningData = mRunningData;

        if ((dirtyFlags & 0x3L) != 0) {



                if (runningData != null) {
                    // read runningData.getTimeStr()
                    runningDataGetTimeStr = runningData.getTimeStr();
                    // read runningData.title
                    runningDataTitle = runningData.getTitle();
                    // read runningData.getDistanceStr()
                    runningDataGetDistanceStr = runningData.getDistanceStr();
                    // read runningData.getDistanceUnit()
                    runningDataGetDistanceUnit = runningData.getDistanceUnit();
                    // read runningData.timeStart
                    runningDataTimeStart = runningData.getTimeStart();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, runningDataTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, runningDataGetDistanceStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, runningDataGetDistanceUnit);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, runningDataGetTimeStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView12, runningDataTimeStart);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): runningData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}