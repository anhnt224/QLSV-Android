package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemAddressBindingImpl extends ListItemAddressBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.buttonDelete, 5);
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

    public ListItemAddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ListItemAddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[5]
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
        if (BR.address == variableId) {
            setAddress((com.emglab.qlsv.models.entity.UserAddress) variable);
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
        java.lang.String addressType = null;
        java.lang.String addressStudentName = null;
        java.lang.String addressGetTime = null;
        java.lang.String javaLangStringAChAddressAddress = null;
        java.lang.String addressAddress = null;
        com.emglab.qlsv.models.entity.UserAddress address = mAddress;
        java.lang.String javaLangStringTGKhaiBOAddressGetTime = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (address != null) {
                    // read address.type
                    addressType = address.getType();
                    // read address.studentName
                    addressStudentName = address.getStudentName();
                    // read address.getTime()
                    addressGetTime = address.getTime();
                    // read address.address
                    addressAddress = address.getAddress();
                }


                // read ("TG khai báo: ") + (address.getTime())
                javaLangStringTGKhaiBOAddressGetTime = ("TG khai báo: ") + (addressGetTime);
                // read ("Địa chỉ:") + (address.address)
                javaLangStringAChAddressAddress = ("Địa chỉ:") + (addressAddress);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, addressStudentName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, javaLangStringTGKhaiBOAddressGetTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, addressType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, javaLangStringAChAddressAddress);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): address
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}