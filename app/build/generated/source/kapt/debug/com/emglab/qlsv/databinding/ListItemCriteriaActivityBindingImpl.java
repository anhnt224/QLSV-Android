package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemCriteriaActivityBindingImpl extends ListItemCriteriaActivityBinding  {

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
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemCriteriaActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ListItemCriteriaActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[1]
            );
        this.materialCheckBox.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
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
        if (BR.criteriaActivityItem == variableId) {
            setCriteriaActivityItem((com.emglab.qlsv.ui.adapter.criteria.CriteriaActivityItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCriteriaActivityItem(@Nullable com.emglab.qlsv.ui.adapter.criteria.CriteriaActivityItem CriteriaActivityItem) {
        this.mCriteriaActivityItem = CriteriaActivityItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.criteriaActivityItem);
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
        com.emglab.qlsv.models.entity.UserCriteriaActivity criteriaActivityItemCriteriaActivity = null;
        com.emglab.qlsv.ui.adapter.criteria.CriteriaActivityItem criteriaActivityItem = mCriteriaActivityItem;
        boolean criteriaActivityItemChecked = false;
        java.lang.String criteriaActivityItemCriteriaActivityName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (criteriaActivityItem != null) {
                    // read criteriaActivityItem.criteriaActivity
                    criteriaActivityItemCriteriaActivity = criteriaActivityItem.getCriteriaActivity();
                    // read criteriaActivityItem.checked
                    criteriaActivityItemChecked = criteriaActivityItem.getChecked();
                }


                if (criteriaActivityItemCriteriaActivity != null) {
                    // read criteriaActivityItem.criteriaActivity.name
                    criteriaActivityItemCriteriaActivityName = criteriaActivityItemCriteriaActivity.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.materialCheckBox, criteriaActivityItemChecked);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, criteriaActivityItemCriteriaActivityName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): criteriaActivityItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}