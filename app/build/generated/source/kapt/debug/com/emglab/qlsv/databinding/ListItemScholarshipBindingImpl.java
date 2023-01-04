package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemScholarshipBindingImpl extends ListItemScholarshipBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.icon, 5);
        sViewsWithIds.put(R.id.linearLayout4, 6);
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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemScholarshipBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ListItemScholarshipBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[6]
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
        if (BR.scholarShip == variableId) {
            setScholarShip((com.emglab.qlsv.models.entity.ScholarShip) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setScholarShip(@Nullable com.emglab.qlsv.models.entity.ScholarShip ScholarShip) {
        this.mScholarShip = ScholarShip;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.scholarShip);
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
        com.emglab.qlsv.models.entity.ScholarShip scholarShip = mScholarShip;
        java.lang.String scholarShipTypeInfo = null;
        java.lang.String scholarShipGetDeadLine = null;
        java.lang.String scholarShipPrice = null;
        java.lang.String scholarShipTitle = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (scholarShip != null) {
                    // read scholarShip.typeInfo
                    scholarShipTypeInfo = scholarShip.getTypeInfo();
                    // read scholarShip.getDeadLine()
                    scholarShipGetDeadLine = scholarShip.getDeadLine();
                    // read scholarShip.price
                    scholarShipPrice = scholarShip.getPrice();
                    // read scholarShip.title
                    scholarShipTitle = scholarShip.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, scholarShipTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, scholarShipTypeInfo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, scholarShipGetDeadLine);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, scholarShipPrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): scholarShip
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}