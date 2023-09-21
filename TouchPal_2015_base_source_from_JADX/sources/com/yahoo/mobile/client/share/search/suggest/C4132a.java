package com.yahoo.mobile.client.share.search.suggest;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchActivity;
import com.yahoo.mobile.client.share.search.util.C4233c;
import com.yahoo.mobile.client.share.search.util.C4246k;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.yahoo.mobile.client.share.search.suggest.a */
public final class C4132a implements ISuggestContainer {

    /* renamed from: e */
    private static volatile Map<ComponentName, String> f16840e = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ISuggestContentHandler f16841a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f16842b = null;

    /* renamed from: c */
    private C4156g f16843c;

    /* renamed from: d */
    private int f16844d = 3;

    public C4132a(Context context) {
        this.f16842b = context;
        this.f16843c = new C4156g(context, C4073a.C4083j.yssdk_suggest_container);
        new Thread(new Runnable() {
            public final void run() {
                C4132a.m17509a(C4132a.this.f16842b);
            }
        }).start();
    }

    public final void loadContainerResult(SearchQuery searchQuery, int i) {
        if (TextUtils.isEmpty(searchQuery.getQueryString())) {
            this.f16841a.onContainerContentReceived(this, new ArrayList(), searchQuery);
            return;
        }
        C4233c.m17757a(new C4136a(i), searchQuery);
    }

    @SuppressFBWarnings({"BC_UNCONFIRMED_CAST"})
    public final View getView(List<SearchAssistData> list, SearchQuery searchQuery, View view) {
        LinearLayout linearLayout = (LinearLayout) this.f16843c.mo15478a((ViewGroup) view);
        final int i = 0;
        for (SearchAssistData createSearchAssistItemView : list) {
            SearchAssistData.createSearchAssistItemView(createSearchAssistItemView, this.f16842b, linearLayout, this.f16843c.mo15477a()).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C4132a.this.f16841a.onItemClick(C4132a.this, i, "default");
                }
            });
            i++;
        }
        return linearLayout;
    }

    public final void performItemClick(SearchAssistData searchAssistData, int i, String str, SearchQuery searchQuery) {
        if (str.equals("default")) {
            ComponentName unflattenFromString = ComponentName.unflattenFromString(searchAssistData.getInfo());
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(unflattenFromString);
            try {
                this.f16842b.startActivity(intent);
            } catch (Exception e) {
                new StringBuilder("Failed to start component: ").append(unflattenFromString.flattenToShortString());
            }
        }
    }

    public final String getContainerName() {
        return SearchActivity.SUGGEST_APPS;
    }

    public final boolean canIncrementalFilter() {
        return true;
    }

    public final boolean canCacheResults() {
        return false;
    }

    public final void setSuggestContentHandler(ISuggestContentHandler iSuggestContentHandler) {
        this.f16841a = iSuggestContentHandler;
    }

    /* renamed from: com.yahoo.mobile.client.share.search.suggest.a$a */
    private class C4136a extends AsyncTask<SearchQuery, Void, List<SearchAssistData>> {

        /* renamed from: a */
        SearchQuery f16849a;

        /* renamed from: b */
        int f16850b;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            SearchQuery[] searchQueryArr = (SearchQuery[]) objArr;
            this.f16849a = searchQueryArr[0];
            return C4132a.this.mo15452a(searchQueryArr[0], this.f16850b);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            C4132a.this.f16841a.onContainerContentReceived(C4132a.this, (List) obj, this.f16849a);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
        }

        public C4136a(int i) {
            this.f16850b = i;
        }
    }

    /* renamed from: a */
    public final List<SearchAssistData> mo15452a(SearchQuery searchQuery, int i) {
        int i2;
        int i3 = 0;
        String trim = searchQuery.getQueryString().trim();
        if (searchQuery == null || TextUtils.isEmpty(searchQuery.getQueryString()) || TextUtils.isEmpty(trim)) {
            return new ArrayList();
        }
        PackageManager packageManager = this.f16842b.getPackageManager();
        ArrayList arrayList = new ArrayList();
        Pattern b = searchQuery.getAction() == SearchQuery.SearchQueryAction.EXACT_MATCH ? C4246k.m17791b(trim) : C4246k.m17790a(trim);
        Map<ComponentName, String> a = m17509a(this.f16842b);
        if (a != null) {
            Iterator<Map.Entry<ComponentName, String>> it = a.entrySet().iterator();
            while (true) {
                if ((i > 0 && i3 > i) || !it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                ComponentName componentName = (ComponentName) next.getKey();
                String str = (String) next.getValue();
                if (b.matcher(str).find()) {
                    try {
                        packageManager.getActivityInfo(componentName, 0);
                        arrayList.add(new SearchAssistData((Drawable) null, str, 3, componentName.flattenToShortString()));
                        i2 = i3 + 1;
                    } catch (PackageManager.NameNotFoundException e) {
                        m17510a();
                        new Thread(new Runnable() {
                            public final void run() {
                                C4132a.m17509a(C4132a.this.f16842b);
                            }
                        }).start();
                    }
                } else {
                    i2 = i3;
                }
                i3 = i2;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static synchronized Map<ComponentName, String> m17509a(Context context) {
        Map<ComponentName, String> map;
        synchronized (C4132a.class) {
            if (f16840e != null) {
                map = f16840e;
            } else {
                HashMap hashMap = new HashMap();
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                intent.addCategory("android.intent.category.LAUNCHER");
                for (ResolveInfo next : packageManager.queryIntentActivities(intent, 0)) {
                    String str = next.activityInfo.name;
                    String str2 = next.activityInfo.packageName;
                    if (!str2.equals(context.getPackageName())) {
                        hashMap.put(new ComponentName(str2, str), next.activityInfo.loadLabel(packageManager).toString());
                    }
                }
                f16840e = hashMap;
                map = hashMap;
            }
        }
        return map;
    }

    /* renamed from: a */
    private static synchronized void m17510a() {
        synchronized (C4132a.class) {
            f16840e = null;
        }
    }

    public final int getMaxResultCount(SearchQuery searchQuery) {
        return this.f16844d;
    }

    public final SearchAssistData getDataByRankingId(String str) {
        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
        String str2 = m17509a(this.f16842b).get(unflattenFromString);
        if (str2 == null) {
            return null;
        }
        try {
            return new SearchAssistData(this.f16842b.getPackageManager().getActivityIcon(unflattenFromString), str2, 3, str);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public final boolean shouldOverrideInstrumentation(ISuggestContainer iSuggestContainer, SearchAssistData searchAssistData, int i, String str) {
        return false;
    }

    public final String getItemRankingId(SearchAssistData searchAssistData) {
        return searchAssistData.getInfo();
    }

    public final String getItemI13nId(SearchAssistData searchAssistData) {
        return searchAssistData.getLabel();
    }

    public final void prepareDataForDisplay(List<SearchAssistData> list, SearchQuery searchQuery) {
        if (list != null) {
            PackageManager packageManager = this.f16842b.getPackageManager();
            for (SearchAssistData next : list) {
                try {
                    next.setIcon(packageManager.getActivityIcon(ComponentName.unflattenFromString(next.getInfo())));
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
        }
    }
}
