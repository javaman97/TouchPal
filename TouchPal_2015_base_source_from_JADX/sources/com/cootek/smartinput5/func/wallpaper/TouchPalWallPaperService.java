package com.cootek.smartinput5.func.wallpaper;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;
import com.emoji.keyboard.touchpal.R;

@TargetApi(7)
public class TouchPalWallPaperService extends WallpaperService {
    public WallpaperService.Engine onCreateEngine() {
        return new C2118a();
    }

    /* renamed from: com.cootek.smartinput5.func.wallpaper.TouchPalWallPaperService$a */
    public class C2118a extends WallpaperService.Engine {
        public C2118a() {
            super(TouchPalWallPaperService.this);
        }

        public void onSurfaceCreated(SurfaceHolder surfaceHolder) {
            super.onSurfaceCreated(surfaceHolder);
            Canvas lockCanvas = surfaceHolder.lockCanvas();
            if (lockCanvas != null) {
                m9656a(lockCanvas);
                surfaceHolder.unlockCanvasAndPost(lockCanvas);
            }
        }

        /* renamed from: a */
        private void m9656a(Canvas canvas) {
            Paint paint = new Paint();
            Resources resources = TouchPalWallPaperService.this.getApplicationContext().getResources();
            canvas.drawBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, R.drawable.new_guide_background), resources.getDisplayMetrics().widthPixels, resources.getDisplayMetrics().heightPixels, false), 0.0f, 0.0f, paint);
        }
    }
}
