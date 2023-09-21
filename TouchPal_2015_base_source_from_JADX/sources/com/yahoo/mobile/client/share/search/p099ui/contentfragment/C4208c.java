package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.interfaces.ILinkableContent;
import com.yahoo.mobile.client.share.search.interfaces.IQuery;
import com.yahoo.mobile.client.share.search.interfaces.ISearchToLinkListener;
import com.yahoo.mobile.client.share.search.p099ui.activity.ImageGalleryActivity;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchToLinkActivity;
import com.yahoo.mobile.client.share.search.p099ui.view.justifiedview.C4224c;
import com.yahoo.mobile.client.share.search.p099ui.view.justifiedview.C4225d;
import com.yahoo.mobile.client.share.search.util.C4227a;
import java.util.ArrayList;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.c */
public class C4208c extends C4202a implements ILinkableContent {

    /* renamed from: n */
    private IYahooSearchToLinkListener f17210n;

    /* renamed from: o */
    private boolean f17211o = true;

    /* renamed from: p */
    private boolean f17212p = true;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4224c mo15779a(SearchQuery searchQuery, ArrayList<PhotoData> arrayList) {
        if (getActivity() == null) {
            return null;
        }
        C4225d dVar = new C4225d(getActivity(), searchQuery, this, arrayList, this.f17211o);
        if (this.f17210n == null) {
            return dVar;
        }
        dVar.mo15863a(this.f17210n);
        return dVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle == null && (arguments = getArguments()) != null) {
            this.f17212p = arguments.getBoolean(SearchToLinkActivity.SHOULD_SHOW_COPYRIGHT, true);
            this.f17211o = arguments.getBoolean(SearchToLinkActivity.SHOULD_ENABLE_IMAGE_PREVIEW, true);
        }
        if (this.f17212p) {
            this.f17192i = layoutInflater.inflate(C4073a.C4083j.yssdk_copyright_message, (ViewGroup) null);
        }
        return this.f17137c;
    }

    public void setSearchToLinkListener(ISearchToLinkListener iSearchToLinkListener) {
        this.f17210n = (IYahooSearchToLinkListener) iSearchToLinkListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo15627a() {
        return 5;
    }

    public String getVerticalId() {
        return "sch_shr_image_screen";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15780a(int i, ArrayList<PhotoData> arrayList, int i2, String str) {
        IQuery lastQuery = ((ContentManager) getContentManager()).getLastQuery();
        String str2 = "";
        if (lastQuery != null) {
            str2 = lastQuery.getQueryString();
        }
        startActivityForResult(C4227a.m17747a(getActivity(), str2, arrayList, i - i2, this.f17212p), 1);
        C4227a.m17748a(getActivity());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            switch (i2) {
                case -1:
                    PhotoData photoData = (PhotoData) intent.getParcelableExtra(ImageGalleryActivity.PHOTO_DATA);
                    int intExtra = intent.getIntExtra(ImageGalleryActivity.CURRENT_POS, -1);
                    if (this.f17210n != null) {
                        this.f17210n.onYahooImageSelected(photoData, intExtra);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
