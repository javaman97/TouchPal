package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import com.yahoo.mobile.client.share.search.data.LocalData;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.data.VideoData;
import com.yahoo.mobile.client.share.search.interfaces.ISearchToLinkListener;
import java.util.Map;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.IYahooSearchToLinkListener */
public interface IYahooSearchToLinkListener extends ISearchToLinkListener {
    void onYahooImageSelected(PhotoData photoData, int i);

    void onYahooLocalSelected(LocalData localData);

    void onYahooUrlSelected(String str, String str2, Map<String, String> map);

    void onYahooVideoSelected(VideoData videoData, int i);
}
