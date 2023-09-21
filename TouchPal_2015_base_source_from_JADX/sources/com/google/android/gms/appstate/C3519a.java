package com.google.android.gms.appstate;

import com.google.android.gms.internal.C3799r;

/* renamed from: com.google.android.gms.appstate.a */
public final class C3519a implements AppState {

    /* renamed from: h */
    private final int f15224h;

    /* renamed from: i */
    private final String f15225i;

    /* renamed from: j */
    private final byte[] f15226j;

    /* renamed from: k */
    private final boolean f15227k;

    /* renamed from: l */
    private final String f15228l;

    /* renamed from: m */
    private final byte[] f15229m;

    public C3519a(AppState appState) {
        this.f15224h = appState.getKey();
        this.f15225i = appState.getLocalVersion();
        this.f15226j = appState.getLocalData();
        this.f15227k = appState.hasConflict();
        this.f15228l = appState.getConflictVersion();
        this.f15229m = appState.getConflictData();
    }

    /* renamed from: a */
    static int m15318a(AppState appState) {
        return C3799r.hashCode(Integer.valueOf(appState.getKey()), appState.getLocalVersion(), appState.getLocalData(), Boolean.valueOf(appState.hasConflict()), appState.getConflictVersion(), appState.getConflictData());
    }

    /* renamed from: a */
    static boolean m15319a(AppState appState, Object obj) {
        if (!(obj instanceof AppState)) {
            return false;
        }
        if (appState == obj) {
            return true;
        }
        AppState appState2 = (AppState) obj;
        return C3799r.m16669a(Integer.valueOf(appState2.getKey()), Integer.valueOf(appState.getKey())) && C3799r.m16669a(appState2.getLocalVersion(), appState.getLocalVersion()) && C3799r.m16669a(appState2.getLocalData(), appState.getLocalData()) && C3799r.m16669a(Boolean.valueOf(appState2.hasConflict()), Boolean.valueOf(appState.hasConflict())) && C3799r.m16669a(appState2.getConflictVersion(), appState.getConflictVersion()) && C3799r.m16669a(appState2.getConflictData(), appState.getConflictData());
    }

    /* renamed from: b */
    static String m15320b(AppState appState) {
        return C3799r.m16670c(appState).mo12413a("Key", Integer.valueOf(appState.getKey())).mo12413a("LocalVersion", appState.getLocalVersion()).mo12413a("LocalData", appState.getLocalData()).mo12413a("HasConflict", Boolean.valueOf(appState.hasConflict())).mo12413a("ConflictVersion", appState.getConflictVersion()).mo12413a("ConflictData", appState.getConflictData()).toString();
    }

    /* renamed from: a */
    public AppState freeze() {
        return this;
    }

    public boolean equals(Object obj) {
        return m15319a(this, obj);
    }

    public byte[] getConflictData() {
        return this.f15229m;
    }

    public String getConflictVersion() {
        return this.f15228l;
    }

    public int getKey() {
        return this.f15224h;
    }

    public byte[] getLocalData() {
        return this.f15226j;
    }

    public String getLocalVersion() {
        return this.f15225i;
    }

    public boolean hasConflict() {
        return this.f15227k;
    }

    public int hashCode() {
        return m15318a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m15320b(this);
    }
}
