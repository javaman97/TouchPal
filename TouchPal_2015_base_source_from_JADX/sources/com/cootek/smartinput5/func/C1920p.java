package com.cootek.smartinput5.func;

import android.content.Context;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2183M;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.p */
/* compiled from: BigramManager */
public class C1920p implements C2183M.C2184a {

    /* renamed from: a */
    public static final String f6497a = ".tpb";

    /* renamed from: b */
    private static final String f6498b = "id";

    /* renamed from: c */
    private static final String f6499c = "version";

    /* renamed from: d */
    private static final String f6500d = "compatible";

    /* renamed from: e */
    private Context f6501e;

    /* renamed from: f */
    private C1903o f6502f;

    /* renamed from: g */
    private final String f6503g;

    /* renamed from: h */
    private ArrayList<C1921a> f6504h = new ArrayList<>();

    /* renamed from: i */
    private boolean f6505i;

    /* renamed from: com.cootek.smartinput5.func.p$a */
    /* compiled from: BigramManager */
    public interface C1921a {
        /* renamed from: s_ */
        boolean mo7081s_();
    }

    public C1920p(Context context) {
        this.f6501e = context;
        this.f6503g = C1974m.m9063a(context, (int) R.string.BIGRAM_TARGET_VERSION);
        m8790g();
    }

    /* renamed from: a */
    public void mo7075a(C1921a aVar) {
        this.f6504h.add(aVar);
    }

    /* renamed from: b */
    public void mo7076b(C1921a aVar) {
        this.f6504h.remove(aVar);
    }

    /* renamed from: a */
    public void mo5566a(String str, File file) {
        if (file != null) {
            file.renameTo(new File(file.getParentFile(), "pinyin.tpb"));
            mo7074a();
        }
    }

    /* renamed from: a */
    public void mo7074a() {
        m8790g();
        Iterator<C1921a> it = this.f6504h.iterator();
        while (it.hasNext()) {
            if (!it.next().mo7081s_()) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public boolean mo7077b() {
        return this.f6505i || this.f6502f != null;
    }

    /* renamed from: c */
    public boolean mo7078c() {
        return this.f6505i;
    }

    /* renamed from: d */
    public C1903o mo7079d() {
        return this.f6502f;
    }

    /* renamed from: g */
    private void m8790g() {
        if (C1593bR.m7162a().f5078d) {
            this.f6505i = true;
        } else {
            this.f6505i = true;
        }
        if (!this.f6505i) {
            File a = C1358O.m6234a(C1358O.f4199j);
            if (a != null) {
                File file = new File(a, "pinyin.tpb");
                if (file.exists()) {
                    this.f6502f = m8789a(file);
                } else {
                    this.f6502f = null;
                }
            } else {
                this.f6502f = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0088 A[SYNTHETIC, Splitter:B:42:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096 A[SYNTHETIC, Splitter:B:49:0x0096] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0073=Splitter:B:30:0x0073, B:39:0x0083=Splitter:B:39:0x0083} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.cootek.smartinput5.func.C1903o m8789a(java.io.File r11) {
        /*
            r10 = this;
            r7 = 4
            r0 = 0
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00a3, JSONException -> 0x0081, all -> 0x0091 }
            r2.<init>(r11)     // Catch:{ IOException -> 0x00a3, JSONException -> 0x0081, all -> 0x0091 }
            r3 = 4
            byte[] r5 = new byte[r3]     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            r2.read(r5)     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            r3 = r1
            r4 = r1
        L_0x0010:
            if (r1 >= r7) goto L_0x001d
            byte r6 = r5[r1]     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << r3
            r4 = r4 | r6
            int r3 = r3 + 8
            int r1 = r1 + 1
            goto L_0x0010
        L_0x001d:
            long r6 = (long) r4     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            long r8 = r11.length()     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0031
            if (r2 == 0) goto L_0x002b
            r2.close()     // Catch:{ IOException -> 0x002c }
        L_0x002b:
            return r0
        L_0x002c:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x002b
        L_0x0031:
            byte[] r1 = new byte[r4]     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            r2.read(r1)     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            java.lang.String r5 = "utf-8"
            r4.<init>(r1, r5)     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            java.lang.String r1 = "id"
            java.lang.String r4 = r3.getString(r1)     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            java.lang.String r1 = "version"
            java.lang.String r5 = r3.getString(r1)     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            java.lang.String r1 = "compatible"
            java.lang.String r1 = r3.getString(r1)     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            java.lang.String r3 = r10.f6503g     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            if (r1 == 0) goto L_0x006e
            com.cootek.smartinput5.func.o r1 = new com.cootek.smartinput5.func.o     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            r3 = 1
            r1.<init>(r4, r5, r11, r3)     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            r0 = r1
        L_0x0063:
            if (r2 == 0) goto L_0x002b
            r2.close()     // Catch:{ IOException -> 0x0069 }
            goto L_0x002b
        L_0x0069:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x002b
        L_0x006e:
            r11.delete()     // Catch:{ IOException -> 0x0072, JSONException -> 0x00a1 }
            goto L_0x0063
        L_0x0072:
            r1 = move-exception
        L_0x0073:
            r1.printStackTrace()     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x002b
            r2.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x002b
        L_0x007c:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x002b
        L_0x0081:
            r1 = move-exception
            r2 = r0
        L_0x0083:
            r1.printStackTrace()     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x002b
            r2.close()     // Catch:{ IOException -> 0x008c }
            goto L_0x002b
        L_0x008c:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x002b
        L_0x0091:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0094:
            if (r2 == 0) goto L_0x0099
            r2.close()     // Catch:{ IOException -> 0x009a }
        L_0x0099:
            throw r0
        L_0x009a:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0099
        L_0x009f:
            r0 = move-exception
            goto L_0x0094
        L_0x00a1:
            r1 = move-exception
            goto L_0x0083
        L_0x00a3:
            r1 = move-exception
            r2 = r0
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1920p.m8789a(java.io.File):com.cootek.smartinput5.func.o");
    }

    /* renamed from: e */
    public void mo7080e() {
        if (this.f6502f != null) {
            this.f6502f.mo7050a();
        }
        mo7074a();
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
