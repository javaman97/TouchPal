package com.cootek.smartinput5.func.component;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import java.util.List;

public abstract class ContactProvider {
    private static ContactProvider sContactProvider;

    public abstract Cursor getContactNameCursor(ContentResolver contentResolver, String str);

    public abstract List<String> getContactNames(Context context, String str);

    public abstract Cursor getPhoneNumberCursor(ContentResolver contentResolver, long j);

    public abstract String getPhoneTypeName(Context context, Cursor cursor);

    public static ContactProvider createContactProvider() {
        String str;
        if (sContactProvider != null) {
            return sContactProvider;
        }
        if (Integer.parseInt(Build.VERSION.SDK) < 5) {
            str = "com.cootek.smartinput5.func.component.ContactProviderSdk3_4";
        } else {
            str = "com.cootek.smartinput5.func.component.ContactProviderSdk5";
        }
        try {
            ContactProvider contactProvider = (ContactProvider) Class.forName(str).asSubclass(ContactProvider.class).newInstance();
            sContactProvider = contactProvider;
            return contactProvider;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
