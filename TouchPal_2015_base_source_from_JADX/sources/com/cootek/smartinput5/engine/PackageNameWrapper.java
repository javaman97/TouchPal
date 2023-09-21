package com.cootek.smartinput5.engine;

import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1811k;

public enum PackageNameWrapper {
    LANGUAGE_PKG_NAME_WRAPPER {
        /* access modifiers changed from: package-private */
        public String doWrap(String str) {
            return str.replace(C1811k.f5993k, C1811k.f5992j);
        }

        /* access modifiers changed from: package-private */
        public boolean needWrap(String str) {
            if (str == null || !C1368X.m6324d() || !str.startsWith(C1811k.f5993k) || C1368X.m6320c().mo5842o().mo5969t(str) != null) {
                return false;
            }
            return true;
        }
    };

    /* access modifiers changed from: package-private */
    public abstract String doWrap(String str);

    /* access modifiers changed from: package-private */
    public abstract boolean needWrap(String str);

    public static String wrapPackageName(String str) {
        if (str == null) {
            return str;
        }
        for (PackageNameWrapper packageNameWrapper : values()) {
            if (packageNameWrapper.needWrap(str)) {
                return packageNameWrapper.doWrap(str);
            }
        }
        return str;
    }
}
