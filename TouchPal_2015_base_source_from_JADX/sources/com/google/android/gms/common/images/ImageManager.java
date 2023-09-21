package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.util.Log;
import android.widget.ImageView;
import com.cootek.smartinput5.func.C1411aV;
import com.google.android.gms.common.images.C3536a;
import com.google.android.gms.internal.C3608as;
import com.google.android.gms.internal.C3775h;
import com.google.android.gms.internal.C3806w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public static final Object f15282aq = new Object();
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public static HashSet<Uri> f15283ar = new HashSet<>();

    /* renamed from: as */
    private static ImageManager f15284as;

    /* renamed from: at */
    private static ImageManager f15285at;
    /* access modifiers changed from: private */

    /* renamed from: au */
    public final ExecutorService f15286au = Executors.newFixedThreadPool(4);
    /* access modifiers changed from: private */

    /* renamed from: av */
    public final C3531b f15287av;
    /* access modifiers changed from: private */

    /* renamed from: aw */
    public final Map<C3536a, ImageReceiver> f15288aw;
    /* access modifiers changed from: private */

    /* renamed from: ax */
    public final Map<Uri, ImageReceiver> f15289ax;
    /* access modifiers changed from: private */
    public final Context mContext;
    /* access modifiers changed from: private */
    public final Handler mHandler = new Handler(Looper.getMainLooper());

    private final class ImageReceiver extends ResultReceiver {
        /* access modifiers changed from: private */

        /* renamed from: ay */
        public final ArrayList<C3536a> f15291ay;

        /* renamed from: az */
        boolean f15292az = false;
        private final Uri mUri;

        ImageReceiver(Uri uri) {
            super(new Handler(Looper.getMainLooper()));
            this.mUri = uri;
            this.f15291ay = new ArrayList<>();
        }

        /* renamed from: c */
        public void mo11006c(C3536a aVar) {
            C3775h.m16566a(!this.f15292az, "Cannot add an ImageRequest when mHandlingRequests is true");
            C3775h.m16568f("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f15291ay.add(aVar);
        }

        /* renamed from: d */
        public void mo11007d(C3536a aVar) {
            C3775h.m16566a(!this.f15292az, "Cannot remove an ImageRequest when mHandlingRequests is true");
            C3775h.m16568f("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f15291ay.remove(aVar);
        }

        public void onReceiveResult(int i, Bundle bundle) {
            ImageManager.this.f15286au.execute(new C3532c(this.mUri, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }

        /* renamed from: q */
        public void mo11009q() {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", this.mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.this.mContext.sendBroadcast(intent);
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable);
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    private static final class C3530a {
        /* renamed from: a */
        static int m15399a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    private static final class C3531b extends C3806w<C3536a.C3537a, Bitmap> {
        public C3531b(Context context) {
            super(m15400e(context));
        }

        /* renamed from: e */
        private static int m15400e(Context context) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(C1411aV.f4484k);
            return (int) (((float) (((!((context.getApplicationInfo().flags & 1048576) != 0) || !C3608as.m15697an()) ? activityManager.getMemoryClass() : C3530a.m15399a(activityManager)) * 1048576)) * 0.33f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(C3536a.C3537a aVar, Bitmap bitmap) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void entryRemoved(boolean z, C3536a.C3537a aVar, Bitmap bitmap, Bitmap bitmap2) {
            super.entryRemoved(z, aVar, bitmap, bitmap2);
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    private final class C3532c implements Runnable {

        /* renamed from: aB */
        private final ParcelFileDescriptor f15294aB;
        private final Uri mUri;

        public C3532c(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.mUri = uri;
            this.f15294aB = parcelFileDescriptor;
        }

        public void run() {
            C3775h.m16569g("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            boolean z = false;
            Bitmap bitmap = null;
            if (this.f15294aB != null) {
                try {
                    bitmap = BitmapFactory.decodeFileDescriptor(this.f15294aB.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    Log.e("ImageManager", "OOM while loading bitmap for uri: " + this.mUri, e);
                    z = true;
                }
                try {
                    this.f15294aB.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.mHandler.post(new C3535f(this.mUri, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e3) {
                Log.w("ImageManager", "Latch interrupted while posting " + this.mUri);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$d */
    private final class C3533d implements Runnable {

        /* renamed from: aC */
        private final C3536a f15296aC;

        public C3533d(C3536a aVar) {
            this.f15296aC = aVar;
        }

        public void run() {
            C3775h.m16568f("LoadImageRunnable must be executed on the main thread");
            boolean unused = ImageManager.this.m15386b(this.f15296aC);
            C3536a.C3537a aVar = this.f15296aC.f15302aG;
            if (aVar.uri == null) {
                this.f15296aC.mo11024b(ImageManager.this.mContext, true);
                return;
            }
            Bitmap a = ImageManager.this.m15382a(aVar);
            if (a != null) {
                this.f15296aC.mo11021a(ImageManager.this.mContext, a, true);
                return;
            }
            this.f15296aC.mo11026f(ImageManager.this.mContext);
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f15289ax.get(aVar.uri);
            if (imageReceiver == null) {
                imageReceiver = new ImageReceiver(aVar.uri);
                ImageManager.this.f15289ax.put(aVar.uri, imageReceiver);
            }
            imageReceiver.mo11006c(this.f15296aC);
            if (this.f15296aC.f15305aJ != 1) {
                ImageManager.this.f15288aw.put(this.f15296aC, imageReceiver);
            }
            synchronized (ImageManager.f15282aq) {
                if (!ImageManager.f15283ar.contains(aVar.uri)) {
                    ImageManager.f15283ar.add(aVar.uri);
                    imageReceiver.mo11009q();
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$e */
    private static final class C3534e implements ComponentCallbacks2 {

        /* renamed from: av */
        private final C3531b f15297av;

        public C3534e(C3531b bVar) {
            this.f15297av = bVar;
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
            this.f15297av.evictAll();
        }

        public void onTrimMemory(int i) {
            if (i >= 60) {
                this.f15297av.evictAll();
            } else if (i >= 20) {
                this.f15297av.trimToSize(this.f15297av.size() / 2);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$f */
    private final class C3535f implements Runnable {

        /* renamed from: aD */
        private final Bitmap f15299aD;

        /* renamed from: aE */
        private final CountDownLatch f15300aE;

        /* renamed from: aF */
        private boolean f15301aF;
        private final Uri mUri;

        public C3535f(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.mUri = uri;
            this.f15299aD = bitmap;
            this.f15301aF = z;
            this.f15300aE = countDownLatch;
        }

        /* renamed from: a */
        private void m15403a(ImageReceiver imageReceiver, boolean z) {
            imageReceiver.f15292az = true;
            ArrayList a = imageReceiver.f15291ay;
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C3536a aVar = (C3536a) a.get(i);
                if (z) {
                    aVar.mo11021a(ImageManager.this.mContext, this.f15299aD, false);
                } else {
                    aVar.mo11024b(ImageManager.this.mContext, false);
                }
                if (aVar.f15305aJ != 1) {
                    ImageManager.this.f15288aw.remove(aVar);
                }
            }
            imageReceiver.f15292az = false;
        }

        public void run() {
            C3775h.m16568f("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.f15299aD != null;
            if (ImageManager.this.f15287av != null) {
                if (this.f15301aF) {
                    ImageManager.this.f15287av.evictAll();
                    System.gc();
                    this.f15301aF = false;
                    ImageManager.this.mHandler.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.f15287av.put(new C3536a.C3537a(this.mUri), this.f15299aD);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f15289ax.remove(this.mUri);
            if (imageReceiver != null) {
                m15403a(imageReceiver, z);
            }
            this.f15300aE.countDown();
            synchronized (ImageManager.f15282aq) {
                ImageManager.f15283ar.remove(this.mUri);
            }
        }
    }

    private ImageManager(Context context, boolean z) {
        this.mContext = context.getApplicationContext();
        if (z) {
            this.f15287av = new C3531b(this.mContext);
            if (C3608as.m15700aq()) {
                m15391n();
            }
        } else {
            this.f15287av = null;
        }
        this.f15288aw = new HashMap();
        this.f15289ax = new HashMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m15382a(C3536a.C3537a aVar) {
        if (this.f15287av == null) {
            return null;
        }
        return (Bitmap) this.f15287av.get(aVar);
    }

    /* renamed from: a */
    public static ImageManager m15383a(Context context, boolean z) {
        if (z) {
            if (f15285at == null) {
                f15285at = new ImageManager(context, true);
            }
            return f15285at;
        }
        if (f15284as == null) {
            f15284as = new ImageManager(context, false);
        }
        return f15284as;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m15386b(C3536a aVar) {
        C3775h.m16568f("ImageManager.cleanupHashMaps() must be called in the main thread");
        if (aVar.f15305aJ == 1) {
            return true;
        }
        ImageReceiver imageReceiver = this.f15288aw.get(aVar);
        if (imageReceiver == null) {
            return true;
        }
        if (imageReceiver.f15292az) {
            return false;
        }
        this.f15288aw.remove(aVar);
        imageReceiver.mo11007d(aVar);
        return true;
    }

    public static ImageManager create(Context context) {
        return m15383a(context, false);
    }

    /* renamed from: n */
    private void m15391n() {
        this.mContext.registerComponentCallbacks(new C3534e(this.f15287av));
    }

    /* renamed from: a */
    public void mo11000a(C3536a aVar) {
        C3775h.m16568f("ImageManager.loadImage() must be called in the main thread");
        boolean b = m15386b(aVar);
        C3533d dVar = new C3533d(aVar);
        if (b) {
            dVar.run();
        } else {
            this.mHandler.post(dVar);
        }
    }

    public void loadImage(ImageView imageView, int i) {
        C3536a aVar = new C3536a(i);
        aVar.mo11022a(imageView);
        mo11000a(aVar);
    }

    public void loadImage(ImageView imageView, Uri uri) {
        C3536a aVar = new C3536a(uri);
        aVar.mo11022a(imageView);
        mo11000a(aVar);
    }

    public void loadImage(ImageView imageView, Uri uri, int i) {
        C3536a aVar = new C3536a(uri);
        aVar.mo11028j(i);
        aVar.mo11022a(imageView);
        mo11000a(aVar);
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri) {
        C3536a aVar = new C3536a(uri);
        aVar.mo11023a(onImageLoadedListener);
        mo11000a(aVar);
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri, int i) {
        C3536a aVar = new C3536a(uri);
        aVar.mo11028j(i);
        aVar.mo11023a(onImageLoadedListener);
        mo11000a(aVar);
    }
}
