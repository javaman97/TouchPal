package com.cootek.smartinput5.p066ui.guideintro;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2212ab;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.guideintro.InputStyleSelector */
public class InputStyleSelector extends LinearLayout {

    /* renamed from: a */
    private static final String f13231a = "InputStyleSelector";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f13232b;

    /* renamed from: c */
    private ImageView f13233c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public RelativeLayout f13234d;

    /* renamed from: e */
    private TextView f13235e;

    /* renamed from: f */
    private TextView f13236f;

    /* renamed from: g */
    private LinearLayout f13237g;

    /* renamed from: h */
    private ProgressBar f13238h;

    /* renamed from: i */
    private ImageView f13239i;

    /* renamed from: j */
    private View f13240j;

    /* renamed from: k */
    private ImageView f13241k;

    /* renamed from: l */
    private int f13242l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f13243m;

    /* renamed from: n */
    private String f13244n;

    /* renamed from: o */
    private int f13245o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f13246p;

    /* renamed from: q */
    private boolean f13247q;

    /* renamed from: r */
    private AlertDialog f13248r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public View.OnClickListener f13249s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public View.OnClickListener f13250t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C2212ab.C2213a f13251u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C2212ab f13252v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C2212ab.C2213a f13253w = new C2923b(this);

    public InputStyleSelector(Context context) {
        super(context);
        this.f13232b = context;
        m13512g();
    }

    public InputStyleSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13232b = context;
        m13512g();
    }

    /* renamed from: g */
    private void m13512g() {
        View view;
        try {
            view = LayoutInflater.from(this.f13232b).inflate(R.layout.input_style_selector, (ViewGroup) null);
        } catch (Exception e) {
            view = null;
        }
        if (view != null) {
            addView(view);
            this.f13252v = new C2212ab(this.f13232b, this.f13253w);
            this.f13233c = (ImageView) findViewById(R.id.image_view);
            this.f13234d = (RelativeLayout) findViewById(R.id.image_layout);
            this.f13235e = (TextView) findViewById(R.id.title_text);
            this.f13236f = (TextView) findViewById(R.id.image_msg_text);
            this.f13237g = (LinearLayout) findViewById(R.id.image_msg_view);
            this.f13238h = (ProgressBar) findViewById(R.id.image_progress_bar);
            this.f13239i = (ImageView) findViewById(R.id.more_icon);
            this.f13240j = findViewById(R.id.title_line);
            this.f13241k = (ImageView) findViewById(R.id.selected_icon);
            this.f13234d.setOnClickListener(new C2924c(this));
            this.f13240j.setOnClickListener(new C2925d(this));
            C2894d.C2895a aVar = new C2894d.C2895a(this.f13232b);
            aVar.setPositiveButton(C1974m.m9063a(this.f13232b, (int) R.string.ok), new C2926e(this));
            aVar.setNegativeButton(C1974m.m9063a(this.f13232b, (int) R.string.no), (DialogInterface.OnClickListener) null);
            this.f13248r = aVar.create();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m13514h() {
        m13503a(false, 0);
        this.f13246p = false;
        if (this.f13248r != null) {
            this.f13248r.dismiss();
        }
        mo9695e();
    }

    /* renamed from: a */
    public void mo9689a() {
        if (!C2922a.f13254a.equals(this.f13243m)) {
            if (!this.f13246p && !C2922a.m13530b(this.f13243m)) {
                C1584bI.m7131a(this.f13232b, (Runnable) new C2927f(this), (Runnable) new C2928g(this), false);
            } else if (this.f13246p) {
                mo9694d();
            }
            setViewSelected(true);
        }
    }

    /* renamed from: b */
    public boolean mo9692b() {
        return this.f13246p;
    }

    /* renamed from: c */
    public void mo9693c() {
        if (this.f13252v != null) {
            this.f13252v.mo7663e();
        }
    }

    /* renamed from: d */
    public void mo9694d() {
        if (this.f13248r != null) {
            String a = C2922a.m13528a(this.f13232b, this.f13243m);
            if (a == null) {
                a = "";
            }
            this.f13248r.setMessage(String.format(C1974m.m9063a(this.f13232b, (int) R.string.download_apk_cancel), new Object[]{a}));
            this.f13248r.show();
        }
    }

    public void setWidth(int i) {
        this.f13242l = i;
    }

    /* renamed from: i */
    private void m13516i() {
        int paddingLeft = this.f13242l - (this.f13234d != null ? this.f13234d.getPaddingLeft() + this.f13234d.getPaddingRight() : 0);
        if (this.f13233c != null && paddingLeft > 0) {
            Drawable drawable = this.f13233c.getDrawable();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                int i = (paddingLeft * intrinsicHeight) / intrinsicWidth;
                this.f13233c.getLayoutParams().height = i;
                if (this.f13241k != null) {
                    this.f13241k.getLayoutParams().height = i;
                }
            }
        }
    }

    private void setMoreIconVisible(boolean z) {
        if (this.f13239i == null) {
            return;
        }
        if (z) {
            this.f13239i.setImageResource(R.drawable.input_style_more_icon);
            this.f13239i.setVisibility(0);
            return;
        }
        this.f13239i.setVisibility(8);
    }

    /* renamed from: a */
    public void mo9690a(String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, C2212ab.C2213a aVar) {
        this.f13243m = str;
        this.f13244n = C2922a.m13533e(str);
        this.f13245o = C2922a.m13534f(str);
        this.f13249s = onClickListener;
        this.f13251u = aVar;
        this.f13250t = onClickListener2;
        setMoreIconVisible(this.f13250t != null);
        mo9695e();
    }

    /* renamed from: e */
    public void mo9695e() {
        int a;
        if (this.f13235e != null) {
            this.f13235e.setText(C2922a.m13528a(this.f13232b, this.f13243m));
        }
        if (this.f13236f != null && !this.f13246p) {
            if (C2922a.f13254a.equals(this.f13243m) || C2922a.m13530b(this.f13243m)) {
                m13505b(false);
            } else {
                m13505b(true);
            }
        }
        if (!(this.f13233c == null || (a = C2922a.m13526a(this.f13243m)) == 0)) {
            this.f13233c.setImageResource(a);
        }
        setViewSelected(C2922a.m13532d(this.f13243m));
        m13516i();
    }

    /* access modifiers changed from: private */
    public void setViewSelected(boolean z) {
        int i = 0;
        this.f13247q = z;
        if (this.f13241k != null) {
            this.f13241k.setVisibility(z ? 0 : 8);
        }
        if (this.f13234d != null) {
            RelativeLayout relativeLayout = this.f13234d;
            if (z) {
                i = this.f13232b.getResources().getColor(R.color.guide_intro_select_bg_color);
            }
            relativeLayout.setBackgroundColor(i);
        }
        if (z) {
            C2922a.m13531c(this.f13243m);
        }
    }

    /* renamed from: f */
    public boolean mo9696f() {
        return this.f13247q;
    }

    public String getInputStyleKey() {
        return this.f13243m;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo9691a(boolean z) {
        boolean z2;
        boolean z3 = true;
        setEnabled(!z);
        if (this.f13234d != null) {
            RelativeLayout relativeLayout = this.f13234d;
            if (!z) {
                z2 = true;
            } else {
                z2 = false;
            }
            relativeLayout.setEnabled(z2);
            if (Build.VERSION.SDK_INT < 11) {
                int i = z ? Settings.CLOUD_HANDWRITING_ENABLED : 255;
                if (this.f13233c != null) {
                    if (this.f13233c.getDrawable() != null) {
                        this.f13233c.getDrawable().setAlpha(i);
                    }
                    if (this.f13233c.getBackground() != null) {
                        this.f13233c.getBackground().setAlpha(i);
                    }
                }
            } else {
                this.f13234d.setAlpha(z ? 0.5f : 1.0f);
            }
        }
        if (this.f13240j != null) {
            View view = this.f13240j;
            if (z) {
                z3 = false;
            }
            view.setEnabled(z3);
        }
    }

    /* renamed from: b */
    private void m13505b(boolean z) {
        if (this.f13236f != null && this.f13237g != null && this.f13238h != null) {
            if (z) {
                this.f13237g.setVisibility(0);
                this.f13236f.setVisibility(0);
                this.f13238h.setVisibility(8);
                return;
            }
            this.f13237g.setVisibility(8);
            this.f13236f.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13503a(boolean z, int i) {
        if (this.f13236f != null && this.f13237g != null && this.f13238h != null) {
            this.f13238h.setProgress(i);
            if (z) {
                this.f13237g.setVisibility(0);
                this.f13236f.setVisibility(8);
                this.f13238h.setVisibility(0);
                this.f13238h.invalidate();
                return;
            }
            this.f13237g.setVisibility(8);
            this.f13238h.setVisibility(8);
        }
    }
}
