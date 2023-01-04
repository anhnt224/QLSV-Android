package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemUserCriteriaBindingImpl extends ListItemUserCriteriaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewStatus, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemUserCriteriaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ListItemUserCriteriaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.LinearLayout) bindings[7]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.textProof.setTag(null);
        this.textProof2.setTag(null);
        this.textSPoint.setTag(null);
        this.textTPoint.setTag(null);
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
        if (BR.userCriteriaDetail == variableId) {
            setUserCriteriaDetail((com.emglab.qlsv.models.entity.UserCriteriaDetail) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserCriteriaDetail(@Nullable com.emglab.qlsv.models.entity.UserCriteriaDetail UserCriteriaDetail) {
        this.mUserCriteriaDetail = UserCriteriaDetail;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.userCriteriaDetail);
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
        int userCriteriaDetailTPoint = 0;
        java.lang.String userCriteriaDetailGetProofStr = null;
        int userCriteriaDetailSPoint = 0;
        java.lang.String javaLangStringIMTIAUserCriteriaDetailMaxPoint = null;
        com.emglab.qlsv.models.entity.UserCriteriaDetail userCriteriaDetail = mUserCriteriaDetail;
        int userCriteriaDetailMaxPoint = 0;
        boolean userCriteriaDetailNeedProof = false;
        java.lang.String javaLangStringGVChMUserCriteriaDetailTPoint = null;
        java.lang.String javaLangStringSVChMUserCriteriaDetailSPoint = null;
        boolean userCriteriaDetailIsProofText = false;
        java.lang.String userCriteriaDetailName = null;
        java.lang.String userCriteriaDetailGetNumberProof = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (userCriteriaDetail != null) {
                    // read userCriteriaDetail.tPoint
                    userCriteriaDetailTPoint = userCriteriaDetail.getTPoint();
                    // read userCriteriaDetail.getProofStr()
                    userCriteriaDetailGetProofStr = userCriteriaDetail.getProofStr();
                    // read userCriteriaDetail.sPoint
                    userCriteriaDetailSPoint = userCriteriaDetail.getSPoint();
                    // read userCriteriaDetail.maxPoint
                    userCriteriaDetailMaxPoint = userCriteriaDetail.getMaxPoint();
                    // read userCriteriaDetail.needProof()
                    userCriteriaDetailNeedProof = userCriteriaDetail.needProof();
                    // read userCriteriaDetail.isProofText()
                    userCriteriaDetailIsProofText = userCriteriaDetail.isProofText();
                    // read userCriteriaDetail.name
                    userCriteriaDetailName = userCriteriaDetail.getName();
                    // read userCriteriaDetail.getNumberProof()
                    userCriteriaDetailGetNumberProof = userCriteriaDetail.getNumberProof();
                }


                // read ("GV chấm: ") + (userCriteriaDetail.tPoint)
                javaLangStringGVChMUserCriteriaDetailTPoint = ("GV chấm: ") + (userCriteriaDetailTPoint);
                // read ("SV chấm: ") + (userCriteriaDetail.sPoint)
                javaLangStringSVChMUserCriteriaDetailSPoint = ("SV chấm: ") + (userCriteriaDetailSPoint);
                // read ("Điểm tối đa: ") + (userCriteriaDetail.maxPoint)
                javaLangStringIMTIAUserCriteriaDetailMaxPoint = ("Điểm tối đa: ") + (userCriteriaDetailMaxPoint);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, userCriteriaDetailName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, javaLangStringIMTIAUserCriteriaDetailMaxPoint);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.textProof, userCriteriaDetailNeedProof);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textProof, userCriteriaDetailGetNumberProof);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.textProof2, userCriteriaDetailIsProofText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textProof2, userCriteriaDetailGetProofStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textSPoint, javaLangStringSVChMUserCriteriaDetailSPoint);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTPoint, javaLangStringGVChMUserCriteriaDetailTPoint);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userCriteriaDetail
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}