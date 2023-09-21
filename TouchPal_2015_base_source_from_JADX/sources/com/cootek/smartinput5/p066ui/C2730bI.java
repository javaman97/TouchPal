package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.paopaopanel.C1933b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.cootek.smartinput5.ui.bI */
/* compiled from: SelectLanguage */
public class C2730bI extends C2681aU {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f12216a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CheckBox f12217b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f12218c;

    public C2730bI(Context context) {
        super(context, false, false);
        this.f12216a = context;
    }

    /* renamed from: f */
    public void mo8931f() {
        this.f12218c = Engine.getInstance().getCurrentLanguageId();
        View inflate = ((LayoutInflater) this.f12216a.getSystemService("layout_inflater")).inflate(R.layout.select_language, (ViewGroup) null);
        inflate.setOnTouchListener(new C2731bJ(this));
        m12526c(inflate);
        m12527d(inflate);
        m12528e(inflate);
        m12524b(inflate);
        mo8918a(inflate);
    }

    /* renamed from: b */
    private void m12524b(View view) {
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.langauge_scroll_frame);
        if (scrollView != null) {
            scrollView.setVerticalScrollBarEnabled(true);
            scrollView.setVerticalFadingEdgeEnabled(true);
            scrollView.setFadingEdgeLength(20);
        }
    }

    /* renamed from: c */
    private void m12526c(View view) {
        TextView textView = (TextView) view.findViewById(R.id.title);
        textView.setText(mo8916a((int) R.string.im_menu));
        textView.setTextColor(this.f12216a.getResources().getColor(R.color.language_dialog_foreground_color));
    }

    /* renamed from: a */
    private void m12522a(LinearLayout linearLayout) {
        LayoutInflater layoutInflater = (LayoutInflater) this.f12216a.getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(R.layout.subtype_single_selector_item, (ViewGroup) null, false);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.keyboard_subtype_list);
        C1933b bVar = new C1933b();
        String languageCategory = C1368X.m6320c().mo5835h().getLanguageCategory(this.f12218c, 1);
        int size = bVar.mo7115a(this.f12218c).size();
        int a = C1933b.m8860a();
        if (size < 2) {
            linearLayout2.removeAllViews();
            linearLayout2.setVisibility(8);
            linearLayout.addView(inflate);
            return;
        }
        linearLayout2.removeAllViews();
        linearLayout2.setWeightSum((float) size);
        List<Integer> a2 = bVar.mo7115a(this.f12218c);
        for (Integer intValue : a2) {
            int intValue2 = intValue.intValue();
            View inflate2 = layoutInflater.inflate(R.layout.language_dialog_subtype_item, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.weight = 1.0f;
            TextView textView = (TextView) inflate2.findViewById(R.id.subtype_name);
            switch (intValue2) {
                case 1:
                    textView.setText(mo8916a((int) R.string.optpage_phonepad));
                    break;
                case 2:
                    textView.setText(mo8916a((int) R.string.optpage_fullqwerty));
                    break;
                case 3:
                    textView.setText(mo8916a((int) R.string.optpage_tplus));
                    break;
            }
            inflate2.setLayoutParams(layoutParams);
            if (intValue2 == a) {
                inflate2.setClickable(false);
                inflate2.setSelected(true);
                inflate2.setEnabled(false);
                textView.setTypeface(C1624bv.m7422b());
            } else {
                inflate2.setClickable(true);
                inflate2.setSelected(false);
                inflate2.setEnabled(true);
                textView.setTypeface(C1624bv.m7418a());
            }
            inflate2.setOnClickListener(new C2732bK(this, inflate2, intValue2, languageCategory));
            linearLayout2.addView(inflate2);
            if (a2.indexOf(Integer.valueOf(intValue2)) != size - 1) {
                linearLayout2.addView(m12530g());
            }
        }
        linearLayout.addView(inflate);
    }

    /* renamed from: g */
    private View m12530g() {
        View view = new View(this.f12216a);
        view.setLayoutParams(new LinearLayout.LayoutParams(this.f12216a.getResources().getDimensionPixelSize(R.dimen.language_dialog_subtype_divider_width), -1));
        view.setBackgroundResource(R.color.language_dialog_divider_color);
        return view;
    }

    /* renamed from: d */
    private void m12527d(View view) {
        String enabledLanguageFullName;
        Engine instance = Engine.getInstance();
        String[] J = C1368X.m6320c().mo5842o().mo5922J();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.language_list);
        int length = J.length;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < length; i++) {
            if (C1389aD.m6470y(J[i])) {
                hashMap.put(J[i], C1974m.m9063a(this.f12216a, (int) R.string.chinese));
            } else {
                C1498a l = C1368X.m6320c().mo5842o().mo5954l(J[i]);
                if (l != null) {
                    enabledLanguageFullName = l.mo6153c();
                } else {
                    enabledLanguageFullName = instance.getEnabledLanguageFullName(i);
                }
                hashMap.put(J[i], enabledLanguageFullName);
            }
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (J[i2] != null) {
                String charSequence = ((CharSequence) hashMap.get(J[i2])).toString();
                boolean equals = TextUtils.equals(this.f12218c, J[i2]);
                boolean z = equals && !C1389aD.m6470y(J[i2].toString());
                View a = m12521a(J[i2], charSequence, equals);
                linearLayout.addView(a);
                if (z) {
                    m12522a(linearLayout);
                }
                if (z) {
                    a.findViewById(R.id.item_line).setVisibility(8);
                }
            }
        }
    }

    /* renamed from: e */
    private void m12528e(View view) {
        m12529f(view);
    }

    /* renamed from: f */
    private void m12529f(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.language_settings_btn);
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new C2733bL(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo9005a(String str, boolean z) {
        View inflate = ((LayoutInflater) this.f12216a.getSystemService("layout_inflater")).inflate(R.layout.language_single_selector_item, (ViewGroup) null);
        inflate.setSelected(z);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.item_checkbox);
        checkBox.setChecked(z);
        ((TextView) inflate.findViewById(R.id.item_text)).setText(str);
        checkBox.setOnClickListener(new C2734bM(this, checkBox));
        inflate.setOnClickListener(new C2735bN(this, inflate, checkBox));
        return inflate;
    }

    /* renamed from: a */
    private View m12521a(CharSequence charSequence, String str, boolean z) {
        View a = mo9005a(str, z);
        CheckBox checkBox = (CheckBox) a.findViewById(R.id.item_checkbox);
        checkBox.setOnCheckedChangeListener(new C2736bO(this, charSequence));
        if (z) {
            this.f12217b = checkBox;
        }
        return a;
    }
}
