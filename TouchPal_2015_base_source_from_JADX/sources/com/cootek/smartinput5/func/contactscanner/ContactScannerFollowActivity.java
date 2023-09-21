package com.cootek.smartinput5.func.contactscanner;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.cmd.CmdCheckCallLog;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

public class ContactScannerFollowActivity extends Activity {

    /* renamed from: a */
    public static final String f5540a = "com.cootek.smartinputv5.CHECK_RESULT";

    /* renamed from: b */
    public static final String f5541b = "com.cootek.smartinputv5.CONTACT_COUNT";

    /* renamed from: c */
    private static final int f5542c = 3;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LayoutInflater f5543d;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.contact_scanner_follow);
        mo6590a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6590a() {
        this.f5543d = (LayoutInflater) getSystemService("layout_inflater");
        m7833e();
        m7831c();
        m7830b();
        m7832d();
    }

    /* renamed from: b */
    private void m7830b() {
        TextView textView = (TextView) findViewById(R.id.dialer_commercial_title);
        String a = C1974m.m9063a((Context) this, (int) R.string.dialer_app_name);
        textView.setText(String.format(C1974m.m9063a((Context) this, (int) R.string.dialer_recommender_commercial_text), new Object[]{a}));
        if (textView != null) {
            m7829a(textView, a, getResources().getColor(R.color.dialer_recommender_highlight_text_color));
        }
    }

    /* renamed from: a */
    private void m7829a(TextView textView, String str, int i) {
        C1584bI.m7136a(textView, str, i);
    }

    /* renamed from: c */
    private void m7831c() {
        TextView textView = (TextView) findViewById(R.id.dialer_recognize_success_title);
        String a = C1974m.m9063a((Context) this, (int) R.string.dialer_app_name);
        textView.setText(String.format(C1974m.m9063a((Context) this, (int) R.string.dialer_recognize_success), new Object[]{a}));
        if (textView != null) {
            m7829a(textView, a, getResources().getColor(R.color.dialer_recommender_highlight_text_color));
        }
    }

    /* renamed from: d */
    private void m7832d() {
        ArrayList parcelableArrayList;
        String str;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.check_result_list);
        Bundle extras = getIntent().getExtras();
        if (extras != null && (parcelableArrayList = extras.getParcelableArrayList(f5540a)) != null) {
            Iterator it = parcelableArrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                CmdCheckCallLog.CheckResult checkResult = (CmdCheckCallLog.CheckResult) it.next();
                i++;
                if (i > 3) {
                    break;
                }
                String str2 = checkResult.f9506a;
                String str3 = checkResult.f9508c;
                if (TextUtils.isEmpty(str3)) {
                    str = checkResult.f9507b;
                } else {
                    str = str3;
                }
                linearLayout.addView(new C1698a(str2, str).mo6593a());
            }
            linearLayout.addView(new C1698a("...", "").mo6593a());
        }
    }

    /* renamed from: e */
    private void m7833e() {
        String valueOf = String.valueOf(getIntent().getIntExtra(f5541b, 0));
        TextView textView = (TextView) findViewById(R.id.import_contact_success);
        textView.setText(String.format(C1974m.m9063a((Context) this, (int) R.string.import_contact_success_hint), new Object[]{valueOf}));
        m7829a(textView, valueOf, getResources().getColor(R.color.dialer_recommender_check_result_content_text_color));
    }

    public void downloadDialer(View view) {
        C1584bI.m7145b(this, new C1703e(this), false);
    }

    /* renamed from: com.cootek.smartinput5.func.contactscanner.ContactScannerFollowActivity$a */
    private class C1698a {

        /* renamed from: b */
        private String f5545b;

        /* renamed from: c */
        private String f5546c;

        public C1698a(String str, String str2) {
            this.f5545b = str;
            this.f5546c = str2;
        }

        /* renamed from: a */
        public View mo6593a() {
            LinearLayout linearLayout = (LinearLayout) ContactScannerFollowActivity.this.f5543d.inflate(R.layout.dialer_check_result_item, (ViewGroup) null);
            ((TextView) linearLayout.findViewById(R.id.phone_number)).setText(this.f5545b);
            ((TextView) linearLayout.findViewById(R.id.content)).setText(this.f5546c);
            return linearLayout;
        }
    }
}
