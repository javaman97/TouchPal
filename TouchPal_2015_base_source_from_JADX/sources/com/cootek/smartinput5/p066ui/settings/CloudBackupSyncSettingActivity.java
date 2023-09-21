package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.preference.Preference;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.component.C1684q;
import com.cootek.smartinput5.func.resource.p055ui.C1977c;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.CloudBackupSyncSettingActivity */
public class CloudBackupSyncSettingActivity extends C1977c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f13401a;

    /* renamed from: b */
    private Messenger f13402b;

    /* renamed from: c */
    private IPCManager f13403c;

    /* renamed from: d */
    private Handler f13404d = new C2980W(this);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.layout.cloud_backup_sync_setting);
        C1368X.m6317b(this.f13401a);
        this.f13401a = this;
        CustomizableCheckBoxPreference customizableCheckBoxPreference = (CustomizableCheckBoxPreference) findPreference(C1135d.option_backup_sync_enable.toString());
        String a = TouchPalOption.m5424a(this.f13401a, Settings.getInstance().getLongSetting(Settings.CLOUD_SERVICE_LAST_SYNC_TIME));
        if (a != null) {
            customizableCheckBoxPreference.setSummary(String.format(mo7241b((int) R.string.optpage_cloud_backup_sync_enable_summary), new Object[]{a}));
        }
        CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_backup_sync_now.toString());
        CustomizablePreference customizablePreference2 = (CustomizablePreference) findPreference(C1135d.option_clear_backup.toString());
        if (!(customizableCheckBoxPreference == null || customizablePreference == null)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(customizablePreference);
            arrayList.add(customizablePreference2);
            boolean boolSetting = Settings.getInstance().getBoolSetting(260);
            customizableCheckBoxPreference.setChecked(boolSetting);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Preference) it.next()).setEnabled(boolSetting);
            }
            customizableCheckBoxPreference.setOnPreferenceClickListener(new C2981X(this, customizableCheckBoxPreference, arrayList));
        }
        if (customizablePreference != null) {
            customizablePreference.setModelPreference(customizableCheckBoxPreference);
            customizablePreference.setOnPreferenceClickListener(new C2982Y(this));
        }
        if (customizablePreference2 != null) {
            customizablePreference2.setModelPreference(customizableCheckBoxPreference);
            customizablePreference2.setOnPreferenceClickListener(new C2983Z(this));
        }
        m13740e();
    }

    /* renamed from: e */
    private void m13740e() {
        if (C1368X.m6324d()) {
            this.f13403c = C1368X.m6320c().mo5839l();
            this.f13403c.bindService();
            m13741f();
        }
    }

    /* renamed from: f */
    private void m13741f() {
        if (this.f13403c != null && this.f13402b == null) {
            this.f13402b = new Messenger(this.f13404d);
            Message obtain = Message.obtain((Handler) null, 1);
            obtain.replyTo = this.f13402b;
            try {
                this.f13403c.sendMessage(obtain);
            } catch (RemoteException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C1684q.m7769a().mo6554b(this.f13401a, 1, false);
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f13403c != null) {
            this.f13403c.destroy();
        }
        C1368X.m6325e();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m13739d(Bundle bundle) {
        if (bundle != null && bundle.getInt(IPCManager.SETTING_KEY, -1) == 265) {
            m13742g();
        }
    }

    /* renamed from: g */
    private void m13742g() {
        CustomizableCheckBoxPreference customizableCheckBoxPreference = (CustomizableCheckBoxPreference) findPreference(C1135d.option_backup_sync_enable.toString());
        String a = TouchPalOption.m5424a(this.f13401a, Settings.getInstance().getLongSetting(Settings.CLOUD_SERVICE_LAST_SYNC_TIME));
        if (a != null) {
            customizableCheckBoxPreference.setSummary(String.format(mo7241b((int) R.string.optpage_cloud_backup_sync_enable_summary), new Object[]{a}));
        }
        CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_backup_sync_now.toString());
    }
}
