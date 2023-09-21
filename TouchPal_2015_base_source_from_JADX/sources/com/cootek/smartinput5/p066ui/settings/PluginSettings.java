package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.C1413aW;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1810j;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p053c.C1630a;
import com.cootek.smartinput5.p066ui.settings.PluginPreference;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.PluginSettings */
public class PluginSettings extends PreferenceActivity implements C1413aW.C1414a, PluginPreference.C2969a {

    /* renamed from: a */
    ArrayList<C1810j> f13586a = new ArrayList<>();

    /* renamed from: b */
    PopupWindow f13587b;

    /* renamed from: c */
    TextView f13588c;

    /* renamed from: d */
    PluginPreference f13589d;

    /* renamed from: e */
    PreferenceCategory f13590e;

    /* renamed from: f */
    int f13591f;

    /* renamed from: g */
    String f13592g;

    /* renamed from: h */
    int[] f13593h = new int[2];

    /* renamed from: i */
    int f13594i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f13595j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f13596k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f13597l;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        addPreferencesFromResource(R.layout.function_bar_settings);
        m13936e();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C1368X.m6325e();
        super.onDestroy();
        m13938f();
        System.gc();
    }

    /* renamed from: e */
    private void m13936e() {
        Preference findPreference = findPreference("OptionPaoPao");
        if (C1593bR.m7162a().f5075a) {
            getPreferenceScreen().removePreference(findPreference);
        } else {
            TouchPalOption.m5428a((CheckBoxPreference) findPreference, 76);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C1368X.m6320c().mo5837j().mo6038a((C1413aW.C1414a) this);
        m13939g();
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C1368X.m6320c().mo5837j().mo6040b((C1413aW.C1414a) this);
        mo9938d();
        m13941i();
        super.onPause();
    }

    /* renamed from: a */
    public void mo6048a() {
        m13941i();
        m13939g();
    }

    /* renamed from: a */
    private C1411aV m13926a(String str) {
        Iterator<C1810j> it = this.f13586a.iterator();
        while (it.hasNext()) {
            C1411aV aVVar = (C1411aV) it.next();
            if (aVVar.f4501D.equals(str)) {
                return aVVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private String m13930b(String str) {
        C1411aV a = m13926a(str);
        if (a != null) {
            return a.f4503F;
        }
        return null;
    }

    /* renamed from: f */
    private void m13938f() {
        this.f13586a = null;
        if (this.f13590e != null) {
            this.f13590e.removeAll();
            this.f13590e = null;
        }
        if (this.f13587b != null && this.f13587b.isShowing()) {
            try {
                this.f13587b.dismiss();
            } catch (Exception e) {
            }
            this.f13587b = null;
        }
    }

    /* renamed from: g */
    private void m13939g() {
        if (this.f13587b == null) {
            m13942j();
        }
        mo9938d();
        this.f13586a = C1368X.m6320c().mo5837j().mo6046g();
        m13940h();
    }

    /* renamed from: h */
    private void m13940h() {
        boolean z;
        C1389aD o;
        this.f13590e = (PreferenceCategory) findPreference("plugin_list");
        this.f13590e.removeAll();
        CustomizableCheckBoxPreference customizableCheckBoxPreference = new CustomizableCheckBoxPreference(getApplicationContext());
        Iterator<C1810j> it = this.f13586a.iterator();
        int i = 0;
        while (it.hasNext()) {
            C1411aV aVVar = (C1411aV) it.next();
            if (aVVar.f4505H == 0 && (!aVVar.f4501D.equals("hw_mask") || (o = C1368X.m6320c().mo5842o()) == null || o.mo5960o(C1549b.f4831b))) {
                PluginPreference pluginPreference = new PluginPreference(this);
                pluginPreference.setModelPreference(customizableCheckBoxPreference);
                pluginPreference.setTitle(aVVar.f4503F);
                pluginPreference.setSummary(aVVar.f4504G);
                pluginPreference.setKey(aVVar.f4501D);
                pluginPreference.setOnClickListener(this);
                pluginPreference.setChecked(aVVar.f4507J);
                int i2 = i + 1;
                pluginPreference.setOrder(i);
                if (!getPackageName().equalsIgnoreCase(aVVar.mo6810a())) {
                    z = true;
                } else {
                    z = false;
                }
                pluginPreference.setEnableUninstall(z);
                this.f13590e.addPreference(pluginPreference);
                i = i2;
            }
        }
    }

    /* renamed from: i */
    private void m13941i() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f13590e.getPreferenceCount()) {
                break;
            }
            PluginPreference pluginPreference = (PluginPreference) this.f13590e.getPreference(i2);
            sb.append(pluginPreference.getKey() + ":" + pluginPreference.isChecked());
            sb.append("/");
            if (pluginPreference.getKey().equals("hw_mask")) {
                Settings.getInstance().setBoolSetting(48, pluginPreference.isChecked());
                if (!pluginPreference.isChecked()) {
                    C1368X.m6320c().mo5849v().mo6424d(C1630a.m7455b(2));
                }
            } else if (pluginPreference.getKey().equals("typing_speed")) {
                Settings.getInstance().setBoolSetting(84, pluginPreference.isChecked());
            }
            i = i2 + 1;
        }
        Settings.getInstance().setStringSetting(79, sb.toString());
        C1368X.m6320c().mo5837j().mo6045f();
        if (Engine.isInitialized() && Engine.getInstance().getWidgetManager().mo9650h() != null) {
            Engine.getInstance().getWidgetManager().mo9650h().mo8555p();
        }
    }

    /* renamed from: j */
    private void m13942j() {
        this.f13587b = new PopupWindow(this);
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.plugin_selector, (ViewGroup) null, false);
        inflate.setBackgroundColor(-1431655766);
        this.f13587b.setContentView(inflate);
        this.f13587b.setWidth(getResources().getDisplayMetrics().widthPixels);
        this.f13587b.setHeight(getResources().getDimensionPixelSize(R.dimen.selector_height));
        this.f13587b.setBackgroundDrawable((Drawable) null);
        this.f13588c = (TextView) inflate.findViewById(R.id.title);
        inflate.setOnTouchListener(new C3062bS(this));
        View findViewById = inflate.findViewById(R.id.move);
        if (findViewById != null) {
            findViewById.setClickable(true);
            findViewById.setOnClickListener(new C3063bT(this));
        }
        View findViewById2 = inflate.findViewById(R.id.cancel);
        if (findViewById2 != null) {
            findViewById2.setClickable(true);
            findViewById2.setOnClickListener(new C3064bU(this));
        }
        getListView().setOnScrollListener(new C3065bV(this));
    }

    /* renamed from: a */
    private int m13923a(int i, int i2) {
        if (this.f13590e.getPreferenceCount() == 0) {
            return -1;
        }
        return getListView().pointToPosition(i, i2 - m13945m()) - m13943k();
    }

    /* renamed from: k */
    private int m13943k() {
        this.f13594i = getListView().getCount() - this.f13590e.getPreferenceCount();
        return this.f13594i;
    }

    /* renamed from: b */
    public void mo9936b() {
        if (this.f13589d != null) {
            int order = this.f13589d.getOrder();
            int i = this.f13591f;
            if (i >= 0 && i <= this.f13590e.getPreferenceCount() && i != order && i != order + 1) {
                if (order > i) {
                    for (int i2 = order - 1; i2 >= i; i2--) {
                        this.f13590e.getPreference(i2).setOrder(i2 + 1);
                    }
                    this.f13589d.setOrder(i);
                } else if (order < i) {
                    for (int i3 = order + 1; i3 < i; i3++) {
                        this.f13590e.getPreference(i3).setOrder(i3 - 1);
                    }
                    this.f13589d.setOrder(i - 1);
                }
            }
            mo9938d();
        }
    }

    /* renamed from: a */
    public void mo9934a(PluginPreference pluginPreference) {
        if (pluginPreference == this.f13589d) {
            mo9938d();
            return;
        }
        mo9938d();
        this.f13588c.setText(m13930b(pluginPreference.getKey()));
        pluginPreference.setSelected(true);
        this.f13589d = pluginPreference;
        this.f13591f = pluginPreference.getOrder();
        this.f13596k = m13922a(this.f13591f);
        try {
            this.f13587b.showAtLocation(pluginPreference.getContentView(), 0, 0, this.f13596k);
        } catch (RuntimeException e) {
        }
    }

    /* renamed from: b */
    public void mo9935b(PluginPreference pluginPreference) {
        C1411aV a = m13926a(pluginPreference.getKey());
        String a2 = a.mo6810a();
        if (a != null && !TextUtils.isEmpty(a2) && !a2.equalsIgnoreCase(getPackageName())) {
            startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + a2)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13932b(int i, int i2) {
        int i3;
        if (this.f13591f >= 0 && this.f13591f <= this.f13590e.getPreferenceCount()) {
            int m = i2 - m13945m();
            int i4 = this.f13591f;
            if (this.f13591f == this.f13590e.getPreferenceCount()) {
                i4 = this.f13590e.getPreferenceCount() - 1;
            }
            View contentView = ((PluginPreference) this.f13590e.getPreference(i4)).getContentView();
            if (m > ((contentView.getBottom() + contentView.getTop()) >> 1)) {
                i3 = m - 10;
            } else {
                i3 = m + 10;
            }
            int a = m13923a(getListView().getWidth() / 2, i3 + m13945m());
            int preferenceCount = this.f13590e.getPreferenceCount();
            if (m13944l() != null && (i2 - m13945m() > m13944l().getBottom() || i2 - m13945m() > getListView().getHeight() - (this.f13587b.getHeight() / 2))) {
                a = preferenceCount;
            }
            m13931b(a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m13922a(int i) {
        PluginPreference pluginPreference = (PluginPreference) this.f13590e.getPreference(i);
        if (pluginPreference == null || pluginPreference.getContentView() == null) {
            return m13945m() - (this.f13587b.getHeight() / 2);
        }
        return (pluginPreference.getContentView().getTop() + m13945m()) - (this.f13587b.getHeight() / 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13931b(int i) {
        int bottom;
        if (this.f13587b != null && this.f13587b.isShowing() && this.f13589d != null && i >= 0) {
            if (i >= this.f13590e.getPreferenceCount()) {
                View l = m13944l();
                if (l.getBottom() >= getListView().getBottom()) {
                    bottom = getListView().getHeight();
                } else {
                    bottom = (l.getBottom() + m13945m()) - (this.f13587b.getHeight() / 2);
                }
                this.f13587b.update(0, bottom, this.f13587b.getWidth(), this.f13587b.getHeight());
                this.f13591f = this.f13590e.getPreferenceCount() - 1;
                return;
            }
            int m = m13945m();
            int a = m13922a(i);
            if (a - m < 0) {
                m13931b(i + 1);
            } else if (a - m > getListView().getHeight() - this.f13587b.getHeight()) {
                m13931b(i - 1);
            } else {
                this.f13587b.update(0, a, this.f13587b.getWidth(), this.f13587b.getHeight());
                this.f13591f = i;
            }
        }
    }

    /* renamed from: l */
    private View m13944l() {
        if (this.f13590e.getPreferenceCount() > 0) {
            return ((PluginPreference) this.f13590e.getPreference(this.f13590e.getPreferenceCount() - 1)).getContentView();
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo9937c() {
        return this.f13587b.isShowing();
    }

    /* renamed from: d */
    public void mo9938d() {
        if (this.f13589d != null) {
            this.f13589d.setSelected(false);
            this.f13589d = null;
        }
        this.f13591f = -1;
        try {
            this.f13587b.dismiss();
        } catch (Exception e) {
        }
    }

    /* renamed from: m */
    private int m13945m() {
        getListView().getLocationOnScreen(this.f13593h);
        return this.f13593h[1];
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !mo9937c()) {
            return super.onKeyDown(i, keyEvent);
        }
        mo9938d();
        return true;
    }
}
