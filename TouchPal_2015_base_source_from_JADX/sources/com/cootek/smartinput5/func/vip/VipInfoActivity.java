package com.cootek.smartinput5.func.vip;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.widget.Toast;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput.utilities.C0990F;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.func.iab.C1754V;
import com.cootek.smartinput5.func.iab.C1769ah;
import com.cootek.smartinput5.func.iab.C1778f;
import com.cootek.smartinput5.func.iab.C1789h;
import com.cootek.smartinput5.func.iab.google.ControlActivity;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.cmd.C2238A;
import com.cootek.smartinput5.net.login.C2339l;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;

public class VipInfoActivity extends PreferenceActivity {

    /* renamed from: b */
    private static final String f8945b = "purchase_info_file.txt";

    /* renamed from: c */
    private static final String f8946c = "information.zip";

    /* renamed from: d */
    private static final String f8947d = "VipInfoActivity";

    /* renamed from: e */
    private static final String f8948e = "root";

    /* renamed from: f */
    private static final int f8949f = -1;

    /* renamed from: h */
    private static final int f8950h = 1;

    /* renamed from: i */
    private static final int f8951i = 2;

    /* renamed from: j */
    private static final int f8952j = 3;

    /* renamed from: a */
    C1246d f8953a;

    /* renamed from: g */
    private boolean f8954g = false;

    /* renamed from: k */
    private int f8955k = 0;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        if (C1368X.m6320c() != null) {
            this.f8953a = C1246d.m6010a((Context) this);
        }
        setTitle(m9577b((int) R.string.account));
        addPreferencesFromResource(R.xml.account_info);
        C1730E.m7962a((Context) this);
        C1056a.m5588a().mo4264a(C1056a.f2940A, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9566a() {
        if (!m9581b()) {
            m9582c();
        }
    }

    /* renamed from: b */
    private boolean m9581b() {
        String e = C1617br.m7367a().mo6340g().mo7965e();
        if (C2339l.f10313m.equals(e)) {
            m9593h();
            return true;
        } else if (!C2339l.f10312l.equals(e)) {
            return false;
        } else {
            m9585d();
            return true;
        }
    }

    /* renamed from: c */
    private void m9582c() {
        if (this.f8954g) {
            finish();
            return;
        }
        this.f8954g = true;
        C1617br.m7367a().mo6333b((Context) this);
    }

    /* renamed from: d */
    private void m9585d() {
        m9576a(false);
        if (C1617br.m7367a().mo6340g().mo7967g() != 0) {
            m9595i();
        }
        m9600l();
        m9587e();
    }

    /* renamed from: e */
    private void m9587e() {
        m9568a((int) R.string.optpage_account_logout_summary, -1, (Preference.OnPreferenceClickListener) new C2111u(this), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m9589f() {
        C1789h.m8227a().mo6795a((Context) this, (C1789h.C1791b) new C2068B(this, m9577b((int) R.string.logout_in_progress)));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m9591g() {
        if (!C1584bI.m7141a((Context) this, (Runnable) null, false)) {
            C1789h.m8227a().mo6794a((Context) this, (C1789h.C1790a) new C2069C(this));
        }
    }

    /* renamed from: h */
    private void m9593h() {
        m9576a(true);
        m9595i();
        m9574a(m9610v(), m9612x(), (Preference.OnPreferenceClickListener) null, true);
        m9574a(m9611w(), m9613y(), (Preference.OnPreferenceClickListener) null, true);
        m9605q();
        m9600l();
        m9587e();
    }

    /* renamed from: i */
    private void m9595i() {
        m9574a(m9577b((int) R.string.vip_renew_notification_title), (String) null, (Preference.OnPreferenceClickListener) new C2072F(this), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m9597j() {
        Intent intent = new Intent();
        intent.setClass(this, VipRenewActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        startActivity(intent);
    }

    /* renamed from: k */
    private void m9599k() {
        Intent intent = new Intent();
        intent.setClass(this, ControlActivity.class);
        intent.setFlags(Engine.EXCEPTION_ERROR);
        startActivity(intent);
    }

    /* renamed from: a */
    private void m9576a(boolean z) {
        m9603o();
        m9574a(C1617br.m7367a().mo6340g().mo7964d(), m9578b(z), (Preference.OnPreferenceClickListener) new C2073G(this), true);
    }

    /* renamed from: l */
    private void m9600l() {
        m9574a(m9577b((int) R.string.optpage_customer_service), m9577b((int) R.string.optpage_purchase_problem), (Preference.OnPreferenceClickListener) new C2074H(this), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m9601m() {
        m9575a(m9577b((int) R.string.msg_generating_report), false);
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6679a(C1778f.f5818al, (C1746T.C1750d) new C2075I(this));
            C1730E.m8005d().mo6679a(C1778f.f5819am, (C1746T.C1750d) new C2076J(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9567a(int i) {
        this.f8955k |= i;
        if (this.f8955k == 3) {
            m9602n();
        }
    }

    /* renamed from: n */
    private void m9602n() {
        String str = null;
        if (C1730E.m8004c()) {
            str = C1769ah.m8128a((ArrayList<C1754V>) (ArrayList) C1730E.m8005d().mo6715b());
        }
        m9573a(str);
    }

    /* renamed from: a */
    private void m9573a(String str) {
        new C2090a(str).execute(new String[0]);
    }

    /* renamed from: b */
    private String m9578b(boolean z) {
        int i;
        if (z) {
            i = R.string.account_type_vip;
        } else {
            i = R.string.account_type_basic;
        }
        return m9577b(i);
    }

    /* renamed from: o */
    private void m9603o() {
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference(f8948e);
        if (preferenceScreen != null) {
            preferenceScreen.removeAll();
        }
    }

    /* renamed from: a */
    private void m9568a(int i, int i2, Preference.OnPreferenceClickListener onPreferenceClickListener, boolean z) {
        m9574a(m9577b(i), i2 == -1 ? null : m9577b(i2), onPreferenceClickListener, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m9577b(int i) {
        return C1974m.m9063a((Context) this, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m9562a(int i, Object... objArr) {
        return C1974m.m9064a((Context) this, i, objArr);
    }

    /* renamed from: a */
    private void m9574a(String str, String str2, Preference.OnPreferenceClickListener onPreferenceClickListener, boolean z) {
        Preference preference = new Preference(this);
        preference.setTitle(str);
        if (str2 != null) {
            preference.setSummary(str2);
        }
        preference.setEnabled(z);
        preference.setOnPreferenceClickListener(onPreferenceClickListener);
        m9570a(preference);
    }

    /* renamed from: a */
    private void m9570a(Preference preference) {
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference(f8948e);
        if (preferenceScreen != null && preference != null) {
            preferenceScreen.addPreference(preference);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6686f();
        }
        if (C1368X.m6324d()) {
            C1368X.m6325e();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6684b((Context) this);
        }
        m9566a();
    }

    /* renamed from: a */
    private void m9575a(String str, boolean z) {
        m9604p();
        C1789h.m8227a().mo6795a((Context) this, (C1789h.C1791b) new C2077K(this, z, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m9604p() {
        C1789h.m8227a().mo6796b();
    }

    /* renamed from: q */
    private void m9605q() {
        if (C1617br.m7367a().mo6340g().mo7971k()) {
            m9568a((int) R.string.vip_cancel_btn_title, (int) R.string.vip_cancel_btn_summary, (Preference.OnPreferenceClickListener) new C2112v(this), true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m9606r() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(m9577b((int) R.string.vip_cancel_msg));
        builder.setPositiveButton(m9577b((int) R.string.vip_confirm_yes), new C2113w(this));
        builder.setNegativeButton(m9577b((int) R.string.vip_confirm_no), (DialogInterface.OnClickListener) null);
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m9607s() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(m9562a((int) R.string.vip_cancel_expire_info, DateFormat.getDateInstance(2, getResources().getConfiguration().locale).format(Long.valueOf(C1617br.m7367a().mo6340g().mo7967g() * 1000)))).setPositiveButton(m9577b((int) R.string.vip_confirm_yes), new C2114x(this)).setNegativeButton(m9577b((int) R.string.vip_cancel_subs_keep), (DialogInterface.OnClickListener) null);
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9569a(int i, int i2, C2238A.C2239a aVar) {
        if (i == 200 && i2 == 0 && aVar != null) {
            m9583c(aVar.f9471f);
            return;
        }
        m9604p();
        Toast.makeText(this, m9561a(i, i2), 1).show();
    }

    /* renamed from: a */
    private String m9561a(int i, int i2) {
        if (i != 200) {
            return C1769ah.m8131b(this, i);
        }
        if (i2 == 0) {
            return m9577b((int) R.string.iab_cancel_subscription_failed);
        }
        return m9577b((int) R.string.iab_cancel_subscription_failed) + C1769ah.m8125a((Context) this, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m9608t() {
        m9575a(m9577b((int) R.string.iab_cancel_subscription), false);
        C1769ah.m8122a((Context) this, (C1769ah.C1770a) new C2115y(this));
    }

    /* renamed from: c */
    private void m9583c(int i) {
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6675a((Context) this, i, (C1746T.C1752f) new C2116z(this));
        } else {
            m9604p();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m9609u() {
        Intent intent = new Intent();
        intent.setClass(this, PurchaseVipActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.addFlags(Engine.CHANGE_LOCAL_CLOUD_SEARCH);
        startActivity(intent);
        finish();
    }

    /* renamed from: a */
    private String m9563a(long j) {
        return DateFormat.getDateInstance(2, getResources().getConfiguration().locale).format(Long.valueOf(1000 * j));
    }

    /* renamed from: v */
    private String m9610v() {
        return m9577b((int) R.string.vip_purchase_time_tite);
    }

    /* renamed from: w */
    private String m9611w() {
        int i = R.string.vip_expire_expire;
        C1617br a = C1617br.m7367a();
        if (a.mo6332a(C1617br.C1619b.Trial)) {
            i = R.string.vip_expire_free_trial;
        } else if (a.mo6343j()) {
            i = R.string.vip_expire_next_charge_title;
        }
        return m9577b(i);
    }

    /* renamed from: x */
    private String m9612x() {
        return m9563a(C1617br.m7367a().mo6340g().mo7966f());
    }

    /* renamed from: y */
    private String m9613y() {
        return m9563a(C1617br.m7367a().mo6340g().mo7967g());
    }

    /* renamed from: com.cootek.smartinput5.func.vip.VipInfoActivity$a */
    private class C2090a extends AsyncTask<String, Integer, String> {

        /* renamed from: b */
        private String f8957b;

        public C2090a(String str) {
            this.f8957b = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            return m9614a();
        }

        /* renamed from: a */
        private void m9616a(File file) {
            File[] listFiles;
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File a : listFiles) {
                    m9616a(a);
                }
            }
            file.delete();
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[SYNTHETIC, Splitter:B:22:0x0039] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0049 A[SYNTHETIC, Splitter:B:31:0x0049] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0056 A[SYNTHETIC, Splitter:B:38:0x0056] */
        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0034=Splitter:B:19:0x0034, B:28:0x0044=Splitter:B:28:0x0044} */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m9618b(java.io.File r4) {
            /*
                r3 = this;
                java.io.File r0 = new java.io.File
                java.lang.String r1 = "purchase_info_file.txt"
                r0.<init>(r4, r1)
                r0.createNewFile()     // Catch:{ IOException -> 0x0028 }
            L_0x000a:
                boolean r1 = r0.exists()
                if (r1 == 0) goto L_0x0027
                r2 = 0
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0032, IOException -> 0x0042, all -> 0x0052 }
                r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0032, IOException -> 0x0042, all -> 0x0052 }
                java.lang.String r0 = r3.f8957b     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0061 }
                byte[] r0 = r0.getBytes()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0061 }
                r1.write(r0)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0061 }
                r1.flush()     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0061 }
                if (r1 == 0) goto L_0x0027
                r1.close()     // Catch:{ IOException -> 0x002d }
            L_0x0027:
                return
            L_0x0028:
                r1 = move-exception
                r1.printStackTrace()
                goto L_0x000a
            L_0x002d:
                r0 = move-exception
                r0.printStackTrace()
                goto L_0x0027
            L_0x0032:
                r0 = move-exception
                r1 = r2
            L_0x0034:
                r0.printStackTrace()     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x0027
                r1.close()     // Catch:{ IOException -> 0x003d }
                goto L_0x0027
            L_0x003d:
                r0 = move-exception
                r0.printStackTrace()
                goto L_0x0027
            L_0x0042:
                r0 = move-exception
                r1 = r2
            L_0x0044:
                r0.printStackTrace()     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x0027
                r1.close()     // Catch:{ IOException -> 0x004d }
                goto L_0x0027
            L_0x004d:
                r0 = move-exception
                r0.printStackTrace()
                goto L_0x0027
            L_0x0052:
                r0 = move-exception
                r1 = r2
            L_0x0054:
                if (r1 == 0) goto L_0x0059
                r1.close()     // Catch:{ IOException -> 0x005a }
            L_0x0059:
                throw r0
            L_0x005a:
                r1 = move-exception
                r1.printStackTrace()
                goto L_0x0059
            L_0x005f:
                r0 = move-exception
                goto L_0x0054
            L_0x0061:
                r0 = move-exception
                goto L_0x0044
            L_0x0063:
                r0 = move-exception
                goto L_0x0034
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.vip.VipInfoActivity.C2090a.m9618b(java.io.File):void");
        }

        /* renamed from: a */
        private String m9614a() {
            File a = C1358O.m6235a(C1358O.f4208s, true);
            if (a == null) {
                return null;
            }
            if (a.exists()) {
                m9616a(a);
            }
            a.mkdir();
            m9618b(a);
            return m9615a(a.getParentFile(), a);
        }

        /* renamed from: a */
        private String m9615a(File file, File file2) {
            File file3 = new File(file, VipInfoActivity.f8946c);
            String absolutePath = file3.getAbsolutePath();
            if (file3.exists()) {
                file3.delete();
            }
            C0990F.m5127a(file2.getAbsolutePath(), absolutePath, (String[]) null, (String[]) null);
            m9616a(file2);
            return absolutePath;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            VipInfoActivity.this.m9604p();
            m9619b(str);
        }

        /* renamed from: b */
        private void m9619b(String str) {
            if (str != null) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.EMAIL", new String[]{C1593bR.m7162a().mo6233a(VipInfoActivity.this, 0)});
                intent.putExtra("android.intent.extra.TEXT", m9620c());
                intent.putExtra("android.intent.extra.SUBJECT", m9617b());
                intent.putExtra("android.intent.extra.STREAM", Uri.parse("file://" + str));
                intent.setType("application/zip");
                intent.addFlags(Engine.EXCEPTION_ERROR);
                intent.addFlags(1073741824);
                try {
                    VipInfoActivity.this.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: b */
        private String m9617b() {
            return "Google play purchase issue investigation";
        }

        /* renamed from: c */
        private String m9620c() {
            StringBuilder sb = new StringBuilder();
            sb.append(C0911j.f2473c + m9622e());
            sb.append(C0911j.f2473c + m9621d());
            return sb.toString();
        }

        /* renamed from: d */
        private String m9621d() {
            return "--------------------------------" + "\nBrand: " + Build.BRAND + "\nModel: " + Build.MODEL + "\nRelease: " + Build.VERSION.RELEASE + C0911j.f2473c + "--------------------------------\n";
        }

        /* renamed from: e */
        private String m9622e() {
            return "This is an auto-generated investigation feedback email, please check the purchase info in the attachment";
        }
    }
}
