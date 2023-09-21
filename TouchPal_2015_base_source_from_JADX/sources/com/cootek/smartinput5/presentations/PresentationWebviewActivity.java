package com.cootek.smartinput5.presentations;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.iab.C1759a;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.TWebView;
import com.cootek.smartinput5.net.cmd.C2261Q;

public class PresentationWebviewActivity extends C1976b {

    /* renamed from: b */
    private static final String f10783b = "PresentationWebviewActivity";

    /* renamed from: c */
    private static final String f10784c = "network_error.html";

    /* renamed from: a */
    TWebView f10785a;

    /* renamed from: d */
    private Context f10786d;

    /* renamed from: e */
    private boolean f10787e;

    /* renamed from: f */
    private boolean f10788f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f10789g;

    /* renamed from: h */
    private String f10790h;

    /* renamed from: i */
    private IPCManager f10791i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f10792j = true;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10786d = this;
        C1368X.m6317b((Context) this);
        this.f10791i = C1368X.m6320c().mo5839l();
        this.f10791i.bindService();
        this.f10785a = new TWebView(this);
        this.f10785a.setIPCManager(this.f10791i);
        this.f10785a.setActivity(this);
        this.f10785a.setWebPageStatusListener(new C2521v(this));
        this.f10785a.getSettings().setJavaScriptEnabled(true);
        m11196a();
        setContentView(this.f10785a);
        if (this.f10787e) {
            String c = C2188Q.m9853a().mo7683c();
            if (TextUtils.isEmpty(c)) {
                new C1759a(this.f10786d, new C2522w(this)).execute(new String[0]);
            } else {
                m11201a(c);
            }
        }
        this.f10785a.mo7696a(this.f10789g);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11201a(String str) {
        if (!TextUtils.isEmpty(this.f10789g)) {
            m11198a(this, this.f10789g, m11207c());
            if (this.f10789g.contains(C2261Q.f9807m)) {
                this.f10789g += "&auth_token=" + str;
            } else {
                this.f10789g += "?auth_token=" + str;
            }
        }
    }

    /* renamed from: a */
    private void m11196a() {
        boolean z = false;
        Intent intent = getIntent();
        this.f10789g = intent.getStringExtra(C2515q.f10829b);
        if (TextUtils.isEmpty(this.f10789g)) {
            finish();
        }
        String stringExtra = intent.getStringExtra(C2515q.f10834g);
        if (TextUtils.isEmpty(stringExtra)) {
            try {
                requestWindowFeature(1);
            } catch (Exception e) {
            }
        } else {
            setTitle(stringExtra);
        }
        this.f10787e = intent.getBooleanExtra(C2515q.f10832e, false);
        if (this.f10787e) {
            if (!TextUtils.isEmpty(C2188Q.m9853a().mo7683c())) {
                z = true;
            }
            this.f10788f = z;
        } else {
            this.f10788f = true;
        }
        m11197a(1);
        TWebView tWebView = this.f10785a;
        TWebView tWebView2 = this.f10785a;
        tWebView2.getClass();
        tWebView.setIWebChromeClient(new C2523x(this, tWebView2));
        TWebView tWebView3 = this.f10785a;
        TWebView tWebView4 = this.f10785a;
        tWebView4.getClass();
        tWebView3.setWebViewClient(new C2524y(this, tWebView4));
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        if (this.f10785a != null) {
            this.f10785a.mo7698b();
        }
        super.onResume();
    }

    public void onBackPressed() {
        if (this.f10785a != null) {
            if (!this.f10785a.mo7697a()) {
                if (this.f10785a.canGoBack()) {
                    this.f10785a.goBack();
                    return;
                }
            } else {
                return;
            }
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11197a(int i) {
        Message obtain = Message.obtain((Handler) null, 4);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.EXTRA_ACTION_TYPE, 4);
        bundle.putString(C2515q.f10829b, this.f10789g);
        bundle.putInt(C2515q.f10831d, i);
        obtain.setData(bundle);
        try {
            this.f10791i.sendMessage(obtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m11203b() {
        if (!this.f10788f) {
            Message obtain = Message.obtain((Handler) null, 3);
            Bundle bundle = new Bundle();
            bundle.putInt(IPCManager.SETTING_TYPE, 2);
            bundle.putInt(IPCManager.SETTING_KEY, 88);
            bundle.putString(IPCManager.SETTING_VALUE, C2188Q.m9853a().mo7683c());
            obtain.setData(bundle);
            try {
                this.f10791i.sendMessage(obtain);
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: c */
    private String m11207c() {
        if (TextUtils.isEmpty(this.f10790h)) {
            String c = C2188Q.m9853a().mo7683c();
            if (!TextUtils.isEmpty(c)) {
                this.f10790h = "auth_token=" + c + ";path=/";
            }
        }
        return this.f10790h;
    }

    /* renamed from: a */
    private void m11198a(Context context, String str, String str2) {
        C2225al.m10056a(context, str, str2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f10785a != null) {
            if (this.f10785a.getParent() != null) {
                ((ViewGroup) this.f10785a.getParent()).removeAllViews();
            }
            this.f10785a.removeAllViews();
            this.f10785a.destroy();
            this.f10785a = null;
        }
        m11203b();
        super.onDestroy();
        C1368X.m6325e();
        System.gc();
        System.exit(0);
    }

    /* renamed from: d */
    private String m11209d() {
        return C1460o.m6799b().mo6105d(this, f10784c);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m11206b(String str) {
        if (TextUtils.isEmpty(str) && this.f10785a != null) {
            str = this.f10785a.getUrl();
        }
        return !TextUtils.isEmpty(str) && str.indexOf(m11209d()) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m11210e() {
        if (this.f10785a != null) {
            this.f10785a.loadUrl(m11209d());
            this.f10785a.loadUrl("javascript:setReloadUrl(\"" + this.f10789g + "\")");
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        finish();
        return true;
    }
}
