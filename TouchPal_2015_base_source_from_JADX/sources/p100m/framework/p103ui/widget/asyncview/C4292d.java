package p100m.framework.p103ui.widget.asyncview;

import java.util.TimerTask;
import p100m.framework.p103ui.widget.asyncview.C4287c;

/* renamed from: m.framework.ui.widget.asyncview.d */
/* compiled from: BitmapProcessor */
class C4292d extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ C4287c.C4289b f17475a;

    /* renamed from: b */
    private int f17476b;

    C4292d(C4287c.C4289b bVar) {
        this.f17475a = bVar;
    }

    public void run() {
        if (this.f17475a.f17469a.f17459g) {
            this.f17476b--;
            if (this.f17476b <= 0) {
                this.f17476b = 100;
                this.f17475a.m17973a();
            }
        }
    }
}
