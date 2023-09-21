package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.p066ui.C2725bE;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.SearchTabView */
public class SearchTabView extends RelativeLayout {

    /* renamed from: a */
    private Context f9122a;

    /* renamed from: b */
    private ImageView f9123b;

    /* renamed from: c */
    private TextView f9124c;

    public SearchTabView(Context context) {
        super(context);
        this.f9122a = context;
    }

    public SearchTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9122a = context;
    }

    public void setIcon(Drawable drawable) {
        ImageView imageView = (ImageView) findViewById(R.id.tab_icon);
        if (imageView != null && drawable != null) {
            drawable.clearColorFilter();
            imageView.setImageDrawable(drawable);
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        m9729b(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f9123b == null) {
            this.f9123b = (ImageView) findViewById(R.id.tab_icon);
        }
        if (!(this.f9123b == null || this.f9123b.getDrawable() == null)) {
            this.f9123b.setImageDrawable(m9728a(this.f9123b.getDrawable(), false, z));
        }
        if (this.f9124c == null) {
            this.f9124c = (TextView) findViewById(R.id.tab_title);
        }
        if (z) {
            this.f9124c.setTextColor(this.f9122a.getResources().getColor(R.color.search_bottom_text_color));
        } else {
            this.f9124c.setTextColor(this.f9122a.getResources().getColor(R.color.search_disable_color));
        }
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        m9729b(z || super.isSelected());
    }

    /* renamed from: a */
    public void mo7571a(boolean z) {
        View findViewById = findViewById(R.id.search_bar_divider);
        if (z) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
    }

    public void setTitle(String str) {
        if (this.f9124c == null) {
            this.f9124c = (TextView) findViewById(R.id.tab_title);
        }
        this.f9124c.setText(str);
        if (TextUtils.isEmpty(str)) {
            this.f9124c.setVisibility(8);
        }
    }

    /* renamed from: b */
    private void m9729b(boolean z) {
        if (this.f9123b == null) {
            this.f9123b = (ImageView) findViewById(R.id.tab_icon);
        }
        if (!(this.f9123b == null || this.f9123b.getDrawable() == null)) {
            this.f9123b.setImageDrawable(m9728a(this.f9123b.getDrawable(), z, true));
        }
        if (this.f9124c == null) {
            this.f9124c = (TextView) findViewById(R.id.tab_title);
        }
        if (!z) {
            this.f9124c.setTextColor(this.f9122a.getResources().getColor(R.color.search_bottom_text_color));
        } else {
            this.f9124c.setTextColor(this.f9122a.getResources().getColor(R.color.search_highlight_color));
        }
    }

    /* renamed from: a */
    private Drawable m9728a(Drawable drawable, boolean z, boolean z2) {
        if (!z && z2) {
            drawable.clearColorFilter();
            return drawable;
        } else if (z) {
            C2725bE bEVar = new C2725bE();
            bEVar.mo8998b(this.f9122a.getResources().getColor(R.color.search_icon_color), this.f9122a.getResources().getColor(R.color.search_highlight_color));
            return bEVar.mo8995a(drawable);
        } else {
            C2725bE bEVar2 = new C2725bE();
            bEVar2.mo8998b(this.f9122a.getResources().getColor(R.color.search_icon_color), this.f9122a.getResources().getColor(R.color.search_disable_color));
            return bEVar2.mo8995a(drawable);
        }
    }
}
