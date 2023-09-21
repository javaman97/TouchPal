package com.cootek.smartinput5.p066ui.settings;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.p066ui.C2725bE;
import com.cootek.smartinput5.p066ui.settings.SkinActivity;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.b */
/* compiled from: AsyncFragment */
public abstract class C3041b extends Fragment implements SkinActivity.C2973a {

    /* renamed from: a */
    private static final int f13971a = 0;

    /* renamed from: b */
    private static final int f13972b = 1;

    /* renamed from: c */
    private boolean f13973c;

    /* renamed from: d */
    private View f13974d = null;

    /* renamed from: e */
    private LayoutInflater f13975e;

    /* renamed from: f */
    private View f13976f;

    /* renamed from: g */
    private ArrayList<C3042a> f13977g = new ArrayList<>();

    /* renamed from: h */
    private Handler f13978h = new C3105c(this);

    /* renamed from: com.cootek.smartinput5.ui.settings.b$a */
    /* compiled from: AsyncFragment */
    public interface C3042a {
        /* renamed from: a */
        void mo10152a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10076a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Object mo10077c();

    /* renamed from: a */
    public void mo10150a(C3042a aVar) {
        if (!this.f13977g.contains(aVar)) {
            this.f13977g.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo10151b(C3042a aVar) {
        this.f13977g.remove(aVar);
    }

    /* renamed from: d */
    private void mo10146d() {
        this.f13978h.sendEmptyMessage(0);
    }

    /* renamed from: e */
    private void m14302e() {
        this.f13978h.removeMessages(0);
        this.f13978h.sendEmptyMessage(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m14303f() {
        if (this.f13976f != null) {
            this.f13976f.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.extract_progress));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m14304g() {
        if (this.f13976f != null) {
            this.f13976f.clearAnimation();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f13975e = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.async_fragment_loading, viewGroup, false);
        Drawable drawable = getActivity().getResources().getDrawable(R.drawable.extrat_progress);
        C2725bE bEVar = new C2725bE();
        bEVar.mo8998b(getActivity().getResources().getColor(R.color.skin_page_title_text_color), getActivity().getResources().getColor(R.color.skin_page_title_bg_color));
        Drawable a = bEVar.mo8995a(drawable);
        this.f13976f = inflate.findViewById(R.id.progress_img);
        this.f13976f.setBackgroundDrawable(a);
        this.f13974d = inflate;
        mo10146d();
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutInflater mo10148a() {
        return this.f13975e;
    }

    /* renamed from: b */
    public final void mo9982b() {
        if (!this.f13973c) {
            this.f13973c = true;
            new C3043b(this, (C3105c) null).execute(new String[0]);
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.b$b */
    /* compiled from: AsyncFragment */
    private class C3043b extends AsyncTask<String, Integer, Object> {
        private C3043b() {
        }

        /* synthetic */ C3043b(C3041b bVar, C3105c cVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object doInBackground(String... strArr) {
            return C3041b.this.mo10077c();
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            C3041b.this.m14305h();
            C3041b.this.mo10076a(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m14305h() {
        Iterator<C3042a> it = this.f13977g.iterator();
        while (it.hasNext()) {
            it.next().mo10152a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10149a(View view) {
        if (this.f13974d != null) {
            m14302e();
            RelativeLayout relativeLayout = (RelativeLayout) this.f13974d.findViewById(R.id.content_frame);
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            if (view != null) {
                relativeLayout.addView(view);
            }
        }
    }
}
