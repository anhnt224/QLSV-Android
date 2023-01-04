package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemFormQuestionBindingImpl extends ListItemFormQuestionBinding  {

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
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemFormQuestionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ListItemFormQuestionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
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
        if (BR.index == variableId) {
            setIndex((java.lang.Integer) variable);
        }
        else if (BR.question == variableId) {
            setQuestion((com.emglab.qlsv.models.entity.Question) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIndex(@Nullable java.lang.Integer Index) {
        this.mIndex = Index;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.index);
        super.requestRebind();
    }
    public void setQuestion(@Nullable com.emglab.qlsv.models.entity.Question Question) {
        this.mQuestion = Question;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.question);
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
        java.lang.String indexToString = null;
        java.lang.String javaLangStringQuestionAnswer = null;
        java.lang.String indexToStringJavaLangString = null;
        java.lang.String questionAnswer = null;
        java.lang.Integer index = mIndex;
        com.emglab.qlsv.models.entity.Question question = mQuestion;
        java.lang.String indexToStringJavaLangStringQuestionQuestion = null;
        java.lang.String questionQuestion = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (index != null) {
                    // read index.toString()
                    indexToString = index.toString();
                }
                if (question != null) {
                    // read question.question
                    questionQuestion = question.getQuestion();
                }


                // read (index.toString()) + (". ")
                indexToStringJavaLangString = (indexToString) + (". ");


                // read ((index.toString()) + (". ")) + (question.question)
                indexToStringJavaLangStringQuestionQuestion = (indexToStringJavaLangString) + (questionQuestion);
            if ((dirtyFlags & 0x6L) != 0) {

                    if (question != null) {
                        // read question.answer
                        questionAnswer = question.getAnswer();
                    }


                    // read ("- ") + (question.answer)
                    javaLangStringQuestionAnswer = ("- ") + (questionAnswer);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, indexToStringJavaLangStringQuestionQuestion);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, javaLangStringQuestionAnswer);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): index
        flag 1 (0x2L): question
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}