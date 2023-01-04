package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTApplyGiftBindingImpl extends FragmentTApplyGiftBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout16, 3);
        sViewsWithIds.put(R.id.fullNameText, 4);
        sViewsWithIds.put(R.id.emailText, 5);
        sViewsWithIds.put(R.id.reasonLayout, 6);
        sViewsWithIds.put(R.id.reasonText, 7);
        sViewsWithIds.put(R.id.pickAddressLayout, 8);
        sViewsWithIds.put(R.id.applyButton, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTApplyGiftBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentTApplyGiftBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (android.widget.LinearLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
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
        if (BR.gift == variableId) {
            setGift((com.emglab.qlsv.models.entity.gift.Gift) variable);
        }
        else if (BR.status == variableId) {
            setStatus((com.emglab.qlsv.common.Status) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGift(@Nullable com.emglab.qlsv.models.entity.gift.Gift Gift) {
        this.mGift = Gift;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.gift);
        super.requestRebind();
    }
    public void setStatus(@Nullable com.emglab.qlsv.common.Status Status) {
        this.mStatus = Status;
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
        com.emglab.qlsv.models.entity.gift.Gift gift = mGift;
        java.lang.String giftName = null;
        boolean giftDeliveryEnableInt1 = false;
        int giftDeliveryEnable = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (gift != null) {
                    // read gift.name
                    giftName = gift.getName();
                    // read gift.deliveryEnable
                    giftDeliveryEnable = gift.getDeliveryEnable();
                }


                // read gift.deliveryEnable == 1
                giftDeliveryEnableInt1 = (giftDeliveryEnable) == (1);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, giftName);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView2, giftDeliveryEnableInt1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gift
        flag 1 (0x2L): status
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}