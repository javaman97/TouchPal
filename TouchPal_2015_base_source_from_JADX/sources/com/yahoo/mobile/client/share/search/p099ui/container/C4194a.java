package com.yahoo.mobile.client.share.search.p099ui.container;

import android.content.Context;
import android.os.Bundle;
import android.support.p001v4.app.C0173s;
import android.view.View;
import android.view.ViewGroup;
import com.yahoo.mobile.client.share.search.interfaces.ILinkableContent;
import com.yahoo.mobile.client.share.search.interfaces.ISearchToLinkListener;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchToLinkActivity;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.C4208c;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.SearchResultFragment;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.ShareWebContentFragment;
import java.util.List;

/* renamed from: com.yahoo.mobile.client.share.search.ui.container.a */
public class C4194a extends SearchPagerContainer {
    public C4194a(Context context, Bundle bundle, C0173s sVar, ViewGroup viewGroup, View view, List<Bundle> list, int i, boolean z, boolean z2, boolean z3, boolean z4, ISearchToLinkListener iSearchToLinkListener) {
        super(context, bundle, sVar, viewGroup, view, list, i, z);
        for (SearchResultFragment next : this.f17105f.getFragmentList()) {
            if (!(next instanceof ILinkableContent)) {
                throw new IllegalArgumentException("Vertical : " + next.getClass() + " must implement ILinkableContent");
            }
            ((ILinkableContent) next).setSearchToLinkListener(iSearchToLinkListener);
            Bundle arguments = next.getArguments();
            arguments = arguments == null ? new Bundle() : arguments;
            arguments.putBoolean(SearchToLinkActivity.SHOULD_ENABLE_WEB_PREVIEW, z3);
            arguments.putBoolean(SearchToLinkActivity.SHOULD_ENABLE_IMAGE_PREVIEW, z4);
            if ((next instanceof ShareWebContentFragment) || (next instanceof C4208c)) {
                arguments.putBoolean(SearchToLinkActivity.SHOULD_SHOW_COPYRIGHT, z2);
            }
            if (arguments != null) {
                next.setArguments(arguments);
            }
        }
    }
}
