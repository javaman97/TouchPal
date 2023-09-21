package com.yahoo.mobile.client.share.search.p099ui.container;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.interfaces.IFooterViewHolder;
import com.yahoo.mobile.client.share.search.interfaces.ISearchVertical;
import com.yahoo.mobile.client.share.search.interfaces.ITabController;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.util.List;

/* renamed from: com.yahoo.mobile.client.share.search.ui.container.SearchTabView */
public class SearchTabView extends LinearLayout implements View.OnClickListener, IFooterViewHolder {

    /* renamed from: a */
    private ITabController f17130a;

    /* renamed from: b */
    private List<ISearchVertical> f17131b;

    /* renamed from: c */
    private int f17132c = 0;

    /* renamed from: d */
    private int f17133d;

    /* renamed from: e */
    private View f17134e;

    public SearchTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m17655a(List<ISearchVertical> list) {
        this.f17131b = list;
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        LinearLayout linearLayout = (LinearLayout) findViewById(C4073a.C4081h.search_tab_label_container);
        linearLayout.removeAllViews();
        int i = 0;
        for (ISearchVertical label : this.f17131b) {
            TextView textView = (TextView) layoutInflater.inflate(C4073a.C4083j.yssdk_search_tab, (ViewGroup) null);
            textView.setText(label.getLabel(getContext()));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            textView.setOnClickListener(this);
            textView.setTag(Integer.valueOf(i));
            linearLayout.addView(textView, layoutParams);
            i++;
        }
        this.f17132c = Utils.getScreenWidth(getContext()) / linearLayout.getChildCount();
        this.f17134e = findViewById(C4073a.C4081h.search_tab_indicator);
        ViewGroup.LayoutParams layoutParams2 = this.f17134e.getLayoutParams();
        layoutParams2.width = this.f17132c;
        this.f17134e.setLayoutParams(layoutParams2);
        if (this.f17131b.size() == 1) {
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            layoutParams3.height = 0;
            setLayoutParams(layoutParams3);
        }
    }

    /* renamed from: a */
    private void m17654a(int i, int i2, boolean z) {
        TextView textView = (TextView) ((LinearLayout) findViewById(C4073a.C4081h.search_tab_label_container)).getChildAt(i);
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
    private void m17653a(float f) {
        this.f17134e.setTranslationX(((float) this.f17132c) * f);
    }

    public void onClick(View view) {
        int intValue;
        if ((view instanceof TextView) && (intValue = ((Integer) view.getTag()).intValue()) >= 0) {
            this.f17130a.changeTab(intValue);
        }
    }

    public void setTabController(ITabController iTabController) {
        this.f17130a = iTabController;
    }

    public void setTabs(List<ISearchVertical> list) {
        m17655a(list);
    }

    public void addTab(ISearchVertical iSearchVertical) {
        this.f17131b.add(iSearchVertical);
        m17655a(this.f17131b);
    }

    public void onTabChanged(float f) {
        int i = (int) f;
        if (Math.abs(f - ((float) i)) >= 1.0E-4f) {
            m17653a(f);
        } else if (this.f17131b != null) {
            for (int i2 = 0; i2 < this.f17131b.size(); i2++) {
                if (i2 == i) {
                    m17654a(i2, getResources().getColor(C4073a.C4078e.search_tab_selected), true);
                } else {
                    m17654a(i2, getResources().getColor(C4073a.C4078e.search_tab_standard), false);
                }
            }
            m17653a((float) i);
            this.f17133d = i;
        }
    }
}
