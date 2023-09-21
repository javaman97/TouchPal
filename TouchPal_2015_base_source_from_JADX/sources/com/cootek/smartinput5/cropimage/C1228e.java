package com.cootek.smartinput5.cropimage;

import android.app.ProgressDialog;
import android.os.Handler;
import com.cootek.smartinput5.cropimage.CropImageActivity;

/* renamed from: com.cootek.smartinput5.cropimage.e */
/* compiled from: CropImageActivity */
final class C1228e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1236l f3624a;

    /* renamed from: b */
    final /* synthetic */ String f3625b;

    /* renamed from: c */
    final /* synthetic */ String f3626c;

    /* renamed from: d */
    final /* synthetic */ Runnable f3627d;

    /* renamed from: e */
    final /* synthetic */ Handler f3628e;

    C1228e(C1236l lVar, String str, String str2, Runnable runnable, Handler handler) {
        this.f3624a = lVar;
        this.f3625b = str;
        this.f3626c = str2;
        this.f3627d = runnable;
        this.f3628e = handler;
    }

    public void run() {
        if (this.f3624a != null && !this.f3624a.isFinishing()) {
            try {
                new Thread(new CropImageActivity.C1222a(this.f3624a, this.f3627d, ProgressDialog.show(this.f3624a, this.f3625b, this.f3626c, true, false), this.f3628e)).start();
            } catch (Exception e) {
            }
        }
    }
}
