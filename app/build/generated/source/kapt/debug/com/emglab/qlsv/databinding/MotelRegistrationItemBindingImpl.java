package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MotelRegistrationItemBindingImpl extends MotelRegistrationItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.container, 8);
        sViewsWithIds.put(R.id.imageView16, 9);
        sViewsWithIds.put(R.id.statusCard, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MotelRegistrationItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private MotelRegistrationItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (com.google.android.material.card.MaterialCardView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.statusText.setTag(null);
        this.textView21.setTag(null);
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
        if (BR.status == variableId) {
            setStatus((com.emglab.qlsv.modules.searchMotel.model.MotelRegistrationStatus) variable);
        }
        else if (BR.motelRegistraion == variableId) {
            setMotelRegistraion((com.emglab.qlsv.modules.searchMotel.model.MotelRegistration) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStatus(@Nullable com.emglab.qlsv.modules.searchMotel.model.MotelRegistrationStatus Status) {
        this.mStatus = Status;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.status);
        super.requestRebind();
    }
    public void setMotelRegistraion(@Nullable com.emglab.qlsv.modules.searchMotel.model.MotelRegistration MotelRegistraion) {
        this.mMotelRegistraion = MotelRegistraion;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.motelRegistraion);
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
        java.lang.String motelRegistraionPriceStr = null;
        com.emglab.qlsv.modules.searchMotel.model.MotelRegistrationStatus status = mStatus;
        java.lang.String motelRegistraionType = null;
        java.lang.String motelRegistraionAddress = null;
        java.lang.String motelRegistraionCreatedTimeStr = null;
        com.emglab.qlsv.modules.searchMotel.model.MotelRegistration motelRegistraion = mMotelRegistraion;
        java.lang.String statusDescription = null;
        java.lang.String motelRegistraionUserRequests = null;
        java.lang.String motelRegistraionNumberOfPeopleStr = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (status != null) {
                    // read status.description
                    statusDescription = status.getDescription();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (motelRegistraion != null) {
                    // read motelRegistraion.priceStr
                    motelRegistraionPriceStr = motelRegistraion.getPriceStr();
                    // read motelRegistraion.type
                    motelRegistraionType = motelRegistraion.getType();
                    // read motelRegistraion.address
                    motelRegistraionAddress = motelRegistraion.getAddress();
                    // read motelRegistraion.createdTimeStr
                    motelRegistraionCreatedTimeStr = motelRegistraion.getCreatedTimeStr();
                    // read motelRegistraion.userRequests
                    motelRegistraionUserRequests = motelRegistraion.getUserRequests();
                    // read motelRegistraion.numberOfPeopleStr
                    motelRegistraionNumberOfPeopleStr = motelRegistraion.getNumberOfPeopleStr();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, motelRegistraionCreatedTimeStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, motelRegistraionType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, motelRegistraionNumberOfPeopleStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, motelRegistraionPriceStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, motelRegistraionUserRequests);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView21, motelRegistraionAddress);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusText, statusDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): motelRegistraion
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}