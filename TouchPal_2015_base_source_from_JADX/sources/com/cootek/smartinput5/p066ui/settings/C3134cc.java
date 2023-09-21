package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: com.cootek.smartinput5.ui.settings.cc */
/* compiled from: SeparatedListAdapter */
public class C3134cc extends BaseAdapter implements C3133cb {

    /* renamed from: a */
    public static final int f14153a = 0;

    /* renamed from: b */
    private final ArrayAdapter<String> f14154b;

    /* renamed from: c */
    private final ArrayList<C3135a> f14155c;

    /* renamed from: d */
    private ArrayList<C3135a> f14156d;

    /* renamed from: e */
    private String[] f14157e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Runnable f14158f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public LayoutInflater f14159g;

    /* renamed from: h */
    private Context f14160h;

    /* renamed from: i */
    private Comparator<String> f14161i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Comparator<C3136b> f14162j;

    /* renamed from: k */
    private C3133cb f14163k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f14164l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Okinawa f14165m;

    public C3134cc(Context context) {
        this.f14160h = context;
        this.f14165m = C1368X.m6320c().mo5835h();
        this.f14159g = (LayoutInflater) this.f14160h.getSystemService("layout_inflater");
        this.f14154b = new ArrayAdapter<>(context, R.layout.separator_item, R.id.header_view);
        this.f14155c = new ArrayList<>();
        this.f14156d = new ArrayList<>();
        this.f14161i = new C3137cd(this);
        this.f14162j = new C3138ce(this);
    }

    /* renamed from: b */
    public boolean mo10263b() {
        return this.f14164l;
    }

    /* renamed from: f */
    private void m14396f() {
        this.f14157e = new String[this.f14154b.getCount()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f14157e.length) {
                this.f14157e[i2] = this.f14154b.getItem(i2);
                i = i2 + 1;
            } else {
                Arrays.sort(this.f14157e, this.f14161i);
                return;
            }
        }
    }

    /* renamed from: c */
    private int m14390c(int i) {
        return m14393d(this.f14157e[i]);
    }

    /* renamed from: d */
    private int m14393d(String str) {
        for (int i = 0; i < this.f14154b.getCount(); i++) {
            if (TextUtils.equals(str, this.f14154b.getItem(i))) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private void m14386a(String str, C3135a aVar) {
        this.f14154b.add(str);
        this.f14155c.add(aVar);
        aVar.mo10273a(str, true);
    }

    /* renamed from: g */
    private void m14397g() {
        m14396f();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f14154b.getCount()) {
                mo10261b(this.f14154b.getItem(i2));
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private String m14395e(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        if (Pattern.matches("^(\\d+)(.*)", str)) {
            return "#";
        }
        return str.substring(0, 1).toUpperCase();
    }

    /* renamed from: a */
    public void mo10256a(Runnable runnable) {
        this.f14158f = runnable;
    }

    /* renamed from: a */
    public void mo10259a(String[] strArr) {
        for (String str : strArr) {
            m14387a(m14395e(str), str);
        }
        m14397g();
    }

    /* renamed from: a */
    public void mo10257a(String str) {
        String e = m14395e(str);
        m14387a(e, str);
        mo10261b(e);
        m14396f();
    }

    /* renamed from: b */
    public void mo10261b(String str) {
        C3135a aVar = this.f14155c.get(m14393d(str));
        if (aVar != null) {
            aVar.mo10276b();
        }
    }

    /* renamed from: a */
    private void m14387a(String str, String str2) {
        C3135a aVar;
        int position = this.f14154b.getPosition(str);
        if (position == -1) {
            aVar = new C3135a();
            aVar.mo10272a((C3133cb) this);
            m14386a(str, aVar);
        } else {
            aVar = this.f14155c.get(position);
        }
        aVar.mo10277b(str2);
    }

    /* renamed from: a */
    public void mo10258a(boolean z) {
        Iterator<C3135a> it = this.f14155c.iterator();
        while (it.hasNext()) {
            it.next().mo10274a(z);
        }
    }

    /* renamed from: c */
    public void mo10264c() {
        this.f14156d.clear();
        if (this.f14155c.size() > 0) {
            Okinawa h = C1368X.m6320c().mo5835h();
            h.fireTransactionOperation(1);
            Iterator<C3135a> it = this.f14155c.iterator();
            while (it.hasNext()) {
                C3135a next = it.next();
                next.mo10279c();
                if (next.getCount() <= 1) {
                    this.f14156d.add(next);
                }
            }
            h.fireTransactionOperation(2);
            h.processEvent();
        }
        Iterator<C3135a> it2 = this.f14156d.iterator();
        while (it2.hasNext()) {
            C3135a next2 = it2.next();
            this.f14154b.remove(this.f14154b.getItem(this.f14155c.indexOf(next2)));
            this.f14155c.remove(next2);
        }
        m14396f();
    }

    public int getCount() {
        int i = 0;
        Iterator<C3135a> it = this.f14155c.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = it.next().getCount() + i2;
        }
    }

    /* renamed from: d */
    public int mo10266d() {
        return this.f14155c.size();
    }

    /* renamed from: a */
    public String mo10254a(int i) {
        return this.f14157e[i];
    }

    /* renamed from: b */
    public int mo10260b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += m14392d(i3);
        }
        return i2;
    }

    /* renamed from: d */
    private int m14392d(int i) {
        return this.f14155c.get(m14390c(i)).getCount();
    }

    public Object getItem(int i) {
        for (String d : this.f14157e) {
            C3135a aVar = this.f14155c.get(m14393d(d));
            int count = aVar.getCount();
            if (i < count) {
                return aVar.getItem(i);
            }
            i -= count;
        }
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: b */
    public void mo10262b(boolean z) {
        Iterator<C3135a> it = this.f14155c.iterator();
        while (it.hasNext()) {
            it.next().mo10278b(z);
        }
    }

    /* renamed from: c */
    public boolean mo10265c(String str) {
        Iterator<C3135a> it = this.f14155c.iterator();
        while (it.hasNext()) {
            if (it.next().mo10275a(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo10267e() {
        Iterator<C3135a> it = this.f14155c.iterator();
        while (it.hasNext()) {
            if (it.next().mo10280d()) {
                return true;
            }
        }
        return false;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        for (String d : this.f14157e) {
            C3135a aVar = this.f14155c.get(m14393d(d));
            int count = aVar.getCount();
            if (i < count) {
                return aVar.getView(i, view, viewGroup);
            }
            i -= count;
        }
        return null;
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.cc$a */
    /* compiled from: SeparatedListAdapter */
    public class C3135a extends BaseAdapter implements C3133cb {

        /* renamed from: b */
        private ArrayList<C3136b> f14167b = new ArrayList<>();

        /* renamed from: c */
        private ArrayList<C3136b> f14168c = new ArrayList<>();

        /* renamed from: d */
        private C3133cb f14169d;

        /* renamed from: e */
        private boolean f14170e = false;

        public C3135a() {
        }

        /* renamed from: a */
        public void mo10272a(C3133cb cbVar) {
            this.f14169d = cbVar;
        }

        /* renamed from: a */
        public void mo10274a(boolean z) {
            Iterator<C3136b> it = this.f14167b.iterator();
            while (it.hasNext()) {
                it.next().mo10289a(z);
            }
        }

        /* renamed from: a */
        public boolean mo10275a(String str) {
            for (int i = 1; i < this.f14167b.size(); i++) {
                if (TextUtils.equals(this.f14167b.get(i).f14172b, str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo10276b() {
            boolean z;
            C3136b bVar;
            C3136b[] bVarArr = new C3136b[(this.f14167b.size() - 1)];
            C3136b bVar2 = this.f14167b.get(0);
            for (int i = 1; i < this.f14167b.size(); i++) {
                bVarArr[i - 1] = this.f14167b.get(i);
            }
            Arrays.sort(bVarArr, C3134cc.this.f14162j);
            this.f14167b.clear();
            this.f14167b.add(bVar2);
            C3136b bVar3 = null;
            int length = bVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C3136b bVar4 = bVarArr[i2];
                if (bVar3 == null) {
                    z = true;
                    bVar = bVar4;
                } else {
                    if (bVar4.f14176f || bVar3.f14176f || !bVar3.f14172b.equals(bVar4.f14172b)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar = bVar4;
                }
                if (z) {
                    this.f14167b.add(bVar4);
                }
                i2++;
                bVar3 = bVar;
            }
        }

        public int getCount() {
            return this.f14167b.size();
        }

        public Object getItem(int i) {
            if (i < this.f14167b.size()) {
                return this.f14167b.get(i);
            }
            return null;
        }

        /* renamed from: b */
        public void mo10277b(String str) {
            mo10273a(str, false);
        }

        /* renamed from: a */
        public void mo10273a(String str, boolean z) {
            C3136b bVar = new C3136b(z);
            bVar.mo10288a(str);
            bVar.mo10287a((C3133cb) this);
            this.f14167b.add(bVar);
        }

        /* renamed from: c */
        public void mo10279c() {
            this.f14170e = false;
            boolean unused = C3134cc.this.f14164l = false;
            this.f14168c.clear();
            Iterator<C3136b> it = this.f14167b.iterator();
            while (it.hasNext()) {
                C3136b next = it.next();
                if (next.mo10290a()) {
                    this.f14168c.add(next);
                }
            }
            Iterator<C3136b> it2 = this.f14168c.iterator();
            while (it2.hasNext()) {
                C3136b next2 = it2.next();
                this.f14167b.remove(next2);
                next2.mo10291b();
            }
        }

        /* renamed from: b */
        public void mo10278b(boolean z) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f14167b.size()) {
                    this.f14167b.get(i2).mo10292b(z);
                    i = i2 + 1;
                } else {
                    mo10030a();
                    return;
                }
            }
        }

        /* renamed from: f */
        private boolean m14413f() {
            return m14414g() >= this.f14167b.size() + -1;
        }

        /* renamed from: d */
        public boolean mo10280d() {
            return m14414g() >= 1;
        }

        /* renamed from: e */
        public boolean mo10281e() {
            return this.f14170e;
        }

        /* renamed from: g */
        private int m14414g() {
            int i = 0;
            for (int i2 = 0; i2 < this.f14167b.size(); i2++) {
                if (this.f14167b.get(i2).mo10290a()) {
                    i++;
                }
            }
            return i;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return this.f14167b.get(i).mo10286a(view);
        }

        /* renamed from: a */
        public void mo10030a() {
            boolean f = m14413f();
            if (this.f14170e ^ f) {
                this.f14170e = f;
                if (this.f14169d != null) {
                    this.f14169d.mo10030a();
                }
            }
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.cc$b */
    /* compiled from: SeparatedListAdapter */
    public class C3136b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f14172b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f14173c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C3133cb f14174d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f14175e = false;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final boolean f14176f;

        public C3136b(boolean z) {
            this.f14176f = z;
        }

        /* renamed from: a */
        public void mo10289a(boolean z) {
            if (!this.f14176f) {
                this.f14175e = z;
                this.f14173c = false;
            }
        }

        /* renamed from: a */
        public void mo10288a(String str) {
            this.f14172b = str;
        }

        /* renamed from: b */
        public void mo10292b(boolean z) {
            if (!this.f14176f) {
                this.f14173c = z;
            }
        }

        /* renamed from: a */
        public boolean mo10290a() {
            return this.f14173c;
        }

        /* renamed from: b */
        public void mo10291b() {
            if (!this.f14176f) {
                C3134cc.this.f14165m.fireDeleteUserWordOperation("", this.f14172b, 3, false);
            }
        }

        /* renamed from: a */
        private void m14427a(View view, TextView textView, CheckBox checkBox) {
            if (textView != null) {
                textView.setText(this.f14172b);
            }
            if (checkBox != null) {
                checkBox.setChecked(this.f14173c);
                if (this.f14175e) {
                    checkBox.setVisibility(0);
                } else {
                    checkBox.setVisibility(8);
                }
            }
        }

        /* renamed from: a */
        public View mo10286a(View view) {
            if (view == null) {
                view = C3134cc.this.f14159g.inflate(R.layout.separator_item, (ViewGroup) null);
            }
            TextView textView = (TextView) view.findViewById(R.id.header_view);
            View findViewById = view.findViewById(R.id.content_frame);
            if (this.f14176f) {
                textView.setVisibility(0);
                textView.setText(this.f14172b);
                findViewById.setVisibility(8);
                view.setBackgroundDrawable((Drawable) null);
            } else {
                view.setBackgroundResource(R.drawable.paopao_button_ctrl);
                textView.setVisibility(8);
                findViewById.setVisibility(0);
                TextView textView2 = (TextView) view.findViewById(R.id.content);
                CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkbox);
                if (view != null) {
                    view.setOnClickListener(new C3139cf(this, checkBox));
                    view.setOnLongClickListener(new C3140cg(this));
                }
                if (checkBox != null) {
                    checkBox.setOnCheckedChangeListener(new C3141ch(this));
                }
                m14427a(view, textView2, checkBox);
            }
            return view;
        }

        /* renamed from: a */
        public void mo10287a(C3133cb cbVar) {
            this.f14174d = cbVar;
        }
    }

    /* renamed from: a */
    public void mo10255a(C3133cb cbVar) {
        this.f14163k = cbVar;
    }

    /* renamed from: a */
    public void mo10030a() {
        boolean z;
        Iterator<C3135a> it = this.f14155c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it.next().mo10281e()) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (this.f14164l ^ z) {
            this.f14164l = z;
            if (this.f14163k != null) {
                this.f14163k.mo10030a();
            }
        }
    }
}
