package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C3549b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface ICameraUpdateFactoryDelegate extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate$a */
    public static abstract class C3833a extends Binder implements ICameraUpdateFactoryDelegate {

        /* renamed from: com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate$a$a */
        private static class C3834a implements ICameraUpdateFactoryDelegate {

            /* renamed from: a */
            private IBinder f16000a;

            C3834a(IBinder iBinder) {
                this.f16000a = iBinder;
            }

            public IBinder asBinder() {
                return this.f16000a;
            }

            public C3549b newCameraPosition(CameraPosition cameraPosition) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if (cameraPosition != null) {
                        obtain.writeInt(1);
                        cameraPosition.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16000a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C3549b newLatLng(LatLng latLng) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16000a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C3549b newLatLngBounds(LatLngBounds latLngBounds, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f16000a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C3549b newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.f16000a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C3549b newLatLngZoom(LatLng latLng, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeFloat(f);
                    this.f16000a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C3549b scrollBy(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f16000a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C3549b zoomBy(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    obtain.writeFloat(f);
                    this.f16000a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C3549b zoomByWithFocus(float f, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    obtain.writeFloat(f);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f16000a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C3549b zoomIn() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    this.f16000a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C3549b zoomOut() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    this.f16000a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C3549b zoomTo(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    obtain.writeFloat(f);
                    this.f16000a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: t */
        public static ICameraUpdateFactoryDelegate m16753t(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICameraUpdateFactoryDelegate)) ? new C3834a(iBinder) : (ICameraUpdateFactoryDelegate) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    C3549b zoomIn = zoomIn();
                    parcel2.writeNoException();
                    if (zoomIn != null) {
                        iBinder = zoomIn.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    C3549b zoomOut = zoomOut();
                    parcel2.writeNoException();
                    if (zoomOut != null) {
                        iBinder = zoomOut.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    C3549b scrollBy = scrollBy(parcel.readFloat(), parcel.readFloat());
                    parcel2.writeNoException();
                    if (scrollBy != null) {
                        iBinder = scrollBy.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    C3549b zoomTo = zoomTo(parcel.readFloat());
                    parcel2.writeNoException();
                    if (zoomTo != null) {
                        iBinder = zoomTo.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    C3549b zoomBy = zoomBy(parcel.readFloat());
                    parcel2.writeNoException();
                    if (zoomBy != null) {
                        iBinder = zoomBy.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    C3549b zoomByWithFocus = zoomByWithFocus(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    if (zoomByWithFocus != null) {
                        iBinder = zoomByWithFocus.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    C3549b newCameraPosition = newCameraPosition(parcel.readInt() != 0 ? CameraPosition.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (newCameraPosition != null) {
                        iBinder = newCameraPosition.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    C3549b newLatLng = newLatLng(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (newLatLng != null) {
                        iBinder = newLatLng.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    C3549b newLatLngZoom = newLatLngZoom(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null, parcel.readFloat());
                    parcel2.writeNoException();
                    if (newLatLngZoom != null) {
                        iBinder = newLatLngZoom.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    C3549b newLatLngBounds = newLatLngBounds(parcel.readInt() != 0 ? LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    if (newLatLngBounds != null) {
                        iBinder = newLatLngBounds.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    C3549b newLatLngBoundsWithSize = newLatLngBoundsWithSize(parcel.readInt() != 0 ? LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    if (newLatLngBoundsWithSize != null) {
                        iBinder = newLatLngBoundsWithSize.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    C3549b newCameraPosition(CameraPosition cameraPosition) throws RemoteException;

    C3549b newLatLng(LatLng latLng) throws RemoteException;

    C3549b newLatLngBounds(LatLngBounds latLngBounds, int i) throws RemoteException;

    C3549b newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException;

    C3549b newLatLngZoom(LatLng latLng, float f) throws RemoteException;

    C3549b scrollBy(float f, float f2) throws RemoteException;

    C3549b zoomBy(float f) throws RemoteException;

    C3549b zoomByWithFocus(float f, int i, int i2) throws RemoteException;

    C3549b zoomIn() throws RemoteException;

    C3549b zoomOut() throws RemoteException;

    C3549b zoomTo(float f) throws RemoteException;
}
