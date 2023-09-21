package com.cootek.smartinput5.plugin.weibo;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.emoji.keyboard.touchpal.R;
import com.weibo.net.C4039c;
import com.weibo.net.C4054q;
import com.weibo.net.C4057s;
import com.weibo.net.C4061w;
import com.weibo.net.C4062x;
import java.io.IOException;

public class FollowActivity extends C1976b implements C4039c.C4040a {

    /* renamed from: c */
    private static final String f10747c = "1885690170";

    /* renamed from: a */
    C4057s f10748a = C4057s.m17245a();

    /* renamed from: b */
    Handler f10749b = new Handler();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.weibo_follow);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        new C2476a().execute(new Object[]{getIntent(), this});
    }

    /* renamed from: com.cootek.smartinput5.plugin.weibo.FollowActivity$a */
    private class C2476a extends AsyncTask<Object, Object, Object> {
        private C2476a() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (C2485i.m11181a()) {
                C2485i.m11182b();
            }
        }

        /* access modifiers changed from: protected */
        public Object doInBackground(Object... objArr) {
            if (C2477a.m11173a().mo8268b()) {
                FollowActivity.this.f10748a.mo15019a(C2477a.m11173a().mo8270d());
            } else {
                C2477a.m11173a().mo8267a(FollowActivity.this.f10748a.mo15024b());
            }
            if (!C2485i.m11181a()) {
                FollowActivity.this.m11166a();
                return null;
            }
            C2485i.m11183c();
            return null;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            FollowActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11166a() {
        try {
            m11168a("abc", "");
        } catch (C4061w e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m11168a(String str, String str2) throws C4061w {
        C4057s a = C4057s.m17245a();
        if (a != null && a.mo15024b() != null) {
            a.mo15022a((Activity) this, a.mo15024b().mo14995a(), a.mo15024b().mo15005e(), str, str2);
        }
    }

    /* renamed from: b */
    private void m11169b() {
        C4057s a = C4057s.m17245a();
        C4062x xVar = new C4062x();
        xVar.mo15037a("source", C4057s.m17252c());
        xVar.mo15037a("user_id", f10747c);
        new C4039c(a).mo14983a(this, C4057s.f16519a + "friendships/create.json", xVar, C4054q.f16509e, this);
    }

    /* renamed from: a */
    public void mo8208a(String str) {
        Toast.makeText(this, "success", 1).show();
        Log.e("ErrorMessage", "success");
    }

    /* renamed from: a */
    public void mo8206a(C4061w wVar) {
        String message;
        if (wVar.mo15031a() == 400) {
            message = "user not exist!";
        } else if (wVar.mo15031a() == 403) {
            message = "follow already!";
        } else {
            message = wVar.getMessage();
        }
        Toast.makeText(this, message, 1).show();
    }

    /* renamed from: a */
    public void mo8207a(IOException iOException) {
    }
}
