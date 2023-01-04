package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LoadingStateBindingImpl extends LoadingStateBinding implements com.emglab.qlsv.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LoadingStateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LoadingStateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.Button) bindings[2]
            );
        this.errorMsg.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.retry.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.emglab.qlsv.generated.callback.OnClickListener(this, 1);
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
        if (BR.contributorsStatus == variableId) {
            setContributorsStatus((com.emglab.qlsv.common.Status) variable);
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

    public void setContributorsStatus(@Nullable com.emglab.qlsv.common.Status ContributorsStatus) {
        this.mContributorsStatus = ContributorsStatus;
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
        boolean resourceRespTextJavaLangObjectNull = false;
        java.lang.String resourceRespTextJavaLangObjectNullErrorMsgAndroidStringErrorDbTextResourceRespText = null;
        boolean resourceStatusStatusERROR = false;
        boolean resourceStatusStatusLOADING = false;
        com.emglab.qlsv.common.Status resourceStatus = null;
        java.lang.String resourceRespText = null;
        com.emglab.qlsv.common.RetryCallback callback = mCallback;
        com.emglab.qlsv.common.Resource<?> resource = mResource;

        if ((dirtyFlags & 0xcL) != 0) {



                if (resource != null) {
                    // read resource.status
                    resourceStatus = resource.getStatus();
                    // read resource.respText
                    resourceRespText = resource.getRespText();
                }


                // read resource.status == Status.ERROR
                resourceStatusStatusERROR = (resourceStatus) == (com.emglab.qlsv.common.Status.ERROR);
                // read resource.status == Status.LOADING
                resourceStatusStatusLOADING = (resourceStatus) == (com.emglab.qlsv.common.Status.LOADING);
                // read resource.respText == null
                resourceRespTextJavaLangObjectNull = (resourceRespText) == (null);
            if((dirtyFlags & 0xcL) != 0) {
                if(resourceRespTextJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0xcL) != 0) {

                // read resource.respText == null ? @android:string/error_db_text : resource.respText
                resourceRespTextJavaLangObjectNullErrorMsgAndroidStringErrorDbTextResourceRespText = ((resourceRespTextJavaLangObjectNull) ? (errorMsg.getResources().getString(R.string.error_db_text)) : (resourceRespText));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.errorMsg, resourceRespTextJavaLangObjectNullErrorMsgAndroidStringErrorDbTextResourceRespText);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.errorMsg, resourceStatusStatusERROR);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.progressBar, resourceStatusStatusLOADING);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.retry, resourceStatusStatusERROR);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.retry.setOnClickListener(mCallback5);
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
        flag 0 (0x1L): contributorsStatus
        flag 1 (0x2L): callback
        flag 2 (0x3L): resource
        flag 3 (0x4L): null
        flag 4 (0x5L): resource.respText == null ? @android:string/error_db_text : resource.respText
        flag 5 (0x6L): resource.respText == null ? @android:string/error_db_text : resource.respText
    flag mapping end*/
    //end
}