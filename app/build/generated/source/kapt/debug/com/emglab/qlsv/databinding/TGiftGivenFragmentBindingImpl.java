package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TGiftGivenFragmentBindingImpl extends TGiftGivenFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"layout_loading", "layout_empty_data"},
            new int[] {1, 2},
            new int[] {com.emglab.qlsv.R.layout.layout_loading,
                com.emglab.qlsv.R.layout.layout_empty_data});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipeRefreshLayout, 3);
        sViewsWithIds.put(R.id.giftCreatedList, 4);
        sViewsWithIds.put(R.id.addFab, 5);
    }
    // views
    @Nullable
    private final com.emglab.qlsv.databinding.LayoutLoadingBinding mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView01;
    @Nullable
    private final com.emglab.qlsv.databinding.LayoutEmptyDataBinding mboundView02;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TGiftGivenFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private TGiftGivenFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[3]
            );
        this.mboundView0 = (com.emglab.qlsv.databinding.LayoutLoadingBinding) bindings[1];
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
                mDirtyFlags = 0x8L;
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
        else if (BR.callback == variableId) {
            setCallback((com.emglab.qlsv.common.RetryCallback) variable);
        }
        else if (BR.resource == variableId) {
            setResource((com.emglab.qlsv.common.Resource) variable);
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
    public void setCallback(@Nullable com.emglab.qlsv.common.RetryCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }
    public void setResource(@Nullable com.emglab.qlsv.common.Resource Resource) {
        this.mResource = Resource;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.resource);
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
        com.emglab.qlsv.common.Status resourceStatus = null;
        java.lang.Integer number = mNumber;
        com.emglab.qlsv.common.RetryCallback callback = mCallback;
        com.emglab.qlsv.common.Resource<?> resource = mResource;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (resource != null) {
                    // read resource.status
                    resourceStatus = resource.getStatus();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.mboundView0.setCallback(callback);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView0.setStatus(resourceStatus);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView02.setNumber(number);
        }
        if ((dirtyFlags & 0x8L) != 0) {
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
        flag 1 (0x2L): callback
        flag 2 (0x3L): resource
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}