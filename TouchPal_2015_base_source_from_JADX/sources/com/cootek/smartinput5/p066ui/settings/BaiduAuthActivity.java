package com.cootek.smartinput5.p066ui.settings;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.preference.Preference;
import android.text.TextUtils;
import android.widget.Toast;
import com.baidu.oauth.BaiduOAuth;
import com.baidu.pcs.BaiduPCSActionInfo;
import com.baidu.pcs.BaiduPCSClient;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C2119x;
import com.cootek.smartinput5.func.resource.p055ui.C1977c;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: com.cootek.smartinput5.ui.settings.BaiduAuthActivity */
public class BaiduAuthActivity extends C1977c {

    /* renamed from: a */
    public static final int f13374a = -1;

    /* renamed from: b */
    private static final String f13375b = "jTc5RMnuFD1rytjfPFn2jVSd";

    /* renamed from: c */
    private static final String f13376c = "baidu_info";

    /* renamed from: d */
    private static final String f13377d = "/apps/ChubaoUsrDict";

    /* renamed from: e */
    private static final String f13378e = "username";

    /* renamed from: f */
    private static final String f13379f = "access_token";

    /* renamed from: g */
    private static final String f13380g = "expiresIn";

    /* renamed from: h */
    private static final String f13381h = "token_timestamp";

    /* renamed from: q */
    private static final int f13382q = 1;

    /* renamed from: r */
    private static final int f13383r = 2;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final String[] f13384i = {"western.usr", "chinese_simplified.usr", "chinese_traditional.usr"};

    /* renamed from: j */
    private final int[] f13385j = {R.string.optpage_western_dict, R.string.optpage_simplified_dict, R.string.optpage_traditional_dict};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ProgressDialog f13386k;

    /* renamed from: l */
    private boolean f13387l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f13388m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f13389n = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public List<String> f13390o = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public List<String> f13391p = new ArrayList();

    /* renamed from: com.cootek.smartinput5.ui.settings.BaiduAuthActivity$a */
    private static class C2949a extends Exception {
        private C2949a() {
        }

        /* synthetic */ C2949a(C3162d dVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.layout.pcs_backup_restore);
        if (!this.f13387l) {
            this.f13387l = true;
            C1368X.m6317b(getApplicationContext());
            C1368X.m6320c().mo5839l().bindService();
        }
        Preference findPreference = findPreference("option_pcs_logo");
        findPreference.setLayoutResource(R.layout.pcs_logo);
        findPreference.setEnabled(false);
        m13681l();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m13712z();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f13386k != null && this.f13386k.isShowing()) {
            this.f13386k.dismiss();
            this.f13386k = null;
        }
        if (this.f13387l) {
            C1368X.m6320c().mo5839l().destroy();
            C1368X.m6325e();
            this.f13387l = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m13662e() {
        Preference findPreference = findPreference("option_pcs_backup_dictionary");
        Preference findPreference2 = findPreference("option_pcs_restore_dictionary");
        findPreference.setEnabled(false);
        findPreference2.setEnabled(false);
    }

    /* renamed from: f */
    private void m13666f() {
        Preference findPreference = findPreference("option_pcs_backup_dictionary");
        Preference findPreference2 = findPreference("option_pcs_restore_dictionary");
        findPreference.setEnabled(true);
        findPreference2.setEnabled(true);
    }

    /* renamed from: g */
    private boolean m13669g() {
        SharedPreferences sharedPreferences = getSharedPreferences(f13376c, 1);
        if (TextUtils.isEmpty(sharedPreferences.getString("access_token", ""))) {
            return true;
        }
        String string = sharedPreferences.getString(f13380g, "");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        try {
            if (System.currentTimeMillis() / 1000 < Long.parseLong(string) + sharedPreferences.getLong(f13381h, 0)) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    /* renamed from: h */
    private String m13670h() {
        return getSharedPreferences(f13376c, 1).getString("access_token", "");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13644a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = getSharedPreferences(f13376c, 2).edit();
        edit.putString("username", str);
        edit.putString("access_token", str2);
        edit.putString(f13380g, str3);
        edit.putLong(f13381h, System.currentTimeMillis() / 1000);
        edit.commit();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m13675i() {
        C1584bI.m7145b(this, new C3162d(this), false);
    }

    /* renamed from: l */
    private void m13681l() {
        if (m13669g()) {
            m13675i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m13684m() {
        this.f13388m = false;
        new BaiduOAuth().startOAuth(this, f13375b, new String[]{"basic", "netdisk"}, new C3241p(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m13637a(String str) {
        int length = this.f13384i.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(this.f13384i[i])) {
                return this.f13385j[i];
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m13687n() {
        new C2894d.C2895a(this).setTitle(mo7241b((int) R.string.app_name)).setMessage(mo7241b((int) R.string.baidu_pcs_logout_msg)).setNegativeButton(mo7241b((int) R.string.cancel), new C3244s(this)).setPositiveButton(mo7241b((int) R.string.ok), new C3242q(this)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m13690o() {
        Toast.makeText(getApplicationContext(), mo7241b((int) R.string.baidu_pcs_logout_succeed), 0).show();
        m13644a("", "", "");
        m13632A();
    }

    /* renamed from: a */
    private boolean m13645a(int i) {
        return i == 31042 || i == 31044 || i == 31043 || i == 36007 || i == 36005 || i == 31045 || i == 36008;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m13652b(String str) throws C2949a {
        String h = m13670h();
        if (TextUtils.isEmpty(h)) {
            return false;
        }
        BaiduPCSClient baiduPCSClient = new BaiduPCSClient();
        baiduPCSClient.setAccessToken(h);
        BaiduPCSActionInfo.PCSSimplefiedResponse downloadFileFromStream = baiduPCSClient.downloadFileFromStream("/apps/ChubaoUsrDict/" + str, new File(C1466av.m6848a(getApplicationContext()), str + ".tmp").getAbsolutePath(), new C3245t(this, str));
        if (downloadFileFromStream.errorCode == 0) {
            this.f13390o.add(str);
        }
        if (downloadFileFromStream.errorCode == 0 || downloadFileFromStream.errorCode == 31066) {
            return true;
        }
        if (!m13645a(downloadFileFromStream.errorCode)) {
            return false;
        }
        throw new C2949a((C3162d) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m13694p() {
        new C2894d.C2895a(this).setTitle(mo7241b((int) R.string.app_name)).setMessage(mo7241b((int) R.string.baidu_pcs_restore_msg)).setNegativeButton(mo7241b((int) R.string.cancel), new C3248w(this)).setPositiveButton(mo7241b((int) R.string.ok), new C3247v(this)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m13696q() {
        for (String str : this.f13390o) {
            File file = new File(C1466av.m6848a(getApplicationContext()), str + ".tmp");
            if (file.exists()) {
                file.delete();
            }
        }
        this.f13390o.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m13698r() {
        m13655c(2);
        for (String next : this.f13390o) {
            File file = new File(C1466av.m6848a(getApplicationContext()), next);
            File file2 = new File(C1466av.m6848a(getApplicationContext()), next + ".tmp");
            if (file.exists()) {
                file.delete();
            }
            file2.renameTo(file);
        }
        m13655c(1);
        this.f13390o.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m13700s() {
        C1584bI.m7145b(this, new C3249x(this), false);
    }

    /* renamed from: a */
    private boolean m13648a(String str, String str2) throws C2949a {
        String h = m13670h();
        if (TextUtils.isEmpty(h)) {
            return false;
        }
        BaiduPCSClient baiduPCSClient = new BaiduPCSClient();
        baiduPCSClient.setAccessToken(h);
        ArrayList arrayList = new ArrayList();
        BaiduPCSActionInfo.PCSFileFromToInfo pCSFileFromToInfo = new BaiduPCSActionInfo.PCSFileFromToInfo();
        pCSFileFromToInfo.from = "/apps/ChubaoUsrDict/" + str;
        pCSFileFromToInfo.f2340to = "/apps/ChubaoUsrDict/" + str2;
        arrayList.add(pCSFileFromToInfo);
        BaiduPCSActionInfo.PCSFileFromToResponse move = baiduPCSClient.move(arrayList);
        if (move.status.errorCode == 0) {
            return true;
        }
        if (!m13645a(move.status.errorCode)) {
            return false;
        }
        throw new C2949a((C3162d) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m13653b(String str, String str2) throws C2949a {
        String h = m13670h();
        if (TextUtils.isEmpty(h)) {
            return false;
        }
        BaiduPCSClient baiduPCSClient = new BaiduPCSClient();
        baiduPCSClient.setAccessToken(h);
        BaiduPCSActionInfo.PCSFileInfoResponse uploadFile = baiduPCSClient.uploadFile(str + File.separator + str2, f13377d + File.separator + str2 + ".tmp", new C2954D(this, str2));
        if (uploadFile.status.errorCode == 0) {
            return true;
        }
        if (!m13645a(uploadFile.status.errorCode)) {
            return false;
        }
        throw new C2949a((C3162d) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m13658c(String str) throws C2949a {
        String h = m13670h();
        if (TextUtils.isEmpty(h)) {
            return false;
        }
        BaiduPCSClient baiduPCSClient = new BaiduPCSClient();
        baiduPCSClient.setAccessToken(h);
        ArrayList arrayList = new ArrayList();
        arrayList.add("/apps/ChubaoUsrDict/" + str);
        BaiduPCSActionInfo.PCSSimplefiedResponse deleteFiles = baiduPCSClient.deleteFiles(arrayList);
        if (deleteFiles.errorCode == 0) {
            return true;
        }
        if (!m13645a(deleteFiles.errorCode)) {
            return false;
        }
        throw new C2949a((C3162d) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m13702t() {
        new C2894d.C2895a(this).setTitle(mo7241b((int) R.string.app_name)).setMessage(mo7241b((int) R.string.baidu_pcs_backup_msg)).setNegativeButton(mo7241b((int) R.string.cancel), new C3231f(this)).setPositiveButton(mo7241b((int) R.string.ok), new C3215e(this)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m13704u() {
        for (String str : this.f13391p) {
            try {
                m13658c(str + ".tmp");
            } catch (C2949a e) {
            }
        }
        this.f13391p.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m13706v() {
        for (String next : this.f13391p) {
            String str = next + C2119x.f8995a;
            String str2 = next + ".tmp";
            try {
                m13658c(str);
                m13648a(next, str);
                m13648a(str2, next);
                m13658c(str2);
                m13658c(str);
            } catch (C2949a e) {
            }
        }
        this.f13391p.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m13708w() {
        C1584bI.m7145b(this, new C3232g(this), false);
    }

    /* renamed from: c */
    private void m13655c(int i) {
        int i2 = 7;
        Message.obtain((Handler) null, 4);
        Bundle bundle = new Bundle();
        if (i == 1) {
            i2 = 6;
        } else if (i == 2) {
        }
        bundle.putInt(IPCManager.EXTRA_ACTION_TYPE, i2);
        Message obtain = Message.obtain((Handler) null, 4);
        obtain.setData(bundle);
        try {
            C1368X.m6320c().mo5839l().sendMessage(obtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13640a(long j, int i) {
        Message obtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 4);
        bundle.putInt(IPCManager.SETTING_KEY, i);
        bundle.putLong(IPCManager.SETTING_VALUE, j);
        obtain.setData(bundle);
        try {
            C1368X.m6320c().mo5839l().sendMessage(obtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m13710x() {
        long longSetting = Settings.getInstance().getLongSetting(Settings.LAST_CLOUD_BACKUP_DICT_TIME);
        if (longSetting > 0) {
            String format = DateFormat.getDateInstance().format(new Date(longSetting));
            findPreference("option_pcs_backup_dictionary").setSummary(mo7237a((int) R.string.last_backup_tip, format));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m13711y() {
        long longSetting = Settings.getInstance().getLongSetting(Settings.LAST_CLOUD_RESTORE_DICT_TIME);
        if (longSetting > 0) {
            String format = DateFormat.getDateInstance().format(new Date(longSetting));
            findPreference("option_pcs_restore_dictionary").setSummary(mo7237a((int) R.string.last_restore_tip, format));
        }
    }

    /* renamed from: z */
    private void m13712z() {
        findPreference("option_pcs_backup_dictionary").setOnPreferenceClickListener(new C3237l(this));
        m13710x();
        findPreference("option_pcs_restore_dictionary").setOnPreferenceClickListener(new C3238m(this));
        m13711y();
        if (m13669g()) {
            m13633B();
        } else {
            m13635D();
        }
    }

    /* renamed from: A */
    private void m13632A() {
        m13633B();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m13633B() {
        m13662e();
        Preference findPreference = findPreference("option_pcs_login_logout");
        findPreference.setTitle(mo7241b((int) R.string.optpage_pcs_login));
        findPreference.setSummary((CharSequence) null);
        findPreference.setOnPreferenceClickListener(new C3239n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m13634C() {
        m13635D();
    }

    /* renamed from: D */
    private void m13635D() {
        m13666f();
        String string = getSharedPreferences(f13376c, 1).getString("username", "");
        Preference findPreference = findPreference("option_pcs_login_logout");
        findPreference.setTitle(mo7241b((int) R.string.optpage_pcs_logout));
        findPreference.setSummary(mo7237a((int) R.string.optpage_pcs_logout_summary, string));
        findPreference.setOnPreferenceClickListener(new C3240o(this));
    }
}
