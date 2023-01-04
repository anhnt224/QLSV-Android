package com.emglab.qlsv.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bJ\"\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0003J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tJ\b\u0010\u001a\u001a\u0004\u0018\u00010\tJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0018H\u0002J\u0016\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/emglab/qlsv/helper/TakePhotoHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "mCurrentPhotoPath", "", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "compressImageBeforeSend", "filePath", "fileName", "createImageFile", "Ljava/io/File;", "dispatchTakePictureIntent", "Landroid/content/Intent;", "getCameraPhotoOrientation", "", "imagePath", "getCurrentPhotoPath", "rotateImage", "Landroid/graphics/Bitmap;", "source", "angle", "setPic", "imageView", "Landroid/widget/ImageView;", "path", "app_debug"})
public final class TakePhotoHelper {
    private java.lang.String mCurrentPhotoPath;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    
    public final float getCameraPhotoOrientation(@org.jetbrains.annotations.NotNull()
    java.lang.String imagePath) {
        return 0.0F;
    }
    
    private final android.graphics.Bitmap rotateImage(android.graphics.Bitmap source, float angle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap setPic(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String compressImageBeforeSend(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    public final int calculateInSampleSize(@org.jetbrains.annotations.NotNull()
    android.graphics.BitmapFactory.Options options, int reqWidth, int reqHeight) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent dispatchTakePictureIntent() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final java.io.File createImageFile() throws java.io.IOException {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentPhotoPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public TakePhotoHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}