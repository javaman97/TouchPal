package android.support.p001v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.q */
/* compiled from: ResourceCursorAdapter */
public abstract class C0582q extends C0555e {

    /* renamed from: l */
    private int f1429l;

    /* renamed from: m */
    private int f1430m;

    /* renamed from: n */
    private LayoutInflater f1431n;

    @Deprecated
    public C0582q(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.f1430m = i;
        this.f1429l = i;
        this.f1431n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public C0582q(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f1430m = i;
        this.f1429l = i;
        this.f1431n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public C0582q(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f1430m = i;
        this.f1429l = i;
        this.f1431n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo1919a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1431n.inflate(this.f1429l, viewGroup, false);
    }

    /* renamed from: b */
    public View mo1924b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1431n.inflate(this.f1430m, viewGroup, false);
    }

    /* renamed from: a */
    public void mo1973a(int i) {
        this.f1429l = i;
    }

    /* renamed from: b */
    public void mo1974b(int i) {
        this.f1430m = i;
    }
}
