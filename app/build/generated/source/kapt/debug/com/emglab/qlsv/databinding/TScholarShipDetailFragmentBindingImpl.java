package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TScholarShipDetailFragmentBindingImpl extends TScholarShipDetailFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(0, 
            new String[] {"loading_action_state"},
            new int[] {8},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView2, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView01;
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
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TScholarShipDetailFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private TScholarShipDetailFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ScrollView) bindings[9]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[8];
        setContainedBinding(this.mboundView01);
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
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.textContent.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.scholarShip == variableId) {
            setScholarShip((com.emglab.qlsv.models.entity.ScholarShip) variable);
        }
        else if (BR.resource == variableId) {
            setResource((com.emglab.qlsv.common.Resource) variable);
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
    public void setResource(@Nullable com.emglab.qlsv.common.Resource Resource) {
        this.mResource = Resource;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.resource);
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
        java.lang.String scholarShipGetScholarShipContent = null;
        com.emglab.qlsv.models.entity.ScholarShip scholarShip = mScholarShip;
        java.lang.String scholarShipTypeInfo = null;
        java.lang.String scholarShipGetDeadLine = null;
        java.lang.String scholarShipPrice = null;
        com.emglab.qlsv.common.Resource<?> resource = mResource;
        java.lang.String scholarShipQuantityStr = null;
        java.lang.String scholarShipTitle = null;
        java.lang.String scholarShipDescription = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (scholarShip != null) {
                    // read scholarShip.getScholarShipContent()
                    scholarShipGetScholarShipContent = scholarShip.getScholarShipContent();
                    // read scholarShip.typeInfo
                    scholarShipTypeInfo = scholarShip.getTypeInfo();
                    // read scholarShip.getDeadLine()
                    scholarShipGetDeadLine = scholarShip.getDeadLine();
                    // read scholarShip.price
                    scholarShipPrice = scholarShip.getPrice();
                    // read scholarShip.quantityStr
                    scholarShipQuantityStr = scholarShip.getQuantityStr();
                    // read scholarShip.title
                    scholarShipTitle = scholarShip.getTitle();
                    // read scholarShip.description
                    scholarShipDescription = scholarShip.getDescription();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView01.setResource(resource);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, scholarShipTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, scholarShipTypeInfo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, scholarShipDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, scholarShipGetDeadLine);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, scholarShipQuantityStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, scholarShipPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textContent, scholarShipGetScholarShipContent);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): scholarShip
        flag 1 (0x2L): resource
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}