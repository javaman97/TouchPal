package com.cootek.smartinput5.func.component;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.SettingsService;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.func.C1579bD;
import com.cootek.smartinput5.func.component.C1671f;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2220ah;
import com.cootek.smartinput5.net.cmd.C2262a;
import com.cootek.smartinput5.net.cmd.C2265b;
import com.cootek.smartinput5.net.cmd.C2270d;
import com.cootek.smartinput5.net.cmd.C2273e;
import com.cootek.smartinput5.net.cmd.C2276f;
import com.cootek.smartinput5.net.cmd.C2279g;
import com.cootek.smartinput5.net.cmd.C2282h;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.component.Y */
/* compiled from: UserDataSync */
public class C1664Y implements C1671f.C1672a {

    /* renamed from: a */
    public static final int f5409a = 0;

    /* renamed from: b */
    public static final int f5410b = 1;

    /* renamed from: c */
    private static final int f5411c = 1;

    /* renamed from: d */
    private static final int f5412d = 2;

    /* renamed from: e */
    private static final int f5413e = 3;

    /* renamed from: f */
    private static final int f5414f = 4;

    /* renamed from: g */
    private static final int f5415g = 5;

    /* renamed from: h */
    private static final int f5416h = 6;

    /* renamed from: i */
    private static final int f5417i = 7;

    /* renamed from: k */
    private static final String f5418k = "UserDataSync";

    /* renamed from: p */
    private static final int f5419p = 0;

    /* renamed from: q */
    private static final int f5420q = 1;

    /* renamed from: r */
    private static final int f5421r = 2;

    /* renamed from: t */
    private static final int f5422t = 0;

    /* renamed from: u */
    private static final int f5423u = 1;

    /* renamed from: v */
    private static final int f5424v = 2;

    /* renamed from: x */
    private static String[] f5425x = {"western", "chinese_simplified", "chinese_traditional"};

    /* renamed from: j */
    private boolean f5426j;

    /* renamed from: l */
    private Context f5427l;

    /* renamed from: m */
    private String f5428m;

    /* renamed from: n */
    private C1671f f5429n;

    /* renamed from: o */
    private int f5430o;

    /* renamed from: s */
    private int f5431s;

    /* renamed from: w */
    private int f5432w;

    /* renamed from: y */
    private HashMap<String, Long> f5433y;

    /* renamed from: b */
    private String m7615b(int i) {
        if (i >= f5425x.length) {
            return null;
        }
        return f5425x[i];
    }

    public C1664Y(Context context) {
        this(context, (C2220ah.C2221a) null);
    }

    public C1664Y(Context context, C2220ah.C2221a aVar) {
        this.f5426j = false;
        this.f5427l = context;
        m7616b(context);
        this.f5429n = new C1671f(this.f5427l, aVar);
        this.f5429n.mo6528a((C1671f.C1672a) this);
        this.f5429n.mo6529a(this.f5428m);
        this.f5429n.mo6535b("application/octet-stream");
    }

    /* renamed from: b */
    private void m7616b(Context context) {
        this.f5428m = "0";
        this.f5428m = String.format("%d", new Object[]{Integer.valueOf(context.getResources().getInteger(R.integer.ime_version_code))});
    }

    /* renamed from: b */
    public String mo6507b(String str) {
        long a = C0997e.m5170a(this.f5427l, str, 5);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: g */
    private ArrayList<C2282h.C2283a> m7618g() {
        ArrayList<C2282h.C2283a> arrayList = new ArrayList<>();
        for (String str : f5425x) {
            C2282h.C2283a aVar = new C2282h.C2283a();
            aVar.f9986a = str;
            aVar.f9987b = this.f5428m;
            aVar.f9988c = Settings.getInstance().getLongSetting(Settings.USER_DIC_BASE_VERSION, 21, str, (Config) null);
            long longSetting = (Settings.getInstance().getLongSetting(Settings.USER_DIC_CURRENT_VERSION, 21, str, (Config) null) - Settings.getInstance().getLongSetting(Settings.USER_DIC_REF_VERSION, 21, str, (Config) null)) + aVar.f9988c;
            if (longSetting < 0) {
                longSetting = 0;
            }
            aVar.f9989d = longSetting;
            aVar.f9990e = mo6507b(str);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: h */
    private ArrayList<C2270d.C2271a> m7619h() {
        ArrayList<C2270d.C2271a> arrayList = new ArrayList<>();
        for (String str : f5425x) {
            C2270d.C2271a aVar = new C2270d.C2271a();
            aVar.f9918a = str;
            aVar.f9919b = this.f5428m;
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo6513c() {
        for (String str : f5425x) {
            Settings.getInstance().setLongSetting(Settings.USER_DIC_BASE_VERSION, 0, 21, str, (Config) null, true);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Settings.getInstance().setLongSetting(Settings.USER_DIC_REF_VERSION, currentTimeMillis, 21, str, (Config) null, true);
            Settings.getInstance().setLongSetting(Settings.USER_DIC_CURRENT_VERSION, currentTimeMillis, 21, str, (Config) null, true);
            Settings.getInstance().setStringSetting(Settings.USER_DIC_MD5, "", 21, str, (Config) null, true);
        }
    }

    /* renamed from: a */
    public void mo6504a(boolean z) {
        if (this.f5429n != null) {
            this.f5432w = 0;
            this.f5429n.mo6533a(z, m7618g());
        }
    }

    /* renamed from: b */
    public void mo6510b(boolean z) {
        if (this.f5429n != null) {
            this.f5432w = 1;
            this.f5429n.mo6536b(z, m7619h());
        }
    }

    /* renamed from: a */
    public void mo6505a(boolean z, String str) {
        if (this.f5429n != null) {
            this.f5432w = 0;
            this.f5429n.mo6531a(z, mo6487a().mo6526a(str, (String) null, (String) null));
        }
    }

    /* renamed from: b */
    public void mo6511b(boolean z, String str) {
        if (this.f5429n != null) {
            this.f5432w = 0;
            this.f5429n.mo6532a(z, mo6487a().mo6537c(str));
        }
    }

    /* renamed from: a */
    public void mo6499a(C2282h hVar, StringBuilder sb) {
        if (hVar.mo7863j() == null) {
            String a = m7613a(hVar.f9746O, hVar.f9748Q, 1);
            if (!this.f5426j) {
                m7614a(sb, a);
            } else if (sb != null) {
                sb.append(C0911j.f2473c);
                sb.append(C1974m.m9063a(this.f5427l, (int) R.string.sync_userdata_synclist_fail));
                sb.append(a);
            }
            this.f5430o = 2;
            C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/synclist", C1246d.f3947s, C1246d.f3933e);
            return;
        }
        C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/synclist", C1246d.f3946r, C1246d.f3933e);
    }

    /* renamed from: a */
    public void mo6500a(C2282h hVar, StringBuilder sb, boolean z) {
        if (z) {
            this.f5430o = 0;
            String a = C1974m.m9063a(this.f5427l, (int) R.string.sync_userdata_nope);
            sb.append(C0911j.f2473c);
            sb.append(a);
        }
    }

    /* renamed from: a */
    public void mo6497a(C2276f fVar, StringBuilder sb) {
        if (fVar.mo7852j() == null) {
            C2276f.C2277a l_ = fVar.mo7854l_();
            if (l_ != null) {
                String a = m7613a(fVar.f9746O, fVar.f9748Q, 2);
                if (!this.f5426j) {
                    m7614a(sb, a);
                } else {
                    sb.append(C0911j.f2473c);
                    sb.append(String.format(C1974m.m9063a(this.f5427l, (int) R.string.sync_userdata_backup_fail), new Object[]{l_.f9948a}));
                    sb.append(a);
                }
                C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/backup_info", l_.f9948a + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3947s, C1246d.f3933e);
            }
            this.f5430o = 2;
            return;
        }
        C2276f.C2277a l_2 = fVar.mo7854l_();
        if (l_2 != null) {
            C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/backup_info", l_2.f9948a + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3946r, C1246d.f3933e);
        }
    }

    /* renamed from: a */
    public void mo6492a(C2262a aVar, StringBuilder sb) {
        if (aVar.mo7835f() == null) {
            C2262a.C2263a g = aVar.mo7836g();
            if (g != null) {
                String a = m7613a(aVar.f9746O, aVar.f9748Q, 3);
                if (!this.f5426j) {
                    m7614a(sb, a);
                } else {
                    sb.append(C0911j.f2473c);
                    sb.append(String.format(C1974m.m9063a(this.f5427l, (int) R.string.sync_userdata_as3_upload_fail), new Object[]{g.f9832d}));
                    sb.append(a);
                }
                C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/as3_backup", g.f9832d + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3947s, C1246d.f3933e);
            }
            this.f5430o = 2;
            return;
        }
        C2262a.C2263a g2 = aVar.mo7836g();
        if (g2 != null) {
            C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/as3_backup", g2.f9832d + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3946r, C1246d.f3933e);
        }
    }

    /* renamed from: a */
    public void mo6496a(C2273e eVar, StringBuilder sb) {
        C2273e.C2275b j = eVar.mo7847j();
        if (j != null) {
            if (this.f5426j) {
                sb.append(C0911j.f2473c);
                sb.append(String.format(C1974m.m9063a(this.f5427l, (int) R.string.sync_userdata_confirm_success), new Object[]{j.f9935a}));
            }
            C2273e.C2274a k = eVar.mo7848k();
            if (k != null) {
                C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/backup_confirm", k.f9931a + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3946r, C1246d.f3933e);
                return;
            }
            return;
        }
        C2273e.C2274a k2 = eVar.mo7848k();
        if (k2 != null) {
            String a = m7613a(eVar.f9746O, eVar.f9748Q, 4);
            if (!this.f5426j) {
                m7614a(sb, a);
            } else {
                sb.append(C0911j.f2473c);
                sb.append(String.format(C1974m.m9063a(this.f5427l, (int) R.string.sync_userdata_confirm_fail), new Object[]{k2.f9931a}));
                sb.append(a);
            }
            C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/backup_confirm", k2.f9931a + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3947s, C1246d.f3933e);
        }
        this.f5430o = 2;
    }

    /* renamed from: a */
    public void mo6490a(long j, String str) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Settings.getInstance().setLongSetting(Settings.USER_DIC_BASE_VERSION, j, 21, str, (Config) null, true);
        Settings.getInstance().setLongSetting(Settings.USER_DIC_REF_VERSION, currentTimeMillis, 21, str, (Config) null, true);
        Settings.getInstance().setLongSetting(Settings.USER_DIC_CURRENT_VERSION, currentTimeMillis, 21, str, (Config) null, true);
    }

    /* renamed from: b */
    public void mo6508b(long j, String str) {
        if (this.f5433y == null) {
            this.f5433y = new HashMap<>();
        }
        if (!TextUtils.isEmpty(str)) {
            this.f5433y.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public void mo6502a(String str, Bundle bundle) {
        if (bundle != null) {
            long j = bundle.getLong("lastModified", 0);
            if (j != 0 && this.f5433y != null && this.f5433y.containsKey(str)) {
                String string = bundle.getString("md5");
                Settings.getInstance().setLongSetting(Settings.USER_DIC_REF_VERSION, j, 21, str, (Config) null, true);
                Settings.getInstance().setLongSetting(Settings.USER_DIC_CURRENT_VERSION, j, 21, str, (Config) null, true);
                if (!TextUtils.isEmpty(string)) {
                    Settings.getInstance().setStringSetting(Settings.USER_DIC_MD5, string, 21, str, (Config) null, true);
                }
                Settings.getInstance().setLongSetting(Settings.USER_DIC_BASE_VERSION, this.f5433y.get(str).longValue(), 21, str, (Config) null, true);
            }
        }
    }

    /* renamed from: a */
    public void mo6498a(C2279g gVar, StringBuilder sb) {
        if (gVar.mo7858j() == null) {
            C2279g.C2280a k = gVar.mo7859k();
            if (k != null) {
                String a = m7613a(gVar.f9746O, gVar.f9748Q, 5);
                if (!this.f5426j) {
                    m7614a(sb, a);
                } else {
                    sb.append(C0911j.f2473c);
                    sb.append(String.format(C1974m.m9063a(this.f5427l, (int) R.string.sync_userdata_restore_fail), new Object[]{k.f9966a}));
                    sb.append(a);
                }
                C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/restore_info", k.f9966a + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3947s, C1246d.f3933e);
            }
            this.f5430o = 2;
            return;
        }
        C2279g.C2280a k2 = gVar.mo7859k();
        if (k2 != null) {
            C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/restore_info", k2.f9966a + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3946r, C1246d.f3933e);
        }
    }

    /* renamed from: a */
    public void mo6493a(C2265b bVar) {
        if (bVar != null && TextUtils.isEmpty(bVar.f9845e)) {
            String str = bVar.mo7839i().f9849a;
            if (!TextUtils.isEmpty(str)) {
                bVar.f9845e = str + C1579bD.f4987i;
            }
        }
    }

    /* renamed from: a */
    public void mo6494a(C2265b bVar, StringBuilder sb) {
        C2265b.C2267b f = bVar.mo7837f();
        if (f != null) {
            if (this.f5426j) {
                sb.append(C0911j.f2473c);
                sb.append(String.format(C1974m.m9063a(this.f5427l, (int) R.string.sync_userdata_as3_restore_success), new Object[]{f.f9854a}));
            }
            C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/as3_restore", f.f9854a + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3946r, C1246d.f3933e);
            return;
        }
        C2265b.C2266a i = bVar.mo7839i();
        if (i != null) {
            String a = m7613a(bVar.f9746O, bVar.f9748Q, 6);
            if (!this.f5426j) {
                m7614a(sb, a);
            } else {
                sb.append(C0911j.f2473c);
                sb.append(String.format(C1974m.m9063a(this.f5427l, (int) R.string.sync_userdata_as3_restore_fail), new Object[]{i.f9849a}));
                sb.append(a);
            }
            C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/as3_restore", i.f9849a + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3947s, C1246d.f3933e);
        }
        this.f5430o = 2;
    }

    /* renamed from: a */
    public void mo6495a(C2270d dVar, StringBuilder sb) {
        if (dVar.mo7842j() == null) {
            mo6509b(dVar.mo7843k().f9918a, sb);
        }
    }

    /* renamed from: a */
    public void mo6503a(String str, StringBuilder sb) {
        if (this.f5426j) {
            sb.append(C0911j.f2473c);
            sb.append(String.format(C1974m.m9063a(this.f5427l, (int) R.string.clear_one_userdata_success), new Object[]{str}));
        } else if (this.f5431s != 2) {
            this.f5431s = 1;
        }
        C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/cloud_sync_clear", str + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3946r, C1246d.f3933e);
    }

    /* renamed from: b */
    public void mo6509b(String str, StringBuilder sb) {
        if (!this.f5426j) {
            this.f5431s = 2;
            m7614a(sb, "");
        } else {
            sb.append(C0911j.f2473c);
            sb.append(String.format(C1974m.m9063a(this.f5427l, (int) R.string.clear_one_userdata_failed), new Object[]{str}));
        }
        C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/cloud_sync_clear", str + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3947s, C1246d.f3933e);
        this.f5430o = 2;
    }

    /* renamed from: c */
    public void mo6514c(String str, StringBuilder sb) {
        if (this.f5426j) {
            sb.append(C0911j.f2473c);
            sb.append(String.format(C1974m.m9063a(this.f5427l, (int) R.string.clear_one_userdata_nothing), new Object[]{str}));
        } else if (!(this.f5431s == 2 || this.f5431s == 1)) {
            this.f5431s = 0;
        }
        C1246d.m6010a(this.f5427l).mo4591a("CLOUD_SYNC/cloud_sync_clear", str + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + C1246d.f3704A, C1246d.f3933e);
    }

    /* renamed from: a */
    public String mo6488a(String str) {
        return str + C1579bD.f4987i;
    }

    /* renamed from: a */
    public void mo6501a(String str, int i, StringBuilder sb) {
        if (this.f5426j) {
            sb.append(C0911j.f2473c);
            sb.append(String.format(C1974m.m9063a(this.f5427l, (int) R.string.sync_userdata_file_too_large), new Object[]{str, Integer.valueOf(i)}));
        }
    }

    /* renamed from: a */
    private String m7613a(int i, int i2, int i3) {
        return String.format("(%d-%d-%d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i2)});
    }

    /* renamed from: a */
    public C1671f mo6487a() {
        return this.f5429n;
    }

    /* renamed from: b */
    public String[] mo6512b() {
        return f5425x;
    }

    /* renamed from: a */
    public void mo6491a(Context context) {
        if (context != null) {
            this.f5427l = context;
            if (this.f5429n != null) {
                this.f5429n.mo6534b(context);
            }
        }
    }

    /* renamed from: d */
    public boolean mo6515d() {
        if (!Engine.isInitialized() || !Engine.getInstance().getIms().isInputViewShown()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo6516e() {
        this.f5430o = 1;
        this.f5431s = -1;
        if (this.f5433y != null) {
            this.f5433y.clear();
        }
    }

    /* renamed from: a */
    public boolean mo6506a(StringBuilder sb) {
        if (this.f5430o == 1) {
            if (!this.f5426j) {
                String str = "";
                if (this.f5432w == 0) {
                    str = C1974m.m9063a(this.f5427l, (int) R.string.sync_userdata_success);
                    C1246d.m6010a(this.f5427l).mo4591a(C1246d.f3738aH, C1246d.f3946r, C1246d.f3933e);
                } else if (this.f5432w == 1) {
                    if (this.f5431s == 1) {
                        str = C1974m.m9063a(this.f5427l, (int) R.string.clear_userdata_success);
                    } else if (this.f5431s == 0) {
                        str = C1974m.m9063a(this.f5427l, (int) R.string.clear_userdata_nothing);
                    }
                }
                sb.append(str);
            }
            if (this.f5432w == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Settings.getInstance().setLongSetting(Settings.CLOUD_SERVICE_LAST_SYNC_TIME, currentTimeMillis);
                Message obtain = Message.obtain((Handler) null, 3);
                Bundle bundle = new Bundle();
                bundle.putInt(IPCManager.SETTING_TYPE, 4);
                bundle.putInt(IPCManager.SETTING_KEY, Settings.CLOUD_SERVICE_LAST_SYNC_TIME);
                bundle.putLong(IPCManager.SETTING_VALUE, currentTimeMillis);
                obtain.setData(bundle);
                SettingsService.doNotifyClients(obtain);
            }
        }
        if (this.f5430o != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m7614a(StringBuilder sb, String str) {
        if (this.f5430o != 2 && !this.f5426j) {
            String str2 = "";
            if (this.f5432w == 0) {
                str2 = C1974m.m9063a(this.f5427l, (int) R.string.sync_userdata_failed);
            } else if (this.f5432w == 1) {
                str2 = C1974m.m9063a(this.f5427l, (int) R.string.clear_userdata_failed);
            }
            sb.append(str2);
            sb.append(str);
        }
    }

    /* renamed from: f */
    public void mo6517f() {
        for (String c : f5425x) {
            m7617c(c);
        }
    }

    /* renamed from: a */
    public void mo6489a(int i) {
        String b = m7615b(i);
        if (!TextUtils.isEmpty(b)) {
            m7617c(b);
        }
    }

    /* renamed from: c */
    private void m7617c(String str) {
        String str2;
        String stringSetting = Settings.getInstance().getStringSetting(Settings.USER_DIC_MD5, 21, str, (Config) null);
        Bundle b = C0997e.m5186b(this.f5427l, str);
        String string = b.getString("md5");
        long j = b.getLong("lastModified", 0);
        if (string == null) {
            str2 = "";
        } else {
            str2 = string;
        }
        if (!TextUtils.isEmpty(str2) && !str2.equals(stringSetting)) {
            Settings.getInstance().setLongSetting(Settings.USER_DIC_CURRENT_VERSION, j, 21, str, (Config) null, true);
            Settings.getInstance().setStringSetting(Settings.USER_DIC_MD5, str2, 21, str, (Config) null, true);
        }
    }
}
