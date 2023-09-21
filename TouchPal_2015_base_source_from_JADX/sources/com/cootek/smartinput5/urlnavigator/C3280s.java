package com.cootek.smartinput5.urlnavigator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cootek.smartinput5.engine.Engine;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.urlnavigator.s */
/* compiled from: URLNavigatorView */
public class C3280s {

    /* renamed from: a */
    private View f14403a;

    /* renamed from: b */
    private C3267g f14404b;

    /* renamed from: a */
    public View mo10476a(Context context) {
        ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.url_navigator_view, (ViewGroup) null);
        this.f14404b = new C3267g();
        this.f14404b.mo10456a(context, viewGroup.findViewById(R.id.faviconView));
        this.f14403a = viewGroup;
        return viewGroup;
    }

    /* renamed from: a */
    public void mo10477a() {
        this.f14404b.mo10458b();
        ((ViewGroup) this.f14403a.getParent()).removeView(this.f14403a);
    }

    /* renamed from: b */
    public void mo10479b() {
    }

    /* renamed from: c */
    public View mo10480c() {
        return this.f14403a;
    }

    /* renamed from: a */
    public void mo10478a(int i) {
        switch (i) {
            case Engine.KEYCODE_FUN_PREV:
                this.f14404b.mo10460d();
                return;
            case Engine.KEYCODE_FUN_NEXT:
                this.f14404b.mo10459c();
                return;
            default:
                return;
        }
    }
}
