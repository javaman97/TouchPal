package com.cootek.geo;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.geo.AbsComponent;
import com.cootek.geo.GeoLocationManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

class CooTekComponent extends AbsComponent {
    private static final int COPY_FILE_BUFFER_LENGTH = 4096;
    private static final String ENCODING_GZIP = "gzip";
    private static final String HEADER_ACCEPT_ENCODING = "Accept-Encoding";
    private static final String HEADER_CONTENT_ENCODING = "Content-Encoding";
    private static final String HEADER_COOKIE = "Cookie";
    /* access modifiers changed from: private */
    public GeoLocationManager.ILocationChangeListener mCachedListener;
    /* access modifiers changed from: private */
    public DefaultHttpClient mHttpClient = new DefaultHttpClient();
    /* access modifiers changed from: private */
    public HttpGet mHttpGet;

    public CooTekComponent(Context context, String str, String str2) {
        this.mHttpClient.addRequestInterceptor(new HttpRequestInterceptor() {
            public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
                if (!httpRequest.containsHeader(CooTekComponent.HEADER_ACCEPT_ENCODING)) {
                    httpRequest.addHeader(CooTekComponent.HEADER_ACCEPT_ENCODING, CooTekComponent.ENCODING_GZIP);
                }
            }
        });
        this.mHttpGet = new HttpGet(String.format("http://%s/location", new Object[]{str}));
        this.mHttpGet.setHeader("Cookie", String.format("auth_token=%s; Path=/", new Object[]{str2}));
    }

    public void invalidate() {
        this.mHttpGet = null;
        this.mHttpClient = null;
    }

    /* access modifiers changed from: protected */
    public boolean isComponentAvailable() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean startPosition(boolean z, GeoLocationManager.ILocationChangeListener iLocationChangeListener) {
        if (!z) {
            return false;
        }
        this.mCachedListener = iLocationChangeListener;
        new Thread(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
            /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r4 = this;
                    r1 = 0
                    com.cootek.geo.CooTekComponent r0 = com.cootek.geo.CooTekComponent.this     // Catch:{ Exception -> 0x0051 }
                    org.apache.http.impl.client.DefaultHttpClient r0 = r0.mHttpClient     // Catch:{ Exception -> 0x0051 }
                    com.cootek.geo.CooTekComponent r2 = com.cootek.geo.CooTekComponent.this     // Catch:{ Exception -> 0x0051 }
                    org.apache.http.client.methods.HttpGet r2 = r2.mHttpGet     // Catch:{ Exception -> 0x0051 }
                    org.apache.http.HttpResponse r0 = r0.execute(r2)     // Catch:{ Exception -> 0x0051 }
                    if (r0 == 0) goto L_0x0055
                    com.cootek.geo.CooTekComponent r2 = com.cootek.geo.CooTekComponent.this     // Catch:{ Exception -> 0x0051 }
                    java.lang.String r0 = r2.getResponseBody(r0)     // Catch:{ Exception -> 0x0051 }
                    if (r0 == 0) goto L_0x0055
                    org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0051 }
                    r2.<init>(r0)     // Catch:{ Exception -> 0x0051 }
                    java.lang.String r0 = "error_code"
                    int r0 = r2.getInt(r0)     // Catch:{ Exception -> 0x0051 }
                    if (r0 != 0) goto L_0x0055
                    java.lang.String r0 = "country_code"
                    java.lang.String r3 = r2.getString(r0)     // Catch:{ Exception -> 0x0051 }
                    java.lang.String r0 = "city"
                    boolean r0 = r2.has(r0)     // Catch:{ Exception -> 0x0051 }
                    if (r0 == 0) goto L_0x006e
                    java.lang.String r0 = "city"
                    java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0051 }
                    r2 = r0
                L_0x003d:
                    com.cootek.geo.CooTekComponent$CooTekGeoLocationItem r0 = new com.cootek.geo.CooTekComponent$CooTekGeoLocationItem     // Catch:{ Exception -> 0x0051 }
                    r0.<init>(r3, r2)     // Catch:{ Exception -> 0x0051 }
                L_0x0042:
                    com.cootek.geo.CooTekComponent r2 = com.cootek.geo.CooTekComponent.this
                    com.cootek.geo.AbsGeoLocationItem r0 = r2.getBetterLocationItem(r0)
                    if (r0 == 0) goto L_0x0050
                    boolean r2 = r0.isValid()
                    if (r2 != 0) goto L_0x0057
                L_0x0050:
                    return
                L_0x0051:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x0055:
                    r0 = r1
                    goto L_0x0042
                L_0x0057:
                    com.cootek.geo.CooTekComponent r2 = com.cootek.geo.CooTekComponent.this
                    com.cootek.geo.GeoLocationManager$ILocationChangeListener r2 = r2.mCachedListener
                    if (r2 == 0) goto L_0x0050
                    com.cootek.geo.CooTekComponent r2 = com.cootek.geo.CooTekComponent.this
                    com.cootek.geo.GeoLocationManager$ILocationChangeListener r2 = r2.mCachedListener
                    r2.onLocationChanged(r0)
                    com.cootek.geo.CooTekComponent r0 = com.cootek.geo.CooTekComponent.this
                    r0.mCachedListener = r1
                    goto L_0x0050
                L_0x006e:
                    r2 = r1
                    goto L_0x003d
                */
                throw new UnsupportedOperationException("Method not decompiled: com.cootek.geo.CooTekComponent.C09172.run():void");
            }
        }).start();
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062 A[SYNTHETIC, Splitter:B:32:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067 A[SYNTHETIC, Splitter:B:35:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c A[SYNTHETIC, Splitter:B:38:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getResponseBody(org.apache.http.HttpResponse r8) throws java.lang.Exception {
        /*
            r7 = this;
            r1 = 0
            org.apache.http.HttpEntity r2 = r8.getEntity()
            org.apache.http.StatusLine r0 = r8.getStatusLine()
            int r0 = r0.getStatusCode()
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 == r3) goto L_0x0013
            r0 = r1
        L_0x0012:
            return r0
        L_0x0013:
            r0 = 0
            java.lang.String r3 = "Content-Encoding"
            org.apache.http.Header r3 = r8.getFirstHeader(r3)
            if (r3 == 0) goto L_0x0029
            java.lang.String r3 = r3.getValue()
            java.lang.String r4 = "gzip"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x0029
            r0 = 1
        L_0x0029:
            java.io.InputStream r4 = r2.getContent()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0098
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0089 }
            r0.<init>(r4)     // Catch:{ all -> 0x0089 }
            r2 = r0
        L_0x0035:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x008d }
            r3.<init>()     // Catch:{ all -> 0x008d }
            r7.copyFile(r0, r3)     // Catch:{ all -> 0x0093 }
            byte[] r1 = r3.toByteArray()     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0093 }
            java.lang.String r5 = "UTF-8"
            r0.<init>(r1, r5)     // Catch:{ all -> 0x0093 }
            if (r3 == 0) goto L_0x004d
            r3.close()     // Catch:{ IOException -> 0x007f }
        L_0x004d:
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0052:
            if (r4 == 0) goto L_0x0012
            r4.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x0012
        L_0x0058:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0012
        L_0x005d:
            r0 = move-exception
            r2 = r1
            r3 = r1
        L_0x0060:
            if (r2 == 0) goto L_0x0065
            r2.close()     // Catch:{ IOException -> 0x0070 }
        L_0x0065:
            if (r1 == 0) goto L_0x006a
            r1.close()     // Catch:{ IOException -> 0x0075 }
        L_0x006a:
            if (r3 == 0) goto L_0x006f
            r3.close()     // Catch:{ IOException -> 0x007a }
        L_0x006f:
            throw r0
        L_0x0070:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0065
        L_0x0075:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x006a
        L_0x007a:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x006f
        L_0x007f:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x004d
        L_0x0084:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0052
        L_0x0089:
            r0 = move-exception
            r2 = r1
            r3 = r4
            goto L_0x0060
        L_0x008d:
            r0 = move-exception
            r3 = r4
            r6 = r1
            r1 = r2
            r2 = r6
            goto L_0x0060
        L_0x0093:
            r0 = move-exception
            r1 = r2
            r2 = r3
            r3 = r4
            goto L_0x0060
        L_0x0098:
            r0 = r4
            r2 = r1
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.geo.CooTekComponent.getResponseBody(org.apache.http.HttpResponse):java.lang.String");
    }

    private void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* access modifiers changed from: protected */
    public boolean stopPosition() {
        if (this.mCachedListener == null) {
            return false;
        }
        this.mCachedListener.onLocationChanged(new AbsComponent.EmptyTimeoutGeoLocationItem());
        this.mCachedListener = null;
        return true;
    }

    /* access modifiers changed from: protected */
    public void setCacheEnable(boolean z, long j) {
    }

    private static class CooTekGeoLocationItem extends AbsGeoLocationItem {
        private final String mCity;
        private final String mCountryCode;
        private final long mTime;

        public CooTekGeoLocationItem(String str, String str2) {
            this.mCountryCode = str;
            this.mCity = str2;
            this.mTime = System.currentTimeMillis();
        }

        private CooTekGeoLocationItem(String str, String str2, long j, String str3) {
            super(str3);
            this.mCountryCode = str;
            this.mCity = str2;
            this.mTime = j;
        }

        public String getSystem() {
            return AbsGeoLocationItem.LOCATION_SYSTEM_COOTEK;
        }

        public String getProvider() {
            return "network";
        }

        public Double getLatitude() {
            return null;
        }

        public Double getLongitude() {
            return null;
        }

        public String getCountryCode() {
            return this.mCountryCode;
        }

        public String getCity() {
            return this.mCity;
        }

        public String getAddr() {
            return null;
        }

        /* access modifiers changed from: protected */
        public boolean hasAccuracy() {
            return false;
        }

        /* access modifiers changed from: protected */
        public float getAccuracy() {
            return 0.0f;
        }

        /* access modifiers changed from: protected */
        public long getTime() {
            return this.mTime;
        }

        /* access modifiers changed from: protected */
        public boolean isValid() {
            return !TextUtils.isEmpty(this.mCountryCode) && !TextUtils.isEmpty(this.mCity);
        }

        /* access modifiers changed from: protected */
        public Object clone() throws CloneNotSupportedException {
            return new CooTekGeoLocationItem(this.mCountryCode, this.mCity, this.mTime, getResultType());
        }
    }
}
