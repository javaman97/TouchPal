package com.facebook.ads.internal.p077h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/* renamed from: com.facebook.ads.internal.h.n */
public class C3447n {
    /* renamed from: a */
    static Bitmap m15088a(Context context, String str) {
        return BitmapFactory.decodeFile(new File(context.getCacheDir(), String.format("%d.png", new Object[]{Integer.valueOf(str.hashCode())})).getAbsolutePath());
    }

    /* renamed from: a */
    static void m15089a(Context context, String str, Bitmap bitmap) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getCacheDir(), String.format("%d.png", new Object[]{Integer.valueOf(str.hashCode())})));
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public static void m15090a(Context context, List<String> list, C3446m mVar) {
        int[] iArr = {list.size()};
        if (iArr[0] != 0) {
            for (String str : list) {
                new C3445l(context).mo10770a((C3446m) new C3448o(iArr, mVar)).execute(new String[]{str});
            }
        } else if (mVar != null) {
            mVar.mo10551a();
        }
    }
}
