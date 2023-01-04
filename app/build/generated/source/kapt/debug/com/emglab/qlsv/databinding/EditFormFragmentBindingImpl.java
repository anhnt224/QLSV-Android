package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EditFormFragmentBindingImpl extends EditFormFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(0, 
            new String[] {"loading_action_state"},
            new int[] {4},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout, 5);
        sViewsWithIds.put(R.id.progressBar, 6);
        sViewsWithIds.put(R.id.textProgress, 7);
        sViewsWithIds.put(R.id.buttonUpdate, 8);
        sViewsWithIds.put(R.id.textQuestion, 9);
        sViewsWithIds.put(R.id.layoutCheckBox, 10);
        sViewsWithIds.put(R.id.layoutSingleChoice, 11);
        sViewsWithIds.put(R.id.linearLayout10, 12);
        sViewsWithIds.put(R.id.buttonPrev, 13);
        sViewsWithIds.put(R.id.buttonNext, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView01;
    @NonNull
    private final android.widget.ScrollView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EditFormFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private EditFormFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[14]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.RadioGroup) bindings[11]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.ProgressBar) bindings[6]
            , (android.widget.ScrollView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            );
        this.layoutParagraph.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[4];
        setContainedBinding(this.mboundView01);
        this.mboundView2 = (android.widget.ScrollView) bindings[2];
        this.mboundView2.setTag(null);
        this.scrollView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.questionType == variableId) {
            setQuestionType((com.emglab.qlsv.models.entity.QuestionType) variable);
        }
        else if (BR.resource == variableId) {
            setResource((com.emglab.qlsv.common.Resource) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuestionType(@Nullable com.emglab.qlsv.models.entity.QuestionType QuestionType) {
        this.mQuestionType = QuestionType;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.questionType);
        super.requestRebind();
    }
    public void setResource(@Nullable com.emglab.qlsv.common.Resource Resource) {
        this.mResource = Resource;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.resource);
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
        boolean questionTypeQuestionTypeSINGLECHOICE = false;
        boolean questionTypeQuestionTypeCHECKBOX = false;
        com.emglab.qlsv.common.Status resourceStatus = null;
        com.emglab.qlsv.models.entity.QuestionType questionType = mQuestionType;
        boolean questionTypeQuestionTypePARAGRAPH = false;
        com.emglab.qlsv.common.Resource<?> resource = mResource;

        if ((dirtyFlags & 0x5L) != 0) {



                // read questionType == QuestionType.SINGLE_CHOICE
                questionTypeQuestionTypeSINGLECHOICE = (questionType) == (com.emglab.qlsv.models.entity.QuestionType.SINGLE_CHOICE);
                // read questionType == QuestionType.CHECK_BOX
                questionTypeQuestionTypeCHECKBOX = (questionType) == (com.emglab.qlsv.models.entity.QuestionType.CHECK_BOX);
                // read questionType == QuestionType.PARAGRAPH
                questionTypeQuestionTypePARAGRAPH = (questionType) == (com.emglab.qlsv.models.entity.QuestionType.PARAGRAPH);
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (resource != null) {
                    // read resource.status
                    resourceStatus = resource.getStatus();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.layoutParagraph, questionTypeQuestionTypePARAGRAPH);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView2, questionTypeQuestionTypeSINGLECHOICE);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.scrollView3, questionTypeQuestionTypeCHECKBOX);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView01.setStatus(resourceStatus);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): questionType
        flag 1 (0x2L): resource
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}