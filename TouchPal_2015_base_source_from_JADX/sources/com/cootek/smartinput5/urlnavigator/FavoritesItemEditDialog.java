package com.cootek.smartinput5.urlnavigator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

public class FavoritesItemEditDialog extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C3259a f14341c;

    /* renamed from: a */
    public String f14342a;

    /* renamed from: b */
    public String f14343b;

    /* renamed from: com.cootek.smartinput5.urlnavigator.FavoritesItemEditDialog$a */
    interface C3259a {
        /* renamed from: a */
        void mo10428a(Context context);

        /* renamed from: a */
        boolean mo10429a(Context context, String str, String str2);

        /* renamed from: b */
        void mo10430b(Context context, String str, String str2);
    }

    /* renamed from: a */
    public static void m14474a(C3259a aVar) {
        f14341c = aVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f14342a = intent.getStringExtra("url");
        this.f14343b = intent.getStringExtra("description");
        requestWindowFeature(3);
        setTitle(C1974m.m9063a((Context) this, (int) R.string.url_navigator_edit));
        setContentView(R.layout.url_navigator_edit_item);
        setFeatureDrawableResource(3, R.drawable.url_navigator_icon);
        EditText editText = (EditText) findViewById(R.id.urlTextView);
        EditText editText2 = (EditText) findViewById(R.id.descriptionTextView);
        ((Button) findViewById(R.id.buttonOK)).setOnClickListener(new C3263d(this, editText, editText2));
        ((Button) findViewById(R.id.buttonCancel)).setOnClickListener(new C3264e(this));
        editText.setText(this.f14342a);
        editText2.setText(this.f14343b);
        editText.selectAll();
    }

    public void onBackPressed() {
        m14476b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m14476b() {
        finish();
        if (f14341c != null) {
            f14341c.mo10428a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        f14341c = null;
        super.onDestroy();
    }
}
