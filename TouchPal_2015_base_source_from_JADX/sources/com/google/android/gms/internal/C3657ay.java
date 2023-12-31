package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.cootek.smartinput5.net.cmd.C2300u;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.games.GamesClient;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

/* renamed from: com.google.android.gms.internal.ay */
public interface C3657ay extends IInterface {

    /* renamed from: com.google.android.gms.internal.ay$a */
    public static abstract class C3658a extends Binder implements C3657ay {

        /* renamed from: com.google.android.gms.internal.ay$a$a */
        private static class C3659a implements C3657ay {

            /* renamed from: a */
            private IBinder f15560a;

            C3659a(IBinder iBinder) {
                this.f15560a = iBinder;
            }

            /* renamed from: B */
            public void mo11472B(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f15560a.transact(5013, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: C */
            public void mo11473C(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f15560a.transact(5015, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: D */
            public void mo11474D(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f15560a.transact(5036, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: E */
            public void mo11475E(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    this.f15560a.transact(5040, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11476a(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f15560a.transact(5033, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11477a(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f15560a.transact(C2300u.f10109g, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11478a(int i, String str, boolean z) throws RemoteException {
                int i2 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.f15560a.transact(5034, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11479a(C3525d dVar, C3525d dVar2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dVar2 != null) {
                        obtain.writeInt(1);
                        dVar2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11480a(C3525d dVar, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f15560a.transact(5026, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f15560a;
            }

            /* renamed from: b */
            public void mo11481b(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(C2300u.f10110h, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11482b(C3525d dVar, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f15560a.transact(5027, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo11483c(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo11484c(C3525d dVar, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f15560a.transact(5028, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo11485d(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo11486d(C3525d dVar, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f15560a.transact(5029, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo11487e(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo11488e(C3525d dVar, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f15560a.transact(5030, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo11489f(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo11490f(C3525d dVar, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    this.f15560a.transact(5031, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo11491g(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo11492h(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5010, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public void mo11493i(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5011, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public void mo11494j(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5017, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public void mo11495k(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5037, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public void mo11496l(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5012, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public void mo11497m(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5014, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public void mo11498n(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5018, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public void mo11499o(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5019, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onAchievementUpdated(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f15560a.transact(5003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onLeftRoom(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f15560a.transact(5020, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onP2PConnected(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(str);
                    this.f15560a.transact(GamesClient.STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onP2PDisconnected(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    obtain.writeString(str);
                    this.f15560a.transact(6002, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onRealTimeMessageReceived(RealTimeMessage realTimeMessage) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (realTimeMessage != null) {
                        obtain.writeInt(1);
                        realTimeMessage.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5032, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSignOutComplete() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.f15560a.transact(5016, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public void mo11506p(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5021, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public void mo11507q(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5022, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public void mo11508r(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5023, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public void mo11509s(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5024, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public void mo11510t(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5025, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public void mo11511u(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5038, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v */
            public void mo11512v(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5035, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: w */
            public void mo11513w(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15560a.transact(5039, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3658a() {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
        }

        /* renamed from: n */
        public static C3657ay m15891n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3657ay)) ? new C3659a(iBinder) : (C3657ay) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: com.google.android.gms.games.multiplayer.realtime.RealTimeMessage} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v73, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v99, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v102, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v108, resolved type: com.google.android.gms.common.data.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: com.google.android.gms.common.data.d} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v119 */
        /* JADX WARNING: type inference failed for: r0v120 */
        /* JADX WARNING: type inference failed for: r0v121 */
        /* JADX WARNING: type inference failed for: r0v122 */
        /* JADX WARNING: type inference failed for: r0v123 */
        /* JADX WARNING: type inference failed for: r0v124 */
        /* JADX WARNING: type inference failed for: r0v125 */
        /* JADX WARNING: type inference failed for: r0v126 */
        /* JADX WARNING: type inference failed for: r0v127 */
        /* JADX WARNING: type inference failed for: r0v128 */
        /* JADX WARNING: type inference failed for: r0v129 */
        /* JADX WARNING: type inference failed for: r0v130 */
        /* JADX WARNING: type inference failed for: r0v131 */
        /* JADX WARNING: type inference failed for: r0v132 */
        /* JADX WARNING: type inference failed for: r0v133 */
        /* JADX WARNING: type inference failed for: r0v134 */
        /* JADX WARNING: type inference failed for: r0v135 */
        /* JADX WARNING: type inference failed for: r0v136 */
        /* JADX WARNING: type inference failed for: r0v137 */
        /* JADX WARNING: type inference failed for: r0v138 */
        /* JADX WARNING: type inference failed for: r0v139 */
        /* JADX WARNING: type inference failed for: r0v140 */
        /* JADX WARNING: type inference failed for: r0v141 */
        /* JADX WARNING: type inference failed for: r0v142 */
        /* JADX WARNING: type inference failed for: r0v143 */
        /* JADX WARNING: type inference failed for: r0v144 */
        /* JADX WARNING: type inference failed for: r0v145 */
        /* JADX WARNING: type inference failed for: r0v146 */
        /* JADX WARNING: type inference failed for: r0v147 */
        /* JADX WARNING: type inference failed for: r0v148 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 0
                r2 = 1
                switch(r5) {
                    case 5001: goto L_0x0010;
                    case 5002: goto L_0x0024;
                    case 5003: goto L_0x003c;
                    case 5004: goto L_0x0050;
                    case 5005: goto L_0x0068;
                    case 5006: goto L_0x008f;
                    case 5007: goto L_0x00a8;
                    case 5008: goto L_0x00c1;
                    case 5009: goto L_0x00da;
                    case 5010: goto L_0x00f3;
                    case 5011: goto L_0x010c;
                    case 5012: goto L_0x0125;
                    case 5013: goto L_0x013e;
                    case 5014: goto L_0x014f;
                    case 5015: goto L_0x0168;
                    case 5016: goto L_0x0179;
                    case 5017: goto L_0x0186;
                    case 5018: goto L_0x01b8;
                    case 5019: goto L_0x01d1;
                    case 5020: goto L_0x01ea;
                    case 5021: goto L_0x01ff;
                    case 5022: goto L_0x0218;
                    case 5023: goto L_0x0231;
                    case 5024: goto L_0x024a;
                    case 5025: goto L_0x0263;
                    case 5026: goto L_0x027c;
                    case 5027: goto L_0x0299;
                    case 5028: goto L_0x02b6;
                    case 5029: goto L_0x02d3;
                    case 5030: goto L_0x02f0;
                    case 5031: goto L_0x030d;
                    case 5032: goto L_0x032a;
                    case 5033: goto L_0x0345;
                    case 5034: goto L_0x035e;
                    case 5035: goto L_0x0395;
                    case 5036: goto L_0x03ae;
                    case 5037: goto L_0x019f;
                    case 5038: goto L_0x037c;
                    case 5039: goto L_0x03bf;
                    case 5040: goto L_0x03d8;
                    case 6001: goto L_0x03e9;
                    case 6002: goto L_0x03fa;
                    case 1598968902: goto L_0x000a;
                    default: goto L_0x0005;
                }
            L_0x0005:
                boolean r2 = super.onTransact(r5, r6, r7, r8)
            L_0x0009:
                return r2
            L_0x000a:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r7.writeString(r0)
                goto L_0x0009
            L_0x0010:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                java.lang.String r1 = r6.readString()
                r4.mo11477a((int) r0, (java.lang.String) r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x0024:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0035
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x0035:
                r4.mo11481b(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x003c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                java.lang.String r1 = r6.readString()
                r4.onAchievementUpdated(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x0050:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0061
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x0061:
                r4.mo11483c(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0068:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x008d
                com.google.android.gms.common.data.e r1 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r1 = r1.createFromParcel(r6)
            L_0x0079:
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x0085
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x0085:
                r4.mo11479a((com.google.android.gms.common.data.C3525d) r1, (com.google.android.gms.common.data.C3525d) r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x008d:
                r1 = r0
                goto L_0x0079
            L_0x008f:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x00a0
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x00a0:
                r4.mo11485d(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x00a8:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x00b9
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x00b9:
                r4.mo11487e(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x00c1:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x00d2
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x00d2:
                r4.mo11489f(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x00da:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x00eb
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x00eb:
                r4.mo11491g(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x00f3:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0104
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x0104:
                r4.mo11492h(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x010c:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x011d
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x011d:
                r4.mo11493i(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0125:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0136
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x0136:
                r4.mo11496l(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x013e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo11472B(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x014f:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0160
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x0160:
                r4.mo11497m(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0168:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo11473C(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0179:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                r4.onSignOutComplete()
                r7.writeNoException()
                goto L_0x0009
            L_0x0186:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0197
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x0197:
                r4.mo11494j(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x019f:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x01b0
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x01b0:
                r4.mo11495k(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x01b8:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x01c9
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x01c9:
                r4.mo11498n(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x01d1:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x01e2
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x01e2:
                r4.mo11499o(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x01ea:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                java.lang.String r1 = r6.readString()
                r4.onLeftRoom(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x01ff:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0210
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x0210:
                r4.mo11506p(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0218:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0229
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x0229:
                r4.mo11507q(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0231:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0242
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x0242:
                r4.mo11508r(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x024a:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x025b
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x025b:
                r4.mo11509s(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0263:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0274
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x0274:
                r4.mo11510t(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x027c:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x028d
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x028d:
                java.lang.String[] r1 = r6.createStringArray()
                r4.mo11480a((com.google.android.gms.common.data.C3525d) r0, (java.lang.String[]) r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x0299:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x02aa
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x02aa:
                java.lang.String[] r1 = r6.createStringArray()
                r4.mo11482b(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x02b6:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x02c7
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x02c7:
                java.lang.String[] r1 = r6.createStringArray()
                r4.mo11484c(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x02d3:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x02e4
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x02e4:
                java.lang.String[] r1 = r6.createStringArray()
                r4.mo11486d(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x02f0:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0301
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x0301:
                java.lang.String[] r1 = r6.createStringArray()
                r4.mo11488e(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x030d:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x031e
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x031e:
                java.lang.String[] r1 = r6.createStringArray()
                r4.mo11490f(r0, r1)
                r7.writeNoException()
                goto L_0x0009
            L_0x032a:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x033d
                android.os.Parcelable$Creator<com.google.android.gms.games.multiplayer.realtime.RealTimeMessage> r0 = com.google.android.gms.games.multiplayer.realtime.RealTimeMessage.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.games.multiplayer.realtime.RealTimeMessage r0 = (com.google.android.gms.games.multiplayer.realtime.RealTimeMessage) r0
            L_0x033d:
                r4.onRealTimeMessageReceived(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0345:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                int r1 = r6.readInt()
                java.lang.String r3 = r6.readString()
                r4.mo11476a((int) r0, (int) r1, (java.lang.String) r3)
                r7.writeNoException()
                goto L_0x0009
            L_0x035e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r1 = r6.readInt()
                java.lang.String r3 = r6.readString()
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x037a
                r0 = r2
            L_0x0372:
                r4.mo11478a((int) r1, (java.lang.String) r3, (boolean) r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x037a:
                r0 = 0
                goto L_0x0372
            L_0x037c:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x038d
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x038d:
                r4.mo11511u(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x0395:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x03a6
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x03a6:
                r4.mo11512v(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x03ae:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo11474D(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x03bf:
                java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r1)
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x03d0
                com.google.android.gms.common.data.e r0 = com.google.android.gms.common.data.C3525d.CREATOR
                com.google.android.gms.common.data.d r0 = r0.createFromParcel(r6)
            L_0x03d0:
                r4.mo11513w(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x03d8:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo11475E(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x03e9:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.onP2PConnected(r0)
                r7.writeNoException()
                goto L_0x0009
            L_0x03fa:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.onP2PDisconnected(r0)
                r7.writeNoException()
                goto L_0x0009
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C3657ay.C3658a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: B */
    void mo11472B(int i) throws RemoteException;

    /* renamed from: C */
    void mo11473C(int i) throws RemoteException;

    /* renamed from: D */
    void mo11474D(int i) throws RemoteException;

    /* renamed from: E */
    void mo11475E(int i) throws RemoteException;

    /* renamed from: a */
    void mo11476a(int i, int i2, String str) throws RemoteException;

    /* renamed from: a */
    void mo11477a(int i, String str) throws RemoteException;

    /* renamed from: a */
    void mo11478a(int i, String str, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo11479a(C3525d dVar, C3525d dVar2) throws RemoteException;

    /* renamed from: a */
    void mo11480a(C3525d dVar, String[] strArr) throws RemoteException;

    /* renamed from: b */
    void mo11481b(C3525d dVar) throws RemoteException;

    /* renamed from: b */
    void mo11482b(C3525d dVar, String[] strArr) throws RemoteException;

    /* renamed from: c */
    void mo11483c(C3525d dVar) throws RemoteException;

    /* renamed from: c */
    void mo11484c(C3525d dVar, String[] strArr) throws RemoteException;

    /* renamed from: d */
    void mo11485d(C3525d dVar) throws RemoteException;

    /* renamed from: d */
    void mo11486d(C3525d dVar, String[] strArr) throws RemoteException;

    /* renamed from: e */
    void mo11487e(C3525d dVar) throws RemoteException;

    /* renamed from: e */
    void mo11488e(C3525d dVar, String[] strArr) throws RemoteException;

    /* renamed from: f */
    void mo11489f(C3525d dVar) throws RemoteException;

    /* renamed from: f */
    void mo11490f(C3525d dVar, String[] strArr) throws RemoteException;

    /* renamed from: g */
    void mo11491g(C3525d dVar) throws RemoteException;

    /* renamed from: h */
    void mo11492h(C3525d dVar) throws RemoteException;

    /* renamed from: i */
    void mo11493i(C3525d dVar) throws RemoteException;

    /* renamed from: j */
    void mo11494j(C3525d dVar) throws RemoteException;

    /* renamed from: k */
    void mo11495k(C3525d dVar) throws RemoteException;

    /* renamed from: l */
    void mo11496l(C3525d dVar) throws RemoteException;

    /* renamed from: m */
    void mo11497m(C3525d dVar) throws RemoteException;

    /* renamed from: n */
    void mo11498n(C3525d dVar) throws RemoteException;

    /* renamed from: o */
    void mo11499o(C3525d dVar) throws RemoteException;

    void onAchievementUpdated(int i, String str) throws RemoteException;

    void onLeftRoom(int i, String str) throws RemoteException;

    void onP2PConnected(String str) throws RemoteException;

    void onP2PDisconnected(String str) throws RemoteException;

    void onRealTimeMessageReceived(RealTimeMessage realTimeMessage) throws RemoteException;

    void onSignOutComplete() throws RemoteException;

    /* renamed from: p */
    void mo11506p(C3525d dVar) throws RemoteException;

    /* renamed from: q */
    void mo11507q(C3525d dVar) throws RemoteException;

    /* renamed from: r */
    void mo11508r(C3525d dVar) throws RemoteException;

    /* renamed from: s */
    void mo11509s(C3525d dVar) throws RemoteException;

    /* renamed from: t */
    void mo11510t(C3525d dVar) throws RemoteException;

    /* renamed from: u */
    void mo11511u(C3525d dVar) throws RemoteException;

    /* renamed from: v */
    void mo11512v(C3525d dVar) throws RemoteException;

    /* renamed from: w */
    void mo11513w(C3525d dVar) throws RemoteException;
}
