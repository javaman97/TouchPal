package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.cootek.smartinput5.net.cmd.C2300u;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.games.GamesClient;

/* renamed from: com.google.android.gms.internal.az */
public interface C3660az extends IInterface {

    /* renamed from: com.google.android.gms.internal.az$a */
    public static abstract class C3661a extends Binder implements C3660az {

        /* renamed from: com.google.android.gms.internal.az$a$a */
        private static class C3662a implements C3660az {

            /* renamed from: a */
            private IBinder f15561a;

            C3662a(IBinder iBinder) {
                this.f15561a = iBinder;
            }

            /* renamed from: a */
            public int mo11594a(C3657ay ayVar, byte[] bArr, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeByteArray(bArr);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f15561a.transact(5033, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11595a(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f15561a.transact(C2300u.f10109g, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11596a(IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15561a.transact(5005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11597a(C3657ay ayVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    this.f15561a.transact(C2300u.f10110h, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11598a(C3657ay ayVar, int i, int i2, boolean z, boolean z2) throws RemoteException {
                int i3 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i3 = 0;
                    }
                    obtain.writeInt(i3);
                    this.f15561a.transact(5044, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11599a(C3657ay ayVar, int i, boolean z, boolean z2) throws RemoteException {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f15561a.transact(5015, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11600a(C3657ay ayVar, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeLong(j);
                    this.f15561a.transact(5058, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11601a(C3657ay ayVar, Bundle bundle, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f15561a.transact(5021, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11602a(C3657ay ayVar, IBinder iBinder, int i, String[] strArr, Bundle bundle, boolean z, long j) throws RemoteException {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    this.f15561a.transact(5030, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11603a(C3657ay ayVar, IBinder iBinder, String str, boolean z, long j) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.f15561a.transact(5031, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11604a(C3657ay ayVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f15561a.transact(5008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11605a(C3657ay ayVar, String str, int i, int i2, int i3, boolean z) throws RemoteException {
                int i4 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (z) {
                        i4 = 1;
                    }
                    obtain.writeInt(i4);
                    this.f15561a.transact(5019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11606a(C3657ay ayVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15561a.transact(5025, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11607a(C3657ay ayVar, String str, int i, boolean z, boolean z2) throws RemoteException {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f15561a.transact(5045, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11608a(C3657ay ayVar, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) throws RemoteException {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeInt(z3 ? 1 : 0);
                    if (!z4) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f15561a.transact(6501, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11609a(C3657ay ayVar, String str, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.f15561a.transact(5016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11610a(C3657ay ayVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15561a.transact(5023, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11611a(C3657ay ayVar, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f15561a.transact(5009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11612a(C3657ay ayVar, String str, String str2, int i, int i2, int i3, boolean z) throws RemoteException {
                int i4 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (z) {
                        i4 = 1;
                    }
                    obtain.writeInt(i4);
                    this.f15561a.transact(5039, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11613a(C3657ay ayVar, String str, String str2, boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15561a.transact(6002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11614a(C3657ay ayVar, String str, boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15561a.transact(5054, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11615a(C3657ay ayVar, String str, boolean z, long[] jArr) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    obtain.writeLongArray(jArr);
                    this.f15561a.transact(5011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11616a(C3657ay ayVar, boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15561a.transact(5063, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11617a(String str, String str2, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.f15561a.transact(5051, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: aA */
            public C3525d mo11618aA() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f15561a.transact(5502, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? C3525d.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f15561a;
            }

            /* renamed from: ax */
            public void mo11619ax() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f15561a.transact(5006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ay */
            public C3525d mo11620ay() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f15561a.transact(5013, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? C3525d.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: az */
            public boolean mo11621az() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f15561a.transact(5067, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public int mo11622b(byte[] bArr, String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeByteArray(bArr);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    this.f15561a.transact(5034, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public ParcelFileDescriptor mo11623b(Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15561a.transact(6507, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11624b(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeLong(j);
                    this.f15561a.transact(5059, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11625b(C3657ay ayVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    this.f15561a.transact(5017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11626b(C3657ay ayVar, int i, boolean z, boolean z2) throws RemoteException {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f15561a.transact(5046, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11627b(C3657ay ayVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f15561a.transact(5010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11628b(C3657ay ayVar, String str, int i, int i2, int i3, boolean z) throws RemoteException {
                int i4 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (z) {
                        i4 = 1;
                    }
                    obtain.writeInt(i4);
                    this.f15561a.transact(5020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11629b(C3657ay ayVar, String str, int i, boolean z, boolean z2) throws RemoteException {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f15561a.transact(5501, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11630b(C3657ay ayVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15561a.transact(5024, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11631b(C3657ay ayVar, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f15561a.transact(5038, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11632b(C3657ay ayVar, String str, String str2, int i, int i2, int i3, boolean z) throws RemoteException {
                int i4 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (z) {
                        i4 = 1;
                    }
                    obtain.writeInt(i4);
                    this.f15561a.transact(5040, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11633b(C3657ay ayVar, String str, String str2, boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15561a.transact(6506, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11634b(C3657ay ayVar, String str, boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15561a.transact(6502, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11635b(C3657ay ayVar, boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15561a.transact(GamesClient.STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo11636c(C3657ay ayVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    this.f15561a.transact(5022, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo11637c(C3657ay ayVar, int i, boolean z, boolean z2) throws RemoteException {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f15561a.transact(5048, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo11638c(C3657ay ayVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f15561a.transact(5014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo11639c(C3657ay ayVar, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f15561a.transact(5041, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo11640c(C3657ay ayVar, String str, boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15561a.transact(6504, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo11641c(C3657ay ayVar, boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15561a.transact(6503, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void clearNotifications(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeInt(i);
                    this.f15561a.transact(5036, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo11643d(C3657ay ayVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    this.f15561a.transact(5026, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo11644d(C3657ay ayVar, int i, boolean z, boolean z2) throws RemoteException {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f15561a.transact(6003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo11645d(C3657ay ayVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f15561a.transact(5018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo11646d(C3657ay ayVar, String str, boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15561a.transact(6505, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo11647e(C3657ay ayVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    this.f15561a.transact(5027, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo11648e(C3657ay ayVar, int i, boolean z, boolean z2) throws RemoteException {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.f15561a.transact(6004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo11649e(C3657ay ayVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f15561a.transact(5032, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo11650e(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f15561a.transact(5065, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo11651f(C3657ay ayVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    this.f15561a.transact(5047, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo11652f(C3657ay ayVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f15561a.transact(5037, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo11653g(C3657ay ayVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    this.f15561a.transact(5049, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo11654g(C3657ay ayVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f15561a.transact(5042, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getAppId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f15561a.transact(5003, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getCurrentAccountName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f15561a.transact(5007, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getCurrentPlayerId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f15561a.transact(5012, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo11658h(C3657ay ayVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    this.f15561a.transact(5056, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo11659h(C3657ay ayVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f15561a.transact(5043, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo11660h(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f15561a.transact(5029, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public void mo11661i(C3657ay ayVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    this.f15561a.transact(5062, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public void mo11662i(C3657ay ayVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f15561a.transact(5052, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public void mo11663i(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f15561a.transact(5028, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public int mo11664j(C3657ay ayVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f15561a.transact(5053, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public void mo11665j(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f15561a.transact(5055, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public void mo11666k(C3657ay ayVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f15561a.transact(5061, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public void mo11667l(C3657ay ayVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeStrongBinder(ayVar != null ? ayVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f15561a.transact(5057, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setUseNewPlayerNotificationsFirstParty(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f15561a.transact(5068, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public String mo11669u(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f15561a.transact(5064, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v */
            public String mo11670v(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f15561a.transact(5035, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: w */
            public void mo11671w(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f15561a.transact(5050, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: x */
            public int mo11672x(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f15561a.transact(5060, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: y */
            public Uri mo11673y(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    obtain.writeString(str);
                    this.f15561a.transact(5066, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: z */
            public Bundle mo11674z() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.f15561a.transact(5004, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: o */
        public static C3660az m16004o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3660az)) ? new C3662a(iBinder) : (C3660az) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v186, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v190, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v197, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v254, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v268 */
        /* JADX WARNING: type inference failed for: r0v269 */
        /* JADX WARNING: type inference failed for: r0v270 */
        /* JADX WARNING: type inference failed for: r0v271 */
        /* JADX WARNING: type inference failed for: r0v272 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r12, android.os.Parcel r13, android.os.Parcel r14, int r15) throws android.os.RemoteException {
            /*
                r11 = this;
                r0 = 0
                r7 = 0
                r10 = 1
                switch(r12) {
                    case 5001: goto L_0x0011;
                    case 5002: goto L_0x0021;
                    case 5003: goto L_0x0035;
                    case 5004: goto L_0x0045;
                    case 5005: goto L_0x005e;
                    case 5006: goto L_0x007c;
                    case 5007: goto L_0x0088;
                    case 5008: goto L_0x00c3;
                    case 5009: goto L_0x00dc;
                    case 5010: goto L_0x00f9;
                    case 5011: goto L_0x0112;
                    case 5012: goto L_0x0138;
                    case 5013: goto L_0x0149;
                    case 5014: goto L_0x0164;
                    case 5015: goto L_0x017d;
                    case 5016: goto L_0x01a6;
                    case 5017: goto L_0x01c3;
                    case 5018: goto L_0x01d8;
                    case 5019: goto L_0x01f1;
                    case 5020: goto L_0x0220;
                    case 5021: goto L_0x024f;
                    case 5022: goto L_0x027a;
                    case 5023: goto L_0x028f;
                    case 5024: goto L_0x02ba;
                    case 5025: goto L_0x02e5;
                    case 5026: goto L_0x0318;
                    case 5027: goto L_0x032d;
                    case 5028: goto L_0x0342;
                    case 5029: goto L_0x0357;
                    case 5030: goto L_0x0396;
                    case 5031: goto L_0x03d4;
                    case 5032: goto L_0x03ff;
                    case 5033: goto L_0x0418;
                    case 5034: goto L_0x043d;
                    case 5035: goto L_0x045a;
                    case 5036: goto L_0x046f;
                    case 5037: goto L_0x0480;
                    case 5038: goto L_0x0499;
                    case 5039: goto L_0x04b6;
                    case 5040: goto L_0x04e7;
                    case 5041: goto L_0x0518;
                    case 5042: goto L_0x0535;
                    case 5043: goto L_0x054e;
                    case 5044: goto L_0x0567;
                    case 5045: goto L_0x0597;
                    case 5046: goto L_0x05c7;
                    case 5047: goto L_0x05f0;
                    case 5048: goto L_0x0605;
                    case 5049: goto L_0x062e;
                    case 5050: goto L_0x0643;
                    case 5051: goto L_0x0654;
                    case 5052: goto L_0x066d;
                    case 5053: goto L_0x0686;
                    case 5054: goto L_0x06b8;
                    case 5055: goto L_0x06f1;
                    case 5056: goto L_0x072e;
                    case 5057: goto L_0x0743;
                    case 5058: goto L_0x036c;
                    case 5059: goto L_0x0385;
                    case 5060: goto L_0x06a3;
                    case 5061: goto L_0x06d8;
                    case 5062: goto L_0x075c;
                    case 5063: goto L_0x0771;
                    case 5064: goto L_0x0099;
                    case 5065: goto L_0x00ae;
                    case 5066: goto L_0x078d;
                    case 5067: goto L_0x0706;
                    case 5068: goto L_0x071a;
                    case 5501: goto L_0x07ac;
                    case 5502: goto L_0x07dc;
                    case 6001: goto L_0x07f7;
                    case 6002: goto L_0x0813;
                    case 6003: goto L_0x0837;
                    case 6004: goto L_0x0860;
                    case 6501: goto L_0x0889;
                    case 6502: goto L_0x08c9;
                    case 6503: goto L_0x08e9;
                    case 6504: goto L_0x0905;
                    case 6505: goto L_0x0925;
                    case 6506: goto L_0x0945;
                    case 6507: goto L_0x0969;
                    case 1598968902: goto L_0x000b;
                    default: goto L_0x0006;
                }
            L_0x0006:
                boolean r10 = super.onTransact(r12, r13, r14, r15)
            L_0x000a:
                return r10
            L_0x000b:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r14.writeString(r0)
                goto L_0x000a
            L_0x0011:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                long r0 = r13.readLong()
                r11.mo11595a((long) r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x0021:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                r11.mo11597a((com.google.android.gms.internal.C3657ay) r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x0035:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r11.getAppId()
                r14.writeNoException()
                r14.writeString(r0)
                goto L_0x000a
            L_0x0045:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.Bundle r0 = r11.mo11674z()
                r14.writeNoException()
                if (r0 == 0) goto L_0x005a
                r14.writeInt(r10)
                r0.writeToParcel(r14, r10)
                goto L_0x000a
            L_0x005a:
                r14.writeInt(r7)
                goto L_0x000a
            L_0x005e:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r1)
                android.os.IBinder r1 = r13.readStrongBinder()
                int r2 = r13.readInt()
                if (r2 == 0) goto L_0x0075
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0075:
                r11.mo11596a((android.os.IBinder) r1, (android.os.Bundle) r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x007c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                r11.mo11619ax()
                r14.writeNoException()
                goto L_0x000a
            L_0x0088:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r11.getCurrentAccountName()
                r14.writeNoException()
                r14.writeString(r0)
                goto L_0x000a
            L_0x0099:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                java.lang.String r0 = r11.mo11669u(r0)
                r14.writeNoException()
                r14.writeString(r0)
                goto L_0x000a
            L_0x00ae:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                java.lang.String r1 = r13.readString()
                r11.mo11650e((java.lang.String) r0, (java.lang.String) r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x00c3:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                r11.mo11604a((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x00dc:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                java.lang.String r2 = r13.readString()
                r11.mo11611a((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1, (java.lang.String) r2)
                r14.writeNoException()
                goto L_0x000a
            L_0x00f9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                r11.mo11627b((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x0112:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r2 = r13.readString()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0136
                r0 = r10
            L_0x012a:
                long[] r3 = r13.createLongArray()
                r11.mo11615a((com.google.android.gms.internal.C3657ay) r1, (java.lang.String) r2, (boolean) r0, (long[]) r3)
                r14.writeNoException()
                goto L_0x000a
            L_0x0136:
                r0 = r7
                goto L_0x012a
            L_0x0138:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r11.getCurrentPlayerId()
                r14.writeNoException()
                r14.writeString(r0)
                goto L_0x000a
            L_0x0149:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                com.google.android.gms.common.data.d r0 = r11.mo11620ay()
                r14.writeNoException()
                if (r0 == 0) goto L_0x015f
                r14.writeInt(r10)
                r0.writeToParcel(r14, r10)
                goto L_0x000a
            L_0x015f:
                r14.writeInt(r7)
                goto L_0x000a
            L_0x0164:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                r11.mo11638c((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x017d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                int r2 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x01a4
                r0 = r10
            L_0x0195:
                int r3 = r13.readInt()
                if (r3 == 0) goto L_0x019c
                r7 = r10
            L_0x019c:
                r11.mo11599a((com.google.android.gms.internal.C3657ay) r1, (int) r2, (boolean) r0, (boolean) r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x01a4:
                r0 = r7
                goto L_0x0195
            L_0x01a6:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                long r2 = r13.readLong()
                r11.mo11609a((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1, (long) r2)
                r14.writeNoException()
                goto L_0x000a
            L_0x01c3:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                r11.mo11625b((com.google.android.gms.internal.C3657ay) r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x01d8:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                r11.mo11645d(r0, r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x01f1:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r2 = r13.readString()
                int r3 = r13.readInt()
                int r4 = r13.readInt()
                int r5 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x021e
                r6 = r10
            L_0x0215:
                r0 = r11
                r0.mo11605a(r1, r2, r3, r4, r5, r6)
                r14.writeNoException()
                goto L_0x000a
            L_0x021e:
                r6 = r7
                goto L_0x0215
            L_0x0220:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r2 = r13.readString()
                int r3 = r13.readInt()
                int r4 = r13.readInt()
                int r5 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x024d
                r6 = r10
            L_0x0244:
                r0 = r11
                r0.mo11628b(r1, r2, r3, r4, r5, r6)
                r14.writeNoException()
                goto L_0x000a
            L_0x024d:
                r6 = r7
                goto L_0x0244
            L_0x024f:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r1)
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r1)
                int r2 = r13.readInt()
                if (r2 == 0) goto L_0x026a
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x026a:
                int r2 = r13.readInt()
                int r3 = r13.readInt()
                r11.mo11601a((com.google.android.gms.internal.C3657ay) r1, (android.os.Bundle) r0, (int) r2, (int) r3)
                r14.writeNoException()
                goto L_0x000a
            L_0x027a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                r11.mo11636c(r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x028f:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r1)
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r1)
                java.lang.String r2 = r13.readString()
                android.os.IBinder r3 = r13.readStrongBinder()
                int r4 = r13.readInt()
                if (r4 == 0) goto L_0x02b2
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x02b2:
                r11.mo11610a((com.google.android.gms.internal.C3657ay) r1, (java.lang.String) r2, (android.os.IBinder) r3, (android.os.Bundle) r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x02ba:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r1)
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r1)
                java.lang.String r2 = r13.readString()
                android.os.IBinder r3 = r13.readStrongBinder()
                int r4 = r13.readInt()
                if (r4 == 0) goto L_0x02dd
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x02dd:
                r11.mo11630b((com.google.android.gms.internal.C3657ay) r1, (java.lang.String) r2, (android.os.IBinder) r3, (android.os.Bundle) r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x02e5:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r1)
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r1)
                java.lang.String r2 = r13.readString()
                int r3 = r13.readInt()
                android.os.IBinder r4 = r13.readStrongBinder()
                int r5 = r13.readInt()
                if (r5 == 0) goto L_0x0316
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r5 = r0
            L_0x030d:
                r0 = r11
                r0.mo11606a((com.google.android.gms.internal.C3657ay) r1, (java.lang.String) r2, (int) r3, (android.os.IBinder) r4, (android.os.Bundle) r5)
                r14.writeNoException()
                goto L_0x000a
            L_0x0316:
                r5 = r0
                goto L_0x030d
            L_0x0318:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                r11.mo11643d(r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x032d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                r11.mo11647e(r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x0342:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                int r1 = r13.readInt()
                r11.mo11663i((java.lang.String) r0, (int) r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x0357:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                int r1 = r13.readInt()
                r11.mo11660h((java.lang.String) r0, (int) r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x036c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                long r2 = r13.readLong()
                r11.mo11600a((com.google.android.gms.internal.C3657ay) r0, (long) r2)
                r14.writeNoException()
                goto L_0x000a
            L_0x0385:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                long r0 = r13.readLong()
                r11.mo11624b((long) r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x0396:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r1)
                android.os.IBinder r1 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r2 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r1)
                android.os.IBinder r3 = r13.readStrongBinder()
                int r4 = r13.readInt()
                java.lang.String[] r5 = r13.createStringArray()
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x03d2
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                android.os.Bundle r0 = (android.os.Bundle) r0
                r6 = r0
            L_0x03be:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x03c5
                r7 = r10
            L_0x03c5:
                long r8 = r13.readLong()
                r1 = r11
                r1.mo11602a((com.google.android.gms.internal.C3657ay) r2, (android.os.IBinder) r3, (int) r4, (java.lang.String[]) r5, (android.os.Bundle) r6, (boolean) r7, (long) r8)
                r14.writeNoException()
                goto L_0x000a
            L_0x03d2:
                r6 = r0
                goto L_0x03be
            L_0x03d4:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r2 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                android.os.IBinder r3 = r13.readStrongBinder()
                java.lang.String r4 = r13.readString()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x03fd
                r5 = r10
            L_0x03f0:
                long r6 = r13.readLong()
                r1 = r11
                r1.mo11603a((com.google.android.gms.internal.C3657ay) r2, (android.os.IBinder) r3, (java.lang.String) r4, (boolean) r5, (long) r6)
                r14.writeNoException()
                goto L_0x000a
            L_0x03fd:
                r5 = r7
                goto L_0x03f0
            L_0x03ff:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                r11.mo11649e((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x0418:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                byte[] r1 = r13.createByteArray()
                java.lang.String r2 = r13.readString()
                java.lang.String r3 = r13.readString()
                int r0 = r11.mo11594a((com.google.android.gms.internal.C3657ay) r0, (byte[]) r1, (java.lang.String) r2, (java.lang.String) r3)
                r14.writeNoException()
                r14.writeInt(r0)
                goto L_0x000a
            L_0x043d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                byte[] r0 = r13.createByteArray()
                java.lang.String r1 = r13.readString()
                java.lang.String[] r2 = r13.createStringArray()
                int r0 = r11.mo11622b((byte[]) r0, (java.lang.String) r1, (java.lang.String[]) r2)
                r14.writeNoException()
                r14.writeInt(r0)
                goto L_0x000a
            L_0x045a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                java.lang.String r0 = r11.mo11670v(r0)
                r14.writeNoException()
                r14.writeString(r0)
                goto L_0x000a
            L_0x046f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                r11.clearNotifications(r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x0480:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                r11.mo11652f(r0, r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x0499:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                java.lang.String r2 = r13.readString()
                r11.mo11631b((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1, (java.lang.String) r2)
                r14.writeNoException()
                goto L_0x000a
            L_0x04b6:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r2 = r13.readString()
                java.lang.String r3 = r13.readString()
                int r4 = r13.readInt()
                int r5 = r13.readInt()
                int r6 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x04de
                r7 = r10
            L_0x04de:
                r0 = r11
                r0.mo11612a((com.google.android.gms.internal.C3657ay) r1, (java.lang.String) r2, (java.lang.String) r3, (int) r4, (int) r5, (int) r6, (boolean) r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x04e7:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r2 = r13.readString()
                java.lang.String r3 = r13.readString()
                int r4 = r13.readInt()
                int r5 = r13.readInt()
                int r6 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x050f
                r7 = r10
            L_0x050f:
                r0 = r11
                r0.mo11632b(r1, r2, r3, r4, r5, r6, r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x0518:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                java.lang.String r2 = r13.readString()
                r11.mo11639c((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1, (java.lang.String) r2)
                r14.writeNoException()
                goto L_0x000a
            L_0x0535:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                r11.mo11654g(r0, r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x054e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                r11.mo11659h((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x0567:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                int r2 = r13.readInt()
                int r3 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0593
                r4 = r10
            L_0x0583:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0595
                r5 = r10
            L_0x058a:
                r0 = r11
                r0.mo11598a((com.google.android.gms.internal.C3657ay) r1, (int) r2, (int) r3, (boolean) r4, (boolean) r5)
                r14.writeNoException()
                goto L_0x000a
            L_0x0593:
                r4 = r7
                goto L_0x0583
            L_0x0595:
                r5 = r7
                goto L_0x058a
            L_0x0597:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r2 = r13.readString()
                int r3 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x05c3
                r4 = r10
            L_0x05b3:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x05c5
                r5 = r10
            L_0x05ba:
                r0 = r11
                r0.mo11607a((com.google.android.gms.internal.C3657ay) r1, (java.lang.String) r2, (int) r3, (boolean) r4, (boolean) r5)
                r14.writeNoException()
                goto L_0x000a
            L_0x05c3:
                r4 = r7
                goto L_0x05b3
            L_0x05c5:
                r5 = r7
                goto L_0x05ba
            L_0x05c7:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                int r2 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x05ee
                r0 = r10
            L_0x05df:
                int r3 = r13.readInt()
                if (r3 == 0) goto L_0x05e6
                r7 = r10
            L_0x05e6:
                r11.mo11626b((com.google.android.gms.internal.C3657ay) r1, (int) r2, (boolean) r0, (boolean) r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x05ee:
                r0 = r7
                goto L_0x05df
            L_0x05f0:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                r11.mo11651f(r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x0605:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                int r2 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x062c
                r0 = r10
            L_0x061d:
                int r3 = r13.readInt()
                if (r3 == 0) goto L_0x0624
                r7 = r10
            L_0x0624:
                r11.mo11637c(r1, r2, r0, r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x062c:
                r0 = r7
                goto L_0x061d
            L_0x062e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                r11.mo11653g(r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x0643:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                r11.mo11671w(r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x0654:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                java.lang.String r1 = r13.readString()
                int r2 = r13.readInt()
                r11.mo11617a((java.lang.String) r0, (java.lang.String) r1, (int) r2)
                r14.writeNoException()
                goto L_0x000a
            L_0x066d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                r11.mo11662i((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x0686:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                int r0 = r11.mo11664j((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1)
                r14.writeNoException()
                r14.writeInt(r0)
                goto L_0x000a
            L_0x06a3:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                int r0 = r11.mo11672x(r0)
                r14.writeNoException()
                r14.writeInt(r0)
                goto L_0x000a
            L_0x06b8:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                int r2 = r13.readInt()
                if (r2 == 0) goto L_0x06d0
                r7 = r10
            L_0x06d0:
                r11.mo11614a((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1, (boolean) r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x06d8:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                r11.mo11666k(r0, r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x06f1:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                int r1 = r13.readInt()
                r11.mo11665j((java.lang.String) r0, (int) r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x0706:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                boolean r0 = r11.mo11621az()
                r14.writeNoException()
                if (r0 == 0) goto L_0x0715
                r7 = r10
            L_0x0715:
                r14.writeInt(r7)
                goto L_0x000a
            L_0x071a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0726
                r7 = r10
            L_0x0726:
                r11.setUseNewPlayerNotificationsFirstParty(r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x072e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                r11.mo11658h(r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x0743:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                r11.mo11667l(r0, r1)
                r14.writeNoException()
                goto L_0x000a
            L_0x075c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                r11.mo11661i(r0)
                r14.writeNoException()
                goto L_0x000a
            L_0x0771:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x0785
                r7 = r10
            L_0x0785:
                r11.mo11616a((com.google.android.gms.internal.C3657ay) r0, (boolean) r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x078d:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                java.lang.String r0 = r13.readString()
                android.net.Uri r0 = r11.mo11673y(r0)
                r14.writeNoException()
                if (r0 == 0) goto L_0x07a7
                r14.writeInt(r10)
                r0.writeToParcel(r14, r10)
                goto L_0x000a
            L_0x07a7:
                r14.writeInt(r7)
                goto L_0x000a
            L_0x07ac:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r2 = r13.readString()
                int r3 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x07d8
                r4 = r10
            L_0x07c8:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x07da
                r5 = r10
            L_0x07cf:
                r0 = r11
                r0.mo11629b(r1, r2, r3, r4, r5)
                r14.writeNoException()
                goto L_0x000a
            L_0x07d8:
                r4 = r7
                goto L_0x07c8
            L_0x07da:
                r5 = r7
                goto L_0x07cf
            L_0x07dc:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                com.google.android.gms.common.data.d r0 = r11.mo11618aA()
                r14.writeNoException()
                if (r0 == 0) goto L_0x07f2
                r14.writeInt(r10)
                r0.writeToParcel(r14, r10)
                goto L_0x000a
            L_0x07f2:
                r14.writeInt(r7)
                goto L_0x000a
            L_0x07f7:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x080b
                r7 = r10
            L_0x080b:
                r11.mo11635b((com.google.android.gms.internal.C3657ay) r0, (boolean) r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x0813:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                java.lang.String r2 = r13.readString()
                int r3 = r13.readInt()
                if (r3 == 0) goto L_0x082f
                r7 = r10
            L_0x082f:
                r11.mo11613a((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1, (java.lang.String) r2, (boolean) r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x0837:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                int r2 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x085e
                r0 = r10
            L_0x084f:
                int r3 = r13.readInt()
                if (r3 == 0) goto L_0x0856
                r7 = r10
            L_0x0856:
                r11.mo11644d(r1, r2, r0, r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x085e:
                r0 = r7
                goto L_0x084f
            L_0x0860:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                int r2 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x0887
                r0 = r10
            L_0x0878:
                int r3 = r13.readInt()
                if (r3 == 0) goto L_0x087f
                r7 = r10
            L_0x087f:
                r11.mo11648e(r1, r2, r0, r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x0887:
                r0 = r7
                goto L_0x0878
            L_0x0889:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r1 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r2 = r13.readString()
                int r3 = r13.readInt()
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x08c3
                r4 = r10
            L_0x08a5:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x08c5
                r5 = r10
            L_0x08ac:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x08c7
                r6 = r10
            L_0x08b3:
                int r0 = r13.readInt()
                if (r0 == 0) goto L_0x08ba
                r7 = r10
            L_0x08ba:
                r0 = r11
                r0.mo11608a((com.google.android.gms.internal.C3657ay) r1, (java.lang.String) r2, (int) r3, (boolean) r4, (boolean) r5, (boolean) r6, (boolean) r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x08c3:
                r4 = r7
                goto L_0x08a5
            L_0x08c5:
                r5 = r7
                goto L_0x08ac
            L_0x08c7:
                r6 = r7
                goto L_0x08b3
            L_0x08c9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                int r2 = r13.readInt()
                if (r2 == 0) goto L_0x08e1
                r7 = r10
            L_0x08e1:
                r11.mo11634b((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1, (boolean) r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x08e9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x08fd
                r7 = r10
            L_0x08fd:
                r11.mo11641c((com.google.android.gms.internal.C3657ay) r0, (boolean) r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x0905:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                int r2 = r13.readInt()
                if (r2 == 0) goto L_0x091d
                r7 = r10
            L_0x091d:
                r11.mo11640c((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1, (boolean) r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x0925:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                int r2 = r13.readInt()
                if (r2 == 0) goto L_0x093d
                r7 = r10
            L_0x093d:
                r11.mo11646d(r0, r1, r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x0945:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r0)
                android.os.IBinder r0 = r13.readStrongBinder()
                com.google.android.gms.internal.ay r0 = com.google.android.gms.internal.C3657ay.C3658a.m15891n(r0)
                java.lang.String r1 = r13.readString()
                java.lang.String r2 = r13.readString()
                int r3 = r13.readInt()
                if (r3 == 0) goto L_0x0961
                r7 = r10
            L_0x0961:
                r11.mo11633b((com.google.android.gms.internal.C3657ay) r0, (java.lang.String) r1, (java.lang.String) r2, (boolean) r7)
                r14.writeNoException()
                goto L_0x000a
            L_0x0969:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
                r13.enforceInterface(r1)
                int r1 = r13.readInt()
                if (r1 == 0) goto L_0x097c
                android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r13)
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x097c:
                android.os.ParcelFileDescriptor r0 = r11.mo11623b((android.net.Uri) r0)
                r14.writeNoException()
                if (r0 == 0) goto L_0x098d
                r14.writeInt(r10)
                r0.writeToParcel(r14, r10)
                goto L_0x000a
            L_0x098d:
                r14.writeInt(r7)
                goto L_0x000a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C3660az.C3661a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    int mo11594a(C3657ay ayVar, byte[] bArr, String str, String str2) throws RemoteException;

    /* renamed from: a */
    void mo11595a(long j) throws RemoteException;

    /* renamed from: a */
    void mo11596a(IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo11597a(C3657ay ayVar) throws RemoteException;

    /* renamed from: a */
    void mo11598a(C3657ay ayVar, int i, int i2, boolean z, boolean z2) throws RemoteException;

    /* renamed from: a */
    void mo11599a(C3657ay ayVar, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: a */
    void mo11600a(C3657ay ayVar, long j) throws RemoteException;

    /* renamed from: a */
    void mo11601a(C3657ay ayVar, Bundle bundle, int i, int i2) throws RemoteException;

    /* renamed from: a */
    void mo11602a(C3657ay ayVar, IBinder iBinder, int i, String[] strArr, Bundle bundle, boolean z, long j) throws RemoteException;

    /* renamed from: a */
    void mo11603a(C3657ay ayVar, IBinder iBinder, String str, boolean z, long j) throws RemoteException;

    /* renamed from: a */
    void mo11604a(C3657ay ayVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo11605a(C3657ay ayVar, String str, int i, int i2, int i3, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo11606a(C3657ay ayVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo11607a(C3657ay ayVar, String str, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: a */
    void mo11608a(C3657ay ayVar, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) throws RemoteException;

    /* renamed from: a */
    void mo11609a(C3657ay ayVar, String str, long j) throws RemoteException;

    /* renamed from: a */
    void mo11610a(C3657ay ayVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo11611a(C3657ay ayVar, String str, String str2) throws RemoteException;

    /* renamed from: a */
    void mo11612a(C3657ay ayVar, String str, String str2, int i, int i2, int i3, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo11613a(C3657ay ayVar, String str, String str2, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo11614a(C3657ay ayVar, String str, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo11615a(C3657ay ayVar, String str, boolean z, long[] jArr) throws RemoteException;

    /* renamed from: a */
    void mo11616a(C3657ay ayVar, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo11617a(String str, String str2, int i) throws RemoteException;

    /* renamed from: aA */
    C3525d mo11618aA() throws RemoteException;

    /* renamed from: ax */
    void mo11619ax() throws RemoteException;

    /* renamed from: ay */
    C3525d mo11620ay() throws RemoteException;

    /* renamed from: az */
    boolean mo11621az() throws RemoteException;

    /* renamed from: b */
    int mo11622b(byte[] bArr, String str, String[] strArr) throws RemoteException;

    /* renamed from: b */
    ParcelFileDescriptor mo11623b(Uri uri) throws RemoteException;

    /* renamed from: b */
    void mo11624b(long j) throws RemoteException;

    /* renamed from: b */
    void mo11625b(C3657ay ayVar) throws RemoteException;

    /* renamed from: b */
    void mo11626b(C3657ay ayVar, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: b */
    void mo11627b(C3657ay ayVar, String str) throws RemoteException;

    /* renamed from: b */
    void mo11628b(C3657ay ayVar, String str, int i, int i2, int i3, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo11629b(C3657ay ayVar, String str, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: b */
    void mo11630b(C3657ay ayVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo11631b(C3657ay ayVar, String str, String str2) throws RemoteException;

    /* renamed from: b */
    void mo11632b(C3657ay ayVar, String str, String str2, int i, int i2, int i3, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo11633b(C3657ay ayVar, String str, String str2, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo11634b(C3657ay ayVar, String str, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo11635b(C3657ay ayVar, boolean z) throws RemoteException;

    /* renamed from: c */
    void mo11636c(C3657ay ayVar) throws RemoteException;

    /* renamed from: c */
    void mo11637c(C3657ay ayVar, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: c */
    void mo11638c(C3657ay ayVar, String str) throws RemoteException;

    /* renamed from: c */
    void mo11639c(C3657ay ayVar, String str, String str2) throws RemoteException;

    /* renamed from: c */
    void mo11640c(C3657ay ayVar, String str, boolean z) throws RemoteException;

    /* renamed from: c */
    void mo11641c(C3657ay ayVar, boolean z) throws RemoteException;

    void clearNotifications(int i) throws RemoteException;

    /* renamed from: d */
    void mo11643d(C3657ay ayVar) throws RemoteException;

    /* renamed from: d */
    void mo11644d(C3657ay ayVar, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: d */
    void mo11645d(C3657ay ayVar, String str) throws RemoteException;

    /* renamed from: d */
    void mo11646d(C3657ay ayVar, String str, boolean z) throws RemoteException;

    /* renamed from: e */
    void mo11647e(C3657ay ayVar) throws RemoteException;

    /* renamed from: e */
    void mo11648e(C3657ay ayVar, int i, boolean z, boolean z2) throws RemoteException;

    /* renamed from: e */
    void mo11649e(C3657ay ayVar, String str) throws RemoteException;

    /* renamed from: e */
    void mo11650e(String str, String str2) throws RemoteException;

    /* renamed from: f */
    void mo11651f(C3657ay ayVar) throws RemoteException;

    /* renamed from: f */
    void mo11652f(C3657ay ayVar, String str) throws RemoteException;

    /* renamed from: g */
    void mo11653g(C3657ay ayVar) throws RemoteException;

    /* renamed from: g */
    void mo11654g(C3657ay ayVar, String str) throws RemoteException;

    String getAppId() throws RemoteException;

    String getCurrentAccountName() throws RemoteException;

    String getCurrentPlayerId() throws RemoteException;

    /* renamed from: h */
    void mo11658h(C3657ay ayVar) throws RemoteException;

    /* renamed from: h */
    void mo11659h(C3657ay ayVar, String str) throws RemoteException;

    /* renamed from: h */
    void mo11660h(String str, int i) throws RemoteException;

    /* renamed from: i */
    void mo11661i(C3657ay ayVar) throws RemoteException;

    /* renamed from: i */
    void mo11662i(C3657ay ayVar, String str) throws RemoteException;

    /* renamed from: i */
    void mo11663i(String str, int i) throws RemoteException;

    /* renamed from: j */
    int mo11664j(C3657ay ayVar, String str) throws RemoteException;

    /* renamed from: j */
    void mo11665j(String str, int i) throws RemoteException;

    /* renamed from: k */
    void mo11666k(C3657ay ayVar, String str) throws RemoteException;

    /* renamed from: l */
    void mo11667l(C3657ay ayVar, String str) throws RemoteException;

    void setUseNewPlayerNotificationsFirstParty(boolean z) throws RemoteException;

    /* renamed from: u */
    String mo11669u(String str) throws RemoteException;

    /* renamed from: v */
    String mo11670v(String str) throws RemoteException;

    /* renamed from: w */
    void mo11671w(String str) throws RemoteException;

    /* renamed from: x */
    int mo11672x(String str) throws RemoteException;

    /* renamed from: y */
    Uri mo11673y(String str) throws RemoteException;

    /* renamed from: z */
    Bundle mo11674z() throws RemoteException;
}
