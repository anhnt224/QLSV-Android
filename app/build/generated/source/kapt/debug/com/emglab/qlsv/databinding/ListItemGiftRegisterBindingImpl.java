package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemGiftRegisterBindingImpl extends ListItemGiftRegisterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout17, 6);
        sViewsWithIds.put(R.id.linearLayout19, 7);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemGiftRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ListItemGiftRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.CheckBox) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[4]
            );
        this.address.setTag(null);
        this.checkBox.setTag(null);
        this.container.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.textView15.setTag(null);
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
        if (BR.giftRegister == variableId) {
            setGiftRegister((com.emglab.qlsv.models.entity.gift.GiftRegister) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGiftRegister(@Nullable com.emglab.qlsv.models.entity.gift.GiftRegister GiftRegister) {
        this.mGiftRegister = GiftRegister;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.giftRegister);
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
        int giftRegisterAddressId = 0;
        java.lang.String giftRegisterFullName = null;
        java.lang.String giftRegisterGetEmailStr = null;
        boolean giftRegisterAddressIdInt0 = false;
        java.lang.String giftRegisterGetReasonStr = null;
        com.emglab.qlsv.models.entity.gift.GiftRegister giftRegister = mGiftRegister;
        boolean giftRegisterIsApproved = false;
        java.lang.String giftRegisterGetAddressStr = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (giftRegister != null) {
                    // read giftRegister.addressId
                    giftRegisterAddressId = giftRegister.getAddressId();
                    // read giftRegister.fullName
                    giftRegisterFullName = giftRegister.getFullName();
                    // read giftRegister.getEmailStr()
                    giftRegisterGetEmailStr = giftRegister.getEmailStr();
                    // read giftRegister.getReasonStr()
                    giftRegisterGetReasonStr = giftRegister.getReasonStr();
                    // read giftRegister.isApproved()
                    giftRegisterIsApproved = giftRegister.isApproved();
                    // read giftRegister.getAddressStr()
                    giftRegisterGetAddressStr = giftRegister.getAddressStr();
                }


                // read giftRegister.addressId != 0
                giftRegisterAddressIdInt0 = (giftRegisterAddressId) != (0);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, giftRegisterGetReasonStr);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.checkBox, giftRegisterIsApproved);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, giftRegisterFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, giftRegisterGetEmailStr);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.textView15, giftRegisterAddressIdInt0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView15, giftRegisterGetAddressStr);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): giftRegister
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}