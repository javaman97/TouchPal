package com.cootek.smartinput5.func;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.TypingSpeedData;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2257N;
import com.cootek.smartinput5.net.cmd.C2259P;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: com.cootek.smartinput5.func.bA */
/* compiled from: TypingSpeedManager */
public class C1574bA implements C2373x.C2376b {

    /* renamed from: a */
    private static final String f4953a = "TypingSpeedManager";

    /* renamed from: b */
    private static final int f4954b = 6000;

    /* renamed from: c */
    private static final int f4955c = 3000;

    /* renamed from: d */
    private static final int f4956d = 1000;

    /* renamed from: e */
    private static final int f4957e = 9;

    /* renamed from: f */
    private static final int f4958f = 10;

    /* renamed from: g */
    private Context f4959g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f4960h = new Handler();

    /* renamed from: i */
    private Runnable f4961i;

    /* renamed from: j */
    private Runnable f4962j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1575a f4963k;

    /* renamed from: l */
    private Hashtable<String, ArrayList<C1576b>> f4964l = new Hashtable<>();

    /* renamed from: m */
    private ArrayList<C1576b> f4965m;

    /* renamed from: n */
    private TypingSpeedData f4966n = new TypingSpeedData();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f4967o = 0;

    /* renamed from: p */
    private ArrayList<C2257N> f4968p = new ArrayList<>(4);

    /* renamed from: com.cootek.smartinput5.func.bA$a */
    /* compiled from: TypingSpeedManager */
    public interface C1575a {
        /* renamed from: a */
        void mo6207a(int i);
    }

    /* renamed from: a */
    static /* synthetic */ int m7066a(C1574bA bAVar, int i) {
        int i2 = bAVar.f4967o + i;
        bAVar.f4967o = i2;
        return i2;
    }

    /* renamed from: c */
    static /* synthetic */ int m7071c(C1574bA bAVar, int i) {
        int i2 = bAVar.f4967o - i;
        bAVar.f4967o = i2;
        return i2;
    }

    /* renamed from: com.cootek.smartinput5.func.bA$b */
    /* compiled from: TypingSpeedManager */
    private class C1576b {

        /* renamed from: a */
        public String f4969a;

        /* renamed from: b */
        public int f4970b;

        /* renamed from: c */
        public int f4971c;

        /* renamed from: d */
        public long f4972d;

        public C1576b(long j) {
            this.f4969a = null;
            this.f4970b = 0;
            this.f4971c = 0;
            this.f4972d = j;
        }

        public C1576b(String str, int i, int i2, long j) {
            this.f4969a = str;
            this.f4970b = i;
            this.f4971c = i2;
            this.f4972d = j;
        }
    }

    /* renamed from: i */
    private static long m7074i() {
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        m7076k();
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        m7076k();
    }

    /* renamed from: a */
    public void mo6198a(C1575a aVar) {
        this.f4963k = aVar;
        this.f4965m = new ArrayList<>();
    }

    /* renamed from: a */
    public void mo6197a() {
        this.f4963k = null;
        this.f4965m = null;
    }

    public C1574bA(Context context) {
        this.f4959g = context;
        mo6201c();
        this.f4961i = new C1577bB(this);
        this.f4960h.postDelayed(this.f4961i, 1000);
        this.f4962j = null;
        this.f4966n.mo5801a("western", 0, 0, 0, 1, 0);
        this.f4966n.mo5801a("chinese", 0, 0, 0, 1, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040 A[SYNTHETIC, Splitter:B:25:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045 A[SYNTHETIC, Splitter:B:28:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005a A[SYNTHETIC, Splitter:B:39:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005f A[SYNTHETIC, Splitter:B:42:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0071 A[SYNTHETIC, Splitter:B:51:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0076 A[SYNTHETIC, Splitter:B:54:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6200b() {
        /*
            r4 = this;
            r1 = 0
            android.content.Context r0 = r4.f4959g     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0053, all -> 0x006d }
            java.lang.String r2 = "speed.dat"
            java.io.File r0 = com.cootek.smartinput5.func.C1466av.m6849a((android.content.Context) r0, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0053, all -> 0x006d }
            boolean r2 = r0.exists()     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0053, all -> 0x006d }
            if (r2 != 0) goto L_0x0012
            r0.createNewFile()     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0053, all -> 0x006d }
        L_0x0012:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0053, all -> 0x006d }
            r3.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0053, all -> 0x006d }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x008c }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x008c }
            com.cootek.smartinput5.func.TypingSpeedData r0 = r4.f4966n     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008e, all -> 0x0086 }
            r2.writeObject(r0)     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008e, all -> 0x0086 }
            r2.flush()     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008e, all -> 0x0086 }
            if (r2 == 0) goto L_0x0029
            r2.close()     // Catch:{ IOException -> 0x002f }
        L_0x0029:
            if (r3 == 0) goto L_0x002e
            r3.close()     // Catch:{ IOException -> 0x0034 }
        L_0x002e:
            return
        L_0x002f:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0029
        L_0x0034:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x002e
        L_0x0039:
            r0 = move-exception
            r2 = r1
        L_0x003b:
            r0.printStackTrace()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ IOException -> 0x004e }
        L_0x0043:
            if (r2 == 0) goto L_0x002e
            r2.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x002e
        L_0x0049:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x002e
        L_0x004e:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0043
        L_0x0053:
            r0 = move-exception
            r3 = r1
        L_0x0055:
            r0.printStackTrace()     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch:{ IOException -> 0x0068 }
        L_0x005d:
            if (r3 == 0) goto L_0x002e
            r3.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x002e
        L_0x0063:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x002e
        L_0x0068:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x005d
        L_0x006d:
            r0 = move-exception
            r3 = r1
        L_0x006f:
            if (r1 == 0) goto L_0x0074
            r1.close()     // Catch:{ IOException -> 0x007a }
        L_0x0074:
            if (r3 == 0) goto L_0x0079
            r3.close()     // Catch:{ IOException -> 0x007f }
        L_0x0079:
            throw r0
        L_0x007a:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0074
        L_0x007f:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0079
        L_0x0084:
            r0 = move-exception
            goto L_0x006f
        L_0x0086:
            r0 = move-exception
            r1 = r2
            goto L_0x006f
        L_0x0089:
            r0 = move-exception
            r3 = r2
            goto L_0x006f
        L_0x008c:
            r0 = move-exception
            goto L_0x0055
        L_0x008e:
            r0 = move-exception
            r1 = r2
            goto L_0x0055
        L_0x0091:
            r0 = move-exception
            r2 = r3
            goto L_0x003b
        L_0x0094:
            r0 = move-exception
            r1 = r2
            r2 = r3
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1574bA.mo6200b():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.ObjectInputStream} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0056 A[SYNTHETIC, Splitter:B:37:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005b A[SYNTHETIC, Splitter:B:40:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x006d A[SYNTHETIC, Splitter:B:49:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0072 A[SYNTHETIC, Splitter:B:52:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6201c() {
        /*
            r5 = this;
            r2 = 0
            r0 = 0
            r1 = 0
            android.content.Context r3 = r5.f4959g     // Catch:{ Exception -> 0x004f, all -> 0x0069 }
            java.lang.String r4 = "speed.dat"
            java.io.File r4 = com.cootek.smartinput5.func.C1466av.m6849a((android.content.Context) r3, (java.lang.String) r4)     // Catch:{ Exception -> 0x004f, all -> 0x0069 }
            if (r4 == 0) goto L_0x0013
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x004f, all -> 0x0069 }
            if (r3 != 0) goto L_0x0028
        L_0x0013:
            if (r2 == 0) goto L_0x0018
            r1.close()     // Catch:{ IOException -> 0x001e }
        L_0x0018:
            if (r2 == 0) goto L_0x001d
            r0.close()     // Catch:{ IOException -> 0x0023 }
        L_0x001d:
            return
        L_0x001e:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0018
        L_0x0023:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x001d
        L_0x0028:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004f, all -> 0x0069 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x004f, all -> 0x0069 }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0089, all -> 0x0080 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0089, all -> 0x0080 }
            java.lang.Object r0 = r1.readObject()     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
            com.cootek.smartinput5.func.TypingSpeedData r0 = (com.cootek.smartinput5.func.TypingSpeedData) r0     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
            r5.f4966n = r0     // Catch:{ Exception -> 0x008d, all -> 0x0082 }
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ IOException -> 0x004a }
        L_0x003f:
            if (r3 == 0) goto L_0x001d
            r3.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x001d
        L_0x0045:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x001d
        L_0x004a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x003f
        L_0x004f:
            r0 = move-exception
            r1 = r2
        L_0x0051:
            r0.printStackTrace()     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0059
            r1.close()     // Catch:{ IOException -> 0x0064 }
        L_0x0059:
            if (r2 == 0) goto L_0x001d
            r2.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x001d
        L_0x005f:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x001d
        L_0x0064:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0059
        L_0x0069:
            r0 = move-exception
            r3 = r2
        L_0x006b:
            if (r2 == 0) goto L_0x0070
            r2.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0070:
            if (r3 == 0) goto L_0x0075
            r3.close()     // Catch:{ IOException -> 0x007b }
        L_0x0075:
            throw r0
        L_0x0076:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0070
        L_0x007b:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0075
        L_0x0080:
            r0 = move-exception
            goto L_0x006b
        L_0x0082:
            r0 = move-exception
            r2 = r1
            goto L_0x006b
        L_0x0085:
            r0 = move-exception
            r3 = r2
            r2 = r1
            goto L_0x006b
        L_0x0089:
            r0 = move-exception
            r1 = r2
            r2 = r3
            goto L_0x0051
        L_0x008d:
            r0 = move-exception
            r2 = r3
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1574bA.mo6201c():void");
    }

    /* renamed from: a */
    public void mo6199a(CharSequence charSequence, int i, int i2) {
        String languageCategory = C1368X.m6320c().mo5835h().getLanguageCategory(Settings.getInstance().getStringSetting(10), 10);
        if (!TextUtils.isEmpty(languageCategory)) {
            if (!this.f4964l.containsKey(languageCategory)) {
                this.f4964l.put(languageCategory, new ArrayList());
            }
            C1576b bVar = new C1576b(charSequence.toString(), i, i2, m7074i());
            this.f4964l.get(languageCategory).add(bVar);
            if (this.f4965m != null) {
                this.f4965m.add(bVar);
            }
        }
    }

    /* renamed from: d */
    public void mo6202d() {
        String languageCategory = C1368X.m6320c().mo5835h().getLanguageCategory(Settings.getInstance().getStringSetting(10), 10);
        if (!TextUtils.isEmpty(languageCategory)) {
            if (!this.f4964l.containsKey(languageCategory)) {
                this.f4964l.put(languageCategory, new ArrayList());
            }
            ArrayList arrayList = this.f4964l.get(languageCategory);
            if (arrayList.size() == 0 || ((C1576b) arrayList.get(arrayList.size() - 1)).f4969a != null) {
                arrayList.add(new C1576b(m7074i()));
            }
            if (this.f4965m != null) {
                this.f4965m.add(new C1576b(m7074i()));
            }
        }
    }

    /* renamed from: e */
    public TypingSpeedData mo6203e() {
        return this.f4966n;
    }

    /* renamed from: a */
    public TypingSpeedData.Meta mo6195a(String str, int i) {
        return this.f4966n.mo5797a(str, i);
    }

    /* renamed from: a */
    public TypingSpeedData.Meta mo6196a(String str, int i, int i2, int i3) {
        return this.f4966n.mo5798a(str, i, i2, i3);
    }

    /* renamed from: f */
    public void mo6204f() {
        boolean j = m7075j();
        if (j && this.f4968p == null) {
            this.f4968p = new ArrayList<>(4);
        }
        Iterator<String> it = C1368X.m6320c().mo5842o().mo5950j().iterator();
        while (it.hasNext()) {
            String next = it.next();
            for (int i = 0; i < TypingSpeedData.f4228d; i++) {
                TypingSpeedData.Meta a = mo6195a(next, i);
                if (a != null) {
                    C2257N n = new C2257N();
                    n.f9685a = next;
                    n.f9686b = TypingSpeedData.f4227c[i];
                    n.f9687c = a.f4236d;
                    n.f9688d = a.f4233a;
                    n.f9689e = a.f4235c;
                    n.f9690f = a.f4234b;
                    if (j) {
                        this.f4968p.add(n);
                    } else {
                        new C2373x(n).mo8060a((C2373x.C2376b) this);
                    }
                }
            }
        }
        if (j) {
            m7076k();
        }
    }

    /* renamed from: g */
    public void mo6205g() {
        for (String next : this.f4964l.keySet()) {
            ArrayList arrayList = this.f4964l.get(next);
            this.f4967o = 0;
            if (arrayList.size() >= 2) {
                long j = 0;
                long j2 = 0;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (listIterator.hasPrevious()) {
                    C1576b bVar = (C1576b) listIterator.previous();
                    if (j == 0 || j - bVar.f4972d <= 3000) {
                        if (bVar.f4970b > i3) {
                            i3 = bVar.f4970b;
                        }
                        i += bVar.f4969a != null ? bVar.f4969a.length() : 0;
                        i2 += bVar.f4971c;
                        if (j2 == 0) {
                            j2 = bVar.f4972d;
                        }
                        j = bVar.f4972d;
                    } else {
                        m7068a(next, i3, j2, j, i, i2);
                        if (bVar.f4970b > i3) {
                            i3 = bVar.f4970b;
                        }
                        int length = bVar.f4969a != null ? bVar.f4969a.length() : 0;
                        i2 = bVar.f4971c;
                        j2 = bVar.f4972d;
                        i = length;
                        j = j2;
                    }
                }
                m7068a(next, i3, j2, j, i, i2);
                arrayList.clear();
            }
        }
    }

    /* renamed from: h */
    public void mo6206h() {
        if (this.f4965m != null) {
            this.f4965m.clear();
        }
        this.f4960h.removeCallbacks(this.f4962j);
        this.f4967o = 0;
    }

    /* renamed from: j */
    private static boolean m7075j() {
        return Build.VERSION.SDK_INT == 9 || Build.VERSION.SDK_INT == 10;
    }

    /* renamed from: k */
    private void m7076k() {
        C2259P p;
        if (this.f4968p != null && !this.f4968p.isEmpty()) {
            try {
                p = this.f4968p.remove(0);
            } catch (IndexOutOfBoundsException e) {
                p = null;
            }
            if (p != null) {
                new C2373x(p).mo8060a((C2373x.C2376b) this);
            }
        }
    }

    /* renamed from: a */
    private void m7068a(String str, int i, long j, long j2, int i2, int i3) {
        if (j - j2 > 3000 && !TextUtils.isEmpty(str)) {
            Calendar instance = Calendar.getInstance();
            int i4 = instance.get(2);
            int i5 = instance.get(5);
            C1017y.m5226d(C1017y.f2665B, f4953a, "month = " + i4 + ", day = " + i5);
            int i6 = (int) (j - j2);
            int a = TypingSpeedData.m6255a(i2, i6);
            this.f4966n.mo5802a(str, i, i4, i5, i2, i3, i6, a);
            this.f4966n.mo5801a(str, i, i2, i3, i6, a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m7077l() {
        if (this.f4962j != null) {
            this.f4960h.removeCallbacks(this.f4962j);
        }
        if (this.f4963k != null) {
            int m = m7078m();
            int abs = Math.abs(m - this.f4967o);
            int min = Math.min(10, abs);
            if (abs != 0) {
                int i = 1000 / min;
                this.f4962j = new C1578bC(this, m, abs / min, i);
                this.f4960h.postDelayed(this.f4962j, (long) i);
            }
        } else {
            mo6206h();
        }
        this.f4960h.postDelayed(this.f4961i, 1000);
    }

    /* renamed from: m */
    private int m7078m() {
        int i;
        int i2 = 0;
        if (this.f4965m == null) {
            return 0;
        }
        long i3 = m7074i();
        String languageCategory = C1368X.m6320c().mo5835h().getLanguageCategory(Settings.getInstance().getStringSetting(10), 10);
        ListIterator<C1576b> listIterator = this.f4965m.listIterator(this.f4965m.size());
        while (true) {
            i = i2;
            if (!listIterator.hasPrevious()) {
                break;
            }
            C1576b previous = listIterator.previous();
            if (i3 - previous.f4972d >= 6000) {
                break;
            } else if (previous.f4969a != null) {
                i2 = previous.f4969a.length() + i;
            } else {
                i2 = "chinese".equals(languageCategory) ? i + 1 : i;
            }
        }
        return i;
    }
}
