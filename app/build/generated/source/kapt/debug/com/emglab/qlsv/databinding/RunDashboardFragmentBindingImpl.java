package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RunDashboardFragmentBindingImpl extends RunDashboardFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.chartTypeTabLayout, 1);
        sViewsWithIds.put(R.id.totalDistanceTextView, 2);
        sViewsWithIds.put(R.id.distanceUnitTextView, 3);
        sViewsWithIds.put(R.id.prevButton, 4);
        sViewsWithIds.put(R.id.nextButton, 5);
        sViewsWithIds.put(R.id.timeRangeTextView, 6);
        sViewsWithIds.put(R.id.barChart, 7);
        sViewsWithIds.put(R.id.textView14, 8);
        sViewsWithIds.put(R.id.syncWarningLayout, 9);
        sViewsWithIds.put(R.id.syncTitle, 10);
        sViewsWithIds.put(R.id.syncButton, 11);
        sViewsWithIds.put(R.id.recyclerView, 12);
        sViewsWithIds.put(R.id.runButton, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RunDashboardFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private RunDashboardFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.github.mikephil.charting.charts.BarChart) bindings[7]
            , (com.google.android.material.tabs.TabLayout) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
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