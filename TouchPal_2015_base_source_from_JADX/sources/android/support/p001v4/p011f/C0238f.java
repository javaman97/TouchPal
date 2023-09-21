package android.support.p001v4.p011f;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.view.View;
import android.view.ViewTreeObserver;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: android.support.v4.f.f */
/* compiled from: TransportMediatorJellybeanMR2 */
class C0238f implements RemoteControlClient.OnGetPlaybackPositionListener, RemoteControlClient.OnPlaybackPositionUpdateListener {

    /* renamed from: a */
    final Context f617a;

    /* renamed from: b */
    final AudioManager f618b;

    /* renamed from: c */
    final View f619c;

    /* renamed from: d */
    final C0237e f620d;

    /* renamed from: e */
    final String f621e;

    /* renamed from: f */
    final IntentFilter f622f;

    /* renamed from: g */
    final Intent f623g;

    /* renamed from: h */
    final ViewTreeObserver.OnWindowAttachListener f624h = new C0239g(this);

    /* renamed from: i */
    final ViewTreeObserver.OnWindowFocusChangeListener f625i = new C0240h(this);

    /* renamed from: j */
    final BroadcastReceiver f626j = new C0241i(this);

    /* renamed from: k */
    AudioManager.OnAudioFocusChangeListener f627k = new C0242j(this);

    /* renamed from: l */
    PendingIntent f628l;

    /* renamed from: m */
    RemoteControlClient f629m;

    /* renamed from: n */
    boolean f630n;

    /* renamed from: o */
    int f631o = 0;

    /* renamed from: p */
    boolean f632p;

    public C0238f(Context context, AudioManager audioManager, View view, C0237e eVar) {
        this.f617a = context;
        this.f618b = audioManager;
        this.f619c = view;
        this.f620d = eVar;
        this.f621e = context.getPackageName() + ":transport:" + System.identityHashCode(this);
        this.f623g = new Intent(this.f621e);
        this.f623g.setPackage(context.getPackageName());
        this.f622f = new IntentFilter();
        this.f622f.addAction(this.f621e);
        this.f619c.getViewTreeObserver().addOnWindowAttachListener(this.f624h);
        this.f619c.getViewTreeObserver().addOnWindowFocusChangeListener(this.f625i);
    }

    /* renamed from: a */
    public Object mo752a() {
        return this.f629m;
    }

    /* renamed from: b */
    public void mo755b() {
        mo765l();
        this.f619c.getViewTreeObserver().removeOnWindowAttachListener(this.f624h);
        this.f619c.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f625i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo756c() {
        this.f617a.registerReceiver(this.f626j, this.f622f);
        this.f628l = PendingIntent.getBroadcast(this.f617a, 0, this.f623g, Engine.EXCEPTION_ERROR);
        this.f629m = new RemoteControlClient(this.f628l);
        this.f629m.setOnGetPlaybackPositionListener(this);
        this.f629m.setPlaybackPositionUpdateListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo757d() {
        if (!this.f630n) {
            this.f630n = true;
            this.f618b.registerMediaButtonEventReceiver(this.f628l);
            this.f618b.registerRemoteControlClient(this.f629m);
            if (this.f631o == 3) {
                mo758e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo758e() {
        if (!this.f632p) {
            this.f632p = true;
            this.f618b.requestAudioFocus(this.f627k, 3, 1);
        }
    }

    /* renamed from: f */
    public void mo759f() {
        if (this.f631o != 3) {
            this.f631o = 3;
            this.f629m.setPlaybackState(3);
        }
        if (this.f630n) {
            mo758e();
        }
    }

    /* renamed from: g */
    public long mo760g() {
        return this.f620d.mo744a();
    }

    /* renamed from: a */
    public void mo753a(long j) {
        this.f620d.mo746a(j);
    }

    /* renamed from: a */
    public void mo754a(boolean z, long j, int i) {
        if (this.f629m != null) {
            this.f629m.setPlaybackState(z ? 3 : 1, j, z ? 1.0f : 0.0f);
            this.f629m.setTransportControlFlags(i);
        }
    }

    /* renamed from: h */
    public void mo761h() {
        if (this.f631o == 3) {
            this.f631o = 2;
            this.f629m.setPlaybackState(2);
        }
        mo763j();
    }

    /* renamed from: i */
    public void mo762i() {
        if (this.f631o != 1) {
            this.f631o = 1;
            this.f629m.setPlaybackState(1);
        }
        mo763j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo763j() {
        if (this.f632p) {
            this.f632p = false;
            this.f618b.abandonAudioFocus(this.f627k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo764k() {
        mo763j();
        if (this.f630n) {
            this.f630n = false;
            this.f618b.unregisterRemoteControlClient(this.f629m);
            this.f618b.unregisterMediaButtonEventReceiver(this.f628l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo765l() {
        mo764k();
        if (this.f628l != null) {
            this.f617a.unregisterReceiver(this.f626j);
            this.f628l.cancel();
            this.f628l = null;
            this.f629m = null;
        }
    }
}
