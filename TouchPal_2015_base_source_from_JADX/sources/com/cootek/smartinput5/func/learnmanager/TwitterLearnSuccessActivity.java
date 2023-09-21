package com.cootek.smartinput5.func.learnmanager;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

public class TwitterLearnSuccessActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        m8364a();
    }

    /* renamed from: a */
    private void m8364a() {
        String a = C1974m.m9063a((Context) this, (int) R.string.twitter_learn_success);
        new C2894d.C2895a(this).setTitle(a).setMessage(C1974m.m9063a((Context) this, (int) R.string.twitter_follow_chubao)).setPositiveButton(C1974m.m9063a((Context) this, (int) R.string.yes), new C1839s(this)).setNegativeButton(C1974m.m9063a((Context) this, (int) R.string.no), new C1838r(this)).setOnCancelListener(new C1837q(this)).show();
    }
}
