package com.yahoo.mobile.client.share.search.data.contentmanager;

import android.content.Context;
import android.text.TextUtils;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.interfaces.IQuery;
import com.yahoo.mobile.client.share.search.interfaces.IQueryManager;
import com.yahoo.mobile.client.share.search.util.C4245j;

public abstract class ContentManager implements SearchCommand.SearchTaskCallback, IQueryManager {
    public static final String TAG = "ContentManager";

    /* renamed from: a */
    protected SearchCommand f16734a = null;

    /* renamed from: b */
    protected IContentHandler f16735b;

    /* renamed from: c */
    protected Context f16736c;

    /* renamed from: d */
    private SearchQuery f16737d;

    public interface IContentHandler {
        void onContentError(ContentManager contentManager, SearchError searchError, SearchQuery searchQuery);

        void onContentReceived(ContentManager contentManager, SearchResponseData searchResponseData, SearchQuery searchQuery);

        void onProgressReceived(ContentManager contentManager, SearchCommand.SearchProgressEnum searchProgressEnum, SearchQuery searchQuery);
    }

    public abstract SearchCommand getNewCommandInstance(SearchQuery searchQuery);

    public ContentManager(IContentHandler iContentHandler, Context context) {
        this.f16735b = iContentHandler;
        this.f16736c = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo15307a(SearchQuery searchQuery) {
        if (C4245j.m17787b(this.f16736c)) {
            return true;
        }
        String string = this.f16736c.getResources().getString(C4073a.C4086m.yssdk_no_internet);
        if (this.f16735b != null) {
            this.f16735b.onContentError(this, new SearchError(-1, 2, string), searchQuery);
            this.f16735b.onProgressReceived(this, SearchCommand.SearchProgressEnum.ERROR, searchQuery);
        }
        return false;
    }

    public void loadQuery(IQuery iQuery) throws NullPointerException, IllegalArgumentException {
        SearchQuery searchQuery = (SearchQuery) iQuery;
        if (searchQuery == null) {
            throw new NullPointerException("Query object shouldn't be null.");
        }
        mo15306a(searchQuery.getQueryString());
        if (mo15307a(searchQuery)) {
            if (this.f16735b != null) {
                this.f16735b.onProgressReceived(this, SearchCommand.SearchProgressEnum.STARTING, searchQuery);
            }
            SearchCommand command = getCommand(searchQuery);
            command.setSearchTaskCallback(this);
            command.executeCommand();
        }
    }

    public SearchCommand getCommand(SearchQuery searchQuery) {
        this.f16734a = getNewCommandInstance(searchQuery);
        return this.f16734a;
    }

    public void onSearchTaskCompleted(SearchCommand searchCommand, SearchResponseData searchResponseData, SearchQuery searchQuery) {
        if (this.f16735b != null) {
            this.f16735b.onContentReceived(this, searchResponseData, searchQuery);
        }
    }

    public void onSearchTaskError(SearchCommand searchCommand, SearchError searchError, SearchQuery searchQuery) {
        if (this.f16735b != null) {
            this.f16735b.onContentError(this, searchError, searchQuery);
        }
    }

    public void onProgressReceived(SearchCommand searchCommand, SearchCommand.SearchProgressEnum searchProgressEnum, SearchQuery searchQuery) {
        if (this.f16735b != null) {
            this.f16735b.onProgressReceived(this, searchProgressEnum, searchQuery);
        }
    }

    public void onSearchTaskCancelled(SearchCommand searchCommand, SearchQuery searchQuery) {
    }

    public void cancelBackgroundTasks() {
        if (this.f16734a != null) {
            this.f16734a.cancel();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo15306a(String str) throws IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Query String should not be empty.");
    }

    public IQuery getLastQuery() {
        if (this.f16734a == null) {
            return this.f16737d;
        }
        this.f16737d = null;
        return this.f16734a.getLastQuery();
    }

    public void restoreLastQuery(SearchQuery searchQuery) {
        this.f16737d = searchQuery;
    }

    public void setContentHandler(IContentHandler iContentHandler) {
        this.f16735b = iContentHandler;
    }
}
