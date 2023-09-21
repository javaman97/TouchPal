package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.interfaces.IFooterViewHolder;
import com.yahoo.mobile.client.share.search.interfaces.ISearchVertical;
import com.yahoo.mobile.client.share.search.interfaces.ITabController;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.FooterViewHolder */
public class FooterViewHolder extends RelativeLayout implements IFooterViewHolder {

    /* renamed from: a */
    private static final String f9098a = "sch_shr_web_screen";

    /* renamed from: b */
    private static final String f9099b = "sch_shr_image_screen";

    /* renamed from: c */
    private static final String f9100c = "sch_shr_video_screen";

    /* renamed from: d */
    private static final String f9101d = "sch_shr_translation_screen";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f9102e;

    /* renamed from: f */
    private LayoutInflater f9103f;

    /* renamed from: g */
    private View f9104g;

    /* renamed from: h */
    private LinearLayout f9105h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ArrayList<ISearchVertical> f9106i;

    /* renamed from: j */
    private int f9107j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ITabController f9108k;

    /* renamed from: l */
    private float f9109l = 0.0f;

    public FooterViewHolder(Context context) {
        super(context);
        m9710a(context);
    }

    public FooterViewHolder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9102e = context;
        m9710a(context);
    }

    public FooterViewHolder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9102e = context;
        m9710a(context);
    }

    /* renamed from: a */
    private void m9710a(Context context) {
        this.f9102e = context;
        this.f9103f = (LayoutInflater) this.f9102e.getSystemService("layout_inflater");
        this.f9106i = new ArrayList<>();
    }

    public void addTab(ISearchVertical iSearchVertical) {
        this.f9106i.add(iSearchVertical);
        setTabs(this.f9106i);
    }

    public void onTabChanged(float f) {
        int i;
        if (this.f9106i != null && this.f9106i.size() != 0 && this.f9105h != null) {
            int floor = (int) Math.floor((double) f);
            if (((double) (f - ((float) floor))) > 0.5d) {
                i = floor + 1;
            } else if (((double) (f - ((float) floor))) < -0.5d) {
                i = floor - 1;
            } else {
                i = floor;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9104g.getLayoutParams();
            if (Math.abs(f - this.f9109l) < 0.5f || f != ((float) ((int) Math.floor((double) f)))) {
                layoutParams.leftMargin = (int) (((float) this.f9107j) * f);
                this.f9109l = f;
            }
            this.f9104g.setLayoutParams(layoutParams);
            int i2 = 0;
            while (i2 < this.f9105h.getChildCount()) {
                View childAt = this.f9105h.getChildAt(i2);
                if (childAt != null) {
                    childAt.setSelected(i2 == i);
                }
                i2++;
            }
        }
    }

    public void setTabController(ITabController iTabController) {
        this.f9108k = iTabController;
    }

    public void setTabs(List<ISearchVertical> list) {
        this.f9106i = new ArrayList<>(list);
        if (this.f9104g == null) {
            this.f9104g = findViewById(R.id.search_bar_cursor);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f9102e.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f9107j = displayMetrics.widthPixels / list.size();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9104g.getLayoutParams();
        layoutParams.width = this.f9107j;
        this.f9104g.setLayoutParams(layoutParams);
        if (this.f9105h == null) {
            this.f9105h = (LinearLayout) findViewById(R.id.footer_tab_container);
        }
        this.f9105h.removeAllViews();
        this.f9105h.setWeightSum((float) list.size());
        for (ISearchVertical next : list) {
            SearchTabView searchTabView = (SearchTabView) this.f9103f.inflate(R.layout.footer_tab, (ViewGroup) null);
            searchTabView.setTitle(next.getLabel(this.f9102e));
            searchTabView.setIcon(m9708a(next.getVerticalId()));
            if (list.indexOf(next) == list.size() - 1) {
                searchTabView.mo7571a(false);
            }
            searchTabView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            if (this.f9108k != null) {
                searchTabView.setOnClickListener(new C2146a(this, list.indexOf(next)));
            }
            this.f9105h.addView(searchTabView);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int dimensionPixelOffset = this.f9102e.getResources().getDimensionPixelOffset(R.dimen.search_bar_height);
        if (i2 > dimensionPixelOffset) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, dimensionPixelOffset);
            layoutParams.topMargin = i2 - dimensionPixelOffset;
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private Drawable m9708a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(f9098a)) {
            return this.f9102e.getResources().getDrawable(R.drawable.search_web);
        }
        if (str.equalsIgnoreCase(f9099b)) {
            return this.f9102e.getResources().getDrawable(R.drawable.search_photo);
        }
        if (str.equalsIgnoreCase(f9100c)) {
            return this.f9102e.getResources().getDrawable(R.drawable.search_video);
        }
        if (str.equalsIgnoreCase(f9101d)) {
            return this.f9102e.getResources().getDrawable(R.drawable.search_translate);
        }
        return null;
    }
}
