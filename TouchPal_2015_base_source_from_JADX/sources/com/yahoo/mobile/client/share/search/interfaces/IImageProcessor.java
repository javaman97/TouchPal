package com.yahoo.mobile.client.share.search.interfaces;

import android.graphics.Bitmap;

public interface IImageProcessor {
    Bitmap blur(Bitmap bitmap, int i);

    Bitmap blur(Bitmap bitmap, int i, int i2, int i3, boolean z);
}
