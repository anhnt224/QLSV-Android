package com.emglab.qlsv.ui.adapter.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/user/AddressAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/ui/adapter/user/AddressAdapter$ViewHolder;", "userAddresses", "Ljava/util/ArrayList;", "Lcom/emglab/qlsv/models/entity/UserAddress;", "Lkotlin/collections/ArrayList;", "onItemButtonClickListener", "Lcom/emglab/qlsv/ui/adapter/user/AddressAdapter$OnItemButtonClickListener;", "(Ljava/util/ArrayList;Lcom/emglab/qlsv/ui/adapter/user/AddressAdapter$OnItemButtonClickListener;)V", "getOnItemButtonClickListener", "()Lcom/emglab/qlsv/ui/adapter/user/AddressAdapter$OnItemButtonClickListener;", "getUserAddresses", "()Ljava/util/ArrayList;", "setUserAddresses", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemButtonClickListener", "ViewHolder", "app_debug"})
public final class AddressAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.ui.adapter.user.AddressAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.emglab.qlsv.models.entity.UserAddress> userAddresses;
    @org.jetbrains.annotations.NotNull()
    private final com.emglab.qlsv.ui.adapter.user.AddressAdapter.OnItemButtonClickListener onItemButtonClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.ui.adapter.user.AddressAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.user.AddressAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.emglab.qlsv.models.entity.UserAddress> getUserAddresses() {
        return null;
    }
    
    public final void setUserAddresses(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.emglab.qlsv.models.entity.UserAddress> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.ui.adapter.user.AddressAdapter.OnItemButtonClickListener getOnItemButtonClickListener() {
        return null;
    }
    
    public AddressAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.emglab.qlsv.models.entity.UserAddress> userAddresses, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.user.AddressAdapter.OnItemButtonClickListener onItemButtonClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/user/AddressAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemAddressBinding;", "onItemButtonClickListener", "Lcom/emglab/qlsv/ui/adapter/user/AddressAdapter$OnItemButtonClickListener;", "(Lcom/emglab/qlsv/databinding/ListItemAddressBinding;Lcom/emglab/qlsv/ui/adapter/user/AddressAdapter$OnItemButtonClickListener;)V", "getBinding", "()Lcom/emglab/qlsv/databinding/ListItemAddressBinding;", "getOnItemButtonClickListener", "()Lcom/emglab/qlsv/ui/adapter/user/AddressAdapter$OnItemButtonClickListener;", "bindView", "", "address", "Lcom/emglab/qlsv/models/entity/UserAddress;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.databinding.ListItemAddressBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.ui.adapter.user.AddressAdapter.OnItemButtonClickListener onItemButtonClickListener = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.UserAddress address) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.databinding.ListItemAddressBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.ui.adapter.user.AddressAdapter.OnItemButtonClickListener getOnItemButtonClickListener() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemAddressBinding binding, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.ui.adapter.user.AddressAdapter.OnItemButtonClickListener onItemButtonClickListener) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/user/AddressAdapter$OnItemButtonClickListener;", "", "onButtonDelClick", "", "address", "Lcom/emglab/qlsv/models/entity/UserAddress;", "app_debug"})
    public static abstract interface OnItemButtonClickListener {
        
        public abstract void onButtonDelClick(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.UserAddress address);
    }
}