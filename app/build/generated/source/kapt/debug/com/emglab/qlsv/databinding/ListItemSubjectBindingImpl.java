package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemSubjectBindingImpl extends ListItemSubjectBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.header, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemSubjectBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ListItemSubjectBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textRoom.setTag(null);
        this.textTime.setTag(null);
        this.textTitle.setTag(null);
        this.textView11.setTag(null);
        this.textView13.setTag(null);
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
        if (BR.subject == variableId) {
            setSubject((com.emglab.qlsv.models.entity.Subject) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSubject(@Nullable com.emglab.qlsv.models.entity.Subject Subject) {
        this.mSubject = Subject;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.subject);
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
        java.lang.String subjectWeek = null;
        java.lang.String subjectType = null;
        java.lang.String subjectGetTitle = null;
        com.emglab.qlsv.models.entity.Subject subject = mSubject;
        java.lang.String subjectGetRoomStr = null;
        java.lang.String subjectGetTime = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (subject != null) {
                    // read subject.week
                    subjectWeek = subject.getWeek();
                    // read subject.type
                    subjectType = subject.getType();
                    // read subject.getTitle()
                    subjectGetTitle = subject.getTitle();
                    // read subject.getRoomStr()
                    subjectGetRoomStr = subject.getRoomStr();
                    // read subject.getTime()
                    subjectGetTime = subject.getTime();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textRoom, subjectGetRoomStr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTime, subjectGetTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTitle, subjectGetTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView11, subjectWeek);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView13, subjectType);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): subject
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}