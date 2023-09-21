package com.iflytek.cloud.util.p088a.p090b;

import android.content.Context;
import android.net.Uri;
import android.provider.Contacts;
import com.iflytek.cloud.util.p088a.p091c.C4027a;

/* renamed from: com.iflytek.cloud.util.a.b.a */
public class C4024a extends C4027a {

    /* renamed from: d */
    private static final String[] f16437d = {"_id", "name"};

    /* renamed from: e */
    private static final String[] f16438e = {"name", "number", "_id"};

    /* renamed from: f */
    private static final String[] f16439f = {"person"};

    /* renamed from: g */
    private static final String[] f16440g = {"display_name"};

    /* renamed from: h */
    private static final String[] f16441h = {"number", "type", "name"};

    /* renamed from: i */
    private static final String[] f16442i = {"_id", "name", "number", "type"};

    /* renamed from: j */
    private static final String[] f16443j = {"number"};

    public C4024a(Context context) {
        super(context);
        mo14776a(context);
    }

    /* renamed from: a */
    public Uri mo14771a() {
        return Contacts.People.CONTENT_URI;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String[] mo14772b() {
        return f16437d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo14773c() {
        return "name";
    }
}
