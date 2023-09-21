package com.cootek.smartinput5.func.onestopmanager;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2174G;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.onestopmanager.g */
/* compiled from: OneStopDownloadDialog */
class C1912g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f6481a;

    /* renamed from: b */
    final /* synthetic */ TextView f6482b;

    /* renamed from: c */
    final /* synthetic */ String f6483c;

    /* renamed from: d */
    final /* synthetic */ C1904a f6484d;

    C1912g(C1904a aVar, Context context, TextView textView, String str) {
        this.f6484d = aVar;
        this.f6481a = context;
        this.f6482b = textView;
        this.f6483c = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ArrayList arrayList = new ArrayList();
        String unused = this.f6484d.f6464n = this.f6481a.getString(C2174G.f9175G[i]);
        this.f6482b.setText(this.f6483c + this.f6484d.f6464n);
        int[] iArr = C2174G.f9174F[i];
        if (iArr != null) {
            for (int a : iArr) {
                arrayList.add(C1368X.m6320c().mo5845r().mo7193a(a));
            }
        }
        C2174G.m9763a().mo7627b(C2174G.f9172D[i]);
        this.f6484d.m8753a((List<String>) arrayList);
        this.f6484d.m8772q();
        this.f6484d.m8764g();
    }
}
