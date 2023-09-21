package com.facebook.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p001v4.content.C0213m;
import android.support.p001v4.view.C0333F;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.C3415g;
import com.facebook.ads.internal.adapters.p070a.C3358e;

/* renamed from: com.facebook.ads.t */
public class C3505t extends Activity {

    /* renamed from: a */
    public static final String f15157a = "viewType";

    /* renamed from: b */
    public static final String f15158b = "predefinedOrientationKey";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public RelativeLayout f15159c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3415g f15160d;

    /* renamed from: e */
    private int f15161e;

    /* renamed from: f */
    private int f15162f;

    /* renamed from: g */
    private int f15163g;

    /* renamed from: h */
    private boolean f15164h = false;

    /* renamed from: i */
    private String f15165i;

    /* renamed from: j */
    private C3358e.C3361b f15166j;

    /* renamed from: k */
    private C3358e f15167k;

    /* renamed from: l */
    private int f15168l = -1;

    /* renamed from: a */
    private void m15253a(int i, int i2) {
        boolean z = i2 >= i;
        int rotation = ((WindowManager) getSystemService("window")).getDefaultDisplay().getRotation();
        if (z) {
            switch (rotation) {
                case 1:
                case 2:
                    setRequestedOrientation(9);
                    return;
                default:
                    setRequestedOrientation(1);
                    return;
            }
        } else {
            switch (rotation) {
                case 2:
                case 3:
                    setRequestedOrientation(8);
                    return;
                default:
                    setRequestedOrientation(0);
                    return;
            }
        }
    }

    /* renamed from: a */
    private void m15254a(Intent intent, Bundle bundle) {
        if (bundle != null) {
            this.f15161e = bundle.getInt("lastRequestedOrientation", -1);
            this.f15165i = bundle.getString("adInterstitialUniqueId");
            this.f15164h = true;
            return;
        }
        this.f15162f = intent.getIntExtra("displayWidth", 0);
        this.f15163g = intent.getIntExtra("displayHeight", 0);
        this.f15165i = intent.getStringExtra("adInterstitialUniqueId");
        this.f15167k.mo10604a(intent, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15256a(String str) {
        C0213m.m882a((Context) this).mo696a(new Intent(str + ":" + this.f15165i));
    }

    public void finish() {
        this.f15159c.removeAllViews();
        this.f15167k.mo10607c();
        m15256a("com.facebook.ads.interstitial.dismissed");
        super.finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        this.f15159c = new RelativeLayout(this);
        this.f15159c.setBackgroundColor(C0333F.f835s);
        setContentView(this.f15159c, new RelativeLayout.LayoutParams(-1, -1));
        Intent intent = getIntent();
        if (intent.getBooleanExtra("useNativeCloseButton", false)) {
            this.f15160d = new C3415g(this);
            this.f15160d.setId(100002);
            this.f15160d.setOnClickListener(new C3506u(this));
        }
        this.f15166j = (C3358e.C3361b) intent.getSerializableExtra(f15157a);
        this.f15167k = C3358e.C3361b.m14792a(this.f15166j, this, new C3507v(this));
        this.f15168l = intent.getIntExtra(f15158b, -1);
        m15254a(intent, bundle);
        m15256a("com.facebook.ads.interstitial.displayed");
    }

    public void onPause() {
        super.onPause();
        this.f15167k.mo10603a();
    }

    public void onRestart() {
        super.onRestart();
        this.f15164h = true;
    }

    public void onResume() {
        super.onResume();
        this.f15167k.mo10606b();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f15167k.mo10605a(bundle);
        bundle.putInt("lastRequestedOrientation", this.f15161e);
        bundle.putString("adInterstitialUniqueId", this.f15165i);
        bundle.putSerializable(f15157a, this.f15166j);
    }

    public void onStart() {
        super.onStart();
        if (this.f15168l != -1) {
            setRequestedOrientation(this.f15168l);
        } else if (!(this.f15162f == 0 || this.f15163g == 0)) {
            if (!this.f15164h) {
                m15253a(this.f15162f, this.f15163g);
            } else if (this.f15161e >= 0) {
                setRequestedOrientation(this.f15161e);
                this.f15161e = -1;
            }
        }
        this.f15164h = false;
    }

    public void setRequestedOrientation(int i) {
        this.f15161e = i;
        super.setRequestedOrientation(i);
    }
}
