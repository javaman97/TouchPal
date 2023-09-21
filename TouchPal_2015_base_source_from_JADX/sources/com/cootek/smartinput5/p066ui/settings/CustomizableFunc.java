package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.emoji.keyboard.touchpal.C3305b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.CustomizableFunc */
public class CustomizableFunc {

    /* renamed from: o */
    private static final int f13410o = 6;

    /* renamed from: a */
    protected Preference f13411a;

    /* renamed from: b */
    private final int f13412b;

    /* renamed from: c */
    private final int f13413c;

    /* renamed from: d */
    private Context f13414d;

    /* renamed from: e */
    private int f13415e;

    /* renamed from: f */
    private int f13416f;

    /* renamed from: g */
    private boolean f13417g;

    /* renamed from: h */
    private float f13418h = -1.0f;

    /* renamed from: i */
    private float f13419i = -1.0f;

    /* renamed from: j */
    private int f13420j = 0;

    /* renamed from: k */
    private int f13421k = 0;

    /* renamed from: l */
    private int f13422l = -1;

    /* renamed from: m */
    private int f13423m = -1;

    /* renamed from: n */
    private int f13424n;

    public CustomizableFunc(Context context, AttributeSet attributeSet) {
        this.f13414d = context;
        this.f13412b = context.getResources().getDimensionPixelOffset(R.dimen.customizable_preference_indent);
        this.f13413c = context.getResources().getDimensionPixelSize(R.dimen.customizable_preference_textsize_shrink);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3305b.C3322q.CustomizablePreference);
            this.f13415e = obtainStyledAttributes.getInteger(0, 1);
            this.f13416f = obtainStyledAttributes.getResourceId(1, 0);
            this.f13417g = obtainStyledAttributes.getBoolean(2, true);
            this.f13421k = obtainStyledAttributes.getInteger(3, 0);
            this.f13424n = obtainStyledAttributes.getResourceId(4, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo9806a(int i) {
        this.f13415e = i;
    }

    /* renamed from: b */
    public void mo9810b(int i) {
        this.f13416f = i;
    }

    /* renamed from: a */
    public void mo9808a(Preference preference) {
        this.f13411a = preference;
    }

    /* renamed from: a */
    public void mo9807a(int i, float f) {
        this.f13420j = i;
        this.f13418h = f;
    }

    /* renamed from: a */
    public void mo9809a(View view) {
        ViewGroup viewGroup;
        int i;
        float f = 10.0f;
        if (view != null) {
            view.setOnTouchListener(new C3028an(this));
            TextView textView = (TextView) view.findViewById(16908310);
            if (textView != null) {
                if (this.f13416f != 0) {
                    textView.setTextAppearance(this.f13414d, this.f13416f);
                }
                if (this.f13417g) {
                    i = 6;
                } else {
                    i = this.f13415e;
                }
                if (i > 1) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(i);
                    textView.setEllipsize((TextUtils.TruncateAt) null);
                }
                if (this.f13421k > 0) {
                    if (this.f13422l == -1) {
                        this.f13422l = textView.getPaddingLeft() + (this.f13412b * this.f13421k);
                    }
                    textView.setPadding(this.f13422l, textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
                    if (this.f13418h == -1.0f) {
                        float textSize = textView.getTextSize() - ((float) this.f13413c);
                        if (textSize <= 10.0f) {
                            textSize = 10.0f;
                        }
                        this.f13418h = textSize;
                        this.f13420j = 0;
                    }
                }
                if (this.f13418h != -1.0f) {
                    textView.setTextSize(this.f13420j, this.f13418h);
                }
            }
            TextView textView2 = (TextView) view.findViewById(16908304);
            if (textView2 != null) {
                if (this.f13421k > 0) {
                    if (this.f13423m == -1) {
                        this.f13423m = textView2.getPaddingLeft() + (this.f13412b * this.f13421k);
                    }
                    textView2.setPadding(this.f13423m, textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
                    if (this.f13419i == -1.0f) {
                        float textSize2 = textView2.getTextSize() - ((float) this.f13413c);
                        if (textSize2 > 10.0f) {
                            f = textSize2;
                        }
                        this.f13419i = f;
                    }
                }
                if (this.f13419i != -1.0f) {
                    textView2.setTextSize(0, this.f13419i);
                }
            }
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(16908312);
            if (!(viewGroup2 == null || (viewGroup = (ViewGroup) viewGroup2.getParent()) == null)) {
                if (this.f13424n > 0) {
                    int paddingLeft = viewGroup.getPaddingLeft();
                    int paddingRight = viewGroup.getPaddingRight();
                    int paddingTop = viewGroup.getPaddingTop();
                    int paddingBottom = viewGroup.getPaddingBottom();
                    viewGroup.setBackgroundResource(this.f13424n);
                    viewGroup.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                } else {
                    viewGroup.setBackgroundResource(0);
                }
            }
            if (this.f13411a != null) {
                View inflate = LayoutInflater.from(this.f13414d).inflate(this.f13411a.getLayoutResource(), (ViewGroup) view.getParent(), false);
                if (view != null && inflate != null) {
                    view.setPadding(inflate.getPaddingLeft(), inflate.getPaddingTop(), inflate.getPaddingRight(), inflate.getPaddingBottom());
                    TextView textView3 = (TextView) inflate.findViewById(16908310);
                    if (textView != null && textView3 != null) {
                        textView.setLayoutParams(textView3.getLayoutParams());
                        ((View) textView.getParent()).setLayoutParams(((View) textView3.getParent()).getLayoutParams());
                        textView.setTextSize(0, textView3.getTextSize());
                    }
                }
            }
        }
    }
}
