package com.yahoo.mobile.client.share.search.settings;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Storage;
import com.yahoo.mobile.client.share.search.util.C4238d;
import java.util.HashMap;

public final class ServerSettings {

    /* renamed from: a */
    public static final ServerEnvironment f16750a = new ServerEnvironment("v1.0", "https://m.search.yahoo.com/v1/%s/w/sapp", "https://m.search.yahoo.com/v1/%s/i/view", "https://m.search.yahoo.com/v1/%s/v/play", "https://m.search.yahoo.com/v1/%s/s", "https://m.search.yahoo.com/v1/%s/w/sh/", "https://m.search.yahoo.com/v1/%s/w/nsc", (String) null);

    /* renamed from: b */
    public static final ServerEnvironment f16751b = new C4126a("boss", "https://m.search.yahoo.com/v1.1/%s/w/sapp", "https://m.search.yahoo.com/v1.1/%s/i/view", "https://m.search.yahoo.com/v1.1/%s/v/play", "https://m.search.yahoo.com/v1/%s/s", "https://m.search.yahoo.com/v1/%s/w/sh/", "https://m.search.yahoo.com/v1/%s/w/nsc", "https://m.search.yahoo.com/v1.1/%s/ps", "https://m.search.yahoo.com/v1.1/en-US/tn?");

    /* renamed from: c */
    private static volatile ServerEnvironment f16752c = f16751b;

    /* renamed from: d */
    private static HashMap<String, ServerEnvironment> f16753d;

    public static class ServerEnvironment {

        /* renamed from: a */
        protected String f16754a;

        /* renamed from: b */
        protected String f16755b;

        /* renamed from: c */
        protected String f16756c;

        /* renamed from: d */
        protected String f16757d = null;

        /* renamed from: e */
        protected String f16758e;

        /* renamed from: f */
        private String f16759f;

        /* renamed from: g */
        private String f16760g;

        /* renamed from: h */
        private String f16761h;

        /* renamed from: i */
        private String f16762i;

        /* renamed from: j */
        private String f16763j = null;

        public ServerEnvironment(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f16762i = str;
            this.f16754a = str2;
            this.f16755b = str3;
            this.f16756c = str4;
            this.f16759f = str5;
            this.f16760g = str6;
            this.f16761h = str7;
            this.f16758e = str8;
        }

        public String getWebUrlTemplate() {
            return this.f16754a;
        }

        public String getImageUrlTemplate() {
            return this.f16755b;
        }

        public String getVideoUrlTemplate() {
            return this.f16756c;
        }

        public String getSearchSuggestUrlTemplate() {
            return this.f16759f;
        }

        public String getHistoryUrlTemplate() {
            return this.f16760g;
        }

        public String getBCrumbUrlTemplate() {
            return this.f16761h;
        }

        public String getSearchStatusUrlTemplate() {
            return this.f16757d;
        }

        public String getTrendingSearchUrlTemplate() {
            return this.f16758e;
        }

        public Uri.Builder appendExtraParameters(Context context, Uri.Builder builder) {
            if (builder == null) {
                return builder;
            }
            builder.appendQueryParameter(".sep", "wrapperdroid");
            if (getTsrc() != null) {
                builder.appendQueryParameter(".tsrc", getTsrc());
            }
            if (C4129c.m17454s()) {
                return appendDevelopmentExtraParameters(builder);
            }
            return builder;
        }

        public String getTsrc() {
            if (this.f16763j != null) {
                return this.f16763j;
            }
            this.f16763j = "native_";
            if (C4129c.m17457v() == null) {
                return null;
            }
            this.f16763j += C4129c.m17457v() + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR;
            if (C4129c.m17458w() != null) {
                this.f16763j += C4129c.m17458w() + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR;
            }
            this.f16763j += "android";
            return this.f16763j;
        }

        public Uri.Builder appendDevelopmentExtraParameters(Uri.Builder builder) {
            return builder;
        }

        public String getDescription() {
            return this.f16762i;
        }
    }

    /* renamed from: com.yahoo.mobile.client.share.search.settings.ServerSettings$a */
    public static class C4126a extends ServerEnvironment {
        public C4126a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            super(str, str2, str3, str4, str5, str6, str7, str9);
            this.f16757d = str8;
        }

        public final Uri.Builder appendExtraParameters(Context context, Uri.Builder builder) {
            if (builder != null) {
                builder.appendQueryParameter("appid", C4129c.m17451p());
                builder.appendQueryParameter("hspart", C4129c.m17451p());
                builder.appendQueryParameter("hsimp", "yhsm-std");
                builder.appendQueryParameter("sdkver", C4129c.m17427a());
                builder.appendQueryParameter("device", "smartphone");
                if (C4129c.m17454s()) {
                    builder = appendDevelopmentExtraParameters(builder);
                }
                builder.appendQueryParameter("storeid", C4129c.m17436c(context));
                builder.appendQueryParameter("storeidver", C4129c.m17438d(context));
                if (!TextUtils.isEmpty(C4238d.m17765b()) && !TextUtils.isEmpty(C4238d.m17766c())) {
                    builder.appendQueryParameter("adid", C4238d.m17765b());
                    builder.appendQueryParameter("adtype", C4238d.m17766c());
                    builder.appendQueryParameter("opt", C4238d.m17767d());
                }
            }
            return builder;
        }

        public final Uri.Builder appendDevelopmentExtraParameters(Uri.Builder builder) {
            if (builder != null) {
                builder.appendQueryParameter("dev", "1");
            }
            return builder;
        }
    }

    static {
        HashMap<String, ServerEnvironment> hashMap = new HashMap<>();
        f16753d = hashMap;
        hashMap.put("PROD", f16750a);
        f16753d.put("BOSS", f16751b);
    }

    /* renamed from: a */
    public static ServerEnvironment m17417a() {
        return f16752c;
    }
}
