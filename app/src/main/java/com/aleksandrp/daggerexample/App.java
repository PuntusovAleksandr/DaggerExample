package com.aleksandrp.daggerexample;

import android.app.Application;

import com.aleksandrp.daggerexample.inj.componenet.AppComponent;
import com.aleksandrp.daggerexample.inj.componenet.DaggerAppComponent;
import com.aleksandrp.daggerexample.inj.modules.AppModule;
import com.aleksandrp.daggerexample.inj.modules.DBModule;

/**
 * Created by AleksandrP on 17.01.2018.
 */

public class App extends Application {

//    @Inject
//    DbHelper dbHelper;
    private App sApp;

    private static AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sApp = this;
        inject();
    }

    private void inject() {
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .dBModule(new DBModule())
                .build();
        mAppComponent.inject(this);
    }

    public static AppComponent getAppComponent() {
        return mAppComponent;
    }
}
