package com.cootek.smartinput5.func.smileypanel.p056a;

import android.graphics.drawable.Drawable;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.smileypanel.a.d */
/* compiled from: NormalEmojiCategory */
public enum C2009d implements C2008c {
    f6985a(R.drawable.emoji_recent),
    people(R.drawable.emoji_people),
    nature(R.drawable.emoji_nature),
    objects(R.drawable.emoji_objects),
    places(R.drawable.emoji_places),
    symbols(R.drawable.emoji_symbols);
    

    /* renamed from: g */
    private int f6992g;

    private C2009d(int i) {
        this.f6992g = i;
    }

    /* renamed from: a */
    public Drawable mo7358a() {
        return C1368X.m6320c().mo5841n().mo6249a(this.f6992g);
    }

    /* renamed from: b */
    public String mo7359b() {
        return toString();
    }
}
