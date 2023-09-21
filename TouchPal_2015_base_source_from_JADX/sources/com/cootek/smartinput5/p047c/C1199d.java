package com.cootek.smartinput5.p047c;

import android.content.Context;
import android.content.Intent;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.p066ui.FunctionBar;

/* renamed from: com.cootek.smartinput5.c.d */
/* compiled from: IPluginWidget */
public abstract class C1199d {
    /* renamed from: a */
    public abstract void mo4453a(Context context);

    /* renamed from: b */
    public abstract String mo4454b();

    /* renamed from: c */
    public abstract String mo4455c();

    /* renamed from: d */
    public abstract C1198c mo4456d();

    /* renamed from: e */
    public abstract C1197b mo4457e();

    /* renamed from: f */
    public abstract boolean mo4458f();

    /* renamed from: g */
    public abstract boolean mo4459g();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4472a(int i) {
        Settings.getInstance().setBoolSetting(i, !Settings.getInstance().getBoolSetting(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4474a(String str) {
        mo4471a();
        C1411aV.m6625a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4475b(int i) {
        mo4471a();
        C1411aV.m6626b(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4473a(Context context, Class cls) {
        mo4471a();
        Intent intent = new Intent();
        intent.setClass(context, cls);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        context.startActivity(intent);
        Engine.getInstance().getIms().requestHideSelf(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4471a() {
        FunctionBar h = Engine.getInstance().getWidgetManager().mo9650h();
        if (h != null && h.f11256b) {
            h.mo8564v();
        }
    }
}
