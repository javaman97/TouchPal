package com.cootek.smartinput5.func.resource.p055ui;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.cootek.smartinput5.func.asset.C1446c;
import com.cootek.smartinput5.func.asset.C1451h;
import com.cootek.smartinput5.func.resource.C1974m;

/* renamed from: com.cootek.smartinput5.func.resource.ui.c */
/* compiled from: TouchPalCustomizePreferenceActivity */
public class C1977c extends PreferenceActivity {

    /* renamed from: a */
    private boolean f6741a = true;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            mo4240a(bundle);
        } catch (C1451h e) {
            e.printStackTrace();
            C1446c.m6745a(this);
            this.f6741a = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4240a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f6741a) {
            mo4243b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4243b() {
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f6741a) {
            mo7244j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo7244j() {
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (this.f6741a) {
            mo4247d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4247d() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f6741a) {
            mo7238a(configuration);
        }
    }

    /* renamed from: a */
    public void mo7238a(Configuration configuration) {
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f6741a) {
            mo4238a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4238a() {
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f6741a) {
            return mo7240a(i, keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: a */
    public boolean mo7240a(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f6741a) {
            return mo7242b(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: b */
    public boolean mo7242b(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (this.f6741a) {
            return mo7243c(i, keyEvent);
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    /* renamed from: c */
    public boolean mo7243c(int i, KeyEvent keyEvent) {
        return super.onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        if (this.f6741a) {
            return mo7239a(i, i2, keyEvent);
        }
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    /* renamed from: a */
    public boolean mo7239a(int i, int i2, KeyEvent keyEvent) {
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.f6741a) {
            mo4246c(bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4246c(Bundle bundle) {
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f6741a) {
            mo4241a(z);
        }
    }

    /* renamed from: a */
    public void mo4241a(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (this.f6741a) {
            mo4244b(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4244b(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        if (this.f6741a) {
            mo7245k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo7245k() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (this.f6741a) {
            mo4245c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4245c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo7241b(int i) {
        return C1974m.m9063a((Context) this, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo7237a(int i, Object... objArr) {
        return C1974m.m9064a((Context) this, i, objArr);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f6741a) {
            return mo4254a(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* renamed from: a */
    public boolean mo4254a(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f6741a) {
            return mo4242a(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: a */
    public boolean mo4242a(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }
}
