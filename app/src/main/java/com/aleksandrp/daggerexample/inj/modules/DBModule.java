package com.aleksandrp.daggerexample.inj.modules;

import android.content.Context;

import com.aleksandrp.daggerexample.preference.DbHelper;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AleksandrP on 17.01.2018.
 */
@Module
public class DBModule {

    @Provides
    DbHelper dbhelper(Context context){
        return new DbHelper(context);}
}
