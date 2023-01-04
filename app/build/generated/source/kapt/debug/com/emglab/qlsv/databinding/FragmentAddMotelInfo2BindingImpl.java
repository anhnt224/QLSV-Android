package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddMotelInfo2BindingImpl extends FragmentAddMotelInfo2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(0, 
            new String[] {"loading_action_state"},
            new int[] {1},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView, 2);
        sViewsWithIds.put(R.id.hostNameTxt, 3);
        sViewsWithIds.put(R.id.hostPhoneTxt, 4);
        sViewsWithIds.put(R.id.motelTypeLayout, 5);
        sViewsWithIds.put(R.id.motelTypeTxt, 6);
        sViewsWithIds.put(R.id.motelAddressTxt, 7);
        sViewsWithIds.put(R.id.motelDescriptionTxt, 8);
        sViewsWithIds.put(R.id.seekBar, 9);
        sViewsWithIds.put(R.id.motelCommentTxt, 10);
        sViewsWithIds.put(R.id.buttonSave, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAddMotelInfo2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentAddMotelInfo2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (android.widget.ScrollView) bindings[2]
            , (androidx.appcompat.widget.AppCompatSeekBar) bindings[9]
            );
        setContainedBinding(this.include2);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        include2.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (include2.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.status == variableId) {
            setStatus((com.emglab.qlsv.common.Status) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStatus(@Nullable com.emglab.qlsv.common.Status Status) {
        this.mStatus = Status;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.status);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        include2.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeInclude2((com.emglab.qlsv.databinding.LoadingActionStateBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeInclude2(com.emglab.qlsv.databinding.LoadingActionStateBinding Include2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        com.emglab.qlsv.common.Status status = mStatus;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.include2.setStatus(status);
        }
        executeBindingsOn(include2);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): include2
        flag 1 (0x2L): status
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}