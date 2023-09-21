package android.support.p001v4.app;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Bundle;
import android.support.p001v4.app.C0127ag;

/* renamed from: android.support.v4.app.ah */
/* compiled from: RemoteInputCompatJellybean */
class C0130ah {

    /* renamed from: a */
    public static final String f346a = "android.remoteinput.results";

    /* renamed from: b */
    public static final String f347b = "android.remoteinput.resultsData";

    /* renamed from: c */
    private static final String f348c = "resultKey";

    /* renamed from: d */
    private static final String f349d = "label";

    /* renamed from: e */
    private static final String f350e = "choices";

    /* renamed from: f */
    private static final String f351f = "allowFreeFormInput";

    /* renamed from: g */
    private static final String f352g = "extras";

    C0130ah() {
    }

    /* renamed from: a */
    static C0127ag.C0128a m500a(Bundle bundle, C0127ag.C0128a.C0129a aVar) {
        return aVar.mo402b(bundle.getString(f348c), bundle.getCharSequence("label"), bundle.getCharSequenceArray(f350e), bundle.getBoolean(f351f), bundle.getBundle(f352g));
    }

    /* renamed from: a */
    static Bundle m499a(C0127ag.C0128a aVar) {
        Bundle bundle = new Bundle();
        bundle.putString(f348c, aVar.mo387a());
        bundle.putCharSequence("label", aVar.mo388b());
        bundle.putCharSequenceArray(f350e, aVar.mo389c());
        bundle.putBoolean(f351f, aVar.mo390d());
        bundle.putBundle(f352g, aVar.mo391e());
        return bundle;
    }

    /* renamed from: a */
    static C0127ag.C0128a[] m503a(Bundle[] bundleArr, C0127ag.C0128a.C0129a aVar) {
        if (bundleArr == null) {
            return null;
        }
        C0127ag.C0128a[] b = aVar.mo403b(bundleArr.length);
        for (int i = 0; i < bundleArr.length; i++) {
            b[i] = m500a(bundleArr[i], aVar);
        }
        return b;
    }

    /* renamed from: a */
    static Bundle[] m502a(C0127ag.C0128a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            bundleArr[i] = m499a(aVarArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: a */
    static Bundle m498a(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (!description.hasMimeType("text/vnd.android.intent") || !description.getLabel().equals("android.remoteinput.results")) {
            return null;
        }
        return (Bundle) clipData.getItemAt(0).getIntent().getExtras().getParcelable("android.remoteinput.resultsData");
    }

    /* renamed from: a */
    static void m501a(C0127ag.C0128a[] aVarArr, Intent intent, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        for (C0127ag.C0128a aVar : aVarArr) {
            Object obj = bundle.get(aVar.mo387a());
            if (obj instanceof CharSequence) {
                bundle2.putCharSequence(aVar.mo387a(), (CharSequence) obj);
            }
        }
        Intent intent2 = new Intent();
        intent2.putExtra("android.remoteinput.resultsData", bundle2);
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", intent2));
    }
}
