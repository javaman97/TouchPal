package android.support.p001v4.p011f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;

/* renamed from: android.support.v4.f.i */
/* compiled from: TransportMediatorJellybeanMR2 */
class C0241i extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C0238f f635a;

    C0241i(C0238f fVar) {
        this.f635a = fVar;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            this.f635a.f620d.mo747a((KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        } catch (ClassCastException e) {
            Log.w("TransportController", e);
        }
    }
}
