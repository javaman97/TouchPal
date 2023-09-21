package com.p023a.p024a.p032b.p035b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.p023a.p024a.p032b.p033a.C0756d;
import com.p023a.p024a.p032b.p033a.C0757e;
import com.p023a.p024a.p032b.p037d.C0783b;
import com.p023a.p024a.p041c.C0809b;
import com.p023a.p024a.p041c.C0811c;
import com.p023a.p024a.p041c.C0813d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.a.a.b.b.a */
/* compiled from: BaseImageDecoder */
public class C0763a implements C0766b {

    /* renamed from: a */
    protected static final String f1890a = "Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]";

    /* renamed from: b */
    protected static final String f1891b = "Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]";

    /* renamed from: c */
    protected static final String f1892c = "Rotate image on %1$d° [%2$s]";

    /* renamed from: d */
    protected static final String f1893d = "Flip image horizontally [%s]";

    /* renamed from: e */
    protected static final String f1894e = "Image can't be decoded [%s]";

    /* renamed from: f */
    protected final boolean f1895f;

    public C0763a(boolean z) {
        this.f1895f = z;
    }

    /* renamed from: a */
    public Bitmap mo2827a(C0767c cVar) throws IOException {
        InputStream b = mo2831b(cVar);
        try {
            C0765b a = mo2830a(b, cVar);
            b = mo2832b(b, cVar);
            Bitmap decodeStream = BitmapFactory.decodeStream(b, (Rect) null, mo2828a(a.f1898a, cVar));
            if (decodeStream != null) {
                return mo2826a(decodeStream, cVar, a.f1899b.f1896a, a.f1899b.f1897b);
            }
            C0813d.m4630d(f1894e, cVar.mo2833a());
            return decodeStream;
        } finally {
            C0811c.m4614a((Closeable) b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public InputStream mo2831b(C0767c cVar) throws IOException {
        return cVar.mo2839g().mo2937a(cVar.mo2834b(), cVar.mo2840h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0765b mo2830a(InputStream inputStream, C0767c cVar) throws IOException {
        C0764a aVar;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        String b = cVar.mo2834b();
        if (!cVar.mo2841i() || !m4298a(b, options.outMimeType)) {
            aVar = new C0764a();
        } else {
            aVar = mo2829a(b);
        }
        return new C0765b(new C0757e(options.outWidth, options.outHeight, aVar.f1896a), aVar);
    }

    /* renamed from: a */
    private boolean m4298a(String str, String str2) {
        return "image/jpeg".equalsIgnoreCase(str2) && C0783b.C0784a.m4466a(str) == C0783b.C0784a.FILE;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r1 = com.cootek.smartinput5.engine.Settings.FIRST_TUTORIAL_WELCOME;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r1 = com.cootek.smartinput5.engine.Settings.ACCOUNT_INFO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r1 = 90;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p023a.p024a.p032b.p035b.C0763a.C0764a mo2829a(java.lang.String r6) {
        /*
            r5 = this;
            r1 = 0
            r0 = 1
            android.media.ExifInterface r2 = new android.media.ExifInterface     // Catch:{ IOException -> 0x002a }
            com.a.a.b.d.b$a r3 = com.p023a.p024a.p032b.p037d.C0783b.C0784a.FILE     // Catch:{ IOException -> 0x002a }
            java.lang.String r3 = r3.mo2946c(r6)     // Catch:{ IOException -> 0x002a }
            r2.<init>(r3)     // Catch:{ IOException -> 0x002a }
            java.lang.String r3 = "Orientation"
            r4 = 1
            int r2 = r2.getAttributeInt(r3, r4)     // Catch:{ IOException -> 0x002a }
            switch(r2) {
                case 1: goto L_0x0017;
                case 2: goto L_0x0018;
                case 3: goto L_0x0022;
                case 4: goto L_0x0023;
                case 5: goto L_0x0027;
                case 6: goto L_0x001e;
                case 7: goto L_0x001f;
                case 8: goto L_0x0026;
                default: goto L_0x0017;
            }
        L_0x0017:
            r0 = r1
        L_0x0018:
            com.a.a.b.b.a$a r2 = new com.a.a.b.b.a$a
            r2.<init>(r1, r0)
            return r2
        L_0x001e:
            r0 = r1
        L_0x001f:
            r1 = 90
            goto L_0x0018
        L_0x0022:
            r0 = r1
        L_0x0023:
            r1 = 180(0xb4, float:2.52E-43)
            goto L_0x0018
        L_0x0026:
            r0 = r1
        L_0x0027:
            r1 = 270(0x10e, float:3.78E-43)
            goto L_0x0018
        L_0x002a:
            r2 = move-exception
            java.lang.String r2 = "Can't read EXIF tags from file [%s]"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r6
            com.p023a.p024a.p041c.C0813d.m4629c(r2, r0)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p023a.p024a.p032b.p035b.C0763a.mo2829a(java.lang.String):com.a.a.b.b.a$a");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public BitmapFactory.Options mo2828a(C0757e eVar, C0767c cVar) {
        boolean z;
        int a;
        C0756d e = cVar.mo2837e();
        if (e == C0756d.NONE) {
            a = 1;
        } else if (e == C0756d.NONE_SAFE) {
            a = C0809b.m4610a(eVar);
        } else {
            C0757e d = cVar.mo2836d();
            if (e == C0756d.IN_SAMPLE_POWER_OF_2) {
                z = true;
            } else {
                z = false;
            }
            a = C0809b.m4611a(eVar, d, cVar.mo2838f(), z);
        }
        if (a > 1 && this.f1895f) {
            C0813d.m4622a(f1890a, eVar, eVar.mo2822a(a), Integer.valueOf(a), cVar.mo2833a());
        }
        BitmapFactory.Options j = cVar.mo2842j();
        j.inSampleSize = a;
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public InputStream mo2832b(InputStream inputStream, C0767c cVar) throws IOException {
        try {
            inputStream.reset();
            return inputStream;
        } catch (IOException e) {
            C0811c.m4614a((Closeable) inputStream);
            return mo2831b(cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo2826a(Bitmap bitmap, C0767c cVar, int i, boolean z) {
        Matrix matrix = new Matrix();
        C0756d e = cVar.mo2837e();
        if (e == C0756d.EXACTLY || e == C0756d.EXACTLY_STRETCHED) {
            C0757e eVar = new C0757e(bitmap.getWidth(), bitmap.getHeight(), i);
            float b = C0809b.m4613b(eVar, cVar.mo2836d(), cVar.mo2838f(), e == C0756d.EXACTLY_STRETCHED);
            if (Float.compare(b, 1.0f) != 0) {
                matrix.setScale(b, b);
                if (this.f1895f) {
                    C0813d.m4622a(f1891b, eVar, eVar.mo2821a(b), Float.valueOf(b), cVar.mo2833a());
                }
            }
        }
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
            if (this.f1895f) {
                C0813d.m4622a(f1893d, cVar.mo2833a());
            }
        }
        if (i != 0) {
            matrix.postRotate((float) i);
            if (this.f1895f) {
                C0813d.m4622a(f1892c, Integer.valueOf(i), cVar.mo2833a());
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: com.a.a.b.b.a$a */
    /* compiled from: BaseImageDecoder */
    protected static class C0764a {

        /* renamed from: a */
        public final int f1896a;

        /* renamed from: b */
        public final boolean f1897b;

        protected C0764a() {
            this.f1896a = 0;
            this.f1897b = false;
        }

        protected C0764a(int i, boolean z) {
            this.f1896a = i;
            this.f1897b = z;
        }
    }

    /* renamed from: com.a.a.b.b.a$b */
    /* compiled from: BaseImageDecoder */
    protected static class C0765b {

        /* renamed from: a */
        public final C0757e f1898a;

        /* renamed from: b */
        public final C0764a f1899b;

        protected C0765b(C0757e eVar, C0764a aVar) {
            this.f1898a = eVar;
            this.f1899b = aVar;
        }
    }
}
