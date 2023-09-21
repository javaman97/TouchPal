package com.cootek.smartinput5.urlnavigator;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.urlnavigator.h */
/* compiled from: FavoritesView */
class C3268h implements SimpleAdapter.ViewBinder {

    /* renamed from: a */
    final /* synthetic */ C3267g f14376a;

    C3268h(C3267g gVar) {
        this.f14376a = gVar;
    }

    public boolean setViewValue(View view, Object obj, String str) {
        if (view.getId() == R.id.root) {
            view.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.url_navigator_favorites_item_bg));
            view.setOnClickListener(new C3269i(this, obj));
            view.setOnLongClickListener(new C3270j(this, obj));
            return true;
        } else if (!(view instanceof ImageView) || !(obj instanceof Drawable)) {
            return false;
        } else {
            ((ImageView) view).setImageDrawable((Drawable) obj);
            return true;
        }
    }
}
