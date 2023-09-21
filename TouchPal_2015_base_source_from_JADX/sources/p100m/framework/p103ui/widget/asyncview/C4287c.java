package p100m.framework.p103ui.widget.asyncview;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import java.util.Vector;
import java.util.WeakHashMap;
import p100m.framework.p101a.C4273g;
import p100m.framework.p101a.C4274h;
import p100m.framework.p102b.C4278a;
import p100m.framework.p102b.C4284g;

/* renamed from: m.framework.ui.widget.asyncview.c */
/* compiled from: BitmapProcessor */
public class C4287c {

    /* renamed from: a */
    private static final int f17453a = 5;

    /* renamed from: b */
    private static final int f17454b = 200;

    /* renamed from: c */
    private static final int f17455c = 40;

    /* renamed from: d */
    private static final int f17456d = 50;

    /* renamed from: e */
    private static C4287c f17457e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WeakHashMap<String, Bitmap> f17458f = new WeakHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f17459g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Vector<C4288a> f17460h = new Vector<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public File f17461i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4291d[] f17462j = new C4291d[5];
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Vector<C4288a> f17463k = new Vector<>();

    /* renamed from: a */
    public static synchronized void m17956a(String str) {
        synchronized (C4287c.class) {
            if (f17457e == null) {
                f17457e = new C4287c(str);
            }
        }
    }

    /* renamed from: a */
    public static void m17955a() {
        if (f17457e == null) {
            throw new RuntimeException("Call BitmapProcessor.prepare(String) before start");
        }
        f17457e.f17459g = true;
    }

    /* renamed from: b */
    public static void m17960b() {
        if (f17457e != null) {
            f17457e.f17459g = false;
            f17457e.f17460h.clear();
            for (int i = 0; i < f17457e.f17462j.length; i++) {
                if (f17457e.f17462j[i] != null) {
                    f17457e.f17462j[i].interrupt();
                }
            }
            f17457e = null;
        }
    }

    /* renamed from: a */
    public static void m17957a(String str, C4286b bVar) {
        if (f17457e == null) {
            throw new RuntimeException("Call BitmapProcessor.prepare(String) before start");
        } else if (str != null) {
            C4288a aVar = new C4288a();
            aVar.f17464a = str;
            aVar.f17465b = bVar;
            f17457e.f17460h.add(aVar);
            if (f17457e.f17460h.size() > 50) {
                while (f17457e.f17460h.size() > 40) {
                    f17457e.f17460h.remove(0);
                }
            }
            m17955a();
        }
    }

    /* renamed from: b */
    public static Bitmap m17959b(String str) {
        if (f17457e != null) {
            return f17457e.f17458f.get(str);
        }
        throw new RuntimeException("Call BitmapProcessor.prepare(String) before start");
    }

    private C4287c(String str) {
        this.f17461i = new File(str);
        if (!this.f17461i.exists()) {
            this.f17461i.mkdirs();
        }
        new C4289b(this);
    }

    /* renamed from: m.framework.ui.widget.asyncview.c$b */
    /* compiled from: BitmapProcessor */
    private static class C4289b extends Timer {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C4287c f17469a;

        public C4289b(C4287c cVar) {
            this.f17469a = cVar;
            schedule(new C4292d(this), 0, 200);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17973a() {
            boolean z;
            if (this.f17469a.f17459g) {
                long currentTimeMillis = System.currentTimeMillis();
                for (int i = 0; i < this.f17469a.f17462j.length; i++) {
                    if (this.f17469a.f17462j[i] == null) {
                        this.f17469a.f17462j[i] = new C4291d(this.f17469a);
                        this.f17469a.f17462j[i].setName("worker " + i);
                        C4291d dVar = this.f17469a.f17462j[i];
                        if (i == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dVar.f17473c = z;
                        this.f17469a.f17462j[i].start();
                    } else if (currentTimeMillis - this.f17469a.f17462j[i].f17472b > 20000) {
                        this.f17469a.f17462j[i].interrupt();
                        boolean b = this.f17469a.f17462j[i].f17473c;
                        this.f17469a.f17462j[i] = new C4291d(this.f17469a);
                        this.f17469a.f17462j[i].setName("worker " + i);
                        this.f17469a.f17462j[i].f17473c = b;
                        this.f17469a.f17462j[i].start();
                    }
                }
            }
        }
    }

    /* renamed from: m.framework.ui.widget.asyncview.c$d */
    /* compiled from: BitmapProcessor */
    private static class C4291d extends Thread {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C4287c f17471a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public long f17472b = System.currentTimeMillis();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f17473c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C4288a f17474d;

        public C4291d(C4287c cVar) {
            this.f17471a = cVar;
        }

        public void run() {
            while (this.f17471a.f17459g) {
                try {
                    if (this.f17473c) {
                        m17976a();
                    } else {
                        m17982b();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        private void m17976a() throws Throwable {
            C4288a aVar;
            int size = this.f17471a.f17460h.size();
            if (size > 0) {
                aVar = (C4288a) this.f17471a.f17460h.remove(size - 1);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                Bitmap bitmap = (Bitmap) this.f17471a.f17458f.get(aVar.f17464a);
                if (bitmap != null) {
                    this.f17474d = aVar;
                    this.f17474d.f17466c = this;
                    aVar.m17967a(bitmap);
                } else if (new File(this.f17471a.f17461i, C4278a.m17874c(aVar.f17464a)).exists()) {
                    m17978a(aVar);
                    this.f17472b = System.currentTimeMillis();
                    return;
                } else {
                    if (this.f17471a.f17463k.size() > 40) {
                        while (this.f17471a.f17460h.size() > 0) {
                            this.f17471a.f17460h.remove(0);
                        }
                        this.f17471a.f17463k.remove(0);
                    }
                    this.f17471a.f17463k.add(aVar);
                }
                this.f17472b = System.currentTimeMillis();
                return;
            }
            this.f17472b = System.currentTimeMillis();
            Thread.sleep(30);
        }

        /* renamed from: b */
        private void m17982b() throws Throwable {
            C4288a aVar;
            int size;
            C4288a aVar2 = null;
            if (this.f17471a.f17463k.size() > 0) {
                aVar2 = (C4288a) this.f17471a.f17463k.remove(0);
            }
            if (aVar2 != null || (size = this.f17471a.f17460h.size()) <= 0) {
                aVar = aVar2;
            } else {
                aVar = (C4288a) this.f17471a.f17460h.remove(size - 1);
            }
            if (aVar != null) {
                Bitmap bitmap = (Bitmap) this.f17471a.f17458f.get(aVar.f17464a);
                if (bitmap != null) {
                    this.f17474d = aVar;
                    this.f17474d.f17466c = this;
                    aVar.m17967a(bitmap);
                } else {
                    m17978a(aVar);
                }
                this.f17472b = System.currentTimeMillis();
                return;
            }
            this.f17472b = System.currentTimeMillis();
            Thread.sleep(30);
        }

        /* renamed from: a */
        private void m17978a(C4288a aVar) throws Throwable {
            Bitmap bitmap;
            this.f17474d = aVar;
            this.f17474d.f17466c = this;
            File file = new File(this.f17471a.f17461i, C4278a.m17874c(aVar.f17464a));
            if (file.exists()) {
                bitmap = C4284g.m17946b(file.getAbsolutePath());
                if (bitmap != null) {
                    this.f17471a.f17458f.put(aVar.f17464a, bitmap);
                    aVar.m17967a(bitmap);
                }
                this.f17474d = null;
            } else {
                new C4273g().mo15934a(aVar.f17464a, (C4274h) new C4293e(this, file, aVar));
                bitmap = null;
            }
            if (bitmap != null) {
                this.f17471a.f17458f.put(aVar.f17464a, bitmap);
                aVar.m17967a(bitmap);
            }
            this.f17474d = null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17977a(Bitmap bitmap, File file) {
            try {
                if (file.exists()) {
                    file.delete();
                }
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                String c = C4284g.m17947c(file.getAbsolutePath());
                if (c != null && (c.endsWith("png") || c.endsWith("gif"))) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(compressFormat, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                if (file.exists()) {
                    file.delete();
                }
            }
        }

        public void interrupt() {
            try {
                super.interrupt();
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: m.framework.ui.widget.asyncview.c$a */
    /* compiled from: BitmapProcessor */
    public static class C4288a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f17464a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C4286b f17465b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C4291d f17466c;

        /* renamed from: d */
        private long f17467d = System.currentTimeMillis();

        /* renamed from: e */
        private Bitmap f17468e;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17967a(Bitmap bitmap) {
            this.f17468e = bitmap;
            if (this.f17465b != null) {
                this.f17465b.mo15978a(this.f17464a, this.f17468e);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("url=").append(this.f17464a);
            sb.append("time=").append(this.f17467d);
            sb.append("worker=").append(this.f17466c.getName()).append(" (").append(this.f17466c.getId()).append("");
            return sb.toString();
        }
    }

    /* renamed from: m.framework.ui.widget.asyncview.c$c */
    /* compiled from: BitmapProcessor */
    private static class C4290c extends FilterInputStream {

        /* renamed from: a */
        InputStream f17470a;

        protected C4290c(InputStream inputStream) {
            super(inputStream);
            this.f17470a = inputStream;
        }

        public long skip(long j) throws IOException {
            long j2 = 0;
            while (j2 < j) {
                long skip = this.f17470a.skip(j - j2);
                if (skip == 0) {
                    break;
                }
                j2 += skip;
            }
            return j2;
        }
    }
}
