package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.cy */
/* compiled from: SwitchLanguageDialog */
public class C2892cy extends C2681aU {

    /* renamed from: a */
    private Context f13120a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1498a f13121b;

    /* renamed from: c */
    private View f13122c;

    public C2892cy(Context context) {
        super(context, false, false);
        this.f13120a = context;
    }

    /* renamed from: a */
    public void mo9564a(C1498a aVar) {
        Settings.getInstance().setStringSetting(Settings.LANGUAGE_JUST_INSTALLED, "");
        this.f13121b = aVar;
        String a = mo8917a(R.string.hint_language_installed, this.f13121b.f4728g);
        View inflate = ((LayoutInflater) mo8920b().getSystemService("layout_inflater")).inflate(R.layout.switch_language, (ViewGroup) null, false);
        inflate.setOnTouchListener(new C2893cz(this));
        this.f13122c = inflate;
        m13345b(mo8916a(C1593bR.m7162a().mo6232a(16)));
        ((TextView) inflate.findViewById(R.id.switch_content)).setText(a);
        m13344b(inflate);
        mo8918a(inflate);
    }

    /* renamed from: b */
    private void m13345b(String str) {
        ((TextView) this.f13122c.findViewById(R.id.title)).setText(str);
    }

    /* renamed from: b */
    private void m13344b(View view) {
        BottomBtnsFrame bottomBtnsFrame = (BottomBtnsFrame) view.findViewById(R.id.buttons_frame);
        Button negertiveBtn = bottomBtnsFrame.getNegertiveBtn();
        Button positiveBtn = bottomBtnsFrame.getPositiveBtn();
        negertiveBtn.setText(C1974m.m9063a(this.f13120a, (int) R.string.cancel));
        negertiveBtn.setOnClickListener(new C2777cA(this));
        positiveBtn.setText(C1974m.m9063a(this.f13120a, (int) R.string.ok));
        positiveBtn.setOnClickListener(new C2778cB(this));
    }
}
