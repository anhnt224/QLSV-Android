package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemActivityBindingImpl extends ListItemActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout2, 7);
        sViewsWithIds.put(R.id.linearLayout3, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ListItemActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.textStatus.setTag(null);
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
        if (BR.activity == variableId) {
            setActivity((com.emglab.qlsv.models.entity.Activity) variable);
        }
        else if (BR.userActivity == variableId) {
            setUserActivity((com.emglab.qlsv.models.entity.UserActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setActivity(@Nullable com.emglab.qlsv.models.entity.Activity Activity) {
        this.mActivity = Activity;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.activity);
        super.requestRebind();
    }
    public void setUserActivity(@Nullable com.emglab.qlsv.models.entity.UserActivity UserActivity) {
        this.mUserActivity = UserActivity;
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
        java.lang.String activityGetNameDayOfMonth = null;
        java.lang.String activityTimeStartAndFinishText = null;
        java.lang.Integer activityUAStatus = null;
        java.lang.String activityGetNameDayOfWeek = null;
        int androidxDatabindingViewDataBindingSafeUnboxActivityUAStatus = 0;
        java.lang.String activityName = null;
        boolean activityUAStatusInt2 = false;
        boolean activityUAStatusInt1BooleanTrueActivityUAStatusInt2 = false;
        java.lang.String activityGetUAStatusString = null;
        java.lang.String activityPlace = null;
        com.emglab.qlsv.models.entity.Activity activity = mActivity;
        boolean activityUAStatusInt1 = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (activity != null) {
                    // read activity.getNameDayOfMonth()
                    activityGetNameDayOfMonth = activity.getNameDayOfMonth();
                    // read activity.timeStartAndFinishText()
                    activityTimeStartAndFinishText = activity.timeStartAndFinishText();
                    // read activity.uAStatus
                    activityUAStatus = activity.getUAStatus();
                    // read activity.getNameDayOfWeek()
                    activityGetNameDayOfWeek = activity.getNameDayOfWeek();
                    // read activity.name
                    activityName = activity.getName();
                    // read activity.getUAStatusString()
                    activityGetUAStatusString = activity.getUAStatusString();
                    // read activity.place
                    activityPlace = activity.getPlace();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(activity.uAStatus)
                androidxDatabindingViewDataBindingSafeUnboxActivityUAStatus = androidx.databinding.ViewDataBinding.safeUnbox(activityUAStatus);


                // read androidx.databinding.ViewDataBinding.safeUnbox(activity.uAStatus) == 1
                activityUAStatusInt1 = (androidxDatabindingViewDataBindingSafeUnboxActivityUAStatus) == (1);
            if((dirtyFlags & 0x5L) != 0) {
                if(activityUAStatusInt1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(activity.uAStatus) == 2
                activityUAStatusInt2 = (androidxDatabindingViewDataBindingSafeUnboxActivityUAStatus) == (2);
        }

        if ((dirtyFlags & 0x5L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(activity.uAStatus) == 1 ? true : androidx.databinding.ViewDataBinding.safeUnbox(activity.uAStatus) == 2
                activityUAStatusInt1BooleanTrueActivityUAStatusInt2 = ((activityUAStatusInt1) ? (true) : (activityUAStatusInt2));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, activityGetNameDayOfWeek);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, activityGetNameDayOfMonth);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, activityName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, activityPlace);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, activityTimeStartAndFinishText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textStatus, activityGetUAStatusString);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.textStatus, activityUAStatusInt1BooleanTrueActivityUAStatusInt2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): activity
        flag 1 (0x2L): userActivity
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(activity.uAStatus) == 1 ? true : androidx.databinding.ViewDataBinding.safeUnbox(activity.uAStatus) == 2
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(activity.uAStatus) == 1 ? true : androidx.databinding.ViewDataBinding.safeUnbox(activity.uAStatus) == 2
    flag mapping end*/
    //end
}