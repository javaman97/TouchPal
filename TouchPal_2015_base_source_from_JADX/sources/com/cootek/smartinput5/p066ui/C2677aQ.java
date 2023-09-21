package com.cootek.smartinput5.p066ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: com.cootek.smartinput5.ui.aQ */
/* compiled from: ImageUtils */
public class C2677aQ {
    /* renamed from: a */
    public static Drawable m12364a(Drawable drawable, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Path path = new Path();
        path.addCircle((((float) i) - 1.0f) / 2.0f, (((float) i) - 1.0f) / 2.0f, (float) (i / 2), Path.Direction.CCW);
        Canvas canvas = new Canvas(createBitmap);
        canvas.clipPath(path);
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        int height = bitmap.getHeight();
        canvas.drawBitmap(bitmap, new Rect(height / 5, height / 5, (height * 4) / 5, (height * 4) / 5), new Rect(0, 0, i, i), paint);
        return new BitmapDrawable(createBitmap);
    }
}
