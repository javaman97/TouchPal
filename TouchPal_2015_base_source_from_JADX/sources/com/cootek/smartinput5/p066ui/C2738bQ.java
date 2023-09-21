package com.cootek.smartinput5.p066ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.smileypanel.SmileyListView;

/* renamed from: com.cootek.smartinput5.ui.bQ */
/* compiled from: SmileyCategoryScroll */
class C2738bQ implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f12233a;

    /* renamed from: b */
    final /* synthetic */ LinearLayout f12234b;

    /* renamed from: c */
    final /* synthetic */ RelativeLayout f12235c;

    /* renamed from: d */
    final /* synthetic */ SmileyCategoryScroll f12236d;

    C2738bQ(SmileyCategoryScroll smileyCategoryScroll, String str, LinearLayout linearLayout, RelativeLayout relativeLayout) {
        this.f12236d = smileyCategoryScroll;
        this.f12233a = str;
        this.f12234b = linearLayout;
        this.f12235c = relativeLayout;
    }

    public void onClick(View view) {
        Settings.getInstance().setStringSetting(Settings.CURRENT_SMILEY_CATEGORY, this.f12233a, 22, SmileyListView.m9205b(Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB)), (Config) null, false);
        if (this.f12236d.f11540j != null) {
            this.f12236d.f11540j.mo7314b();
        }
        for (int i = 0; i < this.f12234b.getChildCount(); i++) {
            this.f12234b.getChildAt(i).setSelected(false);
        }
        this.f12235c.setSelected(true);
        if (this.f12235c.getRight() > this.f12236d.getDisplayWidth() + this.f12236d.getScrollX()) {
            this.f12236d.scrollTo(this.f12235c.getRight() - this.f12236d.getMeasuredWidth(), 0);
        } else if (this.f12235c.getLeft() < this.f12236d.getScrollX()) {
            this.f12236d.scrollTo(this.f12235c.getLeft(), 0);
        }
    }
}
