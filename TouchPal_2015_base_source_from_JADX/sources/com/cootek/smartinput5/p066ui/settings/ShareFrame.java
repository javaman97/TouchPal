package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.ShareFrame */
public class ShareFrame extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f13617a;

    /* renamed from: b */
    private TextView f13618b;

    /* renamed from: c */
    private TextView f13619c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f13620d;

    public ShareFrame(Context context) {
        super(context);
        m13960a(context);
    }

    public ShareFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13960a(context);
    }

    public ShareFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13960a(context);
    }

    /* renamed from: a */
    private void m13960a(Context context) {
        if (!C1368X.m6320c().mo5827M().mo5992a()) {
            setVisibility(8);
        }
        this.f13617a = context;
        View inflate = ((LayoutInflater) this.f13617a.getSystemService("layout_inflater")).inflate(R.layout.share_limit, (ViewGroup) null);
        inflate.setOnTouchListener(new C3144ck(this));
        inflate.setOnClickListener(new C3145cl(this));
        addView(inflate, new RelativeLayout.LayoutParams(-1, -2));
        this.f13618b = (TextView) inflate.findViewById(R.id.title);
        this.f13619c = (TextView) inflate.findViewById(R.id.summary);
        if (this.f13619c != null) {
            this.f13619c.setText(C1974m.m9063a(this.f13617a, (int) R.string.optpage_unlock_limitation));
        }
    }

    public void setTitle(String str) {
        if (this.f13618b != null) {
            this.f13618b.setText(str);
        }
    }

    public void setSummary(String str) {
        if (this.f13619c != null) {
            this.f13619c.setText(str);
        }
    }

    /* renamed from: a */
    public void mo9959a(int i) {
        int i2;
        if (i > 0) {
            this.f13620d = false;
        } else {
            this.f13620d = true;
        }
        if (this.f13620d) {
            i2 = R.color.share_limit_warning;
        } else {
            i2 = R.color.share_limit_normal;
        }
        setBackgroundColor(this.f13617a.getResources().getColor(i2));
    }
}
