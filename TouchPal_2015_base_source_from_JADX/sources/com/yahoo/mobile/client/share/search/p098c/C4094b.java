package com.yahoo.mobile.client.share.search.p098c;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Patterns;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.suggest.C4137b;
import com.yahoo.mobile.client.share.search.util.C4246k;
import com.yahoo.mobile.client.share.search.util.C4248m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.regex.Pattern;

/* renamed from: com.yahoo.mobile.client.share.search.c.b */
public final class C4094b extends C4137b {

    /* renamed from: b */
    private final C4095c f16584b;

    public C4094b(Context context, C4095c cVar) {
        super(context);
        this.f16584b = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ArrayList<SearchAssistData> mo15071a(SearchQuery searchQuery, Uri uri, String str, int i) {
        Pattern pattern;
        String str2;
        C4093a aVar;
        boolean find;
        if (!C4248m.f17353h) {
            return new ArrayList<>(1);
        }
        if (!uri.toString().startsWith(ContactsContract.Contacts.CONTENT_FILTER_URI.toString())) {
            return super.mo15071a(searchQuery, uri, str, i);
        }
        if (i <= 0) {
            i = getMaxResultCount((SearchQuery) null);
        }
        boolean z = C4248m.f17350e;
        try {
            Cursor query = this.f16852a.getContentResolver().query(uri, new String[]{"lookup", "_id", "display_name", "last_time_contacted", "times_contacted", "snippet"}, "snippet IS NULL", (String[]) null, str);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex("lookup");
            int columnIndex2 = query.getColumnIndex("_id");
            int columnIndex3 = query.getColumnIndex("display_name");
            int columnIndex4 = query.getColumnIndex("last_time_contacted");
            int columnIndex5 = query.getColumnIndex("times_contacted");
            int columnIndex6 = query.getColumnIndex("snippet");
            int min = Math.min(query.getCount(), i);
            PriorityQueue priorityQueue = new PriorityQueue(min + 2);
            ArrayList arrayList = new ArrayList(min);
            HashMap hashMap = new HashMap();
            if (searchQuery.getAction() == SearchQuery.SearchQueryAction.EXACT_MATCH) {
                String trim = searchQuery.getQueryString().trim();
                pattern = C4246k.m17791b(trim);
                str2 = trim;
            } else {
                pattern = null;
                str2 = null;
            }
            long j = 0;
            int i2 = 0;
            while (query.moveToNext()) {
                String string = query.getString(columnIndex3);
                if (string != null && !Patterns.EMAIL_ADDRESS.matcher(string.trim()).matches()) {
                    if (searchQuery.getAction() == SearchQuery.SearchQueryAction.EXACT_MATCH) {
                        String string2 = query.getString(columnIndex6);
                        if (!TextUtils.isEmpty(string2)) {
                            find = string2.contains("\u0001" + str2 + 1);
                        } else {
                            find = (TextUtils.isEmpty(string) || pattern == null) ? false : pattern.matcher(string).find();
                        }
                        if (!find) {
                            continue;
                        }
                    }
                    String string3 = query.getString(columnIndex);
                    long j2 = query.getLong(columnIndex2);
                    long j3 = 0;
                    long j4 = 0;
                    if (!query.isNull(columnIndex4)) {
                        j3 = query.getLong(columnIndex4);
                        j4 = query.getLong(columnIndex5);
                    }
                    if (i2 < min) {
                        SearchAssistData searchAssistData = new SearchAssistData((Drawable) null, string, 4, string3);
                        searchAssistData.setMrk(j2);
                        C4093a aVar2 = null;
                        if (j3 > 0) {
                            aVar2 = new C4093a(-1, string3, getContainerName(), j4, j3);
                        }
                        searchAssistData.setRanking(aVar2);
                        arrayList.add(searchAssistData);
                    } else {
                        C4093a aVar3 = (C4093a) hashMap.get(string3);
                        if (aVar3 != null || j3 > j) {
                            if (aVar3 == null) {
                                aVar = new C4093a(-1, string3, getContainerName(), 0, 0);
                            } else {
                                aVar = aVar3;
                            }
                            if (j3 > 0) {
                                aVar.mo15065a(new C4093a(-1, string3, getContainerName(), j4, j3));
                            }
                            SearchAssistData searchAssistData2 = new SearchAssistData((Drawable) null, string, 4, string3);
                            searchAssistData2.setMrk(j2);
                            searchAssistData2.setRanking(aVar);
                            priorityQueue.add(searchAssistData2);
                            priorityQueue.poll();
                        }
                    }
                    if (i2 == min - 1) {
                        j = C4093a.m17334a(j3);
                        List<C4093a> a = this.f16584b.mo15073a(getContainerName(), j);
                        if (a != null) {
                            for (C4093a next : a) {
                                hashMap.put(next.getItemId(), next);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            SearchAssistData searchAssistData3 = (SearchAssistData) it.next();
                            C4093a aVar4 = (C4093a) hashMap.get(searchAssistData3.getInfo());
                            if (aVar4 == null) {
                                aVar4 = new C4093a(-1, searchAssistData3.getInfo(), getContainerName(), 0, 0);
                            }
                            C4093a aVar5 = aVar4;
                            aVar5.mo15065a((C4093a) searchAssistData3.getRanking());
                            searchAssistData3.setRanking(aVar5);
                        }
                        priorityQueue.addAll(arrayList);
                    }
                    long j5 = j;
                    int i3 = i2 + 1;
                    if (i3 == 1000) {
                        break;
                    }
                    j = j5;
                    i2 = i3;
                }
            }
            query.close();
            return new ArrayList<>(priorityQueue);
        } catch (SQLiteException e) {
            e.getMessage();
            return new ArrayList<>();
        }
    }
}
