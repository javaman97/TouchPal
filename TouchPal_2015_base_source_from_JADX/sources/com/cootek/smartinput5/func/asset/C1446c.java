package com.cootek.smartinput5.func.asset;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.asset.c */
/* compiled from: AssetsUtils */
public class C1446c {
    /* renamed from: a */
    public static void m6745a(Activity activity) {
        m6746a(activity, new C1447d(activity), new C1448e(activity));
    }

    /* renamed from: a */
    public static void m6746a(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.extract_failed_title).setMessage(R.string.extract_failed_msg).setPositiveButton(17039370, onClickListener).setOnCancelListener(onCancelListener);
        builder.create().show();
    }
}
