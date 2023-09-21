package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.FilterItem;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.paopaopanel.C1933b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.HandWriteMask */
public class HandWriteMask extends RelativeLayout {

    /* renamed from: a */
    public static final int f11324a = 0;

    /* renamed from: b */
    public static final int f11325b = 1;

    /* renamed from: c */
    public static final int f11326c = 2;

    /* renamed from: d */
    public static final int f11327d = 3;

    /* renamed from: e */
    public static final int f11328e = 4;

    /* renamed from: f */
    public static final int f11329f = 5;

    /* renamed from: g */
    public static int f11330g = 0;

    /* renamed from: h */
    private static final String f11331h = "HandWriteMask";

    /* renamed from: i */
    private static final int f11332i = 1;

    /* renamed from: j */
    private static final int f11333j = 2;

    /* renamed from: k */
    private static final int f11334k = 3;

    /* renamed from: l */
    private static final int f11335l = 1;

    /* renamed from: m */
    private static final int f11336m = 2;

    /* renamed from: n */
    private static final int f11337n = 3;

    /* renamed from: o */
    private static final float f11338o = 1.0f;

    /* renamed from: p */
    private static final float f11339p = 1.0f;

    /* renamed from: A */
    private String f11340A = null;

    /* renamed from: B */
    private String f11341B = null;

    /* renamed from: C */
    private Paint f11342C;

    /* renamed from: D */
    private Paint f11343D;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Context f11344q;

    /* renamed from: r */
    private int f11345r;

    /* renamed from: s */
    private Rect[] f11346s = null;

    /* renamed from: t */
    private TextView f11347t = null;

    /* renamed from: u */
    private TextView f11348u = null;

    /* renamed from: v */
    private ImageView f11349v = null;

    /* renamed from: w */
    private String f11350w = null;

    /* renamed from: x */
    private String f11351x = null;

    /* renamed from: y */
    private String f11352y = null;

    /* renamed from: z */
    private String f11353z = null;

    public HandWriteMask(Context context) {
        super(context);
        this.f11344q = context;
        f11330g = 0;
        setBackgroundColor(0);
        setVisible(false);
        this.f11345r = Settings.getInstance().getIntSetting(Settings.MANUALLY_ENTER_HANDWRITE_MASK_TIMES);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m11771a(canvas);
        switch (f11330g) {
            case 1:
            case 3:
                m11772b(canvas);
                return;
            case 2:
                m11774c(canvas);
                return;
            case 4:
                m11778e(canvas);
                return;
            default:
                return;
        }
    }

    public void setVisible(boolean z) {
        if (z) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    /* renamed from: a */
    public boolean mo8612a() {
        return getVisibility() == 0;
    }

    public void setStatus(int i) {
        f11330g = i;
        m11783j();
        invalidate();
    }

    public int getStatus() {
        return f11330g;
    }

    /* renamed from: b */
    public boolean mo8614b() {
        if (getVisibility() != 0) {
            return true;
        }
        switch (f11330g) {
            case 1:
            case 2:
            case 3:
                return false;
            default:
                return true;
        }
    }

    public void setPartRects(Rect[] rectArr) {
        this.f11346s = rectArr;
    }

    /* renamed from: a */
    public boolean mo8613a(int i, int i2) {
        if (getMaskMode() == 3) {
            return true;
        }
        if (this.f11346s == null) {
            return false;
        }
        for (Rect contains : this.f11346s) {
            if (contains.contains(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m11773c() {
        if (findViewById(3) == null) {
            m11779f();
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f11344q, 17432576);
        loadAnimation.setDuration(1000);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f11344q, 17432577);
        loadAnimation2.setDuration(2000);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(loadAnimation);
        animationSet.addAnimation(loadAnimation2);
        this.f11348u.startAnimation(animationSet);
        this.f11348u.setVisibility(4);
    }

    /* renamed from: a */
    private void m11771a(Canvas canvas) {
        if (this.f11342C == null) {
            m11780g();
        }
        switch (getMaskMode()) {
            case 2:
                if (this.f11346s != null) {
                    for (Rect drawRect : this.f11346s) {
                        canvas.drawRect(drawRect, this.f11342C);
                    }
                    return;
                }
                return;
            case 3:
                canvas.drawRect((float) getLeft(), (float) getTop(), (float) getRight(), (float) getBottom(), this.f11342C);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m11772b(Canvas canvas) {
        String str;
        if (this.f11343D == null) {
            m11781h();
        }
        this.f11343D.setTextAlign(Paint.Align.CENTER);
        String str2 = "";
        if (f11330g == 1) {
            if (this.f11350w == null) {
                this.f11350w = m11767a((int) R.string.download_handwrite_data);
            }
            if (this.f11352y == null) {
                this.f11352y = m11767a((int) R.string.download_handwrite_data_link);
            }
            str2 = this.f11350w;
            str = this.f11352y;
        } else if (f11330g == 3) {
            if (this.f11351x == null) {
                this.f11351x = m11767a((int) R.string.downloadfailed_handwrite_data);
            }
            if (this.f11353z == null) {
                this.f11353z = m11767a((int) R.string.download_handwrite_data_link2);
            }
            str2 = this.f11351x;
            str = this.f11353z;
        } else {
            str = "";
        }
        float width = (((float) getWidth()) * 1.0f) / 2.0f;
        float a = m11765a(str2, canvas, width, (((float) getHeight()) * 1.0f) / 3.0f, this.f11343D);
        this.f11343D.setUnderlineText(true);
        m11765a(str, canvas, width, a, this.f11343D);
        this.f11343D.setUnderlineText(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m11767a(int i) {
        return C1974m.m9063a(this.f11344q, i);
    }

    /* renamed from: a */
    private String m11768a(int i, Object... objArr) {
        return C1974m.m9064a(this.f11344q, i, objArr);
    }

    /* renamed from: a */
    private float m11765a(String str, Canvas canvas, float f, float f2, Paint paint) {
        Iterator<String> it = m11770a(str, getWidth() - 20, this.f11343D).iterator();
        while (it.hasNext()) {
            canvas.drawText(it.next(), f, f2, this.f11343D);
            f2 = (f2 - this.f11343D.ascent()) + 10.0f;
        }
        return f2;
    }

    /* renamed from: a */
    private ArrayList<String> m11770a(String str, int i, Paint paint) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (paint.measureText(str) < ((float) i)) {
            arrayList.add(str);
        } else {
            int length = str.length() - 1;
            int i2 = 0;
            float f = 0.0f;
            for (int i3 = 0; i3 < str.length(); i3++) {
                f += paint.measureText(str.substring(i3, i3 + 1));
                if (f >= ((float) i) || i3 == length) {
                    if (i3 == length) {
                        arrayList.add(str.substring(i2));
                    } else {
                        arrayList.add(str.substring(i2, i3));
                    }
                    i2 = i3;
                    f = 0.0f;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m11774c(Canvas canvas) {
        if (this.f11343D == null) {
            m11781h();
        }
        this.f11343D.setTextAlign(Paint.Align.CENTER);
        if (this.f11340A == null) {
            this.f11340A = m11767a((int) R.string.downloading_handwrite_data);
        }
        float width = (1.0f * ((float) getWidth())) / 2.0f;
        float height = (((float) ((int) (((((double) getHeight()) * 0.7d) + ((double) C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.downloading_icon).getIntrinsicHeight())) / 2.0d))) - this.f11343D.ascent()) + 20.0f;
        if (C1933b.m8860a() == 2 && Engine.isInitialized() && Engine.getInstance().getKeyId("sk_sp") != -1) {
            height = (((float) Engine.getInstance().getWidgetManager().mo9646f().mo9182b("sk_sp").height) - this.f11343D.ascent()) + 20.0f;
        }
        canvas.drawText(this.f11340A, width, height, this.f11343D);
    }

    /* renamed from: d */
    private void m11776d(Canvas canvas) {
        if (this.f11341B == null) {
            this.f11341B = m11767a((int) R.string.handwrite_panel);
        }
        canvas.drawText(this.f11341B, 10.0f, 30.0f, this.f11343D);
    }

    /* renamed from: e */
    private boolean m11778e(Canvas canvas) {
        String displayString;
        if (this.f11343D == null) {
            m11781h();
        }
        this.f11343D.setTextAlign(Paint.Align.LEFT);
        FilterItem activeFilterItem = C1368X.m6320c().mo5835h().getActiveFilterItem(new FilterItem());
        if (!(activeFilterItem == null || (displayString = activeFilterItem.getDisplayString()) == null || displayString.length() != 1)) {
            String[] queryChinesePronunciation = C1368X.m6320c().mo5835h().queryChinesePronunciation(displayString);
            if (queryChinesePronunciation.length >= 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(m11768a((int) R.string.hwmask_pronunciation_word, displayString));
                sb.append("\"");
                sb.append(queryChinesePronunciation[0]);
                for (int i = 1; i < queryChinesePronunciation.length; i++) {
                    sb.append(", ");
                    sb.append(queryChinesePronunciation[i]);
                }
                sb.append("\"");
                if (Engine.isInitialized()) {
                    C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
                    this.f11343D.setTextSize((float) ((int) (((1.0d * ((double) ad.mo9262t())) / ((double) ad.mo9227B())) * ((double) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.hw_mask_text_size)))));
                }
                canvas.drawText(sb.toString(), (float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.hw_mask_text_size), (float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.hw_mask_text_size), this.f11343D);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m11775d() {
        if (this.f11347t == null) {
            this.f11347t = new TextView(this.f11344q);
            this.f11347t.setId(1);
            this.f11347t.setTextColor(-1431655766);
            this.f11347t.setClickable(true);
            this.f11347t.setOnClickListener(new C2662aB(this));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins((int) (((double) getWidth()) * 0.2d), (int) (((double) getHeight()) * 0.2d), (int) (0.3d * ((double) getWidth())), (int) (0.4d * ((double) getHeight())));
        addView(this.f11347t, layoutParams);
    }

    /* renamed from: e */
    private void m11777e() {
        int i;
        int i2 = -2;
        if (this.f11349v == null) {
            this.f11349v = new ImageView(this.f11344q);
            this.f11349v.setId(2);
            this.f11349v.setImageResource(R.drawable.downloading_icon);
        }
        int intrinsicWidth = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.downloading_icon).getIntrinsicWidth();
        int height = (int) (((((double) getHeight()) * 0.7d) - ((double) intrinsicWidth)) / 2.0d);
        if (C1933b.m8860a() != 2 || !Engine.isInitialized() || Engine.getInstance().getKeyId("sk_sp") == -1) {
            i = -2;
        } else {
            int i3 = Engine.getInstance().getWidgetManager().mo9646f().mo9182b("sk_sp").height;
            intrinsicWidth = i3;
            i2 = i3;
            i = i3;
            height = 0;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        layoutParams.setMargins((int) (((1.0f * ((float) getWidth())) - ((float) intrinsicWidth)) / 2.0f), height, 0, 0);
        addView(this.f11349v, layoutParams);
    }

    /* renamed from: f */
    private void m11779f() {
        if (this.f11348u == null) {
            this.f11348u = new TextView(this.f11344q);
            this.f11348u.setId(3);
            this.f11348u.setText(m11767a((int) R.string.widget_title_hwmask));
            this.f11348u.setTextColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.hw_mask_text_color));
            this.f11348u.setTextSize(0, (float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.hw_mask_text_size));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(10, 10, 0, 0);
        addView(this.f11348u, layoutParams);
    }

    /* renamed from: g */
    private void m11780g() {
        this.f11342C = new Paint();
        this.f11342C.setColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.hw_mask_background_color));
    }

    /* renamed from: h */
    private void m11781h() {
        this.f11343D = new Paint();
        this.f11343D.setAntiAlias(true);
        this.f11343D.setColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.hw_mask_text_color));
        this.f11343D.setTextSize((float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.hw_mask_text_size));
    }

    private int getMaskMode() {
        switch (f11330g) {
            case 1:
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
                return 2;
            default:
                return 1;
        }
    }

    /* renamed from: i */
    private boolean m11782i() {
        int intSetting = Settings.getInstance().getIntSetting(Settings.MANUALLY_ENTER_HANDWRITE_MASK_TIMES);
        if (intSetting > 16 || intSetting <= this.f11345r) {
            removeView(this.f11348u);
            this.f11348u = null;
            return false;
        }
        this.f11345r = intSetting;
        return true;
    }

    /* renamed from: j */
    private void m11783j() {
        removeView(this.f11347t);
        removeView(this.f11349v);
        if (f11330g == 1 || f11330g == 3) {
            m11775d();
        } else if (f11330g == 2) {
            m11777e();
        } else if (f11330g == 4) {
            this.f11347t = null;
            this.f11349v = null;
            if (m11782i()) {
                m11773c();
            }
        }
    }
}
