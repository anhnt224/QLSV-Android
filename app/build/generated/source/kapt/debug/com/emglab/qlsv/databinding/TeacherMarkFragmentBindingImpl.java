package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TeacherMarkFragmentBindingImpl extends TeacherMarkFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(19);
        sIncludes.setIncludes(0, 
            new String[] {"loading_action_state"},
            new int[] {6},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sIncludes.setIncludes(1, 
            new String[] {"loading_action_state"},
            new int[] {5},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView3, 7);
        sViewsWithIds.put(R.id.buttonSemester, 8);
        sViewsWithIds.put(R.id.textSumSPoint, 9);
        sViewsWithIds.put(R.id.textSumTPoint, 10);
        sViewsWithIds.put(R.id.buttonPrev, 11);
        sViewsWithIds.put(R.id.buttonNext, 12);
        sViewsWithIds.put(R.id.recyclerView, 13);
        sViewsWithIds.put(R.id.buttonSave, 14);
        sViewsWithIds.put(R.id.layoutProof, 15);
        sViewsWithIds.put(R.id.textView8, 16);
        sViewsWithIds.put(R.id.buttonClose, 17);
        sViewsWithIds.put(R.id.recyclerViewCiteriaActivity, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView01;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView11;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TeacherMarkFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private TeacherMarkFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[17]
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[14]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[16]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[6];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[5];
        setContainedBinding(this.mboundView11);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.textCriteriaTypePoint.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        mboundView11.invalidateAll();
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
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        if (mboundView01.hasPendingBindings()) {
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
        else if (BR.status2 == variableId) {
            setStatus2((com.emglab.qlsv.common.Status) variable);
        }
        else if (BR.criteriaType == variableId) {
            setCriteriaType((com.emglab.qlsv.models.entity.CriteriaType) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStatus(@Nullable com.emglab.qlsv.common.Status Status) {
        this.mStatus = Status;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.status);
        super.requestRebind();
    }
    public void setStatus2(@Nullable com.emglab.qlsv.common.Status Status2) {
        this.mStatus2 = Status2;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.status2);
        super.requestRebind();
    }
    public void setCriteriaType(@Nullable com.emglab.qlsv.models.entity.CriteriaType CriteriaType) {
        this.mCriteriaType = CriteriaType;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.criteriaType);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
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
        com.emglab.qlsv.common.Status status = mStatus;
        int criteriaTypeTPoint = 0;
        int criteriaTypeMaxPoint = 0;
        int criteriaTypeGetStudentPoint = 0;
        java.lang.String javaLangStringSVCriteriaTypeGetStudentPointJavaLangString = null;
        com.emglab.qlsv.common.Status status2 = mStatus2;
        java.lang.String javaLangStringGVCriteriaTypeTPoint = null;
        java.lang.String javaLangStringSVCriteriaTypeGetStudentPointJavaLangStringCriteriaTypeMaxPoint = null;
        java.lang.String javaLangStringGVCriteriaTypeTPointJavaLangStringCriteriaTypeMaxPoint = null;
        java.lang.String javaLangStringGVCriteriaTypeTPointJavaLangString = null;
        com.emglab.qlsv.models.entity.CriteriaType criteriaType = mCriteriaType;
        java.lang.String criteriaTypeName = null;
        java.lang.String javaLangStringSVCriteriaTypeGetStudentPoint = null;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (criteriaType != null) {
                    // read criteriaType.tPoint
                    criteriaTypeTPoint = criteriaType.getTPoint();
                    // read criteriaType.maxPoint
                    criteriaTypeMaxPoint = criteriaType.getMaxPoint();
                    // read criteriaType.getStudentPoint()
                    criteriaTypeGetStudentPoint = criteriaType.getStudentPoint();
                    // read criteriaType.name
                    criteriaTypeName = criteriaType.getName();
                }


                // read ("GV: ") + (criteriaType.tPoint)
                javaLangStringGVCriteriaTypeTPoint = ("GV: ") + (criteriaTypeTPoint);
                // read ("SV: ") + (criteriaType.getStudentPoint())
                javaLangStringSVCriteriaTypeGetStudentPoint = ("SV: ") + (criteriaTypeGetStudentPoint);


                // read (("GV: ") + (criteriaType.tPoint)) + ("/")
                javaLangStringGVCriteriaTypeTPointJavaLangString = (javaLangStringGVCriteriaTypeTPoint) + ("/");
                // read (("SV: ") + (criteriaType.getStudentPoint())) + ("/")
                javaLangStringSVCriteriaTypeGetStudentPointJavaLangString = (javaLangStringSVCriteriaTypeGetStudentPoint) + ("/");


                // read ((("GV: ") + (criteriaType.tPoint)) + ("/")) + (criteriaType.maxPoint)
                javaLangStringGVCriteriaTypeTPointJavaLangStringCriteriaTypeMaxPoint = (javaLangStringGVCriteriaTypeTPointJavaLangString) + (criteriaTypeMaxPoint);
                // read ((("SV: ") + (criteriaType.getStudentPoint())) + ("/")) + (criteriaType.maxPoint)
                javaLangStringSVCriteriaTypeGetStudentPointJavaLangStringCriteriaTypeMaxPoint = (javaLangStringSVCriteriaTypeGetStudentPointJavaLangString) + (criteriaTypeMaxPoint);
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.mboundView01.setStatus(status2);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView11.setStatus(status);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, criteriaTypeName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, javaLangStringSVCriteriaTypeGetStudentPointJavaLangStringCriteriaTypeMaxPoint);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textCriteriaTypePoint, javaLangStringGVCriteriaTypeTPointJavaLangStringCriteriaTypeMaxPoint);
        }
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): status2
        flag 2 (0x3L): criteriaType
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}