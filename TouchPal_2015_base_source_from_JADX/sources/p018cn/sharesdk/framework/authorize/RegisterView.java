package p018cn.sharesdk.framework.authorize;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p018cn.sharesdk.framework.TitleLayout;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.authorize.RegisterView */
public class RegisterView extends ResizeLayout {

    /* renamed from: a */
    private TitleLayout f1482a;

    /* renamed from: b */
    private RelativeLayout f1483b;

    /* renamed from: c */
    private WebView f1484c;

    public RegisterView(Context context) {
        super(context);
        m3563a(context);
    }

    public RegisterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3563a(context);
    }

    /* renamed from: a */
    private void m3563a(Context context) {
        setBackgroundColor(-1);
        setOrientation(1);
        int b = m3564b(context);
        this.f1482a = new TitleLayout(context);
        try {
            this.f1482a.setBackgroundResource(C0661R.getBitmapRes(context, "ssdk_auth_title_back"));
        } catch (Throwable th) {
            C0666e.m3838b(th);
        }
        this.f1482a.getBtnRight().setVisibility(8);
        this.f1482a.getTvTitle().setText(C0661R.getStringRes(getContext(), "weibo_oauth_regiseter"));
        addView(this.f1482a);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(C0661R.getBitmapRes(context, "ssdk_logo"));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setPadding(0, 0, C0661R.dipToPx(context, 10), 0);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        imageView.setOnClickListener(new C0623c(this));
        this.f1482a.addView(imageView);
        this.f1483b = new RelativeLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        this.f1483b.setLayoutParams(layoutParams);
        addView(this.f1483b);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f1483b.addView(linearLayout);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, 5));
        textView.setBackgroundColor(-12929302);
        linearLayout.addView(textView);
        textView.setVisibility(8);
        this.f1484c = new WebView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        this.f1484c.setLayoutParams(layoutParams2);
        this.f1484c.setWebChromeClient(new C0624d(this, textView, b));
        linearLayout.addView(this.f1484c);
        this.f1484c.requestFocus();
    }

    /* renamed from: b */
    private int m3564b(Context context) {
        WindowManager windowManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!(context instanceof Activity) || (windowManager = ((Activity) context).getWindowManager()) == null) {
            return 0;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* renamed from: a */
    public View mo2246a() {
        return this.f1482a.getBtnBack();
    }

    /* renamed from: a */
    public void mo2247a(boolean z) {
        this.f1482a.setVisibility(z ? 8 : 0);
    }

    /* renamed from: b */
    public WebView mo2248b() {
        return this.f1484c;
    }

    /* renamed from: c */
    public TitleLayout mo2249c() {
        return this.f1482a;
    }

    /* renamed from: d */
    public RelativeLayout mo2250d() {
        return this.f1483b;
    }
}
