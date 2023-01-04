package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemStudentCriteriaGroupsBindingImpl extends ListItemStudentCriteriaGroupsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerView, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
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

    public ListItemStudentCriteriaGroupsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ListItemStudentCriteriaGroupsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
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
        if (BR.criteriaGroup == variableId) {
            setCriteriaGroup((com.emglab.qlsv.models.entity.CriteriaGroup) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCriteriaGroup(@Nullable com.emglab.qlsv.models.entity.CriteriaGroup CriteriaGroup) {
        this.mCriteriaGroup = CriteriaGroup;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.criteriaGroup);
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
        com.emglab.qlsv.models.entity.CriteriaGroup criteriaGroup = mCriteriaGroup;
        java.lang.String criteriaGroupName = null;
        int criteriaGroupTPoint = 0;
        java.lang.String javaLangStringTIACriteriaGroupMaxPoint = null;
        java.lang.String javaLangStringGVChMCriteriaGroupTPoint = null;
        int criteriaGroupGetStudentPoint = 0;
        java.lang.String javaLangStringSVChMCriteriaGroupGetStudentPoint = null;
        int criteriaGroupMaxPoint = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (criteriaGroup != null) {
                    // read criteriaGroup.name
                    criteriaGroupName = criteriaGroup.getName();
                    // read criteriaGroup.tPoint
                    criteriaGroupTPoint = criteriaGroup.getTPoint();
                    // read criteriaGroup.getStudentPoint()
                    criteriaGroupGetStudentPoint = criteriaGroup.getStudentPoint();
                    // read criteriaGroup.maxPoint
                    criteriaGroupMaxPoint = criteriaGroup.getMaxPoint();
                }


                // read ("GV chấm: ") + (criteriaGroup.tPoint)
                javaLangStringGVChMCriteriaGroupTPoint = ("GV chấm: ") + (criteriaGroupTPoint);
                // read ("SV chấm: ") + (criteriaGroup.getStudentPoint())
                javaLangStringSVChMCriteriaGroupGetStudentPoint = ("SV chấm: ") + (criteriaGroupGetStudentPoint);
                // read ("Tối đa: ") + (criteriaGroup.maxPoint)
                javaLangStringTIACriteriaGroupMaxPoint = ("Tối đa: ") + (criteriaGroupMaxPoint);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, criteriaGroupName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, javaLangStringSVChMCriteriaGroupGetStudentPoint);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, javaLangStringGVChMCriteriaGroupTPoint);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, javaLangStringTIACriteriaGroupMaxPoint);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): criteriaGroup
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}