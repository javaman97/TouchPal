package android.support.p001v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.p001v4.widget.C0559f;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.e */
/* compiled from: CursorAdapter */
public abstract class C0555e extends BaseAdapter implements C0559f.C0560a, Filterable {
    @Deprecated

    /* renamed from: j */
    public static final int f1397j = 1;

    /* renamed from: k */
    public static final int f1398k = 2;

    /* renamed from: a */
    protected boolean f1399a;

    /* renamed from: b */
    protected boolean f1400b;

    /* renamed from: c */
    protected Cursor f1401c;

    /* renamed from: d */
    protected Context f1402d;

    /* renamed from: e */
    protected int f1403e;

    /* renamed from: f */
    protected C0557a f1404f;

    /* renamed from: g */
    protected DataSetObserver f1405g;

    /* renamed from: h */
    protected C0559f f1406h;

    /* renamed from: i */
    protected FilterQueryProvider f1407i;

    /* renamed from: a */
    public abstract View mo1919a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo1683a(View view, Context context, Cursor cursor);

    @Deprecated
    public C0555e(Context context, Cursor cursor) {
        mo1920a(context, cursor, 1);
    }

    public C0555e(Context context, Cursor cursor, boolean z) {
        mo1920a(context, cursor, z ? 1 : 2);
    }

    public C0555e(Context context, Cursor cursor, int i) {
        mo1920a(context, cursor, i);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public void mo1921a(Context context, Cursor cursor, boolean z) {
        mo1920a(context, cursor, z ? 1 : 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1920a(Context context, Cursor cursor, int i) {
        boolean z = true;
        if ((i & 1) == 1) {
            i |= 2;
            this.f1400b = true;
        } else {
            this.f1400b = false;
        }
        if (cursor == null) {
            z = false;
        }
        this.f1401c = cursor;
        this.f1399a = z;
        this.f1402d = context;
        this.f1403e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f1404f = new C0557a();
            this.f1405g = new C0558b();
        } else {
            this.f1404f = null;
            this.f1405g = null;
        }
        if (z) {
            if (this.f1404f != null) {
                cursor.registerContentObserver(this.f1404f);
            }
            if (this.f1405g != null) {
                cursor.registerDataSetObserver(this.f1405g);
            }
        }
    }

    /* renamed from: a */
    public Cursor mo1917a() {
        return this.f1401c;
    }

    public int getCount() {
        if (!this.f1399a || this.f1401c == null) {
            return 0;
        }
        return this.f1401c.getCount();
    }

    public Object getItem(int i) {
        if (!this.f1399a || this.f1401c == null) {
            return null;
        }
        this.f1401c.moveToPosition(i);
        return this.f1401c;
    }

    public long getItemId(int i) {
        if (!this.f1399a || this.f1401c == null || !this.f1401c.moveToPosition(i)) {
            return 0;
        }
        return this.f1401c.getLong(this.f1403e);
    }

    public boolean hasStableIds() {
        return true;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1399a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (!this.f1401c.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        } else {
            if (view == null) {
                view = mo1919a(this.f1402d, this.f1401c, viewGroup);
            }
            mo1683a(view, this.f1402d, this.f1401c);
            return view;
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1399a) {
            return null;
        }
        this.f1401c.moveToPosition(i);
        if (view == null) {
            view = mo1924b(this.f1402d, this.f1401c, viewGroup);
        }
        mo1683a(view, this.f1402d, this.f1401c);
        return view;
    }

    /* renamed from: b */
    public View mo1924b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo1919a(context, cursor, viewGroup);
    }

    /* renamed from: a */
    public void mo1922a(Cursor cursor) {
        Cursor b = mo1686b(cursor);
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: b */
    public Cursor mo1686b(Cursor cursor) {
        if (cursor == this.f1401c) {
            return null;
        }
        Cursor cursor2 = this.f1401c;
        if (cursor2 != null) {
            if (this.f1404f != null) {
                cursor2.unregisterContentObserver(this.f1404f);
            }
            if (this.f1405g != null) {
                cursor2.unregisterDataSetObserver(this.f1405g);
            }
        }
        this.f1401c = cursor;
        if (cursor != null) {
            if (this.f1404f != null) {
                cursor.registerContentObserver(this.f1404f);
            }
            if (this.f1405g != null) {
                cursor.registerDataSetObserver(this.f1405g);
            }
            this.f1403e = cursor.getColumnIndexOrThrow("_id");
            this.f1399a = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.f1403e = -1;
        this.f1399a = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    /* renamed from: c */
    public CharSequence mo1687c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* renamed from: a */
    public Cursor mo1918a(CharSequence charSequence) {
        if (this.f1407i != null) {
            return this.f1407i.runQuery(charSequence);
        }
        return this.f1401c;
    }

    public Filter getFilter() {
        if (this.f1406h == null) {
            this.f1406h = new C0559f(this);
        }
        return this.f1406h;
    }

    /* renamed from: b */
    public FilterQueryProvider mo1925b() {
        return this.f1407i;
    }

    /* renamed from: a */
    public void mo1923a(FilterQueryProvider filterQueryProvider) {
        this.f1407i = filterQueryProvider;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1926c() {
        if (this.f1400b && this.f1401c != null && !this.f1401c.isClosed()) {
            this.f1399a = this.f1401c.requery();
        }
    }

    /* renamed from: android.support.v4.widget.e$a */
    /* compiled from: CursorAdapter */
    private class C0557a extends ContentObserver {
        public C0557a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C0555e.this.mo1926c();
        }
    }

    /* renamed from: android.support.v4.widget.e$b */
    /* compiled from: CursorAdapter */
    private class C0558b extends DataSetObserver {
        private C0558b() {
        }

        public void onChanged() {
            C0555e.this.f1399a = true;
            C0555e.this.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C0555e.this.f1399a = false;
            C0555e.this.notifyDataSetInvalidated();
        }
    }
}
