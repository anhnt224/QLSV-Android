package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemFormRegisteredBindingImpl extends ListItemFormRegisteredBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView12, 7);
        sViewsWithIds.put(R.id.linearLayout7, 8);
        sViewsWithIds.put(R.id.linearLayout8, 9);
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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemFormRegisteredBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ListItemFormRegisteredBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.RatingBar) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.buttonRate.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.ratingBar.setTag(null);
        this.textStatus.setTag(null);
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
        if (BR.form == variableId) {
            setForm((com.emglab.qlsv.models.entity.Form) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setForm(@Nullable com.emglab.qlsv.models.entity.Form Form) {
        this.mForm = Form;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.form);
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
        java.lang.String formDescription = null;
        java.lang.String formTimeCreate = null;
        int formRating = 0;
        java.lang.String formGetStatusStr = null;
        boolean formHasNote = false;
        boolean formIsRating = false;
        com.emglab.qlsv.models.entity.Form form = mForm;
        boolean formIsRated = false;
        java.lang.String formNote = null;
        java.lang.String javaLangStringGhiChFormNote = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (form != null) {
                    // read form.description
                    formDescription = form.getDescription();
                    // read form.timeCreate
                    formTimeCreate = form.getTimeCreate();
                    // read form.rating
                    formRating = form.getRating();
                    // read form.getStatusStr()
                    formGetStatusStr = form.getStatusStr();
                    // read form.hasNote()
                    formHasNote = form.hasNote();
                    // read form.isRating()
                    formIsRating = form.isRating();
                    // read form.isRated()
                    formIsRated = form.isRated();
                    // read form.note
                    formNote = form.getNote();
                }


                // read ("Ghi chú: ") + (form.note)
                javaLangStringGhiChFormNote = ("Ghi chú: ") + (formNote);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.buttonRate, formIsRating);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, formDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, formTimeCreate);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.mboundView3, formHasNote);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, javaLangStringGhiChFormNote);
            androidx.databinding.adapters.RatingBarBindingAdapter.setRating(this.ratingBar, formRating);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.ratingBar, formIsRated);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textStatus, formGetStatusStr);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): form
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}