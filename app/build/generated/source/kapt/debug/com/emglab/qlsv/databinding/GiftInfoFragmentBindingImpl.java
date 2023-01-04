package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class GiftInfoFragmentBindingImpl extends GiftInfoFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(26);
        sIncludes.setIncludes(0, 
            new String[] {"loading_action_state"},
            new int[] {17},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView4, 18);
        sViewsWithIds.put(R.id.tvQuan, 19);
        sViewsWithIds.put(R.id.tvQuanRegister, 20);
        sViewsWithIds.put(R.id.banner, 21);
        sViewsWithIds.put(R.id.imageLayoutZoom, 22);
        sViewsWithIds.put(R.id.layout, 23);
        sViewsWithIds.put(R.id.imageViewZoom, 24);
        sViewsWithIds.put(R.id.closeButton, 25);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView01;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public GiftInfoFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private GiftInfoFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[21]
            , (com.google.android.material.button.MaterialButton) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (android.widget.ImageView) bindings[24]
            , (androidx.cardview.widget.CardView) bindings[23]
            , (com.google.android.material.button.MaterialButton) bindings[15]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.ScrollView) bindings[18]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[20]
            , (com.google.android.material.button.MaterialButton) bindings[16]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[17];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.LinearLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.registerButton.setTag(null);
        this.registerInfo.setTag(null);
        this.statusText.setTag(null);
        this.unRegisterButton.setTag(null);
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
        if (BR.cancelApplyStatus == variableId) {
            setCancelApplyStatus((com.emglab.qlsv.common.Status) variable);
        }
        else if (BR.gift == variableId) {
            setGift((com.emglab.qlsv.models.entity.gift.Gift) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCancelApplyStatus(@Nullable com.emglab.qlsv.common.Status CancelApplyStatus) {
        this.mCancelApplyStatus = CancelApplyStatus;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.cancelApplyStatus);
        super.requestRebind();
    }
    public void setGift(@Nullable com.emglab.qlsv.models.entity.gift.Gift Gift) {
        this.mGift = Gift;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.gift);
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
        java.lang.String giftName = null;
        java.lang.String giftGetReasonStr = null;
        boolean giftDeliveryEnableInt1 = false;
        java.lang.String giftGetEmailStr = null;
        com.emglab.qlsv.models.entity.gift.GiftRegisteredStatus giftGetUStatus2 = null;
        boolean giftIsUnRegistered = false;
        java.lang.String giftGetPhoneNumberStr = null;
        java.lang.String giftContactPerson = null;
        com.emglab.qlsv.common.Status cancelApplyStatus = mCancelApplyStatus;
        boolean GiftIsUnRegistered1 = false;
        java.lang.String giftDescription = null;
        com.emglab.qlsv.models.entity.gift.Gift gift = mGift;
        java.lang.String giftGetTimeStartReceive = null;
        java.lang.String giftGetFacebookStr = null;
        int giftDeliveryEnable = 0;
        boolean giftIsRegistered = false;
        java.lang.String giftGetTimeApplyStr = null;
        java.lang.String giftGetAddressReceive = null;
        java.lang.String giftGetUStatus2Title = null;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (gift != null) {
                    // read gift.name
                    giftName = gift.getName();
                    // read gift.getReasonStr()
                    giftGetReasonStr = gift.getReasonStr();
                    // read gift.getEmailStr()
                    giftGetEmailStr = gift.getEmailStr();
                    // read gift.getUStatus2()
                    giftGetUStatus2 = gift.getUStatus2();
                    // read gift.getPhoneNumberStr()
                    giftGetPhoneNumberStr = gift.getPhoneNumberStr();
                    // read gift.contactPerson
                    giftContactPerson = gift.getContactPerson();
                    // read gift.isUnRegistered()
                    GiftIsUnRegistered1 = gift.isUnRegistered();
                    // read gift.description
                    giftDescription = gift.getDescription();
                    // read gift.getTimeStartReceive()
                    giftGetTimeStartReceive = gift.getTimeStartReceive();
                    // read gift.getFacebookStr()
                    giftGetFacebookStr = gift.getFacebookStr();
                    // read gift.deliveryEnable
                    giftDeliveryEnable = gift.getDeliveryEnable();
                    // read gift.isRegistered()
                    giftIsRegistered = gift.isRegistered();
                    // read gift.getTimeApplyStr()
                    giftGetTimeApplyStr = gift.getTimeApplyStr();
                    // read gift.getAddressReceive()
                    giftGetAddressReceive = gift.getAddressReceive();
                }


                if (giftGetUStatus2 != null) {
                    // read gift.getUStatus2().title
                    giftGetUStatus2Title = giftGetUStatus2.getTitle();
                }
                // read !gift.isUnRegistered()
                giftIsUnRegistered = !GiftIsUnRegistered1;
                // read gift.deliveryEnable == 1
                giftDeliveryEnableInt1 = (giftDeliveryEnable) == (1);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView01.setStatus(cancelApplyStatus);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, giftContactPerson);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView10, giftDeliveryEnableInt1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, giftContactPerson);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, giftGetPhoneNumberStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, giftGetEmailStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, giftGetFacebookStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, giftName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, giftGetTimeApplyStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, giftGetReasonStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, giftDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, giftGetTimeStartReceive);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, giftGetAddressReceive);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.registerButton, GiftIsUnRegistered1);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.registerInfo, giftIsUnRegistered);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusText, giftGetUStatus2Title);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.unRegisterButton, giftIsRegistered);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): cancelApplyStatus
        flag 1 (0x2L): gift
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}