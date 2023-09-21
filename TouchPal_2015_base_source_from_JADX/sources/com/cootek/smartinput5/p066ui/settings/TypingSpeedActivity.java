package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.TypingSpeedData;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.TWebView;
import com.cootek.smartinput5.net.cmd.C2257N;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.cootek.smartinput5.ui.settings.TypingSpeedActivity */
public class TypingSpeedActivity extends C1976b implements C2373x.C2376b {

    /* renamed from: a */
    public static final String f13762a = "TYPING_SPEED_DATA";

    /* renamed from: b */
    public static final String f13763b = "LANGAUGE_CATEGORIES";

    /* renamed from: c */
    public static final String f13764c = "CURRENT_CATEGORY";

    /* renamed from: g */
    private static final String f13765g = "TypingSpeedActivity";

    /* renamed from: d */
    public TypingSpeedData f13766d;

    /* renamed from: e */
    public String[] f13767e;

    /* renamed from: f */
    public String f13768f;

    /* renamed from: h */
    private boolean f13769h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f13770i;

    /* renamed from: j */
    private TWebView f13771j;

    /* renamed from: k */
    private TypingSpeedHandler f13772k;

    /* renamed from: l */
    private String f13773l;

    /* renamed from: m */
    private ArrayList<C2257N> f13774m;

    /* renamed from: n */
    private IPCManager f13775n;

    /* renamed from: a */
    public static Intent m14134a(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        C1368X c = C1368X.m6320c();
        String stringSetting = Settings.getInstance().getStringSetting(10);
        HashSet<String> j = c.mo5842o().mo5950j();
        intent.putExtra(f13762a, c.mo5822H().mo6203e());
        intent.putExtra(f13763b, (String[]) j.toArray(new String[j.size()]));
        intent.putExtra(f13764c, c.mo5835h().getLanguageCategory(stringSetting, 10));
        intent.setClass(context, TypingSpeedActivity.class);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m14136a();
        m14139b();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f13775n.bindService();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f13771j != null) {
            if (this.f13771j.getParent() != null) {
                ((ViewGroup) this.f13771j.getParent()).removeAllViews();
            }
            this.f13771j.removeAllViews();
            this.f13771j.destroy();
        }
        m14141d();
        this.f13775n = null;
        C1368X.m6325e();
        System.exit(0);
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        m14140c();
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        m14140c();
    }

    /* renamed from: a */
    private void m14136a() {
        C1368X.m6317b((Context) this);
        Bundle extras = getIntent().getExtras();
        this.f13766d = (TypingSpeedData) extras.getParcelable(f13762a);
        this.f13767e = extras.getStringArray(f13763b);
        this.f13768f = extras.getString(f13764c);
        setContentView(R.layout.typing_speed);
        this.f13769h = !TextUtils.isEmpty(C2188Q.m9853a().mo7683c());
        this.f13770i = C1974m.m9063a((Context) this, C1593bR.m7162a().mo6232a(14));
        this.f13770i = C2225al.m10054a((Context) this, this.f13770i);
        this.f13771j = (TWebView) findViewById(R.id.typing_speed_view);
        this.f13771j.getSettings().setJavaScriptEnabled(true);
        this.f13772k = new TypingSpeedHandler(this, this.f13771j);
        this.f13771j.addJavascriptInterface(this.f13772k, "typingSpeedHandler");
        TWebView tWebView = this.f13771j;
        tWebView.getClass();
        this.f13771j.setIWebChromeClient(new C3187dY(this, tWebView));
        TWebView tWebView2 = this.f13771j;
        TWebView tWebView3 = this.f13771j;
        tWebView3.getClass();
        tWebView2.setWebViewClient(new C3188dZ(this, tWebView3));
        this.f13771j.setOnProgressCancelListener(new C3216ea(this));
        this.f13774m = new ArrayList<>();
        this.f13775n = C1368X.m6320c().mo5839l();
        this.f13771j.setIPCManager(this.f13775n);
    }

    /* renamed from: b */
    private void m14139b() {
        for (String str : this.f13767e) {
            for (int i = 0; i < TypingSpeedData.f4228d; i++) {
                TypingSpeedData.Meta a = this.f13766d.mo5797a(str, i);
                if (a != null) {
                    C2257N n = new C2257N();
                    n.f9685a = str;
                    n.f9686b = TypingSpeedData.f4227c[i];
                    n.f9687c = a.f4236d;
                    n.f9688d = a.f4233a;
                    n.f9689e = a.f4235c;
                    n.f9690f = a.f4234b;
                    this.f13774m.add(n);
                }
            }
        }
        this.f13771j.mo7699c();
        if (this.f13774m.size() > 0) {
            m14138a(this.f13774m.get(0));
        }
    }

    /* renamed from: a */
    private void m14138a(C2257N n) {
        new C2373x(n).mo8060a((C2373x.C2376b) this);
    }

    /* renamed from: c */
    private void m14140c() {
        this.f13774m.remove(0);
        if (this.f13774m.size() > 0) {
            m14138a(this.f13774m.get(0));
        } else {
            m14143f();
        }
    }

    /* renamed from: d */
    private void m14141d() {
        if (!this.f13769h) {
            Message obtain = Message.obtain((Handler) null, 3);
            Bundle bundle = new Bundle();
            bundle.putInt(IPCManager.SETTING_TYPE, 2);
            bundle.putInt(IPCManager.SETTING_KEY, 88);
            bundle.putString(IPCManager.SETTING_VALUE, C2188Q.m9853a().mo7683c());
            obtain.setData(bundle);
            try {
                this.f13775n.sendMessage(obtain);
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: e */
    private String m14142e() {
        if (TextUtils.isEmpty(this.f13773l)) {
            String c = C2188Q.m9853a().mo7683c();
            if (!TextUtils.isEmpty(c)) {
                this.f13773l = "auth_token=" + c + ";path=/";
            }
        }
        return this.f13773l;
    }

    /* renamed from: a */
    private void m14137a(Context context, String str, String str2) {
        CookieSyncManager.createInstance(context);
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        instance.setCookie(str, str2);
        CookieSyncManager.getInstance().sync();
    }

    /* renamed from: f */
    private void m14143f() {
        m14137a(this, this.f13770i, m14142e());
        this.f13771j.mo7696a(this.f13770i + ("?lang=" + this.f13768f));
    }
}
