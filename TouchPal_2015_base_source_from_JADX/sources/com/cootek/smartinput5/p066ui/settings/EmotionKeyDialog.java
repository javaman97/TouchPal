package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.p066ui.BottomBtnsFrame;
import com.cootek.smartinput5.p066ui.control.C2869n;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.EmotionKeyDialog */
public class EmotionKeyDialog extends C1976b {

    /* renamed from: a */
    public static final String f13430a = "com.cootek.smartinputv5.virtual_custom_symbol_pressed";

    /* renamed from: b */
    public static final String f13431b = "TagIndicateSurfaceNeedChange";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public EditText f13432c;

    /* renamed from: d */
    private String f13433d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f13434e;

    /* renamed from: f */
    private Button f13435f;

    /* renamed from: g */
    private Button f13436g;

    /* renamed from: h */
    private Window f13437h;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Context baseContext = getBaseContext();
        super.onCreate(bundle);
        requestWindowFeature(1);
        m13762a();
        BottomBtnsFrame bottomBtnsFrame = (BottomBtnsFrame) findViewById(R.id.buttons_frame);
        Intent intent = getIntent();
        this.f13437h = getWindow();
        this.f13437h.setBackgroundDrawable(new ColorDrawable(0));
        this.f13432c = (EditText) findViewById(R.id.sym_content);
        this.f13433d = intent.getStringExtra("SYMBOL");
        this.f13432c.setText(this.f13433d);
        this.f13434e = intent.getIntExtra("INDEX", 0);
        this.f13435f = bottomBtnsFrame.getPositiveBtn();
        this.f13435f.setOnClickListener(new C3035au(this, baseContext));
        this.f13436g = bottomBtnsFrame.getNegertiveBtn();
        this.f13436g.setOnClickListener(new C3036av(this));
        this.f13432c.setSelection(0, this.f13433d.length());
        if (Build.VERSION.SDK_INT > 10) {
            try {
                ((C3142ci) Class.forName("com.cootek.smartinput5.ui.settings.SetFinishOnTouchOutside11_").asSubclass(C3142ci.class).newInstance()).mo10300a(this);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            }
        }
        new Handler().postDelayed(new C3037aw(this), 500);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m13766a(String str) {
        if (str == null || str.length() <= 0 || str.contains(C0911j.f2473c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m13762a() {
        setContentView(C2869n.m13269a((Context) this, getResString(R.string.optpage_customize_modify), (int) R.layout.custom_symbol_dialog));
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        finish();
    }

    public void finish() {
        m13764a(false);
        super.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13764a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(f13431b, z);
        ((InputMethodManager) getSystemService("input_method")).sendAppPrivateCommand(this.f13432c, f13430a, bundle);
    }
}
