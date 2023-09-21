package com.cootek.smartinput5.func.smileypanel.p056a;

import android.graphics.drawable.Drawable;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.smileypanel.a.a */
/* compiled from: EmojiArtCategory */
public enum C2006a implements C2008c {
    emoji_art_greeting(R.drawable.emoji_art_tab_greeting),
    emoji_art_fun(R.drawable.emoji_art_tab_fun),
    emoji_art_love(R.drawable.emoji_art_tab_love),
    emoji_art_holiday(R.drawable.emoji_art_tab_holiday),
    emoji_art_life(R.drawable.emoji_art_tab_life),
    emoji_art_school(R.drawable.emoji_art_tab_school);
    

    /* renamed from: g */
    private int f6976g;

    private C2006a(int i) {
        this.f6976g = i;
    }

    /* renamed from: a */
    public Drawable mo7358a() {
        return C1368X.m6320c().mo5841n().mo6249a(this.f6976g);
    }

    /* renamed from: b */
    public String mo7359b() {
        return toString();
    }
}
