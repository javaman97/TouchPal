package com.cootek.smartinput5.plugin.twitter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.p066ui.settings.InvitationDialog;

public class TwitterDialog extends C1976b {

    /* renamed from: a */
    public static final String f10521a = "TwitterDialog.EXTRA_NEED_DISABLE_INVITE_DIALOG";

    /* renamed from: b */
    private WebView f10522b;

    /* renamed from: c */
    private C2417r f10523c;

    /* renamed from: d */
    private Handler f10524d;

    /* renamed from: e */
    private IPCManager f10525e;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        if (getIntent().getBooleanExtra(f10521a, false)) {
            this.f10525e = C1368X.m6320c().mo5839l();
            this.f10525e.bindService();
        }
        String stringExtra = getIntent().getStringExtra("requestToken");
        String stringExtra2 = getIntent().getStringExtra(C2417r.f10582k);
        if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
            this.f10523c = C2417r.m11027a();
            this.f10523c.mo8162a(new C2416q(stringExtra, stringExtra2));
            this.f10524d = new Handler();
            this.f10522b = new WebView(this);
            this.f10522b.loadUrl(getIntent().getStringExtra("url"));
            this.f10522b.clearCache(false);
            this.f10522b.getSettings().setJavaScriptEnabled(true);
            this.f10522b.setWebViewClient(new C2399a(this, (C2419t) null));
            addContentView(this.f10522b, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f10525e != null) {
            Message obtain = Message.obtain((Handler) null, 4);
            Bundle bundle = new Bundle();
            bundle.putInt(IPCManager.EXTRA_ACTION_TYPE, 8);
            bundle.putBoolean(InvitationDialog.f13460e, false);
            obtain.setData(bundle);
            try {
                this.f10525e.sendMessage(obtain);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (this.f10525e != null) {
            Message obtain = Message.obtain((Handler) null, 4);
            Bundle bundle = new Bundle();
            bundle.putInt(IPCManager.EXTRA_ACTION_TYPE, 8);
            bundle.putBoolean(InvitationDialog.f13460e, true);
            obtain.setData(bundle);
            try {
                this.f10525e.sendMessage(obtain);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (C1368X.m6324d()) {
            C1368X.m6325e();
        }
        ((ViewGroup) this.f10522b.getParent()).removeAllViews();
        this.f10522b.removeAllViews();
        this.f10522b.destroy();
        this.f10522b = null;
        System.gc();
        System.exit(0);
    }

    /* renamed from: com.cootek.smartinput5.plugin.twitter.TwitterDialog$a */
    private class C2399a extends WebViewClient {
        private C2399a() {
        }

        /* synthetic */ C2399a(TwitterDialog twitterDialog, C2419t tVar) {
            this();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.startsWith(C2417r.f10579h) || str.contains("denied")) {
                TwitterDialog.this.finish();
                return true;
            }
            new C2420u(this, str).start();
            return true;
        }
    }

    /* renamed from: a */
    private void m10986a(C2416q qVar) {
        if (qVar != null) {
            Bundle bundle = new Bundle();
            bundle.putString(C2417r.f10583l, qVar.mo8150a());
            bundle.putString(C2417r.f10584m, qVar.mo8155c());
            bundle.putString(C2417r.f10585n, this.f10523c.mo8174e());
            bundle.putString(C2417r.f10586o, this.f10523c.mo8175f());
            Intent intent = new Intent();
            intent.setClass(this, FollowActivity.class);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10987a(String str) {
        String string = C2409j.m11013b(str).getString(C2409j.f10557o);
        if (this.f10523c.mo8165b() != null) {
            this.f10523c.mo8171c(string);
            C2416q qVar = null;
            try {
                qVar = this.f10523c.mo8178i();
            } catch (C2421v e) {
                this.f10524d.post(new C2419t(this, e));
                e.printStackTrace();
            }
            m10986a(qVar);
        }
    }
}
