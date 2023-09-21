package android.support.p001v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

/* renamed from: android.support.v4.app.g */
/* compiled from: ActivityOptionsCompat */
public class C0156g {
    /* renamed from: a */
    public static C0156g m600a(Context context, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new C0157a(C0158h.m607a(context, i, i2));
        }
        return new C0156g();
    }

    /* renamed from: a */
    public static C0156g m601a(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new C0157a(C0158h.m608a(view, i, i2, i3, i4));
        }
        return new C0156g();
    }

    /* renamed from: a */
    public static C0156g m602a(View view, Bitmap bitmap, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new C0157a(C0158h.m609a(view, bitmap, i, i2));
        }
        return new C0156g();
    }

    /* renamed from: android.support.v4.app.g$a */
    /* compiled from: ActivityOptionsCompat */
    private static class C0157a extends C0156g {

        /* renamed from: a */
        private final C0158h f382a;

        C0157a(C0158h hVar) {
            this.f382a = hVar;
        }

        /* renamed from: a */
        public Bundle mo462a() {
            return this.f382a.mo464a();
        }

        /* renamed from: a */
        public void mo463a(C0156g gVar) {
            if (gVar instanceof C0157a) {
                this.f382a.mo465a(((C0157a) gVar).f382a);
            }
        }
    }

    protected C0156g() {
    }

    /* renamed from: a */
    public Bundle mo462a() {
        return null;
    }

    /* renamed from: a */
    public void mo463a(C0156g gVar) {
    }
}
