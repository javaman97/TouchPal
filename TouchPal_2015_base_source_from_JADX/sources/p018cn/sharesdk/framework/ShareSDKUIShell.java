package p018cn.sharesdk.framework;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.ShareSDKUIShell */
public class ShareSDKUIShell extends Activity {

    /* renamed from: a */
    private static HashMap<String, FakeActivity> f1466a = new HashMap<>();

    /* renamed from: b */
    private FakeActivity f1467b;

    /* renamed from: a */
    public static String m3524a(FakeActivity fakeActivity) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        f1466a.put(valueOf, fakeActivity);
        return valueOf;
    }

    public void finish() {
        if (this.f1467b == null || !this.f1467b.onFinish()) {
            super.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f1467b != null) {
            this.f1467b.onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1467b != null) {
            this.f1467b.onConfigurationChanged(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("launch_time");
        this.f1467b = f1466a.remove(stringExtra);
        if (this.f1467b == null) {
            C0666e.m3838b(new RuntimeException("Executor lost! launchTime = " + stringExtra));
            super.onCreate(bundle);
            finish();
            return;
        }
        this.f1467b.setActivity(this);
        super.onCreate(bundle);
        this.f1467b.onCreate();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f1467b != null) {
            this.f1467b.sendResult();
            this.f1467b.onDestroy();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = false;
        if (this.f1467b != null) {
            z = this.f1467b.onKeyEvent(i, keyEvent);
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z = false;
        if (this.f1467b != null) {
            z = this.f1467b.onKeyEvent(i, keyEvent);
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        if (this.f1467b == null) {
            super.onNewIntent(intent);
        } else {
            this.f1467b.onNewIntent(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        if (this.f1467b != null) {
            this.f1467b.onPause();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        if (this.f1467b != null) {
            this.f1467b.onRestart();
        }
        super.onRestart();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        if (this.f1467b != null) {
            this.f1467b.onResume();
        }
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        if (this.f1467b != null) {
            this.f1467b.onStart();
        }
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (this.f1467b != null) {
            this.f1467b.onStop();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        setContentView(LayoutInflater.from(this).inflate(i, (ViewGroup) null));
    }

    public void setContentView(View view) {
        super.setContentView(view);
        if (this.f1467b != null) {
            this.f1467b.setContentView(view);
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        if (this.f1467b != null) {
            this.f1467b.setContentView(view);
        }
    }
}
