package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.C3549b;
import com.google.android.gms.dynamic.C3552c;
import com.google.android.gms.internal.C3802s;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.internal.C3848b;
import com.google.android.gms.maps.internal.C3854d;
import com.google.android.gms.maps.internal.C3857e;
import com.google.android.gms.maps.internal.C3860f;
import com.google.android.gms.maps.internal.C3863g;
import com.google.android.gms.maps.internal.C3866h;
import com.google.android.gms.maps.internal.C3869i;
import com.google.android.gms.maps.internal.C3872j;
import com.google.android.gms.maps.internal.C3875k;
import com.google.android.gms.maps.internal.C3878l;
import com.google.android.gms.maps.internal.C3881m;
import com.google.android.gms.maps.internal.C3884n;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.ILocationSourceDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.C3909c;
import com.google.android.gms.maps.model.internal.C3912d;
import com.google.android.gms.maps.model.internal.C3918f;

public final class GoogleMap {
    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;

    /* renamed from: fX */
    private final IGoogleMapDelegate f15938fX;

    /* renamed from: fY */
    private UiSettings f15939fY;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        View getInfoContents(Marker marker);

        View getInfoWindow(Marker marker);
    }

    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    @Deprecated
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(Location location);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* renamed from: com.google.android.gms.maps.GoogleMap$a */
    private static final class C3825a extends C3848b.C3849a {

        /* renamed from: gn */
        private final CancelableCallback f15964gn;

        C3825a(CancelableCallback cancelableCallback) {
            this.f15964gn = cancelableCallback;
        }

        public void onCancel() {
            this.f15964gn.onCancel();
        }

        public void onFinish() {
            this.f15964gn.onFinish();
        }
    }

    protected GoogleMap(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f15938fX = (IGoogleMapDelegate) C3802s.m16678d(iGoogleMapDelegate);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aY */
    public IGoogleMapDelegate mo12513aY() {
        return this.f15938fX;
    }

    public final Circle addCircle(CircleOptions circleOptions) {
        try {
            return new Circle(this.f15938fX.addCircle(circleOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        try {
            C3909c addGroundOverlay = this.f15938fX.addGroundOverlay(groundOverlayOptions);
            if (addGroundOverlay != null) {
                return new GroundOverlay(addGroundOverlay);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Marker addMarker(MarkerOptions markerOptions) {
        try {
            C3912d addMarker = this.f15938fX.addMarker(markerOptions);
            if (addMarker != null) {
                return new Marker(addMarker);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Polygon addPolygon(PolygonOptions polygonOptions) {
        try {
            return new Polygon(this.f15938fX.addPolygon(polygonOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Polyline addPolyline(PolylineOptions polylineOptions) {
        try {
            return new Polyline(this.f15938fX.addPolyline(polylineOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        try {
            C3918f addTileOverlay = this.f15938fX.addTileOverlay(tileOverlayOptions);
            if (addTileOverlay != null) {
                return new TileOverlay(addTileOverlay);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate) {
        try {
            this.f15938fX.animateCamera(cameraUpdate.mo12512aW());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        try {
            this.f15938fX.animateCameraWithDurationAndCallback(cameraUpdate.mo12512aW(), i, cancelableCallback == null ? null : new C3825a(cancelableCallback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        try {
            this.f15938fX.animateCameraWithCallback(cameraUpdate.mo12512aW(), cancelableCallback == null ? null : new C3825a(cancelableCallback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void clear() {
        try {
            this.f15938fX.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final CameraPosition getCameraPosition() {
        try {
            return this.f15938fX.getCameraPosition();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getMapType() {
        try {
            return this.f15938fX.getMapType();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getMaxZoomLevel() {
        try {
            return this.f15938fX.getMaxZoomLevel();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getMinZoomLevel() {
        try {
            return this.f15938fX.getMinZoomLevel();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Deprecated
    public final Location getMyLocation() {
        try {
            return this.f15938fX.getMyLocation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Projection getProjection() {
        try {
            return new Projection(this.f15938fX.getProjection());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final UiSettings getUiSettings() {
        try {
            if (this.f15939fY == null) {
                this.f15939fY = new UiSettings(this.f15938fX.getUiSettings());
            }
            return this.f15939fY;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isIndoorEnabled() {
        try {
            return this.f15938fX.isIndoorEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isMyLocationEnabled() {
        try {
            return this.f15938fX.isMyLocationEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return this.f15938fX.isTrafficEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void moveCamera(CameraUpdate cameraUpdate) {
        try {
            this.f15938fX.moveCamera(cameraUpdate.mo12512aW());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean setIndoorEnabled(boolean z) {
        try {
            return this.f15938fX.setIndoorEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setInfoWindowAdapter(final InfoWindowAdapter infoWindowAdapter) {
        if (infoWindowAdapter == null) {
            try {
                this.f15938fX.setInfoWindowAdapter((C3854d) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f15938fX.setInfoWindowAdapter(new C3854d.C3855a() {
                /* renamed from: f */
                public C3549b mo12556f(C3912d dVar) {
                    return C3552c.m15490f(infoWindowAdapter.getInfoWindow(new Marker(dVar)));
                }

                /* renamed from: g */
                public C3549b mo12557g(C3912d dVar) {
                    return C3552c.m15490f(infoWindowAdapter.getInfoContents(new Marker(dVar)));
                }
            });
        }
    }

    public final void setLocationSource(final LocationSource locationSource) {
        if (locationSource == null) {
            try {
                this.f15938fX.setLocationSource((ILocationSourceDelegate) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f15938fX.setLocationSource(new ILocationSourceDelegate.C3837a() {
                public void activate(final C3863g gVar) {
                    locationSource.activate(new LocationSource.OnLocationChangedListener() {
                        public void onLocationChanged(Location location) {
                            try {
                                gVar.mo12790e(C3552c.m15490f(location));
                            } catch (RemoteException e) {
                                throw new RuntimeRemoteException(e);
                            }
                        }
                    });
                }

                public void deactivate() {
                    locationSource.deactivate();
                }
            });
        }
    }

    public final void setMapType(int i) {
        try {
            this.f15938fX.setMapType(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationEnabled(boolean z) {
        try {
            this.f15938fX.setMyLocationEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraChangeListener(final OnCameraChangeListener onCameraChangeListener) {
        if (onCameraChangeListener == null) {
            try {
                this.f15938fX.setOnCameraChangeListener((C3857e) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f15938fX.setOnCameraChangeListener(new C3857e.C3858a() {
                public void onCameraChange(CameraPosition cameraPosition) {
                    onCameraChangeListener.onCameraChange(cameraPosition);
                }
            });
        }
    }

    public final void setOnInfoWindowClickListener(final OnInfoWindowClickListener onInfoWindowClickListener) {
        if (onInfoWindowClickListener == null) {
            try {
                this.f15938fX.setOnInfoWindowClickListener((C3860f) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f15938fX.setOnInfoWindowClickListener(new C3860f.C3861a() {
                /* renamed from: e */
                public void mo12568e(C3912d dVar) {
                    onInfoWindowClickListener.onInfoWindowClick(new Marker(dVar));
                }
            });
        }
    }

    public final void setOnMapClickListener(final OnMapClickListener onMapClickListener) {
        if (onMapClickListener == null) {
            try {
                this.f15938fX.setOnMapClickListener((C3866h) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f15938fX.setOnMapClickListener(new C3866h.C3867a() {
                public void onMapClick(LatLng latLng) {
                    onMapClickListener.onMapClick(latLng);
                }
            });
        }
    }

    public final void setOnMapLongClickListener(final OnMapLongClickListener onMapLongClickListener) {
        if (onMapLongClickListener == null) {
            try {
                this.f15938fX.setOnMapLongClickListener((C3869i) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f15938fX.setOnMapLongClickListener(new C3869i.C3870a() {
                public void onMapLongClick(LatLng latLng) {
                    onMapLongClickListener.onMapLongClick(latLng);
                }
            });
        }
    }

    public final void setOnMarkerClickListener(final OnMarkerClickListener onMarkerClickListener) {
        if (onMarkerClickListener == null) {
            try {
                this.f15938fX.setOnMarkerClickListener((C3872j) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f15938fX.setOnMarkerClickListener(new C3872j.C3873a() {
                /* renamed from: a */
                public boolean mo12564a(C3912d dVar) {
                    return onMarkerClickListener.onMarkerClick(new Marker(dVar));
                }
            });
        }
    }

    public final void setOnMarkerDragListener(final OnMarkerDragListener onMarkerDragListener) {
        if (onMarkerDragListener == null) {
            try {
                this.f15938fX.setOnMarkerDragListener((C3875k) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f15938fX.setOnMarkerDragListener(new C3875k.C3876a() {
                /* renamed from: b */
                public void mo12565b(C3912d dVar) {
                    onMarkerDragListener.onMarkerDragStart(new Marker(dVar));
                }

                /* renamed from: c */
                public void mo12566c(C3912d dVar) {
                    onMarkerDragListener.onMarkerDragEnd(new Marker(dVar));
                }

                /* renamed from: d */
                public void mo12567d(C3912d dVar) {
                    onMarkerDragListener.onMarkerDrag(new Marker(dVar));
                }
            });
        }
    }

    public final void setOnMyLocationButtonClickListener(final OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        if (onMyLocationButtonClickListener == null) {
            try {
                this.f15938fX.setOnMyLocationButtonClickListener((C3878l) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f15938fX.setOnMyLocationButtonClickListener(new C3878l.C3879a() {
                public boolean onMyLocationButtonClick() throws RemoteException {
                    return onMyLocationButtonClickListener.onMyLocationButtonClick();
                }
            });
        }
    }

    @Deprecated
    public final void setOnMyLocationChangeListener(final OnMyLocationChangeListener onMyLocationChangeListener) {
        if (onMyLocationChangeListener == null) {
            try {
                this.f15938fX.setOnMyLocationChangeListener((C3881m) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f15938fX.setOnMyLocationChangeListener(new C3881m.C3882a() {
                /* renamed from: b */
                public void mo12558b(C3549b bVar) {
                    onMyLocationChangeListener.onMyLocationChange((Location) C3552c.m15489a(bVar));
                }
            });
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        try {
            this.f15938fX.setPadding(i, i2, i3, i4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTrafficEnabled(boolean z) {
        try {
            this.f15938fX.setTrafficEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void snapshot(SnapshotReadyCallback snapshotReadyCallback) {
        snapshot(snapshotReadyCallback, (Bitmap) null);
    }

    public final void snapshot(final SnapshotReadyCallback snapshotReadyCallback, Bitmap bitmap) {
        try {
            this.f15938fX.snapshot(new C3884n.C3885a() {
                public void onSnapshotReady(Bitmap bitmap) throws RemoteException {
                    snapshotReadyCallback.onSnapshotReady(bitmap);
                }
            }, (C3552c) (bitmap != null ? C3552c.m15490f(bitmap) : null));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void stopAnimation() {
        try {
            this.f15938fX.stopAnimation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
