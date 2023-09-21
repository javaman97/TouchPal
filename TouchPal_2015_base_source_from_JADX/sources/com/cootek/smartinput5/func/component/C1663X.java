package com.cootek.smartinput5.func.component;

import android.content.Context;
import android.database.Cursor;
import android.provider.UserDictionary;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.component.X */
/* compiled from: SysUserDicProvider */
public class C1663X {

    /* renamed from: a */
    private static C1663X f5407a;

    /* renamed from: b */
    private static Context f5408b;

    /* renamed from: a */
    public static C1663X m7611a(Context context) {
        if (f5407a != null) {
            return f5407a;
        }
        f5408b = context;
        f5407a = new C1663X();
        return f5407a;
    }

    /* renamed from: a */
    public List<String> mo6486a() {
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        try {
            cursor = f5408b.getContentResolver().query(UserDictionary.Words.CONTENT_URI, new String[]{"word"}, (String) null, (String[]) null, (String) null);
        } catch (Exception e) {
            e.printStackTrace();
            cursor = null;
        } catch (Error e2) {
            e2.printStackTrace();
            cursor = null;
        }
        if (cursor != null) {
            try {
                if (cursor.getCount() != 0) {
                    cursor.moveToFirst();
                    do {
                        String string = cursor.getString(0);
                        if (!TextUtils.isEmpty(string)) {
                            arrayList.add(string);
                        }
                    } while (cursor.moveToNext());
                }
                try {
                    cursor.close();
                } catch (Exception e3) {
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                try {
                    cursor.close();
                } catch (Exception e5) {
                }
            } catch (Throwable th) {
                try {
                    cursor.close();
                } catch (Exception e6) {
                }
                throw th;
            }
        }
        return arrayList;
    }
}
