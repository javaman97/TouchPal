package com.p023a.p024a.p032b.p037d;

import com.cootek.smartinput5.func.asset.C1460o;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchToLinkActivity;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: com.a.a.b.d.b */
/* compiled from: ImageDownloader */
public interface C0783b {
    /* renamed from: a */
    InputStream mo2937a(String str, Object obj) throws IOException;

    /* renamed from: com.a.a.b.d.b$a */
    /* compiled from: ImageDownloader */
    public enum C0784a {
        HTTP("http"),
        HTTPS("https"),
        FILE("file"),
        CONTENT(SearchToLinkActivity.CONTENT),
        ASSETS(C1460o.f4670a),
        DRAWABLE("drawable"),
        UNKNOWN("");
        

        /* renamed from: h */
        private String f1992h;

        /* renamed from: i */
        private String f1993i;

        private C0784a(String str) {
            this.f1992h = str;
            this.f1993i = str + "://";
        }

        /* renamed from: a */
        public static C0784a m4466a(String str) {
            if (str != null) {
                for (C0784a aVar : values()) {
                    if (aVar.m4467d(str)) {
                        return aVar;
                    }
                }
            }
            return UNKNOWN;
        }

        /* renamed from: d */
        private boolean m4467d(String str) {
            return str.toLowerCase(Locale.US).startsWith(this.f1993i);
        }

        /* renamed from: b */
        public String mo2945b(String str) {
            return this.f1993i + str;
        }

        /* renamed from: c */
        public String mo2946c(String str) {
            if (m4467d(str)) {
                return str.substring(this.f1993i.length());
            }
            throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", new Object[]{str, this.f1992h}));
        }
    }
}
