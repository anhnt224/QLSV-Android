package com.emglab.qlsv;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0016\u0010\u0014\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/emglab/qlsv/QRCodeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Linfo/androidhive/barcode/BarcodeReader$BarcodeReaderListener;", "()V", "forResultNewOrderActivity", "", "aId", "", "onBitmapScanned", "sparseArray", "Landroid/util/SparseArray;", "Lcom/google/android/gms/vision/barcode/Barcode;", "onCameraPermissionDenied", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onScanError", "s", "onScanned", "barcode", "onScannedMultiple", "list", "", "Companion", "app_debug"})
public final class QRCodeActivity extends androidx.appcompat.app.AppCompatActivity implements info.androidhive.barcode.BarcodeReader.BarcodeReaderListener {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String AID = "AID";
    public static final com.emglab.qlsv.QRCodeActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCameraPermissionDenied() {
    }
    
    @java.lang.Override()
    public void onScanned(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.vision.barcode.Barcode barcode) {
    }
    
    @java.lang.Override()
    public void onScannedMultiple(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.android.gms.vision.barcode.Barcode> list) {
    }
    
    @java.lang.Override()
    public void onBitmapScanned(@org.jetbrains.annotations.NotNull()
    android.util.SparseArray<com.google.android.gms.vision.barcode.Barcode> sparseArray) {
    }
    
    @java.lang.Override()
    public void onScanError(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    private final void forResultNewOrderActivity(java.lang.String aId) {
    }
    
    public QRCodeActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/emglab/qlsv/QRCodeActivity$Companion;", "", "()V", "AID", "", "getAID", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAID() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}