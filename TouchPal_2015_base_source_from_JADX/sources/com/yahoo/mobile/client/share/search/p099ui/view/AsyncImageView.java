package com.yahoo.mobile.client.share.search.p099ui.view;

import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;
import com.yahoo.mobile.client.share.search.interfaces.IImageLoadListener;
import com.yahoo.mobile.client.share.search.interfaces.IImageLoader;
import com.yahoo.mobile.client.share.search.p096a.C4091b;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.yahoo.mobile.client.share.search.ui.view.AsyncImageView */
public class AsyncImageView extends ImageView {

    /* renamed from: a */
    protected IImageLoadListener f17253a;

    /* renamed from: b */
    protected IImageLoader f17254b;

    /* renamed from: c */
    protected Future<Drawable> f17255c;

    /* renamed from: d */
    protected Drawable f17256d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Uri f17257e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Runnable f17258f;

    public AsyncImageView(Context context) {
        super(context);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void loadImage(Drawable drawable, Uri uri, int i) {
        loadImage(drawable, uri, getResources().getDrawable(i), 0, (int[]) null);
    }

    public void loadImage(Drawable drawable, Uri uri) {
        loadImage(drawable, uri, (Drawable) null, 0, (int[]) null);
    }

    public void loadImage(Uri uri) {
        loadImage((Drawable) null, uri, (Drawable) null, 0, (int[]) null);
    }

    public void loadImage(Drawable drawable, Uri uri, Drawable drawable2) {
        loadImage(drawable, uri, drawable2, 0, (int[]) null);
    }

    public void loadImage(Drawable drawable, Uri uri, Drawable drawable2, int i) {
        loadImage(drawable, uri, drawable2, i, (int[]) null);
    }

    public void loadImage(Drawable drawable, Uri uri, Drawable drawable2, int i, int[] iArr) {
        if (this.f17258f != null) {
            removeCallbacks(this.f17258f);
            this.f17258f = null;
        }
        if (i <= 0) {
            m17713a(drawable, uri, drawable2, iArr);
            return;
        }
        final Drawable drawable3 = drawable;
        final Uri uri2 = uri;
        final Drawable drawable4 = drawable2;
        final int[] iArr2 = iArr;
        this.f17258f = new Runnable() {
            public final void run() {
                if (this == AsyncImageView.this.f17258f) {
                    Runnable unused = AsyncImageView.this.f17258f = null;
                }
                AsyncImageView.this.m17713a(drawable3, uri2, drawable4, iArr2);
            }
        };
        postDelayed(this.f17258f, (long) i);
    }

    /* access modifiers changed from: private */
    @SuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
    /* renamed from: a */
    public void m17713a(Drawable drawable, final Uri uri, Drawable drawable2, int[] iArr) {
        IImageLoader imageLoader;
        Drawable drawable3;
        Drawable a;
        if (drawable2 != null) {
            drawable2 = mo15813a(drawable2);
        }
        if (this.f17254b != null) {
            imageLoader = this.f17254b;
        } else {
            imageLoader = C4129c.m17444i().getImageLoader(getContext());
        }
        if (this.f17255c != null) {
            this.f17255c.cancel(false);
        }
        this.f17257e = uri;
        this.f17255c = imageLoader.loadImageAsync(uri, new IImageLoadListener() {

            /* renamed from: c */
            private Uri f17266c = uri;

            public final void onImageReady(Drawable drawable) {
                if (this.f17266c.equals(AsyncImageView.this.f17257e)) {
                    AsyncImageView.this.f17256d = drawable;
                    if (drawable != null) {
                        if (AsyncImageView.this.f17253a != null) {
                            AsyncImageView.this.f17253a.onImageReady(drawable);
                        }
                        Drawable a = AsyncImageView.this.mo15813a(drawable);
                        Drawable drawable2 = AsyncImageView.this.getDrawable();
                        if (drawable2 == null) {
                            AsyncImageView.this.setImageDrawable(a);
                        } else if (!(drawable2 instanceof LayerDrawable) || ((LayerDrawable) drawable2).getNumberOfLayers() != 2) {
                            AsyncImageView asyncImageView = AsyncImageView.this;
                            AsyncImageView asyncImageView2 = AsyncImageView.this;
                            asyncImageView.setImageDrawable(AsyncImageView.m17711a(drawable2, a));
                        } else {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable2;
                            Drawable drawable3 = layerDrawable.getDrawable(0);
                            Drawable drawable4 = layerDrawable.getDrawable(1);
                            AsyncImageView asyncImageView3 = AsyncImageView.this;
                            Drawable a2 = AsyncImageView.m17711a(drawable3, a);
                            AsyncImageView.this.setImageDrawable(new LayerDrawable(new Drawable[]{a2, drawable4}));
                        }
                    }
                }
            }

            public final void onImageReady(Drawable drawable, Uri uri) {
            }
        }, iArr);
        if (this.f17255c.isDone()) {
            try {
                drawable3 = this.f17255c.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
                drawable3 = null;
            } catch (ExecutionException e2) {
                e2.printStackTrace();
                drawable3 = null;
            }
            this.f17255c = null;
        } else {
            drawable3 = null;
        }
        if (drawable3 != null) {
            this.f17256d = drawable3;
            if (this.f17253a != null) {
                this.f17253a.onImageReady(drawable3);
            }
            a = mo15813a(drawable3);
        } else {
            if (drawable == null && (drawable = getDrawable()) == null) {
                drawable = new ColorDrawable(16777216);
            }
            a = mo15813a(drawable);
        }
        if (drawable2 != null) {
            setImageDrawable(new LayerDrawable(new Drawable[]{a, drawable2}));
            return;
        }
        setImageDrawable(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Drawable mo15813a(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable) || ((BitmapDrawable) drawable).getTileModeX() != Shader.TileMode.CLAMP || (drawable instanceof C4091b)) {
            return drawable;
        }
        return new C4091b(getResources(), ((BitmapDrawable) drawable).getBitmap());
    }

    /* renamed from: a */
    protected static Drawable m17711a(Drawable drawable, Drawable drawable2) {
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(SearchStatusData.RESPONSE_STATUS_SERVER_ERROR);
        return transitionDrawable;
    }

    public IImageLoadListener getLoadListener() {
        return this.f17253a;
    }

    public void setLoadListener(IImageLoadListener iImageLoadListener) {
        this.f17253a = iImageLoadListener;
    }

    public IImageLoader getImageLoader() {
        return this.f17254b;
    }

    public void setImageLoader(IImageLoader iImageLoader) {
        this.f17254b = iImageLoader;
    }

    public void reset() {
        this.f17256d = null;
        this.f17257e = null;
        setImageDrawable((Drawable) null);
        if (this.f17258f != null) {
            removeCallbacks(this.f17258f);
            this.f17258f = null;
        }
        if (this.f17255c != null) {
            this.f17255c.cancel(false);
            this.f17255c = null;
        }
    }
}
