package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListFormsRegisteredFragmentBindingImpl extends ListFormsRegisteredFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(0, 
            new String[] {"layout_loading"},
            new int[] {1},
            new int[] {com.emglab.qlsv.R.layout.layout_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipeRefreshLayout, 2);
        sViewsWithIds.put(R.id.recyclerview, 3);
        sViewsWithIds.put(R.id.ratingLayout, 4);
        sViewsWithIds.put(R.id.textTitle, 5);
        sViewsWithIds.put(R.id.ratingBar, 6);
        sViewsWithIds.put(R.id.textRatingLayout, 7);
        sViewsWithIds.put(R.id.buttonRating, 8);
        sViewsWithIds.put(R.id.buttonCancelRating, 9);
    }
    // views
    @Nullable
    private final com.emglab.qlsv.databinding.LayoutLoadingBinding mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView01;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListFormsRegisteredFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ListFormsRegisteredFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (android.widget.RatingBar) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (com.emglab.qlsv.databinding.LayoutLoadingBinding) bindings[1];
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
                mDirtyFlags = 0x4L;
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
        if (BR.callback == variableId) {
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

    public void setCallback(@Nullable com.emglab.qlsv.common.RetryCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }
    public void setResource(@Nullable com.emglab.qlsv.common.Resource Resource) {
        this.mResource = Resource;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.resource);
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
        com.emglab.qlsv.common.Status resourceStatus = null;
        com.emglab.qlsv.common.RetryCallback callback = mCallback;
        com.emglab.qlsv.common.Resource<?> resource = mResource;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (resource != null) {
                    // read resource.status
                    resourceStatus = resource.getStatus();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView0.setCallback(callback);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView0.setStatus(resourceStatus);
        }
        executeBindingsOn(mboundView0);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): callback
        flag 1 (0x2L): resource
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}