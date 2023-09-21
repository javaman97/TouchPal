package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.control.C2869n;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.ct */
/* compiled from: SpaceFuncSetupDialog */
public class C2887ct extends C2869n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CheckBox f13112a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CheckBox f13113b;

    public C2887ct(Context context) {
        super(context, true, true);
    }

    /* renamed from: a */
    public void mo7053a() {
        if (!mo9536c_()) {
            mo9528a((CharSequence) mo9538e(R.string.space_func_setup_title));
            View inflate = ((LayoutInflater) mo9539i().getSystemService("layout_inflater")).inflate(R.layout.space_func_setup, (ViewGroup) null, false);
            mo9558b(inflate);
            mo9559c(inflate);
            mo9526a(inflate);
            super.mo9524a(0, mo9539i().getResources().getDisplayMetrics().heightPixels / 4);
        }
    }

    /* renamed from: b */
    public void mo9558b(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.space_func_option_list);
        View findViewById = view.findViewById(R.id.insert_prediction_option_tip);
        View a = m13270a(mo9539i(), mo9538e(R.string.insert_space_option), true);
        this.f13113b = (CheckBox) a.findViewById(R.id.item_checkbox);
        this.f13113b.setChecked(true);
        View a2 = m13270a(mo9539i(), mo9538e(R.string.insert_prediction_option), false);
        this.f13112a = (CheckBox) a2.findViewById(R.id.item_checkbox);
        this.f13112a.setChecked(false);
        findViewById.setVisibility(8);
        this.f13113b.setOnCheckedChangeListener(new C2888cu(this, findViewById));
        linearLayout.addView(a);
        a.findViewById(R.id.item_line).setVisibility(8);
        this.f13112a.setOnCheckedChangeListener(new C2889cv(this, findViewById));
        a2.findViewById(R.id.item_line).setVisibility(8);
        linearLayout.addView(a2);
    }

    /* renamed from: c */
    public void mo9559c(View view) {
        Button d = mo8595d();
        if (d != null) {
            d.setText(mo9538e(17039360));
            d.setOnClickListener(new C2890cw(this));
        }
        Button d_ = mo8596d_();
        if (d_ != null) {
            d_.setText(mo9538e(R.string.space_func_yes));
            d_.setOnClickListener(new C2891cx(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13338a(boolean z) {
        Settings.getInstance().setBoolSetting(36, z, 14, "western", (Config) null, true);
    }
}
