package com.cootek.smartinput5.cust;

import android.content.Context;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.p048d.C1246d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.cust.a */
/* compiled from: CustomizeDataManager */
public class C1240a {

    /* renamed from: a */
    public static final int f3678a = 2;

    /* renamed from: b */
    public static final String f3679b = "emo_list_zh.lua.png";

    /* renamed from: c */
    public static final String f3680c = "emo_list_en.lua.png";

    /* renamed from: d */
    public static final String[] f3681d = {f3679b, f3680c};

    /* renamed from: e */
    public static final String f3682e = "emo_list_default.lua.png";

    /* renamed from: f */
    public static final String f3683f = "locale.lua.png";

    /* renamed from: g */
    public static final int f3684g = 1;

    /* renamed from: h */
    public static final int f3685h = 8;

    /* renamed from: i */
    private static C1240a f3686i;

    /* renamed from: j */
    private Context f3687j;

    /* renamed from: k */
    private ArrayList<String> f3688k = new ArrayList<>();

    /* renamed from: a */
    public static void m5988a(Context context) {
        f3686i = new C1240a(context);
    }

    /* renamed from: a */
    public static C1240a m5987a() {
        if (f3686i == null && C1368X.m6313b() != null) {
            f3686i = new C1240a(C1368X.m6313b());
        }
        return f3686i;
    }

    /* renamed from: b */
    public static void m5990b() {
        f3686i = null;
    }

    private C1240a(Context context) {
        this.f3687j = context;
        mo4570b(context.getResources().getConfiguration().locale.getCountry().equalsIgnoreCase("cn") ? "cn" : "en");
    }

    /* renamed from: c */
    public boolean mo4571c() {
        mo4572d();
        for (int i = 0; i < 2; i++) {
            mo4567a(f3681d[i]);
        }
        return true;
    }

    /* renamed from: a */
    public String mo4565a(int i) {
        if (i < 1 || i > 16) {
            return null;
        }
        if (i <= 8) {
            return mo4566a(i, f3679b);
        }
        return mo4566a(i - 8, f3680c);
    }

    /* renamed from: a */
    public void mo4567a(String str) {
        File a = C1466av.m6849a(this.f3687j, str);
        if (m5989a(a)) {
            try {
                FileWriter fileWriter = new FileWriter(a);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("return {\n");
                int c = m5991c(str);
                for (int i = 0; i < 8; i++) {
                    bufferedWriter.write(this.f3688k.get((c * 8) + i));
                }
                bufferedWriter.write("}");
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private int m5991c(String str) {
        int i = 0;
        while (i < 2 && !f3681d[i].equals(str)) {
            i++;
        }
        return i;
    }

    /* renamed from: d */
    public void mo4572d() {
        this.f3688k.clear();
        File a = C1466av.m6849a(this.f3687j, f3682e);
        if (m5989a(a)) {
            try {
                FileReader fileReader = new FileReader(a);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                bufferedReader.readLine();
                for (int i = 1; i <= 16; i++) {
                    this.f3688k.add(bufferedReader.readLine() + C0911j.f2473c);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public String mo4566a(int i, String str) {
        int i2 = 0;
        File a = C1466av.m6849a(this.f3687j, str);
        if (!m5989a(a)) {
            return null;
        }
        try {
            FileReader fileReader = new FileReader(a);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for (int i3 = 0; i3 < i; i3++) {
                bufferedReader.readLine();
            }
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            fileReader.close();
            String substring = readLine.substring(1, readLine.length() - 2);
            StringBuilder sb = new StringBuilder();
            while (i2 < substring.length()) {
                if (substring.charAt(i2) == '\\') {
                    sb.append(substring.charAt(i2 + 1));
                    i2++;
                } else {
                    sb.append(substring.charAt(i2));
                }
                i2++;
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private boolean m5989a(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            try {
                InputStream a = C1460o.m6799b().mo6099a(this.f3687j, file.getName());
                if (a == null) {
                    return false;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(C1466av.m6849a(this.f3687j, file.getName()));
                C0997e.m5178a(a, (OutputStream) fileOutputStream);
                a.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo4569b(int i, String str) {
        if (i < 1 || i > 16) {
            return false;
        }
        if (i <= 8) {
            return mo4568a(i, str, f3679b);
        }
        return mo4568a(i - 8, str, f3680c);
    }

    /* renamed from: a */
    public boolean mo4568a(int i, String str, String str2) {
        int i2;
        File a = C1466av.m6849a(this.f3687j, str2);
        if (!m5989a(a)) {
            return false;
        }
        this.f3688k.clear();
        try {
            FileReader fileReader = new FileReader(a);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for (int i3 = 0; i3 < i; i3++) {
                this.f3688k.add(bufferedReader.readLine());
            }
            bufferedReader.readLine();
            StringBuilder sb = new StringBuilder();
            sb.append('\"');
            for (int i4 = 0; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                if (charAt == '\\' || charAt == '\"') {
                    sb.append('\\');
                }
                sb.append(charAt);
            }
            sb.append('\"');
            if (i == 9) {
                sb.append('}');
            } else {
                sb.append(',');
            }
            this.f3688k.add(sb.toString());
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                this.f3688k.add(readLine);
            }
            bufferedReader.close();
            fileReader.close();
            FileWriter fileWriter = new FileWriter(a);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Iterator<String> it = this.f3688k.iterator();
            while (it.hasNext()) {
                bufferedWriter.write(it.next());
                bufferedWriter.write(10);
            }
            bufferedWriter.close();
            fileWriter.close();
            int i5 = 1;
            int i6 = 0;
            while (i5 <= 8) {
                if (this.f3688k.get(i5).length() > 3) {
                    i2 = i6 + 1;
                } else {
                    i2 = i6;
                }
                i5++;
                i6 = i2;
            }
            C1246d.m6010a(this.f3687j).mo4588a(C1246d.f3714K, i6, C1246d.f3730a);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo4570b(String str) {
        File a = C1466av.m6849a(this.f3687j, f3683f);
        if (!m5989a(a)) {
            return false;
        }
        try {
            FileWriter fileWriter = new FileWriter(a);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("return \".");
            bufferedWriter.write(str.toLowerCase());
            bufferedWriter.write("\"\n");
            bufferedWriter.close();
            fileWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
