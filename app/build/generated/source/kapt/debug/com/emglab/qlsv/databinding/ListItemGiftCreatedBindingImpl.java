package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemGiftCreatedBindingImpl extends ListItemGiftCreatedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.moreButton, 7);
        sViewsWithIds.put(R.id.cardView6, 8);
        sViewsWithIds.put(R.id.imageView, 9);
        sViewsWithIds.put(R.id.register, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
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

    public ListItemGiftCreatedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ListItemGiftCreatedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (android.widget.ProgressBar) bindings[10]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.statusText.setTag(null);
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
        if (BR.gift == variableId) {
            setGift((com.emglab.qlsv.models.entity.gift.Gift) variable);
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
        java.lang.String giftGetStatusName = null;
        java.lang.String giftGetRegisteredQuantityStr = null;
        java.lang.String giftGetQuantityStr = null;
        java.lang.String giftDescription = null;
        java.lang.String giftGetDeadlineStr = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (gift != null) {
                    // read gift.name
                    giftName = gift.getName();
                    // read gift.getStatusName()
                    giftGetStatusName = gift.getStatusName();
                    // read gift.getRegisteredQuantityStr()
                    giftGetRegisteredQuantityStr = gift.getRegisteredQuantityStr();
                    // read gift.getQuantityStr()
                    giftGetQuantityStr = gift.getQuantityStr();
                    // read gift.description
                    giftDescription = gift.getDescription();
                    // read gift.getDeadlineStr()
                    giftGetDeadlineStr = gift.getDeadlineStr();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, giftName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, giftDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, giftGetDeadlineStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, giftGetQuantityStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, giftGetRegisteredQuantityStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusText, giftGetStatusName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gift
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}