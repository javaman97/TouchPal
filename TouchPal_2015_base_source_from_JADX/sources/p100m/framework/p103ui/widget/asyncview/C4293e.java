package p100m.framework.p103ui.widget.asyncview;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;
import p100m.framework.p101a.C4274h;
import p100m.framework.p102b.C4284g;
import p100m.framework.p103ui.widget.asyncview.C4287c;

/* renamed from: m.framework.ui.widget.asyncview.e */
/* compiled from: BitmapProcessor */
class C4293e implements C4274h {

    /* renamed from: a */
    final /* synthetic */ C4287c.C4291d f17477a;

    /* renamed from: b */
    private final /* synthetic */ File f17478b;

    /* renamed from: c */
    private final /* synthetic */ C4287c.C4288a f17479c;

    C4293e(C4287c.C4291d dVar, File file, C4287c.C4288a aVar) {
        this.f17477a = dVar;
        this.f17478b = file;
        this.f17479c = aVar;
    }

    /* renamed from: a */
    public void mo15936a(InputStream inputStream) {
        Bitmap a = C4284g.m17940a((InputStream) new C4287c.C4290c(inputStream));
        if (a == null || a.isRecycled()) {
            this.f17477a.f17474d = null;
            return;
        }
        this.f17477a.m17977a(a, this.f17478b);
        if (a != null) {
            this.f17477a.f17471a.f17458f.put(this.f17479c.f17464a, a);
            this.f17479c.m17967a(a);
        }
        this.f17477a.f17474d = null;
    }
}
