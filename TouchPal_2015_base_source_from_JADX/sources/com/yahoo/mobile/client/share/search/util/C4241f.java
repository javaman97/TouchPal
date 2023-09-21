package com.yahoo.mobile.client.share.search.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;

/* renamed from: com.yahoo.mobile.client.share.search.util.f */
public final class C4241f {
    /* renamed from: a */
    public static Bitmap m17770a(Activity activity) {
        try {
            View decorView = activity.getWindow().getDecorView();
            decorView.setDrawingCacheEnabled(true);
            decorView.buildDrawingCache();
            Bitmap drawingCache = decorView.getDrawingCache();
            if (drawingCache == null) {
                return null;
            }
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            Bitmap createBitmap = Bitmap.createBitmap(drawingCache, 0, i, activity.getWindowManager().getDefaultDisplay().getWidth(), activity.getWindowManager().getDefaultDisplay().getHeight() - i);
            decorView.destroyDrawingCache();
            return createBitmap;
        } catch (Exception e) {
            return null;
        }
    }
}
