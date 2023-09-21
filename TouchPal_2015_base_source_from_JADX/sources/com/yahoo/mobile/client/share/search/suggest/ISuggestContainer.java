package com.yahoo.mobile.client.share.search.suggest;

import android.view.View;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import java.util.List;

public interface ISuggestContainer {
    boolean canCacheResults();

    boolean canIncrementalFilter();

    String getContainerName();

    SearchAssistData getDataByRankingId(String str);

    String getItemI13nId(SearchAssistData searchAssistData);

    String getItemRankingId(SearchAssistData searchAssistData);

    int getMaxResultCount(SearchQuery searchQuery);

    View getView(List<SearchAssistData> list, SearchQuery searchQuery, View view);

    void loadContainerResult(SearchQuery searchQuery, int i);

    void performItemClick(SearchAssistData searchAssistData, int i, String str, SearchQuery searchQuery);

    void prepareDataForDisplay(List<SearchAssistData> list, SearchQuery searchQuery);

    void setSuggestContentHandler(ISuggestContentHandler iSuggestContentHandler);

    boolean shouldOverrideInstrumentation(ISuggestContainer iSuggestContainer, SearchAssistData searchAssistData, int i, String str);
}
