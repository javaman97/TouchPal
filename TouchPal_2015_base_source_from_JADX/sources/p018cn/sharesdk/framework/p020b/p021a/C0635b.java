package p018cn.sharesdk.framework.p020b.p021a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.b.a.b */
public class C0635b {

    /* renamed from: c */
    private static C0635b f1518c = null;

    /* renamed from: a */
    private Context f1519a;

    /* renamed from: b */
    private C0634a f1520b = new C0634a(this.f1519a);

    private C0635b(Context context) {
        this.f1519a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized C0635b m3617a(Context context) {
        C0635b bVar;
        synchronized (C0635b.class) {
            if (f1518c == null) {
                f1518c = new C0635b(context);
            }
            bVar = f1518c;
        }
        return bVar;
    }

    /* renamed from: a */
    public int mo2287a(String str) {
        Cursor cursor = null;
        int i = 0;
        try {
            cursor = this.f1520b.getWritableDatabase().rawQuery("select count(*) from " + str, (String[]) null);
            if (cursor.moveToNext()) {
                i = cursor.getInt(0);
            }
        } catch (Exception e) {
            C0666e.m3838b(e);
        } finally {
            cursor.close();
        }
        return i;
    }

    /* renamed from: a */
    public int mo2288a(String str, String str2, String[] strArr) {
        Exception e;
        int i;
        try {
            i = this.f1520b.getWritableDatabase().delete(str, str2, strArr);
            try {
                C0666e.m3834a("Deleted %d rows from table: %s", Integer.valueOf(i), str);
            } catch (Exception e2) {
                e = e2;
                C0666e.m3836a(e, "when delete database occur error table:%s,", str);
                return i;
            }
        } catch (Exception e3) {
            e = e3;
            i = 0;
            C0666e.m3836a(e, "when delete database occur error table:%s,", str);
            return i;
        }
        return i;
    }

    /* renamed from: a */
    public long mo2289a(String str, ContentValues contentValues) {
        try {
            return this.f1520b.getWritableDatabase().replace(str, (String) null, contentValues);
        } catch (Exception e) {
            C0666e.m3836a(e, "when insert database occur error table:%s,", str);
            return -1;
        }
    }

    /* renamed from: a */
    public Cursor mo2290a(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        SQLiteDatabase writableDatabase = this.f1520b.getWritableDatabase();
        C0666e.m3834a("Query table: %s", str);
        try {
            return writableDatabase.query(str, strArr, str2, strArr2, (String) null, (String) null, str3);
        } catch (Exception e) {
            C0666e.m3836a(e, "when query database occur error table:%s,", str);
            return null;
        }
    }
}
