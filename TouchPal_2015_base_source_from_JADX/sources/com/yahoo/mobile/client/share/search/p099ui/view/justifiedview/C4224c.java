package com.yahoo.mobile.client.share.search.p099ui.view.justifiedview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.contentmanager.IListViewAdapterHandler;
import com.yahoo.mobile.client.share.search.p099ui.view.AsyncImageView;
import com.yahoo.mobile.client.share.search.util.C4248m;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.yahoo.mobile.client.share.search.ui.view.justifiedview.c */
public class C4224c extends BaseAdapter implements AbsListView.OnScrollListener {

    /* renamed from: d */
    private static final String f17295d = C4224c.class.getSimpleName();

    /* renamed from: a */
    protected Context f17296a;

    /* renamed from: b */
    IListViewAdapterHandler f17297b;

    /* renamed from: c */
    protected View.OnClickListener f17298c;

    /* renamed from: e */
    private SearchQuery f17299e;

    /* renamed from: f */
    private int f17300f;

    /* renamed from: g */
    private int f17301g;

    /* renamed from: h */
    private int f17302h;

    /* renamed from: i */
    private ArrayList<JustifiedViewRowInfo> f17303i = new ArrayList<>();

    /* renamed from: j */
    private C4222a f17304j = new C4222a();

    /* renamed from: k */
    private ArrayDeque<AsyncImageView> f17305k = new ArrayDeque<>();

    /* renamed from: l */
    private int f17306l;

    /* renamed from: m */
    private ArrayList<PhotoData> f17307m = new ArrayList<>();

    public /* synthetic */ Object getItem(int i) {
        if (this.f17303i.size() > i) {
            return this.f17303i.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public final SearchQuery mo15851a() {
        return this.f17299e;
    }

    public C4224c(Context context, SearchQuery searchQuery, IListViewAdapterHandler iListViewAdapterHandler, ArrayList<PhotoData> arrayList) {
        this.f17299e = searchQuery;
        this.f17297b = iListViewAdapterHandler;
        this.f17296a = context;
        DisplayMetrics displayMetrics = this.f17296a.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        this.f17300f = i;
        this.f17302h = (int) (4.0f * displayMetrics.density);
        this.f17301g = (int) (displayMetrics.density * 130.0f);
        if (i2 / this.f17301g > 6) {
            this.f17301g = i2 / 6;
        }
        mo15853a(searchQuery, arrayList);
    }

    /* renamed from: b */
    public final ArrayList<PhotoData> mo15854b() {
        return this.f17307m;
    }

    /* renamed from: a */
    public final void mo15853a(SearchQuery searchQuery, ArrayList<PhotoData> arrayList) {
        this.f17299e = searchQuery;
        if (arrayList != null) {
            int size = this.f17303i.size();
            int size2 = this.f17307m.size();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size3 = this.f17307m.size();
            Iterator<PhotoData> it = arrayList.iterator();
            int i = size3;
            while (it.hasNext()) {
                PhotoData next = it.next();
                int i2 = i + 1;
                next.setImgPos(i);
                this.f17307m.add(next);
                C4223b bVar = new C4223b();
                bVar.f17294c = next;
                bVar.f17292a = new Dimension((double) next.getThumbWidth(), (double) next.getThumbHeight());
                arrayList2.add(bVar);
                i = i2;
            }
            ArrayList<JustifiedViewRowInfo> arrayList3 = this.f17303i;
            C4222a aVar = this.f17304j;
            arrayList3.addAll(C4222a.m17721a(arrayList2, (double) this.f17300f, (double) this.f17301g, (double) this.f17302h));
            int i3 = size2;
            for (int i4 = size; i4 < this.f17303i.size(); i4++) {
                this.f17303i.get(i4).f17291b = i3;
                i3 += this.f17303i.get(i4).f17290a.size();
            }
        }
    }

    /* renamed from: a */
    public final int mo15847a(int i) {
        JustifiedViewRowInfo justifiedViewRowInfo = new JustifiedViewRowInfo();
        justifiedViewRowInfo.f17291b = i;
        justifiedViewRowInfo.f17290a.add(new C4223b());
        int binarySearch = Collections.binarySearch(this.f17303i, justifiedViewRowInfo);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo15855c() {
        this.f17307m.clear();
        this.f17303i.clear();
        this.f17305k.clear();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f17303i == null || i >= this.f17303i.size()) {
            return null;
        }
        if (this.f17297b != null) {
            this.f17297b.onShowRowView(this, i, view, this.f17299e);
        }
        return mo15848a(i, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo15848a(int i, View view) {
        JustifiedViewRowInfo justifiedViewRowInfo = this.f17303i.get(i);
        LinearLayout a = mo15850a((LinearLayout) view, justifiedViewRowInfo, i);
        int size = justifiedViewRowInfo.getArrayJustifiedViewInfo().size();
        for (int i2 = 0; i2 < size; i2++) {
            C4223b bVar = justifiedViewRowInfo.getArrayJustifiedViewInfo().get(i2);
            View a2 = mo15849a(justifiedViewRowInfo, bVar, i2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) bVar.f17293b.f17288a, (int) bVar.f17293b.f17289b);
            layoutParams.rightMargin = this.f17302h;
            a.addView(a2, layoutParams);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LinearLayout mo15850a(LinearLayout linearLayout, JustifiedViewRowInfo justifiedViewRowInfo, int i) {
        if (linearLayout == null) {
            linearLayout = new LinearLayout(this.f17296a);
        } else {
            m17723a((ViewGroup) linearLayout);
        }
        linearLayout.setLayoutParams(new AbsListView.LayoutParams(-1, ((int) justifiedViewRowInfo.getRowHeight()) + this.f17302h));
        linearLayout.setPadding(0, this.f17302h, 0, 0);
        linearLayout.setTag(Integer.valueOf(i));
        return linearLayout;
    }

    /* renamed from: a */
    private void m17723a(ViewGroup viewGroup) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof ViewGroup) {
                    m17723a((ViewGroup) childAt);
                } else if (childAt instanceof AsyncImageView) {
                    AsyncImageView asyncImageView = (AsyncImageView) viewGroup.getChildAt(i2);
                    this.f17305k.add(asyncImageView);
                    asyncImageView.reset();
                }
                i = i2 + 1;
            } else {
                viewGroup.removeAllViews();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo15849a(JustifiedViewRowInfo justifiedViewRowInfo, C4223b bVar, int i) {
        AsyncImageView pollFirst = this.f17305k.pollFirst();
        if (pollFirst == null) {
            pollFirst = new AsyncImageView(this.f17296a);
        }
        pollFirst.setImageDrawable(this.f17296a.getResources().getDrawable(C4073a.C4080g.yssdk_grid_item_background).mutate());
        pollFirst.loadImage((Drawable) null, Uri.parse(((PhotoData) bVar.f17294c).getEscapedThumbnailUrl()), this.f17296a.getResources().getDrawable(C4073a.C4080g.yssdk_list_items_stateful).mutate(), this.f17306l, C4248m.f17353h ? new int[]{(int) bVar.f17293b.f17288a, (int) bVar.f17293b.f17289b} : null);
        pollFirst.setOnClickListener(this.f17298c);
        pollFirst.setTag(Integer.valueOf(justifiedViewRowInfo.f17291b + i));
        return pollFirst;
    }

    /* renamed from: d */
    public final int mo15856d() {
        return this.f17307m.size();
    }

    public int getCount() {
        return this.f17303i.size();
    }

    /* renamed from: a */
    public final void mo15852a(View.OnClickListener onClickListener) {
        this.f17298c = onClickListener;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (C4248m.f17353h) {
            switch (i) {
                case 2:
                    this.f17306l = 200;
                    return;
                default:
                    this.f17306l = 0;
                    return;
            }
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
