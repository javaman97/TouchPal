package android.support.p001v4.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

/* renamed from: android.support.v4.app.h */
/* compiled from: ActivityOptionsCompatJB */
class C0158h {

    /* renamed from: a */
    private final ActivityOptions f383a;

    /* renamed from: a */
    public static C0158h m607a(Context context, int i, int i2) {
        return new C0158h(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    /* renamed from: a */
    public static C0158h m608a(View view, int i, int i2, int i3, int i4) {
        return new C0158h(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    /* renamed from: a */
    public static C0158h m609a(View view, Bitmap bitmap, int i, int i2) {
        return new C0158h(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    private C0158h(ActivityOptions activityOptions) {
        this.f383a = activityOptions;
    }

    /* renamed from: a */
    public Bundle mo464a() {
        return this.f383a.toBundle();
    }

    /* renamed from: a */
    public void mo465a(C0158h hVar) {
        this.f383a.update(hVar.f383a);
    }
}
