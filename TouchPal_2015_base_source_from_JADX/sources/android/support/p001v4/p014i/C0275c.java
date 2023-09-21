package android.support.p001v4.p014i;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
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

/* renamed from: android.support.v4.i.c */
/* compiled from: PrintHelperKitkat */
class C0275c extends PrintDocumentAdapter {

    /* renamed from: a */
    final /* synthetic */ String f677a;

    /* renamed from: b */
    final /* synthetic */ Bitmap f678b;

    /* renamed from: c */
    final /* synthetic */ int f679c;

    /* renamed from: d */
    final /* synthetic */ C0274b f680d;

    /* renamed from: e */
    private PrintAttributes f681e;

    C0275c(C0274b bVar, String str, Bitmap bitmap, int i) {
        this.f680d = bVar;
        this.f677a = str;
        this.f678b = bitmap;
        this.f679c = i;
    }

    /* renamed from: a */
    public void mo826a(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        boolean z = true;
        this.f681e = printAttributes2;
        PrintDocumentInfo build = new PrintDocumentInfo.Builder(this.f677a).setContentType(1).setPageCount(1).build();
        if (printAttributes2.equals(printAttributes)) {
            z = false;
        }
        layoutResultCallback.onLayoutFinished(build, z);
    }

    /* renamed from: a */
    public void mo827a(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(this.f680d.f671a, this.f681e);
        try {
            PdfDocument.Page startPage = printedPdfDocument.startPage(1);
            startPage.getCanvas().drawBitmap(this.f678b, this.f680d.m1095a(this.f678b.getWidth(), this.f678b.getHeight(), new RectF(startPage.getInfo().getContentRect()), this.f679c), (Paint) null);
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
