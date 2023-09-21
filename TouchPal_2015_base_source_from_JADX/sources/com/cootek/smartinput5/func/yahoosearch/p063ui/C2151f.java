package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ProgressBar;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.f */
/* compiled from: SearchImageAdapter */
public class C2151f extends BaseAdapter {

    /* renamed from: a */
    private static final int f9135a = 10;

    /* renamed from: b */
    private Context f9136b;

    /* renamed from: c */
    private ArrayList<PhotoData> f9137c;

    /* renamed from: d */
    private LinkedList<Integer> f9138d = new LinkedList<>();

    /* renamed from: e */
    private SparseArray<View> f9139e = new SparseArray<>();

    public C2151f(Context context, ArrayList<PhotoData> arrayList) {
        this.f9136b = context;
        this.f9137c = arrayList;
    }

    public int getCount() {
        if (this.f9137c == null) {
            return 0;
        }
        return this.f9137c.size();
    }

    public Object getItem(int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return this.f9137c.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int intValue;
        if (i < 0 || i >= getCount()) {
            return null;
        }
        if (view == null && this.f9139e.get(i) == null) {
            View inflate = ((LayoutInflater) this.f9136b.getSystemService("layout_inflater")).inflate(R.layout.search_image, (ViewGroup) null);
            inflate.setLayoutParams(new Gallery.LayoutParams(-1, -1));
            ((SearchImageView) inflate.findViewById(R.id.search_picture_image)).mo7564a(this.f9137c.get(i).getThumbnailUrl(), new C2152g(this, (ProgressBar) inflate.findViewById(R.id.image_progress)));
            this.f9138d.add(Integer.valueOf(i));
            this.f9139e.put(i, inflate);
            if (this.f9138d.size() <= 10 || (intValue = this.f9138d.removeFirst().intValue()) < 0) {
                return inflate;
            }
            this.f9139e.remove(intValue);
            return inflate;
        } else if (view != null || this.f9139e.get(i) == null) {
            return view;
        } else {
            return this.f9139e.get(i);
        }
    }
}
