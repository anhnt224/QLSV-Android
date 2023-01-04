package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutEmptyDataBindingImpl extends LayoutEmptyDataBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutEmptyDataBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private LayoutEmptyDataBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
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
        if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.number == variableId) {
            setNumber((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setNumber(@Nullable java.lang.Integer Number) {
        this.mNumber = Number;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.number);
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
        java.lang.String title = mTitle;
        java.lang.Integer number = mNumber;
        int androidxDatabindingViewDataBindingSafeUnboxNumber = 0;
        boolean numberInt0 = false;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(number)
                androidxDatabindingViewDataBindingSafeUnboxNumber = androidx.databinding.ViewDataBinding.safeUnbox(number);


                // read androidx.databinding.ViewDataBinding.safeUnbox(number) == 0
                numberInt0 = (androidxDatabindingViewDataBindingSafeUnboxNumber) == (0);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView0, numberInt0);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, title);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): title
        flag 1 (0x2L): number
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}