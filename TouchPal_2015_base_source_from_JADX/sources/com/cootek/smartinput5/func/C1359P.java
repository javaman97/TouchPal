package com.cootek.smartinput5.func;

import com.cootek.smartinput.utilities.C0997e;
import java.io.File;

/* renamed from: com.cootek.smartinput5.func.P */
/* compiled from: ExternalStorage */
final class C1359P extends Thread {

    /* renamed from: a */
    final /* synthetic */ File f4216a;

    /* renamed from: b */
    final /* synthetic */ File f4217b;

    C1359P(File file, File file2) {
        this.f4216a = file;
        this.f4217b = file2;
    }

    public void run() {
        C0997e.m5189b(this.f4216a, this.f4217b);
    }
}
