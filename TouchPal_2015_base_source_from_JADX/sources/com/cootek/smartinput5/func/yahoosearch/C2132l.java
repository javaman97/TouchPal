package com.cootek.smartinput5.func.yahoosearch;

import android.content.Context;
import android.text.Html;
import android.view.View;
import com.yahoo.mobile.client.share.search.data.PhotoData;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.l */
/* compiled from: ImagePreviewActivity */
class C2132l implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ImagePreviewActivity f9076a;

    C2132l(ImagePreviewActivity imagePreviewActivity) {
        this.f9076a = imagePreviewActivity;
    }

    public void onClick(View view) {
        C2137q.m9700a((Context) this.f9076a).mo7540b(Html.fromHtml(((PhotoData) this.f9076a.f9049n.get(this.f9076a.f9051p)).getTitle()).toString() + "@ " + ((PhotoData) this.f9076a.f9049n.get(this.f9076a.f9051p)).getPhotoUrl());
    }
}
