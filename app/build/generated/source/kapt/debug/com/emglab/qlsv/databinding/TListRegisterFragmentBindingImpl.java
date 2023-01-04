package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TListRegisterFragmentBindingImpl extends TListRegisterFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(0, 
            new String[] {"loading_action_state", "loading_action_state"},
            new int[] {1, 2},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state,
                com.emglab.qlsv.R.layout.loading_action_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.giftRegisterList, 3);
        sViewsWithIds.put(R.id.linearLayout18, 4);
        sViewsWithIds.put(R.id.giftName, 5);
        sViewsWithIds.put(R.id.quantity, 6);
        sViewsWithIds.put(R.id.approveButton, 7);
    }
    // views
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView01;
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView02;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TListRegisterFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private TListRegisterFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView0 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[1];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView01.setTag(null);
        this.mboundView02 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[2];
        setContainedBinding(this.mboundView02);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView0.invalidateAll();
        mboundView02.invalidateAll();
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
        if (mboundView02.hasPendingBindings()) {
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
        else if (BR.getRegistersStatus == variableId) {
            setGetRegistersStatus((com.emglab.qlsv.common.Status) variable);
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
    public void setGetRegistersStatus(@Nullable com.emglab.qlsv.common.Status GetRegistersStatus) {
        this.mGetRegistersStatus = GetRegistersStatus;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.getRegistersStatus);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView0.setLifecycleOwner(lifecycleOwner);
        mboundView02.setLifecycleOwner(lifecycleOwner);
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
        com.emglab.qlsv.common.Status getRegistersStatus = mGetRegistersStatus;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView0.setStatus(status);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView02.setStatus(getRegistersStatus);
        }
        executeBindingsOn(mboundView0);
        executeBindingsOn(mboundView02);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): getRegistersStatus
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}