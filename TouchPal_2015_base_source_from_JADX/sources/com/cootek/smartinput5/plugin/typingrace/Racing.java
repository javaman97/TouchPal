package com.cootek.smartinput5.plugin.typingrace;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2244E;
import com.cootek.smartinput5.net.cmd.C2256M;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;
import java.util.Formatter;

public class Racing extends C1976b {

    /* renamed from: a */
    public static final String f10640a = "cootek.smartinput";

    /* renamed from: b */
    public static final String f10641b = "RACING_TEXT";

    /* renamed from: c */
    public static final String f10642c = "amlhbmcuemh1QGNvb3Rlay5jb207aSBsb3ZlIGNvb3Rlaw==";

    /* renamed from: d */
    public static final long f10643d = 1000;

    /* renamed from: e */
    public static final long f10644e = 1000;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public AlertDialog f10645A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f10646B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public String f10647C;

    /* renamed from: f */
    private ImageView f10648f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f10649g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f10650h;

    /* renamed from: i */
    private TextView f10651i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ForegroundColorSpan f10652j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ForegroundColorSpan f10653k;

    /* renamed from: l */
    private ForegroundColorSpan f10654l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Handler f10655m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Runnable f10656n;

    /* renamed from: o */
    private Runnable f10657o;

    /* renamed from: p */
    private long f10658p = 0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f10659q = 0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f10660r = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f10661s = false;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f10662t = false;

    /* renamed from: u */
    private final String f10663u = PresentConfigXmlTag.TOAST_ATTR_START_TIME;

    /* renamed from: v */
    private final String f10664v = PresentConfigXmlTag.TOAST_ATTR_END_TIME;

    /* renamed from: w */
    private final String f10665w = "isFinished";

    /* renamed from: x */
    private final String f10666x = "isShortcutInput";

    /* renamed from: y */
    private final String f10667y = "isOldActivity";
    /* access modifiers changed from: private */

    /* renamed from: z */
    public PopupWindow f10668z;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f10658p = bundle.getLong(PresentConfigXmlTag.TOAST_ATTR_START_TIME);
            this.f10659q = bundle.getLong(PresentConfigXmlTag.TOAST_ATTR_END_TIME);
            this.f10660r = bundle.getBoolean("isFinished");
            this.f10661s = bundle.getBoolean("isShortcutInput");
            this.f10662t = bundle.getBoolean("isOldActivity");
        }
        String stringExtra = getIntent().getStringExtra(f10641b);
        requestWindowFeature(1);
        setContentView(R.layout.race_racing);
        this.f10652j = new ForegroundColorSpan(getResources().getColor(R.color.correct_span));
        this.f10653k = new ForegroundColorSpan(getResources().getColor(R.color.incorrect_span));
        this.f10654l = new ForegroundColorSpan(getResources().getColor(R.color.progress_span));
        this.f10648f = (ImageView) findViewById(R.id.buttonPause);
        this.f10650h = (TextView) findViewById(R.id.sampleTextView);
        this.f10649g = (TextView) findViewById(R.id.userTextView);
        this.f10651i = (TextView) findViewById(R.id.watchTextView);
        this.f10650h.setMovementMethod(ScrollingMovementMethod.getInstance());
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f10650h.setText(stringExtra, TextView.BufferType.SPANNABLE);
        }
        this.f10649g.addTextChangedListener(new C2447c(this, (C2455h) null));
        this.f10651i.setText("", TextView.BufferType.EDITABLE);
        this.f10655m = new Handler();
        this.f10656n = new C2455h(this);
        this.f10657o = new C2456i(this);
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        inputMethodManager.toggleSoftInput(0, 2);
        for (InputMethodInfo next : inputMethodManager.getEnabledInputMethodList()) {
            next.getId();
            if (next.getId().contains(f10640a)) {
                break;
            }
        }
        this.f10648f.setOnClickListener(new C2457j(this));
        m11096d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f10655m.removeCallbacks(this.f10656n);
        this.f10655m.postDelayed(this.f10656n, 1000);
        if (this.f10660r && this.f10662t) {
            this.f10655m.removeCallbacks(this.f10657o);
            this.f10655m.postDelayed(this.f10657o, 1000);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        if (this.f10668z != null) {
            this.f10668z.dismiss();
        }
        this.f10655m.removeCallbacks(this.f10656n);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("isFinished", this.f10660r);
        bundle.putLong(PresentConfigXmlTag.TOAST_ATTR_END_TIME, this.f10659q);
        bundle.putBoolean("isShortcutInput", this.f10661s);
        bundle.putLong(PresentConfigXmlTag.TOAST_ATTR_START_TIME, this.f10658p);
        bundle.putBoolean("isOldActivity", true);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.f10655m.removeCallbacks(this.f10657o);
        this.f10655m.removeCallbacks(this.f10656n);
        System.gc();
        super.onStop();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m11087a() {
        return C2442R.m11077a((Context) this).contains(f10640a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11091b() {
        C2443a aVar = new C2443a(getLayoutInflater().inflate(R.layout.race_pause_menu, (ViewGroup) null));
        aVar.setWidth(-1);
        aVar.setHeight(-2);
        aVar.setBackgroundDrawable(new ColorDrawable(0));
        aVar.setAnimationStyle(R.style.RaceMenu);
        try {
            aVar.showAtLocation(getWindow().getDecorView(), 0, 0, 0);
        } catch (RuntimeException e) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11095c() {
        this.f10668z = new C2444b(getLayoutInflater().inflate(R.layout.race_submit, (ViewGroup) null));
        this.f10668z.setWidth(-1);
        this.f10668z.setHeight(-1);
        this.f10668z.setFocusable(true);
        this.f10668z.setBackgroundDrawable(new ColorDrawable(0));
        this.f10668z.setAnimationStyle(R.style.RaceMenu);
        this.f10668z.setOnDismissListener(new C2458k(this));
        try {
            this.f10668z.showAtLocation(getWindow().getDecorView(), 0, 0, 0);
        } catch (RuntimeException e) {
        }
    }

    /* renamed from: d */
    private void m11096d() {
        if (!this.f10662t) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f10658p = currentTimeMillis;
            this.f10659q = currentTimeMillis;
        }
        this.f10660r = this.f10660r;
        this.f10661s = this.f10661s;
        this.f10649g.setText("");
        this.f10656n.run();
    }

    /* renamed from: a */
    private Editable m11083a(Editable editable) {
        long j = (this.f10659q - this.f10658p) / 1000;
        new Formatter(editable).format("%02d:%02d", new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)});
        return editable;
    }

    /* renamed from: b */
    private Editable m11090b(Editable editable) {
        int length = editable.length();
        String valueOf = String.valueOf(m11100f());
        editable.append(valueOf).append("/").append(String.valueOf(this.f10650h.length()));
        editable.setSpan(this.f10654l, length, valueOf.length() + length, 0);
        return editable;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m11099e() {
        Editable editable = (Editable) this.f10651i.getText();
        editable.clear();
        m11083a(editable).append(C0911j.f2473c);
        m11090b(editable);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public int m11100f() {
        int i = 0;
        while (i < this.f10650h.length() && i < this.f10649g.length() && this.f10650h.getText().charAt(i) == this.f10649g.getText().charAt(i)) {
            i++;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public float m11102g() {
        if (this.f10661s) {
            return 1.0f;
        }
        long j = this.f10659q - this.f10658p;
        if (0 == j) {
            return 0.0f;
        }
        return ((((float) m11100f()) * 1000.0f) * 60.0f) / ((float) j);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public String m11105h() {
        return getResString(R.string.race_score_format, Float.valueOf(m11102g()));
    }

    /* renamed from: com.cootek.smartinput5.plugin.typingrace.Racing$c */
    private final class C2447c implements TextWatcher {
        private C2447c() {
        }

        /* synthetic */ C2447c(Racing racing, C2455h hVar) {
            this();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            int h = Racing.this.m11100f();
            Spannable spannable = (Spannable) Racing.this.f10650h.getText();
            Spannable spannable2 = (Spannable) Racing.this.f10649g.getText();
            spannable.removeSpan(Racing.this.f10652j);
            spannable2.removeSpan(Racing.this.f10652j);
            if (h > 0) {
                spannable.setSpan(Racing.this.f10652j, 0, h, 0);
                spannable2.setSpan(Racing.this.f10652j, 0, h, 0);
            }
            spannable.removeSpan(Racing.this.f10653k);
            int min = Math.min(Racing.this.f10650h.length(), Racing.this.f10649g.length());
            if (h < min) {
                spannable.setSpan(Racing.this.f10653k, h, min, 0);
            }
            spannable2.removeSpan(Racing.this.f10653k);
            if (h < Racing.this.f10649g.length()) {
                spannable2.setSpan(Racing.this.f10653k, h, Racing.this.f10649g.length(), 0);
            }
            Layout layout = Racing.this.f10650h.getLayout();
            if (layout != null) {
                int max = Math.max(0, layout.getLineForOffset(h) - 1);
                Racing.this.f10650h.scrollTo((int) layout.getLineLeft(max), layout.getLineTop(max) - layout.getLineTop(0));
            }
            Racing.this.f10655m.removeCallbacks(Racing.this.f10656n);
            Racing.this.f10655m.post(Racing.this.f10656n);
            boolean unused = Racing.this.f10661s = Racing.this.f10649g.getText().toString().equals(Racing.f10640a);
            if (Racing.this.f10660r && Racing.this.f10662t) {
                return;
            }
            if (Racing.this.f10661s || Racing.this.m11100f() == Racing.this.f10650h.length()) {
                boolean unused2 = Racing.this.f10660r = true;
                Racing.this.m11095c();
            }
        }
    }

    /* renamed from: com.cootek.smartinput5.plugin.typingrace.Racing$a */
    private final class C2443a extends PopupWindow {

        /* renamed from: b */
        private Button f10670b;

        /* renamed from: c */
        private Button f10671c;

        /* renamed from: d */
        private ImageView f10672d;

        public C2443a(View view) {
            super(view);
            this.f10670b = (Button) view.findViewById(R.id.buttonRetry);
            this.f10671c = (Button) view.findViewById(R.id.buttonExit);
            this.f10672d = (ImageView) view.findViewById(R.id.buttonClose);
            setOutsideTouchable(true);
            setTouchInterceptor(new C2459l(this, Racing.this));
            this.f10670b.setOnClickListener(new C2460m(this, Racing.this));
            this.f10671c.setOnClickListener(new C2462o(this, Racing.this));
            this.f10672d.setOnClickListener(new C2465r(this, Racing.this));
        }
    }

    /* renamed from: com.cootek.smartinput5.plugin.typingrace.Racing$b */
    private class C2444b extends PopupWindow {

        /* renamed from: b */
        private Button f10674b;

        /* renamed from: c */
        private Button f10675c;

        /* renamed from: d */
        private Button f10676d;

        /* renamed from: e */
        private Button f10677e;

        /* renamed from: f */
        private TextView f10678f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public TextView f10679g;

        /* renamed from: h */
        private TextView f10680h;

        /* renamed from: i */
        private TextView f10681i;

        public C2444b(View view) {
            super(view);
            this.f10674b = (Button) view.findViewById(R.id.buttonSubmit);
            this.f10675c = (Button) view.findViewById(R.id.buttonRetry);
            this.f10676d = (Button) view.findViewById(R.id.buttonExit);
            this.f10677e = (Button) view.findViewById(R.id.buttonClose);
            this.f10678f = (TextView) view.findViewById(R.id.scoreTextView);
            this.f10679g = (TextView) view.findViewById(R.id.nameEdit);
            this.f10680h = (TextView) view.findViewById(R.id.mobileEdit);
            this.f10681i = (TextView) view.findViewById(R.id.emailEdit);
            this.f10674b.setOnClickListener(new C2466s(this, Racing.this));
            this.f10675c.setOnClickListener(new C2467t(this, Racing.this));
            this.f10676d.setOnClickListener(new C2470w(this, Racing.this));
            this.f10677e.setOnClickListener(new C2473z(this, Racing.this));
            this.f10678f.setText(Racing.this.getResString(R.string.race_score_description, Racing.this.m11105h()));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m11118a() {
            String charSequence = this.f10679g.getText().toString();
            String charSequence2 = this.f10681i.getText().toString();
            String charSequence3 = this.f10680h.getText().toString();
            if (TextUtils.isEmpty(charSequence) || TextUtils.isEmpty(charSequence2) || TextUtils.isEmpty(charSequence3)) {
                Toast.makeText(Racing.this, R.string.race_personal_information_not_filled, 1).show();
                return;
            }
            C2256M m = new C2256M();
            m.f9670a = String.valueOf(Racing.this.m11102g());
            m.f9671b = charSequence;
            m.f9672c = String.valueOf(System.currentTimeMillis() / 1000);
            m.f9673d = C2442R.m11079a(new String[]{m.f9670a, m.f9671b, m.f9672c}, Racing.f10642c);
            m.f9674e = charSequence2;
            m.f9675f = charSequence3;
            new C2373x(m).mo8060a((C2373x.C2376b) new C2446b(this, (C2455h) null));
            AlertDialog unused = Racing.this.f10645A = new C2894d.C2895a(Racing.this).setTitle(C1974m.m9063a((Context) Racing.this, (int) R.string.race_submit_score)).setMessage(C1974m.m9063a((Context) Racing.this, (int) R.string.race_waiting)).setNegativeButton(C1974m.m9063a((Context) Racing.this, (int) R.string.race_cancel), new C2424A(this)).show();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m11120b() {
            C2244E e = new C2244E();
            e.f9532d.add("top");
            new C2373x(e).mo8060a((C2373x.C2376b) new C2445a(this, (C2455h) null));
            AlertDialog unused = Racing.this.f10645A = new C2894d.C2895a(Racing.this).setTitle(C1974m.m9063a((Context) Racing.this, (int) R.string.race_obtain_rank_list)).setMessage(C1974m.m9063a((Context) Racing.this, (int) R.string.race_waiting)).setNegativeButton(C1974m.m9063a((Context) Racing.this, (int) R.string.race_cancel), new C2425B(this)).show();
        }

        /* renamed from: com.cootek.smartinput5.plugin.typingrace.Racing$b$b */
        private final class C2446b implements C2373x.C2376b {
            private C2446b() {
            }

            /* synthetic */ C2446b(C2444b bVar, C2455h hVar) {
                this();
            }

            /* renamed from: a */
            public void mo4601a(C2259P p) {
                if (Racing.this.f10645A != null) {
                    Racing.this.f10645A.dismiss();
                    AlertDialog unused = Racing.this.f10645A = null;
                    C2256M m = (C2256M) p;
                    int unused2 = Racing.this.f10646B = m.f9676g;
                    String unused3 = Racing.this.f10647C = !TextUtils.isEmpty(m.f9678i) ? m.f9678i : m.f9670a;
                    if (200 == p.f9746O && m.f9676g > 0 && m.f9677h > 0) {
                        C2444b.this.m11120b();
                    } else if (p.f9746O == 0) {
                        Toast.makeText(Racing.this, C1974m.m9063a((Context) Racing.this, (int) R.string.race_connect_server_failed), 1).show();
                    } else if (406 == p.f9746O) {
                        Toast.makeText(Racing.this, C1974m.m9063a((Context) Racing.this, (int) R.string.race_score_not_acceptable_by_server), 1).show();
                    } else if (409 == p.f9746O) {
                        new C2894d.C2895a(Racing.this).setTitle(C1974m.m9063a((Context) Racing.this, (int) R.string.race_submit_score)).setMessage(C1974m.m9063a((Context) Racing.this, (int) R.string.race_score_not_better_than_before)).setNegativeButton(C1974m.m9063a((Context) Racing.this, (int) R.string.race_ok), new C2426C(this)).show();
                    } else {
                        Toast.makeText(Racing.this, C1974m.m9063a((Context) Racing.this, (int) R.string.race_cannot_obtain_information), 1).show();
                    }
                }
            }

            /* renamed from: b */
            public void mo4602b(C2259P p) {
            }
        }

        /* renamed from: com.cootek.smartinput5.plugin.typingrace.Racing$b$a */
        private final class C2445a implements C2373x.C2376b {
            private C2445a() {
            }

            /* synthetic */ C2445a(C2444b bVar, C2455h hVar) {
                this();
            }

            /* renamed from: a */
            public void mo4601a(C2259P p) {
                if (Racing.this.f10645A != null) {
                    Racing.this.f10645A.dismiss();
                    AlertDialog unused = Racing.this.f10645A = null;
                    C2244E e = (C2244E) p;
                    if (e.f9535g != null && e.f9537i != null && e.f9535g.size() > 0 && e.f9537i.size() > 0) {
                        Intent intent = new Intent(Racing.this, RankList.class);
                        intent.putExtra(RankList.f10685a, e.f9535g);
                        intent.putExtra(RankList.f10686b, e.f9536h);
                        intent.putExtra(RankList.f10687c, e.f9537i);
                        intent.putExtra(RankList.f10688d, C2444b.this.f10679g.getText().toString());
                        intent.putExtra(RankList.f10689e, Racing.this.f10646B);
                        intent.putExtra(RankList.f10690f, Racing.this.f10647C);
                        Racing.this.startActivity(intent);
                        Racing.this.f10668z.dismiss();
                        Racing.this.finish();
                    } else if (p.f9746O == 0) {
                        Toast.makeText(Racing.this, C1974m.m9063a((Context) Racing.this, (int) R.string.race_connect_server_failed), 1).show();
                    } else {
                        Toast.makeText(Racing.this, C1974m.m9063a((Context) Racing.this, (int) R.string.race_cannot_obtain_information), 1).show();
                    }
                }
            }

            /* renamed from: b */
            public void mo4602b(C2259P p) {
            }
        }
    }
}
