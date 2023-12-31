package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.C3525d;
import java.util.List;

/* renamed from: com.google.android.gms.internal.bp */
public interface C3700bp extends IInterface {

    /* renamed from: com.google.android.gms.internal.bp$a */
    public static abstract class C3701a extends Binder implements C3700bp {

        /* renamed from: com.google.android.gms.internal.bp$a$a */
        private static class C3702a implements C3700bp {

            /* renamed from: a */
            private IBinder f15613a;

            C3702a(IBinder iBinder) {
                this.f15613a = iBinder;
            }

            /* renamed from: E */
            public void mo11773E(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeString(str);
                    this.f15613a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11774a(int i, Bundle bundle, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i2);
                    this.f15613a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11775a(int i, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle2 != null) {
                        obtain.writeInt(1);
                        bundle2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15613a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11776a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (parcelFileDescriptor != null) {
                        obtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15613a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11777a(int i, Bundle bundle, C3600ak akVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (akVar != null) {
                        obtain.writeInt(1);
                        akVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15613a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11778a(int i, Bundle bundle, C3759co coVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (coVar != null) {
                        obtain.writeInt(1);
                        coVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15613a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11779a(int i, Bundle bundle, C3761cq cqVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (cqVar != null) {
                        obtain.writeInt(1);
                        cqVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15613a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11780a(int i, Bundle bundle, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f15613a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11781a(int i, Bundle bundle, String str, C3721bv bvVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (bvVar != null) {
                        obtain.writeInt(1);
                        bvVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15613a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11782a(int i, Bundle bundle, String str, List<String> list, List<String> list2, List<String> list3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringList(list);
                    obtain.writeStringList(list2);
                    obtain.writeStringList(list3);
                    this.f15613a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11783a(int i, Bundle bundle, List<C3807x> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    this.f15613a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11784a(C3525d dVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f15613a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11785a(C3525d dVar, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f15613a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f15613a;
            }

            /* renamed from: b */
            public void mo11786b(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15613a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11787b(int i, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle2 != null) {
                        obtain.writeInt(1);
                        bundle2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15613a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11788b(C3525d dVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f15613a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo11789c(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15613a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3701a() {
            attachInterface(this, "com.google.android.gms.plus.internal.IPlusCallbacks");
        }

        /* renamed from: Y */
        public static C3700bp m16205Y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3700bp)) ? new C3702a(iBinder) : (C3700bp) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.google.android.gms.internal.cq} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.google.android.gms.internal.co} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.google.android.gms.internal.bv} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: com.google.android.gms.internal.ak} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: com.google.android.gms.common.data.d} */
        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v15 */
        /* JADX WARNING: type inference failed for: r2v25 */
        /* JADX WARNING: type inference failed for: r2v26 */
        /* JADX WARNING: type inference failed for: r2v27 */
        /* JADX WARNING: type inference failed for: r2v28 */
        /* JADX WARNING: type inference failed for: r2v29 */
        /* JADX WARNING: type inference failed for: r2v30 */
        /* JADX WARNING: type inference failed for: r2v31 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) throws android.os.RemoteException {
            /*
                r8 = this;
                r7 = 1
                r2 = 0
                switch(r9) {
                    case 1: goto L_0x0011;
                    case 2: goto L_0x0043;
                    case 3: goto L_0x0075;
                    case 4: goto L_0x0086;
                    case 5: goto L_0x00a4;
                    case 6: goto L_0x00d2;
                    case 7: goto L_0x00f4;
                    case 8: goto L_0x0116;
                    case 9: goto L_0x0134;
                    case 10: goto L_0x0167;
                    case 11: goto L_0x0199;
                    case 12: goto L_0x01cb;
                    case 13: goto L_0x01ed;
                    case 14: goto L_0x021b;
                    case 15: goto L_0x0249;
                    case 16: goto L_0x026f;
                    case 17: goto L_0x0297;
                    case 1598968902: goto L_0x000a;
                    default: goto L_0x0005;
                }
            L_0x0005:
                boolean r0 = super.onTransact(r9, r10, r11, r12)
            L_0x0009:
                return r0
            L_0x000a:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r11.writeString(r0)
                r0 = r7
                goto L_0x0009
            L_0x0011:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r3 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x003f
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r1 = r0
            L_0x0029:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0041
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0037:
                r8.mo11775a((int) r3, (android.os.Bundle) r1, (android.os.Bundle) r0)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x003f:
                r1 = r2
                goto L_0x0029
            L_0x0041:
                r0 = r2
                goto L_0x0037
            L_0x0043:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r3 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0071
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r1 = r0
            L_0x005b:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0073
                android.os.Parcelable$Creator r0 = android.os.ParcelFileDescriptor.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0
            L_0x0069:
                r8.mo11776a((int) r3, (android.os.Bundle) r1, (android.os.ParcelFileDescriptor) r0)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x0071:
                r1 = r2
                goto L_0x005b
            L_0x0073:
                r0 = r2
                goto L_0x0069
            L_0x0075:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                r8.mo11773E(r0)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x0086:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0097
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r2 = r0.createFromParcel(r10)
            L_0x0097:
                java.lang.String r0 = r10.readString()
                r8.mo11784a(r2, r0)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x00a4:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r1 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x00d0
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00bb:
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x00c7
                com.google.android.gms.internal.al r2 = com.google.android.gms.internal.C3600ak.CREATOR
                com.google.android.gms.internal.ak r2 = r2.createFromParcel(r10)
            L_0x00c7:
                r8.mo11777a((int) r1, (android.os.Bundle) r0, (com.google.android.gms.internal.C3600ak) r2)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x00d0:
                r0 = r2
                goto L_0x00bb
            L_0x00d2:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x00e3
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r2 = r0.createFromParcel(r10)
            L_0x00e3:
                java.lang.String r0 = r10.readString()
                java.lang.String r1 = r10.readString()
                r8.mo11785a((com.google.android.gms.common.data.C3525d) r2, (java.lang.String) r0, (java.lang.String) r1)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x00f4:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r1 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0114
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x010b:
                r8.mo11786b((int) r1, (android.os.Bundle) r0)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x0114:
                r0 = r2
                goto L_0x010b
            L_0x0116:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0127
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r2 = r0.createFromParcel(r10)
            L_0x0127:
                java.lang.String r0 = r10.readString()
                r8.mo11788b((com.google.android.gms.common.data.C3525d) r2, (java.lang.String) r0)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x0134:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r3 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0163
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r1 = r0
            L_0x014c:
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0165
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x015a:
                r8.mo11787b(r3, r1, r0)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x0163:
                r1 = r2
                goto L_0x014c
            L_0x0165:
                r0 = r2
                goto L_0x015a
            L_0x0167:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r1 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x017f
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r2 = r0
            L_0x017f:
                java.lang.String r3 = r10.readString()
                java.util.ArrayList r4 = r10.createStringArrayList()
                java.util.ArrayList r5 = r10.createStringArrayList()
                java.util.ArrayList r6 = r10.createStringArrayList()
                r0 = r8
                r0.mo11782a(r1, r2, r3, r4, r5, r6)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x0199:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r1 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x01c9
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x01b0:
                java.lang.String r3 = r10.readString()
                int r4 = r10.readInt()
                if (r4 == 0) goto L_0x01c0
                com.google.android.gms.internal.bw r2 = com.google.android.gms.internal.C3721bv.CREATOR
                com.google.android.gms.internal.bv r2 = r2.createFromParcel(r10)
            L_0x01c0:
                r8.mo11781a(r1, r0, r3, r2)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x01c9:
                r0 = r2
                goto L_0x01b0
            L_0x01cb:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r1 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x01eb
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x01e2:
                r8.mo11789c(r1, r0)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x01eb:
                r0 = r2
                goto L_0x01e2
            L_0x01ed:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r1 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0219
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0204:
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x0210
                com.google.android.gms.internal.cp r2 = com.google.android.gms.internal.C3759co.CREATOR
                com.google.android.gms.internal.co r2 = r2.createFromParcel(r10)
            L_0x0210:
                r8.mo11778a((int) r1, (android.os.Bundle) r0, (com.google.android.gms.internal.C3759co) r2)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x0219:
                r0 = r2
                goto L_0x0204
            L_0x021b:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r1 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0247
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0232:
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x023e
                com.google.android.gms.internal.cr r2 = com.google.android.gms.internal.C3761cq.CREATOR
                com.google.android.gms.internal.cq r2 = r2.createFromParcel(r10)
            L_0x023e:
                r8.mo11779a((int) r1, (android.os.Bundle) r0, (com.google.android.gms.internal.C3761cq) r2)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x0247:
                r0 = r2
                goto L_0x0232
            L_0x0249:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r1 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x026d
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0260:
                java.lang.String r2 = r10.readString()
                r8.mo11780a((int) r1, (android.os.Bundle) r0, (java.lang.String) r2)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x026d:
                r0 = r2
                goto L_0x0260
            L_0x026f:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r1 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x0295
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0286:
                com.google.android.gms.internal.y r2 = com.google.android.gms.internal.C3807x.CREATOR
                java.util.ArrayList r2 = r10.createTypedArrayList(r2)
                r8.mo11783a((int) r1, (android.os.Bundle) r0, (java.util.List<com.google.android.gms.internal.C3807x>) r2)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x0295:
                r0 = r2
                goto L_0x0286
            L_0x0297:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r10.enforceInterface(r0)
                int r1 = r10.readInt()
                int r0 = r10.readInt()
                if (r0 == 0) goto L_0x02bb
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x02ae:
                int r2 = r10.readInt()
                r8.mo11774a((int) r1, (android.os.Bundle) r0, (int) r2)
                r11.writeNoException()
                r0 = r7
                goto L_0x0009
            L_0x02bb:
                r0 = r2
                goto L_0x02ae
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C3700bp.C3701a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: E */
    void mo11773E(String str) throws RemoteException;

    /* renamed from: a */
    void mo11774a(int i, Bundle bundle, int i2) throws RemoteException;

    /* renamed from: a */
    void mo11775a(int i, Bundle bundle, Bundle bundle2) throws RemoteException;

    /* renamed from: a */
    void mo11776a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    /* renamed from: a */
    void mo11777a(int i, Bundle bundle, C3600ak akVar) throws RemoteException;

    /* renamed from: a */
    void mo11778a(int i, Bundle bundle, C3759co coVar) throws RemoteException;

    /* renamed from: a */
    void mo11779a(int i, Bundle bundle, C3761cq cqVar) throws RemoteException;

    /* renamed from: a */
    void mo11780a(int i, Bundle bundle, String str) throws RemoteException;

    /* renamed from: a */
    void mo11781a(int i, Bundle bundle, String str, C3721bv bvVar) throws RemoteException;

    /* renamed from: a */
    void mo11782a(int i, Bundle bundle, String str, List<String> list, List<String> list2, List<String> list3) throws RemoteException;

    /* renamed from: a */
    void mo11783a(int i, Bundle bundle, List<C3807x> list) throws RemoteException;

    /* renamed from: a */
    void mo11784a(C3525d dVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo11785a(C3525d dVar, String str, String str2) throws RemoteException;

    /* renamed from: b */
    void mo11786b(int i, Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo11787b(int i, Bundle bundle, Bundle bundle2) throws RemoteException;

    /* renamed from: b */
    void mo11788b(C3525d dVar, String str) throws RemoteException;

    /* renamed from: c */
    void mo11789c(int i, Bundle bundle) throws RemoteException;
}
