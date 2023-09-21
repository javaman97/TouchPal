package com.iflytek.cloud.util;

import android.content.Context;
import com.iflytek.cloud.util.p088a.C4021b;

public abstract class ContactManager {

    public interface ContactListener {
        void onContactQueryFinish(String str, boolean z);
    }

    protected ContactManager() {
    }

    public static ContactManager createManager(Context context, ContactListener contactListener) {
        return C4021b.m17130a(context, contactListener);
    }

    public static ContactManager getManager() {
        return C4021b.m17129a();
    }

    public abstract void asyncQueryAllContactsName();

    public abstract String queryAllContactsName();
}
