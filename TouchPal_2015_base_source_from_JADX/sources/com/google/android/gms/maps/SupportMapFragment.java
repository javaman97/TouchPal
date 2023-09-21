package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p001v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.C3541a;
import com.google.android.gms.dynamic.C3552c;
import com.google.android.gms.dynamic.C3553d;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.internal.C3802s;
import com.google.android.gms.maps.internal.C3887o;
import com.google.android.gms.maps.internal.C3888p;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class SupportMapFragment extends Fragment {

    /* renamed from: gK */
    private final C3831b f15992gK = new C3831b(this);

    /* renamed from: gz */
    private GoogleMap f15993gz;

    /* renamed from: com.google.android.gms.maps.SupportMapFragment$a */
    static class C3830a implements LifecycleDelegate {

        /* renamed from: gB */
        private final IMapFragmentDelegate f15994gB;

        /* renamed from: gL */
        private final Fragment f15995gL;

        public C3830a(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.f15994gB = (IMapFragmentDelegate) C3802s.m16678d(iMapFragmentDelegate);
            this.f15995gL = (Fragment) C3802s.m16678d(fragment);
        }

        /* renamed from: bh */
        public IMapFragmentDelegate mo12651bh() {
            return this.f15994gB;
        }

        public void onCreate(Bundle bundle) {
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            Bundle arguments = this.f15995gL.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                C3887o.m16805a(bundle, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f15994gB.onCreate(bundle);
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) C3552c.m15489a(this.f15994gB.onCreateView(C3552c.m15490f(layoutInflater), C3552c.m15490f(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroy() {
            try {
                this.f15994gB.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            try {
                this.f15994gB.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f15994gB.onInflate(C3552c.m15490f(activity), (GoogleMapOptions) bundle.getParcelable("MapOptions"), bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onLowMemory() {
            try {
                this.f15994gB.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.f15994gB.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.f15994gB.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.f15994gB.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.SupportMapFragment$b */
    static class C3831b extends C3541a<C3830a> {

        /* renamed from: bm */
        private Activity f15996bm;

        /* renamed from: gC */
        protected C3553d<C3830a> f15997gC;

        /* renamed from: gL */
        private final Fragment f15998gL;

        C3831b(Fragment fragment) {
            this.f15998gL = fragment;
        }

        /* access modifiers changed from: private */
        public void setActivity(Activity activity) {
            this.f15996bm = activity;
            mo12652bi();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11041a(C3553d<C3830a> dVar) {
            this.f15997gC = dVar;
            mo12652bi();
        }

        /* renamed from: bi */
        public void mo12652bi() {
            if (this.f15996bm != null && this.f15997gC != null && mo11042at() == null) {
                try {
                    MapsInitializer.initialize(this.f15996bm);
                    this.f15997gC.mo11052a(new C3830a(this.f15998gL, C3888p.m16809i(this.f15996bm).mo12778d(C3552c.m15490f(this.f15996bm))));
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    }

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(GoogleMapOptions googleMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bh */
    public IMapFragmentDelegate mo12649bh() {
        this.f15992gK.mo12652bi();
        if (this.f15992gK.mo11042at() == null) {
            return null;
        }
        return ((C3830a) this.f15992gK.mo11042at()).mo12651bh();
    }

    public final GoogleMap getMap() {
        IMapFragmentDelegate bh = mo12649bh();
        if (bh == null) {
            return null;
        }
        try {
            IGoogleMapDelegate map = bh.getMap();
            if (map == null) {
                return null;
            }
            if (this.f15993gz == null || this.f15993gz.mo12513aY().asBinder() != map.asBinder()) {
                this.f15993gz = new GoogleMap(map);
            }
            return this.f15993gz;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f15992gK.setActivity(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15992gK.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f15992gK.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f15992gK.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f15992gK.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        this.f15992gK.setActivity(activity);
        GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", createFromAttributes);
        this.f15992gK.onInflate(activity, bundle2, bundle);
    }

    public void onLowMemory() {
        this.f15992gK.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.f15992gK.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f15992gK.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f15992gK.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
