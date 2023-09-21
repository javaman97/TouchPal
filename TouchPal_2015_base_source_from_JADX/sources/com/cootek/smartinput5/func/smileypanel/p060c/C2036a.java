package com.cootek.smartinput5.func.smileypanel.p060c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.smileypanel.c.a */
/* compiled from: EmojiArtAdapter */
public class C2036a extends BaseAdapter {

    /* renamed from: a */
    private ArrayList<C2038c> f7065a = new ArrayList<>();

    /* renamed from: b */
    private Context f7066b;

    public C2036a(Context context, ArrayList<C2038c> arrayList) {
        this.f7066b = context;
        this.f7065a = arrayList;
    }

    /* renamed from: a */
    public void mo7390a(ArrayList<C2038c> arrayList) {
        this.f7065a = arrayList;
        notifyDataSetChanged();
    }

    public int getCount() {
        if (this.f7065a == null) {
            return 0;
        }
        return this.f7065a.size();
    }

    public Object getItem(int i) {
        if (this.f7065a == null) {
            return null;
        }
        return this.f7065a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f7065a.get(i).mo7397a(this.f7066b, view);
    }
}
