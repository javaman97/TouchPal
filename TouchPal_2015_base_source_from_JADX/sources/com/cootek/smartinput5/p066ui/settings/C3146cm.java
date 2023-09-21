package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.cm */
/* compiled from: SingleChoiceAdapter */
public class C3146cm extends BaseAdapter {

    /* renamed from: a */
    protected Context f14185a;

    /* renamed from: b */
    protected C3148b[] f14186b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f14187c;

    /* renamed from: d */
    private int f14188d = -1;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3147a f14189e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f14190f = 0;

    /* renamed from: com.cootek.smartinput5.ui.settings.cm$a */
    /* compiled from: SingleChoiceAdapter */
    public interface C3147a {
        /* renamed from: a */
        void mo10074a(int i);
    }

    public C3146cm(Context context, int i) {
        this.f14185a = context;
        this.f14187c = i;
        mo10307g();
    }

    /* renamed from: a */
    public void mo10304a(C3147a aVar) {
        this.f14189e = aVar;
    }

    public int getCount() {
        return this.f14186b.length;
    }

    public Object getItem(int i) {
        return this.f14186b[i];
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f14186b[i].mo10312a(view);
    }

    /* renamed from: b */
    public void mo10305b(int i) {
        this.f14187c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo10306f() {
        return this.f14187c;
    }

    /* renamed from: a */
    public void mo10303a(int i) {
        this.f14190f = i;
    }

    /* renamed from: d */
    public String[] mo10072d() {
        if (this.f14188d > 0) {
            return this.f14185a.getResources().getStringArray(this.f14188d);
        }
        return null;
    }

    /* renamed from: g */
    public void mo10307g() {
        mo10305b(0);
        String[] d = mo10072d();
        this.f14186b = new C3148b[d.length];
        for (int i = 0; i < this.f14186b.length; i++) {
            this.f14186b[i] = new C3148b(d[i], i);
        }
    }

    /* renamed from: e */
    public String mo10073e() {
        String[] d = mo10072d();
        if (this.f14187c >= d.length || this.f14187c < 0) {
            return d[0];
        }
        return d[this.f14187c];
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.cm$b */
    /* compiled from: SingleChoiceAdapter */
    private class C3148b {

        /* renamed from: b */
        private String f14192b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f14193c;

        public C3148b(String str, int i) {
            this.f14192b = str;
            this.f14193c = i;
        }

        /* renamed from: a */
        public boolean mo10313a() {
            return this.f14193c == C3146cm.this.f14187c;
        }

        /* renamed from: a */
        public View mo10312a(View view) {
            if (view == null) {
                view = ((LayoutInflater) C3146cm.this.f14185a.getSystemService("layout_inflater")).inflate(R.layout.single_choice_item, (ViewGroup) null);
            }
            CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(R.id.title);
            checkedTextView.setText(this.f14192b);
            if (C3146cm.this.f14190f != 0) {
                checkedTextView.setTextColor(C3146cm.this.f14190f);
            }
            checkedTextView.setChecked(mo10313a());
            checkedTextView.setOnClickListener(new C3149cn(this));
            return view;
        }
    }
}
