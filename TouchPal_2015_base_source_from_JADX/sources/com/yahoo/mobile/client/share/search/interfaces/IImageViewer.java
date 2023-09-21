package com.yahoo.mobile.client.share.search.interfaces;

import android.content.Context;
import android.content.Intent;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import java.util.ArrayList;

public interface IImageViewer {
    Intent getIntent(Context context, String str, ArrayList<PhotoData> arrayList, int i, boolean z);
}
