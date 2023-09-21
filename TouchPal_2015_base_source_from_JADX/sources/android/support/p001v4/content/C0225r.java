package android.support.p001v4.content;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: android.support.v4.content.r */
/* compiled from: ModernAsyncTask */
class C0225r extends FutureTask<Result> {

    /* renamed from: a */
    final /* synthetic */ C0217o f581a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0225r(C0217o oVar, Callable callable) {
        super(callable);
        this.f581a = oVar;
    }

    /* access modifiers changed from: protected */
    public void done() {
        try {
            this.f581a.m896c(get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
        } catch (CancellationException e3) {
            this.f581a.m896c(null);
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing doInBackground()", th);
        }
    }
}
