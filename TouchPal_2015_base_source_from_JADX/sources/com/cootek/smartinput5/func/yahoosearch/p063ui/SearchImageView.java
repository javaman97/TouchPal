package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.SearchImageView */
public class SearchImageView extends ImageView {

    /* renamed from: a */
    private String f9118a;

    /* renamed from: b */
    private C2144a f9119b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2145b f9120c;

    /* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.SearchImageView$b */
    public interface C2145b {
        /* renamed from: a */
        void mo7570a();
    }

    /* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.SearchImageView$a */
    private class C2144a extends AsyncTask<String, Bitmap, Bitmap> {
        private C2144a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
            r1 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
            r1 = r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[SYNTHETIC, Splitter:B:22:0x0042] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0048 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0026] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap doInBackground(java.lang.String... r4) {
            /*
                r3 = this;
                r1 = 0
                r2 = 0
                r0 = r4[r2]
                if (r0 != 0) goto L_0x0008
                r0 = r1
            L_0x0007:
                return r0
            L_0x0008:
                r0 = r4[r2]
                java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0035, all -> 0x003f }
                r2.<init>(r0)     // Catch:{ IOException -> 0x0035, all -> 0x003f }
                java.net.URLConnection r0 = r2.openConnection()     // Catch:{ IOException -> 0x0035, all -> 0x003f }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0035, all -> 0x003f }
                r2 = 6000(0x1770, float:8.408E-42)
                r0.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0035, all -> 0x003f }
                r2 = 1
                r0.setDoInput(r2)     // Catch:{ IOException -> 0x0035, all -> 0x003f }
                r2 = 0
                r0.setUseCaches(r2)     // Catch:{ IOException -> 0x0035, all -> 0x003f }
                java.io.InputStream r2 = r0.getInputStream()     // Catch:{ IOException -> 0x0035, all -> 0x003f }
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
                r2.close()     // Catch:{ IOException -> 0x004f, all -> 0x0048 }
                if (r2 == 0) goto L_0x0007
                r2.close()     // Catch:{ IOException -> 0x0033 }
                goto L_0x0007
            L_0x0033:
                r1 = move-exception
                goto L_0x0007
            L_0x0035:
                r0 = move-exception
                r0 = r1
            L_0x0037:
                if (r1 == 0) goto L_0x0007
                r1.close()     // Catch:{ IOException -> 0x003d }
                goto L_0x0007
            L_0x003d:
                r1 = move-exception
                goto L_0x0007
            L_0x003f:
                r0 = move-exception
            L_0x0040:
                if (r1 == 0) goto L_0x0045
                r1.close()     // Catch:{ IOException -> 0x0046 }
            L_0x0045:
                throw r0
            L_0x0046:
                r1 = move-exception
                goto L_0x0045
            L_0x0048:
                r0 = move-exception
                r1 = r2
                goto L_0x0040
            L_0x004b:
                r0 = move-exception
                r0 = r1
                r1 = r2
                goto L_0x0037
            L_0x004f:
                r1 = move-exception
                r1 = r2
                goto L_0x0037
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.yahoosearch.p063ui.SearchImageView.C2144a.doInBackground(java.lang.String[]):android.graphics.Bitmap");
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
                float width2 = ((float) SearchImageView.this.getWidth()) / ((float) SearchImageView.this.getHeight());
                ViewGroup.LayoutParams layoutParams = SearchImageView.this.getLayoutParams();
                if (width2 < width) {
                    layoutParams.height = (int) (((float) SearchImageView.this.getWidth()) / width);
                } else {
                    layoutParams.width = (int) (width * ((float) SearchImageView.this.getHeight()));
                }
                SearchImageView.this.setLayoutParams(layoutParams);
                SearchImageView.this.setImageBitmap(bitmap);
                SearchImageView.this.setBackgroundColor(-1);
                if (SearchImageView.this.f9120c != null) {
                    SearchImageView.this.f9120c.mo7570a();
                }
            }
        }
    }

    public SearchImageView(Context context) {
        super(context);
    }

    public SearchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo7564a(String str, C2145b bVar) {
        if (str != null && !str.equals(this.f9118a)) {
            this.f9118a = str;
            this.f9120c = bVar;
            if (this.f9119b == null) {
                this.f9119b = new C2144a();
            }
            this.f9119b.execute(new String[]{str});
        }
    }
}
