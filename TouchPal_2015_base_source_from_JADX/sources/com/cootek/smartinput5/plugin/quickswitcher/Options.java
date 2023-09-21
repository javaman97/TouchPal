package com.cootek.smartinput5.plugin.quickswitcher;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1464at;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.BottomBtnsFrame;
import com.cootek.smartinput5.p066ui.control.C2869n;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

public class Options extends Activity {

    /* renamed from: a */
    private static final int[] f10488a = {1, 2, 3};

    /* renamed from: b */
    private static final Object[][][] f10489b = {new Object[][]{new Object[]{C1549b.f4836g}, new Object[]{Integer.valueOf(R.string.quick_switcher_halfscreen), Integer.valueOf(R.string.quick_switcher_fullscreen), 0}}};

    /* renamed from: c */
    private Spinner f10490c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Spinner f10491d;

    /* renamed from: e */
    private CheckBox f10492e;

    /* renamed from: f */
    private ArrayList<String> f10493f;

    /* renamed from: g */
    private ArrayList<String> f10494g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ArrayList<Integer> f10495h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f10496i;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Button button;
        Button button2;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().addFlags(131072);
        m10942a();
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f10490c = (Spinner) findViewById(R.id.languageSelectView);
        this.f10491d = (Spinner) findViewById(R.id.layoutSelectView);
        this.f10492e = (CheckBox) findViewById(R.id.dictCheckBox);
        BottomBtnsFrame bottomBtnsFrame = (BottomBtnsFrame) findViewById(R.id.buttons_frame);
        if (bottomBtnsFrame != null) {
            button2 = bottomBtnsFrame.getPositiveBtn();
            button = bottomBtnsFrame.getNegertiveBtn();
        } else {
            button = null;
            button2 = null;
        }
        ((TextView) findViewById(R.id.promptTextView)).setText(Html.fromHtml(C1974m.m9063a((Context) this, (int) R.string.quick_switcher_entry_prompt), new C1464at(this), (Html.TagHandler) null));
        this.f10493f = new ArrayList<>();
        this.f10494g = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.custom_spinner_text_view, this.f10493f);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f10490c.setAdapter(arrayAdapter);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, R.layout.custom_spinner_text_view, this.f10494g);
        arrayAdapter2.setDropDownViewResource(17367049);
        this.f10491d.setAdapter(arrayAdapter2);
        this.f10490c.setOnItemSelectedListener(new C2394a(this));
        this.f10492e.setOnCheckedChangeListener(new C2395b(this));
        button2.setOnClickListener(new C2396c(this));
        button.setOnClickListener(new C2397d(this));
        m10949b();
        int a = m10941a(Settings.getInstance().getStringSetting(Settings.QUICK_SWITCHER_LANGUAGE));
        if (a == -1) {
            a = 0;
        }
        this.f10490c.setSelection(a);
        this.f10492e.setChecked(Settings.getInstance().getBoolSetting(Settings.QUICK_SWITCHER_DICT));
        this.f10496i = false;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: a */
    private int m10941a(String str) {
        String[] g = C1368X.m6320c().mo5842o().mo5945g();
        for (int i = 0; i < g.length; i++) {
            if (str.equals(g[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m10942a() {
        setContentView(C2869n.m13267a((Context) this, (int) R.string.quick_switcher_setting_title, (int) R.layout.quick_switcher_optoins));
    }

    /* renamed from: b */
    private void m10949b() {
        C1389aD o = C1368X.m6320c().mo5842o();
        String[] g = o.mo5945g();
        for (String l : g) {
            this.f10493f.add(o.mo5954l(l).mo6153c());
        }
        ((BaseAdapter) this.f10490c.getAdapter()).notifyDataSetChanged();
        this.f10490c.setSelection(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m10940a(int i) {
        for (int i2 = 0; i2 < f10488a.length; i2++) {
            if (i == f10488a[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private ArrayList<Integer> m10947b(int i) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int languageSupportSubType = Engine.getInstance().getLanguageSupportSubType(C1368X.m6320c().mo5842o().mo5945g()[i]);
        for (int i2 = 0; i2 < f10488a.length; i2++) {
            if (((1 << f10488a[i2]) & languageSupportSubType) != 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10952c(int i) {
        int i2;
        String[] strArr;
        boolean z = false;
        if (this.f10495h == null || this.f10495h.size() <= 0) {
            i2 = -1;
        } else {
            i2 = this.f10495h.get(this.f10491d.getSelectedItemPosition()).intValue();
        }
        this.f10494g.clear();
        this.f10495h = m10947b(i);
        String[] b = C1974m.m9070b(this, R.array.portrait_layout_key);
        String[] g = C1368X.m6320c().mo5842o().mo5945g();
        int i3 = 0;
        while (true) {
            if (i3 >= f10489b.length) {
                strArr = b;
                break;
            } else if (g[i].matches((String) f10489b[i3][0][0])) {
                Object[] objArr = f10489b[i3][1];
                String[] strArr2 = new String[objArr.length];
                for (int i4 = 0; i4 < objArr.length; i4++) {
                    int intValue = ((Integer) objArr[i4]).intValue();
                    if (intValue != 0) {
                        strArr2[i4] = C1974m.m9063a((Context) this, intValue);
                    } else {
                        strArr2[i4] = "";
                    }
                }
                strArr = strArr2;
            } else {
                i3++;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f10495h.size(); i6++) {
            this.f10494g.add(strArr[this.f10495h.get(i6).intValue()]);
            if (this.f10495h.get(i6).intValue() == i2) {
                i5 = i6;
            }
        }
        Spinner spinner = this.f10491d;
        if (this.f10494g.size() != 0) {
            z = true;
        }
        spinner.setEnabled(z);
        if (this.f10494g.size() == 0) {
            this.f10494g.add(C1974m.m9063a((Context) this, (int) R.string.quick_switcher_no_option));
        }
        ((BaseAdapter) this.f10491d.getAdapter()).notifyDataSetChanged();
        this.f10491d.setSelection(i5);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10951c() {
        String[] g = C1368X.m6320c().mo5842o().mo5945g();
        Settings.getInstance().setStringSetting(Settings.QUICK_SWITCHER_LANGUAGE, g[Math.max(0, Math.min(this.f10490c.getSelectedItemPosition(), g.length - 1))]);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m10953d() {
        int i;
        ArrayList<Integer> b = m10947b(this.f10490c.getSelectedItemPosition());
        if (b.size() > 0) {
            i = f10488a[b.get(this.f10491d.getSelectedItemPosition()).intValue()];
        } else {
            i = -1;
        }
        Settings.getInstance().setIntSetting(Settings.QUICK_SWITCHER_LAYOUT, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m10955e() {
        Settings.getInstance().setBoolSetting(Settings.QUICK_SWITCHER_DICT, this.f10492e.isChecked());
    }
}
