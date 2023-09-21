package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.p066ui.control.C2869n;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.H */
/* compiled from: CustomAlertDialog */
public class C2618H {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2619a f11273a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f11274b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f11275c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f11276d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f11277e = true;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Runnable f11278f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Runnable f11279g;

    public C2618H(Context context) {
        this.f11273a = new C2619a(context, true, true);
        this.f11274b = context;
    }

    /* renamed from: a */
    public void mo8568a(int i) {
        mo8572a(this.f11274b.getResources().getString(i));
    }

    /* renamed from: a */
    public void mo8572a(String str) {
        this.f11273a.mo9528a((CharSequence) str);
    }

    /* renamed from: b */
    public void mo8577b(int i) {
        this.f11273a.mo9532b((CharSequence) this.f11274b.getString(i));
    }

    /* renamed from: c */
    public void mo8583c(int i) {
        mo8580b(this.f11274b.getResources().getString(i));
    }

    /* renamed from: a */
    public void mo8573a(String str, int i) {
        int unused = this.f11273a.f11287h = i;
        String unused2 = this.f11273a.f11286g = str;
    }

    /* renamed from: b */
    public void mo8580b(String str) {
        this.f11273a.mo8589a(str);
    }

    /* renamed from: d */
    public void mo8585d(int i) {
        mo8584c(this.f11274b.getResources().getString(i));
    }

    /* renamed from: c */
    public void mo8584c(String str) {
        this.f11273a.mo8592b(str);
    }

    /* renamed from: e */
    public void mo8586e(int i) {
        this.f11273a.mo8593c(i);
    }

    /* renamed from: f */
    public void mo8587f(int i) {
        this.f11273a.mo8594c(this.f11274b.getString(i));
    }

    /* renamed from: a */
    public void mo8569a(int i, View.OnClickListener onClickListener) {
        mo8574a(this.f11274b.getResources().getString(i), onClickListener);
    }

    /* renamed from: a */
    public void mo8574a(String str, View.OnClickListener onClickListener) {
        this.f11275c = true;
        mo8570a(this.f11273a.mo8596d_(), str, onClickListener);
    }

    /* renamed from: a */
    public void mo8570a(Button button, String str, View.OnClickListener onClickListener) {
        button.setText(str);
        button.setOnClickListener(new C2622I(this, onClickListener));
    }

    /* renamed from: b */
    public void mo8578b(int i, View.OnClickListener onClickListener) {
        mo8581b(this.f11274b.getResources().getString(i), onClickListener);
    }

    /* renamed from: b */
    public void mo8581b(String str, View.OnClickListener onClickListener) {
        this.f11276d = true;
        mo8570a(this.f11273a.mo8595d(), str, onClickListener);
    }

    /* renamed from: a */
    public void mo8571a(Runnable runnable) {
        this.f11278f = runnable;
    }

    /* renamed from: b */
    public void mo8579b(Runnable runnable) {
        this.f11279g = runnable;
    }

    /* renamed from: a */
    public void mo8575a(boolean z) {
        this.f11277e = z;
    }

    /* renamed from: a */
    public void mo8567a() {
        this.f11273a.mo7053a();
    }

    /* renamed from: b */
    public void mo8582b(boolean z) {
        this.f11273a.mo8590a(z);
        mo8567a();
    }

    /* renamed from: b */
    public void mo8576b() {
        if (this.f11273a != null) {
            this.f11273a.mo9534b_();
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.H$a */
    /* compiled from: CustomAlertDialog */
    class C2619a extends C2869n {

        /* renamed from: b */
        private String f11281b;

        /* renamed from: c */
        private String f11282c;

        /* renamed from: d */
        private int f11283d;

        /* renamed from: e */
        private String f11284e;

        /* renamed from: f */
        private boolean f11285f = false;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f11286g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f11287h;

        public C2619a(Context context, boolean z, boolean z2) {
            super(context, z, z2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e_ */
        public boolean mo8598e_() {
            return C2618H.this.f11277e;
        }

        /* renamed from: a */
        public void mo7053a() {
            if (!mo9536c_()) {
                View inflate = ((LayoutInflater) mo9539i().getSystemService("layout_inflater")).inflate(R.layout.custom_alter_dialog, (ViewGroup) null, false);
                TextView textView = (TextView) inflate.findViewById(R.id.message);
                if (textView != null) {
                    if (TextUtils.isEmpty(this.f11281b)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                        textView.setText(this.f11281b);
                        if (!TextUtils.isEmpty(this.f11286g)) {
                            C1584bI.m7136a(textView, this.f11286g, this.f11287h);
                        }
                    }
                }
                TextView textView2 = (TextView) inflate.findViewById(R.id.attached_message);
                if (this.f11285f) {
                    if (!(textView2 == null || this.f11282c == null)) {
                        textView2.setText(this.f11282c);
                        textView2.setGravity(17);
                        if (textView != null) {
                            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), 0);
                        }
                    }
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
                ImageView imageView = (ImageView) inflate.findViewById(R.id.msg_image);
                if (imageView != null) {
                    if (this.f11283d == 0) {
                        imageView.setVisibility(8);
                    } else {
                        imageView.setVisibility(0);
                        imageView.setImageResource(this.f11283d);
                    }
                }
                TextView textView3 = (TextView) inflate.findViewById(R.id.msg_image_title);
                if (textView3 != null) {
                    if (TextUtils.isEmpty(this.f11284e)) {
                        textView3.setVisibility(8);
                    } else {
                        textView3.setVisibility(0);
                        textView3.setText(this.f11284e);
                    }
                }
                ScrollView scrollView = new ScrollView(C2618H.this.f11274b);
                scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                scrollView.addView(inflate);
                mo9526a((View) scrollView);
                if (!C2618H.this.f11276d) {
                    mo8595d().setVisibility(8);
                } else if (!C2618H.this.f11275c) {
                    mo8596d_().setVisibility(8);
                }
                this.f11285f = false;
                super.mo7053a();
            }
        }

        /* renamed from: a */
        public void mo8588a(int i) {
            mo8589a(C2618H.this.f11274b.getString(i));
        }

        /* renamed from: a */
        public void mo8589a(String str) {
            this.f11281b = str;
        }

        /* renamed from: b */
        public void mo8591b(int i) {
            mo8589a(C2618H.this.f11274b.getString(i));
        }

        /* renamed from: b */
        public void mo8592b(String str) {
            this.f11282c = str;
        }

        /* renamed from: c */
        public void mo8593c(int i) {
            this.f11283d = i;
        }

        /* renamed from: c */
        public void mo8594c(String str) {
            this.f11284e = str;
        }

        /* renamed from: d_ */
        public Button mo8596d_() {
            return super.mo8596d_();
        }

        /* renamed from: d */
        public Button mo8595d() {
            return super.mo8595d();
        }

        /* renamed from: a */
        public void mo8590a(boolean z) {
            this.f11285f = z;
        }

        /* renamed from: e */
        public void mo8597e() {
            if (C2618H.this.f11278f != null) {
                C2618H.this.f11278f.run();
            }
        }

        /* renamed from: f */
        public void mo8599f() {
            if (C2618H.this.f11279g != null) {
                C2618H.this.f11279g.run();
            }
        }
    }
}
