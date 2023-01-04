package com.emglab.qlsv.ui.adapter.form;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u001c\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/form/AddressPickerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/emglab/qlsv/ui/adapter/form/AddressPickerAdapter$ViewHolder;", "userAddressList", "", "Lcom/emglab/qlsv/models/entity/UserAddress;", "userAddressSelected", "onItemClickListener", "Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "(Ljava/util/List;Lcom/emglab/qlsv/models/entity/UserAddress;Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;)V", "getOnItemClickListener", "()Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;", "setOnItemClickListener", "(Lcom/emglab/qlsv/ui/adapter/OnItemClickListener;)V", "getUserAddressList", "()Ljava/util/List;", "setUserAddressList", "(Ljava/util/List;)V", "getUserAddressSelected", "()Lcom/emglab/qlsv/models/entity/UserAddress;", "setUserAddressSelected", "(Lcom/emglab/qlsv/models/entity/UserAddress;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class AddressPickerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.emglab.qlsv.ui.adapter.form.AddressPickerAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.emglab.qlsv.models.entity.UserAddress> userAddressList;
    @org.jetbrains.annotations.Nullable()
    private com.emglab.qlsv.models.entity.UserAddress userAddressSelected;
    @org.jetbrains.annotations.NotNull()
    private com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.UserAddress> onItemClickListener;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.emglab.qlsv.ui.adapter.form.AddressPickerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.form.AddressPickerAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.UserAddress> getUserAddressList() {
        return null;
    }
    
    public final void setUserAddressList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.UserAddress> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emglab.qlsv.models.entity.UserAddress getUserAddressSelected() {
        return null;
    }
    
    public final void setUserAddressSelected(@org.jetbrains.annotations.Nullable()
    com.emglab.qlsv.models.entity.UserAddress p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.UserAddress> getOnItemClickListener() {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.UserAddress> p0) {
    }
    
    public AddressPickerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.UserAddress> userAddressList, @org.jetbrains.annotations.Nullable()
    com.emglab.qlsv.models.entity.UserAddress userAddressSelected, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.adapter.OnItemClickListener<com.emglab.qlsv.models.entity.UserAddress> onItemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/emglab/qlsv/ui/adapter/form/AddressPickerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/emglab/qlsv/databinding/ListItemAddressPickerBinding;", "(Lcom/emglab/qlsv/ui/adapter/form/AddressPickerAdapter;Lcom/emglab/qlsv/databinding/ListItemAddressPickerBinding;)V", "getBinding", "()Lcom/emglab/qlsv/databinding/ListItemAddressPickerBinding;", "bindView", "", "userAddress", "Lcom/emglab/qlsv/models/entity/UserAddress;", "userAddressSelected", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.emglab.qlsv.databinding.ListItemAddressPickerBinding binding = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.models.entity.UserAddress userAddress, @org.jetbrains.annotations.Nullable()
        com.emglab.qlsv.models.entity.UserAddress userAddressSelected) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.databinding.ListItemAddressPickerBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.databinding.ListItemAddressPickerBinding binding) {
            super(null);
        }
    }
}