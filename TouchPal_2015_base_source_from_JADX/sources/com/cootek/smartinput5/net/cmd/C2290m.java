package com.cootek.smartinput5.net.cmd;

import android.net.Uri;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.ClokeManager;
import com.cootek.smartinput5.net.C2188Q;
import com.weibo.net.C4054q;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

/* renamed from: com.cootek.smartinput5.net.cmd.m */
/* compiled from: CmdCloudInputFeedback */
public class C2290m extends C2259P {

    /* renamed from: a */
    private final String f10034a = "CmdCloudInputFeedback";

    /* renamed from: b */
    private String f10035b = null;

    /* renamed from: c */
    private String f10036c = null;

    /* renamed from: d */
    private String f10037d = null;

    /* renamed from: e */
    private String f10038e;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16510f;
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* renamed from: a */
    public void mo7894a(String str) {
        this.f10035b = str;
    }

    /* renamed from: b */
    public void mo7895b(String str) {
        this.f10036c = str;
    }

    /* renamed from: j */
    public void mo7896j() {
        this.f10035b = null;
        this.f10036c = null;
    }

    /* renamed from: h_ */
    public int mo7830h_() {
        if (TextUtils.isEmpty(this.f10037d)) {
            String c = C2188Q.m9853a().mo7683c();
            if (TextUtils.isEmpty(c)) {
                return 0;
            }
            this.f10037d = c;
        }
        return super.mo7830h_();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        StringBuilder sb = new StringBuilder();
        sb.append("/feedback/reference=");
        sb.append(this.f10035b);
        if (!TextUtils.isEmpty(this.f10037d)) {
            sb.append("&userid=");
            sb.append(Uri.encode(this.f10037d));
        }
        if (!TextUtils.isEmpty(this.f10036c)) {
            sb.append("&selected=");
            sb.append(this.f10036c);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7765a(HttpResponse httpResponse) {
        super.mo7765a(httpResponse);
        try {
            EntityUtils.toString(httpResponse.getEntity(), Utils.UTF8);
            return true;
        } catch (IOException | IllegalStateException e) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        if (TextUtils.isEmpty(this.f10038e)) {
            String h = mo7828h(ClokeManager.CLOUD_LANG_CATEGORY_PINYIN);
            try {
                this.f10038e = String.format(h, new Object[]{ClokeManager.CLOUD_LANG_CATEGORY_PINYIN});
            } catch (Exception e) {
            }
        }
        return this.f10038e;
    }
}
