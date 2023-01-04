package com.emglab.qlsv.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/MotelInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/ui/adapter/MotelInfoAdapter$ViewHolder;", "listMotel", "", "Lcom/emglab/qlsv/models/entity/Motel;", "onItemMotelInfoClickListener", "Lcom/emglab/qlsv/ui/adapter/MotelInfoAdapter$OnItemMotelInfoClickListener;", "(Ljava/util/List;Lcom/emglab/qlsv/ui/adapter/MotelInfoAdapter$OnItemMotelInfoClickListener;)V", "getListMotel", "()Ljava/util/List;", "setListMotel", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemMotelInfoClickListener", "ViewHolder", "app_debug"})
public final class MotelInfoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.ui.adapter.MotelInfoAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.emglab.qlsv.models.entity.Motel> listMotel;
    private final com.emglab.qlsv.ui.adapter.MotelInfoAdapter.OnItemMotelInfoClickListener onItemMotelInfoClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.ui.adapter.MotelInfoAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.MotelInfoAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.Motel> getListMotel() {
        return null;
    }
    
    public final void setListMotel(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Motel> p0) {
    }
    
    public MotelInfoAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Motel> listMotel, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.MotelInfoAdapter.OnItemMotelInfoClickListener onItemMotelInfoClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/MotelInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemMotelInfoBinding;", "onItemMotelInfoClickListener", "Lcom/emglab/qlsv/ui/adapter/MotelInfoAdapter$OnItemMotelInfoClickListener;", "(Lcom/emglab/qlsv/databinding/ListItemMotelInfoBinding;Lcom/emglab/qlsv/ui/adapter/MotelInfoAdapter$OnItemMotelInfoClickListener;)V", "getBinding", "()Lcom/emglab/qlsv/databinding/ListItemMotelInfoBinding;", "bindView", "", "motel", "Lcom/emglab/qlsv/models/entity/Motel;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.databinding.ListItemMotelInfoBinding binding = null;
        private final com.emglab.qlsv.ui.adapter.MotelInfoAdapter.OnItemMotelInfoClickListener onItemMotelInfoClickListener = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.Motel motel) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.databinding.ListItemMotelInfoBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemMotelInfoBinding binding, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.ui.adapter.MotelInfoAdapter.OnItemMotelInfoClickListener onItemMotelInfoClickListener) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/MotelInfoAdapter$OnItemMotelInfoClickListener;", "", "navigateToMotelInfoDetailFragment", "", "motel", "Lcom/emglab/qlsv/models/entity/Motel;", "app_debug"})
    public static abstract interface OnItemMotelInfoClickListener {
        
        public abstract void navigateToMotelInfoDetailFragment(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.Motel motel);
    }
}