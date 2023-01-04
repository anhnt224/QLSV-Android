package com.emglab.qlsv.ui.adapter.job;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/job/JobApplyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/ui/adapter/job/JobApplyAdapter$ViewHolder;", "jobs", "", "Lcom/emglab/qlsv/models/entity/Job;", "onItemClickListener", "Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "(Ljava/util/List;Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;)V", "getJobs", "()Ljava/util/List;", "setJobs", "(Ljava/util/List;)V", "getOnItemClickListener", "()Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class JobApplyAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.ui.adapter.job.JobApplyAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.emglab.qlsv.models.entity.Job> jobs;
    @org.jetbrains.annotations.NotNull()
    private final com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Job> onItemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.ui.adapter.job.JobApplyAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.job.JobApplyAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.Job> getJobs() {
        return null;
    }
    
    public final void setJobs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Job> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Job> getOnItemClickListener() {
        return null;
    }
    
    public JobApplyAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Job> jobs, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Job> onItemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/job/JobApplyAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemJobApplyBinding;", "onItemClickListener", "Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "Lcom/emglab/qlsv/models/entity/Job;", "(Lcom/emglab/qlsv/databinding/ListItemJobApplyBinding;Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;)V", "getBinding", "()Lcom/emglab/qlsv/databinding/ListItemJobApplyBinding;", "getOnItemClickListener", "()Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "bindView", "", "job", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.databinding.ListItemJobApplyBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Job> onItemClickListener = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.Job job) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.databinding.ListItemJobApplyBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Job> getOnItemClickListener() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemJobApplyBinding binding, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Job> onItemClickListener) {
            super(null);
        }
    }
}