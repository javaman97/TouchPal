package com.cootek.smartinput5.func.iab.google;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.vending.billing.IInAppBillingService;

/* renamed from: com.cootek.smartinput5.func.iab.google.h */
/* compiled from: IabService */
class C1788h implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C1787g f5889a;

    C1788h(C1787g gVar) {
        this.f5889a = gVar;
    }

    public void onServiceDisconnected(ComponentName componentName) {
        IInAppBillingService unused = this.f5889a.f5885g = null;
        this.f5889a.m8214g();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInAppBillingService unused = this.f5889a.f5885g = IInAppBillingService.Stub.m4648a(iBinder);
        this.f5889a.m8205a(0);
    }
}
