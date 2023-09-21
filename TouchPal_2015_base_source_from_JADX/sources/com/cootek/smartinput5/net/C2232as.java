package com.cootek.smartinput5.net;

import android.text.TextUtils;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput.utilities.C0990F;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2247G;
import com.cootek.smartinput5.net.cmd.C2261Q;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.net.as */
/* compiled from: WebviewManager */
public class C2232as {

    /* renamed from: a */
    public static final boolean f9435a = false;

    /* renamed from: b */
    public static final String f9436b = "ETag";

    /* renamed from: c */
    private static final String f9437c = "WebviewManager";

    /* renamed from: d */
    private static C2232as f9438d = null;

    /* renamed from: e */
    private static String[] f9439e = null;

    /* renamed from: f */
    private static final int f9440f = 0;

    /* renamed from: g */
    private static final int f9441g = 1;

    /* renamed from: h */
    private static final int f9442h = 2;

    /* renamed from: i */
    private static final int f9443i = 3;

    /* renamed from: j */
    private static final int f9444j = 4;

    /* renamed from: k */
    private HashMap<String, String[]> f9445k = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f9446l;

    private C2232as() {
        C1358O.m6234a(C1358O.f4200k);
        m10132d();
    }

    /* renamed from: a */
    public static C2232as m10118a() {
        if (f9438d == null) {
            f9438d = new C2232as();
        }
        f9439e = new String[0];
        return f9438d;
    }

    /* renamed from: a */
    public String mo7758a(String str) {
        if (!m10139k(str)) {
            return str;
        }
        C2233at atVar = new C2233at(this, str);
        try {
            atVar.start();
            atVar.join();
            if (!this.f9446l) {
                return str;
            }
            this.f9446l = false;
            return m10141m(str)[2];
        } catch (IllegalThreadStateException | InterruptedException e) {
            return str;
        }
    }

    /* renamed from: c */
    private boolean m10130c(String str) {
        File file;
        try {
            String h = m10136h(str);
            String[] m = m10141m(h);
            if (m == null || (file = new File(C1358O.m6234a((String) C1358O.f4200k), m[1])) == null || !file.exists()) {
                return true;
            }
            if (Long.parseLong(m[3]) == m10116a(file)) {
                return false;
            }
            m10140l(h);
            return true;
        } catch (NumberFormatException e) {
            m10140l(str);
            return true;
        }
    }

    /* renamed from: d */
    private C2247G m10131d(String str) {
        File a;
        File file;
        if (!m10139k(str) || (a = C1358O.m6234a((String) C1358O.f4200k)) == null) {
            return null;
        }
        if (m10130c(str)) {
            m10140l(str);
        }
        String g = m10135g(str);
        String f = m10134f(g);
        String j = m10138j(str);
        File file2 = new File(a, j);
        if (!file2.exists() || !file2.isDirectory()) {
            file2.delete();
            File file3 = new File(a, j);
            file3.mkdir();
            file = file3;
        } else {
            file = file2;
        }
        String str2 = "";
        if (m10141m(str) != null && m10137i(str).equals(m10137i(m10141m(str)[2]))) {
            str2 = m10141m(str)[0];
        }
        return new C2247G(str, g, file.getAbsolutePath() + File.separator + f, (String) null, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m10124a(C2247G g) {
        try {
            File file = new File(g.f9602d);
            File parentFile = file.getParentFile();
            File[] listFiles = parentFile.listFiles(new C2234au(this, file.getName()));
            if (listFiles != null) {
                for (File a : listFiles) {
                    C0997e.m5172a(a);
                }
            }
            C0990F.m5124a(file, parentFile);
            File file2 = new File(parentFile, m10134f(g.f9600b));
            file.delete();
            if (!file2.exists()) {
                return false;
            }
            m10127b(g.f9600b, g.f9605g, parentFile.getName(), file2.toURI().toURL().toString() + m10137i(g.f9600b), "" + m10116a(parentFile));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    private long m10116a(File file) {
        return m10117a(file, 0);
    }

    /* renamed from: a */
    private long m10117a(File file, int i) {
        if (file == null || !file.exists()) {
            return 0;
        }
        long lastModified = file.lastModified();
        if (i > 30) {
            return lastModified;
        }
        int i2 = i + 1;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return lastModified;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                lastModified = Math.max(lastModified, m10117a(file2, i2));
            }
        }
        return lastModified;
    }

    /* renamed from: b */
    public boolean mo7760b(String str) {
        String[] m;
        C2247G d = m10131d(str);
        if (d == null) {
            return false;
        }
        int a = new C2373x(d).mo8059a();
        if (a == 200) {
            return m10124a(d);
        }
        if (a != 304 || (m = m10141m(str)) == null) {
            return false;
        }
        String str2 = m[2];
        String i = m10137i(d.f9600b);
        if (!m10137i(str2).equals(i)) {
            m10121a(str, (String) null, (String) null, m10136h(str2) + i, (String) null);
        }
        return true;
    }

    /* renamed from: e */
    private void m10133e(String str) {
        m10120a(str, (C2373x.C2376b) null);
    }

    /* renamed from: a */
    private void m10120a(String str, C2373x.C2376b bVar) {
        C2247G d = m10131d(str);
        if (d != null) {
            new C2373x(d).mo8060a((C2373x.C2376b) new C2235av(this, bVar));
        }
    }

    /* renamed from: b */
    public boolean mo7759b() {
        if (f9439e == null) {
            return false;
        }
        for (String str : f9439e) {
            C2188Q.m9853a().mo7684d();
            if (!C2188Q.m9853a().mo7685e() || !mo7760b(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private String m10134f(String str) {
        String str2;
        String[] split = str.split("/");
        if (split.length < 1) {
            str2 = split[0];
        } else {
            str2 = split[split.length - 1];
        }
        int indexOf = str2.indexOf(C2261Q.f9807m);
        if (indexOf != -1) {
            return str2.substring(0, indexOf);
        }
        return str2;
    }

    /* renamed from: g */
    private String m10135g(String str) {
        String i = m10137i(str);
        if (!str.endsWith(".html")) {
            str = m10136h(str);
        }
        if (str.endsWith(".html")) {
            return str.substring(0, str.length() - 5) + PresentConfigXmlTag.POSTFIX_FILE_PATH_ZIP + i;
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public String m10136h(String str) {
        int indexOf = str.indexOf(".html?");
        if (indexOf != -1) {
            return str.substring(0, indexOf + 5);
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public String m10137i(String str) {
        int indexOf = str.indexOf(".html?");
        if (indexOf != -1) {
            return str.substring(indexOf + 5);
        }
        return "";
    }

    /* renamed from: j */
    private String m10138j(String str) {
        return "" + m10136h(str).hashCode();
    }

    /* renamed from: k */
    private boolean m10139k(String str) {
        if (TextUtils.isEmpty(str) || f9439e == null) {
            return false;
        }
        for (String startsWith : f9439e) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10121a(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7;
        String str8;
        String str9;
        String h = m10136h(str);
        String[] m = m10141m(h);
        if (m != null) {
            if (TextUtils.isEmpty(str2)) {
                str6 = m[0];
            } else {
                str6 = str2;
            }
            if (TextUtils.isEmpty(str3)) {
                str7 = m[1];
            } else {
                str7 = str3;
            }
            if (TextUtils.isEmpty(str4)) {
                str8 = m[2];
            } else {
                str8 = str4;
            }
            if (TextUtils.isEmpty(str5)) {
                str9 = m[3];
            } else {
                str9 = str5;
            }
            m10127b(h, str6, str7, str8, str9);
        }
    }

    /* renamed from: b */
    private void m10127b(String str, String str2, String str3, String str4, String str5) {
        this.f9445k.put(m10136h(str), new String[]{str2, str3, str4, str5});
        m10129c();
    }

    /* renamed from: l */
    private void m10140l(String str) {
        if (this.f9445k.remove(m10136h(str)) != null) {
            m10129c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public String[] m10141m(String str) {
        return this.f9445k.get(m10136h(str));
    }

    /* renamed from: c */
    private void m10129c() {
        C0997e.m5175a(C1466av.m6849a(C1368X.m6313b(), C1466av.f4701j), (Object) new HashMap(this.f9445k));
    }

    /* renamed from: d */
    private void m10132d() {
        this.f9445k.clear();
        Object b = C0997e.m5187b(C1466av.m6849a(C1368X.m6313b(), C1466av.f4701j));
        if (b != null) {
            this.f9445k = (HashMap) b;
        }
    }
}
