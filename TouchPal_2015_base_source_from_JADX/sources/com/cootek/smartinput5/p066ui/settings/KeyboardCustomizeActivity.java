package com.cootek.smartinput5.p066ui.settings;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.CandidateBar;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import com.cootek.smartinput5.p066ui.TopScrollView;
import com.cootek.smartinput5.p066ui.settings.C3007aV;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.settings.KeyboardCustomizeActivity */
public class KeyboardCustomizeActivity extends Activity implements C3007aV.C3008a {

    /* renamed from: a */
    public static final int f13480a = -1;

    /* renamed from: b */
    private static boolean f13481b = false;

    /* renamed from: c */
    private static final int f13482c = 100;

    /* renamed from: d */
    private EditText f13483d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f13484e = new Handler();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        setContentView(R.layout.keyboard_customize_activity);
        m13807c();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        Settings.getInstance().enableTemporarySettingMode(m13805b());
        f13481b = true;
        m13813g();
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
    }

    /* renamed from: b */
    private ArrayList<Integer> m13805b() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(Settings.ONE_HANDED_LAYOUT));
        arrayList.add(Integer.valueOf(Settings.KEYBOARD_HEIGHT_NORMAL));
        arrayList.add(Integer.valueOf(Settings.KEYBOARD_MARGIN));
        arrayList.add(123);
        return arrayList;
    }

    /* renamed from: c */
    private void m13807c() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.CandidateSizeController);
        if (relativeLayout != null) {
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, getApplicationContext().getResources().getDisplayMetrics().heightPixels / 5));
            m13809d();
        }
    }

    /* renamed from: d */
    private void m13809d() {
        SeekBar seekBar = (SeekBar) findViewById(R.id.candidate_size);
        if (seekBar != null) {
            seekBar.setProgress(m13799a(0, 2, 0, 100, TopScrollView.m12056e(Settings.getInstance().getIntSetting(123))));
            seekBar.setMax(100);
            seekBar.setOnSeekBarChangeListener(m13811e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m13799a(int i, int i2, int i3, int i4, int i5) {
        return ((int) (((((float) (i5 - i)) * ((float) (i4 - i3))) / ((float) (i2 - i))) + 0.5f)) + i3;
    }

    /* renamed from: e */
    private SeekBar.OnSeekBarChangeListener m13811e() {
        return new C3005aT(this);
    }

    /* renamed from: f */
    private void m13812f() {
        this.f13483d = (EditText) findViewById(R.id.hiden_editor_text);
        this.f13483d.setBackgroundColor(0);
        this.f13483d.setVisibility(0);
        this.f13483d.requestFocus();
    }

    /* renamed from: g */
    private void m13813g() {
        m13812f();
        this.f13484e.post(new C3006aU(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m13814h() {
        if (Engine.isInitialized() && TextUtils.equals(Settings.getInstance().getStringSetting(10), C1549b.f4835f)) {
            if (!Settings.getInstance().isLanguageEnabled(C1549b.f4791a)) {
                Settings.getInstance().setLanguageEnabled(C1549b.f4791a, true);
            }
            Engine.getInstance();
            Engine.switchToLanguage(C1549b.f4791a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m13815i() {
        try {
            if (!Engine.isInitialized()) {
                return false;
            }
            SoftKeyboardView g = Engine.getInstance().getWidgetManager().mo9648g();
            if (g.getWindowToken() == null || !g.isShown()) {
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m13816j() {
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13803a(boolean z) {
        CandidateBar f;
        if (Engine.isInitialized() && (f = Engine.getInstance().getWidgetManager().mo9651i().mo9720f()) != null) {
            f.mo8492b(z);
            Engine.getInstance().updateResult(16, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        f13481b = false;
        if (Engine.isInitialized()) {
            Engine.getInstance().getWidgetManager().mo9632af().mo10100b((C3007aV.C3008a) this);
            Engine.getInstance().setKeyboardMode(true);
            m13803a(false);
            if (Engine.getInstance().getWidgetManager().mo9632af() != null) {
                Engine.getInstance().getWidgetManager().mo9632af().mo10103e();
            }
            ((TouchPalIME) Engine.getInstance().getIms()).requestHideSelf(0);
        }
        if (Settings.isInitialized()) {
            Settings.getInstance().disableTemporarySettingMode();
        }
        C1368X.m6325e();
        super.onPause();
    }

    /* renamed from: a */
    public static boolean m13804a() {
        return f13481b;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        finish();
        return true;
    }

    /* renamed from: t */
    public void mo8562t() {
    }

    /* renamed from: u */
    public void mo8563u() {
        finish();
    }
}
