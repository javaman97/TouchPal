package com.cootek.smartinput5.p050f;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.HighFreqSettings;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.C2806cb;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.cootek.smartinput5.p066ui.C2934m;
import com.cootek.smartinput5.p066ui.CandidateBar;
import com.cootek.smartinput5.p066ui.FunctionBar;
import com.cootek.smartinput5.p066ui.SoftKeyInfo;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2835M;
import com.cootek.smartinput5.teaching.p065a.C2564f;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.f.a */
/* compiled from: WizardPopupWindow */
public class C1319a {

    /* renamed from: h */
    private static final String f4021h = "WizardPopupWindow";

    /* renamed from: i */
    private static final int f4022i = 86400;

    /* renamed from: j */
    private static final int f4023j = 2000;

    /* renamed from: k */
    private static final int f4024k = 500;

    /* renamed from: l */
    private static final int f4025l = 2000;

    /* renamed from: m */
    private static final int f4026m = 500;

    /* renamed from: n */
    private static final int f4027n = 10;

    /* renamed from: o */
    private static final String f4028o = "emoji_tip_animation";

    /* renamed from: p */
    private static final String f4029p = "switch_language_tip_animation";

    /* renamed from: a */
    Context f4030a;

    /* renamed from: b */
    PopupWindow f4031b;

    /* renamed from: c */
    ViewGroup f4032c;

    /* renamed from: d */
    boolean f4033d = false;

    /* renamed from: e */
    C1334o f4034e;

    /* renamed from: f */
    Rect f4035f;

    /* renamed from: g */
    int f4036g = 0;

    /* renamed from: q */
    private HashMap<C1334o, HashMap<String, View>> f4037q = new HashMap<>();

    /* renamed from: r */
    private Handler f4038r = new Handler();

    /* renamed from: s */
    private ArrayList<Runnable> f4039s = new ArrayList<>();

    /* renamed from: a */
    public static boolean m6097a(Context context, C1334o oVar) {
        switch (oVar) {
            case WUBI_Z_MODE:
                return m6101b(context);
            case SLIDE_INPUT_SYMBOL:
                return m6096a(context);
            case IMPORT_V4_USRDICT:
                return m6110i();
            case DELETE_SLIDE_LEFT:
                return m6106e();
            case SPACE_LONG_PRESS:
                return m6104d();
            case SWITCH_LANGUAGE:
                return m6109h();
            case OPEN_EMOJI:
                return m6108g();
            case COMMA_LONG_PRESS:
                return m6111j();
            default:
                return false;
        }
    }

    /* renamed from: d */
    private static boolean m6104d() {
        if (Settings.getInstance().getIntSetting(Settings.SPACE_LONG_PRESS_TIP_STATE) != 1 || !Engine.isInitialized() || Engine.getInstance().getEditor().isSpecialMode() || Engine.getInstance().getSurfaceType() != 1 || Engine.getInstance().getKeyId("sk_sp") == -1) {
            return false;
        }
        if (!C1549b.f4835f.equals(Engine.getInstance().getCurrentLanguageId()) || !Engine.getInstance().getWidgetManager().mo9598C().mo8631d()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m6106e() {
        if (!HighFreqSettings.getInstance().firstDelWizard || System.currentTimeMillis() / 1000 <= ((long) (HighFreqSettings.getInstance().firstStartTime + f4022i)) || !Engine.isInitialized() || Engine.getInstance().getEditor().isSpecialMode() || C1549b.f4835f.equals(Engine.getInstance().getCurrentLanguageId()) || (TextUtils.isEmpty(Engine.getInstance().getExplicitText()) && TextUtils.isEmpty(Engine.getInstance().getInlineText()))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m6107f() {
        int keyId;
        if (!Engine.isInitialized() || Engine.getInstance().getSurfaceType() != 1 || (keyId = Engine.getInstance().getKeyId("sk_1_1")) == -1) {
            return false;
        }
        SoftKeyInfo softKeyInfo = new SoftKeyInfo();
        softKeyInfo.setSupportedOperation(Engine.getInstance().getKeySupportedOperation(keyId));
        if (softKeyInfo.isOperationSupported(5) || softKeyInfo.isOperationSupported(4)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m6096a(Context context) {
        if ((!C1132b.m5662a() || C1132b.m5654a(context).mo4392a(C1135d.SHOW_SLIDE_INPUT_SYMBOL, (Boolean) true).booleanValue()) && Settings.getInstance().getIntSetting(Settings.SLIDE_INPUT_TIP_STATE) == 1 && !C2564f.m11470c() && m6107f() && !Engine.getInstance().getEditor().isSpecialMode()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m6108g() {
        if (!Engine.isInitialized() || Engine.getInstance().getSurfaceType() != 1 || !Settings.getInstance().getBoolSetting(Settings.SHOW_EMOJI_IN_APP_TIP) || C2564f.m11470c() || Engine.getInstance().getEditor().isSpecialMode() || TextUtils.equals(Engine.getInstance().getCurrentLanguageId(), C1549b.f4835f)) {
            return false;
        }
        if (Settings.getInstance().getLongSetting(Settings.FIRST_INSTALL_TIME) + 259200000 < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m6109h() {
        String[] J;
        if (!Engine.isInitialized() || !C1368X.m6324d() || !Settings.getInstance().getBoolSetting(Settings.SHOW_SWITCH_LANGUAGE_TIP) || Engine.getInstance().getEditor().isSpecialMode() || C1549b.f4835f.equals(Engine.getInstance().getCurrentLanguageId())) {
            return false;
        }
        if (C1368X.m6320c().mo5842o().mo5926N() == 2) {
            return true;
        }
        if (Settings.getInstance().getBoolSetting(Settings.LANG_KEY_ENABLED) || (J = C1368X.m6320c().mo5842o().mo5922J()) == null || J.length < 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m6101b(Context context) {
        if ((!C1132b.m5662a() || C1132b.m5654a(context).mo4392a(C1135d.WUBI_Z_MODE_PROMPTED, (Boolean) true).booleanValue()) && !Settings.getInstance().getBoolSetting(Settings.WUBI_Z_MODE_PROMPTED) && C1549b.f4833d.equals(Engine.getInstance().getCurrentLanguageId())) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m6110i() {
        if (Settings.getInstance().getBoolSetting(Settings.V4_USRDICT_IMPORTED) || !C1368X.m6320c().mo5820F().mo7499d()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private static boolean m6111j() {
        if (Settings.getInstance().getBoolSetting(Settings.LONG_PRESS_COMMA_TIP_SHOWN)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo5543a() {
        return this.f4033d;
    }

    public C1319a(Context context, C1334o oVar) {
        this.f4030a = context;
        this.f4034e = oVar;
        m6112k();
    }

    /* renamed from: k */
    private void m6112k() {
        this.f4031b = new PopupWindow(this.f4030a);
        this.f4031b.setOnDismissListener(new C1321b(this));
        this.f4031b.setBackgroundDrawable(new ColorDrawable(0));
        m6113l();
        int d = Engine.getInstance().getWidgetManager().mo9651i().mo9718d();
        this.f4032c = (ViewGroup) ((LayoutInflater) this.f4030a.getSystemService("layout_inflater")).inflate(R.layout.wizard_popup, (ViewGroup) null);
        this.f4032c.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (this.f4032c != null) {
            if (m6126y()) {
                m6085a(d);
                this.f4032c.setOnClickListener(new C1326g(this));
            } else if (m6127z()) {
                m6105e(d);
            }
            if (this.f4032c.getParent() != null) {
                ((ViewGroup) this.f4032c.getParent()).removeAllViews();
            }
            this.f4031b.setContentView(this.f4032c);
        }
    }

    /* renamed from: l */
    private void m6113l() {
        C2934m i = Engine.getInstance().getWidgetManager().mo9651i();
        SoftKeyboardView g = Engine.getInstance().getWidgetManager().mo9648g();
        if (i != null && g != null) {
            C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
            int d = i.mo9718d();
            int n = g.getKeyboard().mo9192n();
            int g2 = g.getKeyboard().mo9134g() + d;
            this.f4031b.setWidth(n);
            this.f4031b.setHeight(g2);
            if (m6080A()) {
                this.f4031b.update(ad.mo9254l(), d, n, g2 - d);
            }
        }
    }

    /* renamed from: a */
    private void m6085a(int i) {
        int i2;
        int i3;
        String str;
        Rect rect;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        boolean z5 = false;
        Rect rect2 = new Rect(0, 0, 0, 0);
        C2811cf f = Engine.getInstance().getWidgetManager().mo9646f();
        switch (this.f4034e) {
            case WUBI_Z_MODE:
                Rect a = m6082a("z", false);
                i4 = 0;
                i2 = 10;
                i3 = a.right + 10;
                str = m6099b((int) R.string.wizard_tips_wubi_z_mode);
                rect = a;
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                break;
            case DELETE_SLIDE_LEFT:
                String b = m6099b((int) R.string.wizard_tips_del_slide_left);
                C2806cb a2 = m6083a("sk_bk");
                if (a2 == null) {
                    z4 = false;
                    i4 = 0;
                    i2 = 10;
                    i3 = 10;
                    str = b;
                    rect = rect2;
                    z3 = false;
                    z = false;
                    z2 = false;
                    break;
                } else {
                    Rect a3 = m6082a("sk_bk", true);
                    int width = a3.width() + 10;
                    if (a2.f12454y < f.mo9134g() / 2) {
                        i5 = a2.height + 0;
                    } else {
                        i5 = 0;
                    }
                    i2 = width;
                    i3 = 10 + (a3.width() / 2);
                    str = b;
                    rect = a3;
                    i4 = i5;
                    z = false;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    break;
                }
            case SPACE_LONG_PRESS:
                String b2 = m6099b((int) R.string.wizard_tips_space_long_press);
                Rect a4 = m6082a("sk_sp", true);
                i4 = a4.height() * -2;
                i2 = 10;
                i3 = 10;
                str = b2;
                rect = a4;
                z = false;
                z2 = false;
                z3 = false;
                z4 = true;
                break;
            case SWITCH_LANGUAGE:
                String e = C1368X.m6320c().mo5841n().mo6269e((int) R.string.mission_switch_language);
                Rect a5 = m6082a("sk_sp", true);
                i4 = ((-a5.height()) * 5) / 2;
                i2 = 10;
                i3 = 10;
                str = e;
                rect = a5;
                z = false;
                z2 = false;
                z3 = false;
                z4 = true;
                break;
            case OPEN_EMOJI:
                String b3 = m6099b((int) R.string.mission_smiley_title);
                Rect a6 = m6082a("sk_sp", true);
                i4 = ((-a6.height()) * 5) / 2;
                i2 = 10;
                i3 = 10;
                str = b3;
                rect = a6;
                z = false;
                z2 = false;
                z3 = false;
                z4 = true;
                break;
            case COMMA_LONG_PRESS:
                String b4 = m6099b((int) R.string.mission_comma_long_press);
                Rect a7 = m6082a("Comma", true);
                int width2 = 10 + a7.right + ((a7.width() * 2) / 3);
                int i6 = (i * 3) - a7.top;
                this.f4035f = a7;
                i2 = 10;
                i3 = width2;
                str = b4;
                rect = a7;
                i4 = i6;
                z = true;
                z2 = true;
                z3 = true;
                z4 = false;
                break;
            default:
                z3 = false;
                i4 = 0;
                i2 = 10;
                i3 = 10;
                str = m6099b((int) R.string.wizard_tips_bihua_filter);
                rect = rect2;
                z4 = false;
                z = false;
                z2 = false;
                break;
        }
        if (!z3) {
            z5 = true;
        }
        m6087a(rect, z5);
        if (!z) {
            m6102c(i);
        }
        if (!z2) {
            m6103d(i);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = i3;
        layoutParams.rightMargin = i2;
        layoutParams.topMargin = rect.top + (i * 2) + i4;
        m6095a(str, layoutParams, z4);
        m6115n();
    }

    /* renamed from: m */
    private C2826E m6114m() {
        return Engine.getInstance().getWidgetManager().mo9630ad();
    }

    /* renamed from: a */
    private C2806cb m6083a(String str) {
        C2811cf f = Engine.getInstance().getWidgetManager().mo9646f();
        if (f == null) {
            return null;
        }
        return f.mo9182b(str);
    }

    /* renamed from: b */
    private C2806cb m6098b(String str) {
        C2811cf f = Engine.getInstance().getWidgetManager().mo9646f();
        if (f == null) {
            return null;
        }
        return f.mo9178a(1, str, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m6099b(int i) {
        return C1974m.m9063a(this.f4030a, i);
    }

    /* renamed from: a */
    private Rect m6082a(String str, boolean z) {
        C2806cb b;
        Rect rect = new Rect(0, 0, 0, 0);
        if (z) {
            b = m6083a(str);
        } else {
            b = m6098b(str);
        }
        if (b == null) {
            return rect;
        }
        return new Rect(b.f12453x, b.f12454y, b.f12453x + b.width, b.height + b.f12454y);
    }

    /* renamed from: a */
    private void m6086a(Rect rect) {
        m6087a(rect, true);
    }

    /* renamed from: a */
    private void m6087a(Rect rect, boolean z) {
        int c = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.wizard_highlight_corner_radius);
        Drawable a = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.wizard_highlight);
        Path path = new Path();
        RectF rectF = new RectF();
        C1327h hVar = new C1327h(this, this.f4030a, rectF, z, a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        int d = Engine.getInstance().getWidgetManager().mo9651i().mo9718d();
        if (hVar != null) {
            rectF.set((float) rect.left, (float) (rect.top + d), (float) rect.right, (float) (d + rect.bottom));
            path.addRoundRect(rectF, (float) c, (float) c, Path.Direction.CW);
            hVar.setLayoutParams(layoutParams);
            this.f4032c.addView(hVar);
        }
    }

    /* renamed from: a */
    private void m6095a(String str, RelativeLayout.LayoutParams layoutParams, boolean z) {
        C2811cf cfVar;
        int measuredWidth;
        int n;
        TextView textView = new TextView(this.f4030a);
        int b = C1368X.m6320c().mo5841n().mo6260b((int) R.color.wizard_text_color);
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(0, (float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.wizard_message_text_size));
        textView.setSingleLine(false);
        textView.setText(str);
        textView.setTextColor(b);
        textView.setTextSize(0, (float) (((double) textView.getTextSize()) * m6114m().mo9252j()));
        textView.measure(0, 0);
        if (Engine.isInitialized()) {
            cfVar = Engine.getInstance().getWidgetManager().mo9646f();
        } else {
            cfVar = null;
        }
        if (cfVar != null) {
            if (z && (measuredWidth = textView.getMeasuredWidth()) < (n = cfVar.mo9192n())) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                layoutParams2.leftMargin = (n - measuredWidth) / 2;
                textView.setLayoutParams(layoutParams2);
                layoutParams = layoutParams2;
            }
            int measuredHeight = textView.getMeasuredHeight();
            if (layoutParams.topMargin + measuredHeight > cfVar.mo9134g()) {
                layoutParams.topMargin = cfVar.mo9134g() - measuredHeight;
                textView.setLayoutParams(layoutParams);
            }
        }
        this.f4032c.addView(textView);
    }

    /* renamed from: c */
    private void m6102c(int i) {
        try {
            Button button = new Button(this.f4030a);
            button.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.wizard_close));
            button.setOnClickListener(new C1328i(this));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = 10;
            layoutParams.topMargin = (i - button.getBackground().getIntrinsicHeight()) / 2;
            layoutParams.addRule(11);
            button.setLayoutParams(layoutParams);
            this.f4032c.addView(button);
        } catch (Error e) {
        }
    }

    /* renamed from: d */
    private void m6103d(int i) {
        TextView textView = new TextView(this.f4030a);
        String b = m6099b((int) R.string.wizard_tips_title);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.rightMargin = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.wizard_close).getIntrinsicWidth() + 10;
        layoutParams.leftMargin = layoutParams.rightMargin;
        layoutParams.width = this.f4031b.getWidth() - (layoutParams.leftMargin + layoutParams.rightMargin);
        layoutParams.height = i;
        textView.setLayoutParams(layoutParams);
        textView.getPaint().setFakeBoldText(true);
        textView.setTextSize(0, (float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.wizard_title_text_size));
        textView.setSingleLine(true);
        textView.setText(b);
        textView.setTextColor(-1);
        textView.setGravity(17);
        m6094a(textView.getText().toString(), (Paint) textView.getPaint(), (float) layoutParams.width);
        this.f4032c.addView(textView);
    }

    /* renamed from: a */
    private void m6094a(String str, Paint paint, float f) {
        float measureText = paint.measureText(str);
        float textSize = paint.getTextSize();
        while (measureText >= f && textSize >= 1.0f) {
            textSize -= 1.0f;
            paint.setTextSize(textSize);
            measureText = paint.measureText(str);
        }
    }

    /* renamed from: n */
    private void m6115n() {
        switch (this.f4034e) {
            case SWITCH_LANGUAGE:
                m6116o();
                return;
            case OPEN_EMOJI:
                m6118q();
                break;
            case COMMA_LONG_PRESS:
                break;
            default:
                return;
        }
        m6117p();
    }

    /* renamed from: o */
    private void m6116o() {
        C2806cb a = m6083a("sk_sp");
        if (a != null) {
            ImageView imageView = new ImageView(this.f4030a);
            imageView.setImageResource(R.drawable.teaching_arrow);
            imageView.measure(0, 0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = a.f12453x - imageView.getMeasuredWidth();
            layoutParams.bottomMargin = (a.height - imageView.getMeasuredHeight()) / 2;
            layoutParams.addRule(12);
            imageView.setLayoutParams(layoutParams);
            this.f4032c.addView(imageView);
            ImageView imageView2 = new ImageView(this.f4030a);
            imageView2.setImageResource(R.drawable.teaching_hand);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = a.f12453x + (a.width / 2);
            layoutParams2.bottomMargin = (-a.height) / 2;
            layoutParams2.addRule(12);
            imageView2.setLayoutParams(layoutParams2);
            HashMap hashMap = this.f4037q.get(C1334o.SWITCH_LANGUAGE);
            if (hashMap == null) {
                hashMap = new HashMap();
                this.f4037q.put(C1334o.SWITCH_LANGUAGE, hashMap);
            }
            hashMap.put(f4029p, imageView2);
            this.f4032c.addView(imageView2);
        }
    }

    /* renamed from: p */
    private void m6117p() {
        if (this.f4035f != null) {
            ImageView imageView = new ImageView(this.f4030a);
            imageView.setImageResource(R.drawable.comma_tip_img);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = (int) (((double) this.f4035f.left) - (((double) (this.f4035f.width() / 8)) * m6114m().mo9250h()));
            layoutParams.bottomMargin = (int) (((double) ((this.f4035f.height() * 2) / 5)) * m6114m().mo9253k());
            layoutParams.addRule(12);
            imageView.setLayoutParams(layoutParams);
            this.f4032c.addView(imageView);
        }
    }

    /* renamed from: q */
    private void m6118q() {
        C2806cb a = m6083a("sk_sp");
        if (a != null) {
            ImageView imageView = new ImageView(this.f4030a);
            imageView.setImageResource(R.drawable.emoji_inapp_tip_arrow);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = a.f12453x + (a.width / 5);
            layoutParams.bottomMargin = a.height;
            layoutParams.height = a.height;
            layoutParams.addRule(12);
            imageView.setLayoutParams(layoutParams);
            this.f4032c.addView(imageView);
            ImageView imageView2 = new ImageView(this.f4030a);
            imageView2.setImageResource(R.drawable.teaching_hand);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = a.f12453x + (a.width / 2);
            layoutParams2.bottomMargin = (-a.height) / 2;
            layoutParams2.addRule(12);
            imageView2.setLayoutParams(layoutParams2);
            HashMap hashMap = this.f4037q.get(C1334o.OPEN_EMOJI);
            if (hashMap == null) {
                hashMap = new HashMap();
                this.f4037q.put(C1334o.OPEN_EMOJI, hashMap);
            }
            hashMap.put(f4028o, imageView2);
            this.f4032c.addView(imageView2);
        }
    }

    /* renamed from: e */
    private void m6105e(int i) {
        m6124w();
        switch (this.f4034e) {
            case SLIDE_INPUT_SYMBOL:
                m6119r();
                return;
            case IMPORT_V4_USRDICT:
                m6125x();
                return;
            default:
                return;
        }
    }

    /* renamed from: r */
    private void m6119r() {
        int i;
        FunctionBar h;
        View inflate = ((LayoutInflater) this.f4030a.getSystemService("layout_inflater")).inflate(R.layout.slide_input_symbol, (ViewGroup) null);
        if (inflate != null) {
            inflate.setOnClickListener(new C1329j(this));
        }
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.title_frame);
        TextView textView = new TextView(this.f4030a);
        String b = m6099b((int) R.string.wizard_tips_title);
        int b2 = C1368X.m6320c().mo5841n().mo6260b((int) R.color.wizard_text_color);
        textView.setText(b);
        textView.setTextColor(b2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!Engine.isInitialized() || (h = Engine.getInstance().getWidgetManager().mo9650h()) == null) {
            i = 0;
        } else {
            i = h.getHeight();
        }
        Button button = new Button(this.f4030a);
        if (button != null) {
            button.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.wizard_close));
            button.setOnClickListener(new C1330k(this));
            layoutParams2.rightMargin = 10;
            layoutParams2.topMargin = (i - button.getBackground().getIntrinsicHeight()) / 2;
            layoutParams2.addRule(11);
            button.setLayoutParams(layoutParams2);
            relativeLayout.addView(button);
        }
        layoutParams.rightMargin = button.getBackground().getIntrinsicWidth() + 10;
        layoutParams.leftMargin = layoutParams.rightMargin;
        layoutParams.width = this.f4031b.getWidth() - (layoutParams.leftMargin + layoutParams.rightMargin);
        layoutParams.height = i;
        textView.setLayoutParams(layoutParams);
        textView.getPaint().setFakeBoldText(true);
        textView.setTextSize(0, (float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.wizard_title_text_size));
        textView.setSingleLine(true);
        textView.setText(b);
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextPaint paint = textView.getPaint();
        float textSize = paint.getTextSize();
        while (paint.measureText(b) > ((float) layoutParams.width)) {
            textSize -= 1.0f;
            paint.setTextSize(textSize);
        }
        relativeLayout.addView(textView);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.tips_content);
        if (linearLayout != null) {
            int g = Engine.getInstance().getWidgetManager().mo9646f().mo9134g() / 2;
            ((ImageView) linearLayout.findViewById(R.id.tips_slide_input_img)).setLayoutParams(new LinearLayout.LayoutParams(-1, g));
            ((TextView) linearLayout.findViewById(R.id.tips_slide_input_text)).setLayoutParams(new LinearLayout.LayoutParams(-1, g));
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(10);
        this.f4032c.addView(inflate, layoutParams3);
    }

    /* renamed from: s */
    private void m6120s() {
        switch (this.f4034e) {
            case SWITCH_LANGUAGE:
                m6121t();
                return;
            case OPEN_EMOJI:
                m6122u();
                return;
            default:
                return;
        }
    }

    /* renamed from: t */
    private void m6121t() {
        ImageView imageView = (ImageView) this.f4037q.get(C1334o.SWITCH_LANGUAGE).get(f4029p);
        C2806cb a = m6083a("sk_sp");
        if (imageView != null && a != null) {
            AnimationSet animationSet = new AnimationSet(true);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) ((-a.width) / 2), 0.0f, 0.0f);
            translateAnimation.setStartOffset(0);
            translateAnimation.setDuration(2000);
            animationSet.addAnimation(translateAnimation);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setStartOffset(0);
            alphaAnimation.setDuration(2000);
            animationSet.addAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setStartOffset(2000);
            alphaAnimation2.setDuration(500);
            animationSet.addAnimation(alphaAnimation2);
            this.f4038r.post(new C1331l(this, imageView, animationSet));
        }
    }

    /* renamed from: u */
    private void m6122u() {
        ImageView imageView = (ImageView) this.f4037q.get(C1334o.OPEN_EMOJI).get(f4028o);
        C2806cb a = m6083a("sk_sp");
        if (imageView != null && a != null) {
            AnimationSet animationSet = new AnimationSet(true);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-a.height));
            translateAnimation.setStartOffset(0);
            translateAnimation.setDuration(2000);
            animationSet.addAnimation(translateAnimation);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setStartOffset(0);
            alphaAnimation.setDuration(2000);
            animationSet.addAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setStartOffset(2000);
            alphaAnimation2.setDuration(500);
            animationSet.addAnimation(alphaAnimation2);
            this.f4038r.post(new C1332m(this, imageView, animationSet));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6093a(Runnable runnable, long j) {
        this.f4039s.add(runnable);
        this.f4038r.postDelayed(runnable, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6092a(Runnable runnable) {
        this.f4039s.remove(runnable);
        this.f4038r.removeCallbacks(runnable);
    }

    /* renamed from: v */
    private void m6123v() {
        Iterator<Runnable> it = this.f4039s.iterator();
        while (it.hasNext()) {
            this.f4038r.removeCallbacks(it.next());
        }
        this.f4039s.clear();
    }

    /* renamed from: w */
    private void m6124w() {
        Drawable a = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.wizard_highlight);
        C1333n nVar = new C1333n(this, this.f4030a, new Path(), a, new RectF());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(12);
        if (nVar != null) {
            nVar.setLayoutParams(layoutParams);
            this.f4032c.addView(nVar);
        }
    }

    /* renamed from: x */
    private void m6125x() {
        View inflate = ((LayoutInflater) this.f4030a.getSystemService("layout_inflater")).inflate(R.layout.import_v4_usrdict, (ViewGroup) null);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (inflate != null) {
            m6088a(inflate);
            m6100b(inflate);
            this.f4032c.addView(inflate);
        }
    }

    /* renamed from: a */
    private void m6088a(View view) {
        Button button = (Button) view.findViewById(R.id.import_usrdict_ok);
        TextView textView = (TextView) view.findViewById(R.id.import_usrdict_title);
        ImageView imageView = (ImageView) view.findViewById(R.id.import_usrdict_icon);
        m6094a(button.getText().toString(), (Paint) button.getPaint(), (float) ((C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.wizard_confirm_button_width) - button.getPaddingLeft()) - button.getPaddingRight()));
        imageView.setVisibility(8);
        textView.setText(m6099b((int) R.string.optpage_restore_dic) + C2261Q.f9807m);
        button.setOnClickListener(new C1322c(this, button, (Button) view.findViewById(R.id.import_usrdict_cancel), imageView, textView));
    }

    /* renamed from: b */
    private void m6100b(View view) {
        Button button = (Button) view.findViewById(R.id.import_usrdict_cancel);
        if (button != null) {
            m6094a(button.getText().toString(), (Paint) button.getPaint(), (float) ((C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.wizard_confirm_button_width) - button.getPaddingLeft()) - button.getPaddingRight()));
            button.setOnClickListener(new C1325f(this));
        }
    }

    /* renamed from: y */
    private boolean m6126y() {
        switch (this.f4034e) {
            case WUBI_Z_MODE:
            case DELETE_SLIDE_LEFT:
            case SPACE_LONG_PRESS:
            case SWITCH_LANGUAGE:
            case OPEN_EMOJI:
            case COMMA_LONG_PRESS:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: z */
    private boolean m6127z() {
        switch (this.f4034e) {
            case SLIDE_INPUT_SYMBOL:
            case IMPORT_V4_USRDICT:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: A */
    private boolean m6080A() {
        int i = C13201.f4040a[this.f4034e.ordinal()];
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m6081B() {
        switch (this.f4034e) {
            case WUBI_Z_MODE:
                Settings.getInstance().setBoolSetting(Settings.WUBI_Z_MODE_PROMPTED, true);
                break;
            case SLIDE_INPUT_SYMBOL:
                Settings.getInstance().setIntSetting(Settings.SLIDE_INPUT_TIP_STATE, 2);
                break;
            case DELETE_SLIDE_LEFT:
                Settings.getInstance().setBoolSetting(115, false);
                break;
            case SPACE_LONG_PRESS:
                Settings.getInstance().setIntSetting(Settings.SPACE_LONG_PRESS_TIP_STATE, 2);
                break;
            case COMMA_LONG_PRESS:
                break;
        }
        Settings.getInstance().setBoolSetting(Settings.LONG_PRESS_COMMA_TIP_SHOWN, true);
        CandidateBar f = Engine.getInstance().getWidgetManager().mo9651i().mo9720f();
        if (f != null) {
            f.mo8492b(false);
            Engine.getInstance().updateResult(16, -1);
        }
        m6123v();
    }

    /* renamed from: b */
    public void mo5544b() {
        SoftKeyboardView g = Engine.getInstance().getWidgetManager().mo9648g();
        View b = Engine.getInstance().getWidgetManager().mo9651i().mo9716b();
        if (this.f4031b != null && this.f4032c != null && g != null && b != null && g.getWindowToken() != null) {
            try {
                this.f4031b.showAtLocation(g, 83, Engine.getInstance().getWidgetManager().mo9630ad().mo9254l(), C2835M.m13017a(g));
                m6120s();
            } catch (RuntimeException e) {
            }
            this.f4033d = true;
            this.f4036g = (int) (System.currentTimeMillis() / 1000);
        }
    }

    /* renamed from: c */
    public void mo5545c() {
        if (this.f4032c != null) {
            this.f4032c.removeAllViews();
        }
        if (this.f4031b != null) {
            try {
                this.f4031b.dismiss();
            } catch (Exception e) {
            }
            this.f4033d = false;
        }
    }
}
