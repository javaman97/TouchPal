package com.yahoo.mobile.client.share.search.p099ui.view;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.yahoo.mobile.client.share.search.interfaces.IImageLoadListener;

/* renamed from: com.yahoo.mobile.client.share.search.ui.view.ThumbImageViewHolder */
public final class ThumbImageViewHolder implements IImageLoadListener {

    /* renamed from: a */
    private ImageView f17276a;

    /* renamed from: b */
    private IThumbnailHolder f17277b;

    /* renamed from: c */
    private Animation f17278c;

    /* renamed from: com.yahoo.mobile.client.share.search.ui.view.ThumbImageViewHolder$IThumbnailHolder */
    public interface IThumbnailHolder {
        String getEscapedThumbnailUrl();
    }

    public final void onImageReady(Drawable drawable, Uri uri) {
        synchronized (this) {
            if (uri != null) {
                if (this.f17277b.getEscapedThumbnailUrl().equalsIgnoreCase(uri.toString()) && drawable != this.f17276a.getDrawable()) {
                    this.f17276a.setImageDrawable(drawable);
                    this.f17276a.setScaleType(ImageView.ScaleType.FIT_XY);
                    this.f17276a.setAdjustViewBounds(true);
                    this.f17276a.startAnimation(this.f17278c);
                }
            }
        }
    }

    public final void onImageReady(Drawable drawable) {
    }
}
