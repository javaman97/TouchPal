package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.graphics.Paint;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1599be;
import java.util.Hashtable;

/* renamed from: com.cootek.smartinput5.ui.cJ */
/* compiled from: TemplateParser */
public class C2786cJ {

    /* renamed from: a */
    boolean f12382a;

    public C2786cJ(boolean z) {
        this.f12382a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9110a() {
        return this.f12382a;
    }

    /* renamed from: a */
    public int mo9107a(Resources resources, String str, String str2, int i, int i2, int i3) {
        return (!mo9110a() || !TextUtils.isEmpty(str2)) ? C1599be.m7199a(resources, str, str2, i, i2) : i3;
    }

    /* renamed from: a */
    public int mo9106a(Resources resources, String str, String str2, int i, int i2) {
        return (!mo9110a() || !TextUtils.isEmpty(str2)) ? C1599be.m7198a(resources, str, str2, i) : i2;
    }

    /* renamed from: a */
    public int mo9108a(Resources resources, String str, String str2, Hashtable<String, Integer> hashtable, int i, int i2) {
        return (!mo9110a() || !TextUtils.isEmpty(str2)) ? C1599be.m7200a(resources, str, str2, hashtable, i) : i2;
    }

    /* renamed from: b */
    public int mo9112b(Resources resources, String str, String str2, int i, int i2) {
        return (!mo9110a() || !TextUtils.isEmpty(str2)) ? C1599be.m7216b(resources, str, str2, i) : i2;
    }

    /* renamed from: a */
    public boolean mo9111a(Resources resources, String str, String str2, boolean z, boolean z2) {
        return (!mo9110a() || !TextUtils.isEmpty(str2)) ? C1599be.m7214a(resources, str, str2, z) : z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Paint.Align mo9109a(String str, Paint.Align align) {
        return (!mo9110a() || !TextUtils.isEmpty(str)) ? C1599be.m7203a(str, (Paint.Align) null) : align;
    }
}
