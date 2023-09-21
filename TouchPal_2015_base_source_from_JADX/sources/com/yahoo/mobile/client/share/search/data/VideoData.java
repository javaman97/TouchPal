package com.yahoo.mobile.client.share.search.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.URLUtil;
import com.yahoo.mobile.client.share.search.p099ui.view.ThumbImageViewHolder;
import com.yahoo.mobile.client.share.search.util.UrlUtils;
import java.io.File;

public class VideoData implements Parcelable, ThumbImageViewHolder.IThumbnailHolder {
    public static final Parcelable.Creator<VideoData> CREATOR = new Parcelable.Creator<VideoData>() {
        public final VideoData createFromParcel(Parcel parcel) {
            return new VideoData(parcel, (byte) 0);
        }

        public final VideoData[] newArray(int i) {
            return new VideoData[i];
        }
    };

    /* renamed from: a */
    private String f16715a;

    /* renamed from: b */
    private String f16716b;

    /* renamed from: c */
    private int f16717c;

    /* renamed from: d */
    private int f16718d;

    /* renamed from: e */
    private String f16719e;

    /* renamed from: f */
    private String f16720f;

    /* renamed from: g */
    private String f16721g;

    /* renamed from: h */
    private String f16722h;

    /* renamed from: i */
    private String f16723i;

    /* renamed from: j */
    private boolean f16724j;

    /* renamed from: k */
    private String f16725k;

    /* renamed from: l */
    private String f16726l;

    /* renamed from: m */
    private boolean f16727m;

    /* renamed from: n */
    private String f16728n;

    /* synthetic */ VideoData(Parcel parcel, byte b) {
        this(parcel);
    }

    public VideoData(String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f16725k = null;
        this.f16726l = str;
        this.f16715a = str2;
        this.f16716b = str3;
        this.f16717c = i;
        this.f16718d = i2;
        this.f16719e = str4;
        this.f16720f = str5;
        this.f16721g = str6;
        this.f16722h = str7;
        this.f16723i = str8;
        this.f16727m = false;
        this.f16728n = str9;
        if (this.f16715a != null && this.f16715a.startsWith("http://www.dailymotion.com/swf/")) {
            this.f16715a = this.f16715a.replace("/swf", "");
        }
    }

    public boolean isLastVideo() {
        return this.f16727m;
    }

    public void setLastVideo(boolean z) {
        this.f16727m = z;
    }

    public String getVideoUrl() {
        return this.f16715a;
    }

    public String getThumbnailUrl() {
        if (this.f16724j) {
            return this.f16725k;
        }
        return this.f16716b;
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

    public boolean hasDownloadedThumb() {
        return this.f16724j;
    }

    public void setDownloadedThumb(boolean z) {
        this.f16724j = z;
    }

    public void setThumbnailUrl(String str) {
        this.f16716b = str;
    }

    public void setThumbPath(String str) {
        this.f16725k = str;
    }

    public int getThumbHeight() {
        return this.f16717c;
    }

    public int getThumbWidth() {
        return this.f16718d;
    }

    public String getDisplayUrl() {
        return this.f16719e;
    }

    public String getTitle() {
        return this.f16720f;
    }

    public String getDescription() {
        return this.f16721g;
    }

    public String getAge() {
        return this.f16722h;
    }

    public String getDuration() {
        return this.f16723i;
    }

    public String getId() {
        return this.f16726l;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16726l);
        parcel.writeString(this.f16715a);
        parcel.writeString(this.f16716b);
        parcel.writeInt(this.f16717c);
        parcel.writeInt(this.f16718d);
        parcel.writeString(this.f16719e);
        parcel.writeString(this.f16720f);
        parcel.writeString(this.f16721g);
        parcel.writeString(this.f16722h);
        parcel.writeString(this.f16723i);
        parcel.writeValue(this.f16728n);
        if (this.f16724j) {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.f16725k);
            return;
        }
        parcel.writeByte((byte) 0);
    }

    private VideoData(Parcel parcel) {
        this.f16725k = null;
        this.f16726l = parcel.readString();
        this.f16715a = parcel.readString();
        this.f16716b = parcel.readString();
        this.f16717c = parcel.readInt();
        this.f16718d = parcel.readInt();
        this.f16719e = parcel.readString();
        this.f16720f = parcel.readString();
        this.f16721g = parcel.readString();
        this.f16722h = parcel.readString();
        this.f16723i = parcel.readString();
        this.f16728n = (String) parcel.readValue(String.class.getClassLoader());
        if (parcel.readByte() > 0) {
            this.f16724j = true;
            this.f16725k = parcel.readString();
        }
    }

    public void removeDownloads() {
        if (this.f16724j) {
            File file = new File(this.f16725k);
            if (file.exists() && file.delete()) {
                this.f16725k = null;
                this.f16724j = false;
            }
        }
    }

    public String getBeaconUrl() {
        return this.f16728n;
    }
}
