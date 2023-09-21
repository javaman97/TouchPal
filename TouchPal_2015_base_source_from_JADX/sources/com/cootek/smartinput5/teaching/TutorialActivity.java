package com.cootek.smartinput5.teaching;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.teaching.C2557a;
import com.cootek.smartinput5.teaching.p065a.C2564f;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.List;

public class TutorialActivity extends Activity implements C2557a.C2558a {

    /* renamed from: a */
    private final String f10930a = "TutorialActivity";

    /* renamed from: b */
    private EditText f10931b;

    /* renamed from: c */
    private ViewGroup f10932c;

    /* renamed from: d */
    private ListView f10933d;

    /* renamed from: e */
    private C2550b[] f10934e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<C2550b> f10935f;

    /* renamed from: g */
    private C2550b f10936g;

    /* renamed from: h */
    private C2549a f10937h;

    /* renamed from: i */
    private boolean f10938i = false;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.tutorial_animation);
        C1368X.m6317b((Context) this);
        this.f10935f = new ArrayList<>();
        m11320d();
        Settings.getInstance().setBoolSetting(Settings.FIRST_TUTORIAL_WELCOME, false);
    }

    /* renamed from: a */
    private void m11310a() {
        String[] strArr = {C2564f.f11021a, C2564f.f11023c, C2564f.f11025e, C2564f.f11026f};
        this.f10934e = new C2550b[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.f10934e[i] = new C2550b(C1368X.m6320c().mo5851x().mo8419a(strArr[i]));
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (Settings.isInitialized()) {
            Settings.getInstance().enableTemporarySettingMode((ArrayList<Integer>) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (Settings.isInitialized()) {
            Settings.getInstance().disableTemporarySettingMode();
        }
    }

    /* renamed from: b */
    private ArrayList<C2550b> m11317b() {
        ArrayList<C2550b> arrayList = new ArrayList<>();
        if (this.f10934e != null) {
            for (C2550b bVar : this.f10934e) {
                if (bVar.mo8379a()) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m11319c() {
        this.f10935f = m11317b();
        if (this.f10937h != null) {
            this.f10937h.notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    private void m11320d() {
        m11310a();
        m11321e();
        m11323f();
    }

    /* renamed from: e */
    private void m11321e() {
        this.f10931b = (EditText) findViewById(R.id.edit);
        this.f10931b.setVisibility(8);
    }

    /* renamed from: f */
    private void m11323f() {
        this.f10933d = (ListView) findViewById(R.id.tutorials_list);
        this.f10937h = new C2549a(this, (C2568ab) null);
        if (this.f10933d != null) {
            this.f10933d.setCacheColorHint(0);
            this.f10933d.setAdapter(this.f10937h);
        }
        m11319c();
        this.f10932c = (ViewGroup) findViewById(R.id.reading_tag);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public String m11324g() {
        int indexOf = this.f10935f.indexOf(this.f10936g);
        if (indexOf != this.f10935f.size() - 1) {
            return this.f10935f.get(indexOf + 1).f10941b.mo8407v();
        }
        return null;
    }

    /* renamed from: e */
    public void mo8366e(String str) {
        if (C1368X.m6324d()) {
            C2557a d = C1368X.m6320c().mo5851x().mo8424d();
            if (d != null) {
                d.mo8404o();
            }
            this.f10938i = false;
            m11325g(str);
        }
    }

    /* renamed from: a */
    private void m11311a(View view) {
        ((ImageView) view.findViewById(R.id.btn)).setImageDrawable(getResources().getDrawable(R.drawable.tutorial_circle_highlight));
        ((ImageView) view.findViewById(R.id.line)).setImageDrawable(getResources().getDrawable(R.drawable.wizard_blue_line));
        ((TextView) view.findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.tutorial_text_highlight_color));
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            if (!m11327i() || !m11326h()) {
                finish();
            } else {
                m11319c();
            }
        }
        super.onWindowFocusChanged(z);
    }

    /* renamed from: h */
    private boolean m11326h() {
        String string = Settings.Secure.getString(getContentResolver(), "default_input_method");
        return string != null && string.equalsIgnoreCase(new StringBuilder().append(getPackageName()).append("/").append(TouchPalIME.class.getName()).toString());
    }

    /* renamed from: i */
    private boolean m11327i() {
        List<InputMethodInfo> enabledInputMethodList = ((InputMethodManager) getApplicationContext().getSystemService("input_method")).getEnabledInputMethodList();
        for (int i = 0; i < enabledInputMethodList.size(); i++) {
            if (enabledInputMethodList.get(i).getPackageName().equalsIgnoreCase(getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public void finish() {
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        this.f10938i = false;
        C2564f.m11466a(0);
        if (this.f10931b.isShown()) {
            m11315a(false);
            return;
        }
        com.cootek.smartinput5.engine.Settings.getInstance().disableTemporarySettingMode();
        super.finish();
    }

    /* renamed from: com.cootek.smartinput5.teaching.TutorialActivity$a */
    private class C2549a extends BaseAdapter {
        private C2549a() {
        }

        /* synthetic */ C2549a(TutorialActivity tutorialActivity, C2568ab abVar) {
            this();
        }

        public int getCount() {
            return TutorialActivity.this.f10935f.size();
        }

        public Object getItem(int i) {
            return TutorialActivity.this.f10935f.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return ((C2550b) TutorialActivity.this.f10935f.get(i)).mo8380b();
        }
    }

    /* renamed from: j */
    private void m11328j() {
        if (this.f10931b != null) {
            this.f10931b.setText("");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11315a(boolean z) {
        C2557a d;
        if (!z && C1368X.m6324d() && (d = C1368X.m6320c().mo5851x().mo8424d()) != null) {
            d.mo8402m();
        }
        if (this.f10931b != null) {
            if (z) {
                this.f10931b.setVisibility(0);
            } else {
                m11328j();
                this.f10931b.setVisibility(8);
            }
        }
        if (this.f10933d != null) {
            if (z) {
                this.f10933d.setVisibility(8);
            } else {
                m11319c();
                this.f10933d.setVisibility(0);
            }
        }
        if (this.f10932c == null) {
            return;
        }
        if (z) {
            this.f10932c.setVisibility(0);
        } else {
            this.f10932c.setVisibility(8);
        }
    }

    /* renamed from: f */
    private C2550b m11322f(String str) {
        for (C2550b bVar : this.f10934e) {
            if (TextUtils.equals(str, bVar.f10941b.mo8407v())) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m11325g(String str) {
        if (!this.f10938i) {
            this.f10938i = true;
            this.f10936g = m11322f(str);
            if (this.f10936g != null) {
                this.f10936g.mo8378a(true);
            }
            C2564f.m11466a(1);
            m11315a(true);
            C1368X.m6320c().mo5851x().mo8420a(str, this, this);
            m11329k();
        }
    }

    /* renamed from: com.cootek.smartinput5.teaching.TutorialActivity$b */
    private class C2550b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C2557a f10941b;

        /* renamed from: c */
        private boolean f10942c = false;

        public C2550b(C2557a aVar) {
            this.f10941b = aVar;
        }

        /* renamed from: a */
        public boolean mo8379a() {
            if (this.f10941b != null) {
                return this.f10941b.mo8346u();
            }
            return false;
        }

        /* renamed from: a */
        public void mo8378a(boolean z) {
            this.f10942c = z;
        }

        /* renamed from: b */
        public View mo8380b() {
            ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) TutorialActivity.this.getSystemService("layout_inflater")).inflate(R.layout.tutorial_item, (ViewGroup) null);
            viewGroup.setOnClickListener(new C2572af(this));
            TextView textView = (TextView) viewGroup.findViewById(R.id.text);
            if (textView != null) {
                textView.setText(TutorialActivity.this.m11307a(this.f10941b.mo8347w()));
            }
            viewGroup.setTag(this.f10941b.mo8407v());
            if (this.f10942c) {
                TutorialActivity.this.m11318b((View) viewGroup);
            }
            return viewGroup;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11318b(View view) {
        ((ImageView) view.findViewById(R.id.btn)).setImageDrawable(getResources().getDrawable(R.drawable.tutorial_circle_read));
        ((ImageView) view.findViewById(R.id.line)).setImageDrawable(getResources().getDrawable(R.drawable.wizard_grey_line));
        ((TextView) view.findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.tutorial_text_read_color));
    }

    /* renamed from: k */
    private void m11329k() {
        C2557a d;
        TextView textView;
        if (this.f10932c != null) {
            m11311a((View) this.f10932c);
            if (C1368X.m6324d() && (d = C1368X.m6320c().mo5851x().mo8424d()) != null && (textView = (TextView) this.f10932c.findViewById(R.id.text)) != null) {
                textView.setText(m11307a(d.mo8347w()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m11307a(int i) {
        return C1974m.m9063a((Context) this, i);
    }

    /* renamed from: l */
    private void m11330l() {
        this.f10938i = false;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(m11307a((int) R.string.teaching_play_finished_title));
        builder.setNegativeButton(m11307a((int) R.string.teaching_popup_replay), new C2568ab(this));
        if (TextUtils.isEmpty(m11324g())) {
            builder.setMessage(m11307a((int) R.string.teaching_play_finished_no_more));
            builder.setPositiveButton(m11307a((int) R.string.teaching_popup_done), new C2569ac(this));
        } else {
            builder.setMessage(m11307a((int) R.string.teaching_play_finished_msg));
            builder.setPositiveButton(m11307a((int) R.string.tutorial_next_button_text), new C2570ad(this));
        }
        builder.setOnCancelListener(new C2571ae(this));
        try {
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5851x().mo8421a(false);
        }
    }

    /* renamed from: a */
    public void mo8362a(String str) {
    }

    /* renamed from: b */
    public void mo8363b(String str) {
        m11330l();
    }

    /* renamed from: c */
    public void mo8364c(String str) {
    }

    /* renamed from: d */
    public void mo8365d(String str) {
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
    }
}
