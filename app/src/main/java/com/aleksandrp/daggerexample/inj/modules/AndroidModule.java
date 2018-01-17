package com.aleksandrp.daggerexample.inj.modules;

import android.app.NotificationManager;
import android.content.Context;

import com.aleksandrp.daggerexample.preference.MyPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AleksandrP on 17.01.2018.
 */
@Module
public class AndroidModule {


    @Provides
    @Singleton
    MyPreferences providesMyPreferences(Context context) {
        return MyPreferences.getInstance(context);
    }


    @Provides
    @Singleton
    NotificationManager providesNotificationManager(Context context) {
        return (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    }
}
