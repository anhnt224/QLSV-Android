package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RunningFragmentBindingImpl extends RunningFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(0, 
            new String[] {"loading_action_state"},
            new int[] {1},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mapView, 2);
        sViewsWithIds.put(R.id.cardView, 3);
        sViewsWithIds.put(R.id.linearLayout, 4);
        sViewsWithIds.put(R.id.titleTextView, 5);
        sViewsWithIds.put(R.id.targetTextView, 6);
        sViewsWithIds.put(R.id.timeStartTextView, 7);
        sViewsWithIds.put(R.id.distanceTextView, 8);
        sViewsWithIds.put(R.id.timeTextView, 9);
        sViewsWithIds.put(R.id.startOrPauseLayout, 10);
        sViewsWithIds.put(R.id.startOrPauseImageView, 11);
        sViewsWithIds.put(R.id.continueOrFinishLayout, 12);
        sViewsWithIds.put(R.id.continueButton, 13);
        sViewsWithIds.put(R.id.finishButton, 14);
    }
    // views
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView01;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RunningFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private RunningFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[14]
            , (android.widget.LinearLayout) bindings[4]
            , (com.google.android.gms.maps.MapView) bindings[2]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[1];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView01.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        mboundView0.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
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

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView0.setLifecycleOwner(lifecycleOwner);
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
        com.emglab.qlsv.common.Status status = mStatus;

        if ((dirtyFlags & 0x3L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView0.setStatus(status);
        }
        executeBindingsOn(mboundView0);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}