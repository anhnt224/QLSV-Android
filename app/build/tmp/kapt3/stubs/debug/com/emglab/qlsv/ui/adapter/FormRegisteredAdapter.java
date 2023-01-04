package com.emglab.qlsv.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dBA\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/FormRegisteredAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/ui/adapter/FormRegisteredAdapter$ViewHolder;", "forms", "Ljava/util/ArrayList;", "Lcom/emglab/qlsv/models/entity/Form;", "Lkotlin/collections/ArrayList;", "onItemClickListener", "Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "onItemLongClickListener", "Lcom/emglab/qlsv/ui/adapter/OnItemLongClickListener;", "onButtonItemClick", "Lcom/emglab/qlsv/ui/adapter/FormRegisteredAdapter$OnButtonItemClick;", "(Ljava/util/ArrayList;Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;Lcom/emglab/qlsv/ui/adapter/OnItemLongClickListener;Lcom/emglab/qlsv/ui/adapter/FormRegisteredAdapter$OnButtonItemClick;)V", "getForms", "()Ljava/util/ArrayList;", "setForms", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnButtonItemClick", "ViewHolder", "app_debug"})
public final class FormRegisteredAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.ui.adapter.FormRegisteredAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.emglab.qlsv.models.entity.Form> forms;
    private final com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Form> onItemClickListener = null;
    private final com.emglab.qlsv.ui.adapter.OnItemLongClickListener<com.emglab.qlsv.models.entity.Form> onItemLongClickListener = null;
    private final com.emglab.qlsv.ui.adapter.FormRegisteredAdapter.OnButtonItemClick onButtonItemClick = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.ui.adapter.FormRegisteredAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.FormRegisteredAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.emglab.qlsv.models.entity.Form> getForms() {
        return null;
    }
    
    public final void setForms(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.emglab.qlsv.models.entity.Form> p0) {
    }
    
    public FormRegisteredAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.emglab.qlsv.models.entity.Form> forms, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Form> onItemClickListener, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.OnItemLongClickListener<com.emglab.qlsv.models.entity.Form> onItemLongClickListener, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.FormRegisteredAdapter.OnButtonItemClick onButtonItemClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/FormRegisteredAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemFormRegisteredBinding;", "onItemClickListener", "Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "Lcom/emglab/qlsv/models/entity/Form;", "onItemLongClickListener", "Lcom/emglab/qlsv/ui/adapter/OnItemLongClickListener;", "onButtonItemClick", "Lcom/emglab/qlsv/ui/adapter/FormRegisteredAdapter$OnButtonItemClick;", "(Lcom/emglab/qlsv/databinding/ListItemFormRegisteredBinding;Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;Lcom/emglab/qlsv/ui/adapter/OnItemLongClickListener;Lcom/emglab/qlsv/ui/adapter/FormRegisteredAdapter$OnButtonItemClick;)V", "getBinding", "()Lcom/emglab/qlsv/databinding/ListItemFormRegisteredBinding;", "bindView", "", "form", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.databinding.ListItemFormRegisteredBinding binding = null;
        private final com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Form> onItemClickListener = null;
        private final com.emglab.qlsv.ui.adapter.OnItemLongClickListener<com.emglab.qlsv.models.entity.Form> onItemLongClickListener = null;
        private final com.emglab.qlsv.ui.adapter.FormRegisteredAdapter.OnButtonItemClick onButtonItemClick = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.Form form) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.databinding.ListItemFormRegisteredBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemFormRegisteredBinding binding, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.Form> onItemClickListener, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.ui.adapter.OnItemLongClickListener<com.emglab.qlsv.models.entity.Form> onItemLongClickListener, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.ui.adapter.FormRegisteredAdapter.OnButtonItemClick onButtonItemClick) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/FormRegisteredAdapter$OnButtonItemClick;", "", "onButtonRatingClick", "", "form", "Lcom/emglab/qlsv/models/entity/Form;", "app_debug"})
    public static abstract interface OnButtonItemClick {
        
        public abstract void onButtonRatingClick(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.Form form);
    }
}