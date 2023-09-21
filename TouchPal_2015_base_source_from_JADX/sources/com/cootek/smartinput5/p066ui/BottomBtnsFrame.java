package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.BottomBtnsFrame */
public class BottomBtnsFrame extends LinearLayout {

    /* renamed from: a */
    private Button f11157a;

    /* renamed from: b */
    private Button f11158b;

    /* renamed from: c */
    private View f11159c;

    public BottomBtnsFrame(Context context) {
        super(context);
        m11572b();
    }

    public BottomBtnsFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11572b();
    }

    /* renamed from: b */
    private void m11572b() {
        int i = R.id.right;
        int i2 = R.id.left;
        addView(((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.bottom_btns_frame, (ViewGroup) null));
        if (Build.VERSION.SDK_INT < 14) {
            int i3 = R.id.right;
            i = R.id.left;
            i2 = i3;
        }
        this.f11157a = (Button) findViewById(i);
        this.f11158b = (Button) findViewById(i2);
        this.f11157a.setText(C1974m.m9063a(getContext(), (int) R.string.ok));
        this.f11158b.setText(C1974m.m9063a(getContext(), (int) R.string.cancel));
        this.f11159c = findViewById(R.id.bottom_divider);
    }

    public Button getPositiveBtn() {
        return this.f11157a;
    }

    public Button getNegertiveBtn() {
        return this.f11158b;
    }

    /* renamed from: a */
    public void mo8486a() {
        if (this.f11157a.getVisibility() == 0 && this.f11158b.getVisibility() == 0) {
            this.f11159c.setVisibility(0);
        } else {
            this.f11159c.setVisibility(8);
        }
    }
}
