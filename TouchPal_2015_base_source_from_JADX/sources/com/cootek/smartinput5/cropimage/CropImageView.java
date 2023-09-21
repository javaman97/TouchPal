package com.cootek.smartinput5.cropimage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"instantiatable"})
/* compiled from: CropImageActivity */
class CropImageView extends ImageViewTouchBase {

    /* renamed from: a */
    ArrayList<C1232i> f3597a = new ArrayList<>();

    /* renamed from: b */
    C1232i f3598b = null;

    /* renamed from: c */
    float f3599c;

    /* renamed from: d */
    float f3600d;

    /* renamed from: e */
    int f3601e;

    /* renamed from: f */
    Context f3602f;

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f3611i.mo4551b() != null) {
            Iterator<C1232i> it = this.f3597a.iterator();
            while (it.hasNext()) {
                C1232i next = it.next();
                next.f3646l.set(getImageMatrix());
                next.mo4539c();
                if (next.f3642h) {
                    m5913c(next);
                }
            }
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4495a(float f, float f2, float f3) {
        super.mo4495a(f, f2, f3);
        Iterator<C1232i> it = this.f3597a.iterator();
        while (it.hasNext()) {
            C1232i next = it.next();
            next.f3646l.set(getImageMatrix());
            next.mo4539c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4493a() {
        super.mo4493a();
        Iterator<C1232i> it = this.f3597a.iterator();
        while (it.hasNext()) {
            C1232i next = it.next();
            next.f3646l.set(getImageMatrix());
            next.mo4539c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4497b() {
        super.mo4497b();
        Iterator<C1232i> it = this.f3597a.iterator();
        while (it.hasNext()) {
            C1232i next = it.next();
            next.f3646l.set(getImageMatrix());
            next.mo4539c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4494a(float f, float f2) {
        super.mo4494a(f, f2);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f3597a.size()) {
                C1232i iVar = this.f3597a.get(i2);
                iVar.f3646l.postTranslate(f, f2);
                iVar.mo4539c();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = r6.f3597a.get(r1);
        r3 = r0.mo4529a(r7.getX(), r7.getY());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r3 == 1) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        r6.f3601e = r3;
        r6.f3598b = r0;
        r6.f3599c = r7.getX();
        r6.f3600d = r7.getY();
        r1 = r6.f3598b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r3 != 32) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r0 = com.cootek.smartinput5.cropimage.C1232i.C1233a.f3659b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r1.mo4533a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r0 = com.cootek.smartinput5.cropimage.C1232i.C1233a.f3660c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r1 >= r6.f3597a.size()) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r1 = 0
            r2 = 1
            android.content.Context r0 = r6.f3602f
            com.cootek.smartinput5.cropimage.CropImageActivity r0 = (com.cootek.smartinput5.cropimage.CropImageActivity) r0
            boolean r0 = r0.f3578a
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            return r1
        L_0x000b:
            int r0 = r7.getAction()
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x005b;
                case 2: goto L_0x006f;
                default: goto L_0x0012;
            }
        L_0x0012:
            int r0 = r7.getAction()
            switch(r0) {
                case 1: goto L_0x009b;
                case 2: goto L_0x00a0;
                default: goto L_0x0019;
            }
        L_0x0019:
            r1 = r2
            goto L_0x000a
        L_0x001b:
            int r0 = r1 + 1
            r1 = r0
        L_0x001e:
            java.util.ArrayList<com.cootek.smartinput5.cropimage.i> r0 = r6.f3597a
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0012
            java.util.ArrayList<com.cootek.smartinput5.cropimage.i> r0 = r6.f3597a
            java.lang.Object r0 = r0.get(r1)
            com.cootek.smartinput5.cropimage.i r0 = (com.cootek.smartinput5.cropimage.C1232i) r0
            float r3 = r7.getX()
            float r4 = r7.getY()
            int r3 = r0.mo4529a(r3, r4)
            if (r3 == r2) goto L_0x001b
            r6.f3601e = r3
            r6.f3598b = r0
            float r0 = r7.getX()
            r6.f3599c = r0
            float r0 = r7.getY()
            r6.f3600d = r0
            com.cootek.smartinput5.cropimage.i r1 = r6.f3598b
            r0 = 32
            if (r3 != r0) goto L_0x0058
            com.cootek.smartinput5.cropimage.i$a r0 = com.cootek.smartinput5.cropimage.C1232i.C1233a.Move
        L_0x0054:
            r1.mo4533a((com.cootek.smartinput5.cropimage.C1232i.C1233a) r0)
            goto L_0x0012
        L_0x0058:
            com.cootek.smartinput5.cropimage.i$a r0 = com.cootek.smartinput5.cropimage.C1232i.C1233a.Grow
            goto L_0x0054
        L_0x005b:
            com.cootek.smartinput5.cropimage.i r0 = r6.f3598b
            if (r0 == 0) goto L_0x006b
            com.cootek.smartinput5.cropimage.i r0 = r6.f3598b
            r6.m5913c(r0)
            com.cootek.smartinput5.cropimage.i r0 = r6.f3598b
            com.cootek.smartinput5.cropimage.i$a r1 = com.cootek.smartinput5.cropimage.C1232i.C1233a.None
            r0.mo4533a((com.cootek.smartinput5.cropimage.C1232i.C1233a) r1)
        L_0x006b:
            r0 = 0
            r6.f3598b = r0
            goto L_0x0012
        L_0x006f:
            com.cootek.smartinput5.cropimage.i r0 = r6.f3598b
            if (r0 == 0) goto L_0x0012
            com.cootek.smartinput5.cropimage.i r0 = r6.f3598b
            int r1 = r6.f3601e
            float r3 = r7.getX()
            float r4 = r6.f3599c
            float r3 = r3 - r4
            float r4 = r7.getY()
            float r5 = r6.f3600d
            float r4 = r4 - r5
            r0.mo4530a(r1, r3, r4)
            float r0 = r7.getX()
            r6.f3599c = r0
            float r0 = r7.getY()
            r6.f3600d = r0
            com.cootek.smartinput5.cropimage.i r0 = r6.f3598b
            r6.m5912b(r0)
            goto L_0x0012
        L_0x009b:
            r6.mo4508a((boolean) r2, (boolean) r2)
            goto L_0x0019
        L_0x00a0:
            float r0 = r6.mo4514d()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0019
            r6.mo4508a((boolean) r2, (boolean) r2)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.cropimage.CropImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    private void m5912b(C1232i iVar) {
        Rect rect = iVar.f3644j;
        int max = Math.max(0, getLeft() - rect.left);
        int min = Math.min(0, getRight() - rect.right);
        int max2 = Math.max(0, getTop() - rect.top);
        int min2 = Math.min(0, getBottom() - rect.bottom);
        if (max == 0) {
            max = min;
        }
        if (max2 == 0) {
            max2 = min2;
        }
        if (max != 0 || max2 != 0) {
            mo4510b((float) max, (float) max2);
        }
    }

    /* renamed from: c */
    private void m5913c(C1232i iVar) {
        Rect rect = iVar.f3644j;
        float max = Math.max(1.0f, Math.min((((float) getWidth()) / ((float) rect.width())) * 0.6f, (((float) getHeight()) / ((float) rect.height())) * 0.6f) * mo4514d());
        if (((double) (Math.abs(max - mo4514d()) / max)) > 0.1d) {
            float[] fArr = {iVar.f3645k.centerX(), iVar.f3645k.centerY()};
            getImageMatrix().mapPoints(fArr);
            mo4504a(max, fArr[0], fArr[1], 300.0f);
        }
        m5912b(iVar);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f3597a.size()) {
                this.f3597a.get(i2).mo4531a(canvas);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo4496a(C1232i iVar) {
        this.f3597a.add(iVar);
        invalidate();
    }
}
