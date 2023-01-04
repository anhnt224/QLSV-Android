package com.emglab.qlsv.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/ImageMotelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/ui/adapter/ImageMotelAdapter$ViewHolder;", "images", "", "Lcom/emglab/qlsv/models/entity/ImageMotel;", "onItemClickListener", "Lcom/emglab/qlsv/ui/adapter/ImageMotelAdapter$OnItemClickListener;", "(Ljava/util/List;Lcom/emglab/qlsv/ui/adapter/ImageMotelAdapter$OnItemClickListener;)V", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClickListener", "ViewHolder", "app_debug"})
public final class ImageMotelAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.ui.adapter.ImageMotelAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.emglab.qlsv.models.entity.ImageMotel> images;
    private final com.emglab.qlsv.ui.adapter.ImageMotelAdapter.OnItemClickListener onItemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.ui.adapter.ImageMotelAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.ImageMotelAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.ImageMotel> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.ImageMotel> p0) {
    }
    
    public ImageMotelAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.ImageMotel> images, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.ImageMotelAdapter.OnItemClickListener onItemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/ImageMotelAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemImageMotelBinding;", "onItemClickListener", "Lcom/emglab/qlsv/ui/adapter/ImageMotelAdapter$OnItemClickListener;", "(Lcom/emglab/qlsv/databinding/ListItemImageMotelBinding;Lcom/emglab/qlsv/ui/adapter/ImageMotelAdapter$OnItemClickListener;)V", "getBinding", "()Lcom/emglab/qlsv/databinding/ListItemImageMotelBinding;", "takePhotoHelper", "Lcom/emglab/qlsv/helper/TakePhotoHelper;", "bindView", "", "image", "Lcom/emglab/qlsv/models/entity/ImageMotel;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.emglab.qlsv.helper.TakePhotoHelper takePhotoHelper;
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.databinding.ListItemImageMotelBinding binding = null;
        private final com.emglab.qlsv.ui.adapter.ImageMotelAdapter.OnItemClickListener onItemClickListener = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.ImageMotel image) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.databinding.ListItemImageMotelBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemImageMotelBinding binding, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.ui.adapter.ImageMotelAdapter.OnItemClickListener onItemClickListener) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/ImageMotelAdapter$OnItemClickListener;", "", "onClick", "", "image", "Lcom/emglab/qlsv/models/entity/ImageMotel;", "retryUploadImage", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.ImageMotel image);
        
        public abstract void retryUploadImage(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.ImageMotel image);
    }
}