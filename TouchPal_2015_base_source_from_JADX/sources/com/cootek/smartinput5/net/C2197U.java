package com.cootek.smartinput5.net;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput.utilities.C1011s;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1441aq;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1608bk;
import com.cootek.smartinput5.func.C1810j;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.C1960r;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.smileypanel.C2003a;
import com.cootek.smartinput5.net.C2183M;
import com.cootek.smartinput5.net.C2364s;
import com.cootek.smartinput5.p066ui.control.CancelDownloadActivity;
import com.cootek.smartinput5.p066ui.control.RetryDownloadActivity;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.net.U */
/* compiled from: NonApkDownloader */
public class C2197U extends C2183M {

    /* renamed from: o */
    public static final String f9277o = "cootek.smartinput.android.language.";

    /* renamed from: p */
    public static final String f9278p = "cootek.smartinput.android.emoji.";

    /* renamed from: q */
    public static final String f9279q = "cootek.smartinput.android.";

    /* renamed from: r */
    public static final String f9280r = "cootek.smartinput.android.celldict.";

    /* renamed from: s */
    public static final int f9281s = 1;

    /* renamed from: t */
    public static final int f9282t = 2;

    /* renamed from: u */
    private static final String f9283u = "cootek.smartinput.android.language_addition.handwrite.";

    /* renamed from: v */
    private static final String f9284v = "cootek.smartinput.android.language_addition.";

    /* renamed from: w */
    private static final String f9285w = "cootek.smartinput.android.curve.";

    /* renamed from: A */
    private Hashtable<Integer, C1011s<Integer, Integer>> f9286A = new Hashtable<>();

    /* renamed from: x */
    private final String f9287x = C1974m.m9063a(this.f9237n, (int) R.string.app_id_skin_prefix);

    /* renamed from: y */
    private boolean f9288y = false;

    /* renamed from: z */
    private List<Integer> f9289z = new ArrayList();

    public C2197U(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo7672l() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C2364s.C2365a mo7669i() {
        if (this.f9288y) {
            return null;
        }
        return new C2202e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C2364s.C2365a mo7670j() {
        if (this.f9288y) {
            return null;
        }
        return new C2199b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C2364s.C2365a mo7671k() {
        if (this.f9288y) {
            return null;
        }
        return new C2198a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2364s.C2365a mo7645a(int i, String str, int i2) {
        if (i2 == 1) {
            return new C2201d(i, str);
        }
        return new C2200c(i, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7657c(String str) {
        if (TextUtils.isEmpty(str)) {
            return super.mo7657c(str);
        }
        if (str.startsWith(f9277o)) {
            return str.substring(str.lastIndexOf(46) + 1, str.length()) + C1389aD.f4370f;
        }
        if (str.startsWith("cootek.smartinput.android.celldict.")) {
            return str.substring(str.lastIndexOf(46) + 1, str.length()) + C1960r.f6678a;
        }
        if (str.startsWith(this.f9287x)) {
            return str.substring(str.lastIndexOf(46) + 1, str.length()) + C1602bh.f5114c;
        }
        if (str.startsWith(f9278p)) {
            return str.substring(str.lastIndexOf(46) + 1, str.length()) + C2003a.f6952a;
        }
        return super.mo7657c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public File mo7653b(String str) {
        File a;
        if (TextUtils.isEmpty(str)) {
            return super.mo7653b(str);
        }
        if (str.startsWith(f9277o)) {
            File a2 = C1358O.m6234a("language");
            if (a2 == null) {
                a2 = new File(C1466av.m6848a(this.f9237n).getAbsoluteFile() + File.separator + "language");
            }
            if (a2 != null) {
                return a2;
            }
        } else if (str.startsWith(f9283u)) {
            File a3 = C1358O.m6234a(C1358O.f4195f);
            if (a3 != null) {
                return a3;
            }
        } else if (str.startsWith(C1608bk.f5176c)) {
            File a4 = C1358O.m6234a(C1358O.f4193d);
            if (a4 != null) {
                return a4;
            }
        } else if (str.startsWith(f9284v)) {
            File a5 = C1358O.m6234a(C1358O.f4199j);
            if (a5 != null) {
                return a5;
            }
        } else if (str.startsWith("cootek.smartinput.android.curve.")) {
            File a6 = C1358O.m6234a(C1358O.f4194e);
            if (a6 != null) {
                return a6;
            }
        } else if (str.startsWith(this.f9287x)) {
            File a7 = C1358O.m6234a("skin");
            if (a7 != null) {
                return a7;
            }
        } else if (str.startsWith(f9278p) && (a = C1358O.m6234a((String) C1358O.f4207r)) != null) {
            return a;
        }
        return super.mo7653b(str);
    }

    /* renamed from: com.cootek.smartinput5.net.U$e */
    /* compiled from: NonApkDownloader */
    public class C2202e extends C2364s.C2365a {

        /* renamed from: g */
        public PendingIntent f9299g;

        /* renamed from: h */
        public int f9300h = 0;

        /* renamed from: i */
        public int f9301i = 0;

        public C2202e() {
            this.f10421e.icon = R.drawable.icon_downloading;
            this.f10421e.flags = 2;
            this.f9299g = mo8030a(C2197U.this.mo7672l(), 0, 0);
        }

        /* renamed from: c */
        public void mo7718c() {
            String d = C2197U.this.mo7660d(0);
            StringBuilder sb = new StringBuilder();
            if (this.f9301i > 0) {
                sb.append("" + ((int) ((((float) this.f9300h) / ((float) this.f9301i)) * 100.0f)) + "%");
                sb.append("(" + (this.f9300h / 1024) + "KB / " + (this.f9301i / 1024) + "KB" + ")");
            }
            this.f10421e.tickerText = d;
            this.f10421e.setLatestEventInfo(C2197U.this.f9237n, d, sb.toString(), this.f9299g);
        }

        /* renamed from: d */
        public void mo7719d() {
            Intent intent = new Intent(C2197U.this.f9237n, CancelDownloadActivity.class);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            intent.putExtra("TYPE", C2197U.this.mo7672l());
            intent.putExtra("FILENAME", C2197U.this.mo7660d(0));
            C2197U.this.f9237n.startActivity(intent);
        }
    }

    /* renamed from: com.cootek.smartinput5.net.U$b */
    /* compiled from: NonApkDownloader */
    public class C2199b extends C2364s.C2365a {

        /* renamed from: g */
        public PendingIntent f9292g;

        public C2199b() {
            this.f10421e.flags = 16;
            this.f9292g = mo8030a(C2197U.this.mo7672l(), 0, 1);
            this.f10421e.deleteIntent = mo8030a(C2197U.this.mo7672l(), 1, 1);
        }

        /* renamed from: c */
        public void mo7718c() {
            String a = C1974m.m9064a(C2197U.this.f9237n, (int) R.string.paopao_download_finish_title, Integer.valueOf(C2197U.this.mo7662e(1)));
            String d = C2197U.this.mo7660d(1);
            this.f10421e.tickerText = a;
            this.f10421e.setLatestEventInfo(C2197U.this.f9237n, a, d, this.f9292g);
        }

        /* renamed from: d */
        public void mo7719d() {
            C2197U.this.mo7665f(1);
        }

        /* renamed from: e */
        public void mo7720e() {
            C2197U.this.mo7665f(1);
        }
    }

    /* renamed from: com.cootek.smartinput5.net.U$a */
    /* compiled from: NonApkDownloader */
    public class C2198a extends C2364s.C2365a {

        /* renamed from: g */
        public PendingIntent f9290g;

        public C2198a() {
            this.f10421e.defaults = 1;
            this.f9290g = mo8030a(C2197U.this.mo7672l(), 0, 2);
            this.f10421e.deleteIntent = mo8030a(C2197U.this.mo7672l(), 1, 2);
        }

        /* renamed from: c */
        public void mo7718c() {
            String a = C1974m.m9064a(C2197U.this.f9237n, (int) R.string.paopao_download_failed_title, Integer.valueOf(C2197U.this.mo7662e(2)));
            String d = C2197U.this.mo7660d(2);
            this.f10421e.tickerText = a;
            this.f10421e.setLatestEventInfo(C2197U.this.f9237n, a, d, this.f9290g);
        }

        /* renamed from: d */
        public void mo7719d() {
            Intent intent = new Intent(C2197U.this.f9237n, RetryDownloadActivity.class);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            C2197U.this.f9237n.startActivity(intent);
        }

        /* renamed from: e */
        public void mo7720e() {
            C2197U.this.mo7665f(2);
        }
    }

    /* renamed from: com.cootek.smartinput5.net.U$c */
    /* compiled from: NonApkDownloader */
    public class C2200c extends C2364s.C2365a implements C1441aq {

        /* renamed from: g */
        public PendingIntent f9294g;

        /* renamed from: h */
        public int f9295h;

        /* renamed from: i */
        public String f9296i;

        public C2200c(int i, String str) {
            this.f10421e.flags = 16;
            this.f9294g = mo8031a(C2197U.this.mo7672l(), 0, 3, str);
            this.f9295h = i;
            this.f9296i = str;
        }

        /* renamed from: c */
        public void mo7718c() {
            String a = C1974m.m9064a(C2197U.this.f9237n, (int) R.string.paopao_download_install_title, C2197U.this.f9234k.get(Integer.valueOf(this.f9295h)));
            String a2 = C1974m.m9063a(C2197U.this.f9237n, (int) R.string.paopao_download_install_summary);
            this.f10421e.tickerText = a;
            this.f10421e.setLatestEventInfo(C2197U.this.f9237n, a, a2, this.f9294g);
        }

        /* renamed from: d */
        public void mo7719d() {
            C1811k a;
            File g = C2197U.this.mo7666g(this.f9295h);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(Engine.EXCEPTION_ERROR);
            String str = g.getAbsolutePath().toString();
            if (g.getName().startsWith(C1974m.m9063a(C2197U.this.f9237n, (int) R.string.app_id_inappbilling)) || g.getName().startsWith(C1974m.m9063a(C2197U.this.f9237n, (int) R.string.app_id_dialer)) || g.getName().startsWith(C1974m.m9063a(C2197U.this.f9237n, (int) R.string.app_id_ime_international)) || g.getName().startsWith(C1974m.m9063a(C2197U.this.f9237n, (int) R.string.app_id_ime_mainland))) {
                try {
                    C2197U.this.f9237n.openFileOutput(g.getName(), 32769).close();
                } catch (FileNotFoundException | IOException e) {
                }
            } else {
                C0997e.m5190b("604", str);
            }
            intent.setDataAndType(Uri.parse("file://" + str), "application/vnd.android.package-archive");
            PresentationManager.installStarted(str);
            if (C1974m.m9063a(C2197U.this.f9237n, (int) R.string.app_id_dialer).equals(this.f9296i) && (a = C1811k.m8322a()) != null) {
                a.mo6817a((C1441aq) this);
            }
            try {
                C2197U.this.f9237n.startActivity(intent);
            } catch (ActivityNotFoundException e2) {
            }
        }

        /* renamed from: e */
        public void mo7720e() {
            C2197U.this.f9230g[3].remove(Integer.valueOf(this.f10420d));
            C2197U.this.f9232i.remove(this.f9296i);
            C2197U.this.mo7656b((C2364s.C2365a) this);
            C2197U.this.mo7665f(3);
            C1811k a = C1811k.m8322a();
            if (a != null) {
                a.mo6822b((C1441aq) this);
            }
        }

        /* renamed from: i */
        public void mo5948i(String str) {
            if (C1974m.m9063a(C2197U.this.f9237n, (int) R.string.app_id_dialer).equals(this.f9296i) && C1974m.m9063a(C2197U.this.f9237n, (int) R.string.smartdialer_package_name).equals(str)) {
                mo7720e();
            }
        }

        /* renamed from: j */
        public void mo5951j(String str) {
        }

        /* renamed from: a */
        public void mo5928a() {
        }

        /* renamed from: a */
        public void mo5933a(boolean z) {
        }

        /* renamed from: b */
        public int mo5935b() {
            return -1;
        }
    }

    /* renamed from: com.cootek.smartinput5.net.U$d */
    /* compiled from: NonApkDownloader */
    public class C2201d extends C2200c {
        public C2201d(int i, String str) {
            super(i, str);
            this.f10421e.flags = 16;
        }

        /* renamed from: c */
        public void mo7718c() {
            String a = C1974m.m9064a(C2197U.this.f9237n, (int) R.string.paopao_download_install_title, C2197U.this.f9234k.get(Integer.valueOf(this.f9295h)));
            String str = null;
            File g = C2197U.this.mo7666g(this.f9295h);
            if (g != null && g.exists()) {
                str = C1974m.m9063a(C2197U.this.f9237n, (int) R.string.paopao_download_active_summary);
            }
            this.f10421e.tickerText = a;
            this.f10421e.setLatestEventInfo(C2197U.this.f9237n, a, str, this.f9294g);
        }

        /* renamed from: d */
        public void mo7719d() {
            if (C1368X.m6324d()) {
                ArrayList<C1810j> b = C1811k.m8322a().mo6821b(1, C2197U.this.mo7666g(this.f9295h).getAbsolutePath());
                if (b.size() != 0) {
                    String a = ((C1601bg) b.get(0)).mo6810a();
                    Settings.getInstance().setStringSetting(80, a);
                    C1368X.m6320c().mo5841n().mo6258a(a, true, true);
                    if (Engine.isInitialized()) {
                        Engine.getInstance().getIms().requestHideSelf(0);
                    }
                }
            }
            C2197U.this.f9230g[3].remove(Integer.valueOf(this.f10420d));
            C2197U.this.f9232i.remove(this.f9296i);
            C2197U.this.mo7656b((C2364s.C2365a) this);
            C2197U.this.mo7665f(3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7651a(String str, String str2, String str3, C2183M.C2184a aVar) {
        mo7717r();
        super.mo7651a(str, str2, str3, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7716b(String str, String str2, String str3, C2183M.C2184a aVar) {
        this.f9288y = true;
        super.mo7651a(str, str2, str3, aVar);
        for (Map.Entry entry : this.f9233j.entrySet()) {
            if (((String) entry.getValue()).equals(str)) {
                this.f9289z.add(entry.getKey());
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7647a(int i, int i2, int i3, int i4) {
        if (this.f9289z.contains(Integer.valueOf(i))) {
            this.f9286A.put(Integer.valueOf(i), new C1011s(Integer.valueOf(i3), Integer.valueOf(i4)));
        }
        super.mo7647a(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo7668h() {
        this.f9289z.clear();
        this.f9286A.clear();
        this.f9288y = false;
        super.mo7668h();
    }

    /* renamed from: r */
    public void mo7717r() {
        if (this.f9288y) {
            this.f9288y = false;
            if (this.f9231h[0] == null) {
                this.f9231h[0] = mo7669i();
            }
            for (Integer intValue : this.f9289z) {
                int intValue2 = intValue.intValue();
                if (this.f9286A.contains(Integer.valueOf(intValue2))) {
                    C1011s sVar = this.f9286A.get(Integer.valueOf(intValue2));
                    super.mo7647a(intValue2, 0, ((Integer) sVar.f2650a).intValue(), ((Integer) sVar.f2651b).intValue());
                }
            }
            this.f9289z.clear();
            this.f9286A.clear();
        }
    }
}
