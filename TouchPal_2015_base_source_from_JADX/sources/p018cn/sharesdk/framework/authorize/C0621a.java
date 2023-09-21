package p018cn.sharesdk.framework.authorize;

import android.content.Context;
import android.content.Intent;
import p018cn.sharesdk.framework.FakeActivity;

/* renamed from: cn.sharesdk.framework.authorize.a */
public class C0621a extends FakeActivity {

    /* renamed from: a */
    protected AuthorizeHelper f1486a;

    /* renamed from: a */
    public AuthorizeHelper mo2254a() {
        return this.f1486a;
    }

    /* renamed from: a */
    public void mo2255a(AuthorizeHelper authorizeHelper) {
        this.f1486a = authorizeHelper;
        super.show(authorizeHelper.getPlatform().getContext(), (Intent) null);
    }

    public void show(Context context, Intent intent) {
        throw new RuntimeException("This method is deprecated, use show(AuthorizeHelper, Intent) instead");
    }
}
