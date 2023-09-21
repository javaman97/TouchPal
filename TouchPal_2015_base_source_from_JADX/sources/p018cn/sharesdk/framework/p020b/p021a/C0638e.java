package p018cn.sharesdk.framework.p020b.p021a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.appsflyer.MonitorMessages;
import com.cootek.p042a.p043a.C0911j;
import java.util.ArrayList;

/* renamed from: cn.sharesdk.framework.b.a.e */
public class C0638e {

    /* renamed from: a */
    public static int f1526a = 0;

    /* renamed from: b */
    public static int f1527b = 1;

    /* renamed from: c */
    public static int f1528c = 2;

    /* renamed from: a */
    public static synchronized long m3635a(Context context, String str, long j) {
        long j2;
        synchronized (C0638e.class) {
            if (str != null) {
                if (str.trim() != "") {
                    C0635b a = C0635b.m3617a(context);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("post_time", Long.valueOf(j));
                    contentValues.put("message_data", str.toString());
                    j2 = a.mo2289a(MonitorMessages.MESSAGE, contentValues);
                }
            }
            j2 = -1;
        }
        return j2;
    }

    /* renamed from: a */
    public static synchronized long m3636a(Context context, ArrayList<String> arrayList) {
        long a;
        synchronized (C0638e.class) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append("'");
                sb.append(arrayList.get(i));
                sb.append("'");
                sb.append(",");
            }
            a = (long) C0635b.m3617a(context).mo2288a(MonitorMessages.MESSAGE, "_id in ( " + sb.toString().substring(0, sb.length() - 1) + " )", (String[]) null);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized ArrayList<C0637d> m3637a(Context context) {
        ArrayList<C0637d> a;
        synchronized (C0638e.class) {
            if (C0635b.m3617a(context).mo2287a(MonitorMessages.MESSAGE) < 10) {
                a = m3638a(context, "post_time < ?", new String[]{String.valueOf((System.currentTimeMillis() - C0636c.m3622a(context).mo2291a()) - 86400000)});
            } else {
                a = m3638a(context, (String) null, (String[]) null);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static synchronized ArrayList<C0637d> m3638a(Context context, String str, String[] strArr) {
        ArrayList<C0637d> arrayList;
        synchronized (C0638e.class) {
            arrayList = new ArrayList<>();
            C0637d dVar = new C0637d();
            StringBuilder sb = new StringBuilder();
            Cursor a = C0635b.m3617a(context).mo2290a(MonitorMessages.MESSAGE, new String[]{"_id", "post_time", "message_data"}, str, strArr, (String) null);
            StringBuilder sb2 = sb;
            C0637d dVar2 = dVar;
            while (a != null && a.moveToNext()) {
                dVar2.f1525b.add(a.getString(0));
                if (dVar2.f1525b.size() == 10) {
                    sb2.append(a.getString(2));
                    dVar2.f1524a = sb2.toString();
                    arrayList.add(dVar2);
                    dVar2 = new C0637d();
                    sb2 = new StringBuilder();
                } else {
                    sb2.append(a.getString(2) + C0911j.f2473c);
                }
            }
            a.close();
            if (dVar2.f1525b.size() != 0) {
                dVar2.f1524a = sb2.toString().substring(0, sb2.length() - 1);
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static synchronized ArrayList<C0637d> m3639b(Context context) {
        ArrayList<C0637d> arrayList;
        synchronized (C0638e.class) {
            arrayList = C0635b.m3617a(context).mo2287a(MonitorMessages.MESSAGE) < 2 ? new ArrayList<>() : m3638a(context, (String) null, (String[]) null);
        }
        return arrayList;
    }
}
