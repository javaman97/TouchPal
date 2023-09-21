package com.cootek.smartinput5.func.share;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;

/* renamed from: com.cootek.smartinput5.func.share.f */
/* compiled from: ShareReceiverInfo */
public class C1984f {

    /* renamed from: g */
    private static final String[] f6785g = {"https://www.facebook.com/dialog/feed?app_id=606141872785367", "https://twitter.com/intent/tweet?text="};

    /* renamed from: a */
    private Drawable f6786a;

    /* renamed from: b */
    private String f6787b;

    /* renamed from: c */
    private String f6788c;

    /* renamed from: d */
    private String f6789d;

    /* renamed from: e */
    private boolean f6790e = false;

    /* renamed from: f */
    private String f6791f;

    public C1984f(Drawable drawable, String str, String str2, String str3) {
        this.f6786a = drawable;
        this.f6787b = str;
        this.f6788c = str2;
        this.f6791f = str3;
    }

    /* renamed from: a */
    public void mo7270a(boolean z) {
        this.f6790e = z;
    }

    /* renamed from: a */
    public boolean mo7271a() {
        return this.f6790e;
    }

    /* renamed from: b */
    public Drawable mo7272b() {
        return this.f6786a;
    }

    /* renamed from: c */
    public String mo7273c() {
        return this.f6787b;
    }

    /* renamed from: d */
    public String mo7274d() {
        return this.f6788c;
    }

    /* renamed from: e */
    public String mo7275e() {
        return this.f6791f;
    }

    /* renamed from: a */
    public void mo7269a(int i, String str, String str2, String str3, String str4) {
        if (i < 2) {
            switch (i) {
                case 0:
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(f6785g[i]);
                    if (!TextUtils.isEmpty(str4)) {
                        stringBuffer.append("&link=");
                        stringBuffer.append(str4);
                    }
                    stringBuffer.append("&display=popup");
                    if (!TextUtils.isEmpty(str)) {
                        stringBuffer.append("&name=");
                        stringBuffer.append(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        stringBuffer.append("&description=");
                        stringBuffer.append(str2);
                    }
                    if (!TextUtils.isEmpty(str3) && str3.startsWith("http")) {
                        stringBuffer.append("&picture=");
                        stringBuffer.append(str3);
                    }
                    stringBuffer.append("&ref=share&actions=&redirect_uri=https://facebook.com");
                    this.f6789d = stringBuffer.toString();
                    return;
                case 1:
                    this.f6789d = f6785g[i] + str2;
                    if (!TextUtils.isEmpty(str4)) {
                        this.f6789d += " " + str4;
                        return;
                    }
                    return;
                default:
                    this.f6789d = "";
                    return;
            }
        }
    }

    /* renamed from: f */
    public String mo7276f() {
        return this.f6789d;
    }
}
