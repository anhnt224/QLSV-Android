package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemEventBindingImpl extends ListItemEventBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemEventBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ListItemEventBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.statusTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        java.lang.String activityGetTimeStr = null;
        java.lang.String activityGetTimeStatus = null;
        java.lang.String activityPlace = null;
        com.emglab.qlsv.models.entity.Activity activity = mActivity;
        java.lang.String activityName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (activity != null) {
                    // read activity.getTimeStr()
                    activityGetTimeStr = activity.getTimeStr();
                    // read activity.getTimeStatus()
                    activityGetTimeStatus = activity.getTimeStatus();
                    // read activity.place
                    activityPlace = activity.getPlace();
                    // read activity.name
                    activityName = activity.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, activityName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, activityGetTimeStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, activityPlace);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusTextView, activityGetTimeStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): activity
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}