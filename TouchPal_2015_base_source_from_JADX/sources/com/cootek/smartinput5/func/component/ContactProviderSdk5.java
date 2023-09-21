package com.cootek.smartinput5.func.component;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class ContactProviderSdk5 extends ContactProvider {
    public List<String> getContactNames(Context context, String str) {
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            return arrayList;
        }
        try {
            cursor = context.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"display_name", "has_phone_number"}, (String) null, (String[]) null, (String) null);
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
                try {
                    cursor.close();
                } catch (Exception e2) {
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                try {
                    cursor.close();
                } catch (Exception e4) {
                }
            } catch (Throwable th) {
                try {
                    cursor.close();
                } catch (Exception e5) {
                }
                throw th;
            }
        }
        return arrayList;
    }

    public Cursor getPhoneNumberCursor(ContentResolver contentResolver, long j) {
        try {
            return contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"contact_id", "data1", "data2", "_id", "is_super_primary"}, "contact_id='" + j + "'", (String[]) null, (String) null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Cursor getContactNameCursor(ContentResolver contentResolver, String str) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append("display_name");
            sb.append(" like '%");
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                sb.append("%");
            }
            sb.append("'");
        }
        try {
            return contentResolver.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "display_name", "has_phone_number"}, sb.toString(), (String[]) null, (String) null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPhoneTypeName(Context context, Cursor cursor) {
        return context.getResources().getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(cursor.getInt(2)));
    }
}
