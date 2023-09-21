package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.VideoData;
import com.yahoo.mobile.client.share.search.data.contentmanager.IListViewAdapterHandler;
import com.yahoo.mobile.client.share.search.interfaces.ILinkableContent;
import com.yahoo.mobile.client.share.search.interfaces.ISearchToLinkListener;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchToLinkActivity;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.ShareVideoListAdapter;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.mobile.client.share.search.util.C4227a;
import com.yahoo.mobile.client.share.search.util.UrlUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.d */
public class C4209d extends C4210e implements ILinkableContent, ShareVideoListAdapter.VideoListAdapterCallback {

    /* renamed from: k */
    private IYahooSearchToLinkListener f17213k;

    /* renamed from: l */
    private boolean f17214l = true;

    /* renamed from: m */
    private ArrayList<VideoData> f17215m;

    /* renamed from: n */
    private int f17216n = -1;

    /* renamed from: o */
    private String f17217o = "";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ VideoListAdapter mo15791a(SearchQuery searchQuery, IListViewAdapterHandler iListViewAdapterHandler, ArrayList arrayList) {
        if (getActivity() == null) {
            return null;
        }
        ShareVideoListAdapter shareVideoListAdapter = new ShareVideoListAdapter(getActivity(), searchQuery, iListViewAdapterHandler, arrayList);
        this.f17215m = arrayList;
        if (this.f17213k != null) {
            shareVideoListAdapter.mo15762a(this.f17213k);
        }
        shareVideoListAdapter.mo15763a((ShareVideoListAdapter.VideoListAdapterCallback) this);
        return shareVideoListAdapter;
    }

    public String getVerticalId() {
        return "sch_shr_video_screen";
    }

    public void setSearchToLinkListener(ISearchToLinkListener iSearchToLinkListener) {
        this.f17213k = (IYahooSearchToLinkListener) iSearchToLinkListener;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Bundle arguments;
        super.onViewCreated(view, bundle);
        if (bundle == null && (arguments = getArguments()) != null) {
            this.f17214l = arguments.getBoolean(SearchToLinkActivity.SHOULD_ENABLE_WEB_PREVIEW, true);
        }
    }

    public void onShareVideoItemClick(int i) {
        this.f17216n = i;
        this.f17217o = this.f17215m.get(i).getVideoUrl();
        if (this.f17214l) {
            startActivityForResult(C4227a.m17746a(getActivity(), this.f17217o, mo15627a()), 1);
            C4227a.m17748a(getActivity());
        } else if (this.f17213k != null) {
            this.f17213k.onYahooVideoSelected(this.f17215m.get(i), i);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            switch (i2) {
                case -1:
                    if (intent != null) {
                        HashMap hashMap = new HashMap();
                        String stringExtra = intent.getStringExtra(SearchToLinkActivity.SOURCE_URL);
                        String stringExtra2 = intent.getStringExtra("title");
                        if (stringExtra2 != null) {
                            hashMap.put("title", stringExtra2);
                        }
                        if (stringExtra != null && !stringExtra.equals(this.f17217o)) {
                            String b = UrlUtils.m17744b(stringExtra);
                            if (this.f17213k != null) {
                                try {
                                    this.f17213k.onYahooUrlSelected(URLDecoder.decode(b, Utils.UTF8), stringExtra, hashMap);
                                    return;
                                } catch (UnsupportedEncodingException e) {
                                    this.f17213k.onYahooUrlSelected(stringExtra, stringExtra, hashMap);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (this.f17213k != null && this.f17216n >= 0) {
                            this.f17213k.onYahooVideoSelected(this.f17215m.get(this.f17216n), this.f17216n);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }
}
