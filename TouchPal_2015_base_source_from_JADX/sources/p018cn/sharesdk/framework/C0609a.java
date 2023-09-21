package p018cn.sharesdk.framework;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: cn.sharesdk.framework.a */
class C0609a implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ FakeActivity f1468a;

    C0609a(FakeActivity fakeActivity) {
        this.f1468a = fakeActivity;
    }

    public boolean handleMessage(Message message) {
        Object[] objArr = (Object[]) message.obj;
        Intent intent = (Intent) objArr[1];
        intent.setFlags(Engine.EXCEPTION_ERROR);
        ((Context) objArr[0]).startActivity(intent);
        return false;
    }
}
