package com.cootek.smartinput5.plugin.typingrace;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1464at;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2244E;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.emoji.keyboard.touchpal.R;

public class Guide extends C1976b {

    /* renamed from: a */
    TextView f10617a;

    /* renamed from: b */
    Button f10618b;

    /* renamed from: c */
    Button f10619c;

    /* renamed from: d */
    Button f10620d;

    /* renamed from: e */
    Button f10621e;

    /* renamed from: f */
    Button f10622f;

    /* renamed from: g */
    String f10623g;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        String stringExtra = getIntent().getStringExtra(C2441Q.f10636a);
        if (!TextUtils.isEmpty(stringExtra)) {
            C2441Q.m11074a().mo8212a(C2441Q.f10636a, stringExtra);
        }
        if (C2441Q.m11074a().mo8211a(C2441Q.f10636a) == null) {
            C2441Q.m11074a().mo8212a(C2441Q.f10636a, "");
        }
        requestWindowFeature(1);
        setContentView(R.layout.race_guide);
        this.f10617a = (TextView) findViewById(R.id.guideText);
        this.f10618b = (Button) findViewById(R.id.buttonExit);
        this.f10619c = (Button) findViewById(R.id.buttonMoreProducts);
        this.f10620d = (Button) findViewById(R.id.buttonExitRace);
        this.f10621e = (Button) findViewById(R.id.buttonBegin);
        this.f10622f = (Button) findViewById(R.id.buttonDetail);
        this.f10617a.setMovementMethod(ScrollingMovementMethod.getInstance());
        C2448a aVar = new C2448a(this);
        this.f10618b.setOnClickListener(new C2451d(this));
        this.f10619c.setOnClickListener(new C2452e(this));
        this.f10620d.setOnClickListener(aVar);
        this.f10621e.setOnClickListener(new C2453f(this));
        this.f10622f.setOnClickListener(new C2454g(this));
        C2244E e = new C2244E();
        e.f9532d.add("description");
        e.f9532d.add("text");
        new C2373x(e).mo8060a((C2373x.C2376b) new C2431a(this, (C2448a) null));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
        System.gc();
    }

    /* renamed from: com.cootek.smartinput5.plugin.typingrace.Guide$a */
    private final class C2431a implements C2373x.C2376b {
        private C2431a() {
        }

        /* synthetic */ C2431a(Guide guide, C2448a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo4601a(C2259P p) {
            C2244E e = (C2244E) p;
            if (!TextUtils.isEmpty(e.f9533e)) {
                Guide.this.f10617a.setText(Html.fromHtml(e.f9533e, new C1464at(Guide.this), (Html.TagHandler) null));
                if (!TextUtils.isEmpty(e.f9534f)) {
                    Guide.this.f10623g = e.f9534f;
                    Guide.this.f10618b.setVisibility(8);
                    Guide.this.f10619c.setVisibility(8);
                    Guide.this.f10620d.setVisibility(0);
                    Guide.this.f10621e.setVisibility(0);
                    Guide.this.f10622f.setVisibility(0);
                }
            } else if (p.f9746O == 0) {
                Toast.makeText(Guide.this, C1974m.m9063a((Context) Guide.this, (int) R.string.race_connect_server_failed), 1).show();
                Guide.this.f10617a.setText(C1974m.m9063a((Context) Guide.this, (int) R.string.race_connect_server_failed));
            } else {
                Toast.makeText(Guide.this, C1974m.m9063a((Context) Guide.this, (int) R.string.race_cannot_obtain_information), 1).show();
                Guide.this.f10617a.setText(C1974m.m9063a((Context) Guide.this, (int) R.string.race_cannot_obtain_information));
            }
        }

        /* renamed from: b */
        public void mo4602b(C2259P p) {
        }
    }
}
