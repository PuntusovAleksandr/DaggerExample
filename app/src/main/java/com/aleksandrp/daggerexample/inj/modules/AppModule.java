package com.aleksandrp.daggerexample.inj.modules;

import android.app.Application;
import android.content.Context;

import com.aleksandrp.daggerexample.App;
import com.aleksandrp.daggerexample.inj.scopes.PerApplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AleksandrP on 17.01.2018.
 */
@PerApplication
@Module(includes = DBModule.class)
public class AppModule {

    Application app;

    public AppModule(App app){
        this.app = app;
    }

    @Provides
    Context provideContext(){return app.getApplicationContext();}

//    @Provides
//    @PerApplication
//    DbHelper provideDbHelper(Context context){
//        return new DbHelper(context);
//    }

}
