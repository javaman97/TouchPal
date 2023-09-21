package android.support.p001v4.content;

import android.os.Process;
import android.support.p001v4.content.C0217o;

/* renamed from: android.support.v4.content.q */
/* compiled from: ModernAsyncTask */
class C0224q extends C0217o.C0222d<Params, Result> {

    /* renamed from: a */
    final /* synthetic */ C0217o f580a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0224q(C0217o oVar) {
        super((C0223p) null);
        this.f580a = oVar;
    }

    public Result call() throws Exception {
        this.f580a.f570o.set(true);
        Process.setThreadPriority(10);
        return this.f580a.m897d(this.f580a.mo637a((Params[]) this.f578b));
    }
}
