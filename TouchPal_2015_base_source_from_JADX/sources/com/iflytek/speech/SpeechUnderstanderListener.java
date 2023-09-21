package com.iflytek.speech;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface SpeechUnderstanderListener extends IInterface {

    public static abstract class Stub extends Binder implements SpeechUnderstanderListener {
        private static final String DESCRIPTOR = "com.iflytek.speech.SpeechUnderstanderListener";
        static final int TRANSACTION_onBeginOfSpeech = 2;
        static final int TRANSACTION_onEndOfSpeech = 3;
        static final int TRANSACTION_onError = 5;
        static final int TRANSACTION_onEvent = 6;
        static final int TRANSACTION_onResult = 4;
        static final int TRANSACTION_onVolumeChanged = 1;

        private static class Proxy implements SpeechUnderstanderListener {
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

            public void onResult(UnderstanderResult understanderResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (understanderResult != null) {
                        obtain.writeInt(1);
                        understanderResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
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

        public static SpeechUnderstanderListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof SpeechUnderstanderListener)) ? new Proxy(iBinder) : (SpeechUnderstanderListener) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.iflytek.speech.UnderstanderResult} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v24 */
        /* JADX WARNING: type inference failed for: r0v25 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) throws android.os.RemoteException {
            /*
                r6 = this;
                r0 = 0
                r1 = 1
                switch(r7) {
                    case 1: goto L_0x0011;
                    case 2: goto L_0x001f;
                    case 3: goto L_0x0029;
                    case 4: goto L_0x0033;
                    case 5: goto L_0x004b;
                    case 6: goto L_0x0059;
                    case 1598968902: goto L_0x000a;
                    default: goto L_0x0005;
                }
            L_0x0005:
                boolean r0 = super.onTransact(r7, r8, r9, r10)
            L_0x0009:
                return r0
            L_0x000a:
                java.lang.String r0 = "com.iflytek.speech.SpeechUnderstanderListener"
                r9.writeString(r0)
                r0 = r1
                goto L_0x0009
            L_0x0011:
                java.lang.String r0 = "com.iflytek.speech.SpeechUnderstanderListener"
                r8.enforceInterface(r0)
                int r0 = r8.readInt()
                r6.onVolumeChanged(r0)
                r0 = r1
                goto L_0x0009
            L_0x001f:
                java.lang.String r0 = "com.iflytek.speech.SpeechUnderstanderListener"
                r8.enforceInterface(r0)
                r6.onBeginOfSpeech()
                r0 = r1
                goto L_0x0009
            L_0x0029:
                java.lang.String r0 = "com.iflytek.speech.SpeechUnderstanderListener"
                r8.enforceInterface(r0)
                r6.onEndOfSpeech()
                r0 = r1
                goto L_0x0009
            L_0x0033:
                java.lang.String r2 = "com.iflytek.speech.SpeechUnderstanderListener"
                r8.enforceInterface(r2)
                int r2 = r8.readInt()
                if (r2 == 0) goto L_0x0046
                android.os.Parcelable$Creator<com.iflytek.speech.UnderstanderResult> r0 = com.iflytek.speech.UnderstanderResult.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r8)
                com.iflytek.speech.UnderstanderResult r0 = (com.iflytek.speech.UnderstanderResult) r0
            L_0x0046:
                r6.onResult(r0)
                r0 = r1
                goto L_0x0009
            L_0x004b:
                java.lang.String r0 = "com.iflytek.speech.SpeechUnderstanderListener"
                r8.enforceInterface(r0)
                int r0 = r8.readInt()
                r6.onError(r0)
                r0 = r1
                goto L_0x0009
            L_0x0059:
                java.lang.String r2 = "com.iflytek.speech.SpeechUnderstanderListener"
                r8.enforceInterface(r2)
                int r2 = r8.readInt()
                int r3 = r8.readInt()
                int r4 = r8.readInt()
                int r5 = r8.readInt()
                if (r5 == 0) goto L_0x0078
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r8)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0078:
                r6.onEvent(r2, r3, r4, r0)
                r0 = r1
                goto L_0x0009
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iflytek.speech.SpeechUnderstanderListener.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void onBeginOfSpeech() throws RemoteException;

    void onEndOfSpeech() throws RemoteException;

    void onError(int i) throws RemoteException;

    void onEvent(int i, int i2, int i3, Bundle bundle) throws RemoteException;

    void onResult(UnderstanderResult understanderResult) throws RemoteException;

    void onVolumeChanged(int i) throws RemoteException;
}
