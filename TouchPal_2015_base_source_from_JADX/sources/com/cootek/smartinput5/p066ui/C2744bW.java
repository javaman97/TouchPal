package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.engine.SurfaceManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.control.C2877u;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.bW */
/* compiled from: SoftCandidatePad */
public class C2744bW extends C2811cf implements CandidateManager.ICandidateListener {

    /* renamed from: a */
    int f12242a;

    /* renamed from: aj */
    private final int f12243aj;

    /* renamed from: ak */
    private final int f12244ak;

    /* renamed from: al */
    private CandidateManager.ICandidateProvider f12245al;

    /* renamed from: am */
    private int[][] f12246am;

    /* renamed from: an */
    private int f12247an;

    /* renamed from: ao */
    private int f12248ao;

    /* renamed from: ap */
    private C2877u f12249ap;

    /* renamed from: b */
    int f12250b;

    /* renamed from: c */
    int f12251c;

    /* renamed from: d */
    int f12252d;

    /* renamed from: e */
    ArrayList<C2806cb> f12253e;

    public C2744bW(String str) {
        this(str, 0);
    }

    public C2744bW(String str, int i) {
        super(str, i);
        this.f12249ap = new C2745bX(this, this.f12541N, this.f12542O, 2);
        this.f12243aj = this.f12541N;
        this.f12244ak = this.f12542O;
        this.f12253e = new ArrayList<>(this.f12243aj * this.f12244ak);
        this.f12249ap.mo9546a();
        this.f12247an = 0;
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        this.f12245al = iCandidateProvider;
        this.f12249ap.mo9546a();
        this.f12246am = this.f12249ap.mo9550e();
        this.f12247an = 0;
        m12536f();
    }

    /* renamed from: a */
    public void mo9016a(int i) {
        this.f12248ao = this.f12247an;
        if (i == 3276809) {
            this.f12246am = this.f12249ap.mo9550e();
            this.f12247an++;
        } else if (i == 3276808) {
            this.f12246am = this.f12249ap.mo9549d();
            this.f12247an--;
        }
        if (this.f12246am == null && this.f12247an != 0 && Engine.isInitialized()) {
            Engine.getInstance().getSurfaceManager().setAnimationType(SurfaceManager.SlipAnimationType.ANIM_NONE);
        }
        if (this.f12247an == -1) {
            C1368X.m6320c().mo5844q().mo5859a((int) R.string.accessibility_next_page_already_top);
        } else {
            C1368X.m6320c().mo5844q().mo5861a("@string/accessibility_next_page&" + (this.f12247an + 1));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9018c() {
        return this.f12247an;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9019d() {
        return this.f12247an <= 0 && this.f12249ap.mo9548c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public CandidateItem mo9017b(int i) {
        return this.f12245al.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo9020e() {
        m12536f();
        super.mo9020e();
    }

    /* renamed from: a */
    public void mo7433a() {
        m12536f();
        super.mo7433a();
    }

    /* renamed from: f */
    private void m12536f() {
        int i;
        if (this.f12246am != null || this.f12247an == 0) {
            C2806cb b = mo9182b("sk_free_space");
            if (b != null) {
                this.f12242a = b.f12453x;
                this.f12250b = b.f12454y;
                this.f12251c = b.width;
                this.f12252d = b.height;
                this.f12545R.remove(b);
            }
            this.f12545R.removeAll(this.f12253e);
            this.f12253e.clear();
            if (this.f12246am != null) {
                int i2 = this.f12242a;
                int i3 = this.f12250b;
                int i4 = this.f12251c;
                int i5 = this.f12252d;
                int i6 = i4 / this.f12244ak;
                int i7 = i5 / this.f12243aj;
                int n = mo9192n();
                int i8 = i2;
                int i9 = i3;
                int i10 = 0;
                while (i10 < this.f12243aj) {
                    int i11 = 0;
                    int i12 = i8;
                    SoftCandidate softCandidate = null;
                    int i13 = 0;
                    while (i11 < this.f12244ak && (i = this.f12246am[i10][i11]) != -1) {
                        if (softCandidate == null || i != softCandidate.candidateIndex) {
                            softCandidate = new SoftCandidate(this);
                            softCandidate.keyName = "sk_" + (i10 + 1) + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + i13;
                            softCandidate.candidateIndex = i;
                            if (SurfaceManager.isRightToLeftMode) {
                                softCandidate.f12453x = n - (i12 + i6);
                            } else {
                                softCandidate.f12453x = i12;
                            }
                            softCandidate.f12454y = i9;
                            softCandidate.width = i6;
                            softCandidate.height = i7;
                            softCandidate.prepareData();
                            this.f12253e.add(softCandidate);
                            this.f12545R.add(softCandidate);
                            i13++;
                        } else {
                            softCandidate.width += i6;
                        }
                        i12 += i6;
                        i11++;
                    }
                    i8 = this.f12242a;
                    i9 += i7;
                    i10++;
                }
            }
            Iterator it = this.f12545R.iterator();
            while (it.hasNext()) {
                ((C2806cb) it.next()).updateDisplay();
            }
            if (this.f12546S != null) {
                this.f12546S.setKeyboardData(this);
                if (this.f12246am == null) {
                    this.f12546S.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        this.f12247an = this.f12248ao;
    }
}
