package com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations;

import android.content.Context;
import android.content.Intent;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.interfaces.IImageViewer;
import com.yahoo.mobile.client.share.search.p099ui.activity.ImageGalleryActivity;
import java.util.ArrayList;

/* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.f */
public class C4258f implements IImageViewer {
    public Intent getIntent(Context context, String str, ArrayList<PhotoData> arrayList, int i, boolean z) {
        return ImageGalleryActivity.getIntent(context, str, i, arrayList, 0, new SearchQuery(new SearchQuery.Builder().setQueryString(str)), (String) null, 5, true, z);
    }
}
