package com.cootek.smartinput5.func.asset;

import android.content.Context;
import android.os.AsyncTask;
import com.cootek.smartinput.utilities.C1017y;

/* renamed from: com.cootek.smartinput5.func.asset.i */
/* compiled from: ExtractTasks */
public class C1452i extends AsyncTask<String, Integer, Boolean> {

    /* renamed from: a */
    private static final String f4649a = "ExtractTasks";

    /* renamed from: b */
    private Context f4650b;

    /* renamed from: c */
    private C1453a f4651c;

    /* renamed from: com.cootek.smartinput5.func.asset.i$a */
    /* compiled from: ExtractTasks */
    public interface C1453a {
        /* renamed from: a */
        void mo4255a();

        /* renamed from: a */
        void mo4256a(Context context, C1454b bVar);
    }

    /* renamed from: com.cootek.smartinput5.func.asset.i$b */
    /* compiled from: ExtractTasks */
    public enum C1454b {
        success,
        extract_failed,
        load_library_failed
    }

    public C1452i(Context context, C1453a aVar) {
        this.f4650b = context.getApplicationContext();
        this.f4651c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean doInBackground(String... strArr) {
        C1017y.m5224c(f4649a, "doInBackground");
        boolean b = C1460o.m6799b().mo6127b(this.f4650b);
        C1017y.m5224c(f4649a, "extract ret = " + b);
        return Boolean.valueOf(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        C1017y.m5224c(f4649a, "onPostExecute result: ");
        if (this.f4651c != null) {
            this.f4651c.mo4256a(this.f4650b, bool.booleanValue() ? C1454b.success : C1454b.extract_failed);
        }
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        super.onCancelled();
        C1017y.m5224c(f4649a, "onCancelled");
        C1460o.m6799b().mo6131d();
        if (this.f4651c != null) {
            this.f4651c.mo4255a();
        }
    }
}
