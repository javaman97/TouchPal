package com.cootek.smartinput5.p066ui.p067a;

import android.content.Context;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.toast.ExtensionStaticToast;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

/* renamed from: com.cootek.smartinput5.ui.a.b */
/* compiled from: ExtensionExecuter */
public class C2657b {
    /* renamed from: a */
    public static void m12328a(Context context, C2660e eVar) {
        if (eVar != null) {
            eVar.mo7171b();
            Collection<C2659d> a = m12326a(context, eVar, m12327a(eVar.mo7172c()));
            if (a != null && a.size() > 0) {
                eVar.mo7170a(a);
            }
        }
    }

    /* renamed from: a */
    private static Collection<C2659d> m12326a(Context context, C2660e eVar, Collection<ExtensionStaticToast> collection) {
        if (collection == null) {
            return null;
        }
        Vector vector = new Vector();
        for (ExtensionStaticToast a : collection) {
            C2659d a2 = eVar.mo7167a(context, a);
            if (a2 != null) {
                vector.add(a2);
            }
        }
        return vector;
    }

    /* renamed from: a */
    private static Collection<ExtensionStaticToast> m12327a(C2658c cVar) {
        ArrayList arrayList = new ArrayList();
        List<ExtensionStaticToast> extensionStaticToast = PresentationManager.getExtensionStaticToast(cVar.toString());
        if (extensionStaticToast != null) {
            arrayList.addAll(extensionStaticToast);
        }
        return arrayList;
    }
}
