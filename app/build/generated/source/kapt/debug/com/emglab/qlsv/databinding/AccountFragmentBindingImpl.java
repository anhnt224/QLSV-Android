package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AccountFragmentBindingImpl extends AccountFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 1);
        sViewsWithIds.put(R.id.cardView, 2);
        sViewsWithIds.put(R.id.imageStudent, 3);
        sViewsWithIds.put(R.id.textFullName, 4);
        sViewsWithIds.put(R.id.textStudentID, 5);
        sViewsWithIds.put(R.id.viewUserInfo, 6);
        sViewsWithIds.put(R.id.imageViewx, 7);
        sViewsWithIds.put(R.id.viewChangePassword, 8);
        sViewsWithIds.put(R.id.imageView81, 9);
        sViewsWithIds.put(R.id.viewAddress, 10);
        sViewsWithIds.put(R.id.imageView82, 11);
        sViewsWithIds.put(R.id.viewBook, 12);
        sViewsWithIds.put(R.id.imageView8, 13);
        sViewsWithIds.put(R.id.textView3, 14);
        sViewsWithIds.put(R.id.viewQRStudent, 15);
        sViewsWithIds.put(R.id.imageView84, 16);
        sViewsWithIds.put(R.id.runningView, 17);
        sViewsWithIds.put(R.id.imageView88, 18);
        sViewsWithIds.put(R.id.viewNotes, 19);
        sViewsWithIds.put(R.id.imageView84x, 20);
        sViewsWithIds.put(R.id.viewAbout, 21);
        sViewsWithIds.put(R.id.imageView9, 22);
        sViewsWithIds.put(R.id.viewFeedback, 23);
        sViewsWithIds.put(R.id.imageView85, 24);
        sViewsWithIds.put(R.id.viewError, 25);
        sViewsWithIds.put(R.id.imageView841, 26);
        sViewsWithIds.put(R.id.viewLogout, 27);
        sViewsWithIds.put(R.id.imageView91, 28);
        sViewsWithIds.put(R.id.textVersion, 29);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AccountFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private AccountFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[27]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}