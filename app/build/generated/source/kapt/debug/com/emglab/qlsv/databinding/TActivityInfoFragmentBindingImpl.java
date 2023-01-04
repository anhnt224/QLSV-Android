package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TActivityInfoFragmentBindingImpl extends TActivityInfoFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lineMain, 8);
        sViewsWithIds.put(R.id.people_card, 9);
        sViewsWithIds.put(R.id.imgEvent, 10);
        sViewsWithIds.put(R.id.relativeMain, 11);
        sViewsWithIds.put(R.id.imgTime, 12);
        sViewsWithIds.put(R.id.imgPlace, 13);
        sViewsWithIds.put(R.id.imgGroup, 14);
        sViewsWithIds.put(R.id.textDeadline, 15);
        sViewsWithIds.put(R.id.txtCriteriaText, 16);
        sViewsWithIds.put(R.id.relativeUser, 17);
        sViewsWithIds.put(R.id.imgEven, 18);
        sViewsWithIds.put(R.id.txtEventText, 19);
        sViewsWithIds.put(R.id.txtEventTextDetail, 20);
        sViewsWithIds.put(R.id.txtADescText, 21);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TActivityInfoFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private TActivityInfoFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (android.widget.RelativeLayout) bindings[11]
            , (android.widget.RelativeLayout) bindings[17]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.txtADesc.setTag(null);
        this.txtAGroup.setTag(null);
        this.txtAPlace.setTag(null);
        this.txtClassId.setTag(null);
        this.txtTime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
        if (BR.assignActivityResource == variableId) {
            setAssignActivityResource((com.emglab.qlsv.common.Resource) variable);
        }
        else if (BR.mActivity == variableId) {
            setMActivity((com.emglab.qlsv.models.entity.Activity) variable);
        }
        else if (BR.userActivity == variableId) {
            setUserActivity((com.emglab.qlsv.models.entity.UserActivity) variable);
        }
        else if (BR.activityStatic == variableId) {
            setActivityStatic((com.emglab.qlsv.models.entity.UserActivity.Companion) variable);
        }
        else if (BR.retryCallback == variableId) {
            setRetryCallback((com.emglab.qlsv.common.RetryCallback) variable);
        }
        else if (BR.logoutCallback == variableId) {
            setLogoutCallback((com.emglab.qlsv.common.LogoutCallback) variable);
        }
        else if (BR.activityResource == variableId) {
            setActivityResource((com.emglab.qlsv.common.Resource) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.emglab.qlsv.teacher.viewmodel.activity.TActivityInfoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAssignActivityResource(@Nullable com.emglab.qlsv.common.Resource AssignActivityResource) {
        this.mAssignActivityResource = AssignActivityResource;
    }
    public void setMActivity(@Nullable com.emglab.qlsv.models.entity.Activity MActivity) {
        this.mMActivity = MActivity;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.mActivity);
        super.requestRebind();
    }
    public void setUserActivity(@Nullable com.emglab.qlsv.models.entity.UserActivity UserActivity) {
        this.mUserActivity = UserActivity;
    }
    public void setActivityStatic(@Nullable com.emglab.qlsv.models.entity.UserActivity.Companion ActivityStatic) {
        this.mActivityStatic = ActivityStatic;
    }
    public void setRetryCallback(@Nullable com.emglab.qlsv.common.RetryCallback RetryCallback) {
        this.mRetryCallback = RetryCallback;
    }
    public void setLogoutCallback(@Nullable com.emglab.qlsv.common.LogoutCallback LogoutCallback) {
        this.mLogoutCallback = LogoutCallback;
    }
    public void setActivityResource(@Nullable com.emglab.qlsv.common.Resource ActivityResource) {
        this.mActivityResource = ActivityResource;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.activityResource);
        super.requestRebind();
    }
    public void setViewmodel(@Nullable com.emglab.qlsv.teacher.viewmodel.activity.TActivityInfoViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
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
        java.lang.String mActivityPlace = null;
        java.lang.String mActivityName = null;
        java.lang.String mActivityTimeStartAndFinishText = null;
        com.emglab.qlsv.models.entity.Activity mActivity = mMActivity;
        boolean activityResourceStatusStatusSUCCESSNETWORK = false;
        java.lang.String mActivityGName = null;
        java.lang.String mActivityDesc = null;
        java.lang.String mActivityGetDeadlineStr = null;
        com.emglab.qlsv.common.Status activityResourceStatus = null;
        com.emglab.qlsv.common.Resource<?> activityResource = mActivityResource;

        if ((dirtyFlags & 0x102L) != 0) {



                if (mActivity != null) {
                    // read mActivity.place
                    mActivityPlace = mActivity.getPlace();
                    // read mActivity.name
                    mActivityName = mActivity.getName();
                    // read mActivity.timeStartAndFinishText()
                    mActivityTimeStartAndFinishText = mActivity.timeStartAndFinishText();
                    // read mActivity.gName
                    mActivityGName = mActivity.getGName();
                    // read mActivity.desc
                    mActivityDesc = mActivity.getDesc();
                    // read mActivity.getDeadlineStr()
                    mActivityGetDeadlineStr = mActivity.getDeadlineStr();
                }
        }
        if ((dirtyFlags & 0x140L) != 0) {



                if (activityResource != null) {
                    // read activityResource.status
                    activityResourceStatus = activityResource.getStatus();
                }


                // read activityResource.status == Status.SUCCESS_NETWORK
                activityResourceStatusStatusSUCCESSNETWORK = (activityResourceStatus) == (com.emglab.qlsv.common.Status.SUCCESS_NETWORK);
        }
        // batch finished
        if ((dirtyFlags & 0x140L) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView1, activityResourceStatusStatusSUCCESSNETWORK);
        }
        if ((dirtyFlags & 0x102L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, mActivityGetDeadlineStr);
            com.emglab.qlsv.binding.BindingAdapterKt.bindHtmlText(this.txtADesc, mActivityDesc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAGroup, mActivityGName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAPlace, mActivityPlace);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtClassId, mActivityName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTime, mActivityTimeStartAndFinishText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): assignActivityResource
        flag 1 (0x2L): mActivity
        flag 2 (0x3L): userActivity
        flag 3 (0x4L): activityStatic
        flag 4 (0x5L): retryCallback
        flag 5 (0x6L): logoutCallback
        flag 6 (0x7L): activityResource
        flag 7 (0x8L): viewmodel
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}