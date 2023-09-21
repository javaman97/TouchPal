package com.yahoo.mobile.client.share.search.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public interface IImageLoadListener {
    void onImageReady(Drawable drawable);

    void onImageReady(Drawable drawable, Uri uri);
}
