package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemMotelInfoBindingImpl extends ListItemMotelInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ratingBar, 4);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemMotelInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ListItemMotelInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.RatingBar) bindings[4]
            );
        this.cardViewOpenMotelItem.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
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
        if (BR.motel == variableId) {
            setMotel((com.emglab.qlsv.models.entity.Motel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMotel(@Nullable com.emglab.qlsv.models.entity.Motel Motel) {
        this.mMotel = Motel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.motel);
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
        java.lang.String motelManagerNameJavaLangString = null;
        java.lang.String motelManagerNameJavaLangStringMotelManagerContact = null;
        java.lang.String motelManagerContact = null;
        java.lang.String motelMotelTypeWithAddress = null;
        java.lang.String motelDescription = null;
        com.emglab.qlsv.models.entity.Motel motel = mMotel;
        java.lang.String motelManagerName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (motel != null) {
                    // read motel.managerContact
                    motelManagerContact = motel.getManagerContact();
                    // read motel.motelTypeWithAddress
                    motelMotelTypeWithAddress = motel.getMotelTypeWithAddress();
                    // read motel.description
                    motelDescription = motel.getDescription();
                    // read motel.managerName
                    motelManagerName = motel.getManagerName();
                }


                // read (motel.managerName) + ("-")
                motelManagerNameJavaLangString = (motelManagerName) + ("-");


                // read ((motel.managerName) + ("-")) + (motel.managerContact)
                motelManagerNameJavaLangStringMotelManagerContact = (motelManagerNameJavaLangString) + (motelManagerContact);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, motelMotelTypeWithAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, motelManagerNameJavaLangStringMotelManagerContact);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, motelDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): motel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}