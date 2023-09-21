package com.cootek.smartinput5.func.mainentrance;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.func.mainentrance.MainEntranceActivity;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.TWebView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.func.mainentrance.x */
/* compiled from: WebViewProvider */
public class C1872x implements MainEntranceActivity.C1843a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f6246a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TWebView f6247b = null;

    /* renamed from: c */
    private IPCManager f6248c;

    /* renamed from: d */
    private HashMap<Object, String> f6249d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f6250e;

    public C1872x(Context context) {
        this.f6246a = context;
        this.f6249d = new HashMap<>();
    }

    /* renamed from: a */
    public void mo6980a(IPCManager iPCManager) {
        this.f6248c = iPCManager;
    }

    /* renamed from: a */
    public void mo6981a(Object obj, String str) {
        this.f6249d.put(obj, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m8607b(String str) {
        if (TextUtils.isEmpty(str) && this.f6247b != null) {
            str = this.f6247b.getUrl();
        }
        return !TextUtils.isEmpty(str) && str.indexOf(m8614g()) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public String m8610d() {
        return "javascript:setReloadUrl(\"" + this.f6250e + "\")";
    }

    /* renamed from: e */
    private void m8611e() {
        this.f6247b = new TWebView(this.f6246a);
        this.f6247b.setWebViewClient(new C1873y(this));
        this.f6247b.setScrollBarStyle(0);
        this.f6247b.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        this.f6247b.getSettings().setJavaScriptEnabled(true);
        this.f6247b.setIPCManager(this.f6248c);
        if (!this.f6249d.isEmpty()) {
            for (Map.Entry next : this.f6249d.entrySet()) {
                this.f6247b.addJavascriptInterface(next.getKey(), (String) next.getValue());
            }
        }
    }

    /* renamed from: a */
    public void mo6982a(String str) {
        this.f6250e = str;
    }

    /* renamed from: a */
    public void mo6979a() {
        if (this.f6247b != null) {
            if (this.f6247b.getParent() != null) {
                ((ViewGroup) this.f6247b.getParent()).removeAllViews();
            }
            this.f6247b.removeAllViews();
            this.f6247b.destroy();
            this.f6247b = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m8613f() {
        this.f6247b.loadUrl(m8614g());
    }

    /* renamed from: g */
    private String m8614g() {
        return C2225al.m10083q(this.f6246a);
    }

    /* renamed from: b */
    public View mo6900b() {
        C2188Q.m9853a().mo7684d();
        if (this.f6247b == null) {
            m8611e();
        }
        if (!C2188Q.m9853a().mo7686f()) {
            m8613f();
        } else {
            this.f6247b.mo7696a(this.f6250e);
        }
        return this.f6247b;
    }

    /* renamed from: c */
    public void mo6901c() {
    }
}
