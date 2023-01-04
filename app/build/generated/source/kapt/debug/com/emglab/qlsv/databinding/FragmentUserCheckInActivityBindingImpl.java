package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUserCheckInActivityBindingImpl extends FragmentUserCheckInActivityBinding implements com.emglab.qlsv.generated.callback.RetryCallback.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(3, 
            new String[] {"loading_state"},
            new int[] {6},
            new int[] {com.emglab.qlsv.R.layout.loading_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lineMain, 7);
        sViewsWithIds.put(R.id.people_card, 8);
        sViewsWithIds.put(R.id.imgActivity, 9);
        sViewsWithIds.put(R.id.relativeMain, 10);
        sViewsWithIds.put(R.id.btnTakePhoto, 11);
        sViewsWithIds.put(R.id.mapLayout, 12);
        sViewsWithIds.put(R.id.mapView, 13);
        sViewsWithIds.put(R.id.textView2, 14);
        sViewsWithIds.put(R.id.buttonView, 15);
        sViewsWithIds.put(R.id.relativeBotttom, 16);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView3;
    // variables
    @Nullable
    private final com.emglab.qlsv.common.RetryCallback mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserCheckInActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentUserCheckInActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[15]
            , (android.widget.ImageView) bindings[9]
            , (com.emglab.qlsv.databinding.LoadingStateBinding) bindings[6]
            , (android.widget.LinearLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (com.google.android.gms.maps.MapView) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (android.widget.RelativeLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[2]
            );
        this.btnCheckInActivity.setTag(null);
        setContainedBinding(this.include);
        this.listUserCheckInActivityRecycler.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.txtClassId.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.emglab.qlsv.generated.callback.RetryCallback(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        include.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (include.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.checkInActivityResource == variableId) {
            setCheckInActivityResource((com.emglab.qlsv.common.Resource) variable);
        }
        else if (BR.aName == variableId) {
            setAName((java.lang.String) variable);
        }
        else if (BR.retryCallback == variableId) {
            setRetryCallback((com.emglab.qlsv.common.RetryCallback) variable);
        }
        else if (BR.sizeList == variableId) {
            setSizeList((java.lang.Integer) variable);
        }
        else if (BR.userCheckInActivityResource == variableId) {
            setUserCheckInActivityResource((com.emglab.qlsv.common.Resource) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckInActivityResource(@Nullable com.emglab.qlsv.common.Resource CheckInActivityResource) {
        this.mCheckInActivityResource = CheckInActivityResource;
    }
    public void setAName(@Nullable java.lang.String AName) {
        this.mAName = AName;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.aName);
        super.requestRebind();
    }
    public void setRetryCallback(@Nullable com.emglab.qlsv.common.RetryCallback RetryCallback) {
        this.mRetryCallback = RetryCallback;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.retryCallback);
        super.requestRebind();
    }
    public void setSizeList(@Nullable java.lang.Integer SizeList) {
        this.mSizeList = SizeList;
    }
    public void setUserCheckInActivityResource(@Nullable com.emglab.qlsv.common.Resource UserCheckInActivityResource) {
        this.mUserCheckInActivityResource = UserCheckInActivityResource;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.userCheckInActivityResource);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        include.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeInclude((com.emglab.qlsv.databinding.LoadingStateBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeInclude(com.emglab.qlsv.databinding.LoadingStateBinding Include, int fieldId) {
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
        com.emglab.qlsv.common.Status userCheckInActivityResourceStatus = null;
        boolean userCheckInActivityResourceStatusStatusSUCCESSNETWORK = false;
        java.lang.String aName = mAName;
        com.emglab.qlsv.common.RetryCallback retryCallback = mRetryCallback;
        com.emglab.qlsv.common.Resource<?> userCheckInActivityResource = mUserCheckInActivityResource;

        if ((dirtyFlags & 0x44L) != 0) {
        }
        if ((dirtyFlags & 0x60L) != 0) {



                if (userCheckInActivityResource != null) {
                    // read userCheckInActivityResource.status
                    userCheckInActivityResourceStatus = userCheckInActivityResource.getStatus();
                }


                // read userCheckInActivityResource.status == Status.SUCCESS_NETWORK
                userCheckInActivityResourceStatusStatusSUCCESSNETWORK = (userCheckInActivityResourceStatus) == (com.emglab.qlsv.common.Status.SUCCESS_NETWORK);
        }
        // batch finished
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.btnCheckInActivity, userCheckInActivityResourceStatusStatusSUCCESSNETWORK);
            this.include.setResource(userCheckInActivityResource);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.listUserCheckInActivityRecycler, userCheckInActivityResourceStatusStatusSUCCESSNETWORK);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView1, userCheckInActivityResourceStatusStatusSUCCESSNETWORK);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.include.setCallback(mCallback3);
        }
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtClassId, aName);
        }
        executeBindingsOn(include);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackRetry(int sourceId ) {
        // localize variables for thread safety
        // retryCallback
        com.emglab.qlsv.common.RetryCallback retryCallback = mRetryCallback;
        // retryCallback != null
        boolean retryCallbackJavaLangObjectNull = false;



        retryCallbackJavaLangObjectNull = (retryCallback) != (null);
        if (retryCallbackJavaLangObjectNull) {


            retryCallback.retry();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): include
        flag 1 (0x2L): checkInActivityResource
        flag 2 (0x3L): aName
        flag 3 (0x4L): retryCallback
        flag 4 (0x5L): sizeList
        flag 5 (0x6L): userCheckInActivityResource
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}