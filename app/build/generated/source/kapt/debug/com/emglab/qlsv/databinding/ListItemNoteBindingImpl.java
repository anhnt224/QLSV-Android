package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemNoteBindingImpl extends ListItemNoteBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView4, 6);
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
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemNoteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ListItemNoteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[6]
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
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
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
        if (BR.note == variableId) {
            setNote((com.emglab.qlsv.models.entity.Note) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNote(@Nullable com.emglab.qlsv.models.entity.Note Note) {
        this.mNote = Note;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.note);
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
        com.emglab.qlsv.models.entity.Note note = mNote;
        java.lang.String noteGetDateCreated = null;
        java.lang.String noteGetTimeCreatedStr = null;
        java.lang.String noteGetMonthCreated = null;
        java.lang.String noteNote = null;
        java.lang.String noteCreateEmail = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (note != null) {
                    // read note.getDateCreated()
                    noteGetDateCreated = note.getDateCreated();
                    // read note.getTimeCreatedStr()
                    noteGetTimeCreatedStr = note.getTimeCreatedStr();
                    // read note.getMonthCreated()
                    noteGetMonthCreated = note.getMonthCreated();
                    // read note.note
                    noteNote = note.getNote();
                    // read note.createEmail
                    noteCreateEmail = note.getCreateEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, noteGetDateCreated);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, noteGetMonthCreated);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, noteNote);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, noteGetTimeCreatedStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, noteCreateEmail);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): note
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}