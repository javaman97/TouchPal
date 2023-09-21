package com.yahoo.mobile.client.share.search.suggest;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.TrendingData;
import com.yahoo.mobile.client.share.search.data.contentmanager.C4123c;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.p099ui.activity.TrendingSearchEnum;
import com.yahoo.mobile.client.share.search.util.C4247l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yahoo.mobile.client.share.search.suggest.f */
public final class C4153f implements ContentManager.IContentHandler, ISuggestContainer {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ISuggestContentHandler f16891a = null;

    /* renamed from: b */
    private C4123c f16892b = null;

    /* renamed from: c */
    private Context f16893c;

    /* renamed from: d */
    private String f16894d;

    public C4153f(Context context, String str) {
        this.f16892b = new C4123c(this, context);
        this.f16893c = context;
        this.f16894d = str;
    }

    public final void onProgressReceived(ContentManager contentManager, SearchCommand.SearchProgressEnum searchProgressEnum, SearchQuery searchQuery) {
    }

    public final void onContentReceived(ContentManager contentManager, SearchResponseData searchResponseData, SearchQuery searchQuery) {
        if (searchResponseData != null) {
            this.f16891a.onContainerContentReceived(this, searchResponseData.getResponseList(), searchQuery);
        }
    }

    public final void onContentError(ContentManager contentManager, SearchError searchError, SearchQuery searchQuery) {
        this.f16891a.onContainerContentReceived(this, new ArrayList(), searchQuery);
    }

    public final void loadContainerResult(SearchQuery searchQuery, int i) {
        if (!searchQuery.getQueryString().equals("")) {
            this.f16891a.onContainerContentReceived(this, new ArrayList(), searchQuery);
        } else if (TrendingSearchEnum.contains(this.f16894d) && !this.f16894d.equals(TrendingSearchEnum.NONE.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put("category", this.f16894d);
            this.f16892b.mo15318b(new SearchQuery(new SearchQuery.Builder(searchQuery).setAdditionalParameters(hashMap)));
        }
    }

    public final int getMaxResultCount(SearchQuery searchQuery) {
        return 0;
    }

    public final String getItemI13nId(SearchAssistData searchAssistData) {
        return searchAssistData.getLabel();
    }

    public final View getView(List<SearchAssistData> list, SearchQuery searchQuery, View view) {
        LinearLayout linearLayout = (LinearLayout) View.inflate(this.f16893c, C4073a.C4083j.yssdk_suggest_container, (ViewGroup) null);
        for (final int i = 0; i < list.size(); i++) {
            View inflate = LayoutInflater.from(this.f16893c).inflate(C4073a.C4083j.yssdk_suggest_item_one_row, linearLayout, false);
            SearchAssistData searchAssistData = list.get(i);
            TextView textView = (TextView) inflate.findViewById(C4073a.C4081h.text);
            textView.setText(searchAssistData.getLabel());
            textView.setTag(searchAssistData);
            textView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C4153f.this.f16891a.onItemClick(C4153f.this, i, ISuggestContentHandler.SEARCH_QUERY);
                }
            });
            Typeface a = C4247l.m17792a(this.f16893c);
            TextView textView2 = (TextView) inflate.findViewById(C4073a.C4081h.text_icon);
            textView2.setText(this.f16893c.getResources().getString(C4073a.C4086m.yssdk_trending_icon));
            textView2.setVisibility(0);
            textView2.setTypeface(a);
            textView2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C4153f.this.f16891a.onItemClick(C4153f.this, i, ISuggestContentHandler.SEARCH_QUERY);
                }
            });
            linearLayout.addView(inflate);
        }
        return linearLayout;
    }

    public final void performItemClick(SearchAssistData searchAssistData, int i, String str, SearchQuery searchQuery) {
    }

    public final void setSuggestContentHandler(ISuggestContentHandler iSuggestContentHandler) {
        this.f16891a = iSuggestContentHandler;
    }

    public final void prepareDataForDisplay(List<SearchAssistData> list, SearchQuery searchQuery) {
    }

    public final String getContainerName() {
        return "trending";
    }

    public final boolean canIncrementalFilter() {
        return false;
    }

    public final boolean canCacheResults() {
        return true;
    }

    public final SearchAssistData getDataByRankingId(String str) {
        TrendingData trendingData = new TrendingData(str, this.f16894d);
        trendingData.setHistoryEventType(ISuggestContentHandler.SEARCH_QUERY);
        return trendingData;
    }

    public final boolean shouldOverrideInstrumentation(ISuggestContainer iSuggestContainer, SearchAssistData searchAssistData, int i, String str) {
        return false;
    }

    public final String getItemRankingId(SearchAssistData searchAssistData) {
        return searchAssistData.getLabel();
    }
}
