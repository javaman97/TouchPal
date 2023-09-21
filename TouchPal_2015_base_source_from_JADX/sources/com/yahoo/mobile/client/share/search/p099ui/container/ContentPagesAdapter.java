package com.yahoo.mobile.client.share.search.p099ui.container;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.app.C0034C;
import android.support.p001v4.app.C0173s;
import android.support.p001v4.app.Fragment;
import android.view.ViewGroup;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.C4207b;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.SearchResultFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yahoo.mobile.client.share.search.ui.container.ContentPagesAdapter */
public class ContentPagesAdapter extends C0034C {

    /* renamed from: a */
    protected List<SearchResultFragment> f17082a = new ArrayList();

    /* renamed from: b */
    private AdapterStateListener f17083b;

    /* renamed from: c */
    private Context f17084c;

    /* renamed from: com.yahoo.mobile.client.share.search.ui.container.ContentPagesAdapter$AdapterStateListener */
    public interface AdapterStateListener {
        void onStateRestored(ContentPagesAdapter contentPagesAdapter);
    }

    public ContentPagesAdapter(Context context, C0173s sVar, List<Bundle> list) {
        super(sVar);
        this.f17084c = context;
        this.f17082a = C4207b.m17678a(context, list);
    }

    public void setStateListener(AdapterStateListener adapterStateListener) {
        this.f17083b = adapterStateListener;
    }

    public int getItemPosition(Object obj) {
        return this.f17082a.indexOf(obj);
    }

    public CharSequence getPageTitle(int i) {
        return this.f17082a.get(i).getLabel(this.f17084c);
    }

    public Fragment getItem(int i) {
        if (i < this.f17082a.size()) {
            return this.f17082a.get(i);
        }
        return null;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        SearchResultFragment searchResultFragment = (SearchResultFragment) instantiateItem;
        while (this.f17082a.size() <= i) {
            this.f17082a.add((Object) null);
        }
        this.f17082a.set(i, searchResultFragment);
        if (this.f17082a.indexOf((Object) null) == -1 && this.f17083b != null) {
            this.f17083b.onStateRestored(this);
        }
        return instantiateItem;
    }

    public Parcelable saveState() {
        return super.saveState();
    }

    public int getCount() {
        return this.f17082a.size();
    }

    public boolean addFragment(SearchResultFragment searchResultFragment) {
        return this.f17082a.add(searchResultFragment);
    }

    public boolean removeFragment(SearchResultFragment searchResultFragment) {
        return this.f17082a.remove(searchResultFragment);
    }

    public void setFragmentList(ArrayList<SearchResultFragment> arrayList) {
        this.f17082a.clear();
        this.f17082a.addAll(arrayList);
    }

    public List<SearchResultFragment> getFragmentList() {
        return this.f17082a;
    }

    public SearchResultFragment getFragment(String str) {
        for (int i = 0; i < this.f17082a.size(); i++) {
            CharSequence pageTitle = getPageTitle(i);
            if (pageTitle != null && pageTitle.toString().equalsIgnoreCase(str)) {
                return this.f17082a.get(i);
            }
        }
        return null;
    }
}
