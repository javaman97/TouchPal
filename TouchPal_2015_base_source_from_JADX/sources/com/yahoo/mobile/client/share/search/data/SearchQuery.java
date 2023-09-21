package com.yahoo.mobile.client.share.search.data;

import android.location.Location;
import com.yahoo.mobile.client.share.search.interfaces.IQuery;
import com.yahoo.mobile.client.share.search.settings.C4128b;
import java.util.HashMap;
import java.util.Map;

public final class SearchQuery implements IQuery {
    public static final SearchQuery EMPTY_SEARCH_QUERY = new SearchQuery(new Builder());

    /* renamed from: a */
    private final String f16682a;

    /* renamed from: b */
    private final Location f16683b;

    /* renamed from: c */
    private final boolean f16684c;

    /* renamed from: d */
    private final int f16685d;

    /* renamed from: e */
    private final int f16686e;

    /* renamed from: f */
    private final int f16687f;

    /* renamed from: g */
    private final boolean f16688g;

    /* renamed from: h */
    private final boolean f16689h;

    /* renamed from: i */
    private final Map<String, String> f16690i;

    /* renamed from: j */
    private final SearchQueryAction f16691j;

    public enum SearchQueryAction {
        MANUAL,
        SUGGESTION,
        REQUERY,
        BACK,
        VOICE,
        RESTORED,
        DEEP_LINK,
        EXACT_MATCH
    }

    public static class Builder {

        /* renamed from: a */
        private static String f16692a = "SearchQuery.Builder";
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f16693b = "";
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Location f16694c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f16695d = false;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f16696e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f16697f = 0;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f16698g = Integer.MAX_VALUE;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f16699h = true;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f16700i = true;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public Map<String, String> f16701j = null;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public SearchQueryAction f16702k = SearchQueryAction.MANUAL;

        public Builder() {
            if (C4128b.m17425a() != null) {
                this.f16694c = C4128b.m17425a().getLocation();
            }
        }

        public Builder(SearchQuery searchQuery) {
            this.f16693b = searchQuery.getQueryString();
            if (searchQuery.getLocation() != null) {
                this.f16694c = new Location(searchQuery.getLocation());
            }
            this.f16695d = searchQuery.isVoiceSearch();
            this.f16696e = searchQuery.getOffset();
            this.f16697f = searchQuery.getCount();
            this.f16698g = searchQuery.getCursorPosition();
            this.f16699h = searchQuery.shouldShowMoreImageLink();
            this.f16700i = searchQuery.shouldShowMoreVideoLink();
            if (searchQuery.getAdditionalParameters() != null) {
                this.f16701j = new HashMap(searchQuery.getAdditionalParameters());
            }
            this.f16702k = searchQuery.getAction();
        }

        public Builder setQueryString(String str) {
            this.f16693b = str;
            return this;
        }

        public Builder setLocation(Location location) {
            if (location != null) {
                this.f16694c = new Location(location);
            }
            return this;
        }

        public Builder isVoiceSearch(boolean z) {
            this.f16695d = z;
            return this;
        }

        public Builder setOffset(int i) {
            this.f16696e = i;
            return this;
        }

        public Builder setCount(int i) {
            this.f16697f = i;
            return this;
        }

        public Builder setCursorPosition(int i) {
            this.f16698g = i;
            return this;
        }

        public Builder showMoreImagesLink(boolean z) {
            this.f16699h = z;
            return this;
        }

        public Builder showMoreVideosLink(boolean z) {
            this.f16700i = z;
            return this;
        }

        public Builder setAdditionalParameters(Map<String, String> map) {
            if (map != null) {
                this.f16701j = new HashMap(map);
            }
            return this;
        }

        public Builder setQueryAction(SearchQueryAction searchQueryAction) {
            this.f16702k = searchQueryAction;
            return this;
        }
    }

    public SearchQuery(Builder builder) {
        this.f16682a = builder.f16693b;
        this.f16684c = builder.f16695d;
        this.f16685d = builder.f16696e;
        this.f16686e = builder.f16697f;
        this.f16687f = builder.f16698g;
        this.f16690i = builder.f16701j;
        this.f16683b = builder.f16694c;
        this.f16688g = builder.f16699h;
        this.f16689h = builder.f16700i;
        this.f16691j = builder.f16702k;
    }

    public final SearchQueryAction getAction() {
        return this.f16691j;
    }

    public final String getQueryString() {
        return this.f16682a;
    }

    public final boolean isVoiceSearch() {
        return this.f16684c;
    }

    public final int getOffset() {
        return this.f16685d;
    }

    public final int getCount() {
        return this.f16686e;
    }

    public final int getCursorPosition() {
        return this.f16687f;
    }

    public final Location getLocation() {
        if (this.f16683b != null) {
            return new Location(this.f16683b);
        }
        return this.f16683b;
    }

    public final Map<String, String> getAdditionalParameters() {
        if (this.f16690i != null) {
            return new HashMap(this.f16690i);
        }
        return this.f16690i;
    }

    public final boolean shouldShowMoreImageLink() {
        return this.f16688g;
    }

    public final boolean shouldShowMoreVideoLink() {
        return this.f16689h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchQuery searchQuery = (SearchQuery) obj;
        if (!this.f16682a.equals(searchQuery.f16682a)) {
            return false;
        }
        if (this.f16685d != searchQuery.f16685d) {
            return false;
        }
        if (this.f16686e != searchQuery.f16686e) {
            return false;
        }
        if (this.f16688g != searchQuery.f16688g) {
            return false;
        }
        if (this.f16689h != searchQuery.f16689h) {
            return false;
        }
        if (this.f16691j != searchQuery.f16691j) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 1;
        int hashCode = ((((this.f16682a.hashCode() * 31) + this.f16685d) * 31) + this.f16686e) * 31;
        if (this.f16688g) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = (i + hashCode) * 31;
        if (!this.f16689h) {
            i2 = 0;
        }
        return ((i3 + i2) * 31) + this.f16691j.hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.f16682a);
        stringBuffer.append("{");
        stringBuffer.append(this.f16685d + ",");
        stringBuffer.append(this.f16686e + ",");
        stringBuffer.append(this.f16688g + ",");
        stringBuffer.append(this.f16689h + ",");
        stringBuffer.append(this.f16691j);
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
