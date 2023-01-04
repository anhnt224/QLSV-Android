package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentScheduleBindingImpl extends FragmentScheduleBinding implements com.emglab.qlsv.generated.callback.LogoutCallback.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(0, 
            new String[] {"error_token"},
            new int[] {2},
            new int[] {com.emglab.qlsv.R.layout.error_token});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 3);
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.date_picker_button, 5);
        sViewsWithIds.put(R.id.date_picker_text_view, 6);
        sViewsWithIds.put(R.id.txtWeekNumber, 7);
        sViewsWithIds.put(R.id.recyclerview, 8);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final com.emglab.qlsv.databinding.ErrorTokenBinding mboundView01;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    @Nullable
    private final com.emglab.qlsv.common.LogoutCallback mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentScheduleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentScheduleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[3]
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.emglab.qlsv.databinding.ErrorTokenBinding) bindings[2];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.emglab.qlsv.generated.callback.LogoutCallback(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        mboundView01.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.retryCallback == variableId) {
            setRetryCallback((com.emglab.qlsv.common.RetryCallback) variable);
        }
        else if (BR.scheduleStudentsResource == variableId) {
            setScheduleStudentsResource((com.emglab.qlsv.common.Resource) variable);
        }
        else if (BR.logoutCallback == variableId) {
            setLogoutCallback((com.emglab.qlsv.common.LogoutCallback) variable);
        }
        else if (BR.sizeOfScheduleStudent == variableId) {
            setSizeOfScheduleStudent((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRetryCallback(@Nullable com.emglab.qlsv.common.RetryCallback RetryCallback) {
        this.mRetryCallback = RetryCallback;
    }
    public void setScheduleStudentsResource(@Nullable com.emglab.qlsv.common.Resource ScheduleStudentsResource) {
        this.mScheduleStudentsResource = ScheduleStudentsResource;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.scheduleStudentsResource);
        super.requestRebind();
    }
    public void setLogoutCallback(@Nullable com.emglab.qlsv.common.LogoutCallback LogoutCallback) {
        this.mLogoutCallback = LogoutCallback;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.logoutCallback);
        super.requestRebind();
    }
    public void setSizeOfScheduleStudent(@Nullable java.lang.Integer SizeOfScheduleStudent) {
        this.mSizeOfScheduleStudent = SizeOfScheduleStudent;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.sizeOfScheduleStudent);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView01.setLifecycleOwner(lifecycleOwner);
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
        com.emglab.qlsv.common.Resource<?> scheduleStudentsResource = mScheduleStudentsResource;
        com.emglab.qlsv.common.LogoutCallback logoutCallback = mLogoutCallback;
        boolean sizeOfScheduleStudentInt0 = false;
        java.lang.Integer sizeOfScheduleStudent = mSizeOfScheduleStudent;
        int androidxDatabindingViewDataBindingSafeUnboxSizeOfScheduleStudent = 0;

        if ((dirtyFlags & 0x12L) != 0) {
        }
        if ((dirtyFlags & 0x18L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(sizeOfScheduleStudent)
                androidxDatabindingViewDataBindingSafeUnboxSizeOfScheduleStudent = androidx.databinding.ViewDataBinding.safeUnbox(sizeOfScheduleStudent);


                // read androidx.databinding.ViewDataBinding.safeUnbox(sizeOfScheduleStudent) == 0
                sizeOfScheduleStudentInt0 = (androidxDatabindingViewDataBindingSafeUnboxSizeOfScheduleStudent) == (0);
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.mboundView01.setResource(scheduleStudentsResource);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView01.setCallback(mCallback4);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView1, sizeOfScheduleStudentInt0);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackLogout(int sourceId ) {
        // localize variables for thread safety
        // logoutCallback
        com.emglab.qlsv.common.LogoutCallback logoutCallback = mLogoutCallback;
        // logoutCallback != null
        boolean logoutCallbackJavaLangObjectNull = false;



        logoutCallbackJavaLangObjectNull = (logoutCallback) != (null);
        if (logoutCallbackJavaLangObjectNull) {


            logoutCallback.logout();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): retryCallback
        flag 1 (0x2L): scheduleStudentsResource
        flag 2 (0x3L): logoutCallback
        flag 3 (0x4L): sizeOfScheduleStudent
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}