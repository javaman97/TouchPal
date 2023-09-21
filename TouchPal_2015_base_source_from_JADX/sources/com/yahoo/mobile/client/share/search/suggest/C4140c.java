package com.yahoo.mobile.client.share.search.suggest;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.contentmanager.C4122b;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.util.C4228b;
import com.yahoo.mobile.client.share.search.util.C4245j;
import com.yahoo.mobile.client.share.search.util.C4247l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yahoo.mobile.client.share.search.suggest.c */
public final class C4140c implements ContentManager.IContentHandler, ISuggestContainer {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ISuggestContentHandler f16862a = null;

    /* renamed from: b */
    private C4122b f16863b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f16864c;

    /* renamed from: d */
    private C4145a f16865d = null;

    /* renamed from: com.yahoo.mobile.client.share.search.suggest.c$a */
    public static class C4145a {

        /* renamed from: a */
        private int f16874a;

        /* renamed from: b */
        private int f16875b;

        /* renamed from: a */
        public final int mo15467a() {
            return this.f16874a;
        }

        /* renamed from: b */
        public final int mo15468b() {
            return this.f16875b;
        }
    }

    public C4140c(Context context) {
        this.f16863b = new C4122b(this, context);
        this.f16864c = context;
    }

    public final void loadContainerResult(SearchQuery searchQuery, int i) {
        if (!TextUtils.isEmpty(searchQuery.getQueryString()) || C4129c.m17440e()) {
            this.f16863b.loadQuery(searchQuery);
        } else {
            this.f16862a.onContainerContentReceived(this, new ArrayList(), searchQuery);
        }
    }

    public final View getView(List<SearchAssistData> list, SearchQuery searchQuery, View view) {
        Spannable spannable;
        LinearLayout linearLayout = new LinearLayout(this.f16864c);
        linearLayout.setOrientation(1);
        int size = list.size();
        for (final int i = 0; i < size; i++) {
            View inflate = View.inflate(this.f16864c, C4073a.C4083j.yssdk_search_tip_item, (ViewGroup) null);
            SearchAssistData searchAssistData = list.get(i);
            TextView textView = (TextView) inflate.findViewById(C4073a.C4081h.tip);
            textView.setVisibility(0);
            String label = searchAssistData.getLabel();
            final int type = searchAssistData.getType();
            if (type == 2) {
                label = String.format(this.f16864c.getResources().getString(C4073a.C4086m.yssdk_search_for), new Object[]{searchQuery.getQueryString()});
            }
            if (searchAssistData.getMrk() == 1) {
                label = label + C2261Q.f9807m;
                textView.setTypeface((Typeface) null, 1);
            }
            textView.setText(label);
            if (searchQuery != null && !TextUtils.isEmpty(searchQuery.getQueryString())) {
                if (label != null) {
                    spannable = C4245j.m17779a(searchQuery.getQueryString(), label);
                } else {
                    spannable = null;
                }
                textView.setText(spannable);
            }
            textView.setTag(searchAssistData);
            Typeface a = C4247l.m17792a(this.f16864c);
            TextView textView2 = (TextView) inflate.findViewById(C4073a.C4081h.add);
            textView2.setTypeface(a);
            textView2.setVisibility(0);
            if (type == 13) {
                textView.setTextColor(this.f16865d != null ? this.f16865d.mo15468b() : this.f16864c.getResources().getColor(C4073a.C4078e.ypurple));
            } else {
                textView.setTextColor(this.f16865d != null ? this.f16865d.mo15467a() : this.f16864c.getResources().getColor(C4073a.C4078e.yssdk_searchassist_text));
            }
            textView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (((SearchAssistData) view.getTag()) == null || type != 2) {
                        C4140c.this.f16862a.onItemClick(C4140c.this, i, ISuggestContentHandler.SEARCH_QUERY);
                    } else {
                        C4140c.this.f16862a.onItemClick(C4140c.this, i, ISuggestContentHandler.SEARCH_QUERY);
                    }
                }
            });
            inflate.setTag(searchAssistData.getTip());
            if (type == 2) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        if (type == 13) {
                            C4140c.this.f16862a.onItemClick(C4140c.this, i, ISuggestContentHandler.BUILD_QUERY_WITH_HISTORY);
                        } else {
                            C4140c.this.f16862a.onItemClick(C4140c.this, i, ISuggestContentHandler.BUILD_QUERY);
                        }
                    }
                });
            }
            linearLayout.addView(inflate);
        }
        if (size > 0 && C4245j.m17785a(searchQuery.getQueryString())) {
            View inflate2 = View.inflate(this.f16864c, C4073a.C4083j.yssdk_search_tip_item, (ViewGroup) null);
            TextView textView3 = (TextView) inflate2.findViewById(C4073a.C4081h.tip);
            textView3.setVisibility(0);
            textView3.setText(this.f16864c.getResources().getString(C4073a.C4086m.yssdk_clear_history_summary));
            textView3.setTextColor(this.f16864c.getResources().getColor(C4073a.C4078e.ypurple));
            textView3.setTag(new SearchAssistData("", "", 13));
            textView3.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C4228b.m17756b(C4140c.this.f16864c, C4140c.this.f16864c.getString(C4073a.C4086m.yssdk_clear_history_warning_title), C4140c.this.f16864c.getString(C4073a.C4086m.yssdk_clear_history_warning_text), new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            switch (i) {
                                case -2:
                                    dialogInterface.dismiss();
                                    return;
                                case -1:
                                    if (C4140c.this.f16862a != null) {
                                        C4140c.this.f16862a.onItemClick(C4140c.this, 0, ISuggestContentHandler.CLEAR_HISTORY);
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        }
                    });
                }
            });
            inflate2.findViewById(C4073a.C4081h.add).setVisibility(8);
            linearLayout.addView(inflate2);
        }
        return linearLayout;
    }

    public final void performItemClick(SearchAssistData searchAssistData, int i, String str, SearchQuery searchQuery) {
    }

    public final String getContainerName() {
        return C1730E.f5650d;
    }

    public final boolean canIncrementalFilter() {
        return false;
    }

    public final boolean canCacheResults() {
        return true;
    }

    public final void setSuggestContentHandler(ISuggestContentHandler iSuggestContentHandler) {
        this.f16862a = iSuggestContentHandler;
    }

    public final void onProgressReceived(ContentManager contentManager, SearchCommand.SearchProgressEnum searchProgressEnum, SearchQuery searchQuery) {
    }

    public final void onContentReceived(ContentManager contentManager, SearchResponseData searchResponseData, SearchQuery searchQuery) {
        if (searchResponseData != null) {
            this.f16862a.onContainerContentReceived(this, searchResponseData.getResponseList(), searchQuery);
        }
    }

    public final void onContentError(ContentManager contentManager, SearchError searchError, SearchQuery searchQuery) {
        if (!C4245j.m17785a(searchQuery.getQueryString())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new SearchAssistData(searchQuery.getQueryString(), "", 2));
            this.f16862a.onContainerContentReceived(this, arrayList, searchQuery);
        }
    }

    public final int getMaxResultCount(SearchQuery searchQuery) {
        return 0;
    }

    public final SearchAssistData getDataByRankingId(String str) {
        SearchAssistData searchAssistData = new SearchAssistData((Drawable) null, str, 13, (String) null);
        searchAssistData.setHistoryEventType(ISuggestContentHandler.SEARCH_QUERY);
        return searchAssistData;
    }

    public final boolean shouldOverrideInstrumentation(ISuggestContainer iSuggestContainer, SearchAssistData searchAssistData, int i, String str) {
        return false;
    }

    public final String getItemRankingId(SearchAssistData searchAssistData) {
        return searchAssistData.getLabel();
    }

    public final String getItemI13nId(SearchAssistData searchAssistData) {
        return searchAssistData.getLabel();
    }

    public final void prepareDataForDisplay(List<SearchAssistData> list, SearchQuery searchQuery) {
    }
}
