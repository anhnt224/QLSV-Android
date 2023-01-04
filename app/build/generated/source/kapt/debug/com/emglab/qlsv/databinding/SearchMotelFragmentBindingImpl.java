package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SearchMotelFragmentBindingImpl extends SearchMotelFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textViewAddress, 2);
        sViewsWithIds.put(R.id.map, 3);
        sViewsWithIds.put(R.id.viewListMotelInfo, 4);
        sViewsWithIds.put(R.id.imageMotel1, 5);
        sViewsWithIds.put(R.id.textViewNumberOfListMotel, 6);
        sViewsWithIds.put(R.id.distanceLayout, 7);
        sViewsWithIds.put(R.id.showSelectDistance1, 8);
        sViewsWithIds.put(R.id.recyclerViewMotelInfo, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SearchMotelFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private SearchMotelFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ProgressBar) bindings[1]
            , (com.google.android.gms.maps.MapView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            );
        this.loadingIndicator.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.getActivityStatus == variableId) {
            setGetActivityStatus((com.emglab.qlsv.common.Status) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGetActivityStatus(@Nullable com.emglab.qlsv.common.Status GetActivityStatus) {
        this.mGetActivityStatus = GetActivityStatus;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.getActivityStatus);
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
        boolean getActivityStatusStatusLOADING = false;
        com.emglab.qlsv.common.Status getActivityStatus = mGetActivityStatus;

        if ((dirtyFlags & 0x3L) != 0) {



                // read getActivityStatus == Status.LOADING
                getActivityStatusStatusLOADING = (getActivityStatus) == (com.emglab.qlsv.common.Status.LOADING);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.loadingIndicator, getActivityStatusStatusLOADING);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): getActivityStatus
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}