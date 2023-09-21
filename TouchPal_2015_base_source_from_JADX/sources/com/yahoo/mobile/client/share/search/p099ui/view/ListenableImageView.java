package com.yahoo.mobile.client.share.search.p099ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: com.yahoo.mobile.client.share.search.ui.view.ListenableImageView */
public class ListenableImageView extends ImageView {

    /* renamed from: a */
    private ImageViewListener f17269a;

    /* renamed from: com.yahoo.mobile.client.share.search.ui.view.ListenableImageView$ImageViewListener */
    public interface ImageViewListener {
        void onImageLoaded(ImageView imageView);
    }

    public ListenableImageView(Context context, ImageViewListener imageViewListener) {
        super(context);
        this.f17269a = imageViewListener;
    }

    public ListenableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListenableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f17269a != null) {
            this.f17269a.onImageLoaded(this);
        }
    }

    /* renamed from: a */
    public final void mo15828a(ImageViewListener imageViewListener) {
        this.f17269a = imageViewListener;
    }
}
