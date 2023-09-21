package p018cn.sharesdk.onekeyshare;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import p018cn.sharesdk.framework.FakeActivity;

/* renamed from: cn.sharesdk.onekeyshare.PicViewer */
public class PicViewer extends FakeActivity implements View.OnClickListener {
    private ImageView ivViewer;
    private Bitmap pic;

    public void setImageBitmap(Bitmap bitmap) {
        this.pic = bitmap;
        if (this.ivViewer != null) {
            this.ivViewer.setImageBitmap(bitmap);
        }
    }

    public void onCreate() {
        this.ivViewer = new ImageView(this.activity);
        this.ivViewer.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.ivViewer.setBackgroundColor(-1073741824);
        this.ivViewer.setOnClickListener(this);
        this.activity.setContentView(this.ivViewer);
        if (this.pic != null && !this.pic.isRecycled()) {
            this.ivViewer.setImageBitmap(this.pic);
        }
    }

    public void onClick(View view) {
        finish();
    }
}
