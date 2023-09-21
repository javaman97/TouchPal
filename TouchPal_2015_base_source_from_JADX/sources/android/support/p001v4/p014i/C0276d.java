package android.support.p001v4.p014i;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: android.support.v4.i.d */
/* compiled from: PrintHelperKitkat */
class C0276d extends PrintDocumentAdapter {

    /* renamed from: a */
    AsyncTask<Uri, Boolean, Bitmap> f682a;

    /* renamed from: b */
    Bitmap f683b = null;

    /* renamed from: c */
    final /* synthetic */ String f684c;

    /* renamed from: d */
    final /* synthetic */ Uri f685d;

    /* renamed from: e */
    final /* synthetic */ int f686e;

    /* renamed from: f */
    final /* synthetic */ C0274b f687f;

    /* renamed from: g */
    private PrintAttributes f688g;

    C0276d(C0274b bVar, String str, Uri uri, int i) {
        this.f687f = bVar;
        this.f684c = str;
        this.f685d = uri;
        this.f686e = i;
    }

    /* renamed from: a */
    public void mo829a(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        boolean z = true;
        if (cancellationSignal.isCanceled()) {
            layoutResultCallback.onLayoutCancelled();
            this.f688g = printAttributes2;
        } else if (this.f683b != null) {
            PrintDocumentInfo build = new PrintDocumentInfo.Builder(this.f684c).setContentType(1).setPageCount(1).build();
            if (printAttributes2.equals(printAttributes)) {
                z = false;
            }
            layoutResultCallback.onLayoutFinished(build, z);
        } else {
            this.f682a = new C0277e(this, cancellationSignal, printAttributes2, printAttributes, layoutResultCallback);
            this.f682a.execute(new Uri[0]);
            this.f688g = printAttributes2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1109b() {
        synchronized (this.f687f.f676n) {
            if (this.f687f.f672b != null) {
                this.f687f.f672b.requestCancelDecode();
                this.f687f.f672b = null;
            }
        }
    }

    /* renamed from: a */
    public void mo828a() {
        super.onFinish();
        m1109b();
        this.f682a.cancel(true);
    }

    /* renamed from: a */
    public void mo830a(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(this.f687f.f671a, this.f688g);
        try {
            PdfDocument.Page startPage = printedPdfDocument.startPage(1);
            startPage.getCanvas().drawBitmap(this.f683b, this.f687f.m1095a(this.f683b.getWidth(), this.f683b.getHeight(), new RectF(startPage.getInfo().getContentRect()), this.f686e), (Paint) null);
            printedPdfDocument.finishPage(startPage);
            printedPdfDocument.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
            writeResultCallback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
        } catch (IOException e) {
            Log.e("PrintHelperKitkat", "Error writing printed content", e);
            writeResultCallback.onWriteFailed((CharSequence) null);
        } catch (Throwable th) {
            if (printedPdfDocument != null) {
                printedPdfDocument.close();
            }
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e2) {
                }
            }
            throw th;
        }
        if (printedPdfDocument != null) {
            printedPdfDocument.close();
        }
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e3) {
            }
        }
    }
}
