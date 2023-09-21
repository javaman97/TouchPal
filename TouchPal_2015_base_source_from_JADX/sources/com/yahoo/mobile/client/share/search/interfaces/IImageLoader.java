package com.yahoo.mobile.client.share.search.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.concurrent.Future;

public interface IImageLoader {
    void clearCache();

    Drawable loadImage(Uri uri, IImageLoadListener iImageLoadListener);

    Future<Drawable> loadImageAsync(Uri uri, IImageLoadListener iImageLoadListener, int[] iArr);

    void removeCacheEntryForUri(Uri uri);
}
