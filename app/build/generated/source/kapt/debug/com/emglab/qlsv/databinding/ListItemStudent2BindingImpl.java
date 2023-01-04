package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemStudent2BindingImpl extends ListItemStudent2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainLayout, 8);
        sViewsWithIds.put(R.id.materialCardView2, 9);
        sViewsWithIds.put(R.id.layoutWarning, 10);
        sViewsWithIds.put(R.id.infoButton, 11);
        sViewsWithIds.put(R.id.callButton, 12);
        sViewsWithIds.put(R.id.contactButton, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemStudent2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ListItemStudent2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.card.MaterialCardView) bindings[10]
            , (com.google.android.material.card.MaterialCardView) bindings[8]
            , (com.google.android.material.card.MaterialCardView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.textScore.setTag(null);
        this.textTScore.setTag(null);
        this.textWarning.setTag(null);
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
        if (BR.student == variableId) {
            setStudent((com.emglab.qlsv.models.entity.Student) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStudent(@Nullable com.emglab.qlsv.models.entity.Student Student) {
        this.mStudent = Student;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.student);
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
        com.emglab.qlsv.models.entity.Student student = mStudent;
        java.lang.String javaLangStringCPAStudentCpa = null;
        java.lang.String javaLangStringMSSVStudentId = null;
        java.lang.String studentGetStudentScore = null;
        java.lang.String studentCpa = null;
        java.lang.String studentId = null;
        java.lang.String studentName = null;
        java.lang.String studentGetTScoreStr = null;
        java.lang.String studentGetFirstCharInName = null;
        java.lang.String studentWarningLevel = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (student != null) {
                    // read student.getStudentScore()
                    studentGetStudentScore = student.getStudentScore();
                    // read student.cpa
                    studentCpa = student.getCpa();
                    // read student.id
                    studentId = student.getId();
                    // read student.name
                    studentName = student.getName();
                    // read student.getTScoreStr()
                    studentGetTScoreStr = student.getTScoreStr();
                    // read student.getFirstCharInName()
                    studentGetFirstCharInName = student.getFirstCharInName();
                    // read student.warningLevel
                    studentWarningLevel = student.getWarningLevel();
                }


                // read ("CPA: ") + (student.cpa)
                javaLangStringCPAStudentCpa = ("CPA: ") + (studentCpa);
                // read ("MSSV: ") + (student.id)
                javaLangStringMSSVStudentId = ("MSSV: ") + (studentId);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, studentGetFirstCharInName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, studentName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, javaLangStringMSSVStudentId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, javaLangStringCPAStudentCpa);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textScore, studentGetStudentScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTScore, studentGetTScoreStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textWarning, studentWarningLevel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): student
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}