package com.cootek.smartinput5.cropimage;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Handler;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.cropimage.C1236l;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.net.URI;

public class CropImageActivity extends C1236l {

    /* renamed from: d */
    private static final String f3574d = "CropImage";

    /* renamed from: e */
    private static final boolean f3575e = true;

    /* renamed from: f */
    private static final int f3576f = 480;

    /* renamed from: g */
    private static final int f3577g = 357;

    /* renamed from: a */
    boolean f3578a;

    /* renamed from: b */
    C1232i f3579b;

    /* renamed from: c */
    Runnable f3580c = new C1229f(this);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f3581h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f3582i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Handler f3583j = new Handler();

    /* renamed from: k */
    private int f3584k;

    /* renamed from: l */
    private int f3585l;

    /* renamed from: m */
    private boolean f3586m;

    /* renamed from: n */
    private boolean f3587n = true;

    /* renamed from: o */
    private final boolean f3588o = false;

    /* renamed from: p */
    private Uri f3589p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public CropImageView f3590q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Bitmap f3591r;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010a A[SYNTHETIC, Splitter:B:48:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0113 A[SYNTHETIC, Splitter:B:53:0x0113] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r1 = 0
            r2 = 1
            super.onCreate(r8)
            java.lang.System.gc()
            r7.requestWindowFeature(r2)
            r0 = 2130903064(0x7f030018, float:1.7412935E38)
            r7.setContentView(r0)
            r0 = 2131820641(0x7f110061, float:1.9274003E38)
            android.view.View r0 = r7.findViewById(r0)
            com.cootek.smartinput5.cropimage.CropImageView r0 = (com.cootek.smartinput5.cropimage.CropImageView) r0
            r7.f3590q = r0
            com.cootek.smartinput5.cropimage.CropImageView r0 = r7.f3590q
            r0.f3602f = r7
            android.content.Intent r3 = r7.getIntent()
            android.os.Bundle r4 = r3.getExtras()
            if (r4 == 0) goto L_0x006e
            java.lang.String r0 = "data"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r7.f3591r = r0
            java.lang.String r0 = "aspectX"
            int r0 = r4.getInt(r0)
            r7.f3581h = r0
            java.lang.String r0 = "aspectY"
            int r0 = r4.getInt(r0)
            r7.f3582i = r0
            java.lang.String r0 = "outputX"
            int r0 = r4.getInt(r0)
            r7.f3584k = r0
            java.lang.String r0 = "outputY"
            int r0 = r4.getInt(r0)
            r7.f3585l = r0
            java.lang.String r0 = "scale"
            boolean r0 = r4.getBoolean(r0, r2)
            r7.f3586m = r0
            java.lang.String r0 = "scaleUpIfNeeded"
            boolean r0 = r4.getBoolean(r0, r2)
            r7.f3587n = r0
            java.lang.String r0 = "output"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r7.f3589p = r0
        L_0x006e:
            android.graphics.Bitmap r0 = r7.f3591r
            if (r0 != 0) goto L_0x00d8
            android.net.Uri r3 = r3.getData()     // Catch:{ OutOfMemoryError -> 0x00f4, Exception -> 0x0101 }
            java.io.File r0 = new java.io.File     // Catch:{ IllegalArgumentException -> 0x00ee }
            java.lang.String r4 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x00ee }
            java.net.URI r4 = java.net.URI.create(r4)     // Catch:{ IllegalArgumentException -> 0x00ee }
            r0.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x00ee }
        L_0x0083:
            if (r0 != 0) goto L_0x0155
            android.content.ContentResolver r0 = r7.getContentResolver()     // Catch:{ OutOfMemoryError -> 0x00f4, Exception -> 0x0101 }
            java.io.InputStream r0 = r0.openInputStream(r3)     // Catch:{ OutOfMemoryError -> 0x00f4, Exception -> 0x0101 }
            java.io.File r1 = r7.m5896a()     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            com.cootek.smartinput.utilities.C0997e.m5174a((java.io.File) r1, (java.io.InputStream) r0)     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            if (r0 == 0) goto L_0x0152
            r0.close()     // Catch:{ IOException -> 0x00f1 }
            r3 = r1
        L_0x009a:
            if (r3 != 0) goto L_0x00a3
            r1 = 0
            r7.setResult(r1)     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            r7.finish()     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
        L_0x00a3:
            r7.m5899a((java.io.File) r3)     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            r1 = 1
            r4.inJustDecodeBounds = r1     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            android.graphics.BitmapFactory.decodeFile(r1, r4)     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            int r1 = r4.outHeight     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            int r5 = r4.outWidth     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            int r1 = r1 / 357
            int r5 = r5 / 480
            int r1 = java.lang.Math.min(r1, r5)     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            if (r1 >= r2) goto L_0x00c4
            r1 = r2
        L_0x00c4:
            r5 = 0
            r4.inJustDecodeBounds = r5     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            r4.inSampleSize = r1     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r1, r4)     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            r7.f3591r = r1     // Catch:{ OutOfMemoryError -> 0x0150, Exception -> 0x014b }
            if (r0 == 0) goto L_0x00d8
            r0.close()     // Catch:{ IOException -> 0x0142 }
        L_0x00d8:
            android.graphics.Bitmap r0 = r7.f3591r
            if (r0 != 0) goto L_0x0117
            r0 = 2131624657(0x7f0e02d1, float:1.88765E38)
            java.lang.String r0 = com.cootek.smartinput5.func.resource.C1974m.m9063a((android.content.Context) r7, (int) r0)
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r2)
            r0.show()
            r7.finish()
        L_0x00ed:
            return
        L_0x00ee:
            r0 = move-exception
            r0 = r1
            goto L_0x0083
        L_0x00f1:
            r3 = move-exception
            r3 = r1
            goto L_0x009a
        L_0x00f4:
            r0 = move-exception
            r0 = r1
        L_0x00f6:
            r7.finish()     // Catch:{ all -> 0x0146 }
            if (r0 == 0) goto L_0x00d8
            r0.close()     // Catch:{ IOException -> 0x00ff }
            goto L_0x00d8
        L_0x00ff:
            r0 = move-exception
            goto L_0x00d8
        L_0x0101:
            r0 = move-exception
        L_0x0102:
            r0.printStackTrace()     // Catch:{ all -> 0x0110 }
            r7.finish()     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x00d8
            r1.close()     // Catch:{ IOException -> 0x010e }
            goto L_0x00d8
        L_0x010e:
            r0 = move-exception
            goto L_0x00d8
        L_0x0110:
            r0 = move-exception
        L_0x0111:
            if (r1 == 0) goto L_0x0116
            r1.close()     // Catch:{ IOException -> 0x0144 }
        L_0x0116:
            throw r0
        L_0x0117:
            android.view.Window r0 = r7.getWindow()
            r1 = 1024(0x400, float:1.435E-42)
            r0.addFlags(r1)
            r0 = 2131820642(0x7f110062, float:1.9274005E38)
            android.view.View r0 = r7.findViewById(r0)
            com.cootek.smartinput5.cropimage.a r1 = new com.cootek.smartinput5.cropimage.a
            r1.<init>(r7)
            r0.setOnClickListener(r1)
            r0 = 2131820643(0x7f110063, float:1.9274007E38)
            android.view.View r0 = r7.findViewById(r0)
            com.cootek.smartinput5.cropimage.b r1 = new com.cootek.smartinput5.cropimage.b
            r1.<init>(r7)
            r0.setOnClickListener(r1)
            r7.m5901b()
            goto L_0x00ed
        L_0x0142:
            r0 = move-exception
            goto L_0x00d8
        L_0x0144:
            r1 = move-exception
            goto L_0x0116
        L_0x0146:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0111
        L_0x014b:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0102
        L_0x0150:
            r1 = move-exception
            goto L_0x00f6
        L_0x0152:
            r3 = r1
            goto L_0x009a
        L_0x0155:
            r3 = r0
            r0 = r1
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.cropimage.CropImageActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private File m5896a() {
        return new File(C1358O.m6234a(C1358O.f4201l), "crop_original");
    }

    /* renamed from: b */
    private void m5901b() {
        if (!isFinishing()) {
            this.f3590q.mo4505a(this.f3591r, true);
            m5898a(this, (String) null, C1974m.m9063a((Context) this, (int) R.string.loading), new C1226c(this), this.f3583j);
        }
    }

    /* renamed from: com.cootek.smartinput5.cropimage.CropImageActivity$a */
    private static class C1222a extends C1236l.C1237a implements Runnable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1236l f3592a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ProgressDialog f3593b;

        /* renamed from: c */
        private final Runnable f3594c;

        /* renamed from: d */
        private final Handler f3595d;

        /* renamed from: e */
        private final Runnable f3596e = new C1231h(this);

        public C1222a(C1236l lVar, Runnable runnable, ProgressDialog progressDialog, Handler handler) {
            this.f3592a = lVar;
            this.f3593b = progressDialog;
            this.f3594c = runnable;
            this.f3592a.mo4543a(this);
            this.f3595d = handler;
        }

        public void run() {
            try {
                this.f3594c.run();
            } finally {
                this.f3595d.post(this.f3596e);
            }
        }

        /* renamed from: a */
        public void mo4489a(C1236l lVar) {
            this.f3596e.run();
            this.f3595d.removeCallbacks(this.f3596e);
        }

        /* renamed from: b */
        public void mo4490b(C1236l lVar) {
            this.f3593b.hide();
        }

        /* renamed from: c */
        public void mo4491c(C1236l lVar) {
            this.f3593b.show();
        }
    }

    /* renamed from: a */
    private static void m5898a(C1236l lVar, String str, String str2, Runnable runnable, Handler handler) {
        if (lVar != null) {
            lVar.runOnUiThread(new C1228e(lVar, str, str2, runnable, handler));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m5903c() {
        Bitmap createBitmap;
        if (this.f3579b != null) {
            if (this.f3578a) {
                setResult(-1);
                finish();
                return;
            }
            this.f3578a = true;
            if (this.f3584k == 0 || this.f3585l == 0 || this.f3586m) {
                Rect b = this.f3579b.mo4536b();
                int width = b.width();
                int height = b.height();
                createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                new Canvas(createBitmap).drawBitmap(this.f3591r, b, new Rect(0, 0, width, height), (Paint) null);
                this.f3590q.mo4512c();
                this.f3591r.recycle();
                if (!(this.f3584k == 0 || this.f3585l == 0 || !this.f3586m)) {
                    createBitmap = m5894a(new Matrix(), createBitmap, this.f3584k, this.f3585l, this.f3587n, true);
                }
            } else {
                createBitmap = Bitmap.createBitmap(this.f3584k, this.f3585l, Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(createBitmap);
                Rect b2 = this.f3579b.mo4536b();
                Rect rect = new Rect(0, 0, this.f3584k, this.f3585l);
                int width2 = (b2.width() - rect.width()) / 2;
                int height2 = (b2.height() - rect.height()) / 2;
                b2.inset(Math.max(0, width2), Math.max(0, height2));
                rect.inset(Math.max(0, -width2), Math.max(0, -height2));
                canvas.drawBitmap(this.f3591r, b2, rect, (Paint) null);
                this.f3590q.mo4512c();
                this.f3591r.recycle();
            }
            this.f3590q.f3597a.clear();
            if (this.f3589p != null) {
                C0997e.m5184a(createBitmap, new File(URI.create(this.f3589p.toString())), Bitmap.CompressFormat.JPEG);
            }
            createBitmap.recycle();
            setResult(-1);
            finish();
        }
    }

    /* renamed from: a */
    private static Bitmap m5894a(Matrix matrix, Bitmap bitmap, int i, int i2, boolean z, boolean z2) {
        Matrix matrix2;
        Bitmap bitmap2;
        int width = bitmap.getWidth() - i;
        int height = bitmap.getHeight() - i2;
        if (z || (width >= 0 && height >= 0)) {
            float width2 = (float) bitmap.getWidth();
            float height2 = (float) bitmap.getHeight();
            if (width2 / height2 > ((float) i) / ((float) i2)) {
                float f = ((float) i2) / height2;
                if (f < 0.9f || f > 1.0f) {
                    matrix.setScale(f, f);
                } else {
                    matrix = null;
                }
                matrix2 = matrix;
            } else {
                float f2 = ((float) i) / width2;
                if (f2 < 0.9f || f2 > 1.0f) {
                    matrix.setScale(f2, f2);
                    matrix2 = matrix;
                } else {
                    matrix2 = null;
                }
            }
            if (matrix2 != null) {
                bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
            } else {
                bitmap2 = bitmap;
            }
            if (z2 && bitmap2 != bitmap) {
                bitmap.recycle();
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, Math.max(0, bitmap2.getWidth() - i) / 2, Math.max(0, bitmap2.getHeight() - i2) / 2, i, i2);
            if (createBitmap == bitmap2) {
                return createBitmap;
            }
            if (!z2 && bitmap2 == bitmap) {
                return createBitmap;
            }
            bitmap2.recycle();
            return createBitmap;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        int max = Math.max(0, width / 2);
        int max2 = Math.max(0, height / 2);
        Rect rect = new Rect(max, max2, Math.min(i, bitmap.getWidth()) + max, Math.min(i2, bitmap.getHeight()) + max2);
        int width3 = (i - rect.width()) / 2;
        int height3 = (i2 - rect.height()) / 2;
        canvas.drawBitmap(bitmap, rect, new Rect(width3, height3, i - width3, i2 - height3), (Paint) null);
        if (z2) {
            bitmap.recycle();
        }
        return createBitmap2;
    }

    /* renamed from: a */
    private void m5899a(File file) {
        int i;
        Bitmap decodeFile;
        if (file != null) {
            try {
                int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 1);
                if (attributeInt == 6) {
                    i = 90;
                } else {
                    i = attributeInt == 3 ? 180 : 0;
                }
                if (i != 0 && (decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), C1584bI.m7144b(file))) != null) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate((float) i);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, false);
                    C0997e.m5184a(createBitmap, file, Bitmap.CompressFormat.JPEG);
                    createBitmap.recycle();
                    System.gc();
                }
            } catch (Exception e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        File a = m5896a();
        if (a != null && a.exists()) {
            a.delete();
        }
        if (this.f3591r != null) {
            this.f3591r.recycle();
            this.f3591r = null;
        }
        super.onDestroy();
        System.gc();
    }
}
