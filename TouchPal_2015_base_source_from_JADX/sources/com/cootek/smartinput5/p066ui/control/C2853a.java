package com.cootek.smartinput5.p066ui.control;

import android.graphics.Rect;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2806cb;
import com.cootek.smartinput5.p066ui.C2810ce;
import com.cootek.smartinput5.p066ui.C2811cf;

/* renamed from: com.cootek.smartinput5.ui.control.a */
/* compiled from: ActionArea */
public class C2853a {

    /* renamed from: a */
    private static final String f13010a = "ActionArea";

    /* renamed from: b */
    private static final float f13011b = 1.5f;

    /* renamed from: c */
    private static final float f13012c = 0.75f;

    /* renamed from: d */
    private final Rect f13013d = new Rect();

    /* renamed from: e */
    private final Rect f13014e = new Rect();

    /* renamed from: f */
    private final C2806cb f13015f;

    public C2853a(C2806cb cbVar, C2811cf cfVar) {
        this.f13015f = cbVar;
        int min = Math.min(cbVar.width, cbVar.height);
        int i = (int) (((float) min) * f13011b);
        int i2 = (int) (((float) min) * f13012c);
        m13224a(this.f13013d, cbVar.getDownX(), cbVar.getDownY(), i, i2, cfVar);
        this.f13014e.left = cbVar.f12453x;
        this.f13014e.right = cbVar.f12453x + cbVar.width;
        this.f13014e.top = cbVar.f12454y;
        this.f13014e.bottom = cbVar.f12454y + cbVar.height;
    }

    /* renamed from: a */
    public C2810ce mo9483a(C2806cb cbVar) {
        int keyId;
        if (cbVar == null || (keyId = Engine.getInstance().getKeyId(cbVar.keyName)) == -1) {
            return null;
        }
        return m13225a(keyId, this.f13015f == cbVar, cbVar.f12453x, cbVar.width + cbVar.f12453x, cbVar.f12454y, cbVar.height + cbVar.f12454y);
    }

    /* renamed from: a */
    private C2810ce m13225a(int i, boolean z, int i2, int i3, int i4, int i5) {
        float a = m13222a(i2, i3, i4, i5);
        if (a > 0.0f) {
            return new C2810ce(i, a, z);
        }
        return null;
    }

    /* renamed from: a */
    private float m13222a(int i, int i2, int i3, int i4) {
        if (!(m13223a(this.f13014e, i, i2, i3, i4) >= 0.0f)) {
            return 0.0f;
        }
        return m13223a(this.f13013d, i, i2, i3, i4);
    }

    /* renamed from: a */
    private float m13223a(Rect rect, int i, int i2, int i3, int i4) {
        int min = Math.min(rect.left, i);
        int width = (rect.width() + (i2 - i)) - (Math.max(rect.right, i2) - min);
        if (width < 0) {
            return -1.0f;
        }
        int min2 = Math.min(rect.top, i3);
        int height = (rect.height() + (i4 - i3)) - (Math.max(rect.bottom, i4) - min2);
        if (height >= 0) {
            return (((float) (width * height)) / ((float) rect.width())) / ((float) rect.height());
        }
        return -1.0f;
    }

    /* renamed from: a */
    private Rect m13224a(Rect rect, int i, int i2, int i3, int i4, C2811cf cfVar) {
        int i5 = 0;
        int i6 = i - i3;
        if (i6 < 0) {
            i6 = 0;
        }
        rect.left = i6;
        int i7 = i + i3;
        if (i7 > cfVar.mo9192n()) {
            i7 = cfVar.mo9192n();
        }
        rect.right = i7;
        int i8 = i2 - i4;
        if (i8 >= 0) {
            i5 = i8;
        }
        rect.top = i5;
        int i9 = i2 + i4;
        if (i9 > cfVar.mo9134g()) {
            i9 = cfVar.mo9134g();
        }
        rect.bottom = i9;
        return rect;
    }
}
