package com.cootek.smartinput5.func.asset;

import android.content.Context;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0990F;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.daemon.DaemonManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.asset.C1452i;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p045a.C1056a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.cootek.smartinput5.func.asset.o */
/* compiled from: TouchPalAssetManager */
public class C1460o implements C1445b, C1452i.C1453a {

    /* renamed from: a */
    public static final String f4670a = "assets";

    /* renamed from: c */
    private static final String f4671c = "TouchPalAssetManager";

    /* renamed from: d */
    private static final String f4672d = "assets.zip";

    /* renamed from: e */
    private static final String f4673e = "assets_extract";

    /* renamed from: f */
    private static C1460o f4674f = new C1460o();

    /* renamed from: b */
    File f4675b = null;

    /* renamed from: g */
    private final C1456k f4676g = new C1456k();

    /* renamed from: h */
    private final C1450g f4677h = new C1450g();

    /* renamed from: i */
    private boolean f4678i = false;

    /* renamed from: j */
    private File f4679j = null;

    /* renamed from: k */
    private C1452i f4680k;

    /* renamed from: l */
    private CopyOnWriteArrayList<C1452i.C1453a> f4681l = new CopyOnWriteArrayList<>();

    private C1460o() {
    }

    /* renamed from: b */
    public static C1460o m6799b() {
        return f4674f;
    }

    /* renamed from: a */
    public void mo6124a(Context context, boolean z) throws C1451h {
        m6806g();
        if (m6804f(context)) {
            this.f4678i = true;
            if (z) {
                m6810i(context);
            } else if (!m6809h(context)) {
                throw new C1451h("Extracting assets failed!");
            } else {
                this.f4678i = false;
            }
        } else {
            if (this.f4677h.mo6111b() == null) {
                mo6123a(context);
            }
            if (!mo6129c()) {
                m6800b(context, C1452i.C1454b.success);
            }
        }
        if (this.f4677h.mo6111b() == null) {
            mo6123a(context);
        }
    }

    /* renamed from: a */
    public void mo6123a(Context context) {
        this.f4677h.mo6109a(context, mo6130d(context));
    }

    /* renamed from: c */
    public boolean mo6129c() {
        return this.f4678i;
    }

    /* renamed from: f */
    private boolean m6804f(Context context) {
        if (!this.f4678i && m6818q(context)) {
            return m6807g(context);
        }
        return false;
    }

    /* renamed from: g */
    private boolean m6807g(Context context) {
        File p = m6817p(context);
        if (p == null || !p.exists() || !m6797a(context, p)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m6797a(Context context, File file) {
        return C1459n.m6792a(context, C1466av.m6849a(context, C1466av.f4716y), file);
    }

    /* renamed from: h */
    private boolean m6809h(Context context) {
        m6803f();
        return mo6127b(context);
    }

    /* renamed from: i */
    private void m6810i(Context context) {
        this.f4680k = new C1452i(context, this);
        this.f4680k.execute(new String[0]);
    }

    /* renamed from: f */
    private void m6803f() {
        if (this.f4680k != null && this.f4680k.getStatus() == AsyncTask.Status.RUNNING) {
            this.f4680k.cancel(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6131d() {
        C0997e.m5180a(f4673e);
        C0990F.m5126a(f4673e);
    }

    /* renamed from: j */
    private boolean m6811j(Context context) {
        File file;
        File p = m6817p(context);
        if (p == null || !p.exists() || (file = new File(p, C1974m.f6735a)) == null || !file.exists()) {
            return false;
        }
        String b = C0997e.m5188b(file.getAbsolutePath());
        String k = m6812k(context);
        C1017y.m5224c(f4671c, "isExtractingRight: actualMd5: " + b + " expectedMd5: " + k);
        return TextUtils.equals(b, k);
    }

    /* renamed from: k */
    private String m6812k(Context context) {
        InputStream inputStream;
        String str = null;
        try {
            inputStream = context.getAssets().open(C1974m.f6736b);
        } catch (IOException e) {
            e.printStackTrace();
            inputStream = null;
        }
        if (inputStream != null) {
            Scanner scanner = new Scanner(inputStream);
            str = scanner.nextLine();
            scanner.close();
            try {
                inputStream.close();
            } catch (IOException e2) {
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo6127b(Context context) {
        boolean z;
        C1017y.m5224c(f4671c, "extractZipAssets");
        C1056a.m5588a().mo4265a(C1056a.f2953N, context, false);
        File d = mo6130d(context);
        if (d != null && d.exists()) {
            d.delete();
        }
        InputStream m = m6814m(context);
        OutputStream n = m6815n(context);
        if (!(m == null || n == null)) {
            try {
                C0997e.m5179a(m, n, f4673e);
                File o = m6816o(context);
                C0990F.m5125a(o, mo6130d(context), f4673e);
                if (o != null && o.exists()) {
                    o.delete();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (m6811j(context)) {
            m6813l(context);
            z = true;
        } else {
            mo6128c(context);
            z = false;
        }
        if (n != null) {
            try {
                n.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        if (m != null) {
            try {
                m.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        mo6123a(context);
        C1017y.m5224c(f4671c, "extractFinished ret = " + z);
        if (z) {
            C1056a.m5588a().mo4265a(C1056a.f2954O, context, false);
        }
        return z;
    }

    /* renamed from: c */
    public void mo6128c(Context context) {
        File d = mo6130d(context);
        if (d != null && d.exists()) {
            C0997e.m5172a(d);
        }
        this.f4679j = null;
    }

    /* renamed from: l */
    private void m6813l(Context context) {
        C1459n.m6791a(context, m6817p(context)).mo6120a(C1466av.m6849a(context, C1466av.f4716y));
    }

    /* renamed from: m */
    private InputStream m6814m(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getAssets().open(f4672d);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    private OutputStream m6815n(Context context) {
        File o = m6816o(context);
        if (o != null) {
            if (o.exists()) {
                o.delete();
            }
            try {
                return new FileOutputStream(o);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: o */
    private File m6816o(Context context) {
        File d = mo6130d(context);
        if (d == null || !d.exists()) {
            return null;
        }
        return new File(d, f4672d);
    }

    /* renamed from: d */
    public File mo6130d(Context context) {
        if (this.f4675b == null || !this.f4675b.exists()) {
            File a = C1466av.m6849a(context, C1466av.f4699h);
            if (a != null && !a.exists()) {
                a.mkdir();
            }
            this.f4675b = a;
        }
        return this.f4675b;
    }

    /* renamed from: p */
    private File m6817p(Context context) {
        File d;
        if (this.f4679j == null && (d = mo6130d(context)) != null && d.exists()) {
            this.f4679j = new File(d, f4670a);
        }
        return this.f4679j;
    }

    /* renamed from: a */
    public InputStream mo6098a(Context context, C1443as asVar, String str) throws IOException {
        return m6801e(context, asVar, str).mo6098a(context, asVar, str);
    }

    /* renamed from: a */
    public InputStream mo6099a(Context context, String str) throws IOException {
        return m6802e(context, str).mo6099a(context, str);
    }

    /* renamed from: b */
    public C1444a mo6101b(Context context, String str) throws IOException {
        return m6802e(context, str).mo6101b(context, str);
    }

    /* renamed from: b */
    public C1444a mo6100b(Context context, C1443as asVar, String str) throws IOException {
        return m6801e(context, asVar, str).mo6100b(context, asVar, str);
    }

    /* renamed from: c */
    public String[] mo6103c(Context context, String str) throws IOException {
        return m6802e(context, str).mo6103c(context, str);
    }

    /* renamed from: c */
    public String[] mo6102c(Context context, C1443as asVar, String str) throws IOException {
        return m6801e(context, asVar, str).mo6102c(context, asVar, str);
    }

    /* renamed from: d */
    public Typeface mo6104d(Context context, C1443as asVar, String str) {
        return m6801e(context, asVar, str).mo6104d(context, asVar, str);
    }

    /* renamed from: d */
    public String mo6105d(Context context, String str) {
        return m6802e(context, str).mo6105d(context, str);
    }

    /* renamed from: e */
    public C1443as mo6132e(Context context) {
        if (!this.f4677h.mo6110a()) {
            this.f4677h.mo6109a(context, mo6130d(context));
        }
        return this.f4677h.mo6111b();
    }

    /* renamed from: e */
    private C1445b m6801e(Context context, C1443as asVar, String str) {
        if (context == null || asVar == null) {
            return null;
        }
        if (TextUtils.equals(context.getPackageName(), asVar.getPackageName())) {
            return m6802e(context, str);
        }
        return this.f4676g;
    }

    /* renamed from: e */
    private C1445b m6802e(Context context, String str) {
        if (m6805f(context, str)) {
            return this.f4676g;
        }
        return this.f4677h;
    }

    /* renamed from: f */
    private boolean m6805f(Context context, String str) {
        boolean z = false;
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
        } catch (Exception e) {
        }
        if (inputStream != null) {
            z = true;
            try {
                inputStream.close();
            } catch (IOException e2) {
            }
        }
        return z;
    }

    /* renamed from: q */
    private boolean m6818q(Context context) {
        return m6805f(context, f4672d);
    }

    /* renamed from: g */
    private void m6806g() {
        this.f4679j = null;
    }

    /* renamed from: a */
    public void mo6125a(C1452i.C1453a aVar) {
        if (aVar != null && !this.f4681l.contains(aVar)) {
            this.f4681l.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo6126b(C1452i.C1453a aVar) {
        if (aVar != null) {
            this.f4681l.remove(aVar);
        }
    }

    /* renamed from: e */
    public void mo6133e() {
        this.f4681l.clear();
    }

    /* renamed from: h */
    private void m6808h() {
        Iterator<C1452i.C1453a> it = this.f4681l.iterator();
        while (it.hasNext()) {
            it.next().mo4255a();
        }
    }

    /* renamed from: b */
    private void m6800b(Context context, C1452i.C1454b bVar) {
        Iterator<C1452i.C1453a> it = this.f4681l.iterator();
        while (it.hasNext()) {
            it.next().mo4256a(context, bVar);
        }
    }

    /* renamed from: a */
    public void mo4255a() {
        C1017y.m5224c(f4671c, "onExtractCanceled");
        m6808h();
        this.f4678i = false;
        this.f4680k = null;
    }

    /* renamed from: a */
    public void mo4256a(Context context, C1452i.C1454b bVar) {
        if (bVar == C1452i.C1454b.success && !m6819r(context)) {
            bVar = C1452i.C1454b.load_library_failed;
        }
        m6800b(context, bVar);
        this.f4678i = false;
        this.f4680k = null;
    }

    /* renamed from: r */
    private boolean m6819r(Context context) {
        if (DaemonManager.f3959a) {
            return true;
        }
        try {
            C1368X.m6290a(context);
            return true;
        } catch (UnsatisfiedLinkError e) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m6798a(String str) {
        return TextUtils.equals(C1466av.f4699h, str) || TextUtils.equals(C1466av.f4716y, str);
    }
}
