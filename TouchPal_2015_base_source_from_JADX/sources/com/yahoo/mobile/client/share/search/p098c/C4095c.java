package com.yahoo.mobile.client.share.search.p098c;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yahoo.mobile.client.share.search.c.c */
public final class C4095c extends SQLiteOpenHelper {

    /* renamed from: a */
    private static final int[] f16585a = {2, 3};

    /* renamed from: b */
    private final Context f16586b;

    public C4095c(Context context) {
        super(context, "ranking", (SQLiteDatabase.CursorFactory) null, 3);
        this.f16586b = context;
    }

    /* renamed from: a */
    public final List<C4093a> mo15073a(String str, long j) {
        if (str == null) {
            return new ArrayList();
        }
        return m17342a("type = ? AND last_opened > ?", new String[]{str, String.valueOf(j)}, "(CASE WHEN (strftime('%s', 'now') - last_opened/1000) < 259200 THEN 0  WHEN (strftime('%s', 'now') - last_opened/1000) < 604800 THEN 1  WHEN (strftime('%s', 'now') - last_opened/1000) < 1209600 THEN 2  WHEN (strftime('%s', 'now') - last_opened/1000) < 2592000 THEN 3  ELSE 4 END), counter DESC", 1000);
    }

    /* renamed from: a */
    public final List<C4093a> mo15072a(int i, ArrayList<String> arrayList) {
        String str;
        String[] strArr = null;
        if (arrayList != null) {
            StringBuilder sb = new StringBuilder("type");
            sb.append(" in (");
            int i2 = 0;
            while (i2 < arrayList.size()) {
                sb.append(i2 == 0 ? C2261Q.f9807m : ",?");
                i2++;
            }
            sb.append(")");
            str = sb.toString();
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        } else {
            str = null;
        }
        return m17342a(str, strArr, "last_opened DESC", i);
    }

    /* renamed from: a */
    public final List<C4093a> mo15074a(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (String str2 : list) {
            List<C4093a> a = m17342a("item_id = ? AND type = ?", new String[]{str2, str}, (String) null, 0);
            C4093a aVar = a.size() == 0 ? null : a.get(0);
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo15076a(C4093a aVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (writableDatabase != null) {
            try {
                m17344a(writableDatabase, aVar);
            } finally {
                writableDatabase.close();
            }
        }
    }

    /* renamed from: a */
    private static void m17344a(SQLiteDatabase sQLiteDatabase, C4093a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Ranking object cannot be null.");
        }
        ContentValues contentValues = new ContentValues(6);
        contentValues.put("item_id", aVar.f16579b);
        contentValues.put("type", aVar.f16580c);
        contentValues.put("counter", Long.valueOf(aVar.f16581d));
        contentValues.put("last_opened", Long.valueOf(aVar.f16582e));
        if (aVar.f16578a != -1) {
            contentValues.put("_id", Long.valueOf(aVar.f16578a));
        }
        aVar.f16578a = sQLiteDatabase.insertWithOnConflict("ranking", (String) null, contentValues, 5);
    }

    /* renamed from: b */
    public final synchronized void mo15077b(C4093a aVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (writableDatabase != null) {
            try {
                m17347b(writableDatabase, aVar);
            } finally {
                writableDatabase.close();
            }
        }
    }

    /* renamed from: b */
    private static void m17347b(SQLiteDatabase sQLiteDatabase, C4093a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Ranking object cannot be null.");
        }
        sQLiteDatabase.delete("ranking", "item_id = ? AND type = ?", new String[]{aVar.f16579b, aVar.f16580c});
    }

    /* renamed from: a */
    private synchronized List<C4093a> m17342a(String str, String[] strArr, String str2, int i) {
        List<C4093a> a;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (writableDatabase == null) {
            a = Collections.emptyList();
        } else {
            try {
                a = m17341a(getWritableDatabase(), str, strArr, str2, i);
            } finally {
                writableDatabase.close();
            }
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.yahoo.mobile.client.share.search.p098c.C4093a> m17341a(android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14, int r15) {
        /*
            r8 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r1 = "ranking"
            r2 = 0
            r5 = 0
            r6 = 0
            r0 = r11
            r3 = r12
            r4 = r13
            r7 = r14
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLException -> 0x0071, all -> 0x007a }
            if (r0 == 0) goto L_0x001b
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            if (r1 != 0) goto L_0x0022
        L_0x001b:
            if (r0 == 0) goto L_0x0020
            r0.close()
        L_0x0020:
            r0 = r10
        L_0x0021:
            return r0
        L_0x0022:
            java.lang.String r1 = "_id"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            long r2 = r0.getLong(r1)     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            java.lang.String r1 = "item_id"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            java.lang.String r4 = r0.getString(r1)     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            java.lang.String r1 = "type"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            java.lang.String r5 = r0.getString(r1)     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            java.lang.String r1 = "counter"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            long r6 = r0.getLong(r1)     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            java.lang.String r1 = "last_opened"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            long r8 = r0.getLong(r1)     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            com.yahoo.mobile.client.share.search.c.a r1 = new com.yahoo.mobile.client.share.search.c.a     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            r1.<init>(r2, r4, r5, r6, r8)     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            r10.add(r1)     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            if (r15 <= 0) goto L_0x0064
            int r1 = r10.size()     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            if (r1 >= r15) goto L_0x006a
        L_0x0064:
            boolean r1 = r0.moveToNext()     // Catch:{ SQLException -> 0x0085, all -> 0x0081 }
            if (r1 != 0) goto L_0x0022
        L_0x006a:
            if (r0 == 0) goto L_0x006f
            r0.close()
        L_0x006f:
            r0 = r10
            goto L_0x0021
        L_0x0071:
            r0 = move-exception
            r0 = r8
        L_0x0073:
            if (r0 == 0) goto L_0x0078
            r0.close()
        L_0x0078:
            r0 = r10
            goto L_0x0021
        L_0x007a:
            r0 = move-exception
        L_0x007b:
            if (r8 == 0) goto L_0x0080
            r8.close()
        L_0x0080:
            throw r0
        L_0x0081:
            r1 = move-exception
            r8 = r0
            r0 = r1
            goto L_0x007b
        L_0x0085:
            r1 = move-exception
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yahoo.mobile.client.share.search.p098c.C4095c.m17341a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[], java.lang.String, int):java.util.List");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        m17345a(sQLiteDatabase, m17346b());
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (Arrays.binarySearch(f16585a, i) < 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("DROP TABLE IF EXISTS ranking");
            arrayList.addAll(m17346b());
            m17345a(sQLiteDatabase, (List<String>) arrayList);
            return;
        }
        switch (i) {
            case 2:
                m17343a(sQLiteDatabase);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m17343a(SQLiteDatabase sQLiteDatabase) {
        PackageManager packageManager = this.f16586b.getPackageManager();
        for (C4093a next : m17341a(sQLiteDatabase, "type = ?", new String[]{SearchActivity.SUGGEST_APPS}, (String) null, 0)) {
            try {
                next.f16579b = packageManager.getLaunchIntentForPackage(next.f16579b).getComponent().flattenToString();
                m17344a(sQLiteDatabase, next);
            } catch (Exception e) {
                m17347b(sQLiteDatabase, next);
            }
        }
    }

    /* renamed from: b */
    private static List<String> m17346b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("create table ranking(_id integer primary key autoincrement, item_id text not null, type text not null, counter integer not null, last_opened integer not null )");
        arrayList.add("CREATE INDEX IF NOT EXISTS item_id_index ON ranking (item_id)");
        arrayList.add("CREATE INDEX IF NOT EXISTS type_index ON ranking (type)");
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo15075a() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.execSQL("DELETE FROM ranking");
        writableDatabase.execSQL("VACUUM");
        writableDatabase.close();
    }

    /* renamed from: a */
    private static void m17345a(SQLiteDatabase sQLiteDatabase, List<String> list) {
        sQLiteDatabase.beginTransaction();
        for (String execSQL : list) {
            sQLiteDatabase.execSQL(execSQL);
        }
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
    }
}
