package android.support.p001v4.p016k;

import android.util.Log;
import com.cootek.smartinput5.func.C2119x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: android.support.v4.k.c */
/* compiled from: AtomicFile */
public class C0300c {

    /* renamed from: a */
    private final File f749a;

    /* renamed from: b */
    private final File f750b;

    public C0300c(File file) {
        this.f749a = file;
        this.f750b = new File(file.getPath() + C2119x.f8995a);
    }

    /* renamed from: a */
    public File mo875a() {
        return this.f749a;
    }

    /* renamed from: b */
    public void mo877b() {
        this.f749a.delete();
        this.f750b.delete();
    }

    /* renamed from: c */
    public FileOutputStream mo879c() throws IOException {
        if (this.f749a.exists()) {
            if (this.f750b.exists()) {
                this.f749a.delete();
            } else if (!this.f749a.renameTo(this.f750b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f749a + " to backup file " + this.f750b);
            }
        }
        try {
            return new FileOutputStream(this.f749a);
        } catch (FileNotFoundException e) {
            if (!this.f749a.getParentFile().mkdir()) {
                throw new IOException("Couldn't create directory " + this.f749a);
            }
            try {
                return new FileOutputStream(this.f749a);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + this.f749a);
            }
        }
    }

    /* renamed from: a */
    public void mo876a(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m1191c(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f750b.delete();
            } catch (IOException e) {
                Log.w("AtomicFile", "finishWrite: Got exception:", e);
            }
        }
    }

    /* renamed from: b */
    public void mo878b(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m1191c(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f749a.delete();
                this.f750b.renameTo(this.f749a);
            } catch (IOException e) {
                Log.w("AtomicFile", "failWrite: Got exception:", e);
            }
        }
    }

    /* renamed from: d */
    public FileInputStream mo880d() throws FileNotFoundException {
        if (this.f750b.exists()) {
            this.f749a.delete();
            this.f750b.renameTo(this.f749a);
        }
        return new FileInputStream(this.f749a);
    }

    /* renamed from: e */
    public byte[] mo881e() throws IOException {
        byte[] bArr;
        int i = 0;
        FileInputStream d = mo880d();
        try {
            byte[] bArr2 = new byte[d.available()];
            while (true) {
                int read = d.read(bArr2, i, bArr2.length - i);
                if (read <= 0) {
                    return bArr2;
                }
                int i2 = read + i;
                int available = d.available();
                if (available > bArr2.length - i2) {
                    bArr = new byte[(available + i2)];
                    System.arraycopy(bArr2, 0, bArr, 0, i2);
                } else {
                    bArr = bArr2;
                }
                bArr2 = bArr;
                i = i2;
            }
        } finally {
            d.close();
        }
    }

    /* renamed from: c */
    static boolean m1191c(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException e) {
                return false;
            }
        }
        return true;
    }
}
