package com.cootek.smartinput5.p066ui;

import android.graphics.Bitmap;
import com.cootek.smartinput.utilities.C0998f;
import com.cootek.smartinput5.func.C1403aO;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Hashtable;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.h */
/* compiled from: BitmapBufferCache */
public class C2929h implements C1403aO.C1404a {

    /* renamed from: a */
    private static final int f13277a = C2817ck.values().length;

    /* renamed from: b */
    private static final int f13278b = 52;

    /* renamed from: c */
    private static final int f13279c = 2097152;

    /* renamed from: d */
    private static final int f13280d = 1048576;

    /* renamed from: e */
    private Bitmap[][] f13281e = ((Bitmap[][]) Array.newInstance(Bitmap.class, new int[]{f13277a, 2}));

    /* renamed from: f */
    private WeakReference<Bitmap>[][] f13282f = ((WeakReference[][]) Array.newInstance(WeakReference.class, new int[]{f13277a, 2}));

    /* renamed from: g */
    private int f13283g = 0;

    /* renamed from: h */
    private Bitmap.Config f13284h = Bitmap.Config.ARGB_8888;

    /* renamed from: i */
    private int f13285i;

    /* renamed from: j */
    private Hashtable<Integer, Bitmap> f13286j = new Hashtable<>();

    /* renamed from: a */
    public WeakReference<Bitmap> mo9706a(C2817ck ckVar, int i, int i2) {
        int i3 = 0;
        if (ckVar == C2817ck.SYMPAD) {
            ckVar = C2817ck.KEYBOARD;
        }
        if (ckVar == C2817ck.KEYBOARD) {
            i3 = this.f13283g;
            this.f13283g ^= 1;
        }
        int f = ckVar.mo9214f();
        Bitmap bitmap = this.f13281e[f][i3];
        if (bitmap == null || bitmap.isRecycled() || i > bitmap.getWidth() || i2 > bitmap.getHeight()) {
            if (bitmap != null) {
                i = Math.max(i, bitmap.getWidth());
                i2 = Math.max(i2, bitmap.getHeight());
                bitmap.recycle();
            }
            bitmap = m13541a(i, i2);
            this.f13281e[f][i3] = bitmap;
        }
        WeakReference<Bitmap> weakReference = this.f13282f[f][i3];
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference<Bitmap> weakReference2 = new WeakReference<>(bitmap);
        this.f13282f[f][i3] = weakReference2;
        return weakReference2;
    }

    /* renamed from: a */
    private Bitmap m13541a(int i, int i2) {
        return mo9704a(i, i2, this.f13284h);
    }

    /* renamed from: a */
    public Bitmap mo9704a(int i, int i2, Bitmap.Config config) {
        C0998f.m5196a().mo4085b();
        boolean z = true;
        Bitmap bitmap = null;
        for (int i3 = 0; i3 < 5 && z; i3++) {
            try {
                bitmap = Bitmap.createBitmap(i, i2, config);
                z = false;
            } catch (OutOfMemoryError e) {
                mo9708b();
                z = C0998f.m5196a().mo4086c();
            }
        }
        return bitmap;
    }

    /* renamed from: b */
    public void mo9708b() {
        for (Bitmap[] bitmapArr : this.f13281e) {
            if (bitmapArr != null) {
                for (int i = 0; i < bitmapArr.length; i++) {
                    if (bitmapArr[i] != null) {
                        bitmapArr[i] = null;
                    }
                }
            }
        }
        for (WeakReference<Bitmap>[] weakReferenceArr : this.f13282f) {
            if (weakReferenceArr != null) {
                for (int i2 = 0; i2 < weakReferenceArr.length; i2++) {
                    if (weakReferenceArr[i2] != null) {
                        weakReferenceArr[i2].clear();
                        weakReferenceArr[i2] = null;
                    }
                }
            }
        }
        m13543e();
    }

    /* renamed from: a */
    public Bitmap mo9705a(C2809cd cdVar) {
        if (cdVar == null) {
            return null;
        }
        int hashCode = cdVar.hashCode();
        if (this.f13286j.containsKey(Integer.valueOf(hashCode))) {
            return this.f13286j.get(Integer.valueOf(hashCode));
        }
        return null;
    }

    /* renamed from: b */
    public Bitmap mo9707b(C2809cd cdVar) {
        m13542d();
        Bitmap a = m13541a(cdVar.f12461f, cdVar.f12462g);
        if (a != null) {
            this.f13286j.put(Integer.valueOf(cdVar.hashCode()), a);
            this.f13285i += m13540a(a);
        }
        return a;
    }

    /* renamed from: d */
    private void m13542d() {
        if (this.f13286j.size() >= 52 || this.f13285i >= 1048576) {
            m13543e();
        }
    }

    /* renamed from: e */
    private void m13543e() {
        this.f13286j.clear();
        this.f13285i = 0;
    }

    /* renamed from: a */
    public void mo6012a() {
        mo9708b();
    }

    /* renamed from: c */
    public String mo9709c() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("----------\n");
        stringBuffer.append(String.format("Config=[%s] key bitmap count=[%d]\n", new Object[]{this.f13284h, Integer.valueOf(this.f13286j.size())}));
        stringBuffer.append(String.format(" bitmapSize=[%6.2f K]\n", new Object[]{Double.valueOf(((double) m13545g()) / 1024.0d)}));
        stringBuffer.append("--\n");
        for (int i = 0; i < this.f13281e.length; i++) {
            Bitmap[] bitmapArr = this.f13281e[i];
            if (bitmapArr != null) {
                for (int i2 = 0; i2 < bitmapArr.length; i2++) {
                    if (bitmapArr[i2] != null) {
                        stringBuffer.append(String.format(" buf[%d %d] [%d %d] [%s]  size=[%6.2f K]\n", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bitmapArr[i2].getWidth()), Integer.valueOf(bitmapArr[i2].getHeight()), bitmapArr[i2].getConfig(), Double.valueOf(((double) m13540a(bitmapArr[i2])) / 1024.0d)}));
                    }
                }
            }
        }
        stringBuffer.append("--\n");
        double f = (double) m13544f();
        double g = (double) m13545g();
        stringBuffer.append(String.format(" buffer = [%7.2f K]\n", new Object[]{Double.valueOf(f / 1024.0d)}));
        stringBuffer.append(String.format(" key    = [%7.2f K]\n", new Object[]{Double.valueOf(g / 1024.0d)}));
        stringBuffer.append(String.format(" total  = [%7.2f K]\n", new Object[]{Double.valueOf((f + g) / 1024.0d)}));
        stringBuffer.append("--\n");
        return stringBuffer.toString();
    }

    /* renamed from: f */
    private int m13544f() {
        int i = 0;
        for (Bitmap[] bitmapArr : this.f13281e) {
            if (bitmapArr != null) {
                int i2 = i;
                for (int i3 = 0; i3 < bitmapArr.length; i3++) {
                    if (bitmapArr[i3] != null) {
                        i2 += m13540a(bitmapArr[i3]);
                    }
                }
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: g */
    private int m13545g() {
        int i = 0;
        Iterator<Bitmap> it = this.f13286j.values().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = m13540a(it.next()) + i2;
        }
    }

    /* renamed from: a */
    private int m13540a(Bitmap bitmap) {
        int i;
        Bitmap.Config config = bitmap.getConfig();
        if (config == Bitmap.Config.ARGB_8888) {
            i = 4;
        } else if (config == Bitmap.Config.RGB_565) {
            i = 2;
        } else {
            i = 1;
        }
        return i * bitmap.getWidth() * bitmap.getHeight();
    }
}
