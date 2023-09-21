package com.cootek.smartinput5.func.contactscanner;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.CallLog;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.component.ContactProvider;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2254L;
import com.cootek.smartinput5.net.cmd.CmdCheckCallLog;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactScannerActivity extends Activity {

    /* renamed from: i */
    private static final int f5528i = 900;

    /* renamed from: a */
    private ProgressDialog f5529a;

    /* renamed from: b */
    private boolean f5530b = false;

    /* renamed from: c */
    private boolean f5531c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList<CmdCheckCallLog.CheckResult> f5532d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f5533e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f5534f = false;

    /* renamed from: g */
    private C1696a f5535g;

    /* renamed from: h */
    private C1697b f5536h;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.contact_scanner_start);
        m7810a();
    }

    /* renamed from: a */
    private void m7810a() {
        TextView textView = (TextView) findViewById(R.id.contact_scanner_title);
        if (textView != null && getResources().getDisplayMetrics().heightPixels < f5528i) {
            textView.setVisibility(8);
        }
    }

    public void scanLater(View view) {
        finish();
    }

    public void startScanner(View view) {
        this.f5529a = ProgressDialog.show(this, C1974m.m9063a((Context) this, (int) R.string.contactname_indexing_title), getResources().getString(R.string.contactname_indexing_message));
        this.f5529a.setCancelable(true);
        this.f5529a.setOnCancelListener(new C1699a(this));
        this.f5531c = false;
        this.f5530b = false;
        this.f5534f = false;
        this.f5535g = new C1696a(this, (C1699a) null);
        this.f5536h = new C1697b(this, (C1699a) null);
        this.f5535g.execute(new String[0]);
        this.f5536h.execute(new String[0]);
    }

    /* renamed from: com.cootek.smartinput5.func.contactscanner.ContactScannerActivity$a */
    private class C1696a extends AsyncTask<String, Integer, Boolean> {

        /* renamed from: b */
        private C2373x f5538b;

        private C1696a() {
            this.f5538b = null;
        }

        /* synthetic */ C1696a(ContactScannerActivity contactScannerActivity, C1699a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(String... strArr) {
            if (!ContactScannerActivity.this.m7823h()) {
                ArrayList c = ContactScannerActivity.this.m7821f();
                if (c.size() > 0) {
                    CmdCheckCallLog cmdCheckCallLog = new CmdCheckCallLog();
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        cmdCheckCallLog.mo7778a((String) it.next());
                    }
                    this.f5538b = new C2373x(cmdCheckCallLog);
                    this.f5538b.mo8060a((C2373x.C2376b) new C1702d(this));
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
            if (this.f5538b != null) {
                this.f5538b.mo8061b();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!bool.booleanValue()) {
                ContactScannerActivity.this.m7813a(false, true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7814b() {
        this.f5534f = true;
        if (!(this.f5535g == null || this.f5535g.getStatus() == AsyncTask.Status.FINISHED)) {
            this.f5535g.cancel(true);
        }
        if (this.f5536h != null && this.f5536h.getStatus() != AsyncTask.Status.FINISHED) {
            this.f5536h.cancel(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7813a(boolean z, boolean z2) {
        if (this.f5531c && this.f5530b) {
            return;
        }
        if (this.f5534f) {
            m7817c();
            return;
        }
        this.f5530b |= z;
        this.f5531c |= z2;
        if (this.f5531c && this.f5530b) {
            if (!m7822g()) {
                m7820e();
            } else {
                m7818d();
            }
        }
    }

    /* renamed from: c */
    private void m7817c() {
        if (this.f5529a != null && this.f5529a.isShowing()) {
            this.f5529a.dismiss();
        }
    }

    /* renamed from: com.cootek.smartinput5.func.contactscanner.ContactScannerActivity$b */
    private class C1697b extends AsyncTask<String, Integer, List<String>> {
        private C1697b() {
        }

        /* synthetic */ C1697b(ContactScannerActivity contactScannerActivity, C1699a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<String> doInBackground(String... strArr) {
            return ContactProvider.createContactProvider().getContactNames(ContactScannerActivity.this, (String) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(List<String> list) {
            super.onPostExecute(list);
            if (list != null && C1368X.m6324d()) {
                int unused = ContactScannerActivity.this.f5533e = list.size();
                Okinawa h = C1368X.m6320c().mo5835h();
                h.fireTransactionOperation(1);
                h.fireDeleteUserWordOperation("", "", 5, false);
                for (String next : list) {
                    if (ContactScannerActivity.this.f5534f) {
                        break;
                    }
                    h.fireAddUserwordOperation("", next, 5);
                }
                h.fireTransactionOperation(2);
                h.processEvent();
                Settings.getInstance().setBoolSetting(Settings.CONTACT_IMPORTED, true);
            }
            ContactScannerActivity.this.m7813a(true, false);
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
            ContactScannerActivity.this.m7813a(true, false);
        }
    }

    /* renamed from: d */
    private void m7818d() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(ContactScannerFollowActivity.f5540a, this.f5532d);
        intent.putExtras(bundle);
        intent.putExtra(ContactScannerFollowActivity.f5541b, this.f5533e);
        intent.setClass(this, ContactScannerFollowActivity.class);
        intent.setFlags(Engine.EXCEPTION_ERROR);
        m7817c();
        finish();
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m7814b();
        if (this.f5531c && this.f5530b) {
            finish();
        }
    }

    /* renamed from: e */
    private void m7820e() {
        AlertDialog.Builder positiveButton = new C2894d.C2895a(this).setTitle(C1974m.m9063a((Context) this, (int) R.string.contactname_indexing_title)).setMessage(C1974m.m9063a((Context) this, (int) R.string.contactname_indexdone_message)).setOnCancelListener(new C1701c(this)).setPositiveButton(C1974m.m9063a((Context) this, 17039370), new C1700b(this));
        m7817c();
        positiveButton.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public ArrayList<String> m7821f() {
        Cursor cursor;
        boolean z;
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            cursor = C1368X.m6313b().getContentResolver().query(CallLog.Calls.CONTENT_URI, C2254L.m10288j() == 1 ? new String[]{"number", "type", PresentConfigXmlTag.TOAST_ATTR_TOAST_DURATION, "date", "name", C2254L.f9647e} : new String[]{"number", "type", PresentConfigXmlTag.TOAST_ATTR_TOAST_DURATION, "date", "name"}, "date > " + String.valueOf(System.currentTimeMillis() - 2592000000L), (String[]) null, "date DESC");
        } catch (Exception e) {
            e.printStackTrace();
            cursor = null;
        }
        if (cursor == null || !cursor.moveToFirst()) {
            return arrayList;
        }
        do {
            if (!TextUtils.isEmpty(cursor.getString(4))) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String string = cursor.getString(0);
                if (!TextUtils.isEmpty(string) && !arrayList.contains(string)) {
                    arrayList.add(string);
                }
            }
        } while (cursor.moveToNext());
        return arrayList;
    }

    /* renamed from: g */
    private boolean m7822g() {
        return this.f5532d != null && this.f5532d.size() > 0 && !m7823h();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public boolean m7823h() {
        return C1584bI.m7123a((Context) this, C1974m.m9063a((Context) this, (int) R.string.smartdialer_package_name)) != null;
    }
}
