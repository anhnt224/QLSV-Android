package com.emglab.qlsv.modules.searchMotel.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0016\u0010\u0013\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/emglab/qlsv/modules/searchMotel/adapter/MotelRegistrationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/modules/searchMotel/adapter/MotelRegistrationAdapter$ViewHolder;", "motelRegistrationList", "", "Lcom/emglab/qlsv/modules/searchMotel/model/MotelRegistration;", "listener", "Lcom/emglab/qlsv/modules/searchMotel/adapter/MotelRegistrationListener;", "(Ljava/util/List;Lcom/emglab/qlsv/modules/searchMotel/adapter/MotelRegistrationListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "ViewHolder", "app_debug"})
public final class MotelRegistrationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.modules.searchMotel.adapter.MotelRegistrationAdapter.ViewHolder> {
    private java.util.List<com.emglab.qlsv.modules.searchMotel.model.MotelRegistration> motelRegistrationList;
    private final com.emglab.qlsv.modules.searchMotel.adapter.MotelRegistrationListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.modules.searchMotel.adapter.MotelRegistrationAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.modules.searchMotel.adapter.MotelRegistrationAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.modules.searchMotel.model.MotelRegistration> motelRegistrationList) {
    }
    
    public MotelRegistrationAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.modules.searchMotel.model.MotelRegistration> motelRegistrationList, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.modules.searchMotel.adapter.MotelRegistrationListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/emglab/qlsv/modules/searchMotel/adapter/MotelRegistrationAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/MotelRegistrationItemBinding;", "listener", "Lcom/emglab/qlsv/modules/searchMotel/adapter/MotelRegistrationListener;", "(Lcom/emglab/qlsv/modules/searchMotel/adapter/MotelRegistrationAdapter;Lcom/emglab/qlsv/databinding/MotelRegistrationItemBinding;Lcom/emglab/qlsv/modules/searchMotel/adapter/MotelRegistrationListener;)V", "bindView", "", "motelRegistration", "Lcom/emglab/qlsv/modules/searchMotel/model/MotelRegistration;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.emglab.qlsv.databinding.MotelRegistrationItemBinding binding = null;
        private final com.emglab.qlsv.modules.searchMotel.adapter.MotelRegistrationListener listener = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.modules.searchMotel.model.MotelRegistration motelRegistration) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.MotelRegistrationItemBinding binding, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.modules.searchMotel.adapter.MotelRegistrationListener listener) {
            super(null);
        }
    }
}