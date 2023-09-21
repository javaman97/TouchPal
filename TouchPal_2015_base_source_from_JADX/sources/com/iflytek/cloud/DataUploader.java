package com.iflytek.cloud;

import android.content.Context;
import com.iflytek.cloud.p078a.p080b.C3983e;
import com.iflytek.cloud.p078a.p081c.C3987b;

public class DataUploader extends C3983e {
    public DataUploader(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14578a() {
        return true;
    }

    public void uploadData(SpeechListener speechListener, String str, byte[] bArr) {
        this.f16312d = new C3987b(this.f16310a, this.f16305b, mo14684a("upload"));
        ((C3987b) this.f16312d).mo14698a(new C3983e.C3984a(speechListener), str, bArr);
    }
}
