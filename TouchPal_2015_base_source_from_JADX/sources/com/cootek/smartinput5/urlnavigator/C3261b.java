package com.cootek.smartinput5.urlnavigator;

import android.os.AsyncTask;

/* renamed from: com.cootek.smartinput5.urlnavigator.b */
/* compiled from: FaviconPullTask */
class C3261b extends AsyncTask<Object, Integer, Boolean> {

    /* renamed from: a */
    final /* synthetic */ C3262c f14350a;

    /* renamed from: b */
    final /* synthetic */ C3260a f14351b;

    C3261b(C3260a aVar, C3262c cVar) {
        this.f14351b = aVar;
        this.f14350a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean doInBackground(Object... objArr) {
        return Boolean.valueOf(this.f14351b.m14482a(this.f14350a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            this.f14351b.f14345b.mo10449b();
        }
        if (!this.f14351b.f14349f) {
            this.f14351b.m14485d();
        }
        super.onPostExecute(bool);
    }
}
