package com.cootek.smartinput5.func.yahoosearch;

import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.cootek.smartinput5.func.resource.p055ui.TTextView;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.data.PhotoData;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.h */
/* compiled from: ImagePreviewActivity */
class C2128h implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ ImagePreviewActivity f9072a;

    C2128h(ImagePreviewActivity imagePreviewActivity) {
        this.f9072a = imagePreviewActivity;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int unused = this.f9072a.f9051p = i;
        ((TTextView) this.f9072a.findViewById(R.id.title)).setText(Html.fromHtml(((PhotoData) this.f9072a.f9049n.get(this.f9072a.f9051p)).getTitle()));
        String str = null;
        String sourceUrl = ((PhotoData) this.f9072a.f9049n.get(this.f9072a.f9051p)).getSourceUrl();
        int imgWidth = ((PhotoData) this.f9072a.f9049n.get(this.f9072a.f9051p)).getImgWidth();
        int imgHeight = ((PhotoData) this.f9072a.f9049n.get(this.f9072a.f9051p)).getImgHeight();
        if (imgWidth > 0 && imgHeight > 0) {
            str = imgWidth + "×" + imgHeight;
        }
        String size = ((PhotoData) this.f9072a.f9049n.get(this.f9072a.f9051p)).getSize();
        if (!TextUtils.isEmpty(size)) {
            if (str == null) {
                str = size;
            } else {
                str = str + " | " + size;
            }
        }
        String description = ((PhotoData) this.f9072a.f9049n.get(this.f9072a.f9051p)).getDescription();
        if (!TextUtils.isEmpty(description)) {
            if (str == null) {
                str = description;
            } else {
                str = str + " | " + description;
            }
        }
        TTextView tTextView = (TTextView) this.f9072a.findViewById(R.id.search_picture_description);
        if (TextUtils.isEmpty(str)) {
            tTextView.setVisibility(8);
        } else {
            tTextView.setText(str);
        }
        ((TTextView) this.f9072a.findViewById(R.id.search_picture_url)).setText(sourceUrl);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
