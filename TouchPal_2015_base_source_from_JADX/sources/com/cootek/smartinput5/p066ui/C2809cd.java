package com.cootek.smartinput5.p066ui;

import android.graphics.Paint;
import android.graphics.Point;
import java.util.Arrays;

/* renamed from: com.cootek.smartinput5.ui.cd */
/* compiled from: SoftKeyDrawInfo */
public class C2809cd {

    /* renamed from: a */
    int f12456a;

    /* renamed from: b */
    int f12457b = -100;

    /* renamed from: c */
    int[] f12458c;

    /* renamed from: d */
    int f12459d;

    /* renamed from: e */
    int f12460e;

    /* renamed from: f */
    int f12461f;

    /* renamed from: g */
    int f12462g;

    /* renamed from: h */
    int f12463h;

    /* renamed from: i */
    String f12464i;

    /* renamed from: j */
    String f12465j;

    /* renamed from: k */
    String f12466k;

    /* renamed from: l */
    String f12467l;

    /* renamed from: m */
    String f12468m;

    /* renamed from: n */
    Paint.Align f12469n;

    /* renamed from: o */
    Paint.Align f12470o;

    /* renamed from: p */
    Point f12471p;

    /* renamed from: q */
    Point f12472q;

    /* renamed from: r */
    Paint.Align f12473r;

    /* renamed from: s */
    Paint.Align f12474s;

    /* renamed from: t */
    Point f12475t;

    /* renamed from: u */
    Point f12476u;

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f12476u == null ? 0 : this.f12476u.hashCode()) + (((((((this.f12465j == null ? 0 : this.f12465j.hashCode()) + (((this.f12470o == null ? 0 : this.f12470o.hashCode()) + (((this.f12469n == null ? 0 : this.f12469n.hashCode()) + (((this.f12471p == null ? 0 : this.f12471p.hashCode()) + (((this.f12466k == null ? 0 : this.f12466k.hashCode()) + (((this.f12475t == null ? 0 : this.f12475t.hashCode()) + (((this.f12464i == null ? 0 : this.f12464i.hashCode()) + (((((this.f12468m == null ? 0 : this.f12468m.hashCode()) + (((this.f12474s == null ? 0 : this.f12474s.hashCode()) + (((this.f12473r == null ? 0 : this.f12473r.hashCode()) + (((this.f12472q == null ? 0 : this.f12472q.hashCode()) + 31) * 31)) * 31)) * 31)) * 31) + this.f12462g) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.f12457b) * 31) + this.f12463h) * 31)) * 31;
        if (this.f12467l != null) {
            i = this.f12467l.hashCode();
        }
        return ((((((((((hashCode + i) * 31) + this.f12456a) * 31) + Arrays.hashCode(this.f12458c)) * 31) + this.f12461f) * 31) + this.f12459d) * 31) + this.f12460e;
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
        C2809cd cdVar = (C2809cd) obj;
        if (this.f12472q == null) {
            if (cdVar.f12472q != null) {
                return false;
            }
        } else if (!this.f12472q.equals(cdVar.f12472q)) {
            return false;
        }
        if (this.f12473r != cdVar.f12473r) {
            return false;
        }
        if (this.f12474s != cdVar.f12474s) {
            return false;
        }
        if (this.f12468m == null) {
            if (cdVar.f12468m != null) {
                return false;
            }
        } else if (!this.f12468m.equals(cdVar.f12468m)) {
            return false;
        }
        if (this.f12462g != cdVar.f12462g) {
            return false;
        }
        if (this.f12464i == null) {
            if (cdVar.f12464i != null) {
                return false;
            }
        } else if (!this.f12464i.equals(cdVar.f12464i)) {
            return false;
        }
        if (this.f12475t == null) {
            if (cdVar.f12475t != null) {
                return false;
            }
        } else if (!this.f12475t.equals(cdVar.f12475t)) {
            return false;
        }
        if (this.f12466k == null) {
            if (cdVar.f12466k != null) {
                return false;
            }
        } else if (!this.f12466k.equals(cdVar.f12466k)) {
            return false;
        }
        if (this.f12471p == null) {
            if (cdVar.f12471p != null) {
                return false;
            }
        } else if (!this.f12471p.equals(cdVar.f12471p)) {
            return false;
        }
        if (this.f12469n != cdVar.f12469n) {
            return false;
        }
        if (this.f12470o != cdVar.f12470o) {
            return false;
        }
        if (this.f12465j == null) {
            if (cdVar.f12465j != null) {
                return false;
            }
        } else if (!this.f12465j.equals(cdVar.f12465j)) {
            return false;
        }
        if (this.f12457b != cdVar.f12457b) {
            return false;
        }
        if (this.f12476u == null) {
            if (cdVar.f12476u != null) {
                return false;
            }
        } else if (!this.f12476u.equals(cdVar.f12476u)) {
            return false;
        }
        if (this.f12467l == null) {
            if (cdVar.f12467l != null) {
                return false;
            }
        } else if (!this.f12467l.equals(cdVar.f12467l)) {
            return false;
        }
        if (this.f12456a != cdVar.f12456a) {
            return false;
        }
        if (!Arrays.equals(this.f12458c, cdVar.f12458c)) {
            return false;
        }
        if (this.f12461f != cdVar.f12461f) {
            return false;
        }
        if (this.f12459d != cdVar.f12459d) {
            return false;
        }
        if (this.f12460e != cdVar.f12460e) {
            return false;
        }
        if (this.f12463h != cdVar.f12463h) {
            return false;
        }
        return true;
    }
}
