package com.cootek.smartinput5.func;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.vip.PurchaseVipActivity;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2301v;
import com.cootek.smartinput5.net.cmd.C2303x;
import com.cootek.smartinput5.net.login.C2339l;
import com.cootek.smartinput5.net.login.TLoginActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.br */
/* compiled from: TAccountManager */
public class C1617br {

    /* renamed from: a */
    private static final String f5200a = "TAccountManager";

    /* renamed from: b */
    private static C1617br f5201b;

    /* renamed from: c */
    private C2339l f5202c;

    /* renamed from: d */
    private ArrayList<C1620c> f5203d = new ArrayList<>();

    /* renamed from: com.cootek.smartinput5.func.br$a */
    /* compiled from: TAccountManager */
    public interface C1618a {
        /* renamed from: a */
        void mo6073a(boolean z);
    }

    /* renamed from: com.cootek.smartinput5.func.br$b */
    /* compiled from: TAccountManager */
    public enum C1619b {
        Trial,
        Google
    }

    /* renamed from: com.cootek.smartinput5.func.br$c */
    /* compiled from: TAccountManager */
    public interface C1620c {
        /* renamed from: a */
        void mo6058a(String str, String str2);
    }

    /* renamed from: a */
    public static C1617br m7367a() {
        if (f5201b == null) {
            f5201b = new C1617br();
        }
        return f5201b;
    }

    private C1617br() {
        m7371k();
    }

    /* renamed from: a */
    public void mo6328a(C1618a aVar) {
        new C2373x(new C2303x()).mo8060a((C2373x.C2376b) new C1621bs(this, aVar));
    }

    /* renamed from: a */
    public void mo6330a(C2339l lVar) {
        m7369a(this.f5202c, lVar);
        this.f5202c = lVar;
        m7372l();
    }

    /* renamed from: b */
    public boolean mo6335b() {
        return C2339l.f10313m.equals(mo6340g().mo7965e());
    }

    /* renamed from: c */
    public long mo6336c() {
        return mo6340g().mo7966f();
    }

    /* renamed from: a */
    public boolean mo6332a(C1619b bVar) {
        if (bVar == null) {
            return false;
        }
        String j = mo6340g().mo7970j();
        if (!mo6340g().mo7969i() || !bVar.toString().equals(j)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo6337d() {
        String e = mo6340g().mo7965e();
        return e != null && !e.equals(C2339l.f10311k);
    }

    /* renamed from: e */
    public boolean mo6338e() {
        if (mo6340g().mo7967g() == 0 || mo6340g().mo7967g() >= System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo6339f() {
        m7371k();
    }

    /* renamed from: g */
    public C2339l mo6340g() {
        if (this.f5202c == null) {
            this.f5202c = new C2339l();
        }
        return this.f5202c;
    }

    /* renamed from: h */
    public int mo6341h() {
        long g = mo6340g().mo7967g();
        float h = (float) mo6340g().mo7968h();
        if (g == 0) {
            return 0;
        }
        if (h > 0.0f) {
            return (int) Math.ceil((double) (((h / 24.0f) / 60.0f) / 60.0f));
        }
        return (int) Math.floor((double) ((((g - (System.currentTimeMillis() / 1000)) / 24) / 60) / 60));
    }

    /* renamed from: a */
    public void mo6327a(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, PurchaseVipActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        context.startActivity(intent);
    }

    /* renamed from: k */
    private void m7371k() {
        if (Settings.isInitialized()) {
            mo6330a(new C2339l(Settings.getInstance().getStringSetting(Settings.ACCOUNT_INFO)));
        }
    }

    /* renamed from: l */
    private void m7372l() {
        if (Settings.isInitialized()) {
            String b = this.f5202c == null ? "" : this.f5202c.mo7962b();
            if (b == null) {
                b = "";
            }
            Settings.getInstance().setStringSetting(Settings.ACCOUNT_INFO, b);
        }
    }

    /* renamed from: b */
    public void mo6333b(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, TLoginActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo6326a(Activity activity, int i) {
        Intent intent = new Intent();
        intent.setClass(activity, TLoginActivity.class);
        activity.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public void mo6331a(C2373x.C2376b bVar) {
        new C2373x(new C2301v()).mo8060a((C2373x.C2376b) new C1622bt(this, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m7373m() {
        mo6330a(new C2339l());
        m7374n();
    }

    /* renamed from: a */
    private void m7369a(C2339l lVar, C2339l lVar2) {
        String str;
        String str2 = null;
        if (lVar != null) {
            str = lVar.mo7965e();
        } else {
            str = null;
        }
        if (lVar2 != null) {
            str2 = lVar2.mo7965e();
        }
        if (!TextUtils.equals(str, str2)) {
            m7370a(str, str2);
        }
    }

    /* renamed from: a */
    public void mo6329a(C1620c cVar) {
        if (cVar != null && !this.f5203d.contains(cVar)) {
            this.f5203d.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo6334b(C1620c cVar) {
        if (this.f5203d.contains(cVar)) {
            this.f5203d.remove(cVar);
        }
    }

    /* renamed from: a */
    private void m7370a(String str, String str2) {
        Iterator it = new ArrayList(this.f5203d).iterator();
        while (it.hasNext()) {
            ((C1620c) it.next()).mo6058a(str, str2);
        }
    }

    /* renamed from: n */
    private void m7374n() {
        String c = C2188Q.m9853a().mo7683c();
        Message obtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 2);
        bundle.putInt(IPCManager.SETTING_KEY, 88);
        bundle.putString(IPCManager.SETTING_VALUE, c);
        obtain.setData(bundle);
        C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
    }

    /* renamed from: i */
    public void mo6342i() {
        Message obtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 2);
        bundle.putInt(IPCManager.SETTING_KEY, Settings.ACCOUNT_INFO);
        bundle.putString(IPCManager.SETTING_VALUE, this.f5202c == null ? "" : this.f5202c.mo7962b());
        obtain.setData(bundle);
        C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
    }

    /* renamed from: j */
    public boolean mo6343j() {
        return mo6340g().mo7971k();
    }
}
