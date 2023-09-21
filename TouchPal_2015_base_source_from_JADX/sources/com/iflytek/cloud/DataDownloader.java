package com.iflytek.cloud;

import android.content.Context;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.iflytek.cloud.p078a.p080b.C3983e;
import com.iflytek.cloud.p078a.p081c.C3987b;

public class DataDownloader extends C3983e {
    public DataDownloader(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14578a() {
        return true;
    }

    public void downloadData(SpeechListener speechListener) {
        this.f16312d = new C3987b(this.f16310a, this.f16305b, mo14684a(C1899v.f6382f));
        ((C3987b) this.f16312d).mo14697a((SpeechListener) new C3983e.C3984a(speechListener));
    }
}
