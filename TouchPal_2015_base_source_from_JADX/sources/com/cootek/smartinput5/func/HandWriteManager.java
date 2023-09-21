package com.cootek.smartinput5.func;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0990F;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2183M;
import com.cootek.smartinput5.p066ui.HandWriteMask;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class HandWriteManager implements C2183M.C2184a {

    /* renamed from: a */
    public static final String f4133a = ".tph";

    /* renamed from: b */
    public static final String f4134b = ".hwd";

    /* renamed from: c */
    public static final String f4135c = "com.cootek.smartinputv5.language.chs.handwrite";

    /* renamed from: d */
    public static final String f4136d = "com.cootek.smartinputv5.language.v5.chs.handwrite";

    /* renamed from: e */
    public static final String[] f4137e = {"handwrite_single.zip", "handwrite_multi.zip", "handwrite_cloud.zip"};

    /* renamed from: f */
    public static final int f4138f = 0;

    /* renamed from: g */
    public static final int f4139g = 1;

    /* renamed from: h */
    public static final int f4140h = 2;

    /* renamed from: i */
    public static final int f4141i = 1;

    /* renamed from: j */
    public static final int f4142j = 2;

    /* renamed from: k */
    public static final int f4143k = 3;

    /* renamed from: l */
    public static final int f4144l = 4;

    /* renamed from: m */
    private static final String f4145m = "id";

    /* renamed from: n */
    private static final String f4146n = "version";

    /* renamed from: o */
    private static final String f4147o = "handwrite_type";

    /* renamed from: p */
    private static final String f4148p = "compatible";

    /* renamed from: q */
    private static final String f4149q = "files";

    /* renamed from: r */
    private Context f4150r;

    /* renamed from: s */
    private ArrayList<C1349a> f4151s = new ArrayList<>();

    /* renamed from: t */
    private String[] f4152t = C1974m.m9070b(this.f4150r, R.array.HANDWRITE_TARGET_VERSION);

    /* renamed from: u */
    private C1435ak f4153u;

    /* renamed from: v */
    private boolean f4154v = false;

    /* renamed from: com.cootek.smartinput5.func.HandWriteManager$a */
    public interface C1349a {
        /* renamed from: e */
        void mo4248e();
    }

    public static native int getType();

    public native boolean hasNativeData();

    static {
        C1368X.m6287a();
    }

    public HandWriteManager(Context context) {
        this.f4150r = context;
        if (!hasNativeData()) {
            mo5607k();
        }
        if (mo5606j()) {
            mo5607k();
        }
    }

    /* renamed from: a */
    public void mo5596a(C1349a aVar) {
        this.f4151s.add(aVar);
    }

    /* renamed from: b */
    public void mo5598b(C1349a aVar) {
        this.f4151s.remove(aVar);
    }

    /* renamed from: a */
    public void mo5566a(String str, File file) {
        HandWriteMask p;
        File[] listFiles;
        File parentFile = file.getParentFile();
        try {
            C0990F.m5124a(file, parentFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        file.delete();
        File a = C1466av.m6848a(C1368X.m6313b());
        C1436al alVar = new C1436al(this);
        if (!TextUtils.equals(parentFile.getAbsolutePath(), a.getAbsolutePath()) && (listFiles = parentFile.listFiles(alVar)) != null && listFiles.length == 1) {
            for (String file2 : m6165a(listFiles[0], false).mo6077b()) {
                File file3 = new File(a, file2);
                if (file3.exists()) {
                    file3.delete();
                }
            }
        }
        mo5595a();
        if (Engine.isInitialized() && (p = Engine.getInstance().getWidgetManager().mo9659p()) != null) {
            p.setStatus(4);
            if (p.mo8612a()) {
                Engine.getInstance().getIms().requestHideSelf(0);
            }
        }
    }

    /* renamed from: a */
    public void mo5595a() {
        if (!hasNativeData()) {
            if (C1368X.m6324d()) {
                if (Engine.isInitialized()) {
                    Engine.getInstance().getIms().requestHideSelf(0);
                }
                C1368X.m6320c().mo5835h().fireSettingsChangedOperation(14);
                C1368X.m6320c().mo5835h().processEvent();
            }
            mo5607k();
            Iterator<C1349a> it = this.f4151s.iterator();
            while (it.hasNext()) {
                it.next().mo4248e();
            }
        }
        C1368X.m6320c().mo5835h().reloadHandwriteEngine();
        if (Engine.isInitialized() && Engine.getInstance().getWidgetManager() != null) {
            Engine.getInstance().getWidgetManager().mo9608N();
        }
    }

    /* renamed from: b */
    public String mo5597b() {
        return C1974m.m9070b(this.f4150r, R.array.app_id_handwrite_data)[getType()];
    }

    /* renamed from: c */
    public boolean mo5599c() {
        if (hasNativeData()) {
            return true;
        }
        return m6166l();
    }

    /* renamed from: d */
    public String mo5600d() {
        if (this.f4154v) {
            return C1358O.m6234a(C1358O.f4195f).getAbsolutePath();
        }
        return C1466av.m6848a(this.f4150r).getAbsolutePath();
    }

    /* renamed from: e */
    public void mo5601e() {
        if (this.f4153u != null) {
            this.f4153u.mo6076a();
        }
        mo5607k();
        if (this.f4153u != null) {
            this.f4153u.mo6076a();
        }
        mo5595a();
    }

    /* renamed from: g */
    public void mo5602g() {
        this.f4153u = null;
    }

    /* renamed from: l */
    private boolean m6166l() {
        return this.f4153u != null && this.f4153u.f4623d;
    }

    /* renamed from: h */
    public C1435ak mo5603h() {
        return this.f4153u;
    }

    /* renamed from: i */
    public int mo5605i() {
        if (C1358O.m6234a(C1358O.f4195f) != null) {
            if (this.f4153u == null || this.f4153u.f4623d) {
                return 1;
            }
            return 2;
        } else if (this.f4153u == null || this.f4153u.f4623d) {
            return 3;
        } else {
            return 4;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.cootek.smartinput5.func.asset.a] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v15, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x012d A[SYNTHETIC, Splitter:B:113:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0132 A[SYNTHETIC, Splitter:B:116:0x0132] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0137 A[SYNTHETIC, Splitter:B:119:0x0137] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b4 A[SYNTHETIC, Splitter:B:63:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b9 A[SYNTHETIC, Splitter:B:66:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00be A[SYNTHETIC, Splitter:B:69:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fa A[SYNTHETIC, Splitter:B:91:0x00fa] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00ff A[SYNTHETIC, Splitter:B:94:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0104 A[SYNTHETIC, Splitter:B:97:0x0104] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5606j() {
        /*
            r11 = this;
            r0 = 0
            r2 = 0
            boolean r1 = r11.mo5599c()
            if (r1 == 0) goto L_0x0015
            com.cootek.smartinput5.func.ak r1 = r11.f4153u
            if (r1 == 0) goto L_0x0015
            com.cootek.smartinput5.func.ak r1 = r11.f4153u
            boolean r1 = r1.mo6078c()
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            return r2
        L_0x0015:
            int r3 = getType()
            if (r3 < 0) goto L_0x0014
            java.lang.String[] r1 = f4137e
            int r1 = r1.length
            if (r3 >= r1) goto L_0x0014
            android.content.Context r1 = r11.f4150r     // Catch:{ NameNotFoundException -> 0x0066 }
            java.lang.String r4 = "com.cootek.smartinputv5.language.v5.chs.handwrite"
            r5 = 0
            android.content.Context r1 = r1.createPackageContext(r4, r5)     // Catch:{ NameNotFoundException -> 0x0066 }
        L_0x0029:
            if (r1 != 0) goto L_0x0034
            android.content.Context r1 = r11.f4150r     // Catch:{ NameNotFoundException -> 0x0069 }
            java.lang.String r4 = "com.cootek.smartinputv5.language.chs.handwrite"
            r5 = 0
            android.content.Context r1 = r1.createPackageContext(r4, r5)     // Catch:{ NameNotFoundException -> 0x0069 }
        L_0x0034:
            if (r1 == 0) goto L_0x0014
            java.lang.String[] r4 = f4137e
            r6 = r4[r3]
            r4 = 0
            r5 = 0
            com.cootek.smartinput5.func.asset.o r3 = com.cootek.smartinput5.func.asset.C1460o.m6799b()     // Catch:{ IOException -> 0x00e9, all -> 0x0119 }
            com.cootek.smartinput5.func.asset.a r3 = r3.mo6101b((android.content.Context) r1, (java.lang.String) r6)     // Catch:{ IOException -> 0x00e9, all -> 0x0119 }
            if (r3 != 0) goto L_0x0076
            if (r0 == 0) goto L_0x0051
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0051
            r0.delete()
        L_0x0051:
            if (r0 == 0) goto L_0x0056
            r5.close()     // Catch:{ IOException -> 0x006c }
        L_0x0056:
            if (r3 == 0) goto L_0x005b
            r3.close()     // Catch:{ IOException -> 0x0071 }
        L_0x005b:
            if (r0 == 0) goto L_0x0014
            r4.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0014
        L_0x0061:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0014
        L_0x0066:
            r1 = move-exception
            r1 = r0
            goto L_0x0029
        L_0x0069:
            r1 = move-exception
            r1 = r0
            goto L_0x0034
        L_0x006c:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0056
        L_0x0071:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x005b
        L_0x0076:
            java.io.InputStream r5 = r3.mo6096c()     // Catch:{ IOException -> 0x015e, all -> 0x014a }
            java.lang.String r1 = "handwrite_checked"
            java.io.File r1 = com.cootek.smartinput5.func.C1358O.m6234a((java.lang.String) r1)     // Catch:{ IOException -> 0x0165, all -> 0x0151 }
            if (r1 != 0) goto L_0x0088
            android.content.Context r1 = r11.f4150r     // Catch:{ IOException -> 0x0165, all -> 0x0151 }
            java.io.File r1 = com.cootek.smartinput5.func.C1466av.m6848a(r1)     // Catch:{ IOException -> 0x0165, all -> 0x0151 }
        L_0x0088:
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x0165, all -> 0x0151 }
            r4.<init>(r1, r6)     // Catch:{ IOException -> 0x0165, all -> 0x0151 }
            boolean r1 = r4.exists()     // Catch:{ Exception -> 0x017a, IOException -> 0x016b, all -> 0x0157 }
            if (r1 == 0) goto L_0x00c5
            long r6 = r3.mo6094a()     // Catch:{ Exception -> 0x017a, IOException -> 0x016b, all -> 0x0157 }
            long r8 = r4.length()     // Catch:{ Exception -> 0x017a, IOException -> 0x016b, all -> 0x0157 }
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00c5
            java.io.File r1 = r4.getParentFile()     // Catch:{ Exception -> 0x017a, IOException -> 0x016b, all -> 0x0157 }
            com.cootek.smartinput.utilities.C0990F.m5124a((java.io.File) r4, (java.io.File) r1)     // Catch:{ Exception -> 0x017a, IOException -> 0x016b, all -> 0x0157 }
        L_0x00a6:
            r1 = 1
            if (r4 == 0) goto L_0x00b2
            boolean r2 = r4.exists()
            if (r2 == 0) goto L_0x00b2
            r4.delete()
        L_0x00b2:
            if (r5 == 0) goto L_0x00b7
            r5.close()     // Catch:{ IOException -> 0x00d9 }
        L_0x00b7:
            if (r3 == 0) goto L_0x00bc
            r3.close()     // Catch:{ IOException -> 0x00de }
        L_0x00bc:
            if (r0 == 0) goto L_0x00c1
            r0.close()     // Catch:{ IOException -> 0x00e3 }
        L_0x00c1:
            r0 = r1
        L_0x00c2:
            r2 = r0
            goto L_0x0014
        L_0x00c5:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x017a, IOException -> 0x016b, all -> 0x0157 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x017a, IOException -> 0x016b, all -> 0x0157 }
            com.cootek.smartinput.utilities.C0997e.m5178a((java.io.InputStream) r5, (java.io.OutputStream) r1)     // Catch:{ Exception -> 0x017d, IOException -> 0x0172, all -> 0x015c }
            java.io.File r0 = r4.getParentFile()     // Catch:{ Exception -> 0x017d, IOException -> 0x0172, all -> 0x015c }
            com.cootek.smartinput.utilities.C0990F.m5124a((java.io.File) r4, (java.io.File) r0)     // Catch:{ Exception -> 0x017d, IOException -> 0x0172, all -> 0x015c }
            r4.delete()     // Catch:{ Exception -> 0x017d, IOException -> 0x0172, all -> 0x015c }
            r0 = r1
            goto L_0x00a6
        L_0x00d9:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x00b7
        L_0x00de:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x00bc
        L_0x00e3:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r1
            goto L_0x00c2
        L_0x00e9:
            r1 = move-exception
            r1 = r0
            r3 = r0
            r4 = r0
        L_0x00ed:
            if (r1 == 0) goto L_0x00f8
            boolean r5 = r1.exists()
            if (r5 == 0) goto L_0x00f8
            r1.delete()
        L_0x00f8:
            if (r3 == 0) goto L_0x00fd
            r3.close()     // Catch:{ IOException -> 0x0109 }
        L_0x00fd:
            if (r0 == 0) goto L_0x0102
            r0.close()     // Catch:{ IOException -> 0x010e }
        L_0x0102:
            if (r4 == 0) goto L_0x0107
            r4.close()     // Catch:{ IOException -> 0x0113 }
        L_0x0107:
            r0 = r2
            goto L_0x00c2
        L_0x0109:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x00fd
        L_0x010e:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0102
        L_0x0113:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r2
            goto L_0x00c2
        L_0x0119:
            r1 = move-exception
            r3 = r0
            r4 = r0
            r5 = r0
            r10 = r1
            r1 = r0
            r0 = r10
        L_0x0120:
            if (r4 == 0) goto L_0x012b
            boolean r2 = r4.exists()
            if (r2 == 0) goto L_0x012b
            r4.delete()
        L_0x012b:
            if (r5 == 0) goto L_0x0130
            r5.close()     // Catch:{ IOException -> 0x013b }
        L_0x0130:
            if (r3 == 0) goto L_0x0135
            r3.close()     // Catch:{ IOException -> 0x0140 }
        L_0x0135:
            if (r1 == 0) goto L_0x013a
            r1.close()     // Catch:{ IOException -> 0x0145 }
        L_0x013a:
            throw r0
        L_0x013b:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0130
        L_0x0140:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0135
        L_0x0145:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x013a
        L_0x014a:
            r1 = move-exception
            r4 = r0
            r5 = r0
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x0120
        L_0x0151:
            r1 = move-exception
            r4 = r0
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x0120
        L_0x0157:
            r1 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x0120
        L_0x015c:
            r0 = move-exception
            goto L_0x0120
        L_0x015e:
            r1 = move-exception
            r1 = r0
            r4 = r0
            r10 = r0
            r0 = r3
            r3 = r10
            goto L_0x00ed
        L_0x0165:
            r1 = move-exception
            r1 = r0
            r4 = r0
            r0 = r3
            r3 = r5
            goto L_0x00ed
        L_0x016b:
            r1 = move-exception
            r1 = r4
            r4 = r0
            r0 = r3
            r3 = r5
            goto L_0x00ed
        L_0x0172:
            r0 = move-exception
            r0 = r3
            r3 = r5
            r10 = r4
            r4 = r1
            r1 = r10
            goto L_0x00ed
        L_0x017a:
            r1 = move-exception
            goto L_0x00a6
        L_0x017d:
            r0 = move-exception
            r0 = r1
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.HandWriteManager.mo5606j():boolean");
    }

    /* renamed from: k */
    public void mo5607k() {
        File[] listFiles;
        File[] listFiles2;
        this.f4153u = null;
        this.f4154v = false;
        C1437am amVar = new C1437am(this);
        File a = C1466av.m6848a(this.f4150r);
        if (!(a == null || (listFiles2 = a.listFiles(amVar)) == null || listFiles2.length != 1)) {
            this.f4153u = m6165a(listFiles2[0], false);
            if (this.f4153u != null && this.f4153u.f4623d) {
                return;
            }
        }
        File a2 = C1358O.m6234a(C1358O.f4195f);
        if (a2 != null && (listFiles = a2.listFiles(amVar)) != null && listFiles.length == 1) {
            this.f4153u = m6165a(listFiles[0], true);
            if (this.f4153u != null && this.f4153u.f4623d) {
                this.f4154v = true;
                m6167m();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00aa A[SYNTHETIC, Splitter:B:45:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00af A[SYNTHETIC, Splitter:B:48:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c9 A[SYNTHETIC, Splitter:B:59:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ce A[SYNTHETIC, Splitter:B:62:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e8 A[SYNTHETIC, Splitter:B:73:0x00e8] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ed A[SYNTHETIC, Splitter:B:76:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0102 A[SYNTHETIC, Splitter:B:85:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0107 A[SYNTHETIC, Splitter:B:88:0x0107] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:70:0x00e3=Splitter:B:70:0x00e3, B:56:0x00c4=Splitter:B:56:0x00c4} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.cootek.smartinput5.func.C1435ak m6165a(java.io.File r12, boolean r13) {
        /*
            r11 = this;
            r0 = 0
            r8 = 0
            boolean r1 = r12.exists()
            if (r1 != 0) goto L_0x000a
            r0 = r8
        L_0x0009:
            return r0
        L_0x000a:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00a1, IOException -> 0x00bf, JSONException -> 0x00de, all -> 0x00fd }
            r10.<init>(r12)     // Catch:{ FileNotFoundException -> 0x00a1, IOException -> 0x00bf, JSONException -> 0x00de, all -> 0x00fd }
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x0134, IOException -> 0x0129, JSONException -> 0x011e, all -> 0x0115 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x0134, IOException -> 0x0129, JSONException -> 0x011e, all -> 0x0115 }
            com.cootek.smartinput.utilities.C0997e.m5178a((java.io.InputStream) r10, (java.io.OutputStream) r9)     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            byte[] r1 = r9.toByteArray()     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            java.lang.String r3 = "utf-8"
            r2.<init>(r1, r3)     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            r5.<init>(r2)     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            java.lang.String r1 = "id"
            java.lang.String r1 = r5.getString(r1)     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            java.lang.String r2 = "version"
            java.lang.String r2 = r5.getString(r2)     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            java.lang.String r3 = "handwrite_type"
            int r3 = r5.getInt(r3)     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            java.lang.String r4 = "compatible"
            java.lang.String r6 = r5.getString(r4)     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            int r4 = getType()     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            if (r3 != r4) goto L_0x0067
            r4 = 1
        L_0x0046:
            java.lang.String[] r7 = r11.f4152t     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            r7 = r7[r3]     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            boolean r6 = r6.equals(r7)     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            r4 = r4 & r6
            java.lang.String r6 = "files"
            org.json.JSONArray r5 = r5.getJSONArray(r6)     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            int r6 = r5.length()     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
        L_0x005b:
            int r7 = r6.length     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            if (r0 >= r7) goto L_0x0069
            java.lang.String r7 = r5.getString(r0)     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            r6[r0] = r7     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            int r0 = r0 + 1
            goto L_0x005b
        L_0x0067:
            r4 = r0
            goto L_0x0046
        L_0x0069:
            com.cootek.smartinput5.func.ak r0 = new com.cootek.smartinput5.func.ak     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            r5 = r13
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ FileNotFoundException -> 0x013a, IOException -> 0x012e, JSONException -> 0x0123 }
            if (r4 == 0) goto L_0x0087
            if (r10 == 0) goto L_0x0077
            r10.close()     // Catch:{ IOException -> 0x0082 }
        L_0x0077:
            if (r9 == 0) goto L_0x0009
            r9.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x0009
        L_0x007d:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0009
        L_0x0082:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0077
        L_0x0087:
            r0.mo6076a()     // Catch:{ FileNotFoundException -> 0x0141, IOException -> 0x0132, JSONException -> 0x0127 }
            if (r10 == 0) goto L_0x008f
            r10.close()     // Catch:{ IOException -> 0x009c }
        L_0x008f:
            if (r9 == 0) goto L_0x0009
            r9.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x0009
        L_0x0096:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0009
        L_0x009c:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x008f
        L_0x00a1:
            r0 = move-exception
            r1 = r0
            r2 = r8
            r0 = r8
        L_0x00a5:
            r1.printStackTrace()     // Catch:{ all -> 0x011a }
            if (r2 == 0) goto L_0x00ad
            r2.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ad:
            if (r8 == 0) goto L_0x0009
            r8.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x0009
        L_0x00b4:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0009
        L_0x00ba:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x00ad
        L_0x00bf:
            r0 = move-exception
            r1 = r0
            r9 = r8
            r10 = r8
            r0 = r8
        L_0x00c4:
            r1.printStackTrace()     // Catch:{ all -> 0x0118 }
            if (r10 == 0) goto L_0x00cc
            r10.close()     // Catch:{ IOException -> 0x00d9 }
        L_0x00cc:
            if (r9 == 0) goto L_0x0009
            r9.close()     // Catch:{ IOException -> 0x00d3 }
            goto L_0x0009
        L_0x00d3:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0009
        L_0x00d9:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x00cc
        L_0x00de:
            r0 = move-exception
            r1 = r0
            r9 = r8
            r10 = r8
            r0 = r8
        L_0x00e3:
            r1.printStackTrace()     // Catch:{ all -> 0x0118 }
            if (r10 == 0) goto L_0x00eb
            r10.close()     // Catch:{ IOException -> 0x00f8 }
        L_0x00eb:
            if (r9 == 0) goto L_0x0009
            r9.close()     // Catch:{ IOException -> 0x00f2 }
            goto L_0x0009
        L_0x00f2:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0009
        L_0x00f8:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x00eb
        L_0x00fd:
            r0 = move-exception
            r9 = r8
            r10 = r8
        L_0x0100:
            if (r10 == 0) goto L_0x0105
            r10.close()     // Catch:{ IOException -> 0x010b }
        L_0x0105:
            if (r9 == 0) goto L_0x010a
            r9.close()     // Catch:{ IOException -> 0x0110 }
        L_0x010a:
            throw r0
        L_0x010b:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0105
        L_0x0110:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x010a
        L_0x0115:
            r0 = move-exception
            r9 = r8
            goto L_0x0100
        L_0x0118:
            r0 = move-exception
            goto L_0x0100
        L_0x011a:
            r0 = move-exception
            r9 = r8
            r10 = r2
            goto L_0x0100
        L_0x011e:
            r0 = move-exception
            r1 = r0
            r9 = r8
            r0 = r8
            goto L_0x00e3
        L_0x0123:
            r0 = move-exception
            r1 = r0
            r0 = r8
            goto L_0x00e3
        L_0x0127:
            r1 = move-exception
            goto L_0x00e3
        L_0x0129:
            r0 = move-exception
            r1 = r0
            r9 = r8
            r0 = r8
            goto L_0x00c4
        L_0x012e:
            r0 = move-exception
            r1 = r0
            r0 = r8
            goto L_0x00c4
        L_0x0132:
            r1 = move-exception
            goto L_0x00c4
        L_0x0134:
            r0 = move-exception
            r1 = r0
            r2 = r10
            r0 = r8
            goto L_0x00a5
        L_0x013a:
            r0 = move-exception
            r1 = r0
            r2 = r10
            r0 = r8
            r8 = r9
            goto L_0x00a5
        L_0x0141:
            r1 = move-exception
            r8 = r9
            r2 = r10
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.HandWriteManager.m6165a(java.io.File, boolean):com.cootek.smartinput5.func.ak");
    }

    /* renamed from: m */
    private void m6167m() {
        File a = C1358O.m6234a(C1358O.f4195f);
        if (a != null) {
            for (File file : a.listFiles(new C1438an(this))) {
                C0997e.m5173a(file, new File(C1466av.m6848a(this.f4150r), file.getName()));
            }
        }
    }

    /* renamed from: a */
    public boolean mo5568a(String str) {
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
