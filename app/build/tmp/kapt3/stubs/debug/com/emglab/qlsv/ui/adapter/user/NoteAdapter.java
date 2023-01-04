package com.emglab.qlsv.ui.adapter.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/user/NoteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/ui/adapter/user/NoteAdapter$ViewHolder;", "notes", "", "Lcom/emglab/qlsv/models/entity/Note;", "onItemClickListener", "Lcom/emglab/qlsv/ui/adapter/user/NoteAdapter$OnItemClickListener;", "(Ljava/util/List;Lcom/emglab/qlsv/ui/adapter/user/NoteAdapter$OnItemClickListener;)V", "getNotes", "()Ljava/util/List;", "setNotes", "(Ljava/util/List;)V", "getOnItemClickListener", "()Lcom/emglab/qlsv/ui/adapter/user/NoteAdapter$OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClickListener", "ViewHolder", "app_debug"})
public final class NoteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.ui.adapter.user.NoteAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.emglab.qlsv.models.entity.Note> notes;
    @org.jetbrains.annotations.NotNull()
    private final com.emglab.qlsv.ui.adapter.user.NoteAdapter.OnItemClickListener onItemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.ui.adapter.user.NoteAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.user.NoteAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.Note> getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Note> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.ui.adapter.user.NoteAdapter.OnItemClickListener getOnItemClickListener() {
        return null;
    }
    
    public NoteAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Note> notes, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.user.NoteAdapter.OnItemClickListener onItemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/user/NoteAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemNoteBinding;", "onItemClickListener", "Lcom/emglab/qlsv/ui/adapter/user/NoteAdapter$OnItemClickListener;", "(Lcom/emglab/qlsv/databinding/ListItemNoteBinding;Lcom/emglab/qlsv/ui/adapter/user/NoteAdapter$OnItemClickListener;)V", "getBinding", "()Lcom/emglab/qlsv/databinding/ListItemNoteBinding;", "getOnItemClickListener", "()Lcom/emglab/qlsv/ui/adapter/user/NoteAdapter$OnItemClickListener;", "bindView", "", "note", "Lcom/emglab/qlsv/models/entity/Note;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.databinding.ListItemNoteBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.ui.adapter.user.NoteAdapter.OnItemClickListener onItemClickListener = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.Note note) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.databinding.ListItemNoteBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.ui.adapter.user.NoteAdapter.OnItemClickListener getOnItemClickListener() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemNoteBinding binding, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.ui.adapter.user.NoteAdapter.OnItemClickListener onItemClickListener) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/user/NoteAdapter$OnItemClickListener;", "", "onLongClick", "", "note", "Lcom/emglab/qlsv/models/entity/Note;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onLongClick(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.Note note);
    }
}