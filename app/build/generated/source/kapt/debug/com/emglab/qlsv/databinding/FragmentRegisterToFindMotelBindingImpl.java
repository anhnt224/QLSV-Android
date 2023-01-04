package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterToFindMotelBindingImpl extends FragmentRegisterToFindMotelBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(20);
        sIncludes.setIncludes(0, 
            new String[] {"loading_action_state"},
            new int[] {3},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.locationLayout2, 4);
        sViewsWithIds.put(R.id.radiusLayout, 5);
        sViewsWithIds.put(R.id.radiusText, 6);
        sViewsWithIds.put(R.id.addressLayout, 7);
        sViewsWithIds.put(R.id.typeTil, 8);
        sViewsWithIds.put(R.id.numberOfPeopleLayout, 9);
        sViewsWithIds.put(R.id.numberPeopleText, 10);
        sViewsWithIds.put(R.id.priceLabel, 11);
        sViewsWithIds.put(R.id.priceSlider, 12);
        sViewsWithIds.put(R.id.startDateLayout, 13);
        sViewsWithIds.put(R.id.endDateLayout, 14);
        sViewsWithIds.put(R.id.requestsLayout, 15);
        sViewsWithIds.put(R.id.otherRequestLayout, 16);
        sViewsWithIds.put(R.id.otherRequestText, 17);
        sViewsWithIds.put(R.id.liveWithOtherCheckbox, 18);
        sViewsWithIds.put(R.id.saveButton, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView01;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegisterToFindMotelBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterToFindMotelBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[18]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (com.google.android.material.textfield.TextInputEditText) bindings[17]
            , (android.widget.TextView) bindings[11]
            , (com.google.android.material.slider.RangeSlider) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (android.widget.LinearLayout) bindings[15]
            , (com.google.android.material.button.MaterialButton) bindings[19]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            );
        this.addressText.setTag(null);
        this.locationText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[3];
        setContainedBinding(this.mboundView01);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.status == variableId) {
            setStatus((com.emglab.qlsv.common.Status) variable);
        }
        else if (BR.locationName == variableId) {
            setLocationName((java.lang.String) variable);
        }
        else if (BR.address == variableId) {
            setAddress((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStatus(@Nullable com.emglab.qlsv.common.Status Status) {
        this.mStatus = Status;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.status);
        super.requestRebind();
    }
    public void setLocationName(@Nullable java.lang.String LocationName) {
        this.mLocationName = LocationName;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.locationName);
        super.requestRebind();
    }
    public void setAddress(@Nullable java.lang.String Address) {
        this.mAddress = Address;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.address);
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
        com.emglab.qlsv.common.Status status = mStatus;
        java.lang.String locationName = mLocationName;
        java.lang.String address = mAddress;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressText, address);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.locationText, locationName);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView01.setStatus(status);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): locationName
        flag 2 (0x3L): address
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}