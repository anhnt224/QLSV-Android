package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TrainingPointFragmentBindingImpl extends TrainingPointFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(1, 
            new String[] {"layout_loading"},
            new int[] {3},
            new int[] {com.emglab.qlsv.R.layout.layout_loading});
        sIncludes.setIncludes(2, 
            new String[] {"layout_loading"},
            new int[] {4},
            new int[] {com.emglab.qlsv.R.layout.layout_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.buttonSemester, 5);
        sViewsWithIds.put(R.id.buttonDetail, 6);
        sViewsWithIds.put(R.id.barChart, 7);
        sViewsWithIds.put(R.id.lineChart, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView1;
    @Nullable
    private final com.emglab.qlsv.databinding.LayoutLoadingBinding mboundView11;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView2;
    @Nullable
    private final com.emglab.qlsv.databinding.LayoutLoadingBinding mboundView21;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TrainingPointFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private TrainingPointFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.github.mikephil.charting.charts.BarChart) bindings[7]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.github.mikephil.charting.charts.LineChart) bindings[8]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.cardview.widget.CardView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.emglab.qlsv.databinding.LayoutLoadingBinding) bindings[3];
        setContainedBinding(this.mboundView11);
        this.mboundView2 = (androidx.cardview.widget.CardView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView21 = (com.emglab.qlsv.databinding.LayoutLoadingBinding) bindings[4];
        setContainedBinding(this.mboundView21);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        mboundView11.invalidateAll();
        mboundView21.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        if (mboundView21.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.callback1 == variableId) {
            setCallback1((com.emglab.qlsv.common.RetryCallback) variable);
        }
        else if (BR.resource1 == variableId) {
            setResource1((com.emglab.qlsv.common.Resource) variable);
        }
        else if (BR.callback2 == variableId) {
            setCallback2((com.emglab.qlsv.common.RetryCallback) variable);
        }
        else if (BR.resource2 == variableId) {
            setResource2((com.emglab.qlsv.common.Resource) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCallback1(@Nullable com.emglab.qlsv.common.RetryCallback Callback1) {
        this.mCallback1 = Callback1;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.callback1);
        super.requestRebind();
    }
    public void setResource1(@Nullable com.emglab.qlsv.common.Resource Resource1) {
        this.mResource1 = Resource1;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.resource1);
        super.requestRebind();
    }
    public void setCallback2(@Nullable com.emglab.qlsv.common.RetryCallback Callback2) {
        this.mCallback2 = Callback2;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.callback2);
        super.requestRebind();
    }
    public void setResource2(@Nullable com.emglab.qlsv.common.Resource Resource2) {
        this.mResource2 = Resource2;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.resource2);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView21.setLifecycleOwner(lifecycleOwner);
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
        com.emglab.qlsv.common.Status resource2Status = null;
        com.emglab.qlsv.common.RetryCallback callback1 = mCallback1;
        com.emglab.qlsv.common.Resource<?> resource1 = mResource1;
        com.emglab.qlsv.common.RetryCallback callback2 = mCallback2;
        com.emglab.qlsv.common.Resource<?> resource2 = mResource2;
        com.emglab.qlsv.common.Status resource1Status = null;

        if ((dirtyFlags & 0x11L) != 0) {
        }
        if ((dirtyFlags & 0x12L) != 0) {



                if (resource1 != null) {
                    // read resource1.status
                    resource1Status = resource1.getStatus();
                }
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x18L) != 0) {



                if (resource2 != null) {
                    // read resource2.status
                    resource2Status = resource2.getStatus();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.mboundView11.setCallback(callback1);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.mboundView11.setStatus(resource1Status);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.mboundView21.setCallback(callback2);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.mboundView21.setStatus(resource2Status);
        }
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView21);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): callback1
        flag 1 (0x2L): resource1
        flag 2 (0x3L): callback2
        flag 3 (0x4L): resource2
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}