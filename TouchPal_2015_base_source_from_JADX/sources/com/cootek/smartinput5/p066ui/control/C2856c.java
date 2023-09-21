package com.cootek.smartinput5.p066ui.control;

import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Arrays;
import java.util.Hashtable;

/* renamed from: com.cootek.smartinput5.ui.control.c */
/* compiled from: CachedPaint */
public class C2856c extends Paint {

    /* renamed from: a */
    float[] f13030a;

    /* renamed from: b */
    float f13031b;

    /* renamed from: c */
    private Hashtable<Object, C2857a> f13032c;

    /* renamed from: d */
    private C2858b f13033d;

    public C2856c(boolean z) {
        m13245b();
    }

    /* renamed from: b */
    private void m13245b() {
        if (this.f13032c == null) {
            this.f13032c = new Hashtable<>();
        }
        if (this.f13033d == null) {
            this.f13033d = new C2858b();
        } else {
            Integer valueOf = Integer.valueOf(this.f13033d.hashCode());
            C2857a aVar = this.f13032c.get(valueOf);
            if (aVar == null) {
                aVar = new C2857a();
                this.f13032c.put(valueOf, aVar);
            }
            aVar.f13036c = this.f13031b;
        }
        this.f13033d.f13038a = getTextSize();
        this.f13033d.f13039b = getTypeface();
        Integer valueOf2 = Integer.valueOf(this.f13033d.hashCode());
        if (!this.f13032c.containsKey(valueOf2)) {
            this.f13032c.put(valueOf2, new C2857a());
        }
        C2857a aVar2 = this.f13032c.get(valueOf2);
        this.f13030a = aVar2.f13035b;
        this.f13031b = aVar2.f13036c;
    }

    public Typeface setTypeface(Typeface typeface) {
        Typeface typeface2 = super.setTypeface(typeface);
        m13245b();
        return typeface2;
    }

    public void setTextSize(float f) {
        if (f != getTextSize()) {
            super.setTextSize(f);
            m13245b();
        }
    }

    /* renamed from: a */
    public void mo9502a() {
    }

    /* renamed from: com.cootek.smartinput5.ui.control.c$a */
    /* compiled from: CachedPaint */
    class C2857a {

        /* renamed from: a */
        String f13034a;

        /* renamed from: b */
        float[] f13035b = new float[256];

        /* renamed from: c */
        float f13036c;

        C2857a() {
            mo9505a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9505a() {
            Arrays.fill(this.f13035b, -1.0f);
            this.f13036c = -1.0f;
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.control.c$b */
    /* compiled from: CachedPaint */
    class C2858b {

        /* renamed from: a */
        float f13038a;

        /* renamed from: b */
        Typeface f13039b;

        C2858b() {
        }

        public int hashCode() {
            return (this.f13039b == null ? 0 : this.f13039b.hashCode()) + ((((m13248a().hashCode() + 31) * 31) + Float.floatToIntBits(this.f13038a)) * 31);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            C2858b bVar = (C2858b) obj;
            if (!m13248a().equals(bVar.m13248a())) {
                return false;
            }
            if (Float.floatToIntBits(this.f13038a) != Float.floatToIntBits(bVar.f13038a)) {
                return false;
            }
            if (this.f13039b == null) {
                if (bVar.f13039b != null) {
                    return false;
                }
                return true;
            } else if (!this.f13039b.equals(bVar.f13039b)) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: a */
        private C2856c m13248a() {
            return C2856c.this;
        }
    }
}
