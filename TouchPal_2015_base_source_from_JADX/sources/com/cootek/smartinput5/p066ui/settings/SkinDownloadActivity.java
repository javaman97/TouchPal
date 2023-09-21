package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1396aI;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.TWebView;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.SkinDownloadActivity */
public class SkinDownloadActivity extends C1976b implements C1396aI.C1397a {

    /* renamed from: a */
    public static final int f13707a = 0;

    /* renamed from: b */
    public static final int f13708b = 1;

    /* renamed from: c */
    public static final String f13709c = "tabNumber";

    /* renamed from: d */
    public static final String f13710d = "tabShowingHotword";

    /* renamed from: e */
    public static final String f13711e = "targetSkinPkg";

    /* renamed from: f */
    SkinInfoHandler f13712f;

    /* renamed from: g */
    LinearLayout f13713g;

    /* renamed from: h */
    Button f13714h;

    /* renamed from: i */
    Button f13715i;

    /* renamed from: j */
    TWebView f13716j;

    /* renamed from: k */
    int f13717k;

    /* renamed from: l */
    int f13718l;

    /* renamed from: m */
    boolean f13719m;

    /* renamed from: n */
    ShareFrame f13720n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public IPCManager f13721o = null;

    /* renamed from: p */
    private Messenger f13722p;

    /* renamed from: q */
    private Handler f13723q = new C3124cS(this);

    /* renamed from: r */
    private View.OnClickListener f13724r = new C3127cV(this);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        C1368X.m6320c().mo5827M().mo5991a(true);
        this.f13721o = C1368X.m6320c().mo5839l();
        this.f13721o.bindService();
        m14061i();
        setContentView(R.layout.skin_download);
        m14059e();
        switch (this.f13717k) {
            case 0:
                this.f13714h.setSelected(true);
                m14050a();
                m14051a(this.f13716j, m14057d());
                break;
            case 1:
                m14053b();
                this.f13715i.setSelected(true);
                m14051a(this.f13716j, m14055c());
                break;
        }
        this.f13718l = this.f13717k;
    }

    /* renamed from: a */
    private void m14050a() {
        if (this.f13720n != null) {
            this.f13720n.setVisibility(0);
            m14060f();
        }
    }

    /* renamed from: b */
    private void m14053b() {
        if (this.f13720n != null) {
            this.f13720n.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5827M().mo5998d(3);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f13712f = null;
        if (this.f13716j != null) {
            if (this.f13716j.getParent() != null) {
                ((ViewGroup) this.f13716j.getParent()).removeAllViews();
            }
            this.f13716j.removeAllViews();
            this.f13716j.destroy();
            this.f13716j = null;
        }
        super.onDestroy();
        C1368X.m6320c().mo5839l().destroy();
        C1368X.m6325e();
        System.gc();
        System.exit(0);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!this.f13716j.canGoBack() || this.f13716j.getUrl().equals(m14057d()) || this.f13716j.getUrl().equals(m14055c())) {
            finish();
            return true;
        }
        this.f13716j.goBack();
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5827M().mo5998d(2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m14055c() {
        String str = C2225al.m10054a((Context) this, C1974m.m9063a((Context) this, C1593bR.m7162a().mo6232a(13))) + C2225al.m10055a((Context) this, (String) null, 255);
        String stringSetting = Settings.getInstance().getStringSetting(Settings.CURRENT_HOTWORD_DICTIONARY_ID);
        if (TextUtils.isEmpty(stringSetting)) {
            return str;
        }
        return str + C2261Q.f9808n + ("dictionary_id=" + Uri.encode(stringSetting));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public String m14057d() {
        return C2225al.m10054a((Context) this, getResString(C1593bR.m7162a().mo6232a(11)));
    }

    /* renamed from: e */
    private void m14059e() {
        Intent intent = getIntent();
        this.f13717k = intent.getIntExtra("tabNumber", 0);
        this.f13719m = false;
        this.f13713g = (LinearLayout) findViewById(R.id.download_tabs);
        this.f13714h = (Button) this.f13713g.findViewById(R.id.skin_tab);
        this.f13714h.setOnClickListener(this.f13724r);
        this.f13715i = (Button) findViewById(R.id.hotword_tab);
        this.f13715i.setOnClickListener(this.f13724r);
        if (this.f13719m) {
            this.f13713g.setVisibility(0);
        } else {
            this.f13713g.setVisibility(8);
        }
        this.f13716j = (TWebView) findViewById(R.id.skin_download_view);
        this.f13716j.getSettings().setJavaScriptEnabled(true);
        this.f13712f = new SkinInfoHandler(this, this.f13716j);
        this.f13712f.setTargetPackageName(intent.getStringExtra(f13711e));
        this.f13716j.addJavascriptInterface(this.f13712f, "skinListInfo");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14051a(TWebView tWebView, String str) {
        C1584bI.m7131a((Context) this, (Runnable) new C3125cT(this, tWebView, str), (Runnable) new C3126cU(this), false);
    }

    /* renamed from: a */
    public void mo4239a(int i) {
        m14060f();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m14060f() {
        String resString;
        if (this.f13720n == null) {
            return;
        }
        if (!C1368X.m6320c().mo5827M().mo5992a()) {
            this.f13720n.setVisibility(8);
            return;
        }
        int a = C1368X.m6320c().mo5827M().mo5986a(1);
        if (a > 0) {
            resString = getResString(R.string.optpage_language_limitation, Integer.valueOf(a));
        } else {
            resString = getResString(R.string.optpage_reach_limitation);
        }
        runOnUiThread(new C3128cW(this, a, resString));
    }

    /* renamed from: g */
    public int mo4250g() {
        return 1;
    }

    /* renamed from: h */
    public void mo4251h() {
        if (this.f13720n != null) {
            this.f13720n.setVisibility(8);
        }
    }

    /* renamed from: i */
    private void m14061i() {
        if (this.f13721o != null && this.f13722p == null) {
            this.f13722p = new Messenger(this.f13723q);
            Message obtain = Message.obtain((Handler) null, 1);
            obtain.replyTo = this.f13722p;
            try {
                this.f13721o.sendMessage(obtain);
            } catch (RemoteException e) {
            }
        }
    }
}
