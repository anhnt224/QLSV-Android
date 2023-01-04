package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTMotelInfoBindingImpl extends FragmentTMotelInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textViewHostMotel, 1);
        sViewsWithIds.put(R.id.textViewContactMotel, 2);
        sViewsWithIds.put(R.id.copy, 3);
        sViewsWithIds.put(R.id.textViewAddressDetail, 4);
        sViewsWithIds.put(R.id.textViewDescriptionMotel, 5);
        sViewsWithIds.put(R.id.RatingMotel, 6);
        sViewsWithIds.put(R.id.textViewComment, 7);
        sViewsWithIds.put(R.id.recyclerViewListImageMotel, 8);
        sViewsWithIds.put(R.id.imageLayoutZoom, 9);
        sViewsWithIds.put(R.id.layout, 10);
        sViewsWithIds.put(R.id.imageViewZoom, 11);
        sViewsWithIds.put(R.id.closeButton, 12);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTMotelInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentTMotelInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RatingBar) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (android.widget.ImageView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.ImageView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
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