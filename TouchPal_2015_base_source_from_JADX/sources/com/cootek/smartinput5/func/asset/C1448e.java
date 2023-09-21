package com.cootek.smartinput5.func.asset;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.asset.e */
/* compiled from: AssetsUtils */
final class C1448e implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ Activity f4639a;

    C1448e(Activity activity) {
        this.f4639a = activity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f4639a.finish();
    }
}
