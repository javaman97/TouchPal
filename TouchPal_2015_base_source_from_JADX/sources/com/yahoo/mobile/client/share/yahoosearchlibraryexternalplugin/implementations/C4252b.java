package com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.p023a.p024a.p025a.p026a.C0725b;
import com.p023a.p024a.p025a.p026a.p027a.C0724c;
import com.p023a.p024a.p032b.C0768c;
import com.p023a.p024a.p032b.C0778d;
import com.p023a.p024a.p032b.C0785e;
import com.p023a.p024a.p032b.p033a.C0753b;
import com.p023a.p024a.p032b.p033a.C0757e;
import com.p023a.p024a.p032b.p033a.C0760h;
import com.p023a.p024a.p032b.p038e.C0790a;
import com.p023a.p024a.p032b.p038e.C0792c;
import com.p023a.p024a.p032b.p039f.C0795a;
import com.p023a.p024a.p041c.C0816g;
import com.yahoo.mobile.client.share.search.interfaces.IImageLoadListener;
import com.yahoo.mobile.client.share.search.interfaces.IImageLoader;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.b */
public class C4252b implements IImageLoader {

    /* renamed from: c */
    private static volatile C4252b f17404c = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0778d f17405a = null;

    /* renamed from: b */
    private Context f17406b = null;

    /* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.b$b */
    private static class C4254b implements C0795a, Future<Drawable> {

        /* renamed from: a */
        private BitmapDrawable f17408a;

        /* renamed from: b */
        private Context f17409b;

        /* renamed from: c */
        private C0792c f17410c;

        /* renamed from: d */
        private boolean f17411d = false;

        /* renamed from: e */
        private C0778d f17412e;

        /* renamed from: f */
        private IImageLoadListener f17413f;

        public final /* bridge */ /* synthetic */ Object get() throws InterruptedException, ExecutionException {
            return this.f17408a;
        }

        public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f17408a;
        }

        public C4254b(Context context, C0792c cVar, C0778d dVar, IImageLoadListener iImageLoadListener) {
            this.f17409b = context;
            this.f17410c = cVar;
            this.f17412e = dVar;
            this.f17413f = iImageLoadListener;
        }

        /* renamed from: b */
        public final void mo3002b(String str, View view) {
            this.f17411d = true;
        }

        /* renamed from: a */
        public final void mo2936a(String str, View view, Bitmap bitmap) {
            this.f17408a = new BitmapDrawable(this.f17409b.getResources(), bitmap);
            this.f17413f.onImageReady(this.f17408a, Uri.parse(str));
            this.f17413f.onImageReady(this.f17408a);
        }

        /* renamed from: a */
        public final void mo3001a(String str, View view, C0753b bVar) {
        }

        /* renamed from: a */
        public final void mo3000a(String str, View view) {
        }

        public final boolean cancel(boolean z) {
            this.f17412e.mo2922b((C0790a) this.f17410c);
            return true;
        }

        public final boolean isCancelled() {
            return this.f17411d;
        }

        public final boolean isDone() {
            return this.f17408a != null;
        }
    }

    private C4252b(Context context) {
        this.f17406b = context.getApplicationContext();
        C0785e c = new C0785e.C0787a(context.getApplicationContext()).mo2957a(new C0768c.C0770a().mo2881b(true).mo2887d(true).mo2888d()).mo2964b((C0725b) new C0724c(C0816g.m4639a(this.f17406b, false))).mo2970f(52428800).mo2972h(100).mo2967c();
        this.f17405a = C4253a.m17809m();
        this.f17405a.mo2904a(c);
        this.f17406b.registerComponentCallbacks(new C4255c(this));
    }

    /* renamed from: a */
    public static C4252b m17808a(Context context) {
        if (f17404c == null) {
            synchronized (C4252b.class) {
                if (f17404c == null) {
                    f17404c = new C4252b(context);
                }
            }
        }
        return f17404c;
    }

    public Drawable loadImage(Uri uri, IImageLoadListener iImageLoadListener) {
        Future<Drawable> loadImageAsync = loadImageAsync(uri, iImageLoadListener, (int[]) null);
        if (loadImageAsync != null && loadImageAsync.isDone() && !loadImageAsync.isCancelled()) {
            try {
                return loadImageAsync.get();
            } catch (InterruptedException | ExecutionException e) {
            }
        }
        return null;
    }

    public Future<Drawable> loadImageAsync(Uri uri, IImageLoadListener iImageLoadListener, int[] iArr) {
        C0757e eVar;
        if (iArr != null) {
            eVar = new C0757e(iArr[0], iArr[1]);
        } else {
            eVar = new C0757e(0, 0);
        }
        C0792c cVar = new C0792c(uri.toString(), eVar, C0760h.FIT_INSIDE);
        C4254b bVar = new C4254b(this.f17406b, cVar, this.f17405a, iImageLoadListener);
        this.f17405a.mo2918a(uri.toString(), (C0790a) cVar, (C0795a) bVar);
        return bVar;
    }

    public void removeCacheEntryForUri(Uri uri) {
        this.f17405a.mo2925c().mo2733a(uri.toString());
        this.f17405a.mo2928f().mo2683b(uri.toString());
    }

    public void clearCache() {
        this.f17405a.mo2926d();
        this.f17405a.mo2930h();
    }

    /* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.b$a */
    public static class C4253a extends C0778d {

        /* renamed from: e */
        private static volatile C4253a f17407e;

        /* renamed from: m */
        public static C4253a m17809m() {
            if (f17407e == null) {
                synchronized (C0778d.class) {
                    if (f17407e == null) {
                        f17407e = new C4253a();
                    }
                }
            }
            return f17407e;
        }
    }
}
