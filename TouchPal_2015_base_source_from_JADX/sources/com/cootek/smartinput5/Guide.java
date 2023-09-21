package com.cootek.smartinput5;

import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.p001v4.view.C0333F;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.func.mainentrance.MainEntranceActivity;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.func.resource.p055ui.TButton;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.settings.TouchPalCloudActivity;
import com.emoji.keyboard.touchpal.R;
import com.google.android.gms.games.GamesClient;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Guide extends C1976b {

    /* renamed from: J */
    private static final float f2714J = 0.65f;

    /* renamed from: K */
    private static final float f2715K = 0.4f;

    /* renamed from: a */
    static boolean f2716a = false;

    /* renamed from: k */
    private static final int f2717k = 0;

    /* renamed from: l */
    private static final int f2718l = 1;

    /* renamed from: m */
    private static final int f2719m = 2;

    /* renamed from: n */
    private static final int f2720n = 3;

    /* renamed from: o */
    private static final int f2721o = 2;

    /* renamed from: p */
    private static final int f2722p = 2;

    /* renamed from: q */
    private static final int f2723q = 0;

    /* renamed from: r */
    private static final int f2724r = 20;

    /* renamed from: s */
    private static final int f2725s = 15;

    /* renamed from: t */
    private static final int f2726t = 10;

    /* renamed from: u */
    private static final int f2727u = 10;

    /* renamed from: v */
    private static final int f2728v = 100;

    /* renamed from: w */
    private static final int f2729w = 35;

    /* renamed from: A */
    private final int[] f2730A = {R.string.enable_keyboard_option_main_title, R.string.keyboard_set_as_default_option_main_title};

    /* renamed from: B */
    private final int[] f2731B = {R.drawable.new_guide_btn_one_icon, R.drawable.new_guide_btn_two_icon};
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C1028b f2732C;

    /* renamed from: D */
    private String f2733D;

    /* renamed from: E */
    private Typeface f2734E;

    /* renamed from: F */
    private C3285z f2735F;

    /* renamed from: G */
    private GuideMoveBackgroundView f2736G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public Dialog f2737H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f2738I = true;

    /* renamed from: L */
    private int f2739L = 0;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public Handler f2740M = new C1318f(this);
    /* access modifiers changed from: private */

    /* renamed from: N */
    public int f2741N = -1;

    /* renamed from: O */
    private Thread f2742O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f2743P = true;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f2744Q = false;

    /* renamed from: b */
    private int f2745b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f2746c = false;

    /* renamed from: d */
    private int f2747d = GamesClient.STATUS_ACHIEVEMENT_UNLOCK_FAILURE;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f2748e = SearchStatusData.RESPONSE_STATUS_SERVER_ERROR;

    /* renamed from: f */
    private int f2749f = 2;

    /* renamed from: g */
    private int f2750g = 0;

    /* renamed from: h */
    private TextView f2751h;

    /* renamed from: i */
    private TextView f2752i;

    /* renamed from: j */
    private CheckBox f2753j;

    /* renamed from: x */
    private boolean f2754x = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f2755y = false;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f2756z = false;

    /* renamed from: d */
    static /* synthetic */ int m5276d(Guide guide) {
        int i = guide.f2741N;
        guide.f2741N = i + 1;
        return i;
    }

    /* renamed from: a */
    public static void m5260a() {
        f2716a = true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        m5271b();
    }

    /* renamed from: b */
    private void m5271b() {
        this.f2735F = new C3285z(this);
        C1368X.m6317b((Context) this);
        this.f2733D = getString(C1593bR.m7162a().mo6232a(16));
        f2716a = false;
        this.f2747d = C1132b.m5654a((Context) this).mo4397a(C1135d.CHANNEL_LOGO_SHOW_TIME, Integer.valueOf(getResources().getInteger(R.integer.channel_logo_show_time))).intValue();
        if (m5283f()) {
            if (!Settings.getInstance().getBoolSetting(Settings.GUIDE_FINISH_PAGE_SHOWED)) {
                Settings.getInstance().setBoolSetting(Settings.GUIDE_FINISH_PAGE_SHOWED, true);
            }
            m5286h();
            return;
        }
        String d = C1584bI.m7151d(this);
        if (!TextUtils.isEmpty(d)) {
            C1060e.m5598b().mo4274a(C1060e.f3028s, (Object) d);
        }
        if (C1132b.m5654a((Context) this).mo4392a(C1135d.CHANNEL_LOGO_SCREEN_SHOW, Boolean.valueOf(getResources().getBoolean(R.bool.SHOW_CHANNEL_LOGO_SCREEN))).booleanValue()) {
            m5252C();
        }
        if (C1593bR.m7162a().f5076b) {
            setTheme(R.style.ThemeLight);
            setContentView(R.layout.guide);
            m5253D();
        } else {
            setContentView(R.layout.guide_entrance);
            this.f2736G = (GuideMoveBackgroundView) findViewById(R.id.guide_move_bg_view);
            m5301p();
            m5290j();
            m5288i();
            m5273c();
            this.f2732C = new C1028b();
            m5277d();
            m5300o();
        }
        m5310y();
        this.f2750g = 0;
    }

    /* renamed from: c */
    private void m5273c() {
        TextView textView = (TextView) findViewById(R.id.privacy_link);
        SpannableString spannableString = new SpannableString(getResString(R.string.guide_privacy));
        SpannableString spannableString2 = new SpannableString(getResString(R.string.guide_privacy_link));
        spannableString2.setSpan(new URLSpan(getResString(R.string.user_privacy_policy_link)), 0, spannableString2.length(), 33);
        spannableString2.setSpan(new ForegroundColorSpan(C1368X.m6320c().mo5841n().mo6260b((int) R.color.guide_privacy_link_color)), 0, spannableString2.length(), 33);
        textView.setText(spannableString + " ");
        textView.append(spannableString2);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: d */
    private void m5277d() {
        View findViewById = findViewById(R.id.logo);
        if (findViewById != null) {
            findViewById.setVisibility(4);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.guide_buttons);
        for (int i = 0; i < 2; i++) {
            linearLayout.findViewById(i).setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f2735F.mo10486b();
        if (this.f2736G != null) {
            this.f2736G.mo4140c();
        }
        if (this.f2737H != null && this.f2737H.isShowing()) {
            this.f2737H.dismiss();
        }
        C1056a.m5588a().mo4266b();
        C1060e.m5598b().mo4276c();
        super.onDestroy();
        C1368X.m6325e();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m5280e();
    }

    /* renamed from: e */
    private void m5280e() {
        if (this.f2736G != null) {
            this.f2736G.mo4138a();
        }
        this.f2735F.mo10487c();
        this.f2750g = 0;
        if (this.f2742O != null && this.f2742O.isAlive()) {
            this.f2743P = true;
        }
        m5285g();
        if (m5283f()) {
            m5286h();
        } else if (C1593bR.m7162a().f5076b) {
            m5258I();
        } else {
            m5255F();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (this.f2736G != null) {
            this.f2736G.mo4140c();
        }
        if (this.f2742O != null && this.f2742O.isAlive()) {
            this.f2743P = false;
        }
        if (!this.f2744Q) {
            if (!(C1584bI.m7149c(this) && C1584bI.m7153f(this))) {
                m5254E();
                Settings.getInstance().setBoolSetting(Settings.SHOW_CONTINUE_TO_ACTIVE_NOTIFICATION, true);
            } else {
                Settings.getInstance().setBoolSetting(Settings.SHOW_CONTINUE_TO_ACTIVE_NOTIFICATION, false);
            }
        } else {
            this.f2744Q = false;
        }
        if (this.f2753j != null && Settings.isInitialized()) {
            Settings.getInstance().setBoolSetting(Settings.USERDATA_COLLECT_ENABLE, this.f2753j.isChecked());
        }
        super.onStop();
    }

    /* renamed from: f */
    private boolean m5283f() {
        return C1584bI.m7149c(this) && C1584bI.m7153f(this);
    }

    /* renamed from: g */
    private void m5285g() {
        if (Settings.getInstance().getBoolSetting(Settings.SHOW_CONTINUE_TO_ACTIVE_NOTIFICATION)) {
            ((NotificationManager) C1368X.m6313b().getSystemService("notification")).cancel(Settings.SHOW_CONTINUE_TO_ACTIVE_NOTIFICATION);
            Settings.getInstance().setBoolSetting(Settings.SHOW_CONTINUE_TO_ACTIVE_NOTIFICATION, false);
        }
    }

    /* renamed from: h */
    private void m5286h() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(Engine.EXCEPTION_ERROR);
        if (C1132b.m5654a((Context) this).mo4392a(C1135d.HAS_MAIN_ENTRANCE, Boolean.valueOf(C1593bR.m7162a().f5076b)).booleanValue()) {
            intent.setClass(this, MainEntranceActivity.class);
        } else if (!Settings.getInstance().getBoolSetting(Settings.GUIDE_FINISH_PAGE_SHOWED)) {
            intent.setClass(this, GuideSkinSelectorActivity.class);
        } else {
            intent.setClass(this, TouchPalOption.class);
        }
        startActivity(intent);
        finish();
    }

    /* renamed from: i */
    private void m5288i() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.guide_buttons);
        linearLayout.setOrientation(1);
        m5264a((View) linearLayout);
        this.f2745b = -1;
    }

    /* renamed from: j */
    private void m5290j() {
        if (!m5251B()) {
            m5261a(8);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        int i = getApplicationContext().getResources().getDisplayMetrics().widthPixels;
        layoutParams.setMargins(i / 20, 0, i / 20, 0);
        m5261a(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5261a(int i) {
        ((ImageView) findViewById(R.id.guide_slogan)).setVisibility(i);
    }

    /* renamed from: a */
    private void m5264a(View view) {
        LinearLayout.LayoutParams layoutParams;
        LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.guide_entrance_item, (ViewGroup) null);
            ((ImageView) linearLayout.findViewById(R.id.option_number_icon)).setImageResource(this.f2731B[i2]);
            TextView textView = (TextView) linearLayout.findViewById(R.id.button_main_title);
            textView.setTypeface(m5302q());
            textView.setText(getResString(this.f2730A[i2]));
            linearLayout.setOnClickListener(m5270b(i2));
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
            } else {
                layoutParams = layoutParams2;
            }
            layoutParams.gravity = 1;
            linearLayout.setId(i2);
            int i3 = view.getContext().getResources().getDisplayMetrics().widthPixels;
            if (i == 0) {
                linearLayout.measure(0, 0);
                i = linearLayout.getMeasuredHeight();
            }
            layoutParams.setMargins(i3 / 14, i / 5, i3 / 14, (i * 2) / 5);
            ((LinearLayout) view).addView(linearLayout, i2, layoutParams);
        }
        this.f2738I = m5292k();
        ScrollView scrollView = (ScrollView) findViewById(R.id.guide_button_group);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) scrollView.getLayoutParams();
        layoutParams3.height = (int) (((float) m5294l()) * f2715K);
        scrollView.setLayoutParams(layoutParams3);
    }

    /* renamed from: k */
    private boolean m5292k() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.guide_buttons);
        if (linearLayout == null) {
            return false;
        }
        linearLayout.measure(0, 0);
        return ((float) linearLayout.getMeasuredHeight()) < ((float) m5294l()) * f2715K;
    }

    /* renamed from: l */
    private int m5294l() {
        if (this.f2739L == 0) {
            this.f2739L = m5296m() - m5298n();
            if (C1584bI.m7139a()) {
                this.f2739L -= C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.guide_activity_smartbar_height);
            }
        }
        return this.f2739L;
    }

    /* renamed from: m */
    private int m5296m() {
        Rect rect = new Rect();
        ((ViewGroup) findViewById(16908290)).getChildAt(0).getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    /* renamed from: n */
    private int m5298n() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: o */
    private void m5300o() {
        this.f2742O = new C2161i(this);
        this.f2742O.start();
    }

    /* renamed from: p */
    private void m5301p() {
        ((TextView) findViewById(R.id.logo_title)).setTypeface(m5302q());
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.logo_group);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = (int) (((float) m5294l()) * f2714J);
        relativeLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: q */
    private Typeface m5302q() {
        if (this.f2734E == null) {
            this.f2734E = C1624bv.m7424d();
        }
        return this.f2734E;
    }

    /* renamed from: b */
    private View.OnClickListener m5270b(int i) {
        if (i == 0) {
            return m5303r();
        }
        if (i == 1) {
            return m5307v();
        }
        return null;
    }

    /* renamed from: r */
    private View.OnClickListener m5303r() {
        return new C2162j(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m5304s() {
        if (this.f2737H == null) {
            View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.guide_privacy_dialog, (ViewGroup) null, false);
            this.f2737H = new Dialog(this, R.style.RateDialog);
            this.f2737H.setContentView(inflate);
            ((TButton) inflate.findViewById(R.id.guide_privacy_btn)).setOnClickListener(new C2163k(this));
            ((LinearLayout) inflate.findViewById(R.id.guide_privacy_layout)).setOnTouchListener(new C2164l(this));
            ((LinearLayout) inflate.findViewById(R.id.guide_privacy_sub_layout)).setOnTouchListener(new C2165m(this));
            this.f2737H.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f2737H.setCanceledOnTouchOutside(true);
        }
        if (this.f2737H != null) {
            this.f2737H.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m5305t() {
        if (m5306u()) {
            this.f2735F.mo10485a();
        }
        try {
            startActivity(new Intent("android.settings.INPUT_METHOD_SETTINGS"));
        } catch (ActivityNotFoundException e) {
        }
        m5267a(true);
        this.f2744Q = true;
    }

    /* renamed from: u */
    private boolean m5306u() {
        return Build.VERSION.SDK_INT > 8;
    }

    /* renamed from: v */
    private View.OnClickListener m5307v() {
        return new C2166n(this);
    }

    /* renamed from: w */
    private View.OnClickListener m5308w() {
        return new C2381o(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m5309x() {
        this.f2750g++;
        if (this.f2750g < this.f2749f) {
            startActivity(new Intent(getApplicationContext(), TouchPalCloudActivity.class));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5262a(int i, boolean z) {
        C1246d.m6010a(getApplicationContext()).mo4591a(z ? C1246d.f3777au : C1246d.f3778av, C1246d.f3779aw + String.valueOf(i + 1), C1246d.f3933e);
    }

    /* renamed from: y */
    private void m5310y() {
        if (!this.f2754x) {
            try {
                Context applicationContext = getApplicationContext();
                List<InputMethodInfo> enabledInputMethodList = ((InputMethodManager) applicationContext.getSystemService("input_method")).getEnabledInputMethodList();
                String packageName = applicationContext.getPackageName();
                for (int i = 0; i < enabledInputMethodList.size(); i++) {
                    String packageName2 = enabledInputMethodList.get(i).getPackageName();
                    if (packageName2 != null && !TextUtils.equals(packageName, packageName2)) {
                        C1246d.m6010a(applicationContext).mo4591a(C1246d.f3781ay, packageName2.toLowerCase(), C1246d.f3933e);
                    }
                }
                String d = C1584bI.m7151d(applicationContext);
                if (d != null) {
                    C1246d.m6010a(applicationContext).mo4591a(C1246d.f3782az, d.toLowerCase(), C1246d.f3933e);
                }
            } catch (Exception e) {
            }
            this.f2754x = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public int m5311z() {
        if (m5251B()) {
            return 0 + m5250A();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public int m5250A() {
        return 45;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public boolean m5251B() {
        return false;
    }

    /* renamed from: com.cootek.smartinput5.Guide$a */
    private abstract class C1027a {
        /* renamed from: a */
        public abstract void mo4127a();

        private C1027a() {
        }

        /* synthetic */ C1027a(Guide guide, C1318f fVar) {
            this();
        }
    }

    /* renamed from: com.cootek.smartinput5.Guide$b */
    private class C1028b {

        /* renamed from: b */
        private Map<Integer, C1027a> f2759b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f2760c;

        /* renamed from: d */
        private int f2761d = m5313a();

        /* renamed from: e */
        private AlphaAnimation f2762e;

        /* renamed from: f */
        private AlphaAnimation f2763f;

        public C1028b() {
            this.f2760c = Guide.this.m5251B();
            m5318c();
            m5315b();
        }

        /* renamed from: a */
        private int m5313a() {
            int l = Guide.this.f2738I ? (Guide.this.f2748e / 100) * 3 : 10;
            if (this.f2760c) {
                return l + Guide.this.m5250A();
            }
            return l;
        }

        /* renamed from: b */
        private void m5315b() {
            this.f2762e = new AlphaAnimation(0.0f, 1.0f);
            this.f2762e.setFillBefore(true);
            this.f2762e.setFillAfter(true);
            this.f2762e.setDuration(2000);
            this.f2763f = new AlphaAnimation(1.0f, 0.0f);
            this.f2763f.setFillBefore(true);
            this.f2763f.setFillAfter(true);
            this.f2763f.setDuration(1000);
            this.f2763f.setAnimationListener(new C2525q(this));
        }

        /* renamed from: c */
        private void m5318c() {
            this.f2759b = new HashMap();
            if (this.f2760c) {
                this.f2759b.put(0, m5320d());
                this.f2759b.put(35, m5327i());
            }
            this.f2759b.put(Integer.valueOf(Guide.this.m5311z()), m5322e());
            if (Guide.this.f2738I) {
                int n = Guide.this.m5311z() + (Guide.this.f2748e / 100);
                for (int i = 0; i < 2; i++) {
                    this.f2759b.put(Integer.valueOf(n), m5317c(i));
                    n += Guide.this.f2748e / 200;
                }
            }
        }

        /* renamed from: d */
        private C1027a m5320d() {
            return new C2526r(this);
        }

        /* renamed from: e */
        private C1027a m5322e() {
            return new C2527s(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m5324f() {
            View findViewById = Guide.this.findViewById(R.id.logo);
            findViewById.setVisibility(0);
            Animation loadAnimation = AnimationUtils.loadAnimation(Guide.this.getApplicationContext(), R.anim.guide_entrance_logo_animation);
            loadAnimation.setFillAfter(true);
            loadAnimation.setDuration((long) Guide.this.f2748e);
            findViewById.startAnimation(loadAnimation);
            Settings.getInstance().setBoolSetting(Settings.HAS_SLOGAN_ANIMATION_PLAYED, true);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m5325g() {
            Guide.this.findViewById(R.id.logo).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) Guide.this.findViewById(R.id.guide_buttons);
            for (int i = 0; i < 2; i++) {
                linearLayout.findViewById(i).setVisibility(0);
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setDuration(1000);
            ((FrameLayout) Guide.this.findViewById(R.id.Guide)).startAnimation(alphaAnimation);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m5326h() {
            ImageView imageView = (ImageView) Guide.this.findViewById(R.id.guide_slogan);
            imageView.setVisibility(0);
            imageView.startAnimation(this.f2762e);
        }

        /* renamed from: i */
        private C1027a m5327i() {
            return new C2528t(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public void m5328j() {
            ((ImageView) Guide.this.findViewById(R.id.guide_slogan)).startAnimation(this.f2763f);
        }

        /* renamed from: c */
        private C1027a m5317c(int i) {
            return new C2607u(this, i);
        }

        /* renamed from: a */
        public C1027a mo4128a(int i) {
            if (this.f2759b != null) {
                return this.f2759b.get(Integer.valueOf(i));
            }
            return null;
        }

        /* renamed from: b */
        public boolean mo4129b(int i) {
            return i >= this.f2761d;
        }
    }

    /* renamed from: C */
    private void m5252C() {
        WindowManager windowManager = (WindowManager) getSystemService("window");
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.comp_channels_logo, (ViewGroup) null);
        inflate.setBackgroundColor(C0333F.f835s);
        TextView textView = (TextView) inflate.findViewById(R.id.app_name_text);
        textView.setTextColor(-1);
        textView.setText(this.f2733D);
        if (C1132b.m5654a((Context) this).mo4392a(C1135d.CHANNEL_LOGO_PIC_SHOW, Boolean.valueOf(getResources().getBoolean(R.bool.SHOW_CHANNEL_LOGO_PIC))).booleanValue()) {
            inflate.findViewById(R.id.channel_pic).setVisibility(0);
        }
        if (C1132b.m5654a((Context) this).mo4392a(C1135d.CHANNEL_LOGO_TEXT_SHOW, Boolean.valueOf(getResources().getBoolean(R.bool.SHOW_CHANNEL_LOGO_TEXT))).booleanValue()) {
            inflate.findViewById(R.id.channel_text).setVisibility(0);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.gravity = 51;
        windowManager.addView(inflate, layoutParams);
        new Handler().postDelayed(new C2382p(this, windowManager, inflate), (long) this.f2747d);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m5267a(boolean r7) {
        /*
            r6 = this;
            r5 = 0
            r0 = 0
            if (r7 == 0) goto L_0x0027
            boolean r1 = r6.m5306u()     // Catch:{ Exception -> 0x0039 }
            if (r1 != 0) goto L_0x0027
            r1 = 2131624611(0x7f0e02a3, float:1.8876407E38)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0039 }
            r3 = 0
            java.lang.String r4 = r6.f2733D     // Catch:{ Exception -> 0x0039 }
            r2[r3] = r4     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = r6.getResString(r1, r2)     // Catch:{ Exception -> 0x0039 }
        L_0x0019:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0026
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r0, r5)
            r0.show()
        L_0x0026:
            return
        L_0x0027:
            if (r7 != 0) goto L_0x0019
            r1 = 2131624612(0x7f0e02a4, float:1.8876409E38)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0039 }
            r3 = 0
            java.lang.String r4 = r6.f2733D     // Catch:{ Exception -> 0x0039 }
            r2[r3] = r4     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = r6.getResString(r1, r2)     // Catch:{ Exception -> 0x0039 }
            goto L_0x0019
        L_0x0039:
            r1 = move-exception
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.Guide.m5267a(boolean):void");
    }

    /* renamed from: D */
    private void m5253D() {
        this.f2751h = (TextView) findViewById(R.id.enable_touchpal_btn);
        this.f2752i = (TextView) findViewById(R.id.default_touchpal_btn);
        this.f2751h.setOnClickListener(new C2159g(this));
        this.f2752i.setOnClickListener(new C2160h(this));
        m5258I();
    }

    /* renamed from: E */
    private void m5254E() {
        Notification notification = new Notification();
        notification.icon = R.drawable.icon_small;
        notification.flags = 16;
        notification.defaults = 2;
        Intent intent = new Intent(getApplicationContext(), getClass());
        intent.setFlags(335544320);
        notification.setLatestEventInfo(getApplicationContext(), getResString(R.string.guide_notification_title), getResString(R.string.guide_notification_sub_title), PendingIntent.getActivity(getApplicationContext(), R.string.app_name, intent, Engine.EXCEPTION_WARN));
        ((NotificationManager) getSystemService("notification")).notify(Settings.SHOW_CONTINUE_TO_ACTIVE_NOTIFICATION, notification);
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            if (this.f2746c) {
                if (C1593bR.m7162a().f5076b) {
                    m5258I();
                } else {
                    m5255F();
                }
            }
            this.f2746c = false;
            if (this.f2755y && C1584bI.m7149c(this)) {
                C1056a.m5588a().mo4264a(C1056a.f2975f, this);
                this.f2755y = false;
            } else if (this.f2756z && C1584bI.m7153f(this)) {
                C1056a.m5588a().mo4264a(C1056a.f2976g, this);
                this.f2756z = false;
            }
        }
        if (this.f2745b == 2 && z) {
            m5286h();
        }
        super.onWindowFocusChanged(z);
    }

    /* renamed from: F */
    private void m5255F() {
        int H = m5257H();
        if (H != this.f2745b) {
            this.f2745b = H;
            m5256G();
        }
    }

    /* renamed from: G */
    private void m5256G() {
        if (this.f2745b >= 0 && this.f2745b < 2) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.guide_buttons);
            for (int i = 0; i < 2; i++) {
                ViewGroup viewGroup = (ViewGroup) linearLayout.getChildAt(i);
                if (i == this.f2745b) {
                    viewGroup.setClickable(true);
                    viewGroup.setEnabled(true);
                    ((TextView) viewGroup.findViewById(R.id.button_main_title)).setTextColor(getResources().getColor(R.color.new_guide_main_btn_text_color));
                    viewGroup.findViewById(R.id.option_btn_split).setBackgroundColor(getResources().getColor(R.color.new_guide_option_btn_split_enable_color));
                } else {
                    viewGroup.setClickable(false);
                    viewGroup.setEnabled(false);
                    ((TextView) viewGroup.findViewById(R.id.button_main_title)).setTextColor(getResources().getColor(R.color.new_guide_main_title_text_color_disable));
                    viewGroup.findViewById(R.id.option_btn_split).setBackgroundColor(getResources().getColor(R.color.new_guide_option_btn_split_color));
                }
            }
        }
    }

    /* renamed from: H */
    private int m5257H() {
        if (!C1584bI.m7149c(this)) {
            return 0;
        }
        if (!C1584bI.m7153f(this)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: I */
    private void m5258I() {
        boolean z = true;
        if (m5283f()) {
            if (this.f2751h != null) {
                this.f2751h.setEnabled(false);
                this.f2751h.setSelected(true);
                this.f2751h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.guide_btn_selected_icon, 0, 0, 0);
            }
            if (this.f2752i != null) {
                this.f2752i.setEnabled(false);
                this.f2752i.setSelected(true);
                this.f2752i.setCompoundDrawablesWithIntrinsicBounds(R.drawable.guide_btn_selected_icon, 0, 0, 0);
            }
            if (!Settings.getInstance().getBoolSetting(Settings.HAS_SHOWN_GUIDE_INTRO_VIEW)) {
                Intent intent = new Intent(this, GuideIntroM.class);
                if (Settings.getInstance().getBoolSetting(Settings.TOTALLY_NEW_PACK)) {
                    z = false;
                }
                intent.putExtra(GuideIntroM.f2779a, z);
                startActivity(intent);
            }
            finish();
        } else if (!C1584bI.m7149c(this)) {
            if (this.f2751h != null) {
                this.f2751h.setEnabled(true);
                this.f2751h.setSelected(false);
                this.f2751h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            if (this.f2752i != null) {
                this.f2752i.setEnabled(false);
                this.f2752i.setSelected(false);
                this.f2752i.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        } else if (!C1584bI.m7153f(this)) {
            if (this.f2751h != null) {
                this.f2751h.setEnabled(false);
                this.f2751h.setSelected(true);
                this.f2751h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.guide_btn_selected_icon, 0, 0, 0);
            }
            if (this.f2752i != null) {
                this.f2752i.setEnabled(true);
            }
        }
    }

    /* renamed from: a */
    public static void m5263a(Context context) {
        Intent intent = new Intent(context, Guide.class);
        intent.setFlags(Engine.EXCEPTION_ERROR);
        context.startActivity(intent);
    }
}
