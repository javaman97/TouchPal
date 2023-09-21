package com.yahoo.mobile.client.share.search.p099ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.util.C4247l;

/* renamed from: com.yahoo.mobile.client.share.search.ui.view.a */
public final class C4221a extends FrameLayout implements Checkable {

    /* renamed from: a */
    private View f17285a;

    /* renamed from: b */
    private TextView f17286b = new TextView(getContext());

    /* renamed from: c */
    private boolean f17287c;

    public C4221a(Context context, View view) {
        super(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C4073a.C4088o.SelectableCell, 0, 0);
        this.f17287c = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.f17285a = view;
        this.f17285a.setClickable(false);
        addView(this.f17285a);
        this.f17286b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f17286b.setBackgroundColor(getResources().getColor(C4073a.C4078e.selectable_container_view_overlay));
        this.f17286b.setTypeface(C4247l.m17792a(getContext()));
        this.f17286b.setText(getResources().getString(C4073a.C4086m.yssdk_checkmark_icon));
        this.f17286b.setTextColor(-1);
        this.f17286b.setGravity(17);
        this.f17286b.setTextSize(0, getResources().getDimension(C4073a.C4079f.yssdk_share_bar_font_icon_size));
        addView(this.f17286b);
        setChecked(this.f17287c);
    }

    public final void setChecked(boolean z) {
        this.f17287c = z;
        if (this.f17286b != null) {
            this.f17286b.setVisibility(z ? 0 : 4);
        }
    }

    public final boolean isChecked() {
        return this.f17287c;
    }

    public final void toggle() {
        if (this.f17287c) {
            setChecked(false);
        } else {
            setChecked(true);
        }
    }
}
