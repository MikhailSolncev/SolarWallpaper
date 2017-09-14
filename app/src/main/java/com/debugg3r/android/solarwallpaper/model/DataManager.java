package com.debugg3r.android.solarwallpaper.model;

import android.content.Context;
import android.graphics.Bitmap;

import com.debugg3r.android.solarwallpaper.R;
import com.debugg3r.android.solarwallpaper.model.BitmapService;

public class DataManager {

    private final Context mContext;

    public DataManager(Context context) {
        this.mContext = context;
    }

    public Bitmap getBitmapFromResource() {
        return BitmapService.getBitmapFromResource(mContext, R.drawable.latest);
    }
}