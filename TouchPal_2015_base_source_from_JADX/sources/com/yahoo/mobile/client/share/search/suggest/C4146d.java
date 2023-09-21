package com.yahoo.mobile.client.share.search.suggest;

import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.iab.C1730E;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.C4106b;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.p098c.C4093a;
import com.yahoo.mobile.client.share.search.p098c.C4095c;
import com.yahoo.mobile.client.share.search.util.C4228b;
import com.yahoo.mobile.client.share.search.util.C4233c;
import com.yahoo.mobile.client.share.search.util.C4242g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yahoo.mobile.client.share.search.suggest.d */
public final class C4146d implements ISuggestContainer {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4095c f16876a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<SearchAssistData> f16877b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f16878c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<String, ISuggestContainer> f16879d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ISuggestContentHandler f16880e = null;

    /* renamed from: f */
    private boolean f16881f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f16882g = 3;

    public C4146d(Context context, C4095c cVar, List<ISuggestContainer> list, int i) {
        this.f16878c = context;
        this.f16876a = cVar;
        this.f16881f = true;
        this.f16879d = new HashMap();
        this.f16882g = i;
        for (ISuggestContainer next : list) {
            this.f16879d.put(next.getContainerName(), next);
            if (C1730E.f5650d.equals(next.getContainerName())) {
                this.f16879d.put("trending", next);
            }
        }
    }

    public final void loadContainerResult(SearchQuery searchQuery, int i) {
        if (this.f16882g > 0) {
            C4233c.m17759c(new C4151a(this, (byte) 0), searchQuery);
        } else if (this.f16880e != null) {
            this.f16880e.onContainerContentReceived(this, new ArrayList(), searchQuery);
        }
    }

    public final int getMaxResultCount(SearchQuery searchQuery) {
        return this.f16882g;
    }

    public final String getItemRankingId(SearchAssistData searchAssistData) {
        return searchAssistData.getInfo();
    }

    public final String getItemI13nId(SearchAssistData searchAssistData) {
        return searchAssistData.getLabel();
    }

    public final View getView(List<SearchAssistData> list, SearchQuery searchQuery, View view) {
        View view2;
        LinearLayout linearLayout = (LinearLayout) View.inflate(this.f16878c, C4073a.C4083j.yssdk_suggest_container, (ViewGroup) null);
        final int i = 0;
        for (final SearchAssistData next : this.f16877b) {
            int i2 = i + 1;
            if (((C4093a) next.getRanking()) != null) {
                SearchAssistData.createSearchAssistItemView(next, this.f16878c, linearLayout, (View) null).setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        C4146d.this.f16880e.onItemClick(C4146d.this, i, next.getHistoryEventType());
                    }
                });
                i = i2;
            } else {
                i = i2;
            }
        }
        if (this.f16881f) {
            View inflate = View.inflate(this.f16878c, C4073a.C4083j.yssdk_suggest_item_one_row, linearLayout);
            if (inflate == linearLayout) {
                view2 = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            } else {
                view2 = inflate;
            }
            ((ImageView) view2.findViewById(C4073a.C4081h.image_icon)).setVisibility(8);
            TextView textView = (TextView) view2.findViewById(C4073a.C4081h.text);
            textView.setText(this.f16878c.getResources().getString(C4073a.C4086m.yssdk_clear_history_summary));
            textView.setTextColor(this.f16878c.getResources().getColor(C4073a.C4078e.share_blue));
            textView.setGravity(17);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMargins(0, 0, 0, 0);
            textView.requestLayout();
            textView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C4228b.m17756b(C4146d.this.f16878c, C4146d.this.f16878c.getString(C4073a.C4086m.yssdk_clear_history_warning_title), C4146d.this.f16878c.getString(C4073a.C4086m.yssdk_clear_history_warning_text), new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            switch (i) {
                                case -2:
                                    dialogInterface.dismiss();
                                    return;
                                case -1:
                                    if (C4146d.this.f16880e != null) {
                                        C4146d.this.f16880e.onItemClick(C4146d.this, 0, ISuggestContentHandler.CLEAR_LOCAL_HISTORY);
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
        }
        return linearLayout;
    }

    public final void performItemClick(SearchAssistData searchAssistData, int i, String str, SearchQuery searchQuery) {
        if (str.equals("default")) {
            this.f16879d.get(searchAssistData.getRanking().getType()).performItemClick(searchAssistData, i, str, searchQuery);
        } else if (str.equals(ISuggestContentHandler.CLEAR_LOCAL_HISTORY)) {
            C4106b bVar = new C4106b(this.f16878c);
            bVar.setSearchTaskCallback(new SearchCommand.SearchTaskCallback() {
                public final void onProgressReceived(SearchCommand searchCommand, SearchCommand.SearchProgressEnum searchProgressEnum, SearchQuery searchQuery) {
                }

                public final void onSearchTaskCompleted(SearchCommand searchCommand, SearchResponseData searchResponseData, SearchQuery searchQuery) {
                    if (C4146d.this.f16880e != null) {
                        C4146d.this.f16880e.reloadQuery();
                    }
                }

                public final void onSearchTaskError(SearchCommand searchCommand, SearchError searchError, SearchQuery searchQuery) {
                }

                public final void onSearchTaskCancelled(SearchCommand searchCommand, SearchQuery searchQuery) {
                }
            });
            bVar.executeCommand();
        }
    }

    public final void setSuggestContentHandler(ISuggestContentHandler iSuggestContentHandler) {
        this.f16880e = iSuggestContentHandler;
    }

    public final void prepareDataForDisplay(List<SearchAssistData> list, SearchQuery searchQuery) {
    }

    public final String getContainerName() {
        return "history";
    }

    public final boolean canIncrementalFilter() {
        return false;
    }

    public final boolean canCacheResults() {
        return false;
    }

    public final SearchAssistData getDataByRankingId(String str) {
        return null;
    }

    public final boolean shouldOverrideInstrumentation(ISuggestContainer iSuggestContainer, SearchAssistData searchAssistData, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("sch_cmpt", iSuggestContainer.getContainerName());
        hashMap.put("query", iSuggestContainer.getItemI13nId(searchAssistData));
        if (i >= 0) {
            hashMap.put("sch_pos", Integer.valueOf(i + 1));
        }
        hashMap.put("sch_type", "history");
        C4242g.m17773a(980778381, "sch_select_action", hashMap);
        return true;
    }

    /* renamed from: a */
    public final void mo15469a(ISuggestContainer iSuggestContainer) {
        this.f16879d.put(iSuggestContainer.getContainerName(), iSuggestContainer);
    }

    /* renamed from: com.yahoo.mobile.client.share.search.suggest.d$a */
    private class C4151a extends AsyncTask<SearchQuery, Void, Void> {

        /* renamed from: a */
        SearchQuery f16889a;

        private C4151a() {
        }

        /* synthetic */ C4151a(C4146d dVar, byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            this.f16889a = ((SearchQuery[]) objArr)[0];
            if (!TextUtils.isEmpty(this.f16889a.getQueryString())) {
                List unused = C4146d.this.f16877b = new ArrayList();
            } else {
                ArrayList arrayList = new ArrayList(C4146d.this.f16879d.keySet());
                List<C4093a> a = C4146d.this.f16876a.mo15072a(10 > C4146d.this.f16882g ? 10 : C4146d.this.f16882g, (ArrayList<String>) arrayList);
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                int i2 = 0;
                List<C4093a> list = a;
                while (i < list.size() && i2 != C4146d.this.f16882g) {
                    C4093a aVar = list.get(i);
                    ISuggestContainer iSuggestContainer = (ISuggestContainer) C4146d.this.f16879d.get(aVar.getType());
                    if (iSuggestContainer == null) {
                        i++;
                        i2++;
                    } else {
                        SearchAssistData dataByRankingId = iSuggestContainer.getDataByRankingId(aVar.getItemId());
                        if (dataByRankingId == null) {
                            C4146d.this.f16876a.mo15077b(aVar);
                            i++;
                        } else {
                            dataByRankingId.setRanking(aVar);
                            arrayList2.add(dataByRankingId);
                            int i3 = i2 + 1;
                            int i4 = i + 1;
                            if (i4 == list.size() && i3 < C4146d.this.f16882g) {
                                list = C4146d.this.f16876a.mo15072a(10 > C4146d.this.f16882g ? 10 : C4146d.this.f16882g, (ArrayList<String>) arrayList);
                                i4 = i3;
                            }
                            i2 = i3;
                            list = list;
                            i = i4;
                        }
                    }
                }
                List unused2 = C4146d.this.f16877b = arrayList2;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            if (C4146d.this.f16880e != null) {
                C4146d.this.f16880e.onContainerContentReadyForDisplay(C4146d.this, C4146d.this.f16877b, this.f16889a);
            }
        }
    }
}
