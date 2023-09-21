package com.yahoo.mobile.client.share.search.settings;

import android.content.Context;
import com.yahoo.mobile.client.share.search.interfaces.IFactory;
import com.yahoo.mobile.client.share.search.location.ISearchLocationManager;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.util.SafeSearchEnum;

public class SearchSDKSettings {
    public static final int SHARE_MODE = 5;
    public static final int TYPE_IMAGE = 2;
    public static final int TYPE_OTHER = 0;
    public static final int TYPE_VIDEO = 4;
    public static final int TYPE_WEB = 1;

    public static final class Builder {

        /* renamed from: a */
        private static String f16748a = "SearchSDKSettings.Builder";
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C4129c.C4130a f16749b;

        public Builder(String str) {
            this.f16749b = new C4129c.C4130a(str);
        }

        public final Builder setSearchSuggestEnabled(boolean z) {
            this.f16749b.mo15411b(z);
            return this;
        }

        public final Builder setConsumptionModeEnabled(boolean z) {
            this.f16749b.mo15409a(z);
            return this;
        }

        public final Builder setVoiceSearchEnabled(boolean z) {
            this.f16749b.mo15412c(z);
            return this;
        }

        public final Builder setSafeSearch(SafeSearchEnum safeSearchEnum) {
            this.f16749b.mo15408a(safeSearchEnum.getSafeSearchStringValue());
            return this;
        }

        public final Builder setGoogleApiKey(String str) {
            this.f16749b.mo15410b(str);
            return this;
        }

        public final Builder setYoutubeEnabled(boolean z) {
            this.f16749b.mo15413d(z);
            return this;
        }

        public final Builder setSearchLocationManager(ISearchLocationManager iSearchLocationManager) {
            this.f16749b.mo15407a(iSearchLocationManager);
            return this;
        }

        public final Builder setDeveloperMode(boolean z) {
            this.f16749b.mo15414e(z);
            return this;
        }

        public final Builder setShortUrlEnabled(boolean z) {
            this.f16749b.mo15415f(z);
            return this;
        }
    }

    public static void initializeSearchSDKSettings(Builder builder) {
        C4129c.m17429a(builder.f16749b);
    }

    public static boolean isConsumptionModeEnabled() {
        return C4129c.m17439d();
    }

    public static boolean isVoiceSearchEnabled(Context context) {
        return C4129c.m17433a(context);
    }

    public static SafeSearchEnum getSafeSearch(Context context) {
        if (C4129c.m17434b(context) != null) {
            return SafeSearchEnum.fromSafeSearchStringValue(C4129c.m17434b(context));
        }
        return SafeSearchEnum.MODERATE;
    }

    public static void setSafeSearch(SafeSearchEnum safeSearchEnum) {
        C4129c.m17430a(safeSearchEnum.getSafeSearchStringValue());
    }

    public static boolean isSearchSuggestEnabled() {
        return C4129c.m17441f();
    }

    public static void setSearchSuggestEnabled(boolean z) {
        C4129c.m17432a(z);
    }

    public static String getGoogleApiKey() {
        return C4129c.m17445j();
    }

    public static boolean isYoutubeEnabled() {
        return C4129c.m17446k();
    }

    public static IFactory getFactory() {
        return C4129c.m17444i();
    }

    public static boolean isShortUrlEnabled() {
        return C4129c.m17443h();
    }
}
