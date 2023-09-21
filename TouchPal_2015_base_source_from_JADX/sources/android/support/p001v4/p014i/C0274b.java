package android.support.p001v4.p014i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: android.support.v4.i.b */
/* compiled from: PrintHelperKitkat */
class C0274b {

    /* renamed from: c */
    public static final int f663c = 1;

    /* renamed from: d */
    public static final int f664d = 2;

    /* renamed from: e */
    public static final int f665e = 1;

    /* renamed from: f */
    public static final int f666f = 2;

    /* renamed from: g */
    public static final int f667g = 1;

    /* renamed from: h */
    public static final int f668h = 2;

    /* renamed from: l */
    private static final String f669l = "PrintHelperKitkat";

    /* renamed from: m */
    private static final int f670m = 3500;

    /* renamed from: a */
    final Context f671a;

    /* renamed from: b */
    BitmapFactory.Options f672b = null;

    /* renamed from: i */
    int f673i = 2;

    /* renamed from: j */
    int f674j = 2;

    /* renamed from: k */
    int f675k = 1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Object f676n = new Object();

    C0274b(Context context) {
        this.f671a = context;
    }

    /* renamed from: a */
    public void mo819a(int i) {
        this.f673i = i;
    }

    /* renamed from: a */
    public int mo818a() {
        return this.f673i;
    }

    /* renamed from: b */
    public void mo823b(int i) {
        this.f674j = i;
    }

    /* renamed from: c */
    public void mo825c(int i) {
        this.f675k = i;
    }

    /* renamed from: b */
    public int mo822b() {
        return this.f675k;
    }

    /* renamed from: c */
    public int mo824c() {
        return this.f674j;
    }

    /* renamed from: a */
    public void mo820a(String str, Bitmap bitmap) {
        if (bitmap != null) {
            int i = this.f673i;
            PrintManager printManager = (PrintManager) this.f671a.getSystemService("print");
            PrintAttributes.MediaSize mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
            if (bitmap.getWidth() > bitmap.getHeight()) {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
            }
            printManager.print(str, new C0275c(this, str, bitmap, i), new PrintAttributes.Builder().setMediaSize(mediaSize).setColorMode(this.f674j).build());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Matrix m1095a(int i, int i2, RectF rectF, int i3) {
        float min;
        Matrix matrix = new Matrix();
        float width = rectF.width() / ((float) i);
        if (i3 == 2) {
            min = Math.max(width, rectF.height() / ((float) i2));
        } else {
            min = Math.min(width, rectF.height() / ((float) i2));
        }
        matrix.postScale(min, min);
        matrix.postTranslate((rectF.width() - (((float) i) * min)) / 2.0f, (rectF.height() - (min * ((float) i2))) / 2.0f);
        return matrix;
    }

    /* renamed from: a */
    public void mo821a(String str, Uri uri) throws FileNotFoundException {
        C0276d dVar = new C0276d(this, str, uri, this.f673i);
        PrintManager printManager = (PrintManager) this.f671a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f674j);
        if (this.f675k == 1) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (this.f675k == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, dVar, builder.build());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m1092a(Uri uri, int i) throws FileNotFoundException {
        BitmapFactory.Options options;
        int i2 = 1;
        Bitmap bitmap = null;
        if (i <= 0 || uri == null || this.f671a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        m1093a(uri, options2);
        int i3 = options2.outWidth;
        int i4 = options2.outHeight;
        if (i3 > 0 && i4 > 0) {
            int max = Math.max(i3, i4);
            while (max > i) {
                max >>>= 1;
                i2 <<= 1;
            }
            if (i2 > 0 && Math.min(i3, i4) / i2 > 0) {
                synchronized (this.f676n) {
                    this.f672b = new BitmapFactory.Options();
                    this.f672b.inMutable = true;
                    this.f672b.inSampleSize = i2;
                    options = this.f672b;
                }
                try {
                    bitmap = m1093a(uri, options);
                    synchronized (this.f676n) {
                        this.f672b = null;
                    }
                } catch (Throwable th) {
                    synchronized (this.f676n) {
                        this.f672b = null;
                        throw th;
                    }
                }
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    private Bitmap m1093a(Uri uri, BitmapFactory.Options options) throws FileNotFoundException {
        InputStream inputStream = null;
        if (uri == null || this.f671a == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        try {
            inputStream = this.f671a.getContentResolver().openInputStream(uri);
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, (Rect) null, options);
            if (inputStream != null) {
                try {
                } catch (IOException e) {
                    Log.w(f669l, "close fail ", e);
                }
            }
            return decodeStream;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    Log.w(f669l, "close fail ", e2);
                }
            }
        }
    }
}
