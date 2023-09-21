package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput.p044a.C0964c;
import com.cootek.smartinput.p044a.C0978q;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.HighFreqSettings;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2878v;
import com.emoji.keyboard.touchpal.C3305b;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;
import java.io.ByteArrayOutputStream;

/* renamed from: com.cootek.smartinput5.ui.VoiceView */
public class VoiceView extends LinearLayout implements C0964c {

    /* renamed from: e */
    private static final String f11938e = "VoiceView";

    /* renamed from: h */
    private static final int f11939h = 5000;

    /* renamed from: i */
    private static final int f11940i = 15000;

    /* renamed from: j */
    private static final int f11941j = 1;

    /* renamed from: k */
    private static final int f11942k = 2;

    /* renamed from: l */
    private static final int f11943l = 0;

    /* renamed from: m */
    private static final int f11944m = 1;

    /* renamed from: n */
    private static final int f11945n = 2;

    /* renamed from: o */
    private static final int f11946o = 3;

    /* renamed from: p */
    private static final int f11947p = 4;

    /* renamed from: q */
    private static final int f11948q = 5;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static Context f11949r;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static VoiceView f11950y;

    /* renamed from: A */
    private boolean f11951A = false;

    /* renamed from: B */
    private Handler f11952B;

    /* renamed from: a */
    protected final int f11953a;

    /* renamed from: b */
    protected int f11954b;

    /* renamed from: c */
    protected int f11955c;

    /* renamed from: d */
    protected TypedArray f11956d;

    /* renamed from: f */
    private final int f11957f = SearchStatusData.RESPONSE_STATUS_SERVER_ERROR;

    /* renamed from: g */
    private final int f11958g = SearchStatusData.RESPONSE_STATUS_SERVER_ERROR;

    /* renamed from: s */
    private TextView f11959s;

    /* renamed from: t */
    private TextView f11960t;

    /* renamed from: u */
    private ImageView f11961u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public TextView f11962v;

    /* renamed from: w */
    private TextView f11963w;

    /* renamed from: x */
    private boolean f11964x;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f11965z = 0;

    /* renamed from: n */
    private void m12294n() {
        this.f11952B = new C2912dp(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m12287a(int i) {
        return C1974m.m9063a(f11949r, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo8881i() {
        C2900dd.m13357a(f11949r);
    }

    public VoiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = context.getResources().getDisplayMetrics().widthPixels;
        if (Engine.isInitialized()) {
            Engine instance = Engine.getInstance();
            if (!(instance.getWidgetManager() == null || instance.getWidgetManager().mo9648g() == null || instance.getWidgetManager().mo9648g().getKeyboard() == null)) {
                this.f11955c = Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9134g();
            }
        }
        this.f11956d = context.obtainStyledAttributes(attributeSet, C3305b.C3322q.SoftKeyboard);
        this.f11953a = C2878v.m13321a(this.f11956d, 5, i, 0);
        this.f11954b = C2878v.m13321a(this.f11956d, 6, this.f11955c, 0);
        m12289a(context);
        m12294n();
    }

    /* renamed from: a */
    private void m12289a(Context context) {
        f11950y = this;
        f11949r = context;
        mo3983h();
    }

    /* renamed from: h */
    public void mo3983h() {
        int i = 0;
        this.f11959s = (TextView) findViewById(R.id.vi_message);
        this.f11961u = (ImageView) findViewById(R.id.vi_meter);
        this.f11960t = (TextView) findViewById(R.id.vi_mask_hint);
        if (this.f11960t != null) {
            this.f11964x = false;
            this.f11960t.setVisibility(4);
        }
        this.f11962v = (TextView) findViewById(R.id.vi_language_select_button);
        this.f11963w = (TextView) findViewById(R.id.vi_ifly_provider);
        if (this.f11963w != null) {
            if (C0978q.m5067c()) {
                this.f11963w.setVisibility(0);
            } else {
                this.f11963w.setVisibility(4);
            }
        }
        if (this.f11962v != null) {
            this.f11962v.setText(getSelectedLanuage());
            this.f11962v.setTextColor(-2302756);
            this.f11962v.setOnClickListener(new C2913dq(this));
            boolean z = !Engine.getInstance().getWidgetManager().mo9613S();
            TextView textView = this.f11962v;
            if (!z) {
                i = 4;
            }
            textView.setVisibility(i);
        }
    }

    private CharSequence getSelectedLanuage() {
        if (C0978q.m5067c()) {
            return C1368X.m6320c().mo5842o().mo5918G();
        }
        return C1368X.m6320c().mo5842o().mo5914D();
    }

    /* renamed from: o */
    private void m12295o() {
        if (!this.f11951A) {
            this.f11951A = true;
            this.f11952B.sendMessageDelayed(this.f11952B.obtainMessage(1), 5000);
        }
    }

    /* renamed from: p */
    private void m12296p() {
        this.f11951A = false;
        this.f11952B.removeMessages(1);
    }

    /* renamed from: q */
    private void m12297q() {
        this.f11952B.sendMessageDelayed(this.f11952B.obtainMessage(2), 15000);
    }

    /* renamed from: r */
    private void m12298r() {
        this.f11952B.removeMessages(2);
    }

    private void setMaskHintContent(int i) {
        setMaskHintContent(m12287a(i));
    }

    /* renamed from: j */
    public void mo8882j() {
        if (this.f11960t != null) {
            this.f11960t.setVisibility(4);
            this.f11964x = true;
        }
    }

    public void setMaskHintContent(String str) {
        if (this.f11960t != null && !this.f11964x && Engine.isInitialized() && Engine.getInstance().getWidgetManager().mo9612R()) {
            this.f11960t.setVisibility(0);
            this.f11960t.setText(str);
        }
    }

    public int getDisplayHeight() {
        int o = Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9193o();
        if (this.f11955c != o) {
            this.f11955c = o;
            this.f11954b = C2878v.m13321a(this.f11956d, 6, this.f11955c, 0);
        }
        return (int) (Engine.getInstance().getWidgetManager().mo9630ad().mo9251i() * ((double) this.f11954b));
    }

    public int getDisplayWidth() {
        return (int) (Engine.getInstance().getWidgetManager().mo9630ad().mo9250h() * ((double) this.f11953a));
    }

    /* renamed from: k */
    public void mo8883k() {
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        if (this.f11961u != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (ad.mo9250h() < 1.0d || ad.mo9253k() < 1.0d) {
                int min = Math.min(getDisplayWidth() / 3, getDisplayHeight() / 3);
                layoutParams.width = min;
                layoutParams.height = min;
            }
            this.f11961u.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: d */
    public void mo3979d() {
        this.f11965z = 4;
        if (this.f11959s != null) {
            this.f11959s.setText(m12287a((int) R.string.vi_to_listen));
        }
        if (this.f11961u != null) {
            this.f11961u.getBackground().setLevel(100);
        }
    }

    /* renamed from: a */
    public void mo3974a(float f) {
        int i = 10000;
        int i2 = 1;
        if (this.f11961u != null && f > 0.0f) {
            int i3 = (int) (500.0f * f);
            if (i3 <= 10000) {
                i = i3;
            }
            if (i > 4000) {
                m12296p();
                if (this.f11965z == 4) {
                    mo3980e();
                }
            } else if (this.f11965z == 1) {
                m12295o();
            }
            if (i != 0) {
                i2 = i;
            }
            this.f11961u.getBackground().setLevel(i2);
        }
    }

    /* renamed from: a */
    public void mo3975a(ByteArrayOutputStream byteArrayOutputStream, int i, int i2) {
        C2806cb b;
        m12296p();
        this.f11965z = 2;
        if (this.f11959s != null) {
            this.f11959s.setText(m12287a((int) R.string.vi_working));
        }
        if (Engine.isInitialized() && Engine.getInstance().getWidgetManager().mo9612R() && (b = Engine.getInstance().getWidgetManager().mo9646f().mo9182b("sk_sp")) != null) {
            ((SpaceKey) b).releasePress();
        }
        setMaskHintContent((int) R.string.vi_mask_no_need_pressing);
        m12297q();
    }

    /* renamed from: a */
    public void mo3973a() {
        m12298r();
        if (this.f11959s != null) {
            this.f11959s.setText(m12287a((int) R.string.vi_finished));
        }
        this.f11965z = 0;
        m12290a(0, 1);
    }

    /* renamed from: a */
    private boolean m12290a(int i, int i2) {
        if (!Engine.isInitialized() || !Engine.getInstance().getWidgetManager().mo9612R()) {
            return false;
        }
        Engine.getInstance().getWidgetManager().mo9625a((long) i, i2, 48);
        return true;
    }

    /* renamed from: b */
    public void mo3977b() {
        if (this.f11959s != null) {
            this.f11959s.setText("restore");
        }
        this.f11965z = 0;
    }

    /* renamed from: c */
    public void mo3978c() {
        m12296p();
        m12298r();
        this.f11965z = 5;
        if (this.f11959s != null) {
            this.f11959s.setText(m12287a((int) R.string.vi_initializing));
        }
    }

    /* renamed from: e */
    public void mo3980e() {
        this.f11965z = 1;
        this.f11951A = false;
        if (this.f11959s != null) {
            this.f11959s.setText(m12287a((int) R.string.vi_listening));
        }
        setMaskHintContent((int) R.string.vi_mask_release_commit);
        if (HighFreqSettings.getInstance().spaceLongpressState == 0) {
            Settings.getInstance().setIntSetting(Settings.SPACE_LONG_PRESS_TIP_STATE, 1);
        }
    }

    /* renamed from: f */
    public void mo3981f() {
        this.f11965z = 0;
        if (this.f11959s != null) {
            this.f11959s.setText(m12287a((int) R.string.vi_listened));
        }
    }

    /* renamed from: a */
    public boolean mo3976a(String str) {
        m12296p();
        m12298r();
        this.f11965z = 3;
        if (this.f11959s != null) {
            this.f11959s.setText(String.format("%s", new Object[]{str}));
        }
        if (m12290a((int) SearchStatusData.RESPONSE_STATUS_SERVER_ERROR, 2)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo3982g() {
        this.f11965z = 0;
        mo8882j();
    }
}
