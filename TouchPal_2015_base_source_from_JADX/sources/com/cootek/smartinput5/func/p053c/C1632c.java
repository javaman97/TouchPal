package com.cootek.smartinput5.func.p053c;

import android.app.AlertDialog;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.TextView;
import com.cootek.nativejsapis.JavascriptHandler;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.onestopmanager.C1904a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p053c.C1637h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.vip.PurchaseVipActivity;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.FunctionBar;
import com.cootek.smartinput5.teaching.p065a.C2563e;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.c.c */
/* compiled from: PaopaoManager */
public class C1632c {

    /* renamed from: a */
    public static final String f5297a = "paopao_";

    /* renamed from: b */
    public static final String f5298b = "paopaonew.ser";

    /* renamed from: c */
    public static final String f5299c = "PaopaoManager";

    /* renamed from: d */
    public static final boolean f5300d = false;

    /* renamed from: f */
    private static final int f5301f = 86400;

    /* renamed from: e */
    private final int f5302e = 80;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Context f5303g;

    /* renamed from: h */
    private ArrayList<C1631b> f5304h;

    /* renamed from: i */
    private ArrayList<C1637h.C1638a> f5305i;

    /* renamed from: j */
    private boolean f5306j;

    /* renamed from: k */
    private C1630a f5307k;

    /* renamed from: l */
    private C1637h f5308l;

    public C1632c(Context context) {
        this.f5303g = context;
        this.f5304h = new ArrayList<>();
        this.f5305i = new ArrayList<>();
        this.f5307k = new C1630a(context);
        this.f5308l = new C1637h(context);
    }

    /* renamed from: k */
    private void m7469k() {
        mo6416a(this.f5307k.mo6407c());
        mo6416a(this.f5307k.mo6409e());
        mo6416a(this.f5307k.mo6410f());
        for (C1631b a : this.f5307k.mo6413i()) {
            mo6416a(a);
        }
    }

    /* renamed from: a */
    public C1630a mo6414a() {
        return this.f5307k;
    }

    /* renamed from: a */
    public String mo6415a(int i) {
        return f5297a + (1073741824 ^ i);
    }

    /* renamed from: b */
    public boolean mo6419b(int i) {
        return C1132b.m5654a(this.f5303g).mo4393a(C1135d.CATEGORY_PAOPAO, mo6415a(i), (Boolean) true).booleanValue();
    }

    /* renamed from: b */
    public boolean mo6418b() {
        return mo6419b(1073741824);
    }

    /* renamed from: c */
    public void mo6422c() {
        C1017y.m5213a(f5299c, "pushHotWord");
        C1637h.C1638a a = this.f5308l.mo6438a(this.f5307k.mo6405a("Hotword update test!"));
        ((NotificationManager) this.f5303g.getSystemService("notification")).notify(a.f5318a, a.f5319b);
        Settings.getInstance().setBoolSetting(Settings.SHOW_HOTWORD_PAOPAO, true);
    }

    /* renamed from: d */
    public boolean mo6425d() {
        return Settings.getInstance().getIntSetting(Settings.LANGUAGE_USED_TIMES, 17, C1549b.f4831b, (Config) null) > 3;
    }

    /* renamed from: a */
    public void mo6416a(C1631b bVar) {
        if (mo6419b(bVar.f5285b)) {
            Iterator<C1631b> it = this.f5304h.iterator();
            while (it.hasNext()) {
                if (it.next().f5285b == bVar.f5285b) {
                    return;
                }
            }
            if (bVar.f5286j != 0) {
                this.f5304h.add(bVar);
                this.f5306j = false;
            }
            C1637h.C1638a a = this.f5308l.mo6438a(bVar);
            if (a != null) {
                this.f5305i.add(a);
            }
        }
    }

    /* renamed from: e */
    public void mo6427e() {
        FunctionBar h;
        m7470l();
        if (this.f5306j && (h = Engine.getInstance().getWidgetManager().mo9650h()) != null && this.f5306j) {
            h.mo8550m();
            this.f5306j = false;
        }
        NotificationManager notificationManager = (NotificationManager) this.f5303g.getSystemService("notification");
        try {
            Iterator<C1637h.C1638a> it = this.f5305i.iterator();
            while (it.hasNext()) {
                C1637h.C1638a next = it.next();
                notificationManager.notify(next.f5318a, next.f5319b);
            }
        } catch (Exception e) {
        }
        this.f5305i.clear();
    }

    /* renamed from: l */
    private void m7470l() {
        Iterator<C1631b> it = this.f5304h.iterator();
        while (it.hasNext()) {
            C1631b next = it.next();
            if (next.f5285b == 1073741830) {
                if (Settings.getInstance().getBoolSetting(Settings.SHOW_HOTWORD_PAOPAO)) {
                    next.f5295s = false;
                    next.f5291o = C1630a.f5269q;
                    next.f5287k = C1974m.m9063a(this.f5303g, (int) R.string.download_tab_hotword);
                } else {
                    next.f5291o = C1630a.f5269q;
                }
            }
        }
    }

    /* renamed from: f */
    public void mo6429f() {
        this.f5306j = false;
    }

    /* renamed from: g */
    public int mo6430g() {
        return this.f5304h.size();
    }

    /* renamed from: h */
    public int mo6431h() {
        int i = 0;
        Iterator<C1631b> it = this.f5304h.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            if (!it.next().f5295s) {
                i = i2 + 1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: c */
    public C1631b mo6421c(int i) {
        return this.f5304h.get(i);
    }

    @Deprecated
    /* renamed from: i */
    public C1631b mo6432i() {
        return this.f5307k.mo6403a();
    }

    /* renamed from: b */
    public boolean mo6420b(C1631b bVar) {
        return (bVar.f5285b & 1073741824) != 0;
    }

    /* renamed from: j */
    public boolean mo6433j() {
        return this.f5306j;
    }

    /* renamed from: d */
    public void mo6424d(int i) {
        Iterator<C1631b> it = this.f5304h.iterator();
        while (it.hasNext()) {
            C1631b next = it.next();
            if (next.f5285b == i) {
                this.f5304h.remove(next);
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo6423c(C1631b bVar) {
        bVar.f5295s = true;
    }

    /* renamed from: d */
    public boolean mo6426d(C1631b bVar) {
        int i;
        C2563e.f11002k = true;
        mo6423c(bVar);
        if ((bVar.f5296x & 4) != 0) {
            mo6424d(bVar.f5285b);
        }
        if (bVar.f5286j == 2) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(bVar.f5289m));
            intent.addFlags(Engine.EXCEPTION_ERROR);
            if (Engine.isInitialized()) {
                Engine.getInstance().getIms().requestHideSelf(0);
            }
            this.f5303g.startActivity(intent);
        } else if (bVar.f5286j == 3) {
            if (bVar.f5291o.equals(C1630a.f5266n)) {
                new C1904a(this.f5303g, false).mo7053a();
            } else if (bVar.f5291o.equals(C1630a.f5270r)) {
                m7472n();
            } else {
                if (Engine.isInitialized()) {
                    Engine.getInstance().getIms().requestHideSelf(0);
                }
                Intent intent2 = new Intent(bVar.f5291o);
                Iterator<ResolveInfo> it = this.f5303g.getPackageManager().queryIntentActivities(intent2, 0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (this.f5303g.getPackageName().equals(next.activityInfo.packageName)) {
                        intent2.setClassName(next.activityInfo.packageName, next.activityInfo.name);
                        break;
                    }
                }
                intent2.setFlags(Engine.EXCEPTION_ERROR);
                this.f5303g.startActivity(intent2);
            }
        } else if (bVar.f5286j == 5) {
            C1584bI.m7145b(C1368X.m6313b(), new C1633d(this, bVar), true);
        } else if (bVar.f5286j == 6) {
            Handler handler = new Handler();
            C2563e.f11002k = true;
            C2563e.f11004m = true;
            if (Engine.getInstance().isHandwriteMaskVisible()) {
                i = 80;
            } else {
                i = 0;
            }
            handler.postDelayed(new C1634e(this, bVar), (long) i);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071 A[SYNTHETIC, Splitter:B:34:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076 A[SYNTHETIC, Splitter:B:37:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a0 A[SYNTHETIC, Splitter:B:56:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a5 A[SYNTHETIC, Splitter:B:59:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6417a(boolean r9) {
        /*
            r8 = this;
            r0 = 0
            java.util.ArrayList<com.cootek.smartinput5.func.c.b> r1 = r8.f5304h
            r1.clear()
            r1 = 0
            r2 = 0
            android.content.Context r3 = r8.f5303g     // Catch:{ Exception -> 0x00ba, all -> 0x0099 }
            java.lang.String r4 = "paopaonew.ser"
            java.io.File r3 = com.cootek.smartinput5.func.C1466av.m6849a((android.content.Context) r3, (java.lang.String) r4)     // Catch:{ Exception -> 0x00ba, all -> 0x0099 }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x00ba, all -> 0x0099 }
            if (r4 != 0) goto L_0x002b
            if (r0 == 0) goto L_0x001b
            r2.close()     // Catch:{ IOException -> 0x0021 }
        L_0x001b:
            if (r0 == 0) goto L_0x0020
            r1.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0020:
            return
        L_0x0021:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x001b
        L_0x0026:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0020
        L_0x002b:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00ba, all -> 0x0099 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00ba, all -> 0x0099 }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x00bd, all -> 0x00b3 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00bd, all -> 0x00b3 }
            int r4 = r1.readInt()     // Catch:{ Exception -> 0x006c, all -> 0x00b8 }
            r0 = 0
            r3 = r0
        L_0x003b:
            if (r3 >= r4) goto L_0x007f
            java.lang.Object r0 = r1.readObject()     // Catch:{ Exception -> 0x006c, all -> 0x00b8 }
            com.cootek.smartinput5.func.c.b r0 = (com.cootek.smartinput5.func.p053c.C1631b) r0     // Catch:{ Exception -> 0x006c, all -> 0x00b8 }
            if (r0 == 0) goto L_0x0062
            if (r9 == 0) goto L_0x0066
            boolean r5 = r0.f5295s     // Catch:{ Exception -> 0x006c, all -> 0x00b8 }
            if (r5 != 0) goto L_0x0062
            int r5 = r0.f5285b     // Catch:{ Exception -> 0x006c, all -> 0x00b8 }
            int r5 = r8.m7468f(r5)     // Catch:{ Exception -> 0x006c, all -> 0x00b8 }
            r6 = -1
            if (r5 == r6) goto L_0x0062
            com.cootek.smartinput5.engine.Settings r5 = com.cootek.smartinput5.engine.Settings.getInstance()     // Catch:{ Exception -> 0x006c, all -> 0x00b8 }
            int r0 = r0.f5285b     // Catch:{ Exception -> 0x006c, all -> 0x00b8 }
            int r0 = r8.m7468f(r0)     // Catch:{ Exception -> 0x006c, all -> 0x00b8 }
            r6 = 1
            r5.setBoolSetting(r0, r6)     // Catch:{ Exception -> 0x006c, all -> 0x00b8 }
        L_0x0062:
            int r0 = r3 + 1
            r3 = r0
            goto L_0x003b
        L_0x0066:
            java.util.ArrayList<com.cootek.smartinput5.func.c.b> r5 = r8.f5304h     // Catch:{ Exception -> 0x006c, all -> 0x00b8 }
            r5.add(r0)     // Catch:{ Exception -> 0x006c, all -> 0x00b8 }
            goto L_0x0062
        L_0x006c:
            r0 = move-exception
            r0 = r1
            r1 = r2
        L_0x006f:
            if (r0 == 0) goto L_0x0074
            r0.close()     // Catch:{ IOException -> 0x0094 }
        L_0x0074:
            if (r1 == 0) goto L_0x0020
            r1.close()     // Catch:{ IOException -> 0x007a }
            goto L_0x0020
        L_0x007a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0020
        L_0x007f:
            if (r1 == 0) goto L_0x0084
            r1.close()     // Catch:{ IOException -> 0x008f }
        L_0x0084:
            if (r2 == 0) goto L_0x0020
            r2.close()     // Catch:{ IOException -> 0x008a }
            goto L_0x0020
        L_0x008a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0020
        L_0x008f:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0084
        L_0x0094:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0074
        L_0x0099:
            r1 = move-exception
            r2 = r0
            r7 = r0
            r0 = r1
            r1 = r7
        L_0x009e:
            if (r1 == 0) goto L_0x00a3
            r1.close()     // Catch:{ IOException -> 0x00a9 }
        L_0x00a3:
            if (r2 == 0) goto L_0x00a8
            r2.close()     // Catch:{ IOException -> 0x00ae }
        L_0x00a8:
            throw r0
        L_0x00a9:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x00a3
        L_0x00ae:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x00a8
        L_0x00b3:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x009e
        L_0x00b8:
            r0 = move-exception
            goto L_0x009e
        L_0x00ba:
            r1 = move-exception
            r1 = r0
            goto L_0x006f
        L_0x00bd:
            r1 = move-exception
            r1 = r2
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.p053c.C1632c.mo6417a(boolean):void");
    }

    /* renamed from: f */
    private int m7468f(int i) {
        switch (i) {
            case C1630a.f5257e:
                return Settings.SHOW_PRIVACY_POLICY;
            case C1630a.f5258f:
                return Settings.SHOW_PROMOTE_PINYIN_ADDONS;
            case C1630a.f5260h:
                return Settings.SHOW_FOLLOW_WEIBO;
            case C1630a.f5264l:
                return 115;
            case 1073741842:
                return Settings.FIRST_CHS_MORE;
            case 1073741843:
                return Settings.FIRST_HANDWRITE_TIPS;
            default:
                return -1;
        }
    }

    @Deprecated
    /* renamed from: m */
    private void m7471m() {
        View inflate = ((LayoutInflater) C1368X.m6313b().getSystemService("layout_inflater")).inflate(R.layout.privacy_dialog, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.tv_privacy_msg)).setMovementMethod(ScrollingMovementMethod.getInstance());
        C2894d.C2895a aVar = new C2894d.C2895a(C1368X.m6313b());
        aVar.setIcon(R.drawable.icon_small);
        aVar.setTitle(C1974m.m9063a(this.f5303g, (int) R.string.paopao_privacy_policy_title));
        aVar.setPositiveButton(C1974m.m9063a(this.f5303g, (int) R.string.ok), new C1635f(this, (CheckBox) inflate.findViewById(R.id.cb_agree_privacy)));
        aVar.setOnCancelListener(new C1636g(this));
        aVar.setView(inflate);
        AlertDialog create = aVar.create();
        Window window = create.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.type = C2261Q.f9802h;
        window.setAttributes(attributes);
        window.addFlags(131072);
        create.getWindow().getAttributes().token = Engine.getInstance().getIms().getWindow().getWindow().getDecorView().getWindowToken();
        if (create.getWindow().getAttributes().token != null) {
            create.show();
        }
    }

    /* renamed from: n */
    private void m7472n() {
        if (m7476r()) {
            m7473o();
        } else {
            m7474p();
        }
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
    }

    /* renamed from: o */
    private void m7473o() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        if (C1593bR.m7162a().f5076b) {
            intent.setData(Uri.parse("sinaweibo://userinfo?uid=1885690170&nick=触宝"));
            intent.putExtra(PurchaseVipActivity.f8895a, true);
        } else {
            intent.setData(Uri.parse("https://twitter.com/TouchPal/followers"));
            intent.setPackage("com.twitter.android");
        }
        intent.addFlags(Engine.EXCEPTION_ERROR);
        try {
            this.f5303g.startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }

    /* renamed from: p */
    private void m7474p() {
        Uri parse = Uri.parse("https://twitter.com/TouchPal");
        if (C1593bR.m7162a().f5076b) {
            parse = Uri.parse("http://e.weibo.com/cootek");
        }
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        List<ResolveInfo> queryIntentActivities = this.f5303g.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities != null) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (it.hasNext()) {
                    ResolveInfo next = it.next();
                    if (next.activityInfo != null) {
                        String str = next.activityInfo.packageName;
                        if (!TextUtils.isEmpty(str) && !"android".equals(str) && !str.contains(JavascriptHandler.SHARE_TYPE_TWITTER)) {
                            intent.setPackage(str);
                            break;
                        }
                    }
                }
            }
        }
        try {
            this.f5303g.startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }

    /* renamed from: q */
    private boolean m7475q() {
        if (!C1368X.m6320c().mo5821G().mo7187e()) {
            return true;
        }
        return m7476r();
    }

    /* renamed from: r */
    private boolean m7476r() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        if (C1593bR.m7162a().f5076b) {
            intent.setData(Uri.parse("sinaweibo://userinfo"));
        } else if (!C1368X.m6320c().mo5821G().mo7187e()) {
            return false;
        } else {
            intent.setData(Uri.parse("twitter://user"));
        }
        if (!this.f5303g.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo6428e(int i) {
        switch (i) {
            case C1630a.f5255c:
                Settings.getInstance().setBoolSetting(Settings.SHOW_DIALER_PROMOTE, false);
                return;
            case C1630a.f5260h:
                Settings.getInstance().setBoolSetting(Settings.SHOW_FOLLOW_WEIBO, false);
                return;
            default:
                return;
        }
    }
}
