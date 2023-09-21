package com.cootek.smartinput5.func.contactscanner;

import com.cootek.smartinput5.func.contactscanner.ContactScannerActivity;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.CmdCheckCallLog;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.contactscanner.d */
/* compiled from: ContactScannerActivity */
class C1702d implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ ContactScannerActivity.C1696a f5550a;

    C1702d(ContactScannerActivity.C1696a aVar) {
        this.f5550a = aVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        ArrayList unused = ContactScannerActivity.this.f5532d = ((CmdCheckCallLog) p).mo7779j();
        ContactScannerActivity.this.m7813a(false, true);
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        ContactScannerActivity.this.m7813a(false, true);
    }
}
