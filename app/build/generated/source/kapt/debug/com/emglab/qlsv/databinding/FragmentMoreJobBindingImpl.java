package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMoreJobBindingImpl extends FragmentMoreJobBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(0, 
            new String[] {"layout_loading", "layout_empty_data"},
            new int[] {1, 2},
            new int[] {com.emglab.qlsv.R.layout.layout_loading,
                com.emglab.qlsv.R.layout.layout_empty_data});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerView, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.emglab.qlsv.databinding.LayoutEmptyDataBinding mboundView01;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMoreJobBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentMoreJobBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.emglab.qlsv.databinding.LayoutLoadingBinding) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            );
        setContainedBinding(this.include4);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.emglab.qlsv.databinding.LayoutEmptyDataBinding) bindings[2];
        setContainedBinding(this.mboundView01);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        include4.invalidateAll();
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
        if (include4.hasPendingBindings()) {
            return true;
        }
        if (mboundView01.hasPendingBindings()) {
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.number);
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
    public void setResource(@Nullable com.emglab.qlsv.common.Resource Resource) {
        this.mResource = Resource;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.resource);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        include4.setLifecycleOwner(lifecycleOwner);
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeInclude4((com.emglab.qlsv.databinding.LayoutLoadingBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeInclude4(com.emglab.qlsv.databinding.LayoutLoadingBinding Include4, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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

        if ((dirtyFlags & 0x12L) != 0) {
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x18L) != 0) {



                if (resource != null) {
                    // read resource.status
                    resourceStatus = resource.getStatus();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.include4.setCallback(callback);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.include4.setStatus(resourceStatus);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.mboundView01.setNumber(number);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView01.setTitle("Chưa có thông tin việc làm thêm");
        }
        executeBindingsOn(include4);
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): include4
        flag 1 (0x2L): number
        flag 2 (0x3L): callback
        flag 3 (0x4L): resource
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}