package com.yahoo.mobile.client.share.search.commands;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.p023a.p024a.p032b.p037d.C0781a;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.SearchHistoryCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;
import com.yahoo.mobile.client.share.search.interfaces.ICancelable;
import com.yahoo.mobile.client.share.search.interfaces.INetworkAsync;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.util.C4238d;
import com.yahoo.mobile.client.share.search.util.C4245j;
import com.yahoo.mobile.client.share.search.util.UrlBuilderUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public abstract class SearchCommand implements ICancelable, INetworkAsync.Listener<SearchResponseData>, INetworkAsync.Parser<SearchResponseData> {

    /* renamed from: a */
    private Handler f16588a;

    /* renamed from: b */
    protected Object f16589b;

    /* renamed from: c */
    protected INetworkAsync f16590c;

    /* renamed from: d */
    protected Context f16591d;

    /* renamed from: e */
    protected SearchTaskCallback f16592e;

    /* renamed from: f */
    protected SearchQuery f16593f;

    /* renamed from: g */
    private int f16594g;

    /* renamed from: h */
    private boolean f16595h;

    public enum SearchProgressEnum {
        STARTING,
        EXECUTING,
        REQUEST_MADE,
        RESPONSE_RECEIVED,
        PARSING_DONE,
        ERROR
    }

    public interface SearchTaskCallback {
        void onProgressReceived(SearchCommand searchCommand, SearchProgressEnum searchProgressEnum, SearchQuery searchQuery);

        void onSearchTaskCancelled(SearchCommand searchCommand, SearchQuery searchQuery);

        void onSearchTaskCompleted(SearchCommand searchCommand, SearchResponseData searchResponseData, SearchQuery searchQuery);

        void onSearchTaskError(SearchCommand searchCommand, SearchError searchError, SearchQuery searchQuery);
    }

    public abstract int getCommandType();

    public abstract IUrlBuilder getUrlBuilder();

    public abstract SearchResponseData parseResponse(String str);

    public SearchCommand(Context context, SearchQuery searchQuery) {
        this(context, searchQuery, (SearchTaskCallback) null);
    }

    public SearchCommand(Context context, SearchQuery searchQuery, SearchTaskCallback searchTaskCallback) {
        this(context, searchQuery, searchTaskCallback, C4129c.m17444i().getNetwork(context), new Handler(context.getMainLooper()));
    }

    public SearchCommand(Context context, SearchQuery searchQuery, SearchTaskCallback searchTaskCallback, INetworkAsync iNetworkAsync, Handler handler) {
        this.f16591d = null;
        this.f16592e = null;
        this.f16593f = null;
        this.f16594g = 0;
        this.f16595h = false;
        this.f16592e = searchTaskCallback;
        this.f16591d = context;
        this.f16593f = searchQuery;
        this.f16590c = iNetworkAsync;
        this.f16588a = handler;
    }

    public void setQuery(SearchQuery searchQuery) {
        this.f16593f = searchQuery;
    }

    public SearchTaskCallback getSearchTaskCallback() {
        return this.f16592e;
    }

    public void setSearchTaskCallback(SearchTaskCallback searchTaskCallback) {
        this.f16592e = searchTaskCallback;
    }

    public void executeCommand() {
        if (mo15094g() && UrlBuilderUtils.m17739a() == null) {
            SearchHistoryCommand searchHistoryCommand = new SearchHistoryCommand(this.f16591d, this.f16593f, SearchHistoryCommand.SearchHistoryActionEnum.GET_CRUMB);
            searchHistoryCommand.setSearchTaskCallback(new SearchTaskCallback() {
                public final void onProgressReceived(SearchCommand searchCommand, SearchProgressEnum searchProgressEnum, SearchQuery searchQuery) {
                }

                public final void onSearchTaskError(SearchCommand searchCommand, SearchError searchError, SearchQuery searchQuery) {
                    if (SearchCommand.this.f16592e != null) {
                        SearchCommand.this.f16592e.onSearchTaskError(SearchCommand.this, searchError, searchQuery);
                    }
                }

                public final void onSearchTaskCompleted(SearchCommand searchCommand, SearchResponseData searchResponseData, SearchQuery searchQuery) {
                    SearchCommand.this.executeCommand();
                }

                public final void onSearchTaskCancelled(SearchCommand searchCommand, SearchQuery searchQuery) {
                }
            });
            searchHistoryCommand.executeCommand();
        } else if (mo15087b()) {
            m17357a(SearchProgressEnum.EXECUTING);
            String uri = getUrlBuilder().buildUrl(this.f16591d, this.f16593f).toString();
            getClass().getSimpleName();
            new StringBuilder("<URL>=").append(uri);
            this.f16589b = this.f16590c.requestAsync(uri, mo15088c(), mo15085a(uri), mo15090d(), this, this, C0781a.f1973a, mo15084a());
            m17357a(SearchProgressEnum.REQUEST_MADE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo15087b() {
        if (mo15100h() && C4129c.m17455t()) {
            if (C4129c.m17456u() == null) {
                new SearchStatusCommand(this.f16591d, this.f16593f).executeCommand();
            } else if (C4129c.m17456u().getValidStatus() == SearchStatusData.SearchStatusEnum.REVOKED) {
                if (!this.f16595h) {
                    this.f16594g = 10;
                    mo15086a(this.f16594g);
                }
                return false;
            }
        }
        return true;
    }

    public void cancel() {
        if (!this.f16595h && this.f16589b != null) {
            this.f16590c.cancelRequest(this.f16589b);
            this.f16589b = null;
            if (this.f16592e != null) {
                this.f16592e.onSearchTaskCancelled(this, this.f16593f);
            }
        }
        this.f16595h = true;
        this.f16594g = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo15088c() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public byte[] mo15090d() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo15085a(String str) {
        String a = C4238d.m17760a(Uri.parse(str).getScheme().equalsIgnoreCase("http") && mo15093f());
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", getUserAgent());
        hashMap.put("Accept-Encoding", "gzip, deflate");
        hashMap.put("X-Session-id", Integer.toHexString((int) (System.currentTimeMillis() / 1000)));
        hashMap.put("X-Yahoo-Unique-Device-Id", "Android");
        if (!C4245j.m17785a(a)) {
            hashMap.put(C2261Q.f9792am, a);
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo15091e() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15086a(int i) {
        if (this.f16592e != null) {
            this.f16592e.onSearchTaskError(this, new SearchError(getCommandType(), i, (Object) null), this.f16593f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo15093f() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo15094g() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo15100h() {
        return true;
    }

    /* renamed from: a */
    private void m17357a(final SearchProgressEnum searchProgressEnum) {
        final SearchQuery searchQuery = this.f16593f;
        C40971 r1 = new Runnable() {
            public final void run() {
                if (SearchCommand.this.f16592e != null) {
                    SearchCommand.this.f16592e.onProgressReceived(SearchCommand.this, searchProgressEnum, searchQuery);
                }
            }
        };
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.f16588a.post(r1);
        } else {
            r1.run();
        }
    }

    public SearchQuery getLastQuery() {
        return this.f16593f;
    }

    public String getUserAgent() {
        String property = System.getProperty("http.agent");
        if (property == null) {
            property = "";
        }
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append(property);
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo15084a() {
        return "";
    }

    public void onResponse(SearchResponseData searchResponseData) {
        if (!this.f16595h && this.f16592e != null) {
            if (this.f16594g != 0) {
                m17357a(SearchProgressEnum.ERROR);
                mo15086a(this.f16594g);
            } else if (mo15091e() || !(searchResponseData == null || searchResponseData.getResponseList() == null || searchResponseData.getResponseList().isEmpty())) {
                onCompleted(searchResponseData);
            } else {
                m17357a(SearchProgressEnum.ERROR);
                if (this.f16592e != null) {
                    this.f16592e.onSearchTaskError(this, new SearchError(getCommandType(), 1, new ArrayList()), this.f16593f);
                }
            }
        }
    }

    public void onCompleted(SearchResponseData searchResponseData) {
        this.f16592e.onSearchTaskCompleted(this, searchResponseData, this.f16593f);
    }

    public void onError(SearchError searchError) {
        if (!this.f16595h && this.f16592e != null) {
            this.f16594g = 4;
            mo15086a(this.f16594g);
        }
    }

    public SearchResponseData parse(byte[] bArr, Map<String, String> map) {
        String a;
        if (this.f16595h) {
            return null;
        }
        m17357a(SearchProgressEnum.RESPONSE_RECEIVED);
        String str = map.get(C2261Q.f9795ap);
        if (str == null || !str.equals("gzip")) {
            a = C4245j.m17782a(bArr, C4245j.m17781a(map));
        } else {
            try {
                a = C4245j.m17780a(new GZIPInputStream(new ByteArrayInputStream(bArr)), C4245j.m17781a(map), this);
            } catch (IOException e) {
                a = "";
            }
        }
        if (mo15091e() || !C4245j.m17785a(a)) {
            SearchResponseData parseResponse = parseResponse(a);
            m17357a(SearchProgressEnum.PARSING_DONE);
            return parseResponse;
        }
        this.f16594g = 4;
        return null;
    }

    public boolean isCanceled() {
        return this.f16595h;
    }
}
