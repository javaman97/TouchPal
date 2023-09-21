package com.cootek.smartinput5.teaching;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.JsHandler;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2618H;
import com.cootek.smartinput5.teaching.C2557a;
import com.cootek.smartinput5.teaching.p065a.C2564f;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.List;

public class TutorialMissionActivity extends Activity implements C2557a.C2558a {

    /* renamed from: a */
    public static final String f10943a = "teaching_type";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public EditText f10944b;

    /* renamed from: c */
    private TextView f10945c;

    /* renamed from: d */
    private Button f10946d;

    /* renamed from: e */
    private ImageView f10947e;

    /* renamed from: f */
    private String f10948f = null;

    /* renamed from: g */
    private Handler f10949g;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.tutorial_mission);
        C1368X.m6317b((Context) this);
        Settings.getInstance().enableTemporarySettingMode((ArrayList<Integer>) null);
        C2564f.m11466a(2);
        m11342a();
        C1368X.m6320c().mo5851x().mo8420a(this.f10948f, this, this);
    }

    /* renamed from: a */
    private void m11342a() {
        this.f10949g = new Handler();
        this.f10948f = getIntent().getStringExtra(f10943a);
        this.f10944b = (EditText) findViewById(R.id.edit);
        this.f10945c = (TextView) findViewById(R.id.hint_text);
        this.f10946d = (Button) findViewById(R.id.success_btn);
        this.f10947e = (ImageView) findViewById(R.id.success_tag);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m11355e(String str) {
        Message obtain = Message.obtain((Handler) null, 4);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.EXTRA_ACTION_TYPE, 11);
        bundle.putString(JsHandler.EXTRA_STRING_MISSION_ID, str);
        bundle.putInt(JsHandler.EXTRA_INT_MISSION_STATE, 2);
        obtain.setData(bundle);
        C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
        C1368X.m6320c().mo5851x().mo8421a(false);
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (z && ((!m11350b() || !m11352c()) && C1368X.m6324d())) {
            C1368X.m6320c().mo5851x().mo8421a(false);
        }
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    private boolean m11350b() {
        List<InputMethodInfo> enabledInputMethodList = ((InputMethodManager) getApplicationContext().getSystemService("input_method")).getEnabledInputMethodList();
        for (int i = 0; i < enabledInputMethodList.size(); i++) {
            if (enabledInputMethodList.get(i).getPackageName().equalsIgnoreCase(getPackageName())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
        C2564f.m11466a(0);
    }

    /* renamed from: c */
    private boolean m11352c() {
        String string = Settings.Secure.getString(getContentResolver(), "default_input_method");
        return string != null && string.equalsIgnoreCase(new StringBuilder().append(getPackageName()).append("/").append(TouchPalIME.class.getName()).toString());
    }

    /* renamed from: a */
    private String m11341a(int i) {
        return C1974m.m9063a((Context) this, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11346a(C2557a aVar, EditText editText) {
        if (aVar != null) {
            C1368X.m6320c().mo5851x().mo8423b();
            C2618H h = new C2618H(this);
            h.mo8572a(m11341a((int) R.string.mission_instruction_title));
            h.mo8580b(aVar.mo8340f());
            h.mo8573a(aVar.mo8341g(), C1368X.m6320c().mo5841n().mo6260b((int) R.color.mission_hint_highlight_color));
            h.mo8574a(m11341a((int) R.string.mission_done_btn_title), (View.OnClickListener) new C2573ag(this, aVar, editText));
            h.mo8581b(m11341a((int) R.string.teaching_popup_replay), (View.OnClickListener) new C2574ah(this, aVar));
            h.mo8571a((Runnable) new C2575ai(this, aVar, editText));
            h.mo8567a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11349b(C2557a aVar, EditText editText) {
        if (aVar != null) {
            Runnable k = aVar.mo8343k();
            if (k != null) {
                k.run();
            }
            aVar.mo8406t();
            aVar.mo8402m();
            if (editText != null) {
                String c = aVar.mo8386c();
                if (!TextUtils.isEmpty(c)) {
                    editText.setText(c);
                    editText.requestFocus();
                    editText.setSelection(c.length());
                } else {
                    editText.setText("");
                }
                TextWatcher d = aVar.mo8339d();
                if (d != null) {
                    editText.addTextChangedListener(d);
                }
            }
        }
    }

    /* renamed from: a */
    private void m11345a(C2557a aVar) {
        if (aVar != null) {
            String f = aVar.mo8340f();
            if (this.f10945c != null) {
                this.f10945c.setText(f);
                C1584bI.m7136a(this.f10945c, aVar.mo8341g(), C1368X.m6320c().mo5841n().mo6260b((int) R.color.mission_hint_highlight_color));
            }
        }
    }

    /* renamed from: b */
    private void m11347b(int i) {
        if (this.f10945c != null) {
            this.f10945c.setVisibility(i);
        }
    }

    /* renamed from: d */
    private void m11353d() {
        if (C1368X.m6324d() && C1368X.m6320c().mo5851x().mo8422a()) {
            m11345a(C1368X.m6320c().mo5851x().mo8424d());
        }
        m11347b(0);
    }

    /* renamed from: e */
    private void m11354e() {
        m11347b(8);
    }

    /* renamed from: c */
    private void m11351c(int i) {
        if (this.f10947e != null) {
            this.f10947e.setVisibility(i);
        }
        if (this.f10946d != null) {
            this.f10946d.setVisibility(i);
        }
    }

    /* renamed from: f */
    private void m11356f() {
        m11351c(0);
    }

    /* renamed from: g */
    private void m11357g() {
        if (this.f10944b != null) {
            this.f10944b.setText("");
        }
    }

    /* renamed from: h */
    private void m11358h() {
        m11354e();
        m11357g();
    }

    /* renamed from: c */
    public void mo8364c(String str) {
        m11356f();
        if (this.f10946d != null) {
            this.f10946d.setOnClickListener(new C2576aj(this, str));
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C1368X.m6320c().mo5851x().mo8421a(false);
    }

    /* renamed from: a */
    public void mo8362a(String str) {
    }

    /* renamed from: d */
    public void mo8365d(String str) {
        m11358h();
    }

    /* renamed from: b */
    public void mo8363b(String str) {
        m11353d();
        this.f10949g.postDelayed(new C2577ak(this), 400);
    }
}
