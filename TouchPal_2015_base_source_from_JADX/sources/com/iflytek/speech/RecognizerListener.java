package com.iflytek.speech;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface RecognizerListener extends IInterface {

    public static abstract class Stub extends Binder implements RecognizerListener {
        private static final String DESCRIPTOR = "com.iflytek.speech.RecognizerListener";
        static final int TRANSACTION_onBeginOfSpeech = 2;
        static final int TRANSACTION_onEndOfSpeech = 3;
        static final int TRANSACTION_onError = 5;
        static final int TRANSACTION_onEvent = 6;
        static final int TRANSACTION_onResult = 4;
        static final int TRANSACTION_onVolumeChanged = 1;

        private static class Proxy implements RecognizerListener {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void onBeginOfSpeech() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onEndOfSpeech() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onError(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onEvent(int i, int i2, int i3, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onResult(RecognizerResult recognizerResult, boolean z) throws RemoteException {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (recognizerResult != null) {
                        obtain.writeInt(1);
                        recognizerResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onVolumeChanged(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static RecognizerListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof RecognizerListener)) ? new Proxy(iBinder) : (RecognizerListener) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.iflytek.speech.RecognizerResult} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v15 */
        /* JADX WARNING: type inference failed for: r0v16 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) throws android.os.RemoteException {
            /*
                r6 = this;
                r0 = 0
                r2 = 1
                switch(r7) {
                    case 1: goto L_0x0010;
                    case 2: goto L_0x001d;
                    case 3: goto L_0x0026;
                    case 4: goto L_0x002f;
                    case 5: goto L_0x004f;
                    case 6: goto L_0x005c;
                    case 1598968902: goto L_0x000a;
                    default: goto L_0x0005;
                }
            L_0x0005:
                boolean r2 = super.onTransact(r7, r8, r9, r10)
            L_0x0009:
                return r2
            L_0x000a:
                java.lang.String r0 = "com.iflytek.speech.RecognizerListener"
                r9.writeString(r0)
                goto L_0x0009
            L_0x0010:
                java.lang.String r0 = "com.iflytek.speech.RecognizerListener"
                r8.enforceInterface(r0)
                int r0 = r8.readInt()
                r6.onVolumeChanged(r0)
                goto L_0x0009
            L_0x001d:
                java.lang.String r0 = "com.iflytek.speech.RecognizerListener"
                r8.enforceInterface(r0)
                r6.onBeginOfSpeech()
                goto L_0x0009
            L_0x0026:
                java.lang.String r0 = "com.iflytek.speech.RecognizerListener"
                r8.enforceInterface(r0)
                r6.onEndOfSpeech()
                goto L_0x0009
            L_0x002f:
                java.lang.String r1 = "com.iflytek.speech.RecognizerListener"
                r8.enforceInterface(r1)
                int r1 = r8.readInt()
                if (r1 == 0) goto L_0x0042
                android.os.Parcelable$Creator<com.iflytek.speech.RecognizerResult> r0 = com.iflytek.speech.RecognizerResult.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r8)
                com.iflytek.speech.RecognizerResult r0 = (com.iflytek.speech.RecognizerResult) r0
            L_0x0042:
                int r1 = r8.readInt()
                if (r1 == 0) goto L_0x004d
                r1 = r2
            L_0x0049:
                r6.onResult(r0, r1)
                goto L_0x0009
            L_0x004d:
                r1 = 0
                goto L_0x0049
            L_0x004f:
                java.lang.String r0 = "com.iflytek.speech.RecognizerListener"
                r8.enforceInterface(r0)
                int r0 = r8.readInt()
                r6.onError(r0)
                goto L_0x0009
            L_0x005c:
                java.lang.String r1 = "com.iflytek.speech.RecognizerListener"
                r8.enforceInterface(r1)
                int r1 = r8.readInt()
                int r3 = r8.readInt()
                int r4 = r8.readInt()
                int r5 = r8.readInt()
                if (r5 == 0) goto L_0x007b
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r8)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x007b:
                r6.onEvent(r1, r3, r4, r0)
                goto L_0x0009
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iflytek.speech.RecognizerListener.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void onBeginOfSpeech() throws RemoteException;

    void onEndOfSpeech() throws RemoteException;

    void onError(int i) throws RemoteException;

    void onEvent(int i, int i2, int i3, Bundle bundle) throws RemoteException;

    void onResult(RecognizerResult recognizerResult, boolean z) throws RemoteException;

    void onVolumeChanged(int i) throws RemoteException;
}
