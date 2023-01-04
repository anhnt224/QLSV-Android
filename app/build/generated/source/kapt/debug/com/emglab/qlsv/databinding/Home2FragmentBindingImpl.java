package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class Home2FragmentBindingImpl extends Home2FragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 3);
        sViewsWithIds.put(R.id.linearLayout15, 4);
        sViewsWithIds.put(R.id.titleTextView, 5);
        sViewsWithIds.put(R.id.titleWelcome, 6);
        sViewsWithIds.put(R.id.recyclerView, 7);
        sViewsWithIds.put(R.id.retryButton, 8);
        sViewsWithIds.put(R.id.recyclerView1, 9);
        sViewsWithIds.put(R.id.recyclerView2, 10);
        sViewsWithIds.put(R.id.recyclerView3, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public Home2FragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private Home2FragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.ProgressBar) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.progressBar2.setTag(null);
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
        boolean getActivityStatusStatusERROR = false;

        if ((dirtyFlags & 0x3L) != 0) {



                // read getActivityStatus == Status.LOADING
                getActivityStatusStatusLOADING = (getActivityStatus) == (com.emglab.qlsv.common.Status.LOADING);
                // read getActivityStatus == Status.ERROR
                getActivityStatusStatusERROR = (getActivityStatus) == (com.emglab.qlsv.common.Status.ERROR);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView2, getActivityStatusStatusERROR);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.progressBar2, getActivityStatusStatusLOADING);
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