package com.emglab.qlsv.repositories.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001a\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0002J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/emglab/qlsv/repositories/user/UserRoleRepository;", "", "userRoleDAO", "Lcom/emglab/qlsv/dao/UserRoleDAO;", "webservice", "Lcom/emglab/qlsv/webservices/WebService;", "(Lcom/emglab/qlsv/dao/UserRoleDAO;Lcom/emglab/qlsv/webservices/WebService;)V", "collectionType", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "getCollectionType", "()Ljava/lang/reflect/Type;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "deleteFromRoom", "", "userRole", "Lcom/emglab/qlsv/models/entity/UserRole;", "getUserRole", "Landroidx/lifecycle/LiveData;", "", "userName", "", "token", "insertAllToRoom", "userRoles", "insertToRoom", "refreshUserRole", "updateToRoom", "Companion", "app_debug"})
public final class UserRoleRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    private final java.lang.reflect.Type collectionType = null;
    private final com.emglab.qlsv.dao.UserRoleDAO userRoleDAO = null;
    private final com.emglab.qlsv.webservices.WebService webservice = null;
    private static final int RESP_CODE_DEFAUL = 100;
    private static final int RESP_CODE_ERROR = -1;
    private static final int RESP_CODE_OK = 0;
    private static volatile com.emglab.qlsv.repositories.user.UserRoleRepository instance;
    public static final com.emglab.qlsv.repositories.user.UserRoleRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final java.lang.reflect.Type getCollectionType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.UserRole>> getUserRole(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    public final void refreshUserRole(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    private final void insertAllToRoom(java.util.List<com.emglab.qlsv.models.entity.UserRole> userRoles) {
    }
    
    public final void insertToRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserRole userRole) {
    }
    
    public final void updateToRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserRole userRole) {
    }
    
    public final void deleteFromRoom(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserRole userRole) {
    }
    
    public UserRoleRepository(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.UserRoleDAO userRoleDAO, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.webservices.WebService webservice) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/emglab/qlsv/repositories/user/UserRoleRepository$Companion;", "", "()V", "RESP_CODE_DEFAUL", "", "getRESP_CODE_DEFAUL", "()I", "RESP_CODE_ERROR", "getRESP_CODE_ERROR", "RESP_CODE_OK", "getRESP_CODE_OK", "instance", "Lcom/emglab/qlsv/repositories/user/UserRoleRepository;", "getInstance", "userRoleDAO", "Lcom/emglab/qlsv/dao/UserRoleDAO;", "webservice", "Lcom/emglab/qlsv/webservices/WebService;", "app_debug"})
    public static final class Companion {
        
        public final int getRESP_CODE_DEFAUL() {
            return 0;
        }
        
        public final int getRESP_CODE_ERROR() {
            return 0;
        }
        
        public final int getRESP_CODE_OK() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.repositories.user.UserRoleRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.dao.UserRoleDAO userRoleDAO, @org.jetbrains.annotations.NotNull()
        com.emglab.qlsv.webservices.WebService webservice) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}