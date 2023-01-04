package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMessageListBindingImpl extends FragmentMessageListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"layout_loading"},
            new int[] {3},
            new int[] {com.emglab.qlsv.R.layout.layout_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 4);
        sViewsWithIds.put(R.id.listMessageRecycler, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final com.emglab.qlsv.databinding.LayoutLoadingBinding mboundView01;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMessageListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentMessageListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.emglab.qlsv.databinding.LayoutLoadingBinding) bindings[3];
        setContainedBinding(this.mboundView01);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.swipeRefreshLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
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
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.retryCallback == variableId) {
            setRetryCallback((com.emglab.qlsv.common.RetryCallback) variable);
        }
        else if (BR.messagesResource == variableId) {
            setMessagesResource((com.emglab.qlsv.common.Resource) variable);
        }
        else if (BR.logoutCallback == variableId) {
            setLogoutCallback((com.emglab.qlsv.common.LogoutCallback) variable);
        }
        else if (BR.sizeOfMessage == variableId) {
            setSizeOfMessage((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRetryCallback(@Nullable com.emglab.qlsv.common.RetryCallback RetryCallback) {
        this.mRetryCallback = RetryCallback;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.retryCallback);
        super.requestRebind();
    }
    public void setMessagesResource(@Nullable com.emglab.qlsv.common.Resource MessagesResource) {
        this.mMessagesResource = MessagesResource;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.messagesResource);
        super.requestRebind();
    }
    public void setLogoutCallback(@Nullable com.emglab.qlsv.common.LogoutCallback LogoutCallback) {
        this.mLogoutCallback = LogoutCallback;
    }
    public void setSizeOfMessage(@Nullable java.lang.Integer SizeOfMessage) {
        this.mSizeOfMessage = SizeOfMessage;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.sizeOfMessage);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView01.setLifecycleOwner(lifecycleOwner);
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
        com.emglab.qlsv.common.RetryCallback retryCallback = mRetryCallback;
        boolean messagesResourceStatusStatusSUCCESSNETWORK = false;
        com.emglab.qlsv.common.Resource<?> messagesResource = mMessagesResource;
        com.emglab.qlsv.common.Status messagesResourceStatus = null;
        java.lang.Integer sizeOfMessage = mSizeOfMessage;
        boolean sizeOfMessageInt0MessagesResourceStatusStatusSUCCESSNETWORKBooleanFalse = false;
        boolean sizeOfMessageInt0 = false;
        int androidxDatabindingViewDataBindingSafeUnboxSizeOfMessage = 0;

        if ((dirtyFlags & 0x11L) != 0) {
        }
        if ((dirtyFlags & 0x12L) != 0) {



                if (messagesResource != null) {
                    // read messagesResource.status
                    messagesResourceStatus = messagesResource.getStatus();
                }


                // read messagesResource.status == Status.SUCCESS_NETWORK
                messagesResourceStatusStatusSUCCESSNETWORK = (messagesResourceStatus) == (com.emglab.qlsv.common.Status.SUCCESS_NETWORK);
        }
        if ((dirtyFlags & 0x1aL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(sizeOfMessage)
                androidxDatabindingViewDataBindingSafeUnboxSizeOfMessage = androidx.databinding.ViewDataBinding.safeUnbox(sizeOfMessage);


                // read androidx.databinding.ViewDataBinding.safeUnbox(sizeOfMessage) == 0
                sizeOfMessageInt0 = (androidxDatabindingViewDataBindingSafeUnboxSizeOfMessage) == (0);
            if((dirtyFlags & 0x1aL) != 0) {
                if(sizeOfMessageInt0) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {



                if (messagesResource != null) {
                    // read messagesResource.status
                    messagesResourceStatus = messagesResource.getStatus();
                }


                // read messagesResource.status == Status.SUCCESS_NETWORK
                messagesResourceStatusStatusSUCCESSNETWORK = (messagesResourceStatus) == (com.emglab.qlsv.common.Status.SUCCESS_NETWORK);
        }

        if ((dirtyFlags & 0x1aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(sizeOfMessage) == 0 ? messagesResource.status == Status.SUCCESS_NETWORK : false
                sizeOfMessageInt0MessagesResourceStatusStatusSUCCESSNETWORKBooleanFalse = ((sizeOfMessageInt0) ? (messagesResourceStatusStatusSUCCESSNETWORK) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.mboundView01.setCallback(retryCallback);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.mboundView01.setStatus(messagesResourceStatus);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.swipeRefreshLayout, messagesResourceStatusStatusSUCCESSNETWORK);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView2, sizeOfMessageInt0MessagesResourceStatusStatusSUCCESSNETWORKBooleanFalse);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): retryCallback
        flag 1 (0x2L): messagesResource
        flag 2 (0x3L): logoutCallback
        flag 3 (0x4L): sizeOfMessage
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(sizeOfMessage) == 0 ? messagesResource.status == Status.SUCCESS_NETWORK : false
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(sizeOfMessage) == 0 ? messagesResource.status == Status.SUCCESS_NETWORK : false
    flag mapping end*/
    //end
}