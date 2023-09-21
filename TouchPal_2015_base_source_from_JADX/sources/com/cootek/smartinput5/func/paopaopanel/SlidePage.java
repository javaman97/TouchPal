package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.paopaopanel.TouchPalHorizontalScrollView;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

public class SlidePage extends RelativeLayout implements TouchPalHorizontalScrollView.C1931c {

    /* renamed from: a */
    private Context f6525a;

    /* renamed from: b */
    private int f6526b;

    /* renamed from: c */
    private int f6527c;

    /* renamed from: d */
    private View f6528d;

    /* renamed from: e */
    private LinearLayout f6529e;

    /* renamed from: f */
    private TouchPalHorizontalScrollView f6530f;

    /* renamed from: g */
    private int f6531g;

    public SlidePage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6525a = context;
        m8820d();
    }

    public SlidePage(Context context) {
        super(context);
        this.f6525a = context;
        m8820d();
    }

    /* renamed from: d */
    private void m8820d() {
        this.f6528d = ((LayoutInflater) this.f6525a.getSystemService("layout_inflater")).inflate(R.layout.slide_page, (ViewGroup) null);
        this.f6530f = (TouchPalHorizontalScrollView) this.f6528d.findViewById(R.id.SlideView);
        this.f6529e = (LinearLayout) this.f6528d.findViewById(R.id.pagefooter_identifier);
        super.addView(this.f6528d);
        this.f6531g = R.drawable.slide_page_footer;
        this.f6526b = 0;
    }

    /* renamed from: a */
    public void mo4155a(int i) {
        if (i != this.f6527c) {
            this.f6527c = i;
            setIdentifierSelected(i);
        }
    }

    public void setPageListener(TouchPalHorizontalScrollView.C1931c cVar) {
        this.f6530f.setPageListener(cVar);
    }

    /* renamed from: a */
    public void mo7092a(View view) {
        if (view != null) {
            this.f6530f.mo7103a(view);
            m8819c(this.f6526b + 1);
            setIdentifierSelected(0);
        }
    }

    /* renamed from: a */
    public void mo7093a(ArrayList<View> arrayList) {
        if (arrayList != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < arrayList.size()) {
                    mo7092a(arrayList.get(i2));
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public void setIdentifierLayoutId(int i) {
        this.f6531g = i;
        m8821e();
    }

    /* renamed from: a */
    public void mo7090a() {
        this.f6530f.mo7101a();
    }

    /* renamed from: b */
    public void mo7094b() {
        this.f6530f.mo7104b();
    }

    /* renamed from: b */
    public void mo7095b(int i) {
        this.f6530f.mo7102a(i);
    }

    /* renamed from: a */
    public void mo7091a(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(i, i2, i3, i4);
        this.f6528d.findViewById(R.id.pagefooter_identifier).setLayoutParams(layoutParams);
        super.invalidate();
    }

    /* renamed from: e */
    private void m8821e() {
        if (this.f6529e != null) {
            this.f6529e.removeAllViews();
            for (int i = 0; i < this.f6526b; i++) {
                this.f6529e.addView(m8823g());
            }
        }
        setIdentifierSelected(0);
    }

    /* renamed from: c */
    private void m8819c(int i) {
        if (i > this.f6526b) {
            m8822f();
        }
        this.f6526b = i;
    }

    /* renamed from: f */
    private void m8822f() {
        this.f6529e.addView(m8823g());
    }

    /* renamed from: g */
    private View m8823g() {
        ImageView imageView = new ImageView(this.f6525a);
        imageView.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a(this.f6531g));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return imageView;
    }

    private void setIdentifierSelected(int i) {
        boolean z;
        if (this.f6526b <= 1) {
            this.f6529e.setVisibility(4);
            return;
        }
        this.f6529e.setVisibility(0);
        for (int i2 = 0; i2 < this.f6526b; i2++) {
            View childAt = this.f6529e.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setEnabled(z);
        }
    }

    public int getCurrentPageIndex() {
        return this.f6527c;
    }

    public int getTotalPageNumber() {
        return this.f6526b;
    }

    /* renamed from: c */
    public void mo7096c() {
        this.f6526b = 0;
        this.f6527c = 0;
        if (this.f6530f != null) {
            this.f6530f.mo7105c();
        }
        if (this.f6529e != null) {
            this.f6529e.removeAllViews();
        }
    }
}
