package com.cootek.smartinput5.func.iab.google;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.func.iab.C1754V;
import com.cootek.smartinput5.func.iab.C1769ah;
import com.cootek.smartinput5.func.iab.C1778f;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

public class ControlActivity extends Activity {

    /* renamed from: a */
    private static final boolean f5862a = false;

    /* renamed from: c */
    private static final int f5863c = 1;

    /* renamed from: d */
    private static final int f5864d = 2;

    /* renamed from: e */
    private static final int f5865e = 3;

    /* renamed from: b */
    private ProgressDialog f5866b;

    /* renamed from: f */
    private int f5867f = 0;

    /* renamed from: g */
    private boolean f5868g = false;

    /* renamed from: h */
    private ListView f5869h;

    /* renamed from: i */
    private C1780a f5870i;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.google_iab_diagnois);
        m8177a();
    }

    /* renamed from: a */
    private void m8177a() {
        m8186b();
        m8188d();
    }

    /* renamed from: b */
    private void m8186b() {
        C1730E.m7962a((Context) this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6684b((Context) this);
        }
        m8190f();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6686f();
        }
        m8187c();
    }

    /* renamed from: c */
    private void m8187c() {
        if (this.f5866b != null && this.f5866b.isShowing()) {
            this.f5866b.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8182a(String str, String str2, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        m8187c();
        this.f5866b = new ProgressDialog(this);
        this.f5866b.setTitle(str);
        this.f5866b.setMessage(str2);
        this.f5866b.setCancelable(z);
        this.f5866b.setOnCancelListener(onCancelListener);
        this.f5866b.show();
    }

    /* renamed from: d */
    private void m8188d() {
        m8189e();
    }

    /* renamed from: e */
    private void m8189e() {
        this.f5869h = (ListView) findViewById(R.id.info_list);
        this.f5870i = new C1780a(this, (C1781a) null);
        this.f5869h.setAdapter(this.f5870i);
    }

    /* renamed from: f */
    private void m8190f() {
        m8182a((String) null, "query purchases...", true, new C1781a(this));
        m8192h();
    }

    /* renamed from: g */
    private ArrayList<C1754V> m8191g() {
        if (C1730E.m8004c()) {
            return new ArrayList<>(C1730E.m8005d().mo6715b());
        }
        return null;
    }

    /* renamed from: a */
    private void m8183a(ArrayList<C1754V> arrayList) {
        this.f5870i.mo6773a(arrayList);
        this.f5870i.notifyDataSetChanged();
    }

    /* renamed from: com.cootek.smartinput5.func.iab.google.ControlActivity$a */
    private class C1780a extends BaseAdapter {

        /* renamed from: b */
        private ArrayList<C1754V> f5872b;

        private C1780a() {
        }

        /* synthetic */ C1780a(ControlActivity controlActivity, C1781a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo6773a(ArrayList<C1754V> arrayList) {
            this.f5872b = arrayList;
        }

        public int getCount() {
            if (this.f5872b != null) {
                return this.f5872b.size();
            }
            return 0;
        }

        public Object getItem(int i) {
            if (this.f5872b == null) {
                return null;
            }
            this.f5872b.get(i);
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (this.f5872b != null) {
                return m8194a(view, this.f5872b.get(i));
            }
            return null;
        }

        /* renamed from: a */
        private View m8194a(View view, C1754V v) {
            if (v == null) {
                return null;
            }
            if (view == null) {
                view = ((LayoutInflater) ControlActivity.this.getSystemService("layout_inflater")).inflate(R.layout.purchase_info_item, (ViewGroup) null);
            }
            m8195b(view, v);
            return view;
        }

        /* renamed from: b */
        private void m8195b(View view, C1754V v) {
            if (v != null) {
                TextView textView = (TextView) view.findViewById(R.id.detail);
                if (textView != null) {
                    textView.setText(C1769ah.m8127a(v));
                }
                Button button = (Button) view.findViewById(R.id.consume_btn);
                if (button == null) {
                    return;
                }
                if (ControlActivity.this.m8184a(v)) {
                    button.setVisibility(0);
                    button.setOnClickListener(new C1784d(this, v));
                    return;
                }
                button.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m8184a(C1754V v) {
        if (v != null) {
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m8192h() {
        if (!this.f5868g) {
            if (C1730E.m8004c()) {
                this.f5868g = true;
                this.f5867f = 0;
                C1730E.m8005d().mo6679a(C1778f.f5818al, (C1746T.C1750d) new C1782b(this));
                C1730E.m8005d().mo6679a(C1778f.f5819am, (C1746T.C1750d) new C1783c(this));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8178a(int i) {
        this.f5867f |= i;
        if (this.f5867f == 3) {
            m8193i();
        }
    }

    /* renamed from: i */
    private void m8193i() {
        this.f5868g = false;
        m8183a(m8191g());
        m8187c();
    }
}
