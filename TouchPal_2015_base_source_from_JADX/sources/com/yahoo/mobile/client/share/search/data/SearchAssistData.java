package com.yahoo.mobile.client.share.search.data;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.suggest.IRanking;
import com.yahoo.mobile.client.share.search.util.C4247l;

public class SearchAssistData implements Comparable<SearchAssistData> {
    public static final int CLEAR_HISTORY = 14;
    public static final int SEARCH_APPS = 3;
    public static final int SEARCH_CONTACTS = 4;
    public static final int SEARCH_DEFAULT = 2;
    public static final int SEARCH_HISTORY = 13;
    public static final int SEARCH_SUGGEST = 1;
    public static final int SEARCH_TRENDING = 5;

    /* renamed from: a */
    private Drawable f16672a;

    /* renamed from: b */
    private String f16673b;

    /* renamed from: c */
    private String f16674c;

    /* renamed from: d */
    private String f16675d;

    /* renamed from: e */
    private int f16676e;

    /* renamed from: f */
    private String f16677f;

    /* renamed from: g */
    private long f16678g = 0;

    /* renamed from: h */
    private String f16679h;

    /* renamed from: i */
    private IRanking f16680i;

    /* renamed from: j */
    private String f16681j = "default";

    public static View createSearchAssistItemView(SearchAssistData searchAssistData, Context context, ViewGroup viewGroup, View view) {
        int i = TextUtils.isEmpty(searchAssistData.getSubLabel()) ? C4073a.C4083j.yssdk_suggest_item_one_row : C4073a.C4083j.yssdk_suggest_item_two_rows;
        if (view == null) {
            view = View.inflate(context, i, viewGroup);
            if (view == viewGroup) {
                view = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            }
        } else if (viewGroup != null) {
            viewGroup.addView(view);
        }
        if (searchAssistData.getIcon() != null) {
            ((ImageView) view.findViewById(C4073a.C4081h.image_icon)).setImageDrawable(searchAssistData.getIcon());
        } else {
            TextView textView = (TextView) view.findViewById(C4073a.C4081h.text_icon);
            textView.setTypeface(C4247l.m17792a(context));
            textView.setVisibility(0);
        }
        ((TextView) view.findViewById(C4073a.C4081h.text)).setText(searchAssistData.getLabel());
        if (!TextUtils.isEmpty(searchAssistData.getSubLabel())) {
            ((TextView) view.findViewById(C4073a.C4081h.subtext)).setText(searchAssistData.getSubLabel());
        }
        return view;
    }

    public SearchAssistData(String str, String str2, int i) {
        this.f16673b = str;
        this.f16675d = str2;
        this.f16676e = i;
    }

    public SearchAssistData(Drawable drawable, String str, int i, String str2) {
        this.f16672a = drawable;
        this.f16673b = str;
        this.f16676e = i;
        this.f16679h = str2;
    }

    public SearchAssistData(String str, String str2, int i, int i2, String str3) {
        this.f16673b = str;
        this.f16675d = str2;
        this.f16676e = i;
        this.f16678g = (long) i2;
        this.f16677f = str3;
    }

    public String getLabel() {
        return this.f16673b;
    }

    public void setLabel(String str) {
        this.f16673b = str;
    }

    public String getGprid() {
        return this.f16677f;
    }

    public void setGprid(String str) {
        this.f16677f = str;
    }

    public String getTip() {
        return this.f16675d;
    }

    public void setTip(String str) {
        this.f16675d = str;
    }

    public int getType() {
        return this.f16676e;
    }

    public void setType(int i) {
        this.f16676e = i;
    }

    public long getMrk() {
        return this.f16678g;
    }

    public void setMrk(long j) {
        this.f16678g = j;
    }

    public Drawable getIcon() {
        return this.f16672a;
    }

    public String getInfo() {
        return this.f16679h;
    }

    public void setIcon(Drawable drawable) {
        this.f16672a = drawable;
    }

    public void setInfo(String str) {
        this.f16679h = str;
    }

    public IRanking getRanking() {
        return this.f16680i;
    }

    public void setRanking(IRanking iRanking) {
        this.f16680i = iRanking;
    }

    public String getSubLabel() {
        return this.f16674c;
    }

    public void setSubLabel(String str) {
        this.f16674c = str;
    }

    public int compareTo(SearchAssistData searchAssistData) {
        if (this.f16680i == null) {
            if (searchAssistData.getRanking() != null) {
                return -1;
            }
            return 0;
        } else if (searchAssistData.getRanking() != null) {
            return this.f16680i.compareTo(searchAssistData.getRanking());
        } else {
            return 1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchAssistData searchAssistData = (SearchAssistData) obj;
        if (this.f16678g != searchAssistData.f16678g) {
            return false;
        }
        if (this.f16676e != searchAssistData.f16676e) {
            return false;
        }
        if (this.f16677f == null ? searchAssistData.f16677f != null : !this.f16677f.equals(searchAssistData.f16677f)) {
            return false;
        }
        if (this.f16672a == null ? searchAssistData.f16672a != null : !this.f16672a.equals(searchAssistData.f16672a)) {
            return false;
        }
        if (this.f16679h == null ? searchAssistData.f16679h != null : !this.f16679h.equals(searchAssistData.f16679h)) {
            return false;
        }
        if (this.f16673b == null ? searchAssistData.f16673b != null : !this.f16673b.equals(searchAssistData.f16673b)) {
            return false;
        }
        if (this.f16680i == null ? searchAssistData.f16680i != null : !this.f16680i.equals(searchAssistData.f16680i)) {
            return false;
        }
        if (this.f16674c == null ? searchAssistData.f16674c != null : !this.f16674c.equals(searchAssistData.f16674c)) {
            return false;
        }
        if (this.f16675d != null) {
            if (this.f16675d.equals(searchAssistData.f16675d)) {
                return true;
            }
        } else if (searchAssistData.f16675d == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int hashCode = (this.f16672a != null ? this.f16672a.hashCode() : 0) * 31;
        if (this.f16673b != null) {
            i = this.f16673b.hashCode();
        } else {
            i = 0;
        }
        int i7 = (i + hashCode) * 31;
        if (this.f16674c != null) {
            i2 = this.f16674c.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i2 + i7) * 31;
        if (this.f16675d != null) {
            i3 = this.f16675d.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (((i3 + i8) * 31) + this.f16676e) * 31;
        if (this.f16677f != null) {
            i4 = this.f16677f.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (((i4 + i9) * 31) + ((int) (this.f16678g ^ (this.f16678g >>> 32)))) * 31;
        if (this.f16679h != null) {
            i5 = this.f16679h.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i5 + i10) * 31;
        if (this.f16680i != null) {
            i6 = this.f16680i.hashCode();
        }
        return i11 + i6;
    }

    public String getHistoryEventType() {
        return this.f16681j;
    }

    public void setHistoryEventType(String str) {
        this.f16681j = str;
    }
}
