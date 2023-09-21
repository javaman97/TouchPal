package com.cootek.smartinput5.p066ui.p068b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.presentation.sdk.PresentationManager;
import com.emoji.keyboard.touchpal.R;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.cootek.smartinput5.ui.b.a */
/* compiled from: AbsGuidePoint */
public abstract class C2716a implements C2719d, C2720e {

    /* renamed from: a */
    private static final String f12117a = "AbsGuidePoint";

    /* renamed from: b */
    private static final RelativeLayout.LayoutParams f12118b = new RelativeLayout.LayoutParams(-1, -1);

    /* renamed from: c */
    private final String f12119c;

    /* renamed from: d */
    private Vector<C2720e> f12120d = new Vector<>();

    /* renamed from: e */
    private boolean f12121e = false;

    /* renamed from: f */
    private Context f12122f;

    /* renamed from: g */
    private int f12123g = 0;

    /* renamed from: k */
    protected View f12124k = null;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo7113a(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo7116a(Context context, int i, View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo7117a(Context context, View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo7118a(Context context, View view, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract View mo7120b(Context context, View view);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract View mo7121c(Context context, View view);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract View mo7122d(Context context, View view);

    public C2716a(Context context, String str) {
        this.f12119c = str;
        this.f12122f = context;
    }

    /* renamed from: f */
    public final View mo8981f() {
        View view = this.f12124k;
        if (view == null) {
            view = mo7113a(this.f12122f);
        }
        this.f12124k = m12461a(view);
        return this.f12124k;
    }

    /* renamed from: g */
    public final void mo8982g() {
        this.f12124k = m12461a(this.f12124k);
    }

    /* renamed from: e */
    public void mo8891e() {
        if (mo9079a(this.f12123g)) {
            PresentationManager.guidePointClicked(this.f12119c, this.f12123g);
        }
        mo8982g();
        mo7164b();
    }

    /* renamed from: d */
    public void mo8890d() {
        if (mo9079a(this.f12123g)) {
            PresentationManager.guidePointShown(this.f12119c, this.f12123g);
        }
    }

    /* renamed from: c */
    public final void mo8979c(boolean z) {
        this.f12124k = mo7118a(this.f12122f, this.f12124k, z);
        this.f12121e = z;
    }

    /* renamed from: h */
    public final boolean mo8983h() {
        return this.f12121e;
    }

    /* renamed from: a */
    public final void mo8977a(C2720e eVar) {
        if (eVar != null && !this.f12120d.contains(eVar)) {
            this.f12120d.add(eVar);
        }
    }

    /* renamed from: b */
    public final void mo8978b(C2720e eVar) {
        this.f12120d.remove(eVar);
    }

    /* renamed from: i */
    public final String mo8984i() {
        return this.f12119c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public View mo8980e(Context context, View view) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.addView(view, f12118b);
        LinearLayout linearLayout = new LinearLayout(context);
        view.measure(0, 0);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(view.getMeasuredWidth(), view.getMeasuredHeight()));
        linearLayout.setBackgroundResource(R.drawable.new_tag);
        relativeLayout.addView(linearLayout);
        return relativeLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Context mo8985j() {
        return this.f12122f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo8986k() {
        return this.f12123g;
    }

    /* renamed from: a */
    private View m12461a(View view) {
        return m12462a((C2719d) this, view);
    }

    /* renamed from: a */
    private View m12462a(C2719d dVar, View view) {
        if (dVar == null || view == null) {
            return null;
        }
        String i = dVar.mo8984i();
        this.f12123g = mo9083a(i);
        switch (this.f12123g) {
            case -1:
                return mo7122d(this.f12122f, view);
            case 0:
                return mo7120b(this.f12122f, view);
            case 1:
                return mo7117a(this.f12122f, view);
            case 2:
                return mo7121c(this.f12122f, view);
            case 3:
                return mo7116a(this.f12122f, m12464b(i), view);
            default:
                return null;
        }
    }

    /* renamed from: a */
    private int mo9083a(String str) {
        try {
            return PresentationManager.getGuidePointType(str);
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: b */
    private int m12464b(String str) {
        return PresentationManager.getGuidePointNumber(str);
    }

    /* renamed from: b */
    private void mo7164b() {
        Iterator<C2720e> it = this.f12120d.iterator();
        while (it.hasNext()) {
            it.next().mo7123f_();
        }
    }

    /* renamed from: a */
    private boolean mo9079a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8976a(TextView textView, String str) {
        int i;
        int i2;
        textView.setText(str);
        if (TextUtils.isEmpty(str)) {
            i = R.dimen.guidepoint_dot_height;
            i2 = R.dimen.guidepoint_dot_width;
        } else {
            i = R.dimen.guidepoint_num_height;
            i2 = R.dimen.guidepoint_num_width;
        }
        Resources resources = mo8985j().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = dimensionPixelSize;
            layoutParams.width = dimensionPixelSize2;
            textView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: l */
    public boolean mo8987l() {
        return mo9079a(this.f12123g);
    }
}
