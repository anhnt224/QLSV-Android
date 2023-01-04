package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemRunResultBindingImpl extends ListItemRunResultBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewRunResult, 5);
        sViewsWithIds.put(R.id.imageView15, 6);
        sViewsWithIds.put(R.id.linearLayout14, 7);
        sViewsWithIds.put(R.id.linearLayout13, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemRunResultBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ListItemRunResultBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[7]
            , (com.google.android.material.card.MaterialCardView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
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
        if (BR.runResult == variableId) {
            setRunResult((com.emglab.qlsv.models.entity.run.RunResult) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRunResult(@Nullable com.emglab.qlsv.models.entity.run.RunResult RunResult) {
        this.mRunResult = RunResult;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.runResult);
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
        java.lang.String runResultGetPace = null;
        com.emglab.qlsv.models.entity.run.RunResult runResult = mRunResult;
        java.lang.String runResultGetDateStartStr = null;
        java.lang.String runResultGetTime = null;
        java.lang.String runResultGetDistanceStr = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (runResult != null) {
                    // read runResult.getPace()
                    runResultGetPace = runResult.getPace();
                    // read runResult.getDateStartStr()
                    runResultGetDateStartStr = runResult.getDateStartStr();
                    // read runResult.getTime()
                    runResultGetTime = runResult.getTime();
                    // read runResult.getDistanceStr()
                    runResultGetDistanceStr = runResult.getDistanceStr();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, runResultGetDateStartStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, runResultGetDistanceStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, runResultGetTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, runResultGetPace);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): runResult
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}