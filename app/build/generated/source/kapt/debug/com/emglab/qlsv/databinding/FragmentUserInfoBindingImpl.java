package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUserInfoBindingImpl extends FragmentUserInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView5x, 8);
        sViewsWithIds.put(R.id.textView55, 9);
        sViewsWithIds.put(R.id.textView65, 10);
        sViewsWithIds.put(R.id.textView5, 11);
        sViewsWithIds.put(R.id.textView55x, 12);
        sViewsWithIds.put(R.id.textView55xx, 13);
        sViewsWithIds.put(R.id.textView55cx, 14);
        sViewsWithIds.put(R.id.textView65x, 15);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentUserInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[15]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
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
        if (BR.user == variableId) {
            setUser((com.emglab.qlsv.models.entity.User) variable);
        }
        else if (BR.userResource == variableId) {
            setUserResource((com.emglab.qlsv.common.Resource) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.emglab.qlsv.models.entity.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public void setUserResource(@Nullable com.emglab.qlsv.common.Resource UserResource) {
        this.mUserResource = UserResource;
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
        java.lang.String userFaculty = null;
        com.emglab.qlsv.models.entity.User user = mUser;
        java.lang.String userCmnd = null;
        java.lang.String userEmail = null;
        java.lang.String userBirthday = null;
        java.lang.String userFullName = null;
        java.lang.String userSex = null;
        java.lang.String userStudentId = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (user != null) {
                    // read user.faculty
                    userFaculty = user.getFaculty();
                    // read user.cmnd
                    userCmnd = user.getCmnd();
                    // read user.email
                    userEmail = user.getEmail();
                    // read user.birthday
                    userBirthday = user.getBirthday();
                    // read user.fullName
                    userFullName = user.getFullName();
                    // read user.sex
                    userSex = user.getSex();
                    // read user.studentId
                    userStudentId = user.getStudentId();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, userFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, userStudentId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, userFaculty);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, userCmnd);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, userSex);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, userBirthday);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, userEmail);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): userResource
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}