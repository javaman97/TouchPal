package android.support.p001v4.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.p001v4.content.C0210l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: android.support.v4.content.g */
/* compiled from: CursorLoader */
public class C0199g extends C0191a<Cursor> {

    /* renamed from: h */
    final C0210l<Cursor>.a f503h = new C0210l.C0211a();

    /* renamed from: i */
    Uri f504i;

    /* renamed from: j */
    String[] f505j;

    /* renamed from: k */
    String f506k;

    /* renamed from: l */
    String[] f507l;

    /* renamed from: m */
    String f508m;

    /* renamed from: n */
    Cursor f509n;

    /* renamed from: g */
    public Cursor mo634d() {
        Cursor query = mo680p().getContentResolver().query(this.f504i, this.f505j, this.f506k, this.f507l, this.f508m);
        if (query != null) {
            query.getCount();
            query.registerContentObserver(this.f503h);
        }
        return query;
    }

    /* renamed from: a */
    public void mo647b(Cursor cursor) {
        if (!mo684t()) {
            Cursor cursor2 = this.f509n;
            this.f509n = cursor;
            if (mo682r()) {
                super.mo647b(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public C0199g(Context context) {
        super(context);
    }

    public C0199g(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f504i = uri;
        this.f505j = strArr;
        this.f506k = str;
        this.f507l = strArr2;
        this.f508m = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo651h() {
        if (this.f509n != null) {
            mo647b(this.f509n);
        }
        if (mo673A() || this.f509n == null) {
            mo687v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo652i() {
        mo632b();
    }

    /* renamed from: b */
    public void mo629a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo653j() {
        super.mo653j();
        mo652i();
        if (this.f509n != null && !this.f509n.isClosed()) {
            this.f509n.close();
        }
        this.f509n = null;
    }

    /* renamed from: k */
    public Uri mo654k() {
        return this.f504i;
    }

    /* renamed from: a */
    public void mo643a(Uri uri) {
        this.f504i = uri;
    }

    /* renamed from: l */
    public String[] mo655l() {
        return this.f505j;
    }

    /* renamed from: a */
    public void mo645a(String[] strArr) {
        this.f505j = strArr;
    }

    /* renamed from: m */
    public String mo656m() {
        return this.f506k;
    }

    /* renamed from: a */
    public void mo644a(String str) {
        this.f506k = str;
    }

    /* renamed from: n */
    public String[] mo657n() {
        return this.f507l;
    }

    /* renamed from: b */
    public void mo649b(String[] strArr) {
        this.f507l = strArr;
    }

    /* renamed from: o */
    public String mo658o() {
        return this.f508m;
    }

    /* renamed from: b */
    public void mo648b(String str) {
        this.f508m = str;
    }

    /* renamed from: a */
    public void mo630a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo630a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f504i);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f505j));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f506k);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f507l));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f508m);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f509n);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f537u);
    }
}
