package com.p023a.p024a.p032b.p037d;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.p023a.p024a.p032b.p033a.C0743a;
import com.p023a.p024a.p032b.p037d.C0783b;
import com.p023a.p024a.p041c.C0811c;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.a.a.b.d.a */
/* compiled from: BaseImageDownloader */
public class C0781a implements C0783b {

    /* renamed from: a */
    public static final int f1973a = 5000;

    /* renamed from: b */
    public static final int f1974b = 20000;

    /* renamed from: c */
    protected static final int f1975c = 32768;

    /* renamed from: d */
    protected static final String f1976d = "@#&=*+-_.,:!?()/~'%";

    /* renamed from: e */
    protected static final int f1977e = 5;

    /* renamed from: f */
    protected static final String f1978f = "content://com.android.contacts/";

    /* renamed from: j */
    private static final String f1979j = "UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))";

    /* renamed from: g */
    protected final Context f1980g;

    /* renamed from: h */
    protected final int f1981h;

    /* renamed from: i */
    protected final int f1982i;

    public C0781a(Context context) {
        this.f1980g = context.getApplicationContext();
        this.f1981h = f1973a;
        this.f1982i = f1974b;
    }

    public C0781a(Context context, int i, int i2) {
        this.f1980g = context.getApplicationContext();
        this.f1981h = i;
        this.f1982i = i2;
    }

    /* renamed from: a */
    public InputStream mo2937a(String str, Object obj) throws IOException {
        switch (C0783b.C0784a.m4466a(str)) {
            case HTTP:
            case HTTPS:
                return mo2938b(str, obj);
            case FILE:
                return mo2940d(str, obj);
            case CONTENT:
                return mo2941e(str, obj);
            case ASSETS:
                return mo2942f(str, obj);
            case DRAWABLE:
                return mo2943g(str, obj);
            default:
                return mo2944h(str, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public InputStream mo2938b(String str, Object obj) throws IOException {
        HttpURLConnection c = mo2939c(str, obj);
        int i = 0;
        while (c.getResponseCode() / 100 == 3 && i < 5) {
            c = mo2939c(c.getHeaderField("Location"), obj);
            i++;
        }
        try {
            return new C0743a(new BufferedInputStream(c.getInputStream(), 32768), c.getContentLength());
        } catch (IOException e) {
            C0811c.m4615a(c.getErrorStream());
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public HttpURLConnection mo2939c(String str, Object obj) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Uri.encode(str, f1976d)).openConnection();
        httpURLConnection.setConnectTimeout(this.f1981h);
        httpURLConnection.setReadTimeout(this.f1982i);
        return httpURLConnection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public InputStream mo2940d(String str, Object obj) throws IOException {
        String c = C0783b.C0784a.FILE.mo2946c(str);
        return new C0743a(new BufferedInputStream(new FileInputStream(c), 32768), (int) new File(c).length());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public InputStream mo2941e(String str, Object obj) throws FileNotFoundException {
        ContentResolver contentResolver = this.f1980g.getContentResolver();
        Uri parse = Uri.parse(str);
        if (m4456a(parse)) {
            Bitmap thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, Long.valueOf(parse.getLastPathSegment()).longValue(), 1, (BitmapFactory.Options) null);
            if (thumbnail != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                thumbnail.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        } else if (str.startsWith(f1978f)) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, parse);
        }
        return contentResolver.openInputStream(parse);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public InputStream mo2942f(String str, Object obj) throws IOException {
        return this.f1980g.getAssets().open(C0783b.C0784a.ASSETS.mo2946c(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public InputStream mo2943g(String str, Object obj) {
        return this.f1980g.getResources().openRawResource(Integer.parseInt(C0783b.C0784a.DRAWABLE.mo2946c(str)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream mo2944h(String str, Object obj) throws IOException {
        throw new UnsupportedOperationException(String.format(f1979j, new Object[]{str}));
    }

    /* renamed from: a */
    private boolean m4456a(Uri uri) {
        String type = this.f1980g.getContentResolver().getType(uri);
        if (type == null) {
            return false;
        }
        return type.startsWith("video/");
    }
}
