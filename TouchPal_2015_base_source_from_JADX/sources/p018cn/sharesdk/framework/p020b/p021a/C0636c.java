package p018cn.sharesdk.framework.p020b.p021a;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: cn.sharesdk.framework.b.a.c */
public class C0636c {

    /* renamed from: c */
    private static C0636c f1521c;

    /* renamed from: a */
    private Context f1522a;

    /* renamed from: b */
    private SharedPreferences f1523b = this.f1522a.getSharedPreferences("share_sdk_0", 0);

    private C0636c(Context context) {
        this.f1522a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C0636c m3622a(Context context) {
        if (f1521c == null) {
            f1521c = new C0636c(context.getApplicationContext());
        }
        return f1521c;
    }

    /* renamed from: a */
    public long mo2291a() {
        return this.f1523b.getLong("service_time", 0);
    }

    /* renamed from: a */
    public long mo2292a(String str) {
        return this.f1523b.getLong(str, 0);
    }

    /* renamed from: a */
    public void mo2293a(String str, int i) {
        SharedPreferences.Editor edit = this.f1523b.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    /* renamed from: a */
    public void mo2294a(String str, Long l) {
        SharedPreferences.Editor edit = this.f1523b.edit();
        edit.putLong(str, l.longValue());
        edit.commit();
    }

    /* renamed from: a */
    public void mo2295a(String str, String str2) {
        SharedPreferences.Editor edit = this.f1523b.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    /* renamed from: b */
    public int mo2296b(String str) {
        return this.f1523b.getInt(str, 0);
    }

    /* renamed from: b */
    public boolean mo2297b() {
        return Boolean.parseBoolean(this.f1523b.getString("upload_device_info", "true"));
    }

    /* renamed from: c */
    public void mo2298c(String str) {
        mo2295a("upload_device_info", str);
    }

    /* renamed from: c */
    public boolean mo2299c() {
        return Boolean.parseBoolean(this.f1523b.getString("upload_user_info", "true"));
    }

    /* renamed from: d */
    public int mo2300d() {
        String string = this.f1523b.getString("upload_share_content", "0");
        if ("true".equals(string)) {
            return 1;
        }
        return "false".equals(string) ? -1 : 0;
    }

    /* renamed from: d */
    public void mo2301d(String str) {
        mo2295a("upload_user_info", str);
    }

    /* renamed from: e */
    public void mo2302e(String str) {
        mo2295a("upload_share_content", str);
    }
}
