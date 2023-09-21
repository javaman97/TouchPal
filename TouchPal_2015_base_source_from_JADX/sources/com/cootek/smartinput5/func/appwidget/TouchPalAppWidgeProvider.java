package com.cootek.smartinput5.func.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.cootek.smartinput5.TouchPalOptionInte;
import com.emoji.keyboard.touchpal.R;

public class TouchPalAppWidgeProvider extends AppWidgetProvider {
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.app_widget_layout);
        remoteViews.setOnClickPendingIntent(R.id.app_widget_img, getPendingIntent(context));
        appWidgetManager.updateAppWidget(iArr, remoteViews);
    }

    private PendingIntent getPendingIntent(Context context) {
        return PendingIntent.getActivity(context, 0, new Intent(context, TouchPalOptionInte.class), 0);
    }

    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
    }

    public void onEnabled(Context context) {
        super.onEnabled(context);
    }

    public void onDisabled(Context context) {
        super.onDisabled(context);
    }
}
