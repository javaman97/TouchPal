package com.google.android.gms.internal;

import android.net.LocalSocket;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.games.RealTimeSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.bb */
final class C3668bb implements RealTimeSocket {

    /* renamed from: aB */
    private ParcelFileDescriptor f15568aB;

    /* renamed from: dX */
    private final String f15569dX;

    /* renamed from: en */
    private final LocalSocket f15570en;

    C3668bb(LocalSocket localSocket, String str) {
        this.f15570en = localSocket;
        this.f15569dX = str;
    }

    public void close() throws IOException {
        this.f15570en.close();
    }

    public InputStream getInputStream() throws IOException {
        return this.f15570en.getInputStream();
    }

    public OutputStream getOutputStream() throws IOException {
        return this.f15570en.getOutputStream();
    }

    public ParcelFileDescriptor getParcelFileDescriptor() throws IOException {
        if (this.f15568aB == null && !isClosed()) {
            Parcel obtain = Parcel.obtain();
            obtain.writeFileDescriptor(this.f15570en.getFileDescriptor());
            obtain.setDataPosition(0);
            this.f15568aB = obtain.readFileDescriptor();
        }
        return this.f15568aB;
    }

    public boolean isClosed() {
        return !this.f15570en.isConnected() && !this.f15570en.isBound();
    }
}
