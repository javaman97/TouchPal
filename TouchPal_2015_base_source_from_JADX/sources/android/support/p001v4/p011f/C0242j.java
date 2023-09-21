package android.support.p001v4.p011f;

import android.media.AudioManager;

/* renamed from: android.support.v4.f.j */
/* compiled from: TransportMediatorJellybeanMR2 */
class C0242j implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0238f f636a;

    C0242j(C0238f fVar) {
        this.f636a = fVar;
    }

    public void onAudioFocusChange(int i) {
        this.f636a.f620d.mo745a(i);
    }
}
