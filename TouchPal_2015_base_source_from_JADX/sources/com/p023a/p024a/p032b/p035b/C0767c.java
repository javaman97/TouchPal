package com.p023a.p024a.p032b.p035b;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.p023a.p024a.p032b.C0768c;
import com.p023a.p024a.p032b.p033a.C0756d;
import com.p023a.p024a.p032b.p033a.C0757e;
import com.p023a.p024a.p032b.p033a.C0760h;
import com.p023a.p024a.p032b.p037d.C0783b;

/* renamed from: com.a.a.b.b.c */
/* compiled from: ImageDecodingInfo */
public class C0767c {

    /* renamed from: a */
    private final String f1900a;

    /* renamed from: b */
    private final String f1901b;

    /* renamed from: c */
    private final String f1902c;

    /* renamed from: d */
    private final C0757e f1903d;

    /* renamed from: e */
    private final C0756d f1904e;

    /* renamed from: f */
    private final C0760h f1905f;

    /* renamed from: g */
    private final C0783b f1906g;

    /* renamed from: h */
    private final Object f1907h;

    /* renamed from: i */
    private final boolean f1908i;

    /* renamed from: j */
    private final BitmapFactory.Options f1909j = new BitmapFactory.Options();

    public C0767c(String str, String str2, String str3, C0757e eVar, C0760h hVar, C0783b bVar, C0768c cVar) {
        this.f1900a = str;
        this.f1901b = str2;
        this.f1902c = str3;
        this.f1903d = eVar;
        this.f1904e = cVar.mo2855j();
        this.f1905f = hVar;
        this.f1906g = bVar;
        this.f1907h = cVar.mo2859n();
        this.f1908i = cVar.mo2858m();
        m4307a(cVar.mo2856k(), this.f1909j);
    }

    /* renamed from: a */
    private void m4307a(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inDensity = options.inDensity;
        options2.inDither = options.inDither;
        options2.inInputShareable = options.inInputShareable;
        options2.inJustDecodeBounds = options.inJustDecodeBounds;
        options2.inPreferredConfig = options.inPreferredConfig;
        options2.inPurgeable = options.inPurgeable;
        options2.inSampleSize = options.inSampleSize;
        options2.inScaled = options.inScaled;
        options2.inScreenDensity = options.inScreenDensity;
        options2.inTargetDensity = options.inTargetDensity;
        options2.inTempStorage = options.inTempStorage;
        if (Build.VERSION.SDK_INT >= 10) {
            m4308b(options, options2);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            m4309c(options, options2);
        }
    }

    @TargetApi(10)
    /* renamed from: b */
    private void m4308b(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inPreferQualityOverSpeed = options.inPreferQualityOverSpeed;
    }

    @TargetApi(11)
    /* renamed from: c */
    private void m4309c(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inBitmap = options.inBitmap;
        options2.inMutable = options.inMutable;
    }

    /* renamed from: a */
    public String mo2833a() {
        return this.f1900a;
    }

    /* renamed from: b */
    public String mo2834b() {
        return this.f1901b;
    }

    /* renamed from: c */
    public String mo2835c() {
        return this.f1902c;
    }

    /* renamed from: d */
    public C0757e mo2836d() {
        return this.f1903d;
    }

    /* renamed from: e */
    public C0756d mo2837e() {
        return this.f1904e;
    }

    /* renamed from: f */
    public C0760h mo2838f() {
        return this.f1905f;
    }

    /* renamed from: g */
    public C0783b mo2839g() {
        return this.f1906g;
    }

    /* renamed from: h */
    public Object mo2840h() {
        return this.f1907h;
    }

    /* renamed from: i */
    public boolean mo2841i() {
        return this.f1908i;
    }

    /* renamed from: j */
    public BitmapFactory.Options mo2842j() {
        return this.f1909j;
    }
}
