package com.emglab.qlsv.ui.adapter.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/user/MessageAdapter;", "Lcom/emglab/qlsv/common/DataBoundListAdapter;", "Lcom/emglab/qlsv/models/entity/Message;", "Lcom/emglab/qlsv/databinding/ListItemMessageBinding;", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "itemClick", "Lkotlin/Function1;", "", "(Lcom/emglab/qlsv/common/AppExecutors;Lkotlin/jvm/functions/Function1;)V", "getAppExecutors", "()Lcom/emglab/qlsv/common/AppExecutors;", "setAppExecutors", "(Lcom/emglab/qlsv/common/AppExecutors;)V", "bind", "binding", "item", "createBinding", "parent", "Landroid/view/ViewGroup;", "app_debug"})
public final class MessageAdapter extends com.emglab.qlsv.common.DataBoundListAdapter<com.emglab.qlsv.models.entity.Message, com.emglab.qlsv.databinding.ListItemMessageBinding> {
    @org.jetbrains.annotations.NotNull()
    private com.emglab.qlsv.common.AppExecutors appExecutors;
    private final kotlin.jvm.functions.Function1<com.emglab.qlsv.models.entity.Message, kotlin.Unit> itemClick = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.emglab.qlsv.databinding.ListItemMessageBinding createBinding(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    protected void bind(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.databinding.ListItemMessageBinding binding, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Message item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.common.AppExecutors getAppExecutors() {
        return null;
    }
    
    public final void setAppExecutors(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors p0) {
    }
    
    public MessageAdapter(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors appExecutors, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.emglab.qlsv.models.entity.Message, kotlin.Unit> itemClick) {
        super(null, null);
    }
}