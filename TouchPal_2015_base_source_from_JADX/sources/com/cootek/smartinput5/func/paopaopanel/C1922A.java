package com.cootek.smartinput5.func.paopaopanel;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.paopaopanel.C1924C;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.control.C2869n;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.A */
/* compiled from: TradSimpConvertContentLayout */
public class C1922A {

    /* renamed from: a */
    private static final int[] f6506a = {R.string.trad_simp_convert_auto, R.string.trad_simp_convert_output_simp, R.string.trad_simp_convert_output_trad};

    /* renamed from: b */
    private static final int f6507b = 3;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1924C.C1925a f6508c;

    /* renamed from: d */
    private Context f6509d;

    /* renamed from: e */
    private LayoutInflater f6510e;

    /* renamed from: f */
    private View f6511f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Dialog f6512g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1924C f6513h;

    public C1922A(Context context, Dialog dialog, C1924C.C1925a aVar) {
        this.f6509d = context;
        this.f6512g = dialog;
        this.f6508c = aVar;
        mo7082a();
        m8806a(this.f6511f);
    }

    public C1922A(Context context, C1924C c, C1924C.C1925a aVar) {
        this.f6509d = context;
        this.f6513h = c;
        this.f6508c = aVar;
        mo7082a();
        m8806a(this.f6511f);
    }

    /* renamed from: a */
    public void mo7082a() {
        this.f6510e = (LayoutInflater) this.f6509d.getSystemService("layout_inflater");
        this.f6511f = this.f6510e.inflate(R.layout.trad_simp_convert_dialog, (ViewGroup) null, false);
    }

    /* renamed from: b */
    public View mo7084b() {
        return this.f6511f;
    }

    /* renamed from: a */
    private void m8806a(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.trad_simp_convert);
        for (int i = 0; i < 3; i++) {
            linearLayout.addView(m8804a(C1974m.m9063a(this.f6509d, f6506a[i]), i));
        }
    }

    /* renamed from: a */
    private View m8804a(String str, int i) {
        View a = C2869n.m13270a(this.f6509d, str, i == Settings.getInstance().getIntSetting(60));
        ((CheckBox) a.findViewById(R.id.item_checkbox)).setOnCheckedChangeListener(new C1923B(this, i));
        if (i == 2) {
            a.findViewById(R.id.item_line).setVisibility(4);
        }
        return a;
    }

    /* renamed from: a */
    public void mo7083a(int i) {
        String str = C1246d.f3947s;
        switch (i) {
            case 0:
                str = C1246d.f3732aB;
                break;
            case 1:
                str = C1246d.f3733aC;
                break;
            case 2:
                str = C1246d.f3734aD;
                break;
        }
        C1246d.m6010a(this.f6509d).mo4591a(C1246d.f3731aA, str, C1246d.f3836c);
    }
}
