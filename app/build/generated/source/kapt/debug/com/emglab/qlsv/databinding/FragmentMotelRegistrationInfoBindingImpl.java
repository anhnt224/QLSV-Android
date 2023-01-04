package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMotelRegistrationInfoBindingImpl extends FragmentMotelRegistrationInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView22, 9);
        sViewsWithIds.put(R.id.textView23, 10);
        sViewsWithIds.put(R.id.textView29, 11);
        sViewsWithIds.put(R.id.statusCard, 12);
        sViewsWithIds.put(R.id.textView24, 13);
        sViewsWithIds.put(R.id.textView25, 14);
        sViewsWithIds.put(R.id.textView26, 15);
        sViewsWithIds.put(R.id.textView27, 16);
        sViewsWithIds.put(R.id.textView28, 17);
        sViewsWithIds.put(R.id.feeLayout, 18);
        sViewsWithIds.put(R.id.feeTitle, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMotelRegistrationInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentMotelRegistrationInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (android.widget.TextView) bindings[19]
            , (com.google.android.material.card.MaterialCardView) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[11]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.statusText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.status == variableId) {
            setStatus((com.emglab.qlsv.common.Status) variable);
        }
        else if (BR.motelRegistrationStatus == variableId) {
            setMotelRegistrationStatus((com.emglab.qlsv.modules.searchMotel.model.MotelRegistrationStatus) variable);
        }
        else if (BR.motelRegistration == variableId) {
            setMotelRegistration((com.emglab.qlsv.modules.searchMotel.model.MotelRegistration) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStatus(@Nullable com.emglab.qlsv.common.Status Status) {
        this.mStatus = Status;
    }
    public void setMotelRegistrationStatus(@Nullable com.emglab.qlsv.modules.searchMotel.model.MotelRegistrationStatus MotelRegistrationStatus) {
        this.mMotelRegistrationStatus = MotelRegistrationStatus;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.motelRegistrationStatus);
        super.requestRebind();
    }
    public void setMotelRegistration(@Nullable com.emglab.qlsv.modules.searchMotel.model.MotelRegistration MotelRegistration) {
        this.mMotelRegistration = MotelRegistration;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.motelRegistration);
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
        java.lang.String motelRegistrationLiveWithOtherStr = null;
        java.lang.String motelRegistrationLocationStr = null;
        java.lang.String motelRegistrationNumberOfPeopleStr2 = null;
        java.lang.String motelRegistrationType = null;
        java.lang.String motelRegistrationPriceStr2 = null;
        java.lang.String motelRegistrationStatusDescription = null;
        com.emglab.qlsv.modules.searchMotel.model.MotelRegistrationStatus motelRegistrationStatus = mMotelRegistrationStatus;
        java.lang.String motelRegistrationAddress = null;
        java.lang.String motelRegistrationUserRequests = null;
        com.emglab.qlsv.modules.searchMotel.model.MotelRegistration motelRegistration = mMotelRegistration;

        if ((dirtyFlags & 0xaL) != 0) {



                if (motelRegistrationStatus != null) {
                    // read motelRegistrationStatus.description
                    motelRegistrationStatusDescription = motelRegistrationStatus.getDescription();
                }
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (motelRegistration != null) {
                    // read motelRegistration.liveWithOtherStr
                    motelRegistrationLiveWithOtherStr = motelRegistration.getLiveWithOtherStr();
                    // read motelRegistration.locationStr
                    motelRegistrationLocationStr = motelRegistration.getLocationStr();
                    // read motelRegistration.numberOfPeopleStr2
                    motelRegistrationNumberOfPeopleStr2 = motelRegistration.getNumberOfPeopleStr2();
                    // read motelRegistration.type
                    motelRegistrationType = motelRegistration.getType();
                    // read motelRegistration.priceStr2
                    motelRegistrationPriceStr2 = motelRegistration.getPriceStr2();
                    // read motelRegistration.address
                    motelRegistrationAddress = motelRegistration.getAddress();
                    // read motelRegistration.userRequests
                    motelRegistrationUserRequests = motelRegistration.getUserRequests();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, motelRegistrationAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, motelRegistrationLocationStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, motelRegistrationType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, motelRegistrationNumberOfPeopleStr2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, motelRegistrationPriceStr2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, motelRegistrationUserRequests);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, motelRegistrationLiveWithOtherStr);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusText, motelRegistrationStatusDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): motelRegistrationStatus
        flag 2 (0x3L): motelRegistration
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}