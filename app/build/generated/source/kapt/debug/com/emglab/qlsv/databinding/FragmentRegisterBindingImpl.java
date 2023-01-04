package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"loading_action_state"},
            new int[] {1},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lineMain, 2);
        sViewsWithIds.put(R.id.edtUserCode, 3);
        sViewsWithIds.put(R.id.edtEmail, 4);
        sViewsWithIds.put(R.id.edtMobile, 5);
        sViewsWithIds.put(R.id.btnRegister, 6);
    }
    // views
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView01;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[6]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[3]
            , (android.widget.LinearLayout) bindings[2]
            );
        this.mboundView0 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[1];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView01.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        mboundView0.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.registerResource == variableId) {
            setRegisterResource((com.emglab.qlsv.common.Resource) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRegisterResource(@Nullable com.emglab.qlsv.common.Resource RegisterResource) {
        this.mRegisterResource = RegisterResource;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.registerResource);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView0.setLifecycleOwner(lifecycleOwner);
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
        com.emglab.qlsv.common.Resource<?> registerResource = mRegisterResource;

        if ((dirtyFlags & 0x3L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView0.setResource(registerResource);
        }
        executeBindingsOn(mboundView0);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): registerResource
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}