package com.cootek.smartinput5.func;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.FunctionBar;

/* renamed from: com.cootek.smartinput5.func.aV */
/* compiled from: PluginInfo */
public class C1411aV extends C1810j {

    /* renamed from: A */
    public static final String f4470A = "top";

    /* renamed from: B */
    public static final String f4471B = "bottom";

    /* renamed from: R */
    public static final String f4472R = "all";

    /* renamed from: S */
    public static final String f4473S = "international";

    /* renamed from: T */
    public static final String f4474T = "mainland";

    /* renamed from: U */
    public static final String f4475U = "com.cootek.smartinput.intent.action.KEYCODE";

    /* renamed from: V */
    public static final String f4476V = "com.cootek.smartinput.intent.action.KEYNAME";

    /* renamed from: d */
    public static final int f4477d = 0;

    /* renamed from: e */
    public static final int f4478e = 1;

    /* renamed from: f */
    public static final int f4479f = 2;

    /* renamed from: g */
    public static final int f4480g = 3;

    /* renamed from: h */
    public static final int f4481h = 1;

    /* renamed from: i */
    public static final int f4482i = 2;

    /* renamed from: j */
    public static final String f4483j = "keycode";

    /* renamed from: k */
    public static final String f4484k = "activity";

    /* renamed from: l */
    public static final String f4485l = "keyname";

    /* renamed from: m */
    public static final String f4486m = "keyboard";

    /* renamed from: n */
    public static final String f4487n = "func";

    /* renamed from: o */
    public static final String f4488o = "switcher";

    /* renamed from: p */
    public static final String f4489p = "entra";

    /* renamed from: q */
    public static final String f4490q = "functionbar";

    /* renamed from: r */
    public static final String f4491r = "drawer";

    /* renamed from: s */
    public static final int f4492s = 0;

    /* renamed from: t */
    public static final int f4493t = 1;

    /* renamed from: u */
    public static final int f4494u = 2;

    /* renamed from: v */
    public static final int f4495v = 3;

    /* renamed from: w */
    public static final int f4496w = 0;

    /* renamed from: x */
    public static final int f4497x = 1;

    /* renamed from: y */
    public static final int f4498y = 2;

    /* renamed from: z */
    public static final String f4499z = "auto";

    /* renamed from: C */
    public Drawable f4500C;

    /* renamed from: D */
    public String f4501D;

    /* renamed from: E */
    public String f4502E;

    /* renamed from: F */
    public String f4503F;

    /* renamed from: G */
    public String f4504G;

    /* renamed from: H */
    public int f4505H = 0;

    /* renamed from: I */
    public int f4506I = 0;

    /* renamed from: J */
    public boolean f4507J = true;

    /* renamed from: K */
    public Intent[] f4508K = new Intent[3];

    /* renamed from: L */
    public int[] f4509L = new int[3];

    /* renamed from: M */
    public String f4510M;

    /* renamed from: N */
    public String f4511N;

    /* renamed from: O */
    public boolean f4512O;

    /* renamed from: P */
    public String f4513P;

    /* renamed from: Q */
    public C1412a f4514Q;

    /* renamed from: com.cootek.smartinput5.func.aV$a */
    /* compiled from: PluginInfo */
    public interface C1412a {
        /* renamed from: a */
        int mo6036a();
    }

    /* renamed from: a */
    public boolean mo6035a(int i) {
        boolean z;
        boolean z2;
        if (i < 0 || i > 1 || this.f4508K[i] == null) {
            z = false;
        } else {
            z = true;
        }
        if (i != 2 || this.f4514Q == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int mo6033a(Context context, int i) {
        if (!mo6035a(i)) {
            return 1;
        }
        if (i == 2) {
            return this.f4514Q.mo6036a();
        }
        Intent intent = this.f4508K[i];
        if (intent.getAction() != null && intent.getAction().equals(f4475U)) {
            return m6626b(intent.getIntExtra(f4483j, 0));
        }
        if (intent.getAction() == null || !intent.getAction().equals(f4476V)) {
            return mo6034a(context, intent);
        }
        return m6625a(intent.getStringExtra(f4485l));
    }

    /* renamed from: b */
    public static int m6626b(int i) {
        if (i <= 0) {
            return 3;
        }
        Engine.getInstance().commitKeyEvent(i);
        FunctionBar h = Engine.getInstance().getWidgetManager().mo9650h();
        if (h != null) {
            h.mo8558r();
        }
        return 0;
    }

    /* renamed from: a */
    public static int m6625a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId(str), 0);
        Engine.getInstance().processEvent();
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6034a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
            return 0;
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            return 2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }
}
