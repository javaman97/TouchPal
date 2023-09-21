package com.yahoo.mobile.client.share.search.p099ui.view.justifiedview;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.contentmanager.IListViewAdapterHandler;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.IYahooSearchToLinkListener;
import com.yahoo.mobile.client.share.search.p099ui.view.C4221a;
import java.util.ArrayList;

/* renamed from: com.yahoo.mobile.client.share.search.ui.view.justifiedview.d */
public final class C4225d extends C4224c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public IYahooSearchToLinkListener f17308d;

    /* renamed from: e */
    private boolean f17309e = true;

    public C4225d(Context context, SearchQuery searchQuery, IListViewAdapterHandler iListViewAdapterHandler, ArrayList<PhotoData> arrayList, boolean z) {
        super(context, searchQuery, iListViewAdapterHandler, arrayList);
        this.f17309e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo15848a(int i, View view) {
        return super.mo15848a(i, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final LinearLayout mo15850a(LinearLayout linearLayout, JustifiedViewRowInfo justifiedViewRowInfo, int i) {
        return super.mo15850a(linearLayout, justifiedViewRowInfo, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo15849a(JustifiedViewRowInfo justifiedViewRowInfo, C4223b bVar, int i) {
        View a = super.mo15849a(justifiedViewRowInfo, bVar, i);
        if (this.f17309e) {
            return a;
        }
        final int i2 = justifiedViewRowInfo.f17291b + i;
        C4221a aVar = new C4221a(this.f17296a, a);
        aVar.setTag(Integer.valueOf(i2));
        aVar.setClickable(true);
        aVar.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (C4225d.this.f17308d != null) {
                    C4225d.this.f17308d.onYahooImageSelected(C4225d.this.mo15854b().get(i2), i2);
                }
            }
        });
        return aVar;
    }

    /* renamed from: a */
    public final void mo15863a(IYahooSearchToLinkListener iYahooSearchToLinkListener) {
        this.f17308d = iYahooSearchToLinkListener;
    }
}
