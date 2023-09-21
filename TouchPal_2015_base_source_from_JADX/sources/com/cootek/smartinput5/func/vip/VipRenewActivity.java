package com.cootek.smartinput5.func.vip;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import java.text.DecimalFormat;

public class VipRenewActivity extends Activity {

    /* renamed from: b */
    public static long f8958b;

    /* renamed from: a */
    C1246d f8959a;

    /* renamed from: c */
    private final int f8960c = 1000;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.vip_renew_guide);
        C1368X.m6317b((Context) this);
        if (C1368X.m6320c() != null) {
            this.f8959a = C1246d.m6010a((Context) this);
        }
        m9625a();
        if (this.f8959a != null) {
            this.f8959a.mo4591a(C1246d.f3871ci, "SHOW", C1246d.f3868cf);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (C1368X.m6324d()) {
            C1368X.m6325e();
        }
    }

    /* renamed from: a */
    private void m9625a() {
        m9629b();
        m9631d();
    }

    /* renamed from: b */
    private void m9629b() {
        ImageButton imageButton = (ImageButton) findViewById(R.id.vip_renew_back_btn);
        if (imageButton != null) {
            imageButton.setOnClickListener(new C2078L(this));
        }
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.vip_renew_share_btn);
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new C2079M(this));
        }
        TextView textView = (TextView) findViewById(R.id.share_btn_below);
        if (textView != null) {
            textView.setOnClickListener(new C2080N(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m9630c() {
        if (this.f8959a != null) {
            this.f8959a.mo4591a(C1246d.f3872cj, C1246d.f3874cl, C1246d.f3868cf);
        }
        C1584bI.m7128a((Activity) this, C1974m.m9063a((Context) this, (int) R.string.share), C1974m.m9063a((Context) this, (int) R.string.rate_us_share));
    }

    /* renamed from: d */
    private void m9631d() {
        C2089Q q = new C2089Q();
        ((TextView) findViewById(R.id.vip_cloud_acceleration_num)).setText("+" + new DecimalFormat("#%").format((double) q.mo7465c()));
        ((TextView) findViewById(R.id.vip_words_synced_num)).setText(String.valueOf(q.mo7464b()));
        ((TextView) findViewById(R.id.vip_stroke_saved_num)).setText(String.valueOf(q.mo7463a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m9627a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        f8958b = currentTimeMillis;
        if (currentTimeMillis - f8958b > j) {
            return true;
        }
        return false;
    }
}
