package com.cootek.smartinput5.net.cmd;

import android.net.Uri;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.ClokeManager;
import com.cootek.smartinput5.engine.cloke.ArcticSearchResult;
import com.cootek.smartinput5.engine.cloke.SearchResultProtos;
import com.weibo.net.C4054q;
import java.io.IOException;
import org.apache.http.HttpResponse;

/* renamed from: com.cootek.smartinput5.net.cmd.l */
/* compiled from: CmdCloudInput */
public class C2289l extends C2259P {

    /* renamed from: a */
    public static final int f10013a = 3;

    /* renamed from: b */
    public static final int f10014b = 3;

    /* renamed from: c */
    public static final int f10015c = 2;

    /* renamed from: d */
    public SearchResultProtos.SearchResult f10016d = null;

    /* renamed from: e */
    public ArcticSearchResult.SearchResult f10017e = null;

    /* renamed from: f */
    private final String f10018f = "CmdCloudInput";

    /* renamed from: g */
    private String f10019g;

    /* renamed from: h */
    private String f10020h;

    /* renamed from: i */
    private long f10021i;

    /* renamed from: j */
    private String f10022j;

    /* renamed from: k */
    private String f10023k = null;

    /* renamed from: l */
    private String f10024l = null;

    /* renamed from: m */
    private String f10025m = null;

    /* renamed from: n */
    private String f10026n = null;

    /* renamed from: o */
    private String f10027o = null;

    /* renamed from: p */
    private int f10028p = 0;

    /* renamed from: q */
    private String f10029q = null;

    /* renamed from: r */
    private boolean f10030r = false;

    /* renamed from: s */
    private int f10031s = 0;

    /* renamed from: t */
    private int f10032t = 0;

    /* renamed from: u */
    private int f10033u = 0;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16510f;
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        StringBuilder sb = new StringBuilder();
        sb.append("/search?keycode=");
        sb.append(this.f10022j);
        if (!TextUtils.isEmpty(this.f10027o)) {
            sb.append("&userid=");
            sb.append(Uri.encode(this.f10027o));
        }
        if (!TextUtils.isEmpty(this.f10023k)) {
            sb.append("&history=");
            sb.append(Uri.encode(this.f10023k));
        }
        if (!TextUtils.isEmpty(this.f10024l)) {
            sb.append("&stroke_filter=");
            sb.append(this.f10024l);
        }
        if (!TextUtils.isEmpty(this.f10025m)) {
            sb.append("&filter=");
            sb.append(this.f10025m);
        }
        if (!TextUtils.isEmpty(this.f10026n)) {
            sb.append("&sp=");
            sb.append(this.f10026n);
        }
        if (!TextUtils.isEmpty(this.f10029q)) {
            sb.append("&location=");
            sb.append(this.f10029q);
        }
        if (this.f10028p != 0) {
            sb.append("&options=");
            sb.append(this.f10028p);
        }
        if (this.f10031s != 0) {
            sb.append("&rhs=");
            sb.append(this.f10031s);
        }
        if (this.f10032t != 0) {
            sb.append("&rls=");
            sb.append(this.f10032t);
        }
        if (this.f10033u != 0) {
            sb.append("&depth=");
            sb.append(this.f10033u);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo7879a(String str) {
        this.f10022j = str;
    }

    /* renamed from: j */
    public String mo7890j() {
        return this.f10022j;
    }

    /* renamed from: b */
    public void mo7882b(String str) {
        this.f10023k = str;
    }

    /* renamed from: c */
    public void mo7884c(String str) {
        this.f10024l = str;
    }

    /* renamed from: d */
    public void mo7886d(String str) {
        this.f10026n = str;
    }

    /* renamed from: m */
    public void mo7891m() {
        this.f10023k = null;
        this.f10022j = null;
        this.f10024l = null;
        this.f10025m = null;
        this.f10026n = null;
        this.f10030r = false;
        this.f10017e = null;
        this.f10031s = 0;
        this.f10032t = 0;
        this.f10033u = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7765a(HttpResponse httpResponse) {
        super.mo7765a(httpResponse);
        try {
            if (this.f10030r) {
                this.f10017e = ArcticSearchResult.SearchResult.parseFrom(httpResponse.getEntity().getContent());
                return true;
            }
            this.f10016d = SearchResultProtos.SearchResult.parseFrom(httpResponse.getEntity().getContent());
            return true;
        } catch (IOException | IllegalStateException e) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        String currentLanguageCloudInputCategory = ClokeManager.getCurrentLanguageCloudInputCategory();
        if (!TextUtils.isEmpty(currentLanguageCloudInputCategory)) {
            if (!currentLanguageCloudInputCategory.equals(this.f10019g) || TextUtils.isEmpty(this.f10020h)) {
                this.f10020h = null;
                try {
                    this.f10020h = String.format(mo7828h(currentLanguageCloudInputCategory), new Object[]{currentLanguageCloudInputCategory});
                    this.f10019g = currentLanguageCloudInputCategory;
                } catch (Exception e) {
                }
            }
            return this.f10020h;
        }
        this.f10019g = null;
        this.f10020h = null;
        return null;
    }

    /* renamed from: h_ */
    public int mo7830h_() {
        this.f10021i = System.currentTimeMillis();
        return super.mo7830h_();
    }

    /* renamed from: e */
    public void mo7887e(String str) {
        this.f10025m = str;
    }

    /* renamed from: f */
    public void mo7888f(String str) {
        this.f10029q = str;
    }

    /* renamed from: g */
    public void mo7889g(String str) {
        this.f10027o = str;
    }

    /* renamed from: a */
    public void mo7867a(int i) {
        this.f10028p = i;
    }

    /* renamed from: a */
    public void mo7880a(boolean z) {
        this.f10030r = z;
    }

    /* renamed from: n */
    public boolean mo7892n() {
        return this.f10030r;
    }

    /* renamed from: b */
    public void mo7881b(int i) {
        this.f10031s = i;
    }

    /* renamed from: c */
    public void mo7883c(int i) {
        this.f10032t = i;
    }

    /* renamed from: d */
    public void mo7885d(int i) {
        this.f10033u = i;
    }

    /* renamed from: o */
    public int mo7893o() {
        return this.f10033u;
    }
}
