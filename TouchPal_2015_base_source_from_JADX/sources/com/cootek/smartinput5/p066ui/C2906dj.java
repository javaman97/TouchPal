package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.baidu.pcs.BaiduPCSClient;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.HighFreqSettings;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2835M;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.dj */
/* compiled from: VoiceProcessMask */
public class C2906dj extends PopupWindow implements C2826E.C2827a {

    /* renamed from: b */
    private static final int f13130b = 1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static C2906dj f13131d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Handler f13132e = new C2907dk();

    /* renamed from: a */
    private final int f13133a = Settings.SUPER_DICT_DOWNLOADED;

    /* renamed from: c */
    private Context f13134c;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2826E f13135f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f13136g = false;

    /* renamed from: h */
    private AudioManager f13137h;

    public C2906dj(Context context) {
        super(context);
        f13131d = this;
        setContentView(m13359a(context));
        this.f13134c = context;
        setBackgroundDrawable(new ColorDrawable(0));
        if (Engine.isInitialized()) {
            this.f13135f = Engine.getInstance().getWidgetManager().mo9630ad();
        }
        this.f13137h = (AudioManager) this.f13134c.getSystemService(BaiduPCSClient.Type_Stream_Audio);
    }

    /* renamed from: h */
    private int m13369h() {
        if (this.f13135f != null) {
            return this.f13135f.mo9254l();
        }
        return 0;
    }

    /* renamed from: i */
    private int m13370i() {
        if (!Engine.isInitialized() || Engine.getInstance().getWidgetManager() == null) {
            return 0;
        }
        return C2835M.m13017a(Engine.getInstance().getWidgetManager().mo9648g());
    }

    /* renamed from: a */
    public boolean mo9578a() {
        return this.f13136g;
    }

    /* renamed from: b */
    public void mo9579b() {
        if (Engine.isInitialized()) {
            this.f13136g = true;
            Engine.getInstance().getVoiceProcessor().startInputVoice(false, new C2908dl(this), new C2909dm(this));
            f13132e.removeMessages(1);
            f13132e.sendEmptyMessageDelayed(1, 300);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m13371j() {
        if (this.f13136g) {
            if (this.f13135f != null) {
                this.f13135f.mo9238a((C2826E.C2827a) this);
            }
            if (Engine.isInitialized()) {
                Engine.getInstance().setMutiTouchPaused(true);
                C2917du widgetManager = Engine.getInstance().getWidgetManager();
                FunctionBar h = widgetManager.mo9650h();
                if (h != null) {
                    h.setClickEnabled(false);
                }
                if (widgetManager.mo9657n() != null) {
                    widgetManager.mo9657n().mo9405l();
                }
                SoftKeyboardView g = widgetManager.mo9648g();
                setWidth(g.getKeyboard().mo9192n());
                Rect a = Engine.getInstance().getWidgetManager().mo9646f().mo9177a("sk_sp");
                VoiceView O = Engine.getInstance().getWidgetManager().mo9609O();
                O.measure(0, 0);
                int height = a.height() + O.getMeasuredHeight();
                if (height <= g.getKeyboard().mo9134g()) {
                    height = g.getKeyboard().mo9134g();
                }
                setHeight(height);
                try {
                    showAtLocation(g, 83, m13369h(), m13370i());
                    if (HighFreqSettings.getInstance().spaceLongpressState != 2) {
                        Settings.getInstance().setIntSetting(Settings.SPACE_LONG_PRESS_TIP_STATE, 2);
                    }
                } catch (RuntimeException e) {
                }
            }
        }
    }

    public void dismiss() {
        this.f13136g = false;
        try {
            super.dismiss();
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void mo9577a(long j, int i, int i2) {
        if (isShowing()) {
            m13360a(i, i2);
        }
        m13361a(j);
    }

    /* renamed from: a */
    private void m13361a(long j) {
        f13132e.removeMessages(1);
        f13132e.postDelayed(new C2910dn(this), j);
    }

    /* renamed from: a */
    private void m13360a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            for (int i3 = 0; i3 < i; i3++) {
                f13132e.postDelayed(new C2911do(this, i2), (long) ((i3 + 1) * 100));
            }
        }
    }

    /* renamed from: a */
    private View m13359a(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        Rect a = Engine.getInstance().getWidgetManager().mo9646f().mo9177a("sk_sp");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = a.height();
        VoiceView O = Engine.getInstance().getWidgetManager().mo9609O();
        if (O.getParent() != null) {
            ((ViewGroup) O.getParent()).removeView(O);
        }
        O.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.bg_voice_mask));
        relativeLayout.addView(O, layoutParams);
        return relativeLayout;
    }

    /* renamed from: e */
    public boolean mo9581e() {
        if (isShowing()) {
            return m13362a(Engine.getInstance().getVoiceProcessor().getRecognitionState());
        }
        return this.f13136g;
    }

    /* renamed from: a */
    private boolean m13362a(int i) {
        switch (i) {
            case 1:
            case 2:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: c */
    public void mo8538c() {
    }

    /* renamed from: p_ */
    public void mo8556p_() {
        if (isShowing()) {
            update(m13369h(), m13370i(), -1, -1, true);
        }
    }
}
