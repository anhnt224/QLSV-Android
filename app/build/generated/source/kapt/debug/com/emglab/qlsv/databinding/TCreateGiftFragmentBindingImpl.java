package com.emglab.qlsv.databinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TCreateGiftFragmentBindingImpl extends TCreateGiftFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(45);
        sIncludes.setIncludes(0, 
            new String[] {"loading_action_state"},
            new int[] {11},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sIncludes.setIncludes(2, 
            new String[] {"loading_action_state"},
            new int[] {8},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sIncludes.setIncludes(4, 
            new String[] {"loading_action_state"},
            new int[] {9},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sIncludes.setIncludes(6, 
            new String[] {"loading_action_state"},
            new int[] {10},
            new int[] {com.emglab.qlsv.R.layout.loading_action_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.giftNameLayout, 12);
        sViewsWithIds.put(R.id.giftName, 13);
        sViewsWithIds.put(R.id.giftTypeLayout, 14);
        sViewsWithIds.put(R.id.giftTypeTextView, 15);
        sViewsWithIds.put(R.id.giftQuantityLayout, 16);
        sViewsWithIds.put(R.id.giftQuantity, 17);
        sViewsWithIds.put(R.id.deadlineLayout, 18);
        sViewsWithIds.put(R.id.deadLineEditText, 19);
        sViewsWithIds.put(R.id.giftDescriptionLayout, 20);
        sViewsWithIds.put(R.id.giftDescription, 21);
        sViewsWithIds.put(R.id.image1, 22);
        sViewsWithIds.put(R.id.deleteImage1, 23);
        sViewsWithIds.put(R.id.image2, 24);
        sViewsWithIds.put(R.id.deleteImage2, 25);
        sViewsWithIds.put(R.id.image3, 26);
        sViewsWithIds.put(R.id.deleteImage3, 27);
        sViewsWithIds.put(R.id.addImage, 28);
        sViewsWithIds.put(R.id.addressLayout, 29);
        sViewsWithIds.put(R.id.receiveAddress, 30);
        sViewsWithIds.put(R.id.deliveryEnableCheckBox, 31);
        sViewsWithIds.put(R.id.timeStartLayout, 32);
        sViewsWithIds.put(R.id.timeStartEditText, 33);
        sViewsWithIds.put(R.id.dateStartLayout, 34);
        sViewsWithIds.put(R.id.dateStartEditText, 35);
        sViewsWithIds.put(R.id.fullNameLayout, 36);
        sViewsWithIds.put(R.id.fullName, 37);
        sViewsWithIds.put(R.id.emailLayout, 38);
        sViewsWithIds.put(R.id.email, 39);
        sViewsWithIds.put(R.id.phoneLayout, 40);
        sViewsWithIds.put(R.id.phoneNumber, 41);
        sViewsWithIds.put(R.id.facebookLayout, 42);
        sViewsWithIds.put(R.id.facbook, 43);
        sViewsWithIds.put(R.id.createGift, 44);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView01;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView21;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView4;
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView41;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView6;
    @Nullable
    private final com.emglab.qlsv.databinding.LoadingActionStateBinding mboundView61;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TCreateGiftFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 45, sIncludes, sViewsWithIds));
    }
    private TCreateGiftFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[28]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[29]
            , (com.google.android.material.button.MaterialButton) bindings[44]
            , (com.google.android.material.textfield.TextInputEditText) bindings[35]
            , (com.google.android.material.textfield.TextInputLayout) bindings[34]
            , (com.google.android.material.textfield.TextInputEditText) bindings[19]
            , (com.google.android.material.textfield.TextInputLayout) bindings[18]
            , (com.google.android.material.button.MaterialButton) bindings[23]
            , (com.google.android.material.button.MaterialButton) bindings[25]
            , (com.google.android.material.button.MaterialButton) bindings[27]
            , (android.widget.CheckBox) bindings[31]
            , (com.google.android.material.textfield.TextInputEditText) bindings[39]
            , (com.google.android.material.textfield.TextInputLayout) bindings[38]
            , (com.google.android.material.textfield.TextInputEditText) bindings[43]
            , (com.google.android.material.textfield.TextInputLayout) bindings[42]
            , (com.google.android.material.textfield.TextInputEditText) bindings[37]
            , (com.google.android.material.textfield.TextInputLayout) bindings[36]
            , (com.google.android.material.textfield.TextInputEditText) bindings[21]
            , (com.google.android.material.textfield.TextInputLayout) bindings[20]
            , (com.google.android.material.textfield.TextInputEditText) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[17]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (android.widget.AutoCompleteTextView) bindings[15]
            , (android.widget.ImageView) bindings[22]
            , (androidx.cardview.widget.CardView) bindings[1]
            , (android.widget.ImageView) bindings[24]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (android.widget.ImageView) bindings[26]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[40]
            , (com.google.android.material.textfield.TextInputEditText) bindings[41]
            , (com.google.android.material.textfield.TextInputEditText) bindings[30]
            , (com.google.android.material.textfield.TextInputEditText) bindings[33]
            , (com.google.android.material.textfield.TextInputLayout) bindings[32]
            );
        this.addImageLayout.setTag(null);
        this.image1Layout.setTag(null);
        this.image2Layout.setTag(null);
        this.image3Layout.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[11];
        setContainedBinding(this.mboundView01);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView21 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[8];
        setContainedBinding(this.mboundView21);
        this.mboundView4 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView41 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[9];
        setContainedBinding(this.mboundView41);
        this.mboundView6 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView61 = (com.emglab.qlsv.databinding.LoadingActionStateBinding) bindings[10];
        setContainedBinding(this.mboundView61);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        mboundView21.invalidateAll();
        mboundView41.invalidateAll();
        mboundView61.invalidateAll();
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
        if (mboundView21.hasPendingBindings()) {
            return true;
        }
        if (mboundView41.hasPendingBindings()) {
            return true;
        }
        if (mboundView61.hasPendingBindings()) {
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
        else if (BR.uploadImage3 == variableId) {
            setUploadImage3((com.emglab.qlsv.common.Status) variable);
        }
        else if (BR.imagePaths == variableId) {
            setImagePaths((java.util.List<java.lang.String>) variable);
        }
        else if (BR.uploadImage2 == variableId) {
            setUploadImage2((com.emglab.qlsv.common.Status) variable);
        }
        else if (BR.uploadImage1 == variableId) {
            setUploadImage1((com.emglab.qlsv.common.Status) variable);
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
    public void setUploadImage3(@Nullable com.emglab.qlsv.common.Status UploadImage3) {
        this.mUploadImage3 = UploadImage3;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.uploadImage3);
        super.requestRebind();
    }
    public void setImagePaths(@Nullable java.util.List<java.lang.String> ImagePaths) {
        this.mImagePaths = ImagePaths;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.imagePaths);
        super.requestRebind();
    }
    public void setUploadImage2(@Nullable com.emglab.qlsv.common.Status UploadImage2) {
        this.mUploadImage2 = UploadImage2;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.uploadImage2);
        super.requestRebind();
    }
    public void setUploadImage1(@Nullable com.emglab.qlsv.common.Status UploadImage1) {
        this.mUploadImage1 = UploadImage1;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.uploadImage1);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView21.setLifecycleOwner(lifecycleOwner);
        mboundView41.setLifecycleOwner(lifecycleOwner);
        mboundView61.setLifecycleOwner(lifecycleOwner);
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
        boolean imagePaths2IsEmpty = false;
        boolean ImagePaths2IsEmpty1 = false;
        com.emglab.qlsv.common.Status status = mStatus;
        java.lang.String imagePaths2 = null;
        com.emglab.qlsv.common.Status uploadImage3 = mUploadImage3;
        java.util.List<java.lang.String> imagePaths = mImagePaths;
        boolean imagePaths1IsEmpty = false;
        boolean imagePaths0IsEmptyBooleanTrueImagePaths1IsEmpty = false;
        boolean imagePaths0IsEmpty = false;
        boolean ImagePaths0IsEmpty1 = false;
        java.lang.String imagePaths1 = null;
        boolean imagePaths0IsEmptyBooleanTrueImagePaths1IsEmptyBooleanTrueImagePaths2IsEmpty = false;
        com.emglab.qlsv.common.Status uploadImage2 = mUploadImage2;
        java.lang.String imagePaths0 = null;
        com.emglab.qlsv.common.Status uploadImage1 = mUploadImage1;
        boolean ImagePaths1IsEmpty1 = false;

        if ((dirtyFlags & 0x21L) != 0) {
        }
        if ((dirtyFlags & 0x22L) != 0) {
        }
        if ((dirtyFlags & 0x24L) != 0) {



                if (imagePaths != null) {
                    // read imagePaths[2]
                    imagePaths2 = getFromList(imagePaths, 2);
                    // read imagePaths[1]
                    imagePaths1 = getFromList(imagePaths, 1);
                    // read imagePaths[0]
                    imagePaths0 = getFromList(imagePaths, 0);
                }


                if (imagePaths2 != null) {
                    // read imagePaths[2].isEmpty()
                    imagePaths2IsEmpty = imagePaths2.isEmpty();
                }
                if (imagePaths1 != null) {
                    // read imagePaths[1].isEmpty()
                    ImagePaths1IsEmpty1 = imagePaths1.isEmpty();
                }
                if (imagePaths0 != null) {
                    // read imagePaths[0].isEmpty()
                    ImagePaths0IsEmpty1 = imagePaths0.isEmpty();
                }
            if((dirtyFlags & 0x24L) != 0) {
                if(ImagePaths0IsEmpty1) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read !imagePaths[2].isEmpty()
                ImagePaths2IsEmpty1 = !imagePaths2IsEmpty;
                // read !imagePaths[1].isEmpty()
                imagePaths1IsEmpty = !ImagePaths1IsEmpty1;
                // read !imagePaths[0].isEmpty()
                imagePaths0IsEmpty = !ImagePaths0IsEmpty1;
        }
        if ((dirtyFlags & 0x28L) != 0) {
        }
        if ((dirtyFlags & 0x30L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x24L) != 0) {

                // read imagePaths[0].isEmpty() ? true : imagePaths[1].isEmpty()
                imagePaths0IsEmptyBooleanTrueImagePaths1IsEmpty = ((ImagePaths0IsEmpty1) ? (true) : (ImagePaths1IsEmpty1));
            if((dirtyFlags & 0x24L) != 0) {
                if(imagePaths0IsEmptyBooleanTrueImagePaths1IsEmpty) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x24L) != 0) {

                // read imagePaths[0].isEmpty() ? true : imagePaths[1].isEmpty() ? true : imagePaths[2].isEmpty()
                imagePaths0IsEmptyBooleanTrueImagePaths1IsEmptyBooleanTrueImagePaths2IsEmpty = ((imagePaths0IsEmptyBooleanTrueImagePaths1IsEmpty) ? (true) : (imagePaths2IsEmpty));
        }
        // batch finished
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.addImageLayout, imagePaths0IsEmptyBooleanTrueImagePaths1IsEmptyBooleanTrueImagePaths2IsEmpty);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.image1Layout, imagePaths0IsEmpty);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.image2Layout, imagePaths1IsEmpty);
            com.emglab.qlsv.binding.BindingAdapterKt.goneUnless(this.image3Layout, ImagePaths2IsEmpty1);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            this.mboundView01.setStatus(status);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.mboundView21.setStatus(uploadImage1);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.mboundView41.setStatus(uploadImage2);
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            this.mboundView61.setStatus(uploadImage3);
        }
        executeBindingsOn(mboundView21);
        executeBindingsOn(mboundView41);
        executeBindingsOn(mboundView61);
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): status
        flag 1 (0x2L): uploadImage3
        flag 2 (0x3L): imagePaths
        flag 3 (0x4L): uploadImage2
        flag 4 (0x5L): uploadImage1
        flag 5 (0x6L): null
        flag 6 (0x7L): imagePaths[0].isEmpty() ? true : imagePaths[1].isEmpty()
        flag 7 (0x8L): imagePaths[0].isEmpty() ? true : imagePaths[1].isEmpty()
        flag 8 (0x9L): imagePaths[0].isEmpty() ? true : imagePaths[1].isEmpty() ? true : imagePaths[2].isEmpty()
        flag 9 (0xaL): imagePaths[0].isEmpty() ? true : imagePaths[1].isEmpty() ? true : imagePaths[2].isEmpty()
    flag mapping end*/
    //end
}