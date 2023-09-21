package com.yahoo.mobile.client.share.search.p099ui;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;
import com.yahoo.mobile.client.share.search.data.LocalData;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;
import java.util.Map;

/* renamed from: com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback */
public interface SearchWebViewCallback {
    void handleSearchStatus(SearchStatusData searchStatusData);

    boolean isCustomViewShowing();

    void onHideCustomView();

    void onImageResultsWrapperUrlTapped();

    void onImageThumbmailTapped(String str, PhotoData photoData);

    void onLocalResutTapped(String str, LocalData localData);

    void onPageLoaded(String str, boolean z);

    void onProgressChanged(int i);

    void onReceivedIcon(Bitmap bitmap);

    void onReceivedTitle(String str);

    void onSearchResultsNewQueryTapped(String str);

    void onSearchResultsRequeryTapped(Map<String, String> map);

    void onUrlLoaded(String str, Map<String, Object> map);

    void onVideoResultsWrapperUrlTapped();

    void openUrlOnMinibrowser(String str, Map<String, String> map);

    void showCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback);

    void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback);

    void willLoadUrl(String str);
}
