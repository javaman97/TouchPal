package com.cootek.smartinput5.p066ui.settings;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.component.C1684q;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.control.C2829G;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.UsrWordManageActivity */
public class UsrWordManageActivity extends C1976b implements C3133cb {

    /* renamed from: a */
    public static final String f13778a = "language_id";

    /* renamed from: b */
    public static final int f13779b = 0;

    /* renamed from: c */
    public static final int f13780c = 1;

    /* renamed from: d */
    public static final int f13781d = 2;

    /* renamed from: e */
    public static int f13782e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3134cc f13783f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ListView f13784g;

    /* renamed from: h */
    private TextView f13785h;

    /* renamed from: i */
    private QuickAlphabeticBar f13786i;

    /* renamed from: j */
    private Button f13787j;

    /* renamed from: k */
    private Button f13788k;

    /* renamed from: l */
    private ImageButton f13789l;

    /* renamed from: m */
    private ImageButton f13790m;

    /* renamed from: n */
    private View f13791n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f13792o = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f13793p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public AlertDialog f13794q;

    /* renamed from: r */
    private AlertDialog f13795r;

    /* renamed from: s */
    private AlertDialog f13796s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public EditText f13797t;

    /* renamed from: u */
    private Runnable f13798u = new C3217eb(this);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        requestWindowFeature(1);
        setContentView(R.layout.usr_word_editor);
        m14176l();
        m14162d();
        m14154b();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m14156b(getIntent().getStringExtra(f13778a));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C1684q.m7769a().mo6553b(C1368X.m6313b(), 1).mo6489a(0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
    }

    /* renamed from: b */
    private void m14154b() {
        this.f13785h = (TextView) findViewById(R.id.quick_character_hint);
        this.f13786i = (QuickAlphabeticBar) findViewById(R.id.quick_alphabet_bar);
        if (this.f13786i != null) {
            this.f13786i.setQuickHintView(this.f13785h);
            this.f13786i.mo9949a(this.f13784g);
            this.f13786i.setSeparatorAdapter(this.f13783f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m14159c() {
        this.f13795r = new C2894d.C2895a(this).setPositiveButton(17039370, new C3220ee(this)).setNegativeButton(17039360, new C3219ed(this)).setTitle(getResString(R.string.usr_word_delete_warning)).create();
        this.f13795r.show();
    }

    /* renamed from: d */
    private void m14162d() {
        m14175k();
        m14165f();
        m14163e();
        m14173j();
    }

    /* renamed from: e */
    private void m14163e() {
        this.f13788k = (Button) findViewById(R.id.select_all_btn);
        this.f13788k.setText(getResString(R.string.usr_word_editor_selecte_all));
        if (this.f13788k != null) {
            this.f13788k.setOnClickListener(new C3221ef(this));
        }
    }

    /* renamed from: f */
    private void m14165f() {
        this.f13789l = (ImageButton) findViewById(R.id.add);
        if (this.f13789l != null) {
            this.f13789l.setOnClickListener(new C3222eg(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m14168g() {
        if (this.f13794q != null && this.f13794q.isShowing()) {
            this.f13794q.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m14169h() {
        if (this.f13795r != null && this.f13795r.isShowing()) {
            this.f13795r.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m14172i() {
        this.f13797t = new EditText(this);
        this.f13797t.addTextChangedListener(new C3223eh(this));
        this.f13794q = new C2894d.C2895a(this).setPositiveButton(17039370, new C3225ej(this)).setNegativeButton(17039360, new C3224ei(this)).setTitle(getResString(R.string.usr_word_add_dialog_title)).setView(this.f13797t).create();
        this.f13794q.show();
        Button button = this.f13794q.getButton(m14153b(-1));
        if (button != null) {
            button.setEnabled(false);
        }
    }

    /* renamed from: a */
    private void m14147a(int i) {
        this.f13796s = new AlertDialog.Builder(this).setMessage(getResString(i)).setNegativeButton(17039370, (DialogInterface.OnClickListener) null).create();
        this.f13796s.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14150a(String str) {
        String trim = str.trim();
        if (this.f13783f.mo10265c(trim)) {
            m14147a((int) R.string.usr_word_already_has);
            return;
        }
        f13782e = 0;
        if (trim.length() <= 0 || C2829G.m12929a(trim.charAt(0))) {
            f13782e = 1;
        } else if (!Engine.isInitialized()) {
            f13782e = 1;
        } else {
            Okinawa h = C1368X.m6320c().mo5835h();
            h.fireAddUserwordOperation(trim, trim, 3);
            h.processEvent();
        }
        if (f13782e == 0) {
            this.f13783f.mo10257a(trim);
            this.f13784g.invalidateViews();
        } else if (f13782e == 2) {
            m14147a((int) R.string.usr_word_already_has);
        } else {
            m14147a((int) R.string.usr_word_add_failed);
        }
    }

    /* renamed from: j */
    private void m14173j() {
        this.f13791n = findViewById(R.id.bottom_bar);
        if (this.f13791n != null) {
            this.f13791n.setVisibility(8);
        }
        this.f13790m = (ImageButton) findViewById(R.id.edit);
        if (this.f13790m != null) {
            this.f13790m.setOnClickListener(new C3226ek(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14151a(boolean z) {
        int i;
        int i2 = 0;
        this.f13793p = z;
        if (z) {
            mo10030a();
            i = 4;
        } else {
            i2 = 8;
            i = 0;
        }
        if (this.f13791n != null) {
            this.f13791n.setVisibility(i2);
        }
        if (this.f13789l != null) {
            this.f13789l.setVisibility(i);
        }
        if (this.f13790m != null) {
            if (this.f13793p) {
                this.f13790m.setImageResource(R.drawable.usr_word_back);
            } else {
                this.f13790m.setImageResource(R.drawable.usr_word_edit);
            }
        }
        if (this.f13783f != null) {
            this.f13783f.mo10258a(z);
        }
        if (this.f13784g != null) {
            this.f13784g.invalidateViews();
        }
    }

    /* renamed from: k */
    private void m14175k() {
        this.f13787j = (Button) findViewById(R.id.delete_btn);
        if (this.f13787j != null) {
            this.f13787j.setOnClickListener(new C3218ec(this));
        }
    }

    /* renamed from: l */
    private void m14176l() {
        this.f13784g = (ListView) findViewById(R.id.usr_word_list);
        this.f13784g.setVerticalFadingEdgeEnabled(false);
        this.f13783f = new C3134cc(this);
        this.f13783f.mo10255a((C3133cb) this);
        this.f13783f.mo10256a(this.f13798u);
        this.f13784g.setAdapter(this.f13783f);
    }

    /* renamed from: b */
    private void m14156b(String str) {
        String[] c = m14160c(str);
        if (c != null) {
            this.f13783f.mo10259a(c);
            if (this.f13784g != null) {
                this.f13784g.invalidateViews();
            }
        }
    }

    /* renamed from: c */
    private String[] m14160c(String str) {
        if (Engine.isInitialized()) {
            return C1368X.m6320c().mo5835h().getEditableUserWordList(str);
        }
        Toast.makeText(this, getResString(R.string.usr_dict_busy), 1).show();
        return null;
    }

    /* renamed from: a */
    public void mo10030a() {
        this.f13792o = this.f13783f.mo10263b();
        m14157b(this.f13792o);
    }

    /* renamed from: b */
    private void m14157b(boolean z) {
        int i;
        if (!z) {
            i = R.string.usr_word_editor_selecte_all;
        } else {
            i = R.string.usr_word_editor_unselecte_all;
        }
        if (this.f13788k != null) {
            this.f13788k.setText(getResString(i));
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f13793p) {
            return super.onKeyDown(i, keyEvent);
        }
        m14151a(false);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m14153b(int i) {
        return i;
    }
}
