package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
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

public class MapFragment extends Fragment {

    /* renamed from: gy */
    private final C3827b f15976gy = new C3827b(this);

    /* renamed from: gz */
    private GoogleMap f15977gz;

    /* renamed from: com.google.android.gms.maps.MapFragment$a */
    static class C3826a implements LifecycleDelegate {

        /* renamed from: gA */
        private final Fragment f15978gA;

        /* renamed from: gB */
        private final IMapFragmentDelegate f15979gB;

        public C3826a(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.f15979gB = (IMapFragmentDelegate) C3802s.m16678d(iMapFragmentDelegate);
            this.f15978gA = (Fragment) C3802s.m16678d(fragment);
        }

        /* renamed from: bh */
        public IMapFragmentDelegate mo12635bh() {
            return this.f15979gB;
        }

        public void onCreate(Bundle bundle) {
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            Bundle arguments = this.f15978gA.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                C3887o.m16805a(bundle, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f15979gB.onCreate(bundle);
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) C3552c.m15489a(this.f15979gB.onCreateView(C3552c.m15490f(layoutInflater), C3552c.m15490f(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroy() {
            try {
                this.f15979gB.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            try {
                this.f15979gB.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f15979gB.onInflate(C3552c.m15490f(activity), (GoogleMapOptions) bundle.getParcelable("MapOptions"), bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onLowMemory() {
            try {
                this.f15979gB.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.f15979gB.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.f15979gB.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.f15979gB.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.MapFragment$b */
    static class C3827b extends C3541a<C3826a> {

        /* renamed from: bm */
        private Activity f15980bm;

        /* renamed from: gA */
        private final Fragment f15981gA;

        /* renamed from: gC */
        protected C3553d<C3826a> f15982gC;

        C3827b(Fragment fragment) {
            this.f15981gA = fragment;
        }

        /* access modifiers changed from: private */
        public void setActivity(Activity activity) {
            this.f15980bm = activity;
            mo12636bi();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11041a(C3553d<C3826a> dVar) {
            this.f15982gC = dVar;
            mo12636bi();
        }

        /* renamed from: bi */
        public void mo12636bi() {
            if (this.f15980bm != null && this.f15982gC != null && mo11042at() == null) {
                try {
                    MapsInitializer.initialize(this.f15980bm);
                    this.f15982gC.mo11052a(new C3826a(this.f15981gA, C3888p.m16809i(this.f15980bm).mo12778d(C3552c.m15490f(this.f15980bm))));
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    }

    public static MapFragment newInstance() {
        return new MapFragment();
    }

    public static MapFragment newInstance(GoogleMapOptions googleMapOptions) {
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bh */
    public IMapFragmentDelegate mo12621bh() {
        this.f15976gy.mo12636bi();
        if (this.f15976gy.mo11042at() == null) {
            return null;
        }
        return ((C3826a) this.f15976gy.mo11042at()).mo12635bh();
    }

    public final GoogleMap getMap() {
        IMapFragmentDelegate bh = mo12621bh();
        if (bh == null) {
            return null;
        }
        try {
            IGoogleMapDelegate map = bh.getMap();
            if (map == null) {
                return null;
            }
            if (this.f15977gz == null || this.f15977gz.mo12513aY().asBinder() != map.asBinder()) {
                this.f15977gz = new GoogleMap(map);
            }
            return this.f15977gz;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f15976gy.setActivity(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15976gy.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f15976gy.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f15976gy.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f15976gy.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        this.f15976gy.setActivity(activity);
        GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", createFromAttributes);
        this.f15976gy.onInflate(activity, bundle2, bundle);
    }

    public void onLowMemory() {
        this.f15976gy.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.f15976gy.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f15976gy.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f15976gy.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
