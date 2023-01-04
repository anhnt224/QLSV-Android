package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutLoadingBindingImpl extends LayoutLoadingBinding implements com.emglab.qlsv.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.progress_bar, 4);
        sViewsWithIds.put(R.id.imageView13, 5);
        sViewsWithIds.put(R.id.textView10, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutLoadingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private LayoutLoadingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ProgressBar) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.button.MaterialButton) bindings[3];
        this.mboundView3.setTag(null);
        this.progressOverlay.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.emglab.qlsv.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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

    public void setStatus(@Nullable com.emglab.qlsv.common.Status Status) {
        this.mStatus = Status;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.status);
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
        boolean statusStatusERROR = false;
        com.emglab.qlsv.common.Status status = mStatus;
        boolean statusStatusLOADING = false;
        boolean statusStatusLOADINGBooleanTrueStatusStatusERROR = false;
        com.emglab.qlsv.common.RetryCallback callback = mCallback;

        if ((dirtyFlags & 0x9L) != 0) {



                // read status == Status.ERROR
                statusStatusERROR = (status) == (com.emglab.qlsv.common.Status.ERROR);
                // read status == Status.LOADING
                statusStatusLOADING = (status) == (com.emglab.qlsv.common.Status.LOADING);
            if((dirtyFlags & 0x9L) != 0) {
                if(statusStatusLOADING) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x9L) != 0) {

                // read status == Status.LOADING ? true : status == Status.ERROR
                statusStatusLOADINGBooleanTrueStatusStatusERROR = ((statusStatusLOADING) ? (true) : (statusStatusERROR));
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView1, statusStatusLOADING);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView2, statusStatusERROR);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.progressOverlay, statusStatusLOADINGBooleanTrueStatusStatusERROR);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // callback
        com.emglab.qlsv.common.RetryCallback callback = mCallback;
        // callback != null
        boolean callbackJavaLangObjectNull = false;



        callbackJavaLangObjectNull = (callback) != (null);
        if (callbackJavaLangObjectNull) {


            callback.retry();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): callback
        flag 2 (0x3L): resource
        flag 3 (0x4L): null
        flag 4 (0x5L): status == Status.LOADING ? true : status == Status.ERROR
        flag 5 (0x6L): status == Status.LOADING ? true : status == Status.ERROR
    flag mapping end*/
    //end
}