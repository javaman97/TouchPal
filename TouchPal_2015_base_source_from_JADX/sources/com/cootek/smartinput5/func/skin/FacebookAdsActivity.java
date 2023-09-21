package com.cootek.smartinput5.func.skin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.nativeads.C1875a;
import com.cootek.smartinput5.func.nativeads.C1886k;
import com.cootek.smartinput5.func.nativeads.C1888m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.emoji.keyboard.touchpal.R;
import com.facebook.ads.C3345i;
import com.facebook.ads.C3509x;

public class FacebookAdsActivity extends C1976b {

    /* renamed from: a */
    public static final String f6797a = "com.cootek.smartinput5.func.skin.FacebookAdsActivity.EXTRA_SPONSOR_THEME_NAME";

    /* renamed from: b */
    public static final String f6798b = "com.cootek.smartinput5.func.skin.FacebookAdsActivity.EXTRA_ADS_TIMESTAMP";

    /* renamed from: c */
    public static final String f6799c = "600*300";

    /* renamed from: d */
    private static float f6800d = 0.8f;

    /* renamed from: e */
    private String f6801e;

    /* renamed from: f */
    private TextView f6802f;

    /* renamed from: g */
    private AdsRatingBar f6803g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ImageView f6804h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f6805i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f6806j;

    /* renamed from: k */
    private C1875a f6807k;

    /* renamed from: l */
    private C1986a f6808l;

    /* renamed from: m */
    private C1986a f6809m;

    /* renamed from: n */
    private Handler f6810n = new Handler();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        this.f6806j = (int) (((float) getWindowManager().getDefaultDisplay().getWidth()) * f6800d);
        long longExtra = getIntent().getLongExtra(f6798b, 0);
        this.f6801e = getIntent().getStringExtra(f6797a);
        this.f6807k = C1997k.m9167a().mo7297a(longExtra);
        if (this.f6807k == null) {
            finish();
        } else {
            m9137a();
        }
    }

    /* renamed from: a */
    private void m9137a() {
        String str;
        setContentView(R.layout.facebook_ads_layout);
        View findViewById = findViewById(R.id.ads_frame);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.width = this.f6806j;
        findViewById.setLayoutParams(layoutParams);
        this.f6802f = (TextView) findViewById(R.id.ads_title);
        TextView textView = (TextView) findViewById(R.id.sponsor_title);
        this.f6805i = (ImageView) findViewById(R.id.sponsor_icon);
        this.f6804h = (ImageView) findViewById(R.id.sponsor_banner);
        AnimationDrawable animationDrawable = (AnimationDrawable) getResources().getDrawable(R.drawable.cat_progress);
        this.f6804h.setImageDrawable(animationDrawable);
        animationDrawable.start();
        this.f6805i.setImageResource(R.drawable.ads_gift);
        this.f6803g = (AdsRatingBar) findViewById(R.id.sponsor_rating);
        TextView textView2 = (TextView) findViewById(R.id.sponsor_download);
        if (this.f6807k.mo7000c() == 1) {
            C3509x d = ((C1886k) this.f6807k).mo7019d();
            String f = d.mo10868f();
            C3509x.m15264a(d.mo10867e(), this.f6804h);
            C3509x.m15264a(d.mo10866d(), this.f6805i);
            float b = (float) d.mo10867e().mo10879b();
            float c = (float) d.mo10867e().mo10880c();
            if (b > 0.0f && c > 0.0f) {
                ViewGroup.LayoutParams layoutParams2 = this.f6804h.getLayoutParams();
                layoutParams2.height = (int) ((c / b) * ((float) this.f6806j));
                this.f6804h.setLayoutParams(layoutParams2);
            }
            if (d.mo10873k() != null) {
                this.f6803g.setRating(d.mo10873k().mo10882a());
            } else {
                this.f6803g.setVisibility(8);
            }
            d.mo10877o();
            d.mo10860a((View) textView2);
            textView2.setText(d.mo10871i());
            d.mo10862a((C3345i) new C1987a(this));
            str = f;
        } else if (this.f6807k.mo7000c() == 0) {
            C1888m mVar = (C1888m) this.f6807k;
            String str2 = mVar.f6316m;
            String str3 = mVar.f6315l;
            String str4 = mVar.f6314k;
            if (str3 != null) {
                this.f6809m = new C1986a(this, (C1987a) null);
                this.f6809m.execute(new String[]{str3});
            }
            if (str4 != null) {
                this.f6808l = new C1986a(this, (C1987a) null);
                this.f6808l.execute(new String[]{str4});
            }
            this.f6803g.setVisibility(8);
            mVar.mo6999b((Context) this);
            textView2.setOnClickListener(new C1988b(this, mVar));
            str = str2;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f6802f.setText(str);
            textView.setText(getResString(R.string.sponsor_ads_title, this.f6801e));
            return;
        }
        this.f6802f.setVisibility(8);
        textView.setVisibility(8);
    }

    public void onStop() {
        super.onStop();
        if (this.f6808l != null) {
            this.f6808l.cancel(true);
        }
        if (this.f6809m != null) {
            this.f6809m.cancel(true);
        }
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9139a(String str, Bitmap bitmap) {
        if (!TextUtils.isEmpty(str) && bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && this.f6807k != null && this.f6807k.mo7000c() == 0) {
            C1888m mVar = (C1888m) this.f6807k;
            if (str.equalsIgnoreCase(mVar.f6315l)) {
                this.f6810n.post(new C1989c(this, bitmap));
            } else if (str.equalsIgnoreCase(mVar.f6314k)) {
                this.f6810n.post(new C1990d(this, bitmap));
            }
        }
    }

    /* renamed from: com.cootek.smartinput5.func.skin.FacebookAdsActivity$a */
    private class C1986a extends AsyncTask<String, Bitmap, Bitmap> {
        private C1986a() {
        }

        /* synthetic */ C1986a(FacebookAdsActivity facebookAdsActivity, C1987a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x005d, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x005e, code lost:
            r5 = r1;
            r1 = r0;
            r0 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0069, code lost:
            r5 = r0;
            r0 = null;
            r1 = r5;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0048 A[SYNTHETIC, Splitter:B:29:0x0048] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x005d A[ExcHandler: all (r1v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:9:0x001e] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                r2 = 0
                r1 = 0
                r0 = r7[r2]
                if (r0 != 0) goto L_0x0008
                r0 = r1
            L_0x0007:
                return r0
            L_0x0008:
                r3 = r7[r2]
                java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0036, all -> 0x0044 }
                r0.<init>(r3)     // Catch:{ IOException -> 0x0036, all -> 0x0044 }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x0036, all -> 0x0044 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0036, all -> 0x0044 }
                r2 = 30000(0x7530, float:4.2039E-41)
                r0.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0062, all -> 0x0057 }
                java.io.InputStream r2 = r0.getInputStream()     // Catch:{ IOException -> 0x0062, all -> 0x0057 }
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ IOException -> 0x0068, all -> 0x005d }
                r2.close()     // Catch:{ IOException -> 0x006d, all -> 0x005d }
                if (r2 == 0) goto L_0x002a
                r2.close()     // Catch:{ IOException -> 0x0051 }
            L_0x002a:
                if (r0 == 0) goto L_0x0072
                r0.disconnect()
                r0 = r1
            L_0x0030:
                com.cootek.smartinput5.func.skin.FacebookAdsActivity r1 = com.cootek.smartinput5.func.skin.FacebookAdsActivity.this
                r1.m9139a(r3, r0)
                goto L_0x0007
            L_0x0036:
                r0 = move-exception
                r2 = r1
                r0 = r1
            L_0x0039:
                if (r2 == 0) goto L_0x003e
                r2.close()     // Catch:{ IOException -> 0x0053 }
            L_0x003e:
                if (r1 == 0) goto L_0x0030
                r1.disconnect()
                goto L_0x0030
            L_0x0044:
                r0 = move-exception
                r2 = r1
            L_0x0046:
                if (r2 == 0) goto L_0x004b
                r2.close()     // Catch:{ IOException -> 0x0055 }
            L_0x004b:
                if (r1 == 0) goto L_0x0050
                r1.disconnect()
            L_0x0050:
                throw r0
            L_0x0051:
                r2 = move-exception
                goto L_0x002a
            L_0x0053:
                r2 = move-exception
                goto L_0x003e
            L_0x0055:
                r2 = move-exception
                goto L_0x004b
            L_0x0057:
                r2 = move-exception
                r5 = r2
                r2 = r1
                r1 = r0
                r0 = r5
                goto L_0x0046
            L_0x005d:
                r1 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
                goto L_0x0046
            L_0x0062:
                r2 = move-exception
                r2 = r1
                r5 = r0
                r0 = r1
                r1 = r5
                goto L_0x0039
            L_0x0068:
                r4 = move-exception
                r5 = r0
                r0 = r1
                r1 = r5
                goto L_0x0039
            L_0x006d:
                r4 = move-exception
                r5 = r0
                r0 = r1
                r1 = r5
                goto L_0x0039
            L_0x0072:
                r0 = r1
                goto L_0x0030
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.skin.FacebookAdsActivity.C1986a.doInBackground(java.lang.String[]):android.graphics.Bitmap");
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
        }
    }
}
