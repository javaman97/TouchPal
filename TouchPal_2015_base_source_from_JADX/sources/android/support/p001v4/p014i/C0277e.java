package android.support.p001v4.p014i;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import java.io.FileNotFoundException;

/* renamed from: android.support.v4.i.e */
/* compiled from: PrintHelperKitkat */
class C0277e extends AsyncTask<Uri, Boolean, Bitmap> {

    /* renamed from: a */
    final /* synthetic */ CancellationSignal f689a;

    /* renamed from: b */
    final /* synthetic */ PrintAttributes f690b;

    /* renamed from: c */
    final /* synthetic */ PrintAttributes f691c;

    /* renamed from: d */
    final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f692d;

    /* renamed from: e */
    final /* synthetic */ C0276d f693e;

    C0277e(C0276d dVar, CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
        this.f693e = dVar;
        this.f689a = cancellationSignal;
        this.f690b = printAttributes;
        this.f691c = printAttributes2;
        this.f692d = layoutResultCallback;
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        this.f689a.setOnCancelListener(new C0278f(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap doInBackground(Uri... uriArr) {
        try {
            return this.f693e.f687f.m1092a(this.f693e.f685d, 3500);
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Bitmap bitmap) {
        boolean z = true;
        super.onPostExecute(bitmap);
        this.f693e.f683b = bitmap;
        if (bitmap != null) {
            PrintDocumentInfo build = new PrintDocumentInfo.Builder(this.f693e.f684c).setContentType(1).setPageCount(1).build();
            if (this.f690b.equals(this.f691c)) {
                z = false;
            }
            this.f692d.onLayoutFinished(build, z);
            return;
        }
        this.f692d.onLayoutFailed((CharSequence) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onCancelled(Bitmap bitmap) {
        this.f692d.onLayoutCancelled();
    }
}
