package com.cootek.smartinput5.func.yahoosearch;

import android.content.Context;
import android.content.Intent;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.interfaces.IImageViewer;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.n */
/* compiled from: SearchImagePreviewer */
public class C2134n implements IImageViewer {
    public Intent getIntent(Context context, String str, ArrayList<PhotoData> arrayList, int i, boolean z) {
        Intent intent = new Intent(context, ImagePreviewActivity.class);
        intent.putParcelableArrayListExtra(ImagePreviewActivity.f9046b, arrayList);
        intent.putExtra(ImagePreviewActivity.f9045a, str);
        intent.putExtra(ImagePreviewActivity.f9047c, i);
        return intent;
    }
}
