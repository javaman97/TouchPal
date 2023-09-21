package com.cootek.nativejsapis;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;

public class ContactProvider {
    public static boolean isContact(Context context, String str) {
        Cursor cursor;
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"_id"}, "data1 = ?", new String[]{str}, (String) null);
        } catch (SecurityException e) {
            e.printStackTrace();
            cursor = null;
        }
        if (cursor == null) {
            return false;
        }
        cursor.close();
        return true;
    }
}
