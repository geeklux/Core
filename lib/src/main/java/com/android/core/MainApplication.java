package com.android.core;

import android.app.Application;
import android.content.Context;
/**
 * Created by bug on 2015/09/23.
 */
public class MainApplication extends Application {

    private static MainApplication ourInstance = new MainApplication();
    private static Context mContext;

    public static MainApplication getInstance() {
        return ourInstance;
    }

    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ourInstance = this;
        mContext = getApplicationContext();
    }
}
