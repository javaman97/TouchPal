package com.cootek.smartinput5.func.vip;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.func.iab.C1769ah;
import com.cootek.smartinput5.func.iab.C1778f;
import com.cootek.smartinput5.func.iab.C1789h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2245F;
import com.cootek.smartinput5.net.login.C2339l;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.settings.OnlineShopActivity;
import com.cootek.smartinput5.p066ui.settings.TouchPalCloudActivity;
import com.emoji.keyboard.touchpal.R;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class PurchaseVipActivity extends C1976b {

    /* renamed from: a */
    public static final String f8895a = "vip";

    /* renamed from: b */
    public static final String f8896b = "original_price";

    /* renamed from: c */
    public static final String f8897c = "current_price";

    /* renamed from: d */
    public static final String f8898d = "origin";

    /* renamed from: e */
    public static int f8899e = 604800;

    /* renamed from: g */
    private static final boolean f8900g = true;

    /* renamed from: h */
    private static final String f8901h = "PurchaseVipActivity";

    /* renamed from: i */
    private static final int f8902i = 1;

    /* renamed from: j */
    private static final int f8903j = 2;

    /* renamed from: k */
    private static final int f8904k = 4;

    /* renamed from: l */
    private static final int f8905l = 7;

    /* renamed from: n */
    private static final String[] f8906n = {"emoji", "cloud input", "cloud backup", "clipboard"};

    /* renamed from: A */
    private int f8907A = 0;

    /* renamed from: B */
    private C2373x f8908B = null;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f8909C = false;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public String f8910D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f8911E = false;

    /* renamed from: f */
    C1246d f8912f;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C2088e f8913m;

    /* renamed from: o */
    private final int[] f8914o = {R.drawable.vip_feature_icon_emoji, R.drawable.vip_feature_icon_cloudinput, R.drawable.vip_feature_icon_cloudbackup, R.drawable.vip_feature_icon_clipboard};

    /* renamed from: p */
    private final int[] f8915p = {R.string.vip_feature_title_emoji, R.string.vip_feature_title_cloud_predict, R.string.vip_feature_title_cloud_backup, R.string.vip_feature_title_clipboard};

    /* renamed from: q */
    private final int[] f8916q = {R.string.vip_feature_subtitle_emoji, R.string.vip_feature_subtitle_cloud_predict, R.string.vip_feature_subtitle_cloud_backup, R.string.vip_feature_subtitle_clipboard};

    /* renamed from: r */
    private final int[] f8917r = {R.string.mission_instruction_title, R.string.mission_instruction_title, R.string.mission_instruction_title, R.string.mission_instruction_title};

    /* renamed from: s */
    private final Runnable[] f8918s = {new C2091a(this), new C2099i(this), new C2100j(this), new C2101k(this)};

    /* renamed from: t */
    private C2084a f8919t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public LayoutInflater f8920u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f8921v;

    /* renamed from: w */
    private ImageView f8922w;

    /* renamed from: x */
    private C2086c f8923x = new C2086c(this, (C2091a) null);
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f8924y = false;

    /* renamed from: z */
    private boolean f8925z = false;

    /* renamed from: com.cootek.smartinput5.func.vip.PurchaseVipActivity$d */
    public enum C2087d {
        VIPRENEW
    }

    /* renamed from: com.cootek.smartinput5.func.vip.PurchaseVipActivity$e */
    private enum C2088e {
        REFRESHING,
        NONMEMBER,
        MEMBER
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        C1368X.m6317b((Context) this);
        if (C1368X.m6320c() != null) {
            this.f8912f = C1246d.m6010a((Context) this);
        }
        setContentView(R.layout.vip_purchase_new);
        m9525h();
        C1730E.m7962a((Context) this);
        C1730E.m7972a((C1746T.C1747a) this.f8923x);
        m9511b(false);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* renamed from: a */
    private void m9496a() {
        this.f8922w = (ImageView) findViewById(R.id.refresh_img);
        View findViewById = findViewById(R.id.refresh_frame);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C2102l(this));
        }
    }

    /* renamed from: b */
    private void m9507b() {
        View findViewById = findViewById(R.id.info_btn);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C2103m(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m9513c() {
        Intent intent = new Intent(this, TouchPalCloudActivity.class);
        intent.setFlags(Engine.EXCEPTION_ERROR);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m9517d() {
        Intent intent = new Intent(this, TouchPalCloudActivity.class);
        intent.setFlags(Engine.EXCEPTION_ERROR);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m9519e() {
        if (C1132b.m5654a((Context) this).mo4392a(C1135d.ONLINE_SHOP, Boolean.valueOf(C1593bR.m7162a().f5075a)).booleanValue()) {
            C1368X.m6320c().mo5825K().launchShop(1, OnlineShopActivity.f13566m);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6684b((Context) this);
        }
        m9527i();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6668a(i, i2, intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m9522f() {
        Intent intent = new Intent();
        intent.setClass(this, VipInfoActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1730E.m7996b((C1746T.C1747a) this.f8923x);
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6686f();
        }
        if (C1368X.m6324d()) {
            C1368X.m6325e();
        }
        m9523g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9504a(String str, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        m9523g();
        C1789h.m8227a().mo6795a((Context) this, (C1789h.C1791b) new C2104n(this, z, str, onCancelListener));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m9523g() {
        this.f8909C = false;
        C1789h.m8227a().mo6796b();
    }

    /* renamed from: h */
    private void m9525h() {
        m9496a();
        m9507b();
        m9532k();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m9527i() {
        if (this.f8925z) {
            m9505a(false);
            m9498a(C2088e.REFRESHING);
            return;
        }
        boolean b = C1617br.m7367a().mo6335b();
        this.f8913m = C2088e.NONMEMBER;
        if (b) {
            this.f8913m = C2088e.MEMBER;
        }
        m9498a(this.f8913m);
        m9505a(b);
    }

    /* renamed from: a */
    private void m9498a(C2088e eVar) {
        m9509b(eVar);
        m9514c(eVar);
    }

    /* renamed from: b */
    private void m9509b(C2088e eVar) {
        TextView textView = (TextView) findViewById(R.id.lock_state_text);
        textView.setVisibility(0);
        switch (eVar) {
            case NONMEMBER:
                textView.setTextColor(getResources().getColor(R.color.vip_state_text_before_member_color));
                textView.setText("");
                return;
            case MEMBER:
                textView.setTextColor(getResources().getColor(R.color.vip_state_text_member_color));
                textView.setText(C1974m.m9063a((Context) this, (int) R.string.vip_state_text_member));
                return;
            default:
                textView.setText(C1974m.m9063a((Context) this, (int) R.string.vip_setup));
                textView.setTextColor(getResources().getColor(R.color.vip_state_text_before_member_color));
                return;
        }
    }

    /* renamed from: c */
    private void m9514c(C2088e eVar) {
        View findViewById = findViewById(R.id.upgrade_frame);
        TextView textView = (TextView) findViewById(R.id.upgrade_price);
        ImageView imageView = (ImageView) findViewById(R.id.upgrade_refresh_img);
        switch (eVar) {
            case NONMEMBER:
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new C2105o(this));
                textView.setVisibility(0);
                textView.setText(m9529j());
                imageView.clearAnimation();
                imageView.setVisibility(8);
                return;
            case MEMBER:
                imageView.clearAnimation();
                findViewById.setVisibility(8);
                return;
            default:
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new C2106p(this));
                textView.setVisibility(8);
                imageView.setVisibility(0);
                imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.vip_refreshing));
                return;
        }
    }

    /* renamed from: j */
    private String m9529j() {
        if (!TextUtils.isEmpty(this.f8921v)) {
            return C1974m.m9063a((Context) this, (int) R.string.currency_unit) + this.f8921v;
        }
        return C1974m.m9063a((Context) this, (int) R.string.purchase_vip_price_fallback_title);
    }

    /* renamed from: k */
    private void m9532k() {
        ListView listView = (ListView) findViewById(R.id.feature_list);
        if (listView != null) {
            if (this.f8919t == null) {
                this.f8919t = new C2084a();
            }
            this.f8919t.mo7452a(m9533l());
            listView.setAdapter(this.f8919t);
            listView.setDivider(new ColorDrawable(getResources().getColor(R.color.vip_purchase_bg_color)));
            listView.setFadingEdgeLength(0);
            listView.setCacheColorHint(getResources().getColor(R.color.vip_purchase_bg_color));
        }
    }

    /* renamed from: a */
    private C1135d m9491a(int i) {
        switch (i) {
            case 0:
                return C1135d.OEM_PURCHASE_VIP_CLOUDBACKUP;
            case 1:
                return C1135d.OEM_PURCHASE_VIP_CLOUDINPUT;
            default:
                return C1135d.OEM_PURCHASE_VIP_EMOJI;
        }
    }

    /* renamed from: l */
    private ArrayList<C2085b> m9533l() {
        ArrayList<C2085b> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f8914o.length; i++) {
            if (!C1132b.m5662a() || C1132b.m5654a((Context) this).mo4392a(m9491a(i), (Boolean) true).booleanValue()) {
                C2085b bVar = new C2085b(this.f8914o[i], this.f8915p[i], this.f8916q[i]);
                bVar.mo7459a(this.f8917r[i]);
                bVar.mo7460a(this.f8918s[i]);
                bVar.mo7461a(f8906n[i]);
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m9505a(boolean z) {
        if (this.f8919t != null) {
            this.f8919t.mo7453a(z);
            this.f8919t.notifyDataSetChanged();
        }
    }

    /* renamed from: com.cootek.smartinput5.func.vip.PurchaseVipActivity$a */
    public class C2084a extends BaseAdapter {

        /* renamed from: b */
        private ArrayList<C2085b> f8928b;

        public C2084a() {
        }

        /* renamed from: a */
        public void mo7453a(boolean z) {
            if (this.f8928b != null) {
                Iterator<C2085b> it = this.f8928b.iterator();
                while (it.hasNext()) {
                    it.next().mo7462a(z);
                }
            }
        }

        /* renamed from: a */
        public void mo7452a(ArrayList<C2085b> arrayList) {
            this.f8928b = arrayList;
        }

        public int getCount() {
            if (this.f8928b != null) {
                return this.f8928b.size();
            }
            return 0;
        }

        public Object getItem(int i) {
            if (this.f8928b != null) {
                this.f8928b.get(i);
            }
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (this.f8928b != null) {
                return this.f8928b.get(i).mo7458a(view);
            }
            return null;
        }
    }

    /* renamed from: a */
    private String m9495a(String str) {
        return C1974m.m9063a((Context) this, (int) R.string.currency_unit) + str;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m9536m() {
        if (!this.f8909C) {
            this.f8909C = true;
            if (C1730E.m8004c()) {
                C1730E.m8005d().mo6674a((Activity) this, f8895a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m9492a(int i, int i2, C2245F.C2246a aVar) {
        if (i != 200) {
            return C1769ah.m8131b(this, i);
        }
        if (i2 == 0) {
            return C1974m.m9063a((Context) this, (int) R.string.iab_error_purchase_failed);
        }
        return C1974m.m9063a((Context) this, (int) R.string.iab_error_purchase_failed) + C1769ah.m8125a((Context) this, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9497a(int i, String str, String str2) {
        if (!C1730E.m8004c()) {
            m9523g();
            Toast.makeText(this, C1974m.m9063a((Context) this, (int) R.string.iab_error_purchase_failed), 1).show();
        } else if (C1730E.m8005d().mo6687g(str2)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C1730E.f5651e, str);
                jSONObject.put(C1730E.f5652f, str2);
                jSONObject.put(C1730E.f5658l, true);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C1730E.m8005d().mo6673a((Activity) this, i, "Google", jSONObject);
        } else {
            m9523g();
            Toast.makeText(this, C1974m.m9063a((Context) this, (int) R.string.iab_error_purchase_not_supported), 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9511b(boolean z) {
        if (!this.f8925z) {
            if (C2339l.f10313m.equals(C1617br.m7367a().mo6340g().mo7965e())) {
                m9505a(true);
            } else {
                m9505a(false);
            }
            m9537n();
        }
    }

    /* renamed from: n */
    private void m9537n() {
        this.f8925z = true;
        this.f8907A = 0;
        m9527i();
        m9539o();
        C1730E.m8005d().mo6685e();
        C1617br.m7367a().mo6328a((C1617br.C1618a) this.f8923x);
        C1769ah.m8123a((Context) this, (C1769ah.C1771b) new C2092b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9508b(int i) {
        this.f8907A |= i;
        if (!isFinishing() && this.f8907A == 7) {
            this.f8925z = false;
            m9541p();
            m9527i();
            if (this.f8912f != null) {
                this.f8912f.mo4591a(C1246d.f3884cv, C1617br.m7367a().mo6340g().mo7965e(), C1246d.f3869cg);
            }
        }
    }

    /* renamed from: o */
    private void m9539o() {
        if (this.f8922w != null) {
            this.f8922w.startAnimation(AnimationUtils.loadAnimation(this, R.anim.vip_refreshing));
        }
    }

    /* renamed from: p */
    private void m9541p() {
        if (this.f8922w != null) {
            this.f8922w.clearAnimation();
        }
    }

    /* renamed from: com.cootek.smartinput5.func.vip.PurchaseVipActivity$b */
    public class C2085b {

        /* renamed from: b */
        private int f8930b;

        /* renamed from: c */
        private int f8931c;

        /* renamed from: d */
        private int f8932d;

        /* renamed from: e */
        private int f8933e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f8934f = null;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Runnable f8935g;

        /* renamed from: h */
        private boolean f8936h = false;

        public C2085b(int i, int i2, int i3) {
            this.f8930b = i;
            this.f8931c = i2;
            this.f8932d = i3;
        }

        /* renamed from: a */
        public void mo7461a(String str) {
            this.f8934f = str;
        }

        /* renamed from: a */
        public void mo7459a(int i) {
            this.f8933e = i;
        }

        /* renamed from: a */
        public void mo7462a(boolean z) {
            if (!this.f8934f.equals("clipboard")) {
                this.f8936h = z;
            } else {
                this.f8936h = false;
            }
        }

        /* renamed from: a */
        public void mo7460a(Runnable runnable) {
            this.f8935g = runnable;
        }

        /* renamed from: a */
        public View mo7458a(View view) {
            if (view == null) {
                if (PurchaseVipActivity.this.f8920u == null) {
                    LayoutInflater unused = PurchaseVipActivity.this.f8920u = (LayoutInflater) PurchaseVipActivity.this.getSystemService("layout_inflater");
                }
                view = PurchaseVipActivity.this.f8920u.inflate(R.layout.purchase_feature_list_item, (ViewGroup) null);
                view.setOnClickListener(new C2107q(this));
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.img);
            if (imageView != null) {
                imageView.setImageResource(this.f8930b);
            }
            TextView textView = (TextView) view.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(C1974m.m9063a((Context) PurchaseVipActivity.this, this.f8931c));
            }
            TextView textView2 = (TextView) view.findViewById(R.id.subtitle);
            if (textView2 != null) {
                textView2.setText(C1974m.m9063a((Context) PurchaseVipActivity.this, this.f8932d));
            }
            Button button = (Button) view.findViewById(R.id.action_btn);
            if (button != null) {
                if (this.f8936h) {
                    button.setVisibility(0);
                    button.setText(C1974m.m9063a((Context) PurchaseVipActivity.this, this.f8933e));
                    button.setOnClickListener(new C2108r(this));
                } else {
                    button.setVisibility(8);
                }
            }
            return view;
        }
    }

    /* renamed from: q */
    private String m9542q() {
        String j = m9529j();
        String format = DateFormat.getDateInstance(2, getResources().getConfiguration().locale).format(Long.valueOf((C1617br.m7367a().mo6336c() + ((long) f8899e)) * 1000));
        return String.format(getResString(R.string.vip_purchase_success), new Object[]{format, j});
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m9543r() {
        C1789h.m8227a().mo6794a((Context) this, (C1789h.C1790a) new C2093c(this));
    }

    /* renamed from: com.cootek.smartinput5.func.vip.PurchaseVipActivity$c */
    private class C2086c implements C1617br.C1618a, C1746T.C1747a, C1769ah.C1771b {
        private C2086c() {
        }

        /* synthetic */ C2086c(PurchaseVipActivity purchaseVipActivity, C2091a aVar) {
            this();
        }

        public void onPurchaseFinished(int i, String str) {
            PurchaseVipActivity.this.m9523g();
            boolean unused = PurchaseVipActivity.this.f8909C = false;
            if ("purchase_success".equals(str)) {
                if (PurchaseVipActivity.this.f8912f != null) {
                    PurchaseVipActivity.this.f8912f.mo4591a(C1246d.f3880cr, C1246d.f3882ct, C1246d.f3867ce);
                }
                PurchaseVipActivity.this.m9504a("", false, (DialogInterface.OnCancelListener) new C2109s(this));
                C1617br.m7367a().mo6328a((C1617br.C1618a) new C2110t(this));
            }
        }

        public void onUpdateFinished() {
            if (C1730E.m8004c()) {
                C1730E.m8005d().mo6679a(PurchaseVipActivity.this.f8910D, (C1746T.C1750d) null);
            }
        }

        public void onSetupFinished() {
            PurchaseVipActivity.this.m9508b(1);
        }

        public void onServiceDisconnected() {
        }

        /* renamed from: a */
        public void mo6765a(int i, int i2, C2245F.C2246a aVar) {
            if (PurchaseVipActivity.this.f8924y) {
                PurchaseVipActivity.this.m9523g();
            } else if (aVar != null) {
                if (aVar.mo7805r() || !C2088e.NONMEMBER.equals(PurchaseVipActivity.this.f8913m)) {
                    String unused = PurchaseVipActivity.this.f8910D = C1778f.f5819am;
                } else {
                    String unused2 = PurchaseVipActivity.this.f8910D = C1778f.f5818al;
                }
                PurchaseVipActivity.this.m9497a(aVar.mo7788a(), aVar.mo7810w(), PurchaseVipActivity.this.f8910D);
            } else {
                PurchaseVipActivity.this.m9523g();
                if (C2188Q.m9853a().mo7686f()) {
                    Toast.makeText(PurchaseVipActivity.this, PurchaseVipActivity.this.m9492a(i, i2, aVar), 1).show();
                    return;
                }
                PurchaseVipActivity.this.m9545t();
            }
        }

        /* renamed from: a */
        public void mo6073a(boolean z) {
            if (C2339l.f10312l.equals(C1617br.m7367a().mo6340g().mo7965e())) {
                PurchaseVipActivity.this.m9544s();
            } else {
                PurchaseVipActivity.this.m9508b(2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m9544s() {
        C1769ah.m8123a((Context) this, (C1769ah.C1771b) new C2096f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m9545t() {
        C1789h.m8227a().mo6794a((Context) this, (C1789h.C1790a) new C2097g(this));
    }
}
