package com.cootek.smartinput5.plugin.typingrace;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.plugin.weibo.AuthorizeActivity;
import com.cootek.smartinput5.plugin.weibo.C2485i;
import com.emoji.keyboard.touchpal.R;
import com.weibo.net.C4039c;
import com.weibo.net.C4054q;
import com.weibo.net.C4057s;
import com.weibo.net.C4062x;
import java.util.ArrayList;

public class RankList extends C1976b {

    /* renamed from: a */
    public static final String f10685a = "PARAM_TOP_LIST_NAMES";

    /* renamed from: b */
    public static final String f10686b = "PARAM_TOP_LIST_MOBILES";

    /* renamed from: c */
    public static final String f10687c = "PARAM_TOP_LIST_SCORES";

    /* renamed from: d */
    public static final String f10688d = "PARAM_MY_NAME";

    /* renamed from: e */
    public static final String f10689e = "PARAM_MY_RANK";

    /* renamed from: f */
    public static final String f10690f = "PARAM_MY_BEST_SCORE";

    /* renamed from: g */
    private ArrayList<String> f10691g;

    /* renamed from: h */
    private ArrayList<String> f10692h;

    /* renamed from: i */
    private ArrayList<String> f10693i;

    /* renamed from: j */
    private String f10694j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f10695k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f10696l;

    /* renamed from: m */
    private TextView f10697m;

    /* renamed from: n */
    private TextView f10698n;

    /* renamed from: o */
    private TextView f10699o;

    /* renamed from: p */
    private Button f10700p;

    /* renamed from: q */
    private Button f10701q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ProgressDialog f10702r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Dialog f10703s;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10691g = getIntent().getStringArrayListExtra(f10685a);
        this.f10692h = getIntent().getStringArrayListExtra(f10686b);
        this.f10693i = getIntent().getStringArrayListExtra(f10687c);
        this.f10694j = getIntent().getStringExtra(f10688d);
        this.f10695k = getIntent().getIntExtra(f10689e, 0);
        this.f10696l = getIntent().getStringExtra(f10690f);
        requestWindowFeature(1);
        setContentView(R.layout.race_rank_list);
        this.f10697m = (TextView) findViewById(R.id.topListTextView);
        this.f10698n = (TextView) findViewById(R.id.myRankTextView);
        this.f10699o = (TextView) findViewById(R.id.myNameTextView);
        this.f10700p = (Button) findViewById(R.id.buttonRetry);
        this.f10701q = (Button) findViewById(R.id.buttonExit);
        this.f10697m.setMovementMethod(ScrollingMovementMethod.getInstance());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f10691g.size(); i++) {
            StringBuilder sb2 = new StringBuilder(this.f10692h.get(i));
            int max = Math.max(0, sb2.length() - 4);
            while (true) {
                int i2 = max - 1;
                if (max <= 0) {
                    break;
                }
                sb2.setCharAt(i2, '*');
                max = i2;
            }
            sb.append(getResString(R.string.race_rank_list_format, Integer.valueOf(i + 1), this.f10691g.get(i), sb2.toString()));
            if (i != this.f10691g.size() - 1) {
                sb.append(C0911j.f2473c);
            }
        }
        this.f10697m.setText(sb);
        this.f10698n.setText(String.valueOf(this.f10695k));
        this.f10699o.setText(this.f10694j);
        this.f10700p.setOnClickListener(new C2427D(this));
        this.f10701q.setOnClickListener(new C2430G(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        System.gc();
    }

    /* renamed from: a */
    public void mo8222a() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11132a(Context context) {
        C2485i.m11180a(new C2437M(this, context), new C2434J(this));
        Intent intent = new Intent(context, AuthorizeActivity.class);
        intent.addCategory("com.cootek.smartinput.intent.category.MINIMODE");
        context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11133a(Context context, String str) {
        C4057s a = C4057s.m17245a();
        C4062x xVar = new C4062x();
        xVar.mo15037a("source", C4057s.m17252c());
        xVar.mo15037a("status", str);
        Context context2 = context;
        new C4039c(a).mo14983a(context2, C4057s.f16519a + "statuses/update.json", xVar, C4054q.f16509e, new C2438N(this, context));
    }
}
