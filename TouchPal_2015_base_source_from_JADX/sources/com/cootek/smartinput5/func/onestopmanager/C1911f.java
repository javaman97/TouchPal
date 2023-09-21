package com.cootek.smartinput5.func.onestopmanager;

import android.widget.Toast;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.onestopmanager.C1904a;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2361q;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.onestopmanager.f */
/* compiled from: OneStopDownloadDialog */
class C1911f extends C1904a.C1905a {

    /* renamed from: a */
    final /* synthetic */ C1904a f6480a;

    C1911f(C1904a aVar) {
        this.f6480a = aVar;
    }

    /* renamed from: a */
    public void mo7054a() {
        if (C1358O.m6234a(C1358O.f4199j) == null) {
            Toast.makeText(this.f6480a.mo9539i(), C1974m.m9063a(this.f6480a.mo9539i(), (int) R.string.sdcard_not_ready_message), 1).show();
            return;
        }
        C2361q.m10797b().mo8023i(C1974m.m9063a(this.f6480a.mo9539i(), (int) R.string.app_id_pinyin_bigram), C1974m.m9063a(this.f6480a.mo9539i(), (int) R.string.paopao_pinyin_bigram_title), (String) null);
    }

    /* renamed from: b */
    public int mo7055b() {
        return this.f6480a.f6463l.mo5812a("pinyin.tpb");
    }
}
