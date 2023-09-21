package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.VideoData;
import com.yahoo.mobile.client.share.search.data.contentmanager.IListViewAdapterHandler;
import java.util.ArrayList;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.ShareVideoListAdapter */
public final class ShareVideoListAdapter extends VideoListAdapter {

    /* renamed from: c */
    private IYahooSearchToLinkListener f17165c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public VideoListAdapterCallback f17166d;

    /* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.ShareVideoListAdapter$VideoListAdapterCallback */
    public interface VideoListAdapterCallback {
        void onShareVideoItemClick(int i);
    }

    public ShareVideoListAdapter(Context context, SearchQuery searchQuery, IListViewAdapterHandler iListViewAdapterHandler, ArrayList<VideoData> arrayList) {
        super(context, searchQuery, iListViewAdapterHandler, arrayList);
    }

    public final View getView(final int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        view2.setClickable(true);
        view2.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (ShareVideoListAdapter.this.f17166d != null) {
                    ShareVideoListAdapter.this.f17166d.onShareVideoItemClick(i);
                }
            }
        });
        return view2;
    }

    /* renamed from: a */
    public final void mo15762a(IYahooSearchToLinkListener iYahooSearchToLinkListener) {
        this.f17165c = iYahooSearchToLinkListener;
    }

    /* renamed from: a */
    public final void mo15763a(VideoListAdapterCallback videoListAdapterCallback) {
        this.f17166d = videoListAdapterCallback;
    }
}
