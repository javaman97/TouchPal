package com.yahoo.mobile.client.share.search.p098c;

import android.content.Context;
import android.widget.ListView;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.suggest.ISuggestContainer;
import com.yahoo.mobile.client.share.search.suggest.SearchSuggestController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yahoo.mobile.client.share.search.c.d */
public final class C4096d extends SearchSuggestController {

    /* renamed from: e */
    private C4095c f16587e;

    public C4096d(Context context, ListView listView, List<ISuggestContainer> list, List<ISuggestContainer> list2, C4095c cVar) {
        super(context, listView, list, list2);
        this.f16587e = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15081a(ISuggestContainer iSuggestContainer, SearchQuery searchQuery) {
        iSuggestContainer.loadContainerResult(searchQuery, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15080a(ISuggestContainer iSuggestContainer, SearchAssistData searchAssistData, int i, String str) {
        super.mo15080a(iSuggestContainer, searchAssistData, i, str);
        C4093a aVar = (C4093a) searchAssistData.getRanking();
        String itemRankingId = iSuggestContainer.getItemRankingId(searchAssistData);
        if (aVar == null && itemRankingId != null) {
            C4093a aVar2 = new C4093a(itemRankingId, iSuggestContainer.getContainerName());
            searchAssistData.setRanking(aVar2);
            this.f16587e.mo15076a(aVar2);
        } else if (aVar != null) {
            aVar.mo15064a();
            this.f16587e.mo15076a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15082a(ISuggestContainer iSuggestContainer, List<SearchAssistData> list, SearchQuery searchQuery) {
        List<C4093a> a;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (SearchAssistData next : list) {
                if (next.getRanking() == null && iSuggestContainer.getItemRankingId(next) != null) {
                    arrayList.add(iSuggestContainer.getItemRankingId(next));
                }
            }
            if (arrayList.size() > 0 && (a = this.f16587e.mo15074a(iSuggestContainer.getContainerName(), (List<String>) arrayList)) != null && a.size() > 0) {
                int i = 0;
                int size = list.size();
                Iterator<C4093a> it = a.iterator();
                while (true) {
                    int i2 = i;
                    if (!it.hasNext()) {
                        break;
                    }
                    C4093a next2 = it.next();
                    while (true) {
                        if (i2 >= size) {
                            i = i2;
                            break;
                        }
                        int i3 = i2 + 1;
                        SearchAssistData searchAssistData = list.get(i2);
                        if (next2.getItemId().equals(iSuggestContainer.getItemRankingId(searchAssistData))) {
                            searchAssistData.setRanking(next2);
                            i = i3;
                            break;
                        }
                        i2 = i3;
                    }
                    if (i == size) {
                        break;
                    }
                }
            }
            Collections.sort(list, Collections.reverseOrder());
            int maxResultCount = iSuggestContainer.getMaxResultCount(searchQuery);
            if (maxResultCount > 0 && list.size() > maxResultCount) {
                list.subList(maxResultCount, list.size()).clear();
            }
        }
        super.mo15082a(iSuggestContainer, list, searchQuery);
    }
}
