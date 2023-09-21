package com.cootek.smartinput5.func.smileypanel.p056a;

import android.graphics.drawable.Drawable;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.smileypanel.a.b */
/* compiled from: EmoticonCategory */
public enum C2007b implements C2008c {
    horizontal(R.drawable.emoticon_horizontal),
    happy(R.drawable.emoticon_happy),
    wired(R.drawable.emoticon_wired),
    negative(R.drawable.emoticon_negative),
    love(R.drawable.emoticon_love),
    art(R.drawable.emoticon_art);
    

    /* renamed from: g */
    private final int f6984g;

    private C2007b(int i) {
        this.f6984g = i;
    }

    /* renamed from: a */
    public Drawable mo7358a() {
        return C1368X.m6320c().mo5841n().mo6249a(this.f6984g);
    }

    /* renamed from: b */
    public String mo7359b() {
        return toString();
    }
}
