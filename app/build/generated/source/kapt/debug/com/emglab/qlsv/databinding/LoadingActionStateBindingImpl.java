package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LoadingActionStateBindingImpl extends LoadingActionStateBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.progress_bar, 1);
        sViewsWithIds.put(R.id.error_msg, 2);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LoadingActionStateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private LoadingActionStateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.FrameLayout) bindings[0]
            );
        this.progressOverlay.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.status == variableId) {
            setStatus((com.emglab.qlsv.common.Status) variable);
        }
        else if (BR.resource == variableId) {
            setResource((com.emglab.qlsv.common.Resource) variable);
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
    public void setResource(@Nullable com.emglab.qlsv.common.Resource Resource) {
        this.mResource = Resource;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.resource);
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
        com.emglab.qlsv.common.Status status = mStatus;
        boolean statusStatusLOADING = false;
        boolean resourceStatusStatusLOADING = false;
        com.emglab.qlsv.common.Status resourceStatus = null;
        boolean resourceStatusStatusLOADINGBooleanTrueStatusStatusLOADING = false;
        com.emglab.qlsv.common.Resource<?> resource = mResource;

        if ((dirtyFlags & 0x7L) != 0) {



                if (resource != null) {
                    // read resource.status
                    resourceStatus = resource.getStatus();
                }


                // read resource.status == Status.LOADING
                resourceStatusStatusLOADING = (resourceStatus) == (com.emglab.qlsv.common.Status.LOADING);
            if((dirtyFlags & 0x7L) != 0) {
                if(resourceStatusStatusLOADING) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {



                // read status == Status.LOADING
                statusStatusLOADING = (status) == (com.emglab.qlsv.common.Status.LOADING);
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read resource.status == Status.LOADING ? true : status == Status.LOADING
                resourceStatusStatusLOADINGBooleanTrueStatusStatusLOADING = ((resourceStatusStatusLOADING) ? (true) : (statusStatusLOADING));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.progressOverlay, resourceStatusStatusLOADINGBooleanTrueStatusStatusLOADING);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): resource
        flag 2 (0x3L): null
        flag 3 (0x4L): resource.status == Status.LOADING ? true : status == Status.LOADING
        flag 4 (0x5L): resource.status == Status.LOADING ? true : status == Status.LOADING
    flag mapping end*/
    //end
}