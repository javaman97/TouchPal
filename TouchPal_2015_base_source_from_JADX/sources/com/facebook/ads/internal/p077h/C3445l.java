package com.facebook.ads.internal.p077h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import com.facebook.ads.internal.view.C3485d;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

/* renamed from: com.facebook.ads.internal.h.l */
public class C3445l extends AsyncTask<String, Void, Bitmap[]> {

    /* renamed from: a */
    private static final String f14988a = C3445l.class.getSimpleName();

    /* renamed from: b */
    private final Context f14989b;

    /* renamed from: c */
    private final ImageView f14990c;

    /* renamed from: d */
    private final C3485d f14991d;

    /* renamed from: e */
    private C3446m f14992e;

    public C3445l(Context context) {
        this.f14989b = context;
        this.f14991d = null;
        this.f14990c = null;
    }

    public C3445l(ImageView imageView) {
        this.f14989b = imageView.getContext();
        this.f14991d = null;
        this.f14990c = imageView;
    }

    public C3445l(C3485d dVar) {
        this.f14989b = dVar.getContext();
        this.f14991d = dVar;
        this.f14990c = null;
    }

    /* renamed from: a */
    private static Bitmap m15083a(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: a */
    public C3445l mo10770a(C3446m mVar) {
        this.f14992e = mVar;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Bitmap[] bitmapArr) {
        if (this.f14990c != null) {
            this.f14990c.setImageBitmap(bitmapArr[0]);
        }
        if (this.f14991d != null) {
            this.f14991d.mo10818a(bitmapArr[0], bitmapArr[1]);
        }
        if (this.f14992e != null) {
            this.f14992e.mo10551a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap[] doInBackground(String... strArr) {
        String str = strArr[0];
        Bitmap a = C3447n.m15088a(this.f14989b, str);
        if (a == null) {
            try {
                HttpEntity entity = C3439h.m15072b().execute(new HttpGet(str)).getEntity();
                byte[] byteArray = EntityUtils.toByteArray(entity);
                a = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                entity.consumeContent();
                C3447n.m15089a(this.f14989b, str, a);
            } catch (Exception e) {
                Log.e(f14988a, "Error downloading image: " + str, e);
            }
        }
        if (this.f14991d != null) {
            Bitmap bitmap = null;
            if (a != null) {
                C3455u uVar = new C3455u(m15083a(a));
                uVar.mo10787a(Math.round(((float) a.getWidth()) / 40.0f));
                bitmap = uVar.mo10786a();
            }
            return new Bitmap[]{a, bitmap};
        }
        return new Bitmap[]{a};
    }
}
