package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.volley.C0823f;
import com.android.volley.C0830l;
import com.android.volley.C0832n;
import com.android.volley.C0833o;
import com.android.volley.C0840s;
import com.android.volley.C0880u;
import com.android.volley.C0884y;

/* renamed from: com.android.volley.toolbox.q */
/* compiled from: ImageRequest */
public class C0870q extends C0833o<Bitmap> {

    /* renamed from: a */
    private static final int f2306a = 1000;

    /* renamed from: b */
    private static final int f2307b = 2;

    /* renamed from: c */
    private static final float f2308c = 2.0f;

    /* renamed from: h */
    private static final Object f2309h = new Object();

    /* renamed from: d */
    private final C0840s.C0842b<Bitmap> f2310d;

    /* renamed from: e */
    private final Bitmap.Config f2311e;

    /* renamed from: f */
    private final int f2312f;

    /* renamed from: g */
    private final int f2313g;

    public C0870q(String str, C0840s.C0842b<Bitmap> bVar, int i, int i2, Bitmap.Config config, C0840s.C0841a aVar) {
        super(0, str, aVar);
        mo3056a((C0880u) new C0823f(1000, 2, f2308c));
        this.f2310d = bVar;
        this.f2311e = config;
        this.f2312f = i;
        this.f2313g = i2;
    }

    /* renamed from: u */
    public C0833o.C0835b mo3086u() {
        return C0833o.C0835b.LOW;
    }

    /* renamed from: b */
    private static int m4841b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (i == 0) {
            return (int) ((((double) i2) / ((double) i4)) * ((double) i3));
        }
        if (i2 == 0) {
            return i;
        }
        double d = ((double) i4) / ((double) i3);
        if (((double) i) * d > ((double) i2)) {
            return (int) (((double) i2) / d);
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0840s<Bitmap> mo3059a(C0830l lVar) {
        C0840s<Bitmap> a;
        synchronized (f2309h) {
            try {
                a = m4842b(lVar);
            } catch (OutOfMemoryError e) {
                C0884y.m4880c("Caught OOM for %d byte image, url=%s", Integer.valueOf(lVar.f2185b.length), mo3070f());
                a = C0840s.m4728a(new C0832n((Throwable) e));
            }
        }
        return a;
    }

    /* renamed from: b */
    private C0840s<Bitmap> m4842b(C0830l lVar) {
        Bitmap bitmap;
        byte[] bArr = lVar.f2185b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f2312f == 0 && this.f2313g == 0) {
            options.inPreferredConfig = this.f2311e;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int b = m4841b(this.f2312f, this.f2313g, i, i2);
            int b2 = m4841b(this.f2313g, this.f2312f, i2, i);
            options.inJustDecodeBounds = false;
            options.inSampleSize = m4840a(i, i2, b, b2);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray == null || (decodeByteArray.getWidth() <= b && decodeByteArray.getHeight() <= b2)) {
                bitmap = decodeByteArray;
            } else {
                bitmap = Bitmap.createScaledBitmap(decodeByteArray, b, b2, true);
                decodeByteArray.recycle();
            }
        }
        if (bitmap == null) {
            return C0840s.m4728a(new C0832n(lVar));
        }
        return C0840s.m4729a(bitmap, C0857i.m4795a(lVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3064b(Bitmap bitmap) {
        this.f2310d.mo3103a(bitmap);
    }

    /* renamed from: a */
    static int m4840a(int i, int i2, int i3, int i4) {
        double min = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        float f = 1.0f;
        while (((double) (f * f2308c)) <= min) {
            f *= f2308c;
        }
        return (int) f;
    }
}
