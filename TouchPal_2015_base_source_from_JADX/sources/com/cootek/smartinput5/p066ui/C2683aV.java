package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.control.C2869n;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.aV */
/* compiled from: LanguageFirstSetupDialog */
public class C2683aV extends C2681aU {

    /* renamed from: a */
    private View f12018a;

    /* renamed from: b */
    private String f12019b;

    /* renamed from: c */
    private int f12020c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f12021d;

    /* renamed from: e */
    private CheckedTextView f12022e;

    /* renamed from: f */
    private CheckedTextView f12023f;

    /* renamed from: g */
    private CheckedTextView f12024g;

    /* renamed from: h */
    private CheckedTextView f12025h;

    /* renamed from: i */
    private CheckBox f12026i;

    /* renamed from: j */
    private CheckBox f12027j;

    /* renamed from: k */
    private boolean f12028k = false;

    /* renamed from: l */
    private boolean f12029l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f12030m;

    public C2683aV(Context context) {
        super(context, true, true);
        if (!C1368X.m6324d()) {
            C1368X.m6317b(context);
        }
    }

    /* renamed from: a */
    private void m12394a(C1498a aVar) {
        int i;
        int i2;
        int i3 = R.string.optpage_full_keyboard_qwerty_esp;
        if (C1549b.f4769E.equals(aVar.f4727f)) {
            i2 = R.string.optpage_full_keyboard_qwerty_bul;
            i = R.string.optpage_full_keyboard_qwertz_bul;
            i3 = -1;
        } else if (C1549b.f4848s.equals(aVar.f4727f)) {
            i2 = R.string.optpage_full_keyboard_qwerty_tur;
            i = R.string.optpage_full_keyboard_qwertz_tur;
            i3 = -1;
        } else if (C1549b.f4839j.equals(aVar.f4727f)) {
            i3 = R.string.optpage_full_keyboard_qz_ger;
            i = -1;
            i2 = -1;
        } else if (C1549b.f4840k.equals(aVar.f4727f)) {
            i2 = R.string.optpage_full_keyboard_qw_esp;
            i = -1;
        } else if (C1549b.f4821aq.equals(aVar.f4727f)) {
            i2 = R.string.optpage_full_keyboard_qw_esp;
            i = -1;
        } else if (C1549b.f4822ar.equals(aVar.f4727f)) {
            i2 = R.string.optpage_full_keyboard_qw_esp;
            i = -1;
        } else if (C1549b.f4772H.equals(aVar.f4727f)) {
            i2 = R.string.optpage_full_keyboard_qwerty_ara;
            i = R.string.optpage_full_keyboard_qwertz_ara;
            i3 = -1;
        } else if (C1549b.f4806ab.equals(aVar.f4727f)) {
            i2 = R.string.optpage_full_keyboard_qwerty_he;
            i = R.string.optpage_full_keyboard_qwertz_he;
            i3 = -1;
        } else {
            i3 = -1;
            i = -1;
            i2 = -1;
        }
        if (!(i3 == -1 || this.f12025h == null)) {
            this.f12025h.setText(mo8916a(i3));
        }
        if (!(i == -1 || this.f12023f == null)) {
            this.f12023f.setText(mo8916a(i));
        }
        if (i2 != -1 && this.f12022e != null) {
            this.f12022e.setText(mo8916a(i2));
        }
    }

    /* renamed from: b */
    private void m12401b(C1498a aVar) {
        if (!this.f12028k) {
            LinearLayout linearLayout = (LinearLayout) this.f12018a.findViewById(R.id.layout_frame);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        this.f12022e = (CheckedTextView) this.f12018a.findViewById(R.id.layout_qw);
        this.f12023f = (CheckedTextView) this.f12018a.findViewById(R.id.layout_qz);
        this.f12024g = (CheckedTextView) this.f12018a.findViewById(R.id.layout_az);
        this.f12025h = (CheckedTextView) this.f12018a.findViewById(R.id.layout_custom1);
        m12400b(Settings.getInstance().getIntSetting(4, 9, aVar.f4727f, (Config) null));
        this.f12022e.setOnClickListener(new C2684aW(this));
        m12394a(aVar);
        this.f12023f.setOnClickListener(new C2685aX(this));
        this.f12024g.setOnClickListener(new C2686aY(this));
        this.f12025h.setOnClickListener(new C2687aZ(this));
    }

    /* renamed from: g */
    private void m12407g() {
        View a = C2869n.m13268a(mo8920b(), (int) R.string.language_switch_mode_lang, false);
        View a2 = C2869n.m13268a(mo8920b(), (int) R.string.language_switch_mode_space, false);
        View findViewById = a2.findViewById(R.id.item_line);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.f12030m = Settings.getInstance().getBoolSetting(Settings.LANG_KEY_ENABLED);
        this.f12026i = (CheckBox) a.findViewById(R.id.item_checkbox);
        this.f12027j = (CheckBox) a2.findViewById(R.id.item_checkbox);
        this.f12026i.setOnCheckedChangeListener(new C2748ba(this));
        this.f12027j.setOnCheckedChangeListener(new C2749bb(this));
        m12399a(Settings.getInstance().getBoolSetting(Settings.LANG_KEY_ENABLED));
    }

    /* renamed from: h */
    private void m12408h() {
        C1498a l = C1368X.m6320c().mo5842o().mo5954l(this.f12019b);
        mo8919a(l.f4728g);
        this.f12018a = ((LayoutInflater) mo8920b().getSystemService("layout_inflater")).inflate(R.layout.language_first_setup_dlg, (ViewGroup) null, false);
        if (this.f12028k) {
            m12401b(l);
        } else {
            LinearLayout linearLayout = (LinearLayout) this.f12018a.findViewById(R.id.layout_frame);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        }
        if (this.f12029l) {
            m12407g();
        }
        m12403c(l);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m12409i() {
        mo8912a();
        m12410j();
        Settings.getInstance().setIntSetting(4, this.f12020c, 9, this.f12019b, (Config) null, true);
        if (this.f12021d ^ this.f12030m) {
            Settings.getInstance().setBoolSetting(Settings.LANG_KEY_ENABLED, this.f12021d, true);
        }
        if (Engine.isInitialized()) {
            Engine.getInstance().updateResult(1, -1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m12410j() {
        Settings.getInstance().setBoolSetting(Settings.SHOW_LANG_FIRST_SETUP_DLG, false, 17, this.f12019b, (Config) null, true);
    }

    /* renamed from: c */
    private void m12403c(C1498a aVar) {
        Button d = mo8922d();
        Button e = mo8923e();
        if (d != null) {
            d.setText(mo8916a((int) R.string.ok));
            d.setOnClickListener(new C2750bc(this));
        }
        if (e != null) {
            e.setText(mo8916a((int) R.string.cancel));
            e.setOnClickListener(new C2751bd(this));
        }
    }

    /* renamed from: a */
    private void m12398a(ArrayList<Integer> arrayList) {
        this.f12022e.setVisibility(8);
        this.f12023f.setVisibility(8);
        this.f12024g.setVisibility(8);
        this.f12025h.setVisibility(8);
        for (int i = 0; i < arrayList.size(); i++) {
            switch (arrayList.get(i).intValue()) {
                case 1:
                    this.f12022e.setVisibility(0);
                    break;
                case 2:
                    this.f12024g.setVisibility(0);
                    break;
                case 3:
                    this.f12023f.setVisibility(0);
                    break;
                case 4:
                    this.f12025h.setVisibility(0);
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m12411k() {
        Settings.getInstance().setBoolSetting(Settings.LANG_KEY_ENABLED, this.f12030m);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12399a(boolean z) {
        boolean z2 = true;
        this.f12021d = z;
        Settings.getInstance().setBoolSetting(Settings.LANG_KEY_ENABLED, this.f12021d);
        if (this.f12021d) {
            Settings.getInstance().setIntSetting(Settings.LANGUAGE_SWITCHING_MODE, 1);
        } else {
            Settings.getInstance().setIntSetting(Settings.LANGUAGE_SWITCHING_MODE, 2);
        }
        this.f12026i.setChecked(z);
        CheckBox checkBox = this.f12027j;
        if (z) {
            z2 = false;
        }
        checkBox.setChecked(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12400b(int i) {
        this.f12020c = i;
        switch (i) {
            case 1:
                this.f12022e.setChecked(true);
                this.f12023f.setChecked(false);
                this.f12024g.setChecked(false);
                this.f12025h.setChecked(false);
                return;
            case 2:
                this.f12022e.setChecked(false);
                this.f12023f.setChecked(false);
                this.f12024g.setChecked(true);
                this.f12025h.setChecked(false);
                return;
            case 3:
                this.f12022e.setChecked(false);
                this.f12023f.setChecked(true);
                this.f12024g.setChecked(false);
                this.f12025h.setChecked(false);
                return;
            case 4:
                this.f12022e.setChecked(false);
                this.f12023f.setChecked(false);
                this.f12024g.setChecked(false);
                this.f12025h.setChecked(true);
                return;
            default:
                this.f12022e.setChecked(true);
                this.f12023f.setChecked(false);
                this.f12024g.setChecked(false);
                this.f12025h.setChecked(false);
                this.f12020c = 1;
                return;
        }
    }

    /* renamed from: b */
    public boolean mo8929b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals(this.f12019b) && mo8921c()) {
            return false;
        }
        this.f12019b = str;
        ArrayList<Integer> v = C1368X.m6320c().mo5842o().mo5973v(this.f12019b);
        this.f12028k = mo8928a(str, v);
        this.f12029l = mo8931f();
        if (this.f12028k || this.f12029l) {
            m12408h();
            if (this.f12028k) {
                m12398a(v);
            }
            if (this.f12029l) {
                Settings.getInstance().setBoolSetting(Settings.FIRST_LANGUAGE_MODE, false);
            }
            if (this.f12028k && this.f12029l) {
                m12412l();
            }
            m12410j();
            super.mo8918a(this.f12018a);
            return true;
        }
        m12410j();
        return false;
    }

    /* renamed from: l */
    private void m12412l() {
        ScrollView scrollView = (ScrollView) this.f12018a.findViewById(R.id.content_scroll_frame);
        if (scrollView != null) {
            scrollView.setVerticalScrollBarEnabled(true);
            scrollView.setVerticalFadingEdgeEnabled(true);
            scrollView.setFadingEdgeLength(20);
        }
        if (Settings.getInstance().getConfig().getOrientation() == 2) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) scrollView.getLayoutParams();
            layoutParams.height = mo8920b().getResources().getDimensionPixelSize(R.dimen.dialog_max_content_height_landscape);
            scrollView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public boolean mo8928a(String str, ArrayList<Integer> arrayList) {
        boolean z;
        if (arrayList.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        return z && Settings.getInstance().getBoolSetting(Settings.FIRST_LANGUAGE_LAYOUT, 17, str, (Config) null);
    }

    /* renamed from: f */
    public boolean mo8931f() {
        return false;
    }

    /* renamed from: c */
    public int mo8930c(String str) {
        return 0;
    }

    /* renamed from: a */
    public void mo8912a() {
        if (mo8921c()) {
            super.mo8912a();
        }
    }

    /* renamed from: c */
    public boolean mo8921c() {
        return this.f12018a != null && super.mo8921c();
    }
}
