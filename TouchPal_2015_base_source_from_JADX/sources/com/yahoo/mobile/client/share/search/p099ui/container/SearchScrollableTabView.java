package com.yahoo.mobile.client.share.search.p099ui.container;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.interfaces.IFooterViewHolder;
import com.yahoo.mobile.client.share.search.interfaces.ISearchVertical;
import com.yahoo.mobile.client.share.search.interfaces.ITabController;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.util.List;

/* renamed from: com.yahoo.mobile.client.share.search.ui.container.SearchScrollableTabView */
public class SearchScrollableTabView extends LinearLayout implements View.OnClickListener, IFooterViewHolder {

    /* renamed from: a */
    private ITabController f17124a;

    /* renamed from: b */
    private List<ISearchVertical> f17125b;

    /* renamed from: c */
    private int f17126c;

    /* renamed from: d */
    private int f17127d;

    /* renamed from: e */
    private HorizontalScrollView f17128e;

    /* renamed from: f */
    private View f17129f;

    public SearchScrollableTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchScrollableTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m17652a(List<ISearchVertical> list) {
        this.f17125b = list;
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        LinearLayout linearLayout = (LinearLayout) findViewById(C4073a.C4081h.search_pager_tab_label_container);
        linearLayout.removeAllViews();
        this.f17128e = (HorizontalScrollView) findViewById(C4073a.C4081h.scrollable_tab_container);
        int screenWidth = Utils.getScreenWidth(getContext());
        if (this.f17125b.size() <= 3) {
            this.f17126c = screenWidth / this.f17125b.size();
        } else {
            this.f17126c = screenWidth / 3;
        }
        int i = 0;
        for (ISearchVertical label : this.f17125b) {
            TextView textView = (TextView) layoutInflater.inflate(C4073a.C4083j.yssdk_search_tab, (ViewGroup) null);
            textView.setText(label.getLabel(getContext()));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f17126c, -1);
            textView.setOnClickListener(this);
            textView.setTag(Integer.valueOf(i));
            linearLayout.addView(textView, layoutParams);
            i++;
        }
        this.f17126c = (this.f17126c * i) / linearLayout.getChildCount();
        new StringBuilder("width").append(this.f17126c);
        this.f17129f = findViewById(C4073a.C4081h.search_pager_tab_indicator);
        ViewGroup.LayoutParams layoutParams2 = this.f17129f.getLayoutParams();
        layoutParams2.width = this.f17126c;
        this.f17129f.setLayoutParams(layoutParams2);
        if (this.f17125b.size() == 1) {
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            layoutParams3.height = 0;
            setLayoutParams(layoutParams3);
        }
    }

    /* renamed from: a */
    private void m17651a(int i, int i2, boolean z) {
        TextView textView = (TextView) ((LinearLayout) findViewById(C4073a.C4081h.search_pager_tab_label_container)).getChildAt(i);
        if (textView != null) {
            textView.setTextColor(i2);
            if (z) {
                textView.setTypeface((Typeface) null, 1);
            } else {
                textView.setTypeface((Typeface) null, 0);
            }
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    private void m17650a(float f) {
        this.f17129f.setTranslationX(((float) this.f17126c) * f);
        this.f17128e.smoothScrollTo(((int) (((float) this.f17126c) * f)) - this.f17126c, 0);
    }

    public void onClick(View view) {
        int intValue;
        if ((view instanceof TextView) && (intValue = ((Integer) view.getTag()).intValue()) >= 0) {
            this.f17124a.changeTab(intValue);
        }
    }

    public void setTabController(ITabController iTabController) {
        this.f17124a = iTabController;
    }

    public void setTabs(List<ISearchVertical> list) {
        m17652a(list);
    }

    public void addTab(ISearchVertical iSearchVertical) {
        this.f17125b.add(iSearchVertical);
        m17652a(this.f17125b);
    }

    public void onTabChanged(float f) {
        int i = (int) f;
        if (Math.abs(f - ((float) i)) >= 1.0E-4f) {
            m17650a(f);
        } else if (this.f17125b != null) {
            for (int i2 = 0; i2 < this.f17125b.size(); i2++) {
                if (i2 == i) {
                    m17651a(i2, getResources().getColor(C4073a.C4078e.search_tab_selected), true);
                } else {
                    m17651a(i2, getResources().getColor(C4073a.C4078e.search_tab_standard), false);
                }
            }
            m17650a((float) i);
            this.f17127d = i;
        }
    }
}
