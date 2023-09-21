package com.cootek.smartinput5.cropimage;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.cropimage.l */
/* compiled from: MonitoredActivity */
public class C1236l extends Activity {

    /* renamed from: a */
    private final ArrayList<C1238b> f3672a = new ArrayList<>();

    /* renamed from: com.cootek.smartinput5.cropimage.l$b */
    /* compiled from: MonitoredActivity */
    public interface C1238b {
        /* renamed from: a */
        void mo4489a(C1236l lVar);

        /* renamed from: b */
        void mo4490b(C1236l lVar);

        /* renamed from: c */
        void mo4491c(C1236l lVar);

        /* renamed from: d */
        void mo4547d(C1236l lVar);
    }

    /* renamed from: com.cootek.smartinput5.cropimage.l$a */
    /* compiled from: MonitoredActivity */
    public static class C1237a implements C1238b {
        /* renamed from: d */
        public void mo4547d(C1236l lVar) {
        }

        /* renamed from: a */
        public void mo4489a(C1236l lVar) {
        }

        /* renamed from: c */
        public void mo4491c(C1236l lVar) {
        }

        /* renamed from: b */
        public void mo4490b(C1236l lVar) {
        }
    }

    /* renamed from: a */
    public void mo4543a(C1238b bVar) {
        if (!this.f3672a.contains(bVar)) {
            this.f3672a.add(bVar);
        }
    }

    /* renamed from: b */
    public void mo4544b(C1238b bVar) {
        this.f3672a.remove(bVar);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator<C1238b> it = this.f3672a.iterator();
        while (it.hasNext()) {
            it.next().mo4547d(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Iterator<C1238b> it = this.f3672a.iterator();
        while (it.hasNext()) {
            it.next().mo4489a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Iterator<C1238b> it = this.f3672a.iterator();
        while (it.hasNext()) {
            it.next().mo4491c(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Iterator<C1238b> it = this.f3672a.iterator();
        while (it.hasNext()) {
            it.next().mo4490b(this);
        }
    }
}
