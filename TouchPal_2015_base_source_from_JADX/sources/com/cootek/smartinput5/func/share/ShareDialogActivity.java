package com.cootek.smartinput5.func.share;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1623bu;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

public class ShareDialogActivity extends C1623bu {

    /* renamed from: a */
    public static final String f6743a = "share_dialog_title";

    /* renamed from: b */
    public static final String f6744b = "share_dialog_subject";

    /* renamed from: c */
    public static final String f6745c = "share_dialog_content";

    /* renamed from: d */
    public static final String f6746d = "share_dialog_uri";

    /* renamed from: e */
    public static final String f6747e = "share_dialog_url";

    /* renamed from: f */
    public static final String f6748f = "share_img_url";

    /* renamed from: g */
    private static final int f6749g = 3;

    /* renamed from: h */
    private static final double f6750h = 0.15d;

    /* renamed from: i */
    private C1602bh f6751i;

    /* renamed from: j */
    private LinearLayout f6752j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4219a(Bundle bundle) {
        requestWindowFeature(1);
        C1368X.m6317b((Context) this);
        setContentView(R.layout.share_dialog);
        this.f6751i = C1368X.m6320c().mo5841n();
        this.f6752j = (LinearLayout) findViewById(R.id.share_dialog_root);
        this.f6752j.setBackgroundDrawable(this.f6751i.mo6249a((int) R.drawable.bg_share_dialog));
        Bundle extras = getIntent().getExtras();
        String string = extras.getString(f6747e);
        String string2 = extras.getString(f6748f);
        mo7265a(this, extras.getString(f6743a), extras.getString(f6744b), extras.getString(f6745c), (Uri) extras.get(f6746d), string, string2);
    }

    /* renamed from: a */
    public void mo7265a(Context context, String str, String str2, String str3, Uri uri, String str4, String str5) {
        Intent intent = new Intent("android.intent.action.SEND");
        if (uri != null) {
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType("image/*");
        } else {
            intent.setType("text/plain");
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        intent.setFlags(Engine.EXCEPTION_ERROR);
        ArrayList<C1984f> a = C1983e.m9119a(context);
        if (a == null || a.size() <= 0) {
            try {
                if (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
                    intent.putExtra("android.intent.extra.TEXT", mo7264a(str3, str4));
                }
                context.startActivity(Intent.createChooser(intent, context.getApplicationInfo().name));
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            if (TextUtils.isEmpty(str)) {
                str = C1974m.m9063a(context, (int) R.string.share_with_friends);
            }
            TextView textView = (TextView) this.f6752j.findViewById(R.id.share_dialog_title);
            textView.setText(str);
            textView.setTextColor(this.f6751i.mo6260b((int) R.color.share_dialog_title_color));
            this.f6752j.findViewById(R.id.share_dialog_divider).setBackgroundColor(this.f6751i.mo6260b((int) R.color.share_dialog_divider_color));
            LinearLayout linearLayout = (LinearLayout) this.f6752j.findViewById(R.id.share_dialog_content_frame);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(0);
            if (C1132b.m5654a((Context) this).mo4392a(C1135d.SHARE_WITH_OTHER, (Boolean) true).booleanValue()) {
                String a2 = C1974m.m9063a(context, (int) R.string.more);
                a.add(new C1984f(this.f6751i.mo6249a((int) R.drawable.share_more), a2, (String) null, a2));
            }
            int g = (int) (((double) m9101g()) * f6750h);
            int i = g / 4;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(g, g);
            layoutParams.setMargins(i, i, i, i);
            for (int i2 = 0; i2 < a.size(); i2++) {
                C1984f fVar = a.get(i2);
                LinearLayout linearLayout4 = new LinearLayout(context);
                linearLayout4.setBackgroundDrawable(fVar.mo7272b());
                linearLayout4.setLayoutParams(layoutParams);
                String d = fVar.mo7274d();
                boolean a3 = fVar.mo7271a();
                fVar.mo7269a(i2, str2, str3, str5, str4);
                String f = fVar.mo7276f();
                fVar.mo7273c();
                LinearLayout linearLayout5 = linearLayout4;
                linearLayout5.setOnClickListener(new C1982d(this, context, fVar.mo7275e(), a3, d, intent, str3, str4, f));
                if (i2 < 3) {
                    linearLayout2.addView(linearLayout4);
                } else {
                    linearLayout3.addView(linearLayout4);
                }
            }
            linearLayout.removeAllViews();
            linearLayout.addView(linearLayout2);
            if (a.size() > 3) {
                linearLayout.addView(linearLayout3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo7264a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return TextUtils.concat(new CharSequence[]{str, " ", str2}).toString();
        } else if (!TextUtils.isEmpty(str)) {
            return str;
        } else {
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            return "";
        }
    }

    /* renamed from: g */
    private int m9101g() {
        Rect rect = new Rect();
        ((ViewGroup) findViewById(16908290)).getChildAt(0).getWindowVisibleDisplayFrame(rect);
        return Math.min(rect.height(), rect.width());
    }

    /* renamed from: a */
    protected static void m9100a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4220b() {
        C1368X.m6325e();
    }
}
