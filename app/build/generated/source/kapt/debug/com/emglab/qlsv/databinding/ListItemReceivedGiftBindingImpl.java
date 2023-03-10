package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemReceivedGiftBindingImpl extends ListItemReceivedGiftBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView6, 6);
        sViewsWithIds.put(R.id.imageView, 7);
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

    public ListItemReceivedGiftBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ListItemReceivedGiftBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[5]
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
        java.lang.String giftGetTimeApplyStr = null;
        com.emglab.qlsv.models.entity.gift.GiftRegisteredStatus giftGetUStatus2 = null;
        com.emglab.qlsv.models.entity.gift.Gift gift = mGift;
        java.lang.String giftContactPerson = null;
        java.lang.String giftName = null;
        java.lang.String giftGetReasonStr = null;
        java.lang.String giftGetUStatus2Title = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (gift != null) {
                    // read gift.getTimeApplyStr()
                    giftGetTimeApplyStr = gift.getTimeApplyStr();
                    // read gift.getUStatus2()
                    giftGetUStatus2 = gift.getUStatus2();
                    // read gift.contactPerson
                    giftContactPerson = gift.getContactPerson();
                    // read gift.name
                    giftName = gift.getName();
                    // read gift.getReasonStr()
                    giftGetReasonStr = gift.getReasonStr();
                }


                if (giftGetUStatus2 != null) {
                    // read gift.getUStatus2().title
                    giftGetUStatus2Title = giftGetUStatus2.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, giftName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, giftContactPerson);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, giftGetReasonStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, giftGetTimeApplyStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusText, giftGetUStatus2Title);
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