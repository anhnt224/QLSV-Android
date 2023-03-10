package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTAddNewAddressBindingImpl extends FragmentTAddNewAddressBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textPhone, 9);
        sViewsWithIds.put(R.id.emailTextInputLayout, 10);
        sViewsWithIds.put(R.id.textType, 11);
        sViewsWithIds.put(R.id.textLocation, 12);
        sViewsWithIds.put(R.id.textCity, 13);
        sViewsWithIds.put(R.id.textDistrict, 14);
        sViewsWithIds.put(R.id.textWard, 15);
        sViewsWithIds.put(R.id.textAddress, 16);
        sViewsWithIds.put(R.id.buttonSave, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView7;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView8;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTAddNewAddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentTAddNewAddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[17]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (com.google.android.material.textfield.TextInputLayout) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[15]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (com.google.android.material.textfield.TextInputEditText) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (com.google.android.material.textfield.TextInputEditText) bindings[8];
        this.mboundView8.setTag(null);
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
        if (BR.address == variableId) {
            setAddress((com.emglab.qlsv.models.entity.UserAddress) variable);
        }
        else if (BR.resource == variableId) {
            setResource((com.emglab.qlsv.common.Resource) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddress(@Nullable com.emglab.qlsv.models.entity.UserAddress Address) {
        this.mAddress = Address;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.address);
        super.requestRebind();
    }
    public void setResource(@Nullable com.emglab.qlsv.common.Resource Resource) {
        this.mResource = Resource;
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
        java.lang.String addressGetLocation = null;
        java.lang.String addressAddress = null;
        java.lang.String addressDistrict = null;
        java.lang.String addressCity = null;
        java.lang.String addressWard = null;
        java.lang.String addressContact = null;
        java.lang.String addressEmail = null;
        java.lang.String addressType = null;
        com.emglab.qlsv.models.entity.UserAddress address = mAddress;

        if ((dirtyFlags & 0x5L) != 0) {



                if (address != null) {
                    // read address.getLocation()
                    addressGetLocation = address.getLocation();
                    // read address.address
                    addressAddress = address.getAddress();
                    // read address.district
                    addressDistrict = address.getDistrict();
                    // read address.city
                    addressCity = address.getCity();
                    // read address.ward
                    addressWard = address.getWard();
                    // read address.contact
                    addressContact = address.getContact();
                    // read address.email
                    addressEmail = address.getEmail();
                    // read address.type
                    addressType = address.getType();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, addressContact);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, addressEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, addressType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, addressGetLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, addressCity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, addressDistrict);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, addressWard);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, addressAddress);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): address
        flag 1 (0x2L): resource
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}