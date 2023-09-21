package com.cootek.smartinput5.func;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.cootek.smartinput5.func.asset.C1446c;
import com.cootek.smartinput5.func.asset.C1451h;
import com.cootek.smartinput5.func.resource.C1974m;

/* renamed from: com.cootek.smartinput5.func.bu */
/* compiled from: TouchPalActivity */
public class C1623bu extends Activity {

    /* renamed from: a */
    private boolean f5212a = true;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            mo4219a(bundle);
        } catch (C1451h e) {
            e.printStackTrace();
            C1446c.m6745a(this);
            this.f5212a = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4219a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f5212a) {
            mo4218a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4218a() {
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f5212a) {
            mo6354c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6354c() {
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (this.f5212a) {
            mo6357d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo6357d() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f5212a) {
            mo6346a(configuration);
        }
    }

    /* renamed from: a */
    public void mo6346a(Configuration configuration) {
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f5212a) {
            mo4220b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4220b() {
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f5212a) {
            return mo6349a(i, keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: a */
    public boolean mo6349a(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f5212a) {
            return mo6352b(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: b */
    public boolean mo6352b(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (this.f5212a) {
            return mo6356c(i, keyEvent);
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    /* renamed from: c */
    public boolean mo6356c(int i, KeyEvent keyEvent) {
        return super.onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        if (this.f5212a) {
            return mo6348a(i, i2, keyEvent);
        }
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    /* renamed from: a */
    public boolean mo6348a(int i, int i2, KeyEvent keyEvent) {
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.f5212a) {
            mo6351b(bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6351b(Bundle bundle) {
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f5212a) {
            mo6347a(z);
        }
    }

    /* renamed from: a */
    public void mo6347a(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (this.f5212a) {
            mo6355c(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6355c(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        if (this.f5212a) {
            mo6358e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo6358e() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (this.f5212a) {
            mo6359f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo6359f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo6344a(int i) {
        return C1974m.m9063a((Context) this, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo6345a(int i, Object... objArr) {
        return C1974m.m9064a((Context) this, i, objArr);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f5212a) {
            return mo6350a(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: a */
    public boolean mo6350a(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f5212a) {
            return mo6353b(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* renamed from: b */
    public boolean mo6353b(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}
