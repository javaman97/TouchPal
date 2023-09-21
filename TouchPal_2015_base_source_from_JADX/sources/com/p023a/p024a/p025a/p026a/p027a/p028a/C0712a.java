package com.p023a.p024a.p025a.p026a.p027a.p028a;

import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.func.C1389aD;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.a.a.a.a.a.a.a */
/* compiled from: DiskLruCache */
final class C0712a implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final OutputStream f1732B = new C0718c();

    /* renamed from: a */
    static final String f1733a = "journal";

    /* renamed from: b */
    static final String f1734b = "journal.tmp";

    /* renamed from: c */
    static final String f1735c = "journal.bkp";

    /* renamed from: d */
    static final String f1736d = "libcore.io.DiskLruCache";

    /* renamed from: e */
    static final String f1737e = "1";

    /* renamed from: f */
    static final long f1738f = -1;

    /* renamed from: g */
    static final Pattern f1739g = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: i */
    private static final String f1740i = "CLEAN";

    /* renamed from: j */
    private static final String f1741j = "DIRTY";

    /* renamed from: k */
    private static final String f1742k = "REMOVE";

    /* renamed from: l */
    private static final String f1743l = "READ";

    /* renamed from: A */
    private final Callable<Void> f1744A = new C0717b(this);

    /* renamed from: h */
    final ThreadPoolExecutor f1745h = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final File f1746m;

    /* renamed from: n */
    private final File f1747n;

    /* renamed from: o */
    private final File f1748o;

    /* renamed from: p */
    private final File f1749p;

    /* renamed from: q */
    private final int f1750q;

    /* renamed from: r */
    private long f1751r;

    /* renamed from: s */
    private int f1752s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final int f1753t;

    /* renamed from: u */
    private long f1754u = 0;

    /* renamed from: v */
    private int f1755v = 0;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public Writer f1756w;

    /* renamed from: x */
    private final LinkedHashMap<String, C0715b> f1757x = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f1758y;

    /* renamed from: z */
    private long f1759z = 0;

    private C0712a(File file, int i, int i2, long j, int i3) {
        this.f1746m = file;
        this.f1750q = i;
        this.f1747n = new File(file, f1733a);
        this.f1748o = new File(file, f1734b);
        this.f1749p = new File(file, f1735c);
        this.f1753t = i2;
        this.f1751r = j;
        this.f1752s = i3;
    }

    /* renamed from: a */
    public static C0712a m4029a(File file, int i, int i2, long j, int i3) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 <= 0) {
            throw new IllegalArgumentException("maxFileCount <= 0");
        } else if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        } else {
            File file2 = new File(file, f1735c);
            if (file2.exists()) {
                File file3 = new File(file, f1733a);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m4035a(file2, file3, false);
                }
            }
            C0712a aVar = new C0712a(file, i, i2, j, i3);
            if (aVar.f1747n.exists()) {
                try {
                    aVar.m4046j();
                    aVar.m4047k();
                    aVar.f1756w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.f1747n, true), C0722g.f1798a));
                    return aVar;
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.mo2701h();
                }
            }
            file.mkdirs();
            C0712a aVar2 = new C0712a(file, i, i2, j, i3);
            aVar2.m4048l();
            return aVar2;
        }
    }

    /* renamed from: j */
    private void m4046j() throws IOException {
        int i;
        C0720e eVar = new C0720e(new FileInputStream(this.f1747n), C0722g.f1798a);
        try {
            String a = eVar.mo2728a();
            String a2 = eVar.mo2728a();
            String a3 = eVar.mo2728a();
            String a4 = eVar.mo2728a();
            String a5 = eVar.mo2728a();
            if (!f1736d.equals(a) || !f1737e.equals(a2) || !Integer.toString(this.f1750q).equals(a3) || !Integer.toString(this.f1753t).equals(a4) || !"".equals(a5)) {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
            }
            i = 0;
            while (true) {
                m4039d(eVar.mo2728a());
                i++;
            }
        } catch (EOFException e) {
            this.f1758y = i - this.f1757x.size();
            C0722g.m4111a((Closeable) eVar);
        } catch (Throwable th) {
            C0722g.m4111a((Closeable) eVar);
            throw th;
        }
    }

    /* renamed from: d */
    private void m4039d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            String substring = str.substring(i);
            if (indexOf != f1742k.length() || !str.startsWith(f1742k)) {
                str2 = substring;
            } else {
                this.f1757x.remove(substring);
                return;
            }
        } else {
            str2 = str.substring(i, indexOf2);
        }
        C0715b bVar = this.f1757x.get(str2);
        if (bVar == null) {
            bVar = new C0715b(this, str2, (C0717b) null);
            this.f1757x.put(str2, bVar);
        }
        if (indexOf2 != -1 && indexOf == f1740i.length() && str.startsWith(f1740i)) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            boolean unused = bVar.f1769d = true;
            C0713a unused2 = bVar.f1770e = null;
            bVar.m4079a(split);
        } else if (indexOf2 == -1 && indexOf == f1741j.length() && str.startsWith(f1741j)) {
            C0713a unused3 = bVar.f1770e = new C0713a(this, bVar, (C0717b) null);
        } else if (indexOf2 != -1 || indexOf != f1743l.length() || !str.startsWith(f1743l)) {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: k */
    private void m4047k() throws IOException {
        m4034a(this.f1748o);
        Iterator<C0715b> it = this.f1757x.values().iterator();
        while (it.hasNext()) {
            C0715b next = it.next();
            if (next.f1770e == null) {
                for (int i = 0; i < this.f1753t; i++) {
                    this.f1754u += next.f1768c[i];
                    this.f1755v++;
                }
            } else {
                C0713a unused = next.f1770e = null;
                for (int i2 = 0; i2 < this.f1753t; i2++) {
                    m4034a(next.mo2713a(i2));
                    m4034a(next.mo2715b(i2));
                }
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public synchronized void m4048l() throws IOException {
        if (this.f1756w != null) {
            this.f1756w.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1748o), C0722g.f1798a));
        try {
            bufferedWriter.write(f1736d);
            bufferedWriter.write(C0911j.f2473c);
            bufferedWriter.write(f1737e);
            bufferedWriter.write(C0911j.f2473c);
            bufferedWriter.write(Integer.toString(this.f1750q));
            bufferedWriter.write(C0911j.f2473c);
            bufferedWriter.write(Integer.toString(this.f1753t));
            bufferedWriter.write(C0911j.f2473c);
            bufferedWriter.write(C0911j.f2473c);
            for (C0715b next : this.f1757x.values()) {
                if (next.f1770e != null) {
                    bufferedWriter.write("DIRTY " + next.f1767b + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f1767b + next.mo2714a() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f1747n.exists()) {
                m4035a(this.f1747n, this.f1749p, true);
            }
            m4035a(this.f1748o, this.f1747n, false);
            this.f1749p.delete();
            this.f1756w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1747n, true), C0722g.f1798a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m4034a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m4035a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m4034a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public synchronized C0716c mo2689a(String str) throws IOException {
        C0716c cVar = null;
        synchronized (this) {
            m4050n();
            m4042e(str);
            C0715b bVar = this.f1757x.get(str);
            if (bVar != null) {
                if (bVar.f1769d) {
                    File[] fileArr = new File[this.f1753t];
                    InputStream[] inputStreamArr = new InputStream[this.f1753t];
                    int i = 0;
                    while (i < this.f1753t) {
                        try {
                            File a = bVar.mo2713a(i);
                            fileArr[i] = a;
                            inputStreamArr[i] = new FileInputStream(a);
                            i++;
                        } catch (FileNotFoundException e) {
                            int i2 = 0;
                            while (i2 < this.f1753t && inputStreamArr[i2] != null) {
                                C0722g.m4111a((Closeable) inputStreamArr[i2]);
                                i2++;
                            }
                        }
                    }
                    this.f1758y++;
                    this.f1756w.append("READ " + str + 10);
                    if (m4049m()) {
                        this.f1745h.submit(this.f1744A);
                    }
                    cVar = new C0716c(this, str, bVar.f1771f, fileArr, inputStreamArr, bVar.f1768c, (C0717b) null);
                }
            }
        }
        return cVar;
    }

    /* renamed from: b */
    public C0713a mo2693b(String str) throws IOException {
        return m4028a(str, -1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized C0713a m4028a(String str, long j) throws IOException {
        C0715b bVar;
        C0713a aVar;
        m4050n();
        m4042e(str);
        C0715b bVar2 = this.f1757x.get(str);
        if (j == -1 || (bVar2 != null && bVar2.f1771f == j)) {
            if (bVar2 == null) {
                C0715b bVar3 = new C0715b(this, str, (C0717b) null);
                this.f1757x.put(str, bVar3);
                bVar = bVar3;
            } else if (bVar2.f1770e != null) {
                aVar = null;
            } else {
                bVar = bVar2;
            }
            aVar = new C0713a(this, bVar, (C0717b) null);
            C0713a unused = bVar.f1770e = aVar;
            this.f1756w.write("DIRTY " + str + 10);
            this.f1756w.flush();
        } else {
            aVar = null;
        }
        return aVar;
    }

    /* renamed from: a */
    public File mo2690a() {
        return this.f1746m;
    }

    /* renamed from: b */
    public synchronized long mo2692b() {
        return this.f1751r;
    }

    /* renamed from: c */
    public synchronized int mo2694c() {
        return this.f1752s;
    }

    /* renamed from: a */
    public synchronized void mo2691a(long j) {
        this.f1751r = j;
        this.f1745h.submit(this.f1744A);
    }

    /* renamed from: d */
    public synchronized long mo2697d() {
        return this.f1754u;
    }

    /* renamed from: e */
    public synchronized long mo2698e() {
        return (long) this.f1755v;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m4032a(C0713a aVar, boolean z) throws IOException {
        synchronized (this) {
            C0715b a = aVar.f1761b;
            if (a.f1770e != aVar) {
                throw new IllegalStateException();
            }
            if (z) {
                if (!a.f1769d) {
                    int i = 0;
                    while (true) {
                        if (i < this.f1753t) {
                            if (!aVar.f1762c[i]) {
                                aVar.mo2706b();
                                throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                            } else if (!a.mo2715b(i).exists()) {
                                aVar.mo2706b();
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < this.f1753t; i2++) {
                File b = a.mo2715b(i2);
                if (!z) {
                    m4034a(b);
                } else if (b.exists()) {
                    File a2 = a.mo2713a(i2);
                    b.renameTo(a2);
                    long j = a.f1768c[i2];
                    long length = a2.length();
                    a.f1768c[i2] = length;
                    this.f1754u = (this.f1754u - j) + length;
                    this.f1755v++;
                }
            }
            this.f1758y++;
            C0713a unused = a.f1770e = null;
            if (a.f1769d || z) {
                boolean unused2 = a.f1769d = true;
                this.f1756w.write("CLEAN " + a.f1767b + a.mo2714a() + 10);
                if (z) {
                    long j2 = this.f1759z;
                    this.f1759z = 1 + j2;
                    long unused3 = a.f1771f = j2;
                }
            } else {
                this.f1757x.remove(a.f1767b);
                this.f1756w.write("REMOVE " + a.f1767b + 10);
            }
            this.f1756w.flush();
            if (this.f1754u > this.f1751r || this.f1755v > this.f1752s || m4049m()) {
                this.f1745h.submit(this.f1744A);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public boolean m4049m() {
        return this.f1758y >= 2000 && this.f1758y >= this.f1757x.size();
    }

    /* renamed from: c */
    public synchronized boolean mo2695c(String str) throws IOException {
        boolean z;
        int i = 0;
        synchronized (this) {
            m4050n();
            m4042e(str);
            C0715b bVar = this.f1757x.get(str);
            if (bVar == null || bVar.f1770e != null) {
                z = false;
            } else {
                while (i < this.f1753t) {
                    File a = bVar.mo2713a(i);
                    if (!a.exists() || a.delete()) {
                        this.f1754u -= bVar.f1768c[i];
                        this.f1755v--;
                        bVar.f1768c[i] = 0;
                        i++;
                    } else {
                        throw new IOException("failed to delete " + a);
                    }
                }
                this.f1758y++;
                this.f1756w.append("REMOVE " + str + 10);
                this.f1757x.remove(str);
                if (m4049m()) {
                    this.f1745h.submit(this.f1744A);
                }
                z = true;
            }
        }
        return z;
    }

    /* renamed from: f */
    public synchronized boolean mo2699f() {
        return this.f1756w == null;
    }

    /* renamed from: n */
    private void m4050n() {
        if (this.f1756w == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: g */
    public synchronized void mo2700g() throws IOException {
        m4050n();
        m4051o();
        m4052p();
        this.f1756w.flush();
    }

    public synchronized void close() throws IOException {
        if (this.f1756w != null) {
            Iterator it = new ArrayList(this.f1757x.values()).iterator();
            while (it.hasNext()) {
                C0715b bVar = (C0715b) it.next();
                if (bVar.f1770e != null) {
                    bVar.f1770e.mo2706b();
                }
            }
            m4051o();
            m4052p();
            this.f1756w.close();
            this.f1756w = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m4051o() throws IOException {
        while (this.f1754u > this.f1751r) {
            mo2695c((String) this.f1757x.entrySet().iterator().next().getKey());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m4052p() throws IOException {
        while (this.f1755v > this.f1752s) {
            mo2695c((String) this.f1757x.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: h */
    public void mo2701h() throws IOException {
        close();
        C0722g.m4112a(this.f1746m);
    }

    /* renamed from: e */
    private void m4042e(String str) {
        if (!f1739g.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m4036b(InputStream inputStream) throws IOException {
        return C0722g.m4110a((Reader) new InputStreamReader(inputStream, C0722g.f1799b));
    }

    /* renamed from: com.a.a.a.a.a.a.a$c */
    /* compiled from: DiskLruCache */
    public final class C0716c implements Closeable {

        /* renamed from: b */
        private final String f1773b;

        /* renamed from: c */
        private final long f1774c;

        /* renamed from: d */
        private File[] f1775d;

        /* renamed from: e */
        private final InputStream[] f1776e;

        /* renamed from: f */
        private final long[] f1777f;

        /* synthetic */ C0716c(C0712a aVar, String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr, C0717b bVar) {
            this(str, j, fileArr, inputStreamArr, jArr);
        }

        private C0716c(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.f1773b = str;
            this.f1774c = j;
            this.f1775d = fileArr;
            this.f1776e = inputStreamArr;
            this.f1777f = jArr;
        }

        /* renamed from: a */
        public C0713a mo2716a() throws IOException {
            return C0712a.this.m4028a(this.f1773b, this.f1774c);
        }

        /* renamed from: a */
        public File mo2717a(int i) {
            return this.f1775d[i];
        }

        /* renamed from: b */
        public InputStream mo2718b(int i) {
            return this.f1776e[i];
        }

        /* renamed from: c */
        public String mo2719c(int i) throws IOException {
            return C0712a.m4036b(mo2718b(i));
        }

        /* renamed from: d */
        public long mo2721d(int i) {
            return this.f1777f[i];
        }

        public void close() {
            for (InputStream a : this.f1776e) {
                C0722g.m4111a((Closeable) a);
            }
        }
    }

    /* renamed from: com.a.a.a.a.a.a.a$a */
    /* compiled from: DiskLruCache */
    public final class C0713a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C0715b f1761b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final boolean[] f1762c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f1763d;

        /* renamed from: e */
        private boolean f1764e;

        /* synthetic */ C0713a(C0712a aVar, C0715b bVar, C0717b bVar2) {
            this(bVar);
        }

        private C0713a(C0715b bVar) {
            this.f1761b = bVar;
            this.f1762c = bVar.f1769d ? null : new boolean[C0712a.this.f1753t];
        }

        /* renamed from: a */
        public InputStream mo2702a(int i) throws IOException {
            synchronized (C0712a.this) {
                if (this.f1761b.f1770e != this) {
                    throw new IllegalStateException();
                } else if (!this.f1761b.f1769d) {
                    return null;
                } else {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.f1761b.mo2713a(i));
                        return fileInputStream;
                    } catch (FileNotFoundException e) {
                        return null;
                    }
                }
            }
        }

        /* renamed from: b */
        public String mo2705b(int i) throws IOException {
            InputStream a = mo2702a(i);
            if (a != null) {
                return C0712a.m4036b(a);
            }
            return null;
        }

        /* renamed from: c */
        public OutputStream mo2707c(int i) throws IOException {
            OutputStream i2;
            FileOutputStream fileOutputStream;
            synchronized (C0712a.this) {
                if (this.f1761b.f1770e != this) {
                    throw new IllegalStateException();
                }
                if (!this.f1761b.f1769d) {
                    this.f1762c[i] = true;
                }
                File b = this.f1761b.mo2715b(i);
                try {
                    fileOutputStream = new FileOutputStream(b);
                } catch (FileNotFoundException e) {
                    C0712a.this.f1746m.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException e2) {
                        i2 = C0712a.f1732B;
                    }
                }
                i2 = new C0714a(this, fileOutputStream, (C0717b) null);
            }
            return i2;
        }

        /* renamed from: a */
        public void mo2704a(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter;
            try {
                outputStreamWriter = new OutputStreamWriter(mo2707c(i), C0722g.f1799b);
                try {
                    outputStreamWriter.write(str);
                    C0722g.m4111a((Closeable) outputStreamWriter);
                } catch (Throwable th) {
                    th = th;
                    C0722g.m4111a((Closeable) outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter = null;
                C0722g.m4111a((Closeable) outputStreamWriter);
                throw th;
            }
        }

        /* renamed from: a */
        public void mo2703a() throws IOException {
            if (this.f1763d) {
                C0712a.this.m4032a(this, false);
                C0712a.this.mo2695c(this.f1761b.f1767b);
            } else {
                C0712a.this.m4032a(this, true);
            }
            this.f1764e = true;
        }

        /* renamed from: b */
        public void mo2706b() throws IOException {
            C0712a.this.m4032a(this, false);
        }

        /* renamed from: c */
        public void mo2708c() {
            if (!this.f1764e) {
                try {
                    mo2706b();
                } catch (IOException e) {
                }
            }
        }

        /* renamed from: com.a.a.a.a.a.a.a$a$a */
        /* compiled from: DiskLruCache */
        private class C0714a extends FilterOutputStream {
            /* synthetic */ C0714a(C0713a aVar, OutputStream outputStream, C0717b bVar) {
                this(outputStream);
            }

            private C0714a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException e) {
                    boolean unused = C0713a.this.f1763d = true;
                }
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException e) {
                    boolean unused = C0713a.this.f1763d = true;
                }
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException e) {
                    boolean unused = C0713a.this.f1763d = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException e) {
                    boolean unused = C0713a.this.f1763d = true;
                }
            }
        }
    }

    /* renamed from: com.a.a.a.a.a.a.a$b */
    /* compiled from: DiskLruCache */
    private final class C0715b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f1767b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long[] f1768c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f1769d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C0713a f1770e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public long f1771f;

        /* synthetic */ C0715b(C0712a aVar, String str, C0717b bVar) {
            this(str);
        }

        private C0715b(String str) {
            this.f1767b = str;
            this.f1768c = new long[C0712a.this.f1753t];
        }

        /* renamed from: a */
        public String mo2714a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f1768c) {
                sb.append(' ').append(append);
            }
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m4079a(String[] strArr) throws IOException {
            if (strArr.length != C0712a.this.f1753t) {
                throw m4081b(strArr);
            }
            int i = 0;
            while (i < strArr.length) {
                try {
                    this.f1768c[i] = Long.parseLong(strArr[i]);
                    i++;
                } catch (NumberFormatException e) {
                    throw m4081b(strArr);
                }
            }
        }

        /* renamed from: b */
        private IOException m4081b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File mo2713a(int i) {
            return new File(C0712a.this.f1746m, this.f1767b + C1389aD.f4374j + i);
        }

        /* renamed from: b */
        public File mo2715b(int i) {
            return new File(C0712a.this.f1746m, this.f1767b + C1389aD.f4374j + i + ".tmp");
        }
    }
}
