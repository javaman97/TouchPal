package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C3847a;
import com.google.android.gms.maps.internal.C3889q;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions implements SafeParcelable {
    public static final GoogleMapOptionsCreator CREATOR = new GoogleMapOptionsCreator();

    /* renamed from: ab */
    private final int f15965ab;

    /* renamed from: go */
    private Boolean f15966go;

    /* renamed from: gp */
    private Boolean f15967gp;

    /* renamed from: gq */
    private int f15968gq;

    /* renamed from: gr */
    private CameraPosition f15969gr;

    /* renamed from: gs */
    private Boolean f15970gs;

    /* renamed from: gt */
    private Boolean f15971gt;

    /* renamed from: gu */
    private Boolean f15972gu;

    /* renamed from: gv */
    private Boolean f15973gv;

    /* renamed from: gw */
    private Boolean f15974gw;

    /* renamed from: gx */
    private Boolean f15975gx;

    public GoogleMapOptions() {
        this.f15968gq = -1;
        this.f15965ab = 1;
    }

    GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        this.f15968gq = -1;
        this.f15965ab = i;
        this.f15966go = C3847a.m16760a(b);
        this.f15967gp = C3847a.m16760a(b2);
        this.f15968gq = i2;
        this.f15969gr = cameraPosition;
        this.f15970gs = C3847a.m16760a(b3);
        this.f15971gt = C3847a.m16760a(b4);
        this.f15972gu = C3847a.m16760a(b5);
        this.f15973gv = C3847a.m16760a(b6);
        this.f15974gw = C3847a.m16760a(b7);
        this.f15975gx = C3847a.m16760a(b8);
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.mapType(obtainAttributes.getInt(0, -1));
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(12)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(12, false));
        }
        if (obtainAttributes.hasValue(6)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(6, true));
        }
        if (obtainAttributes.hasValue(7)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(7, true));
        }
        if (obtainAttributes.hasValue(8)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(8, true));
        }
        if (obtainAttributes.hasValue(9)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(9, true));
        }
        if (obtainAttributes.hasValue(11)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(11, true));
        }
        if (obtainAttributes.hasValue(10)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(10, true));
        }
        googleMapOptions.camera(CameraPosition.createFromAttributes(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aZ */
    public byte mo12586aZ() {
        return C3847a.m16761b(this.f15966go);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ba */
    public byte mo12587ba() {
        return C3847a.m16761b(this.f15967gp);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bb */
    public byte mo12588bb() {
        return C3847a.m16761b(this.f15970gs);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bc */
    public byte mo12589bc() {
        return C3847a.m16761b(this.f15971gt);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bd */
    public byte mo12590bd() {
        return C3847a.m16761b(this.f15972gu);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: be */
    public byte mo12591be() {
        return C3847a.m16761b(this.f15973gv);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bf */
    public byte mo12592bf() {
        return C3847a.m16761b(this.f15974gw);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bg */
    public byte mo12593bg() {
        return C3847a.m16761b(this.f15975gx);
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.f15969gr = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z) {
        this.f15971gt = Boolean.valueOf(z);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public CameraPosition getCamera() {
        return this.f15969gr;
    }

    public Boolean getCompassEnabled() {
        return this.f15971gt;
    }

    public int getMapType() {
        return this.f15968gq;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.f15975gx;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.f15972gu;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.f15974gw;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.f15967gp;
    }

    public Boolean getZOrderOnTop() {
        return this.f15966go;
    }

    public Boolean getZoomControlsEnabled() {
        return this.f15970gs;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.f15973gv;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo12607i() {
        return this.f15965ab;
    }

    public GoogleMapOptions mapType(int i) {
        this.f15968gq = i;
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.f15975gx = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.f15972gu = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.f15974gw = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.f15967gp = Boolean.valueOf(z);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C3889q.m16813bn()) {
            C3832a.m16752a(this, parcel, i);
        } else {
            GoogleMapOptionsCreator.m16738a(this, parcel, i);
        }
    }

    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.f15966go = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.f15970gs = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.f15973gv = Boolean.valueOf(z);
        return this;
    }
}
