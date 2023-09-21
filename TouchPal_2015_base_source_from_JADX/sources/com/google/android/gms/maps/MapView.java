package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.C3541a;
import com.google.android.gms.dynamic.C3552c;
import com.google.android.gms.dynamic.C3553d;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.internal.C3802s;
import com.google.android.gms.maps.internal.C3888p;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class MapView extends FrameLayout {

    /* renamed from: gD */
    private final C3829b f15983gD;

    /* renamed from: gz */
    private GoogleMap f15984gz;

    /* renamed from: com.google.android.gms.maps.MapView$a */
    static class C3828a implements LifecycleDelegate {

        /* renamed from: gE */
        private final ViewGroup f15985gE;

        /* renamed from: gF */
        private final IMapViewDelegate f15986gF;

        /* renamed from: gG */
        private View f15987gG;

        public C3828a(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
            this.f15986gF = (IMapViewDelegate) C3802s.m16678d(iMapViewDelegate);
            this.f15985gE = (ViewGroup) C3802s.m16678d(viewGroup);
        }

        /* renamed from: bj */
        public IMapViewDelegate mo12644bj() {
            return this.f15986gF;
        }

        public void onCreate(Bundle bundle) {
            try {
                this.f15986gF.onCreate(bundle);
                this.f15987gG = (View) C3552c.m15489a(this.f15986gF.getView());
                this.f15985gE.removeAllViews();
                this.f15985gE.addView(this.f15987gG);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public void onDestroy() {
            try {
                this.f15986gF.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public void onLowMemory() {
            try {
                this.f15986gF.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.f15986gF.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.f15986gF.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.f15986gF.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.MapView$b */
    static class C3829b extends C3541a<C3828a> {

        /* renamed from: gC */
        protected C3553d<C3828a> f15988gC;

        /* renamed from: gH */
        private final ViewGroup f15989gH;

        /* renamed from: gI */
        private final GoogleMapOptions f15990gI;
        private final Context mContext;

        C3829b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f15989gH = viewGroup;
            this.mContext = context;
            this.f15990gI = googleMapOptions;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11041a(C3553d<C3828a> dVar) {
            this.f15988gC = dVar;
            mo12645bi();
        }

        /* renamed from: bi */
        public void mo12645bi() {
            if (this.f15988gC != null && mo11042at() == null) {
                try {
                    this.f15988gC.mo11052a(new C3828a(this.f15989gH, C3888p.m16809i(this.mContext).mo12773a(C3552c.m15490f(this.mContext), this.f15990gI)));
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    }

    public MapView(Context context) {
        super(context);
        this.f15983gD = new C3829b(this, context, (GoogleMapOptions) null);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15983gD = new C3829b(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15983gD = new C3829b(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f15983gD = new C3829b(this, context, googleMapOptions);
    }

    public final GoogleMap getMap() {
        if (this.f15984gz != null) {
            return this.f15984gz;
        }
        this.f15983gD.mo12645bi();
        if (this.f15983gD.mo11042at() == null) {
            return null;
        }
        try {
            this.f15984gz = new GoogleMap(((C3828a) this.f15983gD.mo11042at()).mo12644bj().getMap());
            return this.f15984gz;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void onCreate(Bundle bundle) {
        this.f15983gD.onCreate(bundle);
        if (this.f15983gD.mo11042at() == null) {
            this.f15983gD.mo11040a((FrameLayout) this);
        }
    }

    public final void onDestroy() {
        this.f15983gD.onDestroy();
    }

    public final void onLowMemory() {
        this.f15983gD.onLowMemory();
    }

    public final void onPause() {
        this.f15983gD.onPause();
    }

    public final void onResume() {
        this.f15983gD.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f15983gD.onSaveInstanceState(bundle);
    }
}
