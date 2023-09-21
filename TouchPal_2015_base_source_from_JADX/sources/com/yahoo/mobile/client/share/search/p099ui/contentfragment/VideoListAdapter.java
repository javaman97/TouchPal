package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.VideoData;
import com.yahoo.mobile.client.share.search.data.contentmanager.IListViewAdapterHandler;
import com.yahoo.mobile.client.share.search.interfaces.IImageLoadListener;
import com.yahoo.mobile.client.share.search.interfaces.IImageLoader;
import com.yahoo.mobile.client.share.search.interfaces.IImageProcessor;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.util.C4245j;
import com.yahoo.mobile.client.share.search.util.C4248m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.VideoListAdapter */
public class VideoListAdapter extends BaseAdapter {

    /* renamed from: c */
    private static final String f17173c = VideoListAdapter.class.getSimpleName();

    /* renamed from: a */
    protected Context f17174a;

    /* renamed from: b */
    protected LayoutInflater f17175b;

    /* renamed from: d */
    private ArrayList<VideoData> f17176d;

    /* renamed from: e */
    private SearchQuery f17177e;

    /* renamed from: f */
    private View.OnClickListener f17178f;

    /* renamed from: g */
    private IImageLoader f17179g;

    /* renamed from: h */
    private IListViewAdapterHandler f17180h;

    public SearchQuery getQuery() {
        return this.f17177e;
    }

    public void setQuery(SearchQuery searchQuery) {
        this.f17177e = searchQuery;
    }

    public VideoListAdapter(Context context, SearchQuery searchQuery, IListViewAdapterHandler iListViewAdapterHandler, ArrayList<VideoData> arrayList) {
        this.f17174a = context;
        this.f17177e = searchQuery;
        this.f17180h = iListViewAdapterHandler;
        if (arrayList == null) {
            this.f17176d = new ArrayList<>();
        } else {
            this.f17176d = arrayList;
        }
        this.f17175b = (LayoutInflater) this.f17174a.getSystemService("layout_inflater");
        this.f17179g = C4129c.m17444i().getImageLoader(this.f17174a);
    }

    public void setItemClickListener(View.OnClickListener onClickListener) {
        this.f17178f = onClickListener;
    }

    public void addVideo(VideoData videoData) {
        if (videoData != null) {
            this.f17176d.add(videoData);
        }
    }

    public void addVideos(SearchQuery searchQuery, ArrayList<VideoData> arrayList) {
        if (arrayList != null) {
            this.f17177e = searchQuery;
            Iterator<VideoData> it = arrayList.iterator();
            while (it.hasNext()) {
                addVideo(it.next());
            }
        }
    }

    public void remove(VideoData videoData) {
        Iterator<VideoData> it = this.f17176d.iterator();
        while (it.hasNext()) {
            VideoData next = it.next();
            if (next.getVideoUrl().equalsIgnoreCase(videoData.getVideoUrl())) {
                next.removeDownloads();
                this.f17176d.remove(next);
                notifyDataSetChanged();
            }
        }
    }

    public void clear() {
        Iterator<VideoData> it = this.f17176d.iterator();
        while (it.hasNext()) {
            it.next().removeDownloads();
        }
        this.f17176d.clear();
    }

    public int getCount() {
        return this.f17176d.size();
    }

    public VideoData getItem(int i) {
        if (this.f17176d.size() > i) {
            return this.f17176d.get(i);
        }
        return null;
    }

    public ArrayList<VideoData> getAllItems() {
        return this.f17176d;
    }

    public int getIndexOf(VideoData videoData) {
        if (this.f17176d.contains(videoData)) {
            return this.f17176d.indexOf(videoData);
        }
        return -1;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C4201a aVar;
        String duration;
        if (this.f17180h != null) {
            this.f17180h.onShowRowView(this, i, view, this.f17177e);
        }
        VideoData item = getItem(i);
        if (view == null) {
            view2 = this.f17175b.inflate(C4073a.C4083j.yssdk_video_list_item, viewGroup, false);
            aVar = new C4201a();
            aVar.f17183c = item;
            aVar.f17181a = (ImageView) view2.findViewById(C4073a.C4081h.image_item);
            aVar.f17182b = (ImageView) view2.findViewById(C4073a.C4081h.image_background);
            aVar.f17184d = (TextView) view2.findViewById(C4073a.C4081h.info);
            aVar.f17185e = (TextView) view2.findViewById(C4073a.C4081h.title);
            aVar.f17186f = (TextView) view2.findViewById(C4073a.C4081h.view_url);
            view2.setTag(aVar);
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view2.getLayoutParams();
            layoutParams.height = (int) (((float) Utils.getScreenWidth(this.f17174a)) / 1.7777778f);
            view2.setLayoutParams(layoutParams);
        } else {
            C4201a aVar2 = (C4201a) view.getTag();
            if (aVar2.f17185e == null) {
                aVar2.f17185e = (TextView) view.findViewById(C4073a.C4081h.title);
            }
            if (aVar2.f17184d == null) {
                aVar2.f17184d = (TextView) view.findViewById(C4073a.C4081h.info);
            }
            if (aVar2.f17186f == null) {
                aVar2.f17186f = (TextView) view.findViewById(C4073a.C4081h.view_url);
            }
            if (aVar2.f17181a == null) {
                aVar2.f17181a = (ImageView) view.findViewById(C4073a.C4081h.image_item);
            }
            if (aVar2.f17182b == null) {
                aVar2.f17182b = (ImageView) view.findViewById(C4073a.C4081h.image_background);
            }
            view2 = view;
            aVar = aVar2;
        }
        aVar.f17183c = item;
        if (item != null) {
            aVar.f17185e.setText(Html.fromHtml(item.getTitle()));
        }
        String str = "";
        if (item != null) {
            if (item.getAge() != null && !item.getAge().equals("")) {
                str = item.getDisplayUrl() + str + " | " + item.getAge();
            }
            if (!(item.getDuration() == null || (duration = item.getDuration()) == null || duration.equals(""))) {
                if (str.length() > 0) {
                    str = str + " | ";
                }
                str = str + duration;
            }
            aVar.f17184d.setText(str);
            aVar.f17181a.setImageDrawable((Drawable) null);
            if (C4245j.m17787b(this.f17174a)) {
                ImageView imageView = aVar.f17181a;
                ImageView imageView2 = aVar.f17182b;
                C4201a aVar3 = (C4201a) imageView.getTag();
                if (view == null) {
                    view = this.f17175b.inflate(C4073a.C4083j.yssdk_justified_item, (ViewGroup) null);
                }
                if (aVar3 == null) {
                    aVar3 = new C4201a();
                }
                aVar3.f17181a = imageView;
                aVar3.f17182b = imageView2;
                aVar3.f17183c = item;
                aVar3.f17187g = i;
                view.setTag(aVar3);
                aVar3.f17181a.setTag(aVar3);
                Uri parse = Uri.parse(item.getEscapedThumbnailUrl());
                imageView.clearAnimation();
                Drawable loadImage = this.f17179g.loadImage(parse, aVar3);
                if (loadImage != null) {
                    imageView.setImageDrawable(loadImage);
                }
            }
        }
        aVar.f17181a.setAdjustViewBounds(true);
        if (this.f17178f != null) {
            view2.setOnClickListener(this.f17178f);
        }
        return view2;
    }

    /* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.VideoListAdapter$a */
    public class C4201a implements IImageLoadListener {

        /* renamed from: a */
        ImageView f17181a;

        /* renamed from: b */
        ImageView f17182b;

        /* renamed from: c */
        VideoData f17183c;

        /* renamed from: d */
        TextView f17184d;

        /* renamed from: e */
        TextView f17185e;

        /* renamed from: f */
        TextView f17186f;

        /* renamed from: g */
        int f17187g;

        /* renamed from: h */
        Animation f17188h;

        public C4201a() {
            this.f17188h = AnimationUtils.loadAnimation(VideoListAdapter.this.f17174a, C4073a.C4074a.yssdk_image_fade_anim);
        }

        public final void onImageReady(Drawable drawable, Uri uri) {
            IImageProcessor imageProcessor;
            Bitmap blur;
            synchronized (this) {
                if (uri != null) {
                    if (this.f17183c.getEscapedThumbnailUrl().equalsIgnoreCase(uri.toString())) {
                        this.f17181a.setImageDrawable(drawable);
                        this.f17181a.setScaleType(ImageView.ScaleType.FIT_XY);
                        this.f17181a.setAdjustViewBounds(true);
                        this.f17181a.startAnimation(this.f17188h);
                        this.f17182b.setBackgroundColor(VideoListAdapter.this.f17174a.getResources().getColor(C4073a.C4078e.default_video_background));
                        if (C4129c.m17449n() && C4248m.f17353h && (imageProcessor = C4129c.m17444i().getImageProcessor()) != null && (blur = imageProcessor.blur(((BitmapDrawable) drawable).getBitmap(), 30)) != null) {
                            float integer = ((float) VideoListAdapter.this.f17174a.getResources().getInteger(C4073a.C4082i.video_background_scale_factor)) / 100.0f;
                            Drawable[] drawableArr = {new BitmapDrawable(VideoListAdapter.this.f17174a.getResources(), blur), new ColorDrawable(VideoListAdapter.this.f17174a.getResources().getColor(C4073a.C4078e.yssdk_translucent_background))};
                            Matrix matrix = new Matrix();
                            matrix.postScale(integer, integer);
                            this.f17182b.setImageDrawable(new LayerDrawable(drawableArr));
                            this.f17182b.setImageMatrix(matrix);
                        }
                    }
                }
            }
        }

        public final void onImageReady(Drawable drawable) {
        }
    }
}
