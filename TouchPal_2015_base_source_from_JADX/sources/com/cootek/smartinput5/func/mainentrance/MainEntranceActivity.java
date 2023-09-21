package com.cootek.smartinput5.func.mainentrance;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.smartinput5.action.ActionCollectData;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.TouchPalInfo;
import com.cootek.smartinput5.func.p053c.C1630a;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

public class MainEntranceActivity extends C1976b {

    /* renamed from: a */
    public static final String f6140a = "tabNumber";

    /* renamed from: b */
    public static final String f6141b = "fromNotification";

    /* renamed from: c */
    private static final int f6142c = 2000;

    /* renamed from: d */
    private C1843a[] f6143d;

    /* renamed from: e */
    private C1872x f6144e;

    /* renamed from: f */
    private C1843a f6145f;

    /* renamed from: g */
    private FrameLayout f6146g;

    /* renamed from: h */
    private IPCManager f6147h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f6148i;

    /* renamed from: j */
    private boolean f6149j = false;

    /* renamed from: k */
    private long f6150k = 0;

    /* renamed from: l */
    private C1850e f6151l;

    /* renamed from: com.cootek.smartinput5.func.mainentrance.MainEntranceActivity$a */
    public interface C1843a {
        /* renamed from: b */
        View mo6900b();

        /* renamed from: c */
        void mo6901c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.main_entrance);
        this.f6149j = false;
        m8476a();
    }

    /* renamed from: a */
    private void m8476a() {
        C1368X.m6317b((Context) this);
        this.f6147h = C1368X.m6320c().mo5839l();
        m8485e();
        m8484d();
        m8481b();
        m8482c();
        if (this.f6151l != null) {
            this.f6151l.mo6903a(m8490j());
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f6147h.bindService();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f6148i = "";
        m8489i();
        if (this.f6151l != null) {
            this.f6151l.mo6919c(m8490j());
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m8486f();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (!TextUtils.isEmpty(this.f6148i)) {
            m8479a("HOTWORD/BROWSE", C1246d.f3836c, this.f6148i, 1);
        }
    }

    public void onBackPressed() {
        if (System.currentTimeMillis() - this.f6150k > 2000) {
            Toast.makeText(getApplicationContext(), C1974m.m9063a(getApplicationContext(), (int) R.string.click_back_again_toast), 0).show();
            this.f6150k = System.currentTimeMillis();
            return;
        }
        m8486f();
        this.f6144e.mo6979a();
        C1368X.m6325e();
        super.onBackPressed();
    }

    /* renamed from: b */
    private void m8481b() {
        this.f6143d = new C1843a[]{new C1859m(this)};
        this.f6144e = new C1872x(this);
        this.f6144e.mo6980a(this.f6147h);
        this.f6144e.mo6981a((Object) new WebOperationHandler(), "WebOperation");
        this.f6144e.mo6981a((Object) new TouchPalInfo(this), "tpInfo");
    }

    /* renamed from: c */
    private void m8482c() {
        this.f6146g = (FrameLayout) findViewById(R.id.content_frame);
    }

    /* renamed from: d */
    private void m8484d() {
        ((TextView) findViewById(R.id.title)).setText(C1974m.m9063a((Context) this, C1593bR.m7162a().mo6232a(16)));
        ((ImageView) findViewById(R.id.setting_image)).setOnClickListener(new C1848c(this));
    }

    /* renamed from: e */
    private void m8485e() {
        this.f6151l = new C1850e(getApplicationContext(), new C1849d(this));
        this.f6151l.mo6920d();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.main_entrance_switch_tabs);
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            frameLayout.addView(this.f6151l.mo6902a());
        }
        if (this.f6151l.mo6921e() < 0) {
            finish();
        }
        this.f6151l.mo6903a(m8490j());
    }

    /* renamed from: f */
    private void m8486f() {
        m8487g();
        if (this.f6143d != null) {
            for (C1843a c : this.f6143d) {
                c.mo6901c();
            }
        }
        if (this.f6144e != null) {
            this.f6144e.mo6901c();
        }
    }

    /* renamed from: g */
    private void m8487g() {
        if (this.f6149j) {
            Message obtain = Message.obtain((Handler) null, 3);
            Bundle bundle = new Bundle();
            bundle.putInt(IPCManager.SETTING_TYPE, 3);
            bundle.putInt(IPCManager.SETTING_KEY, Settings.SHOW_HOTWORD_PAOPAO);
            bundle.putBoolean(IPCManager.SETTING_VALUE, false);
            obtain.setData(bundle);
            try {
                this.f6147h.sendMessage(obtain);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    private boolean m8488h() {
        Intent intent = getIntent();
        if (TextUtils.isEmpty(intent.getAction()) || !intent.getAction().equals(C1630a.f5269q)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m8489i() {
        if (getIntent().getIntExtra("tabNumber", -1) == 1) {
            C1368X.m6320c().mo5839l().notifyOtherProcesses(Message.obtain((Handler) null, 12));
            ((NotificationManager) getApplicationContext().getSystemService("notification")).cancel(C1630a.f5256d);
            if (getIntent().getBooleanExtra("fromNotification", false)) {
                m8479a("HOTWORD/NOTIFICATION", C1246d.f3836c, "CLICK", 1);
            }
        }
    }

    /* renamed from: j */
    private int m8490j() {
        if (m8488h()) {
            return 1;
        }
        int f = this.f6151l.mo6922f();
        if (f == 0) {
            f = this.f6151l.mo6921e();
        }
        return getIntent().getIntExtra("tabNumber", f);
    }

    /* renamed from: a */
    private String m8474a(int i) {
        C1135d dVar;
        C1135d dVar2;
        int a;
        switch (i) {
            case 1:
                this.f6149j = true;
                if (C1593bR.m7162a().f5075a) {
                    dVar = C1135d.DOWNLOAD_HOTWORD_URL_INTERNATIONAL;
                } else {
                    dVar = C1135d.DOWNLOAD_HOTWORD_URL_MAINLAND;
                }
                a = C1593bR.m7162a().mo6232a(13);
                break;
            case 2:
                if (C1593bR.m7162a().f5075a) {
                    dVar2 = C1135d.RECOMMENDER_URL_INTERNATIONAL;
                } else {
                    dVar2 = C1135d.RECOMMENDER_URL_MAINLAND;
                }
                a = C1593bR.m7162a().mo6232a(12);
                break;
            default:
                dVar2 = null;
                a = -1;
                break;
        }
        if (a == -1 || dVar2 == null) {
            return null;
        }
        String a2 = C1132b.m5654a((Context) this).mo4402a(dVar2, C2225al.m10054a((Context) this, C1974m.m9063a((Context) this, a)));
        if (i != 1) {
            return a2;
        }
        String str = a2 + C2225al.m10055a((Context) this, (String) null, 255);
        String stringSetting = Settings.getInstance().getStringSetting(Settings.CURRENT_HOTWORD_DICTIONARY_ID);
        if (!TextUtils.isEmpty(stringSetting)) {
            str = str + C2261Q.f9808n + ("dictionary_id=" + Uri.encode(stringSetting));
        }
        long longSetting = Settings.getInstance().getLongSetting(Settings.HOTWORD_PAGE_ACCESS_TIME);
        long currentTimeMillis = System.currentTimeMillis();
        m8479a("HOTWORD/OPERATION", C1246d.f3836c, C1246d.f3948t, 1);
        if (currentTimeMillis - longSetting <= 1800000) {
            return str;
        }
        m8479a("HOTWORD/OPERATION", C1246d.f3836c, C1246d.f3949u, 1);
        Message obtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 4);
        bundle.putInt(IPCManager.SETTING_KEY, Settings.HOTWORD_PAGE_ACCESS_TIME);
        bundle.putLong(IPCManager.SETTING_VALUE, currentTimeMillis);
        obtain.setData(bundle);
        try {
            this.f6147h.sendMessage(obtain);
            return str;
        } catch (RemoteException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: b */
    private View m8480b(int i) {
        String a = m8474a(i);
        if (a != null) {
            this.f6144e.mo6982a(a);
            this.f6145f = this.f6144e;
        } else {
            this.f6145f = this.f6143d[i];
        }
        return this.f6145f.mo6900b();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m8483c(int i) {
        if (this.f6146g != null) {
            this.f6146g.removeAllViews();
            this.f6146g.addView(m8480b(i));
            this.f6146g.requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C1056a.m5588a().mo4266b();
        C1060e.m5598b().mo4276c();
        super.onDestroy();
        System.gc();
        System.exit(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8479a(String str, String str2, String str3, int i) {
        try {
            this.f6147h.sendMessageForParcelableAction(new ActionCollectData(str, str2, str3, i));
        } catch (RemoteException e) {
        }
    }

    public class WebOperationHandler {
        public WebOperationHandler() {
        }

        public void clickHotword(String str) {
            String unused = MainEntranceActivity.this.f6148i = str;
            if (!TextUtils.isEmpty(str)) {
                MainEntranceActivity.this.m8479a("HOTWORD/OPERATION", C1246d.f3836c, "CLICK", 1);
            }
        }
    }
}
