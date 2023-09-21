package com.cootek.smartinput5.presentations;

import android.text.TextUtils;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.toast.ExtensionStaticToast;
import java.util.List;

/* renamed from: com.cootek.smartinput5.presentations.g */
/* compiled from: ConditionJudge */
public class C2503g {

    /* renamed from: com.cootek.smartinput5.presentations.g$a */
    /* compiled from: ConditionJudge */
    public interface C2504a {
        /* renamed from: a */
        boolean mo8293a(String str);
    }

    /* renamed from: com.cootek.smartinput5.presentations.g$b */
    /* compiled from: ConditionJudge */
    public interface C2505b {
        /* renamed from: a */
        C2504a mo8303a(String str);
    }

    /* renamed from: a */
    public static boolean m11234a(String str, String str2, C2506h hVar) {
        return hVar.mo8304a(str, str2);
    }

    /* renamed from: a */
    public static boolean m11235a(String str, String str2, String str3, C2506h hVar) {
        if (TextUtils.isEmpty(str3)) {
            return hVar.mo8304a(str, str2);
        }
        List<ExtensionStaticToast> extensionStaticToast = PresentationManager.getExtensionStaticToast(str3);
        if (extensionStaticToast != null && !extensionStaticToast.isEmpty()) {
            for (ExtensionStaticToast next : extensionStaticToast) {
                if (next.getGuidePointId() != null && next.getGuidePointId().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
