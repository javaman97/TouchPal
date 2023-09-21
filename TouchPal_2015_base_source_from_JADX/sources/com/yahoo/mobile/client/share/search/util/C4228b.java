package com.yahoo.mobile.client.share.search.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.Toast;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;

/* renamed from: com.yahoo.mobile.client.share.search.util.b */
public final class C4228b {

    /* renamed from: a */
    private static AlertDialog f17322a = null;

    /* renamed from: a */
    public static void m17752a(Context context) {
        if (context != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(context.getString(C4073a.C4086m.yssdk_no_internet)).setTitle(context.getString(C4073a.C4086m.yssdk_app_title)).setCancelable(false).setPositiveButton(context.getString(C4073a.C4086m.yssdk_dismiss_button), new DialogInterface.OnClickListener() {
                /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
                    return;
                 */
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.content.DialogInterface r2, int r3) {
                    /*
                        r1 = this;
                        if (r2 == 0) goto L_0x0005
                        r2.dismiss()     // Catch:{ IllegalArgumentException -> 0x0008, Exception -> 0x000a, all -> 0x0006 }
                    L_0x0005:
                        return
                    L_0x0006:
                        r0 = move-exception
                        throw r0
                    L_0x0008:
                        r0 = move-exception
                        goto L_0x0005
                    L_0x000a:
                        r0 = move-exception
                        goto L_0x0005
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.yahoo.mobile.client.share.search.util.C4228b.C42291.onClick(android.content.DialogInterface, int):void");
                }
            });
            m17751a(builder);
        }
    }

    /* renamed from: a */
    private static void m17751a(AlertDialog.Builder builder) {
        try {
            if (f17322a != null && f17322a.isShowing()) {
                f17322a.dismiss();
            }
        } catch (IllegalArgumentException e) {
        } catch (Exception e2) {
        } finally {
            f17322a = null;
        }
        AlertDialog create = builder.create();
        f17322a = create;
        create.show();
    }

    /* renamed from: a */
    public static void m17754a(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        if (context != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(str2).setTitle(str).setCancelable(false).setPositiveButton(context.getString(C4073a.C4086m.yssdk_retry_button), onClickListener).setNegativeButton(context.getString(C4073a.C4086m.yssdk_cancel), onClickListener);
            m17751a(builder);
        }
    }

    /* renamed from: b */
    public static void m17756b(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        if (context != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(str2).setTitle(str).setCancelable(false).setPositiveButton(context.getString(C4073a.C4086m.yssdk_yes), onClickListener).setNegativeButton(context.getString(C4073a.C4086m.yssdk_no), onClickListener);
            builder.setOnKeyListener(new DialogInterface.OnKeyListener() {
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i != 4) {
                        return false;
                    }
                    dialogInterface.dismiss();
                    return true;
                }
            });
            m17751a(builder);
        }
    }

    /* renamed from: a */
    public static void m17753a(final Context context, final SearchStatusData searchStatusData) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                if (SearchStatusData.this.getValidStatus() == SearchStatusData.SearchStatusEnum.INVALID) {
                    Toast.makeText(context, context.getResources().getString(C4073a.C4086m.yssdk_invalid_yhs_key), 0).show();
                }
            }
        });
    }

    /* renamed from: b */
    public static void m17755b(final Context context) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                Toast.makeText(context, context.getResources().getString(C4073a.C4086m.yssdk_development_mode), 0).show();
            }
        });
    }
}
