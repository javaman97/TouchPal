package android.support.p001v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: android.support.v4.widget.A */
/* compiled from: SimpleCursorAdapter */
public class C0513A extends C0582q {

    /* renamed from: l */
    protected int[] f1141l;

    /* renamed from: m */
    protected int[] f1142m;

    /* renamed from: n */
    String[] f1143n;

    /* renamed from: o */
    private int f1144o = -1;

    /* renamed from: p */
    private C0514a f1145p;

    /* renamed from: q */
    private C0515b f1146q;

    /* renamed from: android.support.v4.widget.A$a */
    /* compiled from: SimpleCursorAdapter */
    public interface C0514a {
        /* renamed from: a */
        CharSequence mo1692a(Cursor cursor);
    }

    /* renamed from: android.support.v4.widget.A$b */
    /* compiled from: SimpleCursorAdapter */
    public interface C0515b {
        /* renamed from: a */
        boolean mo1693a(View view, Cursor cursor, int i);
    }

    @Deprecated
    public C0513A(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.f1142m = iArr;
        this.f1143n = strArr;
        m2894a(strArr);
    }

    public C0513A(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.f1142m = iArr;
        this.f1143n = strArr;
        m2894a(strArr);
    }

    /* renamed from: a */
    public void mo1683a(View view, Context context, Cursor cursor) {
        boolean z;
        C0515b bVar = this.f1146q;
        int length = this.f1142m.length;
        int[] iArr = this.f1141l;
        int[] iArr2 = this.f1142m;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr2[i]);
            if (findViewById != null) {
                if (bVar != null) {
                    z = bVar.mo1693a(findViewById, cursor, iArr[i]);
                } else {
                    z = false;
                }
                if (z) {
                    continue;
                } else {
                    String string = cursor.getString(iArr[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        mo1685a((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        mo1684a((ImageView) findViewById, string);
                    } else {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a " + " view that can be bounds by this SimpleCursorAdapter");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public C0515b mo1689d() {
        return this.f1146q;
    }

    /* renamed from: a */
    public void mo1682a(C0515b bVar) {
        this.f1146q = bVar;
    }

    /* renamed from: a */
    public void mo1684a(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    /* renamed from: a */
    public void mo1685a(TextView textView, String str) {
        textView.setText(str);
    }

    /* renamed from: e */
    public int mo1690e() {
        return this.f1144o;
    }

    /* renamed from: c */
    public void mo1688c(int i) {
        this.f1144o = i;
    }

    /* renamed from: f */
    public C0514a mo1691f() {
        return this.f1145p;
    }

    /* renamed from: a */
    public void mo1681a(C0514a aVar) {
        this.f1145p = aVar;
    }

    /* renamed from: c */
    public CharSequence mo1687c(Cursor cursor) {
        if (this.f1145p != null) {
            return this.f1145p.mo1692a(cursor);
        }
        if (this.f1144o > -1) {
            return cursor.getString(this.f1144o);
        }
        return super.mo1687c(cursor);
    }

    /* renamed from: a */
    private void m2894a(String[] strArr) {
        if (this.f1401c != null) {
            int length = strArr.length;
            if (this.f1141l == null || this.f1141l.length != length) {
                this.f1141l = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.f1141l[i] = this.f1401c.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.f1141l = null;
    }

    /* renamed from: b */
    public Cursor mo1686b(Cursor cursor) {
        Cursor b = super.mo1686b(cursor);
        m2894a(this.f1143n);
        return b;
    }

    /* renamed from: a */
    public void mo1680a(Cursor cursor, String[] strArr, int[] iArr) {
        this.f1143n = strArr;
        this.f1142m = iArr;
        super.mo1922a(cursor);
        m2894a(this.f1143n);
    }
}
