package com.yahoo.mobile.client.share.search.p099ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p001v4.view.C0510x;
import android.support.p001v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.interfaces.IImageLoadListener;
import com.yahoo.mobile.client.share.search.interfaces.IImageLoader;
import com.yahoo.mobile.client.share.search.p099ui.view.ListenableImageView;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yahoo.mobile.client.share.search.ui.a */
public final class C4169a extends C0510x {

    /* renamed from: a */
    private Context f16948a;

    /* renamed from: b */
    private ArrayList<PhotoData> f16949b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IImageLoader f16950c;

    /* renamed from: d */
    private ListenableImageView.ImageViewListener f16951d;

    public final /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i) {
        String escapedPhotoUrl;
        Drawable loadImage;
        Drawable loadImage2;
        new StringBuilder("Get view = ").append(i);
        new StringBuilder("Total count: ").append(getCount());
        final ListenableImageView listenableImageView = new ListenableImageView(this.f16948a, this.f16951d);
        final PhotoData a = mo15579a(i);
        listenableImageView.setTag(a);
        C41701 r2 = new IImageLoadListener() {
            public final void onImageReady(Drawable drawable) {
            }

            public final void onImageReady(Drawable drawable, Uri uri) {
                synchronized (this) {
                    if (!(drawable == null || uri == null)) {
                        if (a.getEscapedPhotoUrl().equalsIgnoreCase(uri.toString()) || a.getEscapedThumbnailUrl().equalsIgnoreCase(uri.toString())) {
                            listenableImageView.setImageDrawable(drawable);
                            listenableImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            listenableImageView.setAdjustViewBounds(true);
                        }
                    }
                    Drawable loadImage = C4169a.this.f16950c.loadImage(Uri.parse(a.getEscapedThumbnailUrl()), this);
                    if (loadImage != null) {
                        listenableImageView.setImageDrawable(loadImage);
                    }
                }
            }
        };
        if (a != null) {
            if (!(a.getEscapedThumbnailUrl() == null || (loadImage2 = this.f16950c.loadImage(Uri.parse(a.getEscapedThumbnailUrl()), r2)) == null)) {
                listenableImageView.setImageDrawable(loadImage2);
            }
            int integer = this.f16948a.getResources().getInteger(C4073a.C4082i.max_image_size);
            new StringBuilder("Limit: ").append(integer).append(" | Width: ").append(a.getImgWidth()).append(" | Height: ").append(a.getImgHeight());
            if (a.getImgHeight() < integer && a.getImgWidth() < integer && (escapedPhotoUrl = a.getEscapedPhotoUrl()) != null && (loadImage = this.f16950c.loadImage(Uri.parse(escapedPhotoUrl), r2)) != null) {
                listenableImageView.setImageDrawable(loadImage);
            }
        }
        ((ViewPager) viewGroup).addView(listenableImageView, 0);
        return listenableImageView;
    }

    public C4169a(Context context, ArrayList<PhotoData> arrayList, ListenableImageView.ImageViewListener imageViewListener) {
        this.f16948a = context;
        if (arrayList == null) {
            this.f16949b = new ArrayList<>();
        } else {
            this.f16949b = arrayList;
        }
        this.f16950c = C4129c.m17444i().getImageLoader(this.f16948a);
        this.f16951d = imageViewListener;
    }

    /* renamed from: a */
    public final void mo15580a() {
        Iterator<PhotoData> it = this.f16949b.iterator();
        while (it.hasNext()) {
            PhotoData next = it.next();
            if (this.f16950c != null) {
                if (next.getOrigPhotoUrl() != null) {
                    this.f16950c.removeCacheEntryForUri(Uri.parse(next.getOrigPhotoUrl()));
                }
                if (next.getEscapedPhotoUrl() != null) {
                    this.f16950c.removeCacheEntryForUri(Uri.parse(next.getEscapedPhotoUrl()));
                }
            }
        }
    }

    public final int getCount() {
        return this.f16949b.size();
    }

    /* renamed from: a */
    public final PhotoData mo15579a(int i) {
        if (i >= this.f16949b.size() || i < 0) {
            return null;
        }
        return this.f16949b.get(i);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == ((ImageView) obj);
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ((ViewPager) viewGroup).removeView((ImageView) obj);
    }
}
