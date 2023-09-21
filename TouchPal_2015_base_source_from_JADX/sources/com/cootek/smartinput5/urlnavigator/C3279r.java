package com.cootek.smartinput5.urlnavigator;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.cootek.smartinput5.urlnavigator.C3274n;
import com.emoji.keyboard.touchpal.R;
import java.io.File;

/* renamed from: com.cootek.smartinput5.urlnavigator.r */
/* compiled from: RecommendedView */
public class C3279r implements C3274n.C3275a {

    /* renamed from: a */
    private Context f14401a;

    /* renamed from: b */
    private WebView f14402b;

    /* renamed from: a */
    public void mo10474a(Context context, View view) {
        this.f14401a = context;
        this.f14402b = (WebView) view;
        this.f14402b.getSettings().setJavaScriptEnabled(true);
        this.f14402b.addJavascriptInterface(new RecommendedURLHandler(), "hyperlinkHandler");
        this.f14402b.getSettings().setDefaultFontSize(this.f14401a.getResources().getDimensionPixelSize(R.dimen.url_navigator_textsize));
        m14546c();
        C3274n.m14529a(this.f14401a).mo10466a((C3274n.C3275a) this);
    }

    /* renamed from: b */
    public void mo10475b() {
        C3274n.m14528a().mo10468b((C3274n.C3275a) this);
    }

    /* renamed from: c */
    private String m14546c() {
        String c;
        if (new File(C3278q.m14544b(this.f14401a)).exists()) {
            c = C3278q.m14543a(this.f14401a);
        } else {
            c = C3278q.m14545c(this.f14401a);
        }
        this.f14402b.loadUrl(c);
        return c;
    }

    /* renamed from: a */
    public void mo10469a() {
        m14546c();
    }
}
