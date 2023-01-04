package com.emglab.qlsv.ui.adapter.running;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u00a2\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R,\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/running/ListRunResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/ui/adapter/running/ListRunResultAdapter$ViewHolder;", "runResultMap", "", "", "", "Lcom/emglab/qlsv/models/entity/run/RunResult;", "(Ljava/util/Map;)V", "getRunResultMap", "()Ljava/util/Map;", "setRunResultMap", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ListRunResultAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.ui.adapter.running.ListRunResultAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, ? extends java.util.List<com.emglab.qlsv.models.entity.run.RunResult>> runResultMap;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.ui.adapter.running.ListRunResultAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.running.ListRunResultAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<com.emglab.qlsv.models.entity.run.RunResult>> getRunResultMap() {
        return null;
    }
    
    public final void setRunResultMap(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<com.emglab.qlsv.models.entity.run.RunResult>> p0) {
    }
    
    public ListRunResultAdapter(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<com.emglab.qlsv.models.entity.run.RunResult>> runResultMap) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/running/ListRunResultAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListRunResultItemBinding;", "(Lcom/emglab/qlsv/ui/adapter/running/ListRunResultAdapter;Lcom/emglab/qlsv/databinding/ListRunResultItemBinding;)V", "runResultAdapter", "Lcom/emglab/qlsv/ui/adapter/running/RunResultAdapter;", "bindView", "", "position", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.emglab.qlsv.ui.adapter.running.RunResultAdapter runResultAdapter;
        private final com.emglab.qlsv.databinding.ListRunResultItemBinding binding = null;
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bindView(int position) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListRunResultItemBinding binding) {
            super(null);
        }
    }
}