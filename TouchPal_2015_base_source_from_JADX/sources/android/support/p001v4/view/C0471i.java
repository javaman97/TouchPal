package android.support.p001v4.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: android.support.v4.view.i */
/* compiled from: GestureDetectorCompat */
public class C0471i {

    /* renamed from: a */
    private final C0472a f1080a;

    /* renamed from: android.support.v4.view.i$a */
    /* compiled from: GestureDetectorCompat */
    interface C0472a {
        /* renamed from: a */
        void mo1623a(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        /* renamed from: a */
        void mo1624a(boolean z);

        /* renamed from: a */
        boolean mo1625a();

        /* renamed from: a */
        boolean mo1626a(MotionEvent motionEvent);
    }

    /* renamed from: android.support.v4.view.i$b */
    /* compiled from: GestureDetectorCompat */
    static class C0473b implements C0472a {

        /* renamed from: e */
        private static final int f1081e = ViewConfiguration.getLongPressTimeout();

        /* renamed from: f */
        private static final int f1082f = ViewConfiguration.getTapTimeout();

        /* renamed from: g */
        private static final int f1083g = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: h */
        private static final int f1084h = 1;

        /* renamed from: i */
        private static final int f1085i = 2;

        /* renamed from: j */
        private static final int f1086j = 3;

        /* renamed from: A */
        private VelocityTracker f1087A;

        /* renamed from: a */
        private int f1088a;

        /* renamed from: b */
        private int f1089b;

        /* renamed from: c */
        private int f1090c;

        /* renamed from: d */
        private int f1091d;

        /* renamed from: k */
        private final Handler f1092k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public final GestureDetector.OnGestureListener f1093l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public GestureDetector.OnDoubleTapListener f1094m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public boolean f1095n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public boolean f1096o;

        /* renamed from: p */
        private boolean f1097p;

        /* renamed from: q */
        private boolean f1098q;

        /* renamed from: r */
        private boolean f1099r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public MotionEvent f1100s;

        /* renamed from: t */
        private MotionEvent f1101t;

        /* renamed from: u */
        private boolean f1102u;

        /* renamed from: v */
        private float f1103v;

        /* renamed from: w */
        private float f1104w;

        /* renamed from: x */
        private float f1105x;

        /* renamed from: y */
        private float f1106y;

        /* renamed from: z */
        private boolean f1107z;

        /* renamed from: android.support.v4.view.i$b$a */
        /* compiled from: GestureDetectorCompat */
        private class C0474a extends Handler {
            C0474a() {
            }

            C0474a(Handler handler) {
                super(handler.getLooper());
            }

            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        C0473b.this.f1093l.onShowPress(C0473b.this.f1100s);
                        return;
                    case 2:
                        C0473b.this.m2704d();
                        return;
                    case 3:
                        if (C0473b.this.f1094m == null) {
                            return;
                        }
                        if (!C0473b.this.f1095n) {
                            C0473b.this.f1094m.onSingleTapConfirmed(C0473b.this.f1100s);
                            return;
                        } else {
                            boolean unused = C0473b.this.f1096o = true;
                            return;
                        }
                    default:
                        throw new RuntimeException("Unknown message " + message);
                }
            }
        }

        public C0473b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f1092k = new C0474a(handler);
            } else {
                this.f1092k = new C0474a();
            }
            this.f1093l = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                mo1623a((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            m2696a(context);
        }

        /* renamed from: a */
        private void m2696a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f1093l == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            } else {
                this.f1107z = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f1090c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f1091d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f1088a = scaledTouchSlop * scaledTouchSlop;
                this.f1089b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            }
        }

        /* renamed from: a */
        public void mo1623a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f1094m = onDoubleTapListener;
        }

        /* renamed from: a */
        public void mo1624a(boolean z) {
            this.f1107z = z;
        }

        /* renamed from: a */
        public boolean mo1625a() {
            return this.f1107z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0104  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1626a(android.view.MotionEvent r14) {
            /*
                r13 = this;
                r6 = 0
                r12 = 2
                r11 = 3
                r8 = 1
                r3 = 0
                int r9 = r14.getAction()
                android.view.VelocityTracker r0 = r13.f1087A
                if (r0 != 0) goto L_0x0013
                android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
                r13.f1087A = r0
            L_0x0013:
                android.view.VelocityTracker r0 = r13.f1087A
                r0.addMovement(r14)
                r0 = r9 & 255(0xff, float:3.57E-43)
                r1 = 6
                if (r0 != r1) goto L_0x0032
                r7 = r8
            L_0x001e:
                if (r7 == 0) goto L_0x0034
                int r0 = android.support.p001v4.view.C0505v.m2869b(r14)
            L_0x0024:
                int r4 = android.support.p001v4.view.C0505v.m2872c(r14)
                r5 = r3
                r1 = r6
                r2 = r6
            L_0x002b:
                if (r5 >= r4) goto L_0x0041
                if (r0 != r5) goto L_0x0036
            L_0x002f:
                int r5 = r5 + 1
                goto L_0x002b
            L_0x0032:
                r7 = r3
                goto L_0x001e
            L_0x0034:
                r0 = -1
                goto L_0x0024
            L_0x0036:
                float r10 = android.support.p001v4.view.C0505v.m2871c(r14, r5)
                float r2 = r2 + r10
                float r10 = android.support.p001v4.view.C0505v.m2873d(r14, r5)
                float r1 = r1 + r10
                goto L_0x002f
            L_0x0041:
                if (r7 == 0) goto L_0x004f
                int r0 = r4 + -1
            L_0x0045:
                float r5 = (float) r0
                float r2 = r2 / r5
                float r0 = (float) r0
                float r1 = r1 / r0
                r0 = r9 & 255(0xff, float:3.57E-43)
                switch(r0) {
                    case 0: goto L_0x00a8;
                    case 1: goto L_0x01b3;
                    case 2: goto L_0x013f;
                    case 3: goto L_0x0247;
                    case 4: goto L_0x004e;
                    case 5: goto L_0x0051;
                    case 6: goto L_0x005d;
                    default: goto L_0x004e;
                }
            L_0x004e:
                return r3
            L_0x004f:
                r0 = r4
                goto L_0x0045
            L_0x0051:
                r13.f1103v = r2
                r13.f1105x = r2
                r13.f1104w = r1
                r13.f1106y = r1
                r13.m2701c()
                goto L_0x004e
            L_0x005d:
                r13.f1103v = r2
                r13.f1105x = r2
                r13.f1104w = r1
                r13.f1106y = r1
                android.view.VelocityTracker r0 = r13.f1087A
                r1 = 1000(0x3e8, float:1.401E-42)
                int r2 = r13.f1091d
                float r2 = (float) r2
                r0.computeCurrentVelocity(r1, r2)
                int r1 = android.support.p001v4.view.C0505v.m2869b(r14)
                int r0 = android.support.p001v4.view.C0505v.m2870b(r14, r1)
                android.view.VelocityTracker r2 = r13.f1087A
                float r2 = android.support.p001v4.view.C0328D.m1323a(r2, r0)
                android.view.VelocityTracker r5 = r13.f1087A
                float r5 = android.support.p001v4.view.C0328D.m1324b(r5, r0)
                r0 = r3
            L_0x0084:
                if (r0 >= r4) goto L_0x004e
                if (r0 != r1) goto L_0x008b
            L_0x0088:
                int r0 = r0 + 1
                goto L_0x0084
            L_0x008b:
                int r7 = android.support.p001v4.view.C0505v.m2870b(r14, r0)
                android.view.VelocityTracker r8 = r13.f1087A
                float r8 = android.support.p001v4.view.C0328D.m1323a(r8, r7)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r13.f1087A
                float r7 = android.support.p001v4.view.C0328D.m1324b(r9, r7)
                float r7 = r7 * r5
                float r7 = r7 + r8
                int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r7 >= 0) goto L_0x0088
                android.view.VelocityTracker r0 = r13.f1087A
                r0.clear()
                goto L_0x004e
            L_0x00a8:
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f1094m
                if (r0 == 0) goto L_0x013d
                android.os.Handler r0 = r13.f1092k
                boolean r0 = r0.hasMessages(r11)
                if (r0 == 0) goto L_0x00b9
                android.os.Handler r4 = r13.f1092k
                r4.removeMessages(r11)
            L_0x00b9:
                android.view.MotionEvent r4 = r13.f1100s
                if (r4 == 0) goto L_0x0135
                android.view.MotionEvent r4 = r13.f1101t
                if (r4 == 0) goto L_0x0135
                if (r0 == 0) goto L_0x0135
                android.view.MotionEvent r0 = r13.f1100s
                android.view.MotionEvent r4 = r13.f1101t
                boolean r0 = r13.m2698a(r0, r4, r14)
                if (r0 == 0) goto L_0x0135
                r13.f1102u = r8
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f1094m
                android.view.MotionEvent r4 = r13.f1100s
                boolean r0 = r0.onDoubleTap(r4)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r4 = r13.f1094m
                boolean r4 = r4.onDoubleTapEvent(r14)
                r0 = r0 | r4
            L_0x00df:
                r13.f1103v = r2
                r13.f1105x = r2
                r13.f1104w = r1
                r13.f1106y = r1
                android.view.MotionEvent r1 = r13.f1100s
                if (r1 == 0) goto L_0x00f0
                android.view.MotionEvent r1 = r13.f1100s
                r1.recycle()
            L_0x00f0:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r14)
                r13.f1100s = r1
                r13.f1098q = r8
                r13.f1099r = r8
                r13.f1095n = r8
                r13.f1097p = r3
                r13.f1096o = r3
                boolean r1 = r13.f1107z
                if (r1 == 0) goto L_0x011c
                android.os.Handler r1 = r13.f1092k
                r1.removeMessages(r12)
                android.os.Handler r1 = r13.f1092k
                android.view.MotionEvent r2 = r13.f1100s
                long r2 = r2.getDownTime()
                int r4 = f1082f
                long r4 = (long) r4
                long r2 = r2 + r4
                int r4 = f1081e
                long r4 = (long) r4
                long r2 = r2 + r4
                r1.sendEmptyMessageAtTime(r12, r2)
            L_0x011c:
                android.os.Handler r1 = r13.f1092k
                android.view.MotionEvent r2 = r13.f1100s
                long r2 = r2.getDownTime()
                int r4 = f1082f
                long r4 = (long) r4
                long r2 = r2 + r4
                r1.sendEmptyMessageAtTime(r8, r2)
                android.view.GestureDetector$OnGestureListener r1 = r13.f1093l
                boolean r1 = r1.onDown(r14)
                r3 = r0 | r1
                goto L_0x004e
            L_0x0135:
                android.os.Handler r0 = r13.f1092k
                int r4 = f1083g
                long r4 = (long) r4
                r0.sendEmptyMessageDelayed(r11, r4)
            L_0x013d:
                r0 = r3
                goto L_0x00df
            L_0x013f:
                boolean r0 = r13.f1097p
                if (r0 != 0) goto L_0x004e
                float r0 = r13.f1103v
                float r0 = r0 - r2
                float r4 = r13.f1104w
                float r4 = r4 - r1
                boolean r5 = r13.f1102u
                if (r5 == 0) goto L_0x0156
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f1094m
                boolean r0 = r0.onDoubleTapEvent(r14)
                r3 = r3 | r0
                goto L_0x004e
            L_0x0156:
                boolean r5 = r13.f1098q
                if (r5 == 0) goto L_0x0191
                float r5 = r13.f1105x
                float r5 = r2 - r5
                int r5 = (int) r5
                float r6 = r13.f1106y
                float r6 = r1 - r6
                int r6 = (int) r6
                int r5 = r5 * r5
                int r6 = r6 * r6
                int r5 = r5 + r6
                int r6 = r13.f1088a
                if (r5 <= r6) goto L_0x024f
                android.view.GestureDetector$OnGestureListener r6 = r13.f1093l
                android.view.MotionEvent r7 = r13.f1100s
                boolean r0 = r6.onScroll(r7, r14, r0, r4)
                r13.f1103v = r2
                r13.f1104w = r1
                r13.f1098q = r3
                android.os.Handler r1 = r13.f1092k
                r1.removeMessages(r11)
                android.os.Handler r1 = r13.f1092k
                r1.removeMessages(r8)
                android.os.Handler r1 = r13.f1092k
                r1.removeMessages(r12)
            L_0x0188:
                int r1 = r13.f1088a
                if (r5 <= r1) goto L_0x018e
                r13.f1099r = r3
            L_0x018e:
                r3 = r0
                goto L_0x004e
            L_0x0191:
                float r5 = java.lang.Math.abs(r0)
                r6 = 1065353216(0x3f800000, float:1.0)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x01a5
                float r5 = java.lang.Math.abs(r4)
                r6 = 1065353216(0x3f800000, float:1.0)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 < 0) goto L_0x004e
            L_0x01a5:
                android.view.GestureDetector$OnGestureListener r3 = r13.f1093l
                android.view.MotionEvent r5 = r13.f1100s
                boolean r3 = r3.onScroll(r5, r14, r0, r4)
                r13.f1103v = r2
                r13.f1104w = r1
                goto L_0x004e
            L_0x01b3:
                r13.f1095n = r3
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r14)
                boolean r0 = r13.f1102u
                if (r0 == 0) goto L_0x01ec
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f1094m
                boolean r0 = r0.onDoubleTapEvent(r14)
                r0 = r0 | r3
            L_0x01c4:
                android.view.MotionEvent r2 = r13.f1101t
                if (r2 == 0) goto L_0x01cd
                android.view.MotionEvent r2 = r13.f1101t
                r2.recycle()
            L_0x01cd:
                r13.f1101t = r1
                android.view.VelocityTracker r1 = r13.f1087A
                if (r1 == 0) goto L_0x01db
                android.view.VelocityTracker r1 = r13.f1087A
                r1.recycle()
                r1 = 0
                r13.f1087A = r1
            L_0x01db:
                r13.f1102u = r3
                r13.f1096o = r3
                android.os.Handler r1 = r13.f1092k
                r1.removeMessages(r8)
                android.os.Handler r1 = r13.f1092k
                r1.removeMessages(r12)
                r3 = r0
                goto L_0x004e
            L_0x01ec:
                boolean r0 = r13.f1097p
                if (r0 == 0) goto L_0x01f9
                android.os.Handler r0 = r13.f1092k
                r0.removeMessages(r11)
                r13.f1097p = r3
                r0 = r3
                goto L_0x01c4
            L_0x01f9:
                boolean r0 = r13.f1098q
                if (r0 == 0) goto L_0x0211
                android.view.GestureDetector$OnGestureListener r0 = r13.f1093l
                boolean r0 = r0.onSingleTapUp(r14)
                boolean r2 = r13.f1096o
                if (r2 == 0) goto L_0x01c4
                android.view.GestureDetector$OnDoubleTapListener r2 = r13.f1094m
                if (r2 == 0) goto L_0x01c4
                android.view.GestureDetector$OnDoubleTapListener r2 = r13.f1094m
                r2.onSingleTapConfirmed(r14)
                goto L_0x01c4
            L_0x0211:
                android.view.VelocityTracker r0 = r13.f1087A
                int r2 = android.support.p001v4.view.C0505v.m2870b(r14, r3)
                r4 = 1000(0x3e8, float:1.401E-42)
                int r5 = r13.f1091d
                float r5 = (float) r5
                r0.computeCurrentVelocity(r4, r5)
                float r4 = android.support.p001v4.view.C0328D.m1324b(r0, r2)
                float r0 = android.support.p001v4.view.C0328D.m1323a(r0, r2)
                float r2 = java.lang.Math.abs(r4)
                int r5 = r13.f1090c
                float r5 = (float) r5
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 > 0) goto L_0x023d
                float r2 = java.lang.Math.abs(r0)
                int r5 = r13.f1090c
                float r5 = (float) r5
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 <= 0) goto L_0x024c
            L_0x023d:
                android.view.GestureDetector$OnGestureListener r2 = r13.f1093l
                android.view.MotionEvent r5 = r13.f1100s
                boolean r0 = r2.onFling(r5, r14, r0, r4)
                goto L_0x01c4
            L_0x0247:
                r13.m2700b()
                goto L_0x004e
            L_0x024c:
                r0 = r3
                goto L_0x01c4
            L_0x024f:
                r0 = r3
                goto L_0x0188
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.view.C0471i.C0473b.mo1626a(android.view.MotionEvent):boolean");
        }

        /* renamed from: b */
        private void m2700b() {
            this.f1092k.removeMessages(1);
            this.f1092k.removeMessages(2);
            this.f1092k.removeMessages(3);
            this.f1087A.recycle();
            this.f1087A = null;
            this.f1102u = false;
            this.f1095n = false;
            this.f1098q = false;
            this.f1099r = false;
            this.f1096o = false;
            if (this.f1097p) {
                this.f1097p = false;
            }
        }

        /* renamed from: c */
        private void m2701c() {
            this.f1092k.removeMessages(1);
            this.f1092k.removeMessages(2);
            this.f1092k.removeMessages(3);
            this.f1102u = false;
            this.f1098q = false;
            this.f1099r = false;
            this.f1096o = false;
            if (this.f1097p) {
                this.f1097p = false;
            }
        }

        /* renamed from: a */
        private boolean m2698a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f1099r || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f1083g)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f1089b) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m2704d() {
            this.f1092k.removeMessages(3);
            this.f1096o = false;
            this.f1097p = true;
            this.f1093l.onLongPress(this.f1100s);
        }
    }

    /* renamed from: android.support.v4.view.i$c */
    /* compiled from: GestureDetectorCompat */
    static class C0475c implements C0472a {

        /* renamed from: a */
        private final GestureDetector f1109a;

        public C0475c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f1109a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public boolean mo1625a() {
            return this.f1109a.isLongpressEnabled();
        }

        /* renamed from: a */
        public boolean mo1626a(MotionEvent motionEvent) {
            return this.f1109a.onTouchEvent(motionEvent);
        }

        /* renamed from: a */
        public void mo1624a(boolean z) {
            this.f1109a.setIsLongpressEnabled(z);
        }

        /* renamed from: a */
        public void mo1623a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f1109a.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public C0471i(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null);
    }

    public C0471i(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.f1080a = new C0475c(context, onGestureListener, handler);
        } else {
            this.f1080a = new C0473b(context, onGestureListener, handler);
        }
    }

    /* renamed from: a */
    public boolean mo1621a() {
        return this.f1080a.mo1625a();
    }

    /* renamed from: a */
    public boolean mo1622a(MotionEvent motionEvent) {
        return this.f1080a.mo1626a(motionEvent);
    }

    /* renamed from: a */
    public void mo1620a(boolean z) {
        this.f1080a.mo1624a(z);
    }

    /* renamed from: a */
    public void mo1619a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f1080a.mo1623a(onDoubleTapListener);
    }
}
