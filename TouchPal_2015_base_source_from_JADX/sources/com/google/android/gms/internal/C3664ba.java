package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ba */
public class C3664ba {

    /* renamed from: dt */
    protected C3610au f15562dt;

    /* renamed from: ej */
    protected C3666a f15563ej;

    /* renamed from: com.google.android.gms.internal.ba$a */
    public static final class C3666a {
        public int bottom;

        /* renamed from: ek */
        public IBinder f15564ek;

        /* renamed from: el */
        public int f15565el;
        public int gravity;
        public int left;
        public int right;
        public int top;

        private C3666a(int i, IBinder iBinder) {
            this.f15565el = -1;
            this.left = 0;
            this.top = 0;
            this.right = 0;
            this.bottom = 0;
            this.gravity = i;
            this.f15564ek = iBinder;
        }

        /* renamed from: aE */
        public Bundle mo11688aE() {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", this.gravity);
            bundle.putInt("popupLocationInfo.displayId", this.f15565el);
            bundle.putInt("popupLocationInfo.left", this.left);
            bundle.putInt("popupLocationInfo.top", this.top);
            bundle.putInt("popupLocationInfo.right", this.right);
            bundle.putInt("popupLocationInfo.bottom", this.bottom);
            return bundle;
        }
    }

    /* renamed from: com.google.android.gms.internal.ba$b */
    private static final class C3667b extends C3664ba implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: dE */
        private boolean f15566dE = false;

        /* renamed from: em */
        private WeakReference<View> f15567em;

        protected C3667b(C3610au auVar, int i) {
            super(auVar, i);
        }

        /* renamed from: b */
        private void m16091b(View view) {
            Display display;
            int i = -1;
            if (C3608as.m15702as() && (display = view.getDisplay()) != null) {
                i = display.getDisplayId();
            }
            IBinder windowToken = view.getWindowToken();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
            this.f15563ej.f15565el = i;
            this.f15563ej.f15564ek = windowToken;
            this.f15563ej.left = iArr[0];
            this.f15563ej.top = iArr[1];
            this.f15563ej.right = iArr[0] + width;
            this.f15563ej.bottom = iArr[1] + height;
            if (this.f15566dE) {
                mo11684aB();
                this.f15566dE = false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: F */
        public void mo11682F(int i) {
            this.f15563ej = new C3666a(i, (IBinder) null);
        }

        /* renamed from: a */
        public void mo11683a(View view) {
            this.f15562dt.mo11524ax();
            if (this.f15567em != null) {
                View view2 = (View) this.f15567em.get();
                Context context = this.f15562dt.getContext();
                if (view2 == null && (context instanceof Activity)) {
                    view2 = ((Activity) context).getWindow().getDecorView();
                }
                if (view2 != null) {
                    view2.removeOnAttachStateChangeListener(this);
                    ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    if (C3608as.m15701ar()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
            }
            this.f15567em = null;
            Context context2 = this.f15562dt.getContext();
            if (view == null && (context2 instanceof Activity)) {
                View findViewById = ((Activity) context2).findViewById(16908290);
                if (findViewById == null) {
                    findViewById = ((Activity) context2).getWindow().getDecorView();
                }
                C3656ax.m15852b("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
                view = findViewById;
            }
            if (view != null) {
                m16091b(view);
                this.f15567em = new WeakReference<>(view);
                view.addOnAttachStateChangeListener(this);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            }
            C3656ax.m15853c("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
        }

        /* renamed from: aB */
        public void mo11684aB() {
            if (this.f15563ej.f15564ek != null) {
                C3664ba.super.mo11684aB();
            } else {
                this.f15566dE = this.f15567em != null;
            }
        }

        public void onGlobalLayout() {
            View view;
            if (this.f15567em != null && (view = (View) this.f15567em.get()) != null) {
                m16091b(view);
            }
        }

        public void onViewAttachedToWindow(View view) {
            m16091b(view);
        }

        public void onViewDetachedFromWindow(View view) {
            this.f15562dt.mo11524ax();
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private C3664ba(C3610au auVar, int i) {
        this.f15562dt = auVar;
        mo11682F(i);
    }

    /* renamed from: a */
    public static C3664ba m16084a(C3610au auVar, int i) {
        return C3608as.m15698ao() ? new C3667b(auVar, i) : new C3664ba(auVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo11682F(int i) {
        this.f15563ej = new C3666a(i, new Binder());
    }

    /* renamed from: a */
    public void mo11683a(View view) {
    }

    /* renamed from: aB */
    public void mo11684aB() {
        this.f15562dt.mo11516a(this.f15563ej.f15564ek, this.f15563ej.mo11688aE());
    }

    /* renamed from: aC */
    public Bundle mo11685aC() {
        return this.f15563ej.mo11688aE();
    }

    /* renamed from: aD */
    public IBinder mo11686aD() {
        return this.f15563ej.f15564ek;
    }

    public void setGravity(int i) {
        this.f15563ej.gravity = i;
    }
}
