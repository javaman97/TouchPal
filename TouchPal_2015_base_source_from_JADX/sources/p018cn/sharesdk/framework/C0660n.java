package p018cn.sharesdk.framework;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: cn.sharesdk.framework.n */
class C0660n extends TextView {

    /* renamed from: a */
    final /* synthetic */ ImageView f1624a;

    /* renamed from: b */
    final /* synthetic */ TitleLayout f1625b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0660n(TitleLayout titleLayout, Context context, ImageView imageView) {
        super(context);
        this.f1625b = titleLayout;
        this.f1624a = imageView;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f1624a.setVisibility(i);
    }
}
