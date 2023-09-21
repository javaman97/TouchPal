package com.cootek.smartinput5.func.component;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.component.v */
/* compiled from: ContactNameIndexer */
public class C1689v {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ProgressDialog f5512a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Activity f5513b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f5514c;

    /* renamed from: d */
    private ContactProvider f5515d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f5516e = true;

    /* renamed from: f */
    private C1690a f5517f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1691b f5518g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Runnable f5519h = new C1639A(this);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Runnable f5520i = new C1641C(this);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Runnable f5521j = new C1643E(this);

    public C1689v(Activity activity) {
        this.f5513b = activity;
        this.f5514c = this.f5513b.getBaseContext();
        this.f5515d = ContactProvider.createContactProvider();
    }

    /* renamed from: a */
    public void mo6562a() {
        if (this.f5513b != null) {
            String a = C1974m.m9063a(this.f5514c, (int) R.string.contactname_indexing_message);
            try {
                this.f5516e = false;
                this.f5512a = ProgressDialog.show(this.f5513b, (CharSequence) null, a, true, true);
                this.f5512a.setCancelable(true);
                this.f5512a.setOnCancelListener(new C1692w(this));
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f5517f = new C1690a(this, (C1692w) null);
            this.f5517f.execute(new String[0]);
        }
    }

    /* renamed from: b */
    public void mo6563b() {
        if (this.f5513b != null) {
            C2894d.C2895a aVar = new C2894d.C2895a(this.f5513b);
            aVar.setMessage(C1974m.m9063a((Context) this.f5513b, (int) R.string.contactname_clear_message));
            aVar.setPositiveButton(C1974m.m9063a((Context) this.f5513b, (int) R.string.yes), new C1693x(this));
            aVar.setNegativeButton(C1974m.m9063a((Context) this.f5513b, (int) R.string.cancel), new C1695z(this));
            aVar.create().show();
        }
    }

    /* renamed from: com.cootek.smartinput5.func.component.v$a */
    /* compiled from: ContactNameIndexer */
    private class C1690a extends AsyncTask<String, Integer, Object> {
        private C1690a() {
        }

        /* synthetic */ C1690a(C1689v vVar, C1692w wVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object doInBackground(String... strArr) {
            return C1689v.this.m7794a(C1689v.this.f5514c, (String) null);
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
            if (C1689v.this.f5512a != null) {
                C1689v.this.f5512a.cancel();
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            Settings.getInstance().setBoolSetting(Settings.ONCE_CLEAR_CONTACT, false);
            if (!C1689v.this.f5516e) {
                if (C1689v.this.f5512a != null && C1689v.this.f5512a.isShowing() && !C1689v.this.f5513b.isFinishing()) {
                    C1689v.this.f5512a.dismiss();
                }
                try {
                    List<String> list = (List) obj;
                    if (list == null || list.size() == 0) {
                        C1689v.this.f5521j.run();
                        return;
                    }
                    if (Engine.isInitialized()) {
                        Engine.getInstance().getUsrDicChecker().mo6518a(3, false);
                    }
                    if (C1368X.m6324d() && Engine.isInitialized() && !Engine.getInstance().getIms().isInputViewShown()) {
                        Okinawa h = C1368X.m6320c().mo5835h();
                        h.fireTransactionOperation(1);
                        h.fireDeleteUserWordOperation("", "", 5, false);
                        for (String fireAddUserwordOperation : list) {
                            h.fireAddUserwordOperation("", fireAddUserwordOperation, 5);
                        }
                        h.fireTransactionOperation(2);
                        h.processEvent();
                        Settings.getInstance().setBoolSetting(Settings.CONTACT_IMPORTED, true);
                        C1689v.this.f5519h.run();
                        list.clear();
                    }
                    if (Engine.isInitialized()) {
                        Engine.getInstance().getUsrDicChecker().mo6518a(3, true);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (Engine.isInitialized()) {
                Engine.getInstance().getUsrDicChecker().mo6518a(3, true);
            }
        }
    }

    /* renamed from: com.cootek.smartinput5.func.component.v$b */
    /* compiled from: ContactNameIndexer */
    private class C1691b extends AsyncTask<String, Integer, Object> {
        private C1691b() {
        }

        /* synthetic */ C1691b(C1689v vVar, C1692w wVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object doInBackground(String... strArr) {
            return strArr;
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
            if (C1689v.this.f5512a != null) {
                C1689v.this.f5512a.cancel();
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            Settings.getInstance().setBoolSetting(Settings.ONCE_CLEAR_CONTACT, true);
            if (!C1689v.this.f5516e) {
                if (C1689v.this.f5512a != null && C1689v.this.f5512a.isShowing() && !C1689v.this.f5513b.isFinishing()) {
                    C1689v.this.f5512a.dismiss();
                }
                if (Engine.isInitialized()) {
                    Engine.getInstance().getUsrDicChecker().mo6518a(3, false);
                }
                if (C1368X.m6324d() && Engine.isInitialized()) {
                    Okinawa h = C1368X.m6320c().mo5835h();
                    h.fireDeleteUserWordOperation("", "", 5, false);
                    h.processEvent();
                    C1689v.this.f5520i.run();
                }
                if (Engine.isInitialized()) {
                    Engine.getInstance().getUsrDicChecker().mo6518a(3, true);
                }
            } else if (Engine.isInitialized()) {
                Engine.getInstance().getUsrDicChecker().mo6518a(3, true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public List<String> m7794a(Context context, String str) {
        return this.f5515d.getContactNames(context, str);
    }
}
