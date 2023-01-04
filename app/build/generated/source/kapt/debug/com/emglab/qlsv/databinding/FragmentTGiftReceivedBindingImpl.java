package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTGiftReceivedBindingImpl extends FragmentTGiftReceivedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(0, 
            new String[] {"loading_action_state", "layout_empty_data"},
            new int[] {1, 2},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state,
                com.emglab.qlsv.R.layout.layout_empty_data});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerView, 3);
    }
    // views
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView01;
    @Nullable
    private final com.emglab.qlsv.databinding.LayoutEmptyDataBinding mboundView02;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTGiftReceivedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentTGiftReceivedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            );
        this.mboundView0 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[1];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView01.setTag(null);
        this.mboundView02 = (com.emglab.qlsv.databinding.LayoutEmptyDataBinding) bindings[2];
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
        if (BR.number == variableId) {
            setNumber((java.lang.Integer) variable);
        }
        else if (BR.loadPublicGiftStatus == variableId) {
            setLoadPublicGiftStatus((com.emglab.qlsv.common.Status) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNumber(@Nullable java.lang.Integer Number) {
        this.mNumber = Number;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.number);
        super.requestRebind();
    }
    public void setLoadPublicGiftStatus(@Nullable com.emglab.qlsv.common.Status LoadPublicGiftStatus) {
        this.mLoadPublicGiftStatus = LoadPublicGiftStatus;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.loadPublicGiftStatus);
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
        java.lang.Integer number = mNumber;
        com.emglab.qlsv.common.Status loadPublicGiftStatus = mLoadPublicGiftStatus;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView0.setStatus(loadPublicGiftStatus);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView02.setNumber(number);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView02.setTitle("Chưa có thông tin quà tặng");
        }
        executeBindingsOn(mboundView0);
        executeBindingsOn(mboundView02);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): number
        flag 1 (0x2L): loadPublicGiftStatus
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}