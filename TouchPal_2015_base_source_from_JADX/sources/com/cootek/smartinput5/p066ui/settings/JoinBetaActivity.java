package com.cootek.smartinput5.p066ui.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.JoinBetaActivity */
public class JoinBetaActivity extends C1976b {

    /* renamed from: a */
    private final String f13473a = "join community";

    /* renamed from: b */
    private final String f13474b = "become tester";

    /* renamed from: c */
    private final String f13475c = EnterKey.DONE;

    /* renamed from: d */
    private final Integer[][] f13476d = {new Integer[]{Integer.valueOf(R.string.beta_join_community), Integer.valueOf(R.string.beta_join_community_url)}, new Integer[]{Integer.valueOf(R.string.beta_become_tester), Integer.valueOf(R.string.beta_become_tester_url)}, new Integer[]{Integer.valueOf(R.string.beta_done), null}};

    /* renamed from: e */
    private final String[] f13477e = {"join community", "become tester", EnterKey.DONE};

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.join_beta_steps);
        m13796b();
        m13790a();
    }

    /* renamed from: a */
    private void m13790a() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.root);
        if (linearLayout != null) {
            for (int i = 0; i < this.f13476d.length; i++) {
                Integer[] numArr = this.f13476d[i];
                String resString = getResString(numArr[0].intValue());
                String str = "";
                if (numArr[1] != null) {
                    str = getResString(numArr[1].intValue());
                }
                m13791a(i, linearLayout, resString, str);
            }
        }
    }

    /* renamed from: a */
    private void m13791a(int i, LinearLayout linearLayout, String str, String str2) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setText(String.valueOf(i + 1) + C1389aD.f4374j);
        textView.setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.beta_guide_index_text_size));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        linearLayout2.addView(textView, layoutParams);
        TextView a = m13789a(str, str2, this.f13477e[i]);
        a.setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.beta_guide_text_size));
        a.setPadding(20, 10, 20, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        linearLayout2.addView(a, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = 20;
        linearLayout.addView(linearLayout2, layoutParams3);
    }

    /* renamed from: a */
    private TextView m13789a(String str, String str2, String str3) {
        TextView textView = new TextView(this);
        m13792a(textView, str, str2, str3);
        return textView;
    }

    /* renamed from: a */
    private void m13792a(TextView textView, String str, String str2, String str3) {
        textView.setOnClickListener(new C3004aS(this, str2, str3));
        if (str2 != null) {
            str = String.format(str, new Object[]{str2});
        }
        if (str2 == null || str.indexOf(str2) == -1) {
            textView.setText(str);
            return;
        }
        int indexOf = str.indexOf(str2);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), indexOf, str2.length() + indexOf, 17);
        textView.setText(spannableString);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13794a(String str) {
        if (str != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            C1584bI.m7130a((Context) this, intent, 0);
        }
    }

    /* renamed from: b */
    private void m13796b() {
        m13795a(C1246d.f3944p, C1246d.f3942n);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13798b(String str) {
        m13795a("CLICK", str);
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    private void m13795a(String str, String str2) {
        C1246d.m6010a((Context) this).mo4591a((C1246d.f3797bN + str).toUpperCase(), str2, C1246d.f3836c);
    }
}
