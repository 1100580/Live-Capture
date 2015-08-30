package com.google.android.apps.watchme;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Fernando Bessa on 8/30/2015.
 */
public class StreamInfo {
    protected Drawable icon;
    protected String streamName;
    protected String streamDescription;

    public StreamInfo(Drawable i, String sn, String sd){
        icon = i;
        streamName = sn;
        streamDescription = sd;
    }
}
