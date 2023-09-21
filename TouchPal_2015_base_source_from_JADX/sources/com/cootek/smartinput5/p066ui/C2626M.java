package com.cootek.smartinput5.p066ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.asset.C1460o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.M */
/* compiled from: DynamicKeyboardBGInfo */
public class C2626M {

    /* renamed from: a */
    public static final int f11460a = 2;

    /* renamed from: b */
    public static final int f11461b = 0;

    /* renamed from: c */
    public static final int f11462c = 1;

    /* renamed from: d */
    public static final int f11463d = 0;

    /* renamed from: e */
    public static final int f11464e = 1;

    /* renamed from: l */
    private static final String f11465l = "up_time";

    /* renamed from: m */
    private static final String f11466m = "up_count";

    /* renamed from: n */
    private static final String f11467n = "dynamic_bg_list";

    /* renamed from: f */
    public boolean f11468f = false;

    /* renamed from: g */
    public int f11469g;

    /* renamed from: h */
    public long f11470h;

    /* renamed from: i */
    public int f11471i;

    /* renamed from: j */
    public boolean f11472j;

    /* renamed from: k */
    C1602bh f11473k = C1368X.m6320c().mo5841n();

    /* renamed from: o */
    private Drawable f11474o;

    /* renamed from: p */
    private ArrayList<String> f11475p = new ArrayList<>();

    public C2626M() {
        C1601bg l = this.f11473k.mo6284l(this.f11473k.mo6288n().getPackageName());
        if (l != null && !TextUtils.isEmpty(l.f5103g)) {
            if (TextUtils.equals(l.f5103g, f11465l)) {
                this.f11469g = 0;
                this.f11470h = Long.parseLong(l.f5104h);
                this.f11468f = true;
            } else if (TextUtils.equals(l.f5103g, f11466m)) {
                this.f11469g = 1;
                this.f11471i = l.f5105i;
                this.f11468f = true;
            }
            if (this.f11468f) {
                this.f11472j = l.f5106j;
            }
        }
    }

    /* renamed from: a */
    public void mo8664a() {
        this.f11475p.clear();
        try {
            InputStream a = C1460o.m6799b().mo6098a(C1368X.m6313b(), this.f11473k.mo6288n(), f11467n);
            if (a != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        this.f11475p.add(readLine);
                    } else {
                        return;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo8665b() {
        mo8664a();
        if (Settings.getInstance().getBoolSetting(Settings.NEED_CHANGE_KEYBOARD_BG)) {
            int intSetting = (Settings.getInstance().getIntSetting(Settings.CURRENT_DYNAMIC_BG_INDEX) + 1) % this.f11475p.size();
            Settings.getInstance().setIntSetting(Settings.CURRENT_DYNAMIC_BG_INDEX, intSetting);
            this.f11474o = m11873a(intSetting);
        }
    }

    /* renamed from: c */
    public void mo8666c() {
        Settings.getInstance().setIntSetting(Settings.CURRENT_DYNAMIC_BG_INDEX, 0);
        if (this.f11469g == 0) {
            Settings.getInstance().setLongSetting(Settings.DYNIMAC_CHANGE_KB_BACKGROUND_TIME, System.currentTimeMillis() + this.f11470h);
        } else if (this.f11469g == 1) {
            Settings.getInstance().setIntSetting(Settings.KEYBOARD_SHOW_TIMES, 0);
        }
    }

    /* renamed from: d */
    public void mo8667d() {
        if (mo8668e()) {
            Settings.getInstance().setBoolSetting(Settings.NEED_CHANGE_KEYBOARD_BG, true);
        } else {
            Settings.getInstance().setBoolSetting(Settings.NEED_CHANGE_KEYBOARD_BG, false);
        }
    }

    /* renamed from: e */
    public boolean mo8668e() {
        if (this.f11469g == 0) {
            long longSetting = Settings.getInstance().getLongSetting(Settings.DYNIMAC_CHANGE_KB_BACKGROUND_TIME);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis >= longSetting) {
                Settings.getInstance().setLongSetting(Settings.DYNIMAC_CHANGE_KB_BACKGROUND_TIME, this.f11470h + currentTimeMillis);
                return true;
            }
        } else if (this.f11469g == 1) {
            int intSetting = Settings.getInstance().getIntSetting(Settings.KEYBOARD_SHOW_TIMES);
            if (intSetting >= this.f11471i - 1) {
                Settings.getInstance().setIntSetting(Settings.KEYBOARD_SHOW_TIMES, 0);
                return true;
            }
            Settings.getInstance().setIntSetting(Settings.KEYBOARD_SHOW_TIMES, intSetting + 1);
        }
        return false;
    }

    /* renamed from: f */
    public Drawable mo8669f() {
        if (this.f11474o == null) {
            this.f11474o = m11873a(Settings.getInstance().getIntSetting(Settings.CURRENT_DYNAMIC_BG_INDEX));
        }
        return this.f11474o;
    }

    /* renamed from: a */
    private BitmapDrawable m11873a(int i) {
        Bitmap decodeStream;
        mo8664a();
        if (this.f11475p.size() > i) {
            String str = this.f11475p.get(i);
            C1443as n = this.f11473k.mo6288n();
            try {
                InputStream a = C1460o.m6799b().mo6098a(C1368X.m6313b(), n, str);
                if (!(a == null || (decodeStream = BitmapFactory.decodeStream(a)) == null)) {
                    return new BitmapDrawable(n.getResources(), decodeStream);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
