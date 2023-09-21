package com.yahoo.mobile.client.share.search.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.yahoo.mobile.client.share.search.util.UrlUtils;
import java.io.File;

public class PhotoData implements Parcelable {
    public static final Parcelable.Creator<PhotoData> CREATOR = new Parcelable.Creator<PhotoData>() {
        public final PhotoData createFromParcel(Parcel parcel) {
            return new PhotoData(parcel, (byte) 0);
        }

        public final PhotoData[] newArray(int i) {
            return new PhotoData[i];
        }
    };
    public static final int IMAGE_POSITION_NOT_KNOWN = -1;

    /* renamed from: a */
    private String f16651a;

    /* renamed from: b */
    private int f16652b;

    /* renamed from: c */
    private int f16653c;

    /* renamed from: d */
    private String f16654d;

    /* renamed from: e */
    private int f16655e;

    /* renamed from: f */
    private int f16656f;

    /* renamed from: g */
    private boolean f16657g;

    /* renamed from: h */
    private boolean f16658h;

    /* renamed from: i */
    private String f16659i;

    /* renamed from: j */
    private String f16660j;

    /* renamed from: k */
    private boolean f16661k;

    /* renamed from: l */
    private String f16662l;

    /* renamed from: m */
    private String f16663m;

    /* renamed from: n */
    private String f16664n;

    /* renamed from: o */
    private String f16665o;

    /* renamed from: p */
    private String f16666p;

    /* renamed from: q */
    private String f16667q;

    /* renamed from: r */
    private String f16668r;

    /* renamed from: s */
    private int f16669s;

    /* renamed from: t */
    private long f16670t;

    /* renamed from: u */
    private String f16671u;

    /* synthetic */ PhotoData(Parcel parcel, byte b) {
        this(parcel);
    }

    public PhotoData(String str, String str2, long j) {
        this(str, 0, 0, (String) null, 0, 0, str2, j, (String) null, (String) null);
    }

    public PhotoData(String str, String str2, String str3, long j) {
        this(str, 0, 0, str2, 0, 0, str3, j, (String) null, (String) null);
    }

    public PhotoData(String str, int i, int i2, String str2, long j) {
        this(str, i, i2, (String) null, 0, 0, str2, j, (String) null, (String) null);
    }

    public PhotoData(String str, int i, int i2, String str2, int i3, int i4, String str3, long j, String str4, String str5) {
        this.f16664n = null;
        this.f16665o = null;
        this.f16666p = null;
        this.f16667q = "";
        this.f16668r = "";
        this.f16669s = -1;
        this.f16671u = null;
        this.f16651a = str;
        this.f16652b = i;
        this.f16653c = i2;
        this.f16654d = str2;
        this.f16655e = i3;
        this.f16656f = i4;
        this.f16658h = false;
        this.f16661k = false;
        this.f16666p = str3;
        this.f16657g = false;
        this.f16659i = str4;
        this.f16660j = str5;
        this.f16670t = j;
    }

    public int getImgHeight() {
        return this.f16652b;
    }

    public void setImgHeight(int i) {
        this.f16652b = i;
    }

    public int getImgWidth() {
        return this.f16653c;
    }

    public void setImgWidth(int i) {
        this.f16653c = i;
    }

    public int getImgPos() {
        return this.f16669s;
    }

    public void setImgPos(int i) {
        this.f16669s = i;
    }

    public String getPhotoUrl() {
        if (this.f16658h) {
            return this.f16664n;
        }
        return this.f16651a;
    }

    public String getBeaconViewUrl() {
        return this.f16659i;
    }

    public String getBeaconShareUrl() {
        return this.f16660j;
    }

    public String getEscapedPhotoUrl() {
        if (getPhotoUrl() != null) {
            String a = UrlUtils.m17742a(getPhotoUrl());
            if (URLUtil.isValidUrl(a)) {
                return a;
            }
        }
        return null;
    }

    public void setPhotoUrl(String str) {
        this.f16651a = str;
    }

    public String getOrigPhotoUrl() {
        return this.f16663m;
    }

    public void setOrigPhotoUrl(String str) {
        this.f16663m = str;
    }

    public void setDisplayUrl(String str) {
        this.f16662l = str;
    }

    public String getDisplayUrl() {
        return this.f16662l;
    }

    public int getThumbHeight() {
        return this.f16655e;
    }

    public void setThumbHeight(int i) {
        this.f16655e = i;
    }

    public int getThumbWidth() {
        return this.f16656f;
    }

    public void setThumbWidth(int i) {
        this.f16656f = i;
    }

    public String getThumbnailUrl() {
        if (this.f16661k) {
            return this.f16665o;
        }
        return this.f16654d;
    }

    public void setThumbnailUrl(String str) {
        this.f16654d = str;
    }

    public String getEscapedThumbnailUrl() {
        if (getThumbnailUrl() != null) {
            String a = UrlUtils.m17742a(getThumbnailUrl());
            if (URLUtil.isValidUrl(a)) {
                return a;
            }
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public String getDimensionsAndSize() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16653c).append(" X ").append(this.f16652b).append(", ").append(this.f16666p);
        return sb.toString();
    }

    public String getSize() {
        return this.f16666p;
    }

    public void setSize(String str) {
        this.f16666p = str;
    }

    public String getTitle() {
        return this.f16667q;
    }

    public void setTitle(String str) {
        this.f16667q = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f16670t);
        parcel.writeString(this.f16651a);
        parcel.writeInt(this.f16652b);
        parcel.writeInt(this.f16653c);
        parcel.writeString(this.f16654d);
        parcel.writeInt(this.f16655e);
        parcel.writeInt(this.f16656f);
        parcel.writeString(this.f16666p);
        parcel.writeString(this.f16667q);
        parcel.writeString(this.f16663m);
        parcel.writeString(this.f16662l);
        parcel.writeString(this.f16671u);
        parcel.writeValue(this.f16659i);
        parcel.writeValue(this.f16660j);
        if (this.f16658h) {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.f16664n);
        } else {
            parcel.writeByte((byte) 0);
        }
        if (this.f16661k) {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.f16665o);
            return;
        }
        parcel.writeByte((byte) 0);
    }

    private PhotoData(Parcel parcel) {
        this.f16664n = null;
        this.f16665o = null;
        this.f16666p = null;
        this.f16667q = "";
        this.f16668r = "";
        this.f16669s = -1;
        this.f16671u = null;
        this.f16670t = parcel.readLong();
        this.f16651a = parcel.readString();
        this.f16652b = parcel.readInt();
        this.f16653c = parcel.readInt();
        this.f16654d = parcel.readString();
        this.f16655e = parcel.readInt();
        this.f16656f = parcel.readInt();
        this.f16666p = parcel.readString();
        this.f16667q = parcel.readString();
        this.f16663m = parcel.readString();
        this.f16662l = parcel.readString();
        this.f16671u = parcel.readString();
        this.f16659i = (String) parcel.readValue(String.class.getClassLoader());
        this.f16660j = (String) parcel.readValue(String.class.getClassLoader());
        if (parcel.readByte() > 0) {
            this.f16658h = true;
            this.f16664n = parcel.readString();
        }
        if (parcel.readByte() > 0) {
            this.f16661k = true;
            this.f16665o = parcel.readString();
        }
    }

    public boolean hasDownLoadedPhoto() {
        return this.f16658h;
    }

    public void setDownLoadedPhoto(boolean z) {
        this.f16658h = z;
    }

    public void setPhotoPath(String str) {
        this.f16664n = str;
    }

    public boolean hasDownloadedThumb() {
        return this.f16661k;
    }

    public void setDownloadedThumb(boolean z) {
        this.f16661k = z;
    }

    public void setThumbPath(String str) {
        this.f16665o = str;
    }

    public long getId() {
        return this.f16670t;
    }

    public String getDescription() {
        return this.f16668r;
    }

    public void setDescription(String str) {
        this.f16668r = str;
    }

    public void removeDownloads() {
        if (this.f16661k && !TextUtils.isEmpty(this.f16665o)) {
            File file = new File(this.f16665o);
            if (file.exists() && file.delete()) {
                this.f16665o = null;
                this.f16661k = false;
            }
        }
        if (this.f16658h && !TextUtils.isEmpty(this.f16664n)) {
            File file2 = new File(this.f16664n);
            if (file2.exists() && file2.delete()) {
                this.f16664n = null;
                this.f16658h = false;
            }
        }
    }

    public boolean isLastImage() {
        return this.f16657g;
    }

    public void setLastImage(boolean z) {
        this.f16657g = z;
    }

    public String getSourceUrl() {
        return this.f16671u;
    }

    public void setSourceUrl(String str) {
        this.f16671u = str;
    }
}
