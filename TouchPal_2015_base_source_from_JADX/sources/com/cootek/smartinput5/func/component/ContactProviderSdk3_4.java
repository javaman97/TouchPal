package com.cootek.smartinput5.func.component;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.Contacts;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class ContactProviderSdk3_4 extends ContactProvider {
    public List<String> getContactNames(Context context, String str) {
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        try {
            cursor = context.getContentResolver().query(Contacts.People.CONTENT_URI, new String[]{"name", "primary_phone"}, (String) null, (String[]) null, (String) null);
        } catch (Exception e) {
            e.printStackTrace();
            cursor = null;
        }
        if (cursor != null) {
            try {
                if (cursor.getCount() != 0) {
                    cursor.moveToFirst();
                    do {
                        String string = cursor.getString(0);
                        if (!TextUtils.isEmpty(string) && cursor.getInt(1) != 0) {
                            arrayList.add(string);
                        }
                    } while (cursor.moveToNext());
                }
            } finally {
                try {
                    cursor.close();
                } catch (Exception e2) {
                }
            }
        }
        return arrayList;
    }

    public Cursor getPhoneNumberCursor(ContentResolver contentResolver, long j) {
        try {
            return contentResolver.query(Contacts.People.CONTENT_URI, new String[]{"_id", "number", "type"}, "People._id='" + j + "'", (String[]) null, (String) null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Cursor getContactNameCursor(ContentResolver contentResolver, String str) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append("name");
            sb.append(" like '%");
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                sb.append("%");
            }
            sb.append("'");
        }
        try {
            return contentResolver.query(Contacts.People.CONTENT_URI, new String[]{"_id", "name", "primary_phone"}, sb.toString(), (String[]) null, (String) null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPhoneTypeName(Context context, Cursor cursor) {
        return null;
    }
}
