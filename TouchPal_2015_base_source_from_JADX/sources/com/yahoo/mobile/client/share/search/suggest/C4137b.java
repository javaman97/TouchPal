package com.yahoo.mobile.client.share.search.suggest;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.p096a.C4090a;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchActivity;
import com.yahoo.mobile.client.share.search.util.C4233c;
import com.yahoo.mobile.client.share.search.util.C4245j;
import com.yahoo.mobile.client.share.search.util.C4248m;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yahoo.mobile.client.share.search.suggest.b */
public class C4137b implements ISuggestContainer {

    /* renamed from: a */
    protected Context f16852a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ISuggestContentHandler f16853b = null;

    /* renamed from: c */
    private Bitmap f16854c = null;

    /* renamed from: d */
    private C4156g f16855d;

    /* renamed from: e */
    private int f16856e = 3;

    /* renamed from: a */
    static /* synthetic */ ArrayList m17515a(C4137b bVar, SearchQuery searchQuery, int i) {
        String queryString = searchQuery.getQueryString();
        if (bVar.f16852a.getPackageManager().checkPermission("android.permission.READ_CONTACTS", bVar.f16852a.getPackageName()) == -1 || TextUtils.isEmpty(queryString) || TextUtils.isEmpty(queryString.trim())) {
            return new ArrayList();
        }
        Uri.Builder buildUpon = ContactsContract.Contacts.CONTENT_FILTER_URI.buildUpon();
        buildUpon.appendPath(queryString.trim());
        buildUpon.appendQueryParameter("snippet_args", "\u0001,\u0001,…,5");
        buildUpon.appendQueryParameter("deferred_snippeting", "0");
        return bVar.mo15071a(searchQuery, buildUpon.build(), "last_time_contacted DESC", i);
    }

    public C4137b(Context context) {
        this.f16852a = context;
        this.f16855d = new C4156g(context, C4073a.C4083j.yssdk_suggest_container);
    }

    public void loadContainerResult(SearchQuery searchQuery, int i) {
        if (searchQuery == null || TextUtils.isEmpty(searchQuery.getQueryString())) {
            this.f16853b.onContainerContentReceived(this, new ArrayList(), searchQuery);
            return;
        }
        C4233c.m17759c(new C4139a(i), searchQuery);
    }

    @SuppressFBWarnings({"BC_UNCONFIRMED_CAST"})
    public View getView(List<SearchAssistData> list, SearchQuery searchQuery, View view) {
        LinearLayout linearLayout = (LinearLayout) this.f16855d.mo15478a((ViewGroup) view);
        final int i = 0;
        for (SearchAssistData createSearchAssistItemView : list) {
            SearchAssistData.createSearchAssistItemView(createSearchAssistItemView, this.f16852a, linearLayout, this.f16855d.mo15477a()).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C4137b.this.f16853b.onItemClick(C4137b.this, i, "default");
                }
            });
            i++;
        }
        return linearLayout;
    }

    public void performItemClick(SearchAssistData searchAssistData, int i, String str, SearchQuery searchQuery) {
        if (str.equals("default")) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, searchAssistData.getInfo()));
            this.f16852a.startActivity(intent);
        }
    }

    public String getContainerName() {
        return SearchActivity.SUGGEST_CONTACTS;
    }

    public void setSuggestContentHandler(ISuggestContentHandler iSuggestContentHandler) {
        this.f16853b = iSuggestContentHandler;
    }

    /* renamed from: com.yahoo.mobile.client.share.search.suggest.b$a */
    private class C4139a extends AsyncTask<SearchQuery, Void, List<SearchAssistData>> {

        /* renamed from: b */
        private SearchQuery f16860b;

        /* renamed from: c */
        private int f16861c;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            SearchQuery[] searchQueryArr = (SearchQuery[]) objArr;
            this.f16860b = searchQueryArr[0];
            return C4137b.m17515a(C4137b.this, searchQueryArr[0], this.f16861c);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            C4137b.this.f16853b.onContainerContentReceived(C4137b.this, (List) obj, this.f16860b);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
        }

        public C4139a(int i) {
            this.f16861c = i;
        }
    }

    public boolean canIncrementalFilter() {
        return true;
    }

    public boolean canCacheResults() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<SearchAssistData> mo15071a(SearchQuery searchQuery, Uri uri, String str, int i) {
        if (!C4245j.m17784a(this.f16852a)) {
            return new ArrayList<>();
        }
        boolean z = C4248m.f17350e;
        try {
            Cursor query = this.f16852a.getContentResolver().query(uri, new String[]{"lookup", "_id", "display_name"}, (String) null, (String[]) null, str);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex("lookup");
            int columnIndex2 = query.getColumnIndex("_id");
            int columnIndex3 = query.getColumnIndex("display_name");
            ArrayList<SearchAssistData> arrayList = new ArrayList<>();
            int i2 = 0;
            while (query.moveToNext() && (i <= 0 || i2 <= i)) {
                String string = query.getString(columnIndex3);
                String string2 = query.getString(columnIndex);
                long j = query.getLong(columnIndex2);
                SearchAssistData searchAssistData = new SearchAssistData((Drawable) null, string, 4, string2);
                searchAssistData.setMrk(j);
                arrayList.add(searchAssistData);
                i2++;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            e.getMessage();
            return null;
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    /* renamed from: a */
    private Drawable m17513a(ContentResolver contentResolver, Uri uri) {
        C4090a aVar = null;
        InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
        if (openContactPhotoInputStream != null) {
            Bitmap decodeStream = BitmapFactory.decodeStream(openContactPhotoInputStream);
            if (decodeStream != null) {
                aVar = new C4090a(this.f16852a.getResources(), decodeStream);
            }
            try {
                openContactPhotoInputStream.close();
            } catch (IOException e) {
                e.getMessage();
            }
        }
        if (aVar != null) {
            return aVar;
        }
        if (this.f16854c == null) {
            this.f16854c = BitmapFactory.decodeResource(this.f16852a.getResources(), C4073a.C4080g.yssdk_default_contact_icon);
        }
        return new C4090a(this.f16852a.getResources(), this.f16854c);
    }

    public int getMaxResultCount(SearchQuery searchQuery) {
        return this.f16856e;
    }

    public SearchAssistData getDataByRankingId(String str) {
        SearchAssistData searchAssistData = null;
        ContentResolver contentResolver = this.f16852a.getContentResolver();
        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, str);
        boolean z = C4248m.f17350e;
        Cursor query = contentResolver.query(withAppendedPath, new String[]{"_id", "display_name"}, (String) null, (String[]) null, (String) null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    long j = query.getLong(0);
                    searchAssistData = new SearchAssistData(m17513a(contentResolver, ContactsContract.Contacts.getLookupUri(j, str)), query.getString(1), 4, str);
                } else {
                    query.close();
                }
            } finally {
                query.close();
            }
        }
        return searchAssistData;
    }

    public boolean shouldOverrideInstrumentation(ISuggestContainer iSuggestContainer, SearchAssistData searchAssistData, int i, String str) {
        return false;
    }

    public String getItemRankingId(SearchAssistData searchAssistData) {
        return searchAssistData.getInfo();
    }

    public String getItemI13nId(SearchAssistData searchAssistData) {
        return searchAssistData.getInfo();
    }

    public void prepareDataForDisplay(List<SearchAssistData> list, SearchQuery searchQuery) {
        Uri lookupContact;
        ContentResolver contentResolver = this.f16852a.getContentResolver();
        for (SearchAssistData next : list) {
            if (next.getIcon() == null) {
                if (next.getMrk() != 0) {
                    lookupContact = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, next.getMrk());
                } else {
                    lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, next.getInfo()));
                }
                next.setIcon(m17513a(contentResolver, lookupContact));
            }
        }
    }
}
