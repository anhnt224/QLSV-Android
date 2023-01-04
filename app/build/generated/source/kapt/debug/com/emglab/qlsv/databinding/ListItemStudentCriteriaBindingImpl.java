package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemStudentCriteriaBindingImpl extends ListItemStudentCriteriaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewStatus, 11);
        sViewsWithIds.put(R.id.textMark, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemStudentCriteriaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ListItemStudentCriteriaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[11]
            );
        this.btMinusScore.setTag(null);
        this.btPlusScore.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
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
        boolean userCriteriaDetailIsEmptyTeacherScore = false;
        int userCriteriaDetailSPoint = 0;
        java.lang.String javaLangStringSVChMUserCriteriaDetailSPointJavaLangString = null;
        boolean UserCriteriaDetailIsEmptyTeacherScore1 = false;
        boolean userCriteriaDetailIsMaxTeacherScore = false;
        java.lang.String userCriteriaDetailGetTeacherScore = null;
        boolean userCriteriaDetailCanMark = false;
        boolean UserCriteriaDetailIsMaxTeacherScore1 = false;
        boolean UserCriteriaDetailCanMark1 = false;
        java.lang.String javaLangStringIMTIAUserCriteriaDetailMaxPoint = null;
        java.lang.String javaLangStringSVChMUserCriteriaDetailSPointJavaLangStringUserCriteriaDetailMaxPoint = null;
        com.emglab.qlsv.models.entity.UserCriteriaDetail userCriteriaDetail = mUserCriteriaDetail;
        int userCriteriaDetailMaxPoint = 0;
        java.lang.String javaLangStringGVChMUserCriteriaDetailTPoint = null;
        java.lang.String javaLangStringSVChMUserCriteriaDetailSPoint = null;
        java.lang.String userCriteriaDetailName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (userCriteriaDetail != null) {
                    // read userCriteriaDetail.tPoint
                    userCriteriaDetailTPoint = userCriteriaDetail.getTPoint();
                    // read userCriteriaDetail.isEmptyTeacherScore()
                    userCriteriaDetailIsEmptyTeacherScore = userCriteriaDetail.isEmptyTeacherScore();
                    // read userCriteriaDetail.sPoint
                    userCriteriaDetailSPoint = userCriteriaDetail.getSPoint();
                    // read userCriteriaDetail.isMaxTeacherScore()
                    userCriteriaDetailIsMaxTeacherScore = userCriteriaDetail.isMaxTeacherScore();
                    // read userCriteriaDetail.getTeacherScore()
                    userCriteriaDetailGetTeacherScore = userCriteriaDetail.getTeacherScore();
                    // read userCriteriaDetail.canMark()
                    UserCriteriaDetailCanMark1 = userCriteriaDetail.canMark();
                    // read userCriteriaDetail.maxPoint
                    userCriteriaDetailMaxPoint = userCriteriaDetail.getMaxPoint();
                    // read userCriteriaDetail.name
                    userCriteriaDetailName = userCriteriaDetail.getName();
                }


                // read ("GV chấm: ") + (userCriteriaDetail.tPoint)
                javaLangStringGVChMUserCriteriaDetailTPoint = ("GV chấm: ") + (userCriteriaDetailTPoint);
                // read !userCriteriaDetail.isEmptyTeacherScore()
                UserCriteriaDetailIsEmptyTeacherScore1 = !userCriteriaDetailIsEmptyTeacherScore;
                // read ("SV chấm: ") + (userCriteriaDetail.sPoint)
                javaLangStringSVChMUserCriteriaDetailSPoint = ("SV chấm: ") + (userCriteriaDetailSPoint);
                // read !userCriteriaDetail.isMaxTeacherScore()
                UserCriteriaDetailIsMaxTeacherScore1 = !userCriteriaDetailIsMaxTeacherScore;
                // read !userCriteriaDetail.canMark()
                userCriteriaDetailCanMark = !UserCriteriaDetailCanMark1;
                // read ("Điểm tối đa: ") + (userCriteriaDetail.maxPoint)
                javaLangStringIMTIAUserCriteriaDetailMaxPoint = ("Điểm tối đa: ") + (userCriteriaDetailMaxPoint);


                // read (("SV chấm: ") + (userCriteriaDetail.sPoint)) + ("/")
                javaLangStringSVChMUserCriteriaDetailSPointJavaLangString = (javaLangStringSVChMUserCriteriaDetailSPoint) + ("/");


                // read ((("SV chấm: ") + (userCriteriaDetail.sPoint)) + ("/")) + (userCriteriaDetail.maxPoint)
                javaLangStringSVChMUserCriteriaDetailSPointJavaLangStringUserCriteriaDetailMaxPoint = (javaLangStringSVChMUserCriteriaDetailSPointJavaLangString) + (userCriteriaDetailMaxPoint);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.btMinusScore.setEnabled(UserCriteriaDetailIsEmptyTeacherScore1);
            this.btPlusScore.setEnabled(UserCriteriaDetailIsMaxTeacherScore1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, userCriteriaDetailName);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView2, userCriteriaDetailCanMark);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, javaLangStringIMTIAUserCriteriaDetailMaxPoint);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView6, UserCriteriaDetailCanMark1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, javaLangStringSVChMUserCriteriaDetailSPointJavaLangStringUserCriteriaDetailMaxPoint);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, userCriteriaDetailGetTeacherScore);
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