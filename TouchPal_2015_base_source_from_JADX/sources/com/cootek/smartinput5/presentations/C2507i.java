package com.cootek.smartinput5.presentations;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: com.cootek.smartinput5.presentations.i */
/* compiled from: DownloadInStatusActivity */
class C2507i implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Bundle f10814a;

    /* renamed from: b */
    final /* synthetic */ DownloadInStatusActivity f10815b;

    C2507i(DownloadInStatusActivity downloadInStatusActivity, Bundle bundle) {
        this.f10815b = downloadInStatusActivity;
        this.f10814a = bundle;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f10815b.m11189a(this.f10814a);
        this.f10815b.finish();
    }
}
