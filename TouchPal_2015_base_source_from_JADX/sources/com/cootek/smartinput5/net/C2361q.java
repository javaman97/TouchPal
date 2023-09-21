package com.cootek.smartinput5.net;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.sdk.utils.ActionDriverHelper;
import com.cootek.smartinput.utilities.C0994c;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1337C;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.smileypanel.C2003a;
import com.cootek.smartinput5.net.C2183M;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.presentations.C2515q;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.net.q */
/* compiled from: DownloadManager */
public class C2361q implements C2183M.C2184a {

    /* renamed from: a */
    public static final int f10391a = 0;

    /* renamed from: b */
    public static final int f10392b = 2;

    /* renamed from: g */
    private static C2361q f10393g;

    /* renamed from: i */
    private static String f10394i = ".etag";

    /* renamed from: c */
    C2197U f10395c;

    /* renamed from: d */
    C2314l f10396d;

    /* renamed from: e */
    private ArrayList<C2362a> f10397e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C2362a> f10398f = new ArrayList<>();

    /* renamed from: h */
    private Context f10399h;

    /* renamed from: a */
    public static void m10794a() {
        if (!(f10393g == null || f10393g.f10395c == null)) {
            f10393g.f10395c.mo7663e();
        }
        C2364s.m10842b();
        f10393g = null;
    }

    /* renamed from: b */
    public static C2361q m10797b() {
        if (f10393g == null && C1368X.m6313b() != null) {
            f10393g = new C2361q(C1368X.m6313b());
        }
        return f10393g;
    }

    private C2361q(Context context) {
        this.f10399h = context;
        C2364s.m10841a(context);
    }

    /* renamed from: c */
    public C2197U mo8007c() {
        return this.f10395c;
    }

    /* renamed from: a */
    public void mo7997a(C2197U u) {
        this.f10395c = u;
    }

    /* renamed from: a */
    public void mo8000a(String str, String str2, String str3) {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        this.f10395c.mo7650a(str, new File(C1466av.m6848a(this.f10399h), str2), str3, (C2183M.C2184a) null, false);
    }

    /* renamed from: b */
    public void mo8005b(String str, String str2, String str3) {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        this.f10395c.mo7651a(str, str3, str2, (C2183M.C2184a) C2003a.m9262c());
    }

    /* renamed from: c */
    public void mo8009c(String str, String str2, String str3) {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        this.f10395c.mo7651a(str, str3, str2, (C2183M.C2184a) C1368X.m6320c().mo5842o());
        C1368X.m6320c().mo5842o().mo5943f(str);
        C1056a.m5588a().mo4264a(C1056a.f2982m + str, this.f10399h);
    }

    /* renamed from: d */
    public void mo8013d(String str, String str2, String str3) {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        this.f10395c.mo7716b(str, str3, str2, C1368X.m6320c().mo5842o());
        C1368X.m6320c().mo5842o().mo5943f(str);
    }

    /* renamed from: e */
    public void mo8016e(String str, String str2, String str3) {
        if (this.f10396d == null) {
            this.f10396d = new C2314l(this.f10399h);
        }
        this.f10396d.mo7651a(str, str3, str2, (C2183M.C2184a) C1368X.m6320c().mo5842o());
        C1368X.m6320c().mo5842o().mo5943f(str);
    }

    /* renamed from: d */
    public void mo8012d(String str) {
        if (!TextUtils.isEmpty(str)) {
            String e = mo8014e(str);
            String a = C1974m.m9063a(this.f10399h, (int) R.string.SKIN_PACK_EXPECTED_VERSION);
            C1368X.m6320c().mo5841n().mo6255a(e, str);
            if (C2188Q.m9853a().mo7689j()) {
                if (this.f10396d == null) {
                    this.f10396d = new C2314l(this.f10399h);
                }
                this.f10396d.mo7651a(e, a, "", (C2183M.C2184a) C1368X.m6320c().mo5841n());
                C1368X.m6320c().mo5841n().mo6291o(e);
            }
        }
    }

    /* renamed from: d */
    public void mo8011d() {
        if (this.f10396d != null) {
            this.f10396d.mo7663e();
            Settings.getInstance().setBoolSetting(Settings.SHOW_INSTALL_INCOMPATIBLE_LANGUAGE, true);
            Settings.getInstance().setBoolSetting(Settings.DEFUALT_SKIN_UPDATED, false);
        }
    }

    /* renamed from: f */
    public void mo8018f(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            if (this.f10395c == null) {
                this.f10395c = new C2197U(this.f10399h);
            }
            File file = new File(str2);
            this.f10395c.mo7650a(str, file, str3, C1368X.m6320c().mo5841n(), false);
        }
    }

    /* renamed from: a */
    public void mo8001a(String str, String str2, String str3, C2183M.C2184a aVar) {
        if (!TextUtils.isEmpty(str2)) {
            if (this.f10395c == null) {
                this.f10395c = new C2197U(this.f10399h);
            }
            this.f10395c.mo7650a(str, new File(str2), str3, aVar, false);
        }
    }

    /* renamed from: a */
    public void mo7999a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f10395c == null) {
                this.f10395c = new C2197U(this.f10399h);
            }
            String e = mo8014e(str);
            this.f10395c.mo7651a(e, C1974m.m9063a(this.f10399h, (int) R.string.SKIN_PACK_EXPECTED_VERSION), str2, (C2183M.C2184a) C1368X.m6320c().mo5841n());
            C1368X.m6320c().mo5841n().mo6291o(e);
        }
    }

    /* renamed from: e */
    public String mo8014e(String str) {
        return C1974m.m9063a(this.f10399h, (int) R.string.app_id_skin_prefix) + str.substring(str.lastIndexOf(C1389aD.f4374j) + 1);
    }

    /* renamed from: g */
    public void mo8020g(String str, String str2, String str3) {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        this.f10395c.mo7651a(str, str3, str2, (C2183M.C2184a) C1368X.m6320c().mo5845r());
    }

    /* renamed from: a */
    public void mo7998a(String str, C1337C.C1339a aVar, String str2) {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        this.f10395c.mo7651a(C1337C.m6137a(str, aVar), (String) null, str2, (C2183M.C2184a) C1368X.m6320c().mo5815A());
    }

    /* renamed from: h */
    public void mo8022h(String str, String str2, String str3) {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        this.f10395c.mo7651a(str, str2, str3, (C2183M.C2184a) C1368X.m6320c().mo5846s());
    }

    /* renamed from: i */
    public void mo8023i(String str, String str2, String str3) {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        this.f10395c.mo7651a(str, str3, str2, (C2183M.C2184a) C1368X.m6320c().mo5847t());
    }

    /* renamed from: j */
    public void mo8024j(String str, String str2, String str3) {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        if (this.f10395c.mo7652a(str)) {
            this.f10395c.mo7667g();
        } else {
            this.f10395c.mo7651a(str, str3, str2, (C2183M.C2184a) C1368X.m6320c().mo5848u());
        }
    }

    /* renamed from: k */
    public void mo8025k(String str, String str2, String str3) {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        this.f10395c.mo7651a(str, str3, str2, (C2183M.C2184a) null);
    }

    /* renamed from: a */
    public void mo8002a(String str, String str2, String str3, boolean z) {
        mo8003a(str, str2, str3, z, false, false);
    }

    /* renamed from: a */
    public void mo8003a(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        m10796a(str, str2, str3, z, z2, this, z3);
    }

    /* renamed from: a */
    private void m10796a(String str, String str2, String str3, boolean z, boolean z2, C2183M.C2184a aVar, boolean z3) {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        String str4 = str2 + ".apk";
        File file = new File(C1358O.m6234a(C1358O.f4197h), str4);
        C2362a aVar2 = new C2362a(str, str2, str4, z, z3);
        if (!this.f10398f.contains(aVar2)) {
            this.f10398f.add(aVar2);
        }
        this.f10395c.mo7650a(str, file, str3, this, z2);
    }

    /* renamed from: e */
    public void mo8015e() {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        this.f10395c.mo7654b();
    }

    /* renamed from: g */
    public void mo8019g() {
        if (this.f10395c == null) {
            this.f10395c = new C2197U(this.f10399h);
        }
        this.f10395c.mo7658c();
    }

    /* renamed from: h */
    public void mo8021h() {
        if (this.f10395c != null) {
            this.f10395c.mo7664f();
        }
    }

    /* renamed from: a */
    public void mo7996a(int i, int i2, int i3, String str) {
        if (i == 2 && this.f10395c != null) {
            this.f10395c.mo7648a(i2, i3, str);
        }
    }

    /* renamed from: a */
    public void mo7995a(int i) {
        if (i == 2) {
            this.f10395c = null;
        }
    }

    /* renamed from: a */
    public int mo7994a(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int available = fileInputStream.available();
            fileInputStream.close();
            return available;
        } catch (FileNotFoundException e) {
            return 0;
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public boolean mo8004a(File file, String str, int i) {
        File file2 = new File(file.getParentFile(), file.getName() + f10394i);
        try {
            file2.createNewFile();
            FileWriter fileWriter = new FileWriter(file2);
            fileWriter.write(str + ":" + String.valueOf(i));
            fileWriter.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo8006b(File file) {
        File file2 = new File(file.getParentFile(), file.getName() + f10394i);
        if (!file2.exists()) {
            return true;
        }
        file2.delete();
        return true;
    }

    /* renamed from: g */
    private String m10799g(String str) {
        int indexOf;
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf(":")) != -1) {
            return str.substring(0, indexOf);
        }
        return null;
    }

    /* renamed from: h */
    private String m10800h(String str) {
        int indexOf;
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf(":")) != -1) {
            return str.substring(indexOf + 1, str.length());
        }
        return null;
    }

    /* renamed from: c */
    public String mo8008c(File file) {
        File file2 = new File(file.getParentFile(), file.getName() + f10394i);
        if (!file2.exists()) {
            return null;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            char[] cArr = new char[1024];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = fileReader.read(cArr, 0, 1024);
                if (read != -1) {
                    sb.append(cArr, 0, read);
                } else {
                    fileReader.close();
                    return m10799g(sb.toString());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public int mo8010d(File file) {
        File file2 = new File(file.getParentFile(), file.getName() + f10394i);
        if (!file2.exists()) {
            return -1;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            char[] cArr = new char[1024];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = fileReader.read(cArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            fileReader.close();
            String h = m10800h(sb.toString());
            if (h == null || !TextUtils.isDigitsOnly(h)) {
                return -1;
            }
            return Integer.parseInt(h);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* renamed from: i */
    public static boolean m10801i() {
        if (f10393g == null || f10393g.f10395c == null || f10393g.f10395c.mo7673m()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo5566a(String str, File file) {
        if (file != null) {
            String name = file.getName();
            C2362a aVar = null;
            Iterator<C2362a> it = this.f10398f.iterator();
            while (it.hasNext()) {
                C2362a next = it.next();
                if (name.equals(next.f10402c)) {
                    if (!this.f10397e.contains(next)) {
                        this.f10397e.add(next);
                    }
                    C0994c.m5165a(str, C0994c.C0995a.SUCCESS);
                    PresentationManager.downloadFinished(str, file.getAbsolutePath());
                } else {
                    next = aVar;
                }
                aVar = next;
            }
            this.f10398f.removeAll(this.f10397e);
            if (aVar != null) {
                m10795a(aVar);
                if (aVar.f10404e) {
                    if (Engine.isInitialized()) {
                        Engine.getInstance().getIms().requestHideSelf(0);
                    }
                    ActionDriverHelper.installApk(this.f10399h, file.getAbsolutePath());
                }
            }
        }
    }

    /* renamed from: a */
    private void m10795a(C2362a aVar) {
        Message obtain = Message.obtain((Handler) null, 5);
        Bundle bundle = new Bundle();
        bundle.putString(C2515q.f10829b, aVar.f10400a);
        bundle.putString(C2515q.f10830c, aVar.f10401b);
        obtain.setData(bundle);
        C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
    }

    /* renamed from: b */
    private void m10798b(C2362a aVar) {
        Message obtain = Message.obtain((Handler) null, 6);
        Bundle bundle = new Bundle();
        bundle.putString(C2515q.f10829b, aVar.f10400a);
        bundle.putString(C2515q.f10830c, aVar.f10401b);
        obtain.setData(bundle);
        C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
    }

    /* renamed from: f */
    public void mo8017f(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            C2362a aVar = null;
            Iterator<C2362a> it = this.f10397e.iterator();
            while (it.hasNext()) {
                C2362a next = it.next();
                if (str.equals(next.f10401b)) {
                    arrayList.add(next);
                    PresentationManager.installFinished(str);
                    C0994c.m5165a(next.f10400a, C0994c.C0995a.INSTALLED);
                    if (next.f10403d) {
                        mo7996a(2, 1, 3, next.f10400a);
                    }
                } else {
                    next = aVar;
                }
                aVar = next;
            }
            this.f10397e.removeAll(arrayList);
            if (arrayList.size() != 0) {
                m10798b(aVar);
                File a = C1358O.m6234a(C1358O.f4197h);
                if (a != null) {
                    File[] listFiles = a.listFiles(new C2363r(this, arrayList));
                    if (listFiles != null) {
                        for (File delete : listFiles) {
                            delete.delete();
                        }
                    }
                    arrayList.clear();
                }
            }
        }
    }

    /* renamed from: com.cootek.smartinput5.net.q$a */
    /* compiled from: DownloadManager */
    private class C2362a {

        /* renamed from: a */
        String f10400a;

        /* renamed from: b */
        String f10401b;

        /* renamed from: c */
        String f10402c;

        /* renamed from: d */
        boolean f10403d;

        /* renamed from: e */
        boolean f10404e;

        public C2362a(String str, String str2, String str3, boolean z, boolean z2) {
            this.f10400a = str;
            this.f10401b = str2;
            this.f10402c = str3;
            this.f10403d = z;
            this.f10404e = z2;
        }
    }

    /* renamed from: a */
    public boolean mo5568a(String str) {
        Iterator<C2362a> it = this.f10398f.iterator();
        while (it.hasNext()) {
            C2362a next = it.next();
            if (str.equals(next.f10400a)) {
                return next.f10403d;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo5571b(String str) {
    }

    /* renamed from: f */
    public void mo5577f() {
    }

    /* renamed from: c */
    public void mo5573c(String str) {
    }
}
