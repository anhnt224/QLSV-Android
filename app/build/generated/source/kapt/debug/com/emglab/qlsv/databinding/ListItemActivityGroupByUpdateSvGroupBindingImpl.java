package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemActivityGroupByUpdateSvGroupBindingImpl extends ListItemActivityGroupByUpdateSvGroupBinding  {

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
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemActivityGroupByUpdateSvGroupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ListItemActivityGroupByUpdateSvGroupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.imgCheck.setTag(null);
        this.imgUnCheck.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtAGDesc.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.activityGroup == variableId) {
            setActivityGroup((com.emglab.qlsv.models.entity.ActivityGroup) variable);
        }
        else if (BR.check == variableId) {
            setCheck((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setActivityGroup(@Nullable com.emglab.qlsv.models.entity.ActivityGroup ActivityGroup) {
        this.mActivityGroup = ActivityGroup;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.activityGroup);
        super.requestRebind();
    }
    public void setCheck(@Nullable java.lang.Boolean Check) {
        this.mCheck = Check;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.check);
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
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String activityGroupAgDesc = null;
        com.emglab.qlsv.models.entity.ActivityGroup activityGroup = mActivityGroup;
        boolean androidxDatabindingViewDataBindingSafeUnboxCheck = false;
        java.lang.Boolean check = mCheck;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (activityGroup != null) {
                    // read activityGroup.agDesc
                    activityGroupAgDesc = activityGroup.getAgDesc();
                }
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(check)
                androidxDatabindingViewDataBindingSafeUnboxCheck = androidx.databinding.ViewDataBinding.safeUnbox(check);
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.bindIsGone(this.imgCheck, androidxDatabindingViewDataBindingSafeUnboxCheck);
            com.emglab.qlsv.binding.BindingAdapterKt.bindIsGone(this.imgUnCheck, androidxDatabindingViewDataBindingSafeUnboxCheck);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAGDesc, activityGroupAgDesc);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): activityGroup
        flag 2 (0x3L): check
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}