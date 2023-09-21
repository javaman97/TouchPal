package com.cootek.smartinput5.func;

import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.G */
/* compiled from: CustomSkinColorSet */
public enum C1345G {
    SKIN_COLOR_SET_BLACK(R.color.customize_black_text, R.color.customize_black_icon, R.color.customize_black_highlight_text, R.color.customize_black_selected_text),
    SKIN_COLOR_SET_RED(R.color.customize_red_text, R.color.customize_red_icon, R.color.customize_red_highlight_text, R.color.customize_red_selected_text),
    SKIN_COLOR_SET_ORANGE(R.color.customize_orange_text, R.color.customize_orange_icon, R.color.customize_orange_highlight_text, R.color.customize_orange_selected_text),
    SKIN_COLOR_SET_YELLOW(R.color.customize_yellow_text, R.color.customize_yellow_icon, R.color.customize_yellow_highlight_text, R.color.customize_yellow_selected_text),
    SKIN_COLOR_SET_GREEN(R.color.customize_green_text, R.color.customize_green_icon, R.color.customize_green_highlight_text, R.color.customize_green_selected_text),
    SKIN_COLOR_SET_BLUE(R.color.customize_blue_text, R.color.customize_blue_icon, R.color.customize_blue_highlight_text, R.color.customize_blue_selected_text),
    SKIN_COLOR_SET_WHITE(R.color.customize_white_text, R.color.customize_white_icon, R.color.customize_white_highlight_text, R.color.customize_white_selected_text);
    

    /* renamed from: h */
    private int f4118h;

    /* renamed from: i */
    private int f4119i;

    /* renamed from: j */
    private int f4120j;

    /* renamed from: k */
    private int f4121k;

    /* renamed from: com.cootek.smartinput5.func.G$a */
    /* compiled from: CustomSkinColorSet */
    public enum C1347a {
        NORMAL,
        HIGHLIGHT,
        SELECTED,
        TRANSPARENT,
        NONE
    }

    private C1345G(int i, int i2, int i3, int i4) {
        this.f4118h = i;
        this.f4119i = i2;
        this.f4120j = i3;
        this.f4121k = i4;
    }

    /* renamed from: a */
    public int mo5588a() {
        return this.f4118h;
    }

    /* renamed from: b */
    public int mo5590b() {
        return this.f4119i;
    }

    /* renamed from: c */
    public int mo5591c() {
        return this.f4120j;
    }

    /* renamed from: d */
    public int mo5592d() {
        return this.f4121k;
    }

    /* renamed from: a */
    public int mo5589a(C1347a aVar) {
        if (aVar == null) {
            return 0;
        }
        switch (aVar) {
            case NORMAL:
                return this.f4119i;
            case HIGHLIGHT:
                return this.f4120j;
            case SELECTED:
                return this.f4121k;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static C1345G m6154a(String str) {
        try {
            C1345G valueOf = valueOf(str);
            if (valueOf == null) {
                return SKIN_COLOR_SET_BLACK;
            }
            return valueOf;
        } catch (Exception e) {
            return SKIN_COLOR_SET_BLACK;
        }
    }
}
