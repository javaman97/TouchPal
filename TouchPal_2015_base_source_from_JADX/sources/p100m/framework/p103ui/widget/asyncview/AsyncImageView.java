package p100m.framework.p103ui.widget.asyncview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.cootek.smartinput5.engine.Settings;
import java.util.Random;
import p100m.framework.p102b.C4282e;
import p100m.framework.p102b.C4284g;

/* renamed from: m.framework.ui.widget.asyncview.AsyncImageView */
public class AsyncImageView extends ImageView implements Handler.Callback, C4285a, C4286b {

    /* renamed from: a */
    public static final int f17445a = 17170445;

    /* renamed from: b */
    private static Bitmap f17446b = null;

    /* renamed from: c */
    private static final int f17447c = 1;

    /* renamed from: d */
    private static final Random f17448d = new Random();

    /* renamed from: e */
    private static String f17449e;

    /* renamed from: f */
    private String f17450f;

    /* renamed from: g */
    private int f17451g;

    /* renamed from: h */
    private C4294f f17452h;

    public AsyncImageView(Context context) {
        super(context);
        m17949a(context);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17949a(context);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17949a(context);
    }

    /* renamed from: a */
    private void m17949a(Context context) {
        C4282e.m17925a();
        if (TextUtils.isEmpty(f17449e)) {
            f17449e = C4284g.m17943a(getContext(), "images");
        }
        C4287c.m17956a(f17449e);
        setOnImageGotListener(C4295g.f17480a);
    }

    public void setOnImageGotListener(C4294f fVar) {
        this.f17452h = fVar;
    }

    public String getUrl() {
        return this.f17450f;
    }

    /* renamed from: a */
    public void mo15976a(String str) {
        mo15977a(str, 0);
    }

    /* renamed from: a */
    public void mo15977a(String str, int i) {
        this.f17450f = str;
        this.f17451g = i;
        if (C4284g.m17944a(str)) {
            setImageResource(i);
            return;
        }
        Bitmap b = C4287c.m17959b(str);
        if (b == null || b.isRecycled()) {
            if (i > 0) {
                setImageBitmap(m17948a(i));
            }
            C4287c.m17957a(str, this);
            return;
        }
        setImageBitmap(b);
    }

    /* renamed from: a */
    private Bitmap m17948a(int i) {
        switch (i) {
            case f17445a /*17170445*/:
                if (f17446b == null) {
                    f17446b = BitmapFactory.decodeResource(getResources(), f17445a);
                }
                return f17446b;
            default:
                return BitmapFactory.decodeResource(getResources(), i);
        }
    }

    /* renamed from: a */
    public void mo15978a(String str, Bitmap bitmap) {
        if (this.f17452h != null) {
            bitmap = this.f17452h.mo15987a(this, bitmap, str);
        }
        Message message = new Message();
        message.what = 1;
        message.obj = new Object[]{str, bitmap};
        C4282e.m17929a(message, (long) f17448d.nextInt(Settings.SUPER_DICT_DOWNLOADED), (Handler.Callback) this);
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            Object obj = ((Object[]) message.obj)[0];
            Object obj2 = ((Object[]) message.obj)[1];
            if (obj2 == null || obj == null || !obj.equals(this.f17450f)) {
                setImageResource(this.f17451g);
            } else {
                setImageBitmap((Bitmap) obj2);
            }
        }
        return false;
    }
}
