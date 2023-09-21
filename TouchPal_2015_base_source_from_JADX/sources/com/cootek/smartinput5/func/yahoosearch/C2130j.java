package com.cootek.smartinput5.func.yahoosearch;

import android.content.Context;
import android.text.Html;
import android.view.View;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.share.C1985g;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.data.PhotoData;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.j */
/* compiled from: ImagePreviewActivity */
class C2130j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ImagePreviewActivity f9074a;

    C2130j(ImagePreviewActivity imagePreviewActivity) {
        this.f9074a = imagePreviewActivity;
    }

    public void onClick(View view) {
        C1985g.m9132a((Context) this.f9074a, Html.fromHtml(((PhotoData) this.f9074a.f9049n.get(this.f9074a.f9051p)).getTitle()).toString(), ((PhotoData) this.f9074a.f9049n.get(this.f9074a.f9051p)).getPhotoUrl() + " " + C1974m.m9063a((Context) this.f9074a, (int) R.string.search_share_result));
        C1246d.m6010a((Context) this.f9074a).mo4591a(C1246d.f3929dw, C1246d.f3930dx, C1246d.f3923dq);
    }
}
