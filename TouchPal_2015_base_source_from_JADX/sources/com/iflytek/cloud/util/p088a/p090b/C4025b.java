package com.iflytek.cloud.util.p088a.p090b;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import com.iflytek.cloud.util.p088a.p091c.C4027a;

/* renamed from: com.iflytek.cloud.util.a.b.b */
public class C4025b extends C4027a {

    /* renamed from: d */
    private static final String[] f16444d = {"display_name", "_id"};

    /* renamed from: e */
    private static final String[] f16445e = {"display_name", "data1", "contact_id"};

    /* renamed from: f */
    private static final String[] f16446f = {"_id", "has_phone_number"};

    /* renamed from: g */
    private static final String[] f16447g = {"contact_id"};

    /* renamed from: h */
    private static final String[] f16448h = {"display_name"};

    /* renamed from: i */
    private static final String[] f16449i = {"data1", "data2", "display_name"};

    /* renamed from: j */
    private static final String[] f16450j = {"has_phone_number"};

    public C4025b(Context context) {
        super(context);
        mo14776a(context);
    }

    /* renamed from: a */
    public Uri mo14771a() {
        return ContactsContract.Contacts.CONTENT_URI;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String[] mo14772b() {
        return f16444d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo14773c() {
        return Integer.parseInt(Build.VERSION.SDK) >= 8 ? "sort_key" : "display_name";
    }
}
