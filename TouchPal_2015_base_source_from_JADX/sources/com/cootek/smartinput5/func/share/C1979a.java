package com.cootek.smartinput5.func.share;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.p053c.C1632c;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.share.a */
/* compiled from: RateUtils */
public class C1979a {

    /* renamed from: a */
    private static final int f6753a = 100;

    /* renamed from: b */
    private static final long f6754b = 86400000;

    /* renamed from: c */
    private static final int f6755c = 2;

    /* renamed from: d */
    private static final int f6756d = 4;

    /* renamed from: e */
    private static final int f6757e = 5;

    /* renamed from: a */
    public static void m9108a(Context context) {
        if (m9114c()) {
            View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.guiding_rate_dlg, (ViewGroup) null);
            Dialog dialog = new Dialog(context, R.style.RateDialog);
            dialog.setContentView(inflate);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.guiding_rate_stars_panel);
            C1602bh n = C1368X.m6320c().mo5841n();
            int c = n.mo6265c((int) R.dimen.guiding_rate_star_size);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c, c);
            layoutParams.setMargins(4, 0, 4, 0);
            for (int i = 0; i < 5; i++) {
                ImageView imageView = new ImageView(context);
                imageView.setLayoutParams(layoutParams);
                imageView.setImageDrawable(n.mo6249a((int) R.drawable.guiding_rate_star));
                linearLayout.addView(imageView);
            }
            ((Button) inflate.findViewById(R.id.guiding_rate_later_btn)).setOnClickListener(m9110b(dialog));
            ((Button) inflate.findViewById(R.id.guiding_rate_btn)).setOnClickListener(m9106a(dialog, context));
            Window window = dialog.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 48;
            attributes.y += n.mo6265c((int) R.dimen.guiding_rate_dlg_height_offset);
            window.setAttributes(attributes);
            try {
                dialog.show();
                C1246d.m6010a(context).mo4591a("RATE_US/DIALOG", "SHOW", C1246d.f3836c);
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: c */
    private static boolean m9114c() {
        if (m9109a()) {
            return false;
        }
        if (Settings.getInstance().getIntSetting(Settings.OPTION_PAGE_OPEN_TIMES) == 2) {
            return true;
        }
        if (m9115d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static View.OnClickListener m9106a(Dialog dialog, Context context) {
        return new C1980b(context, dialog);
    }

    /* renamed from: b */
    private static View.OnClickListener m9110b(Dialog dialog) {
        return new C1981c(dialog);
    }

    /* renamed from: a */
    protected static void m9107a(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    /* renamed from: b */
    public static void m9112b(Context context) {
        long c = C1368X.m6320c().mo5823I().mo6385c();
        if (!m9109a() && c >= 100 && m9115d()) {
            C1632c v = C1368X.m6320c().mo5849v();
            v.mo6416a(v.mo6414a().mo6408d());
            Settings.getInstance().setIntSetting(Settings.RATE_US_NOTICATION_SHOW_TIMES, Settings.getInstance().getIntSetting(Settings.RATE_US_NOTICATION_SHOW_TIMES) + 1);
            m9117f();
            C1246d.m6010a(context).mo4591a("RATE_US/NOTIFICATION", "SHOW", C1246d.f3836c);
        }
    }

    /* renamed from: d */
    private static boolean m9115d() {
        long e = m9116e();
        if (e <= 0 || System.currentTimeMillis() < e) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static long m9116e() {
        return Settings.getInstance().getLongSetting(Settings.RATE_US_NEXT_SHOW_TIME);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m9117f() {
        Settings.getInstance().setLongSetting(Settings.RATE_US_NEXT_SHOW_TIME, System.currentTimeMillis() + 1296000000);
    }

    /* renamed from: c */
    public static void m9113c(Context context) {
        Settings.getInstance().setBoolSetting(Settings.RATE_US_BUTTON_CLICKED, true);
        C1246d.m6010a(context).mo4591a("RATE_US/RATE_BUTTON/", "CLICK", C1246d.f3836c);
        try {
            C1584bI.m7133a(context, context.getPackageName(), false);
        } catch (ActivityNotFoundException e) {
        }
    }

    /* renamed from: a */
    public static boolean m9109a() {
        return Settings.getInstance().getBoolSetting(Settings.RATE_US_BUTTON_CLICKED);
    }
}
