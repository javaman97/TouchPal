package com.cootek.smartinput5.teaching.p065a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.MoveContrail;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.C2806cb;
import com.cootek.smartinput5.p066ui.CandidateBar;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.teaching.a.a */
/* compiled from: TeachingAnimationUtils */
public class C2559a {

    /* renamed from: a */
    public static final int f10982a = 0;

    /* renamed from: b */
    public static final int f10983b = 1;

    /* renamed from: c */
    public static final int f10984c = 2;

    /* renamed from: d */
    private static final String f10985d = "TeachingAnimation";

    /* renamed from: e */
    private static final String f10986e = "hw_mask";

    /* renamed from: a */
    public static boolean m11429a(int i) {
        switch (i) {
            case 1:
            case 3:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: a */
    public static Animation m11422a(Context context, Runnable runnable) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.teaching_click);
        loadAnimation.setAnimationListener(new C2560b(runnable));
        return loadAnimation;
    }

    /* renamed from: a */
    public static Animation m11421a(Context context, View view, Runnable runnable, Runnable runnable2) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.teaching_word_hide);
        loadAnimation.setAnimationListener(new C2561c(runnable));
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.teaching_word_show);
        loadAnimation2.setAnimationListener(new C2562d(view, loadAnimation, runnable2));
        return loadAnimation2;
    }

    /* renamed from: a */
    public static TextView m11424a(Context context, int i, int i2) {
        return m11426a(context, context.getResources().getString(i), i2);
    }

    /* renamed from: a */
    public static TextView m11426a(Context context, String str, int i) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(0, (float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.wizard_message_text_size));
        textView.setSingleLine(false);
        textView.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a(i));
        textView.setTextColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.wizard_text_color));
        textView.setVisibility(0);
        textView.setGravity(17);
        return textView;
    }

    /* renamed from: a */
    public static AnimationSet m11423a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, f3, f4);
        translateAnimation.setDuration(2000);
        animationSet.addAnimation(translateAnimation);
        return animationSet;
    }

    /* renamed from: a */
    public static TextView m11425a(Context context, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(0, (float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.wizard_message_text_size));
        textView.setSingleLine(false);
        textView.setBackgroundDrawable(C1368X.m6313b().getResources().getDrawable(R.drawable.teaching_text_bachground));
        textView.setTextColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.wizard_text_highlight_color));
        textView.setVisibility(0);
        textView.setGravity(17);
        return textView;
    }

    /* renamed from: a */
    public static Rect m11419a(C2806cb cbVar, int i) {
        Rect rect = new Rect();
        if (cbVar != null) {
            C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
            rect.left = cbVar.f12453x;
            rect.right = cbVar.f12453x + cbVar.width;
            rect.top = cbVar.f12454y + i;
            rect.bottom = ((int) (((double) cbVar.height) * ad.mo9251i())) + cbVar.f12454y + i;
        }
        return rect;
    }

    /* renamed from: a */
    public static View m11420a(Context context, Rect rect) {
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(rect.width(), rect.height());
        layoutParams.leftMargin = rect.left;
        layoutParams.topMargin = rect.top;
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(4);
        return imageView;
    }

    /* renamed from: b */
    public static View m11432b(Context context, String str, int i) {
        return m11420a(context, m11419a(Engine.getInstance().getWidgetManager().mo9646f().mo9182b(str), i));
    }

    /* renamed from: a */
    public static float[] m11430a(Rect rect) {
        return new float[]{((float) (rect.right + rect.left)) / 2.0f, ((float) (rect.bottom + rect.top)) / 2.0f};
    }

    /* renamed from: a */
    public static float[] m11431a(String str, int i, int i2) {
        return m11430a(m11419a(Engine.getInstance().getWidgetManager().mo9646f().mo9178a(i, str, true), i2));
    }

    /* renamed from: a */
    public static void m11427a() {
        if (Engine.isInitialized()) {
            Engine.getInstance().processEvent();
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_bk"), 6);
            Engine.getInstance().processEvent();
        }
    }

    /* renamed from: a */
    public static void m11428a(boolean z) {
        if (Engine.isInitialized()) {
            CandidateBar f = Engine.getInstance().getWidgetManager().mo9651i().mo9720f();
            if (f != null) {
                f.mo8492b(z);
            }
            Engine.getInstance().updateResult(16, -1);
        }
    }

    /* renamed from: b */
    public static void m11434b(boolean z) {
        CandidateBar f;
        if (Engine.isInitialized() && (f = Engine.getInstance().getWidgetManager().mo9651i().mo9720f()) != null) {
            f.setClickable(z);
        }
    }

    /* renamed from: b */
    public static void m11433b() {
        InputMethodService ims = Engine.getInstance().getIms();
        ims.sendDownUpKeyEvents(21);
        ims.sendDownUpKeyEvents(21);
    }

    /* renamed from: c */
    public static void m11435c() {
        Engine instance = Engine.getInstance();
        instance.fireKeyOperation(instance.getKeyId("sk_sft"), 0);
        instance.processEvent();
    }

    /* renamed from: d */
    public static void m11437d() {
        Engine instance = Engine.getInstance();
        instance.fireKeyOperation(instance.getKeyId("sk_sym"), 1);
        instance.processEvent();
    }

    /* renamed from: e */
    public static void m11438e() {
        Engine instance = Engine.getInstance();
        instance.fireKeyOperation(instance.getKeyId("sk_back"), 0);
        instance.processEvent();
    }

    /* renamed from: f */
    public static void m11439f() {
        Engine instance = Engine.getInstance();
        instance.fireKeyOperation(instance.getKeyId("sk_bk"), 6);
        instance.processEvent();
    }

    /* renamed from: g */
    public static void m11440g() {
        Engine instance = Engine.getInstance();
        instance.fireKeyOperation(instance.getKeyId("sk_sp"), 6);
        instance.processEvent();
    }

    /* renamed from: a */
    public static int m11418a(int i, String[] strArr) {
        return Engine.getInstance().getKeyId(strArr[i]);
    }

    /* renamed from: h */
    public static MoveContrail m11441h() {
        MoveContrail moveContrail = new MoveContrail();
        moveContrail.addPoint(Settings.CURRENT_EMOJI_INPUT_TYPE, 21, 0);
        moveContrail.addPoint(Settings.CURRENT_EMOJI_INPUT_TYPE, 21, 2);
        moveContrail.addPoint(Settings.WAVE_WITHOUT_NEXT_WORD_ON_CANDIDATE, 23, 2);
        moveContrail.addPoint(Settings.SHOW_WAVE_QUICK_SLIDE_TIPS_TIMES, 37, 2);
        moveContrail.addPoint(Settings.SHOW_DIALER_PROMOTE, 50, 2);
        moveContrail.addPoint(Settings.KEY_SPEED_TOTAL_KEY_TIMES, 67, 2);
        moveContrail.addPoint(123, 85, 2);
        moveContrail.addPoint(102, 94, 2);
        moveContrail.addPoint(102, 94, 1);
        return moveContrail;
    }

    /* renamed from: c */
    public static boolean m11436c(boolean z) {
        Settings.getInstance().setBoolSetting(48, z);
        String stringSetting = Settings.getInstance().getStringSetting(79);
        StringBuilder sb = new StringBuilder();
        String[] split = stringSetting.split("/");
        if (split == null) {
            return false;
        }
        boolean z2 = false;
        for (int i = 0; i < split.length; i++) {
            if (i != 0) {
                sb.append("/");
            }
            if (split[i].contains(f10986e)) {
                z2 = true;
                sb.append("hw_mask:" + z);
            } else {
                sb.append(split[i]);
            }
        }
        Settings.getInstance().setStringSetting(79, sb.toString());
        C1368X.m6320c().mo5837j().mo6045f();
        if (!Engine.isInitialized() || Engine.getInstance().getWidgetManager().mo9650h() == null) {
            return false;
        }
        Engine.getInstance().getWidgetManager().mo9650h().mo8555p();
        Engine.getInstance().getWidgetManager().mo9650h().mo8557q();
        return z2;
    }
}
