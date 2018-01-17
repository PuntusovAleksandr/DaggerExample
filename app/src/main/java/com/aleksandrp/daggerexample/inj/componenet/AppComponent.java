package com.aleksandrp.daggerexample.inj.componenet;

import com.aleksandrp.daggerexample.App;
import com.aleksandrp.daggerexample.inj.modules.AppModule;
import com.aleksandrp.daggerexample.inj.scopes.PerApplication;
import com.aleksandrp.daggerexample.preference.DbHelper;

import dagger.Component;

/**
 * Created by AleksandrP on 17.01.2018.
 */
@PerApplication
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(App mApp);

    DbHelper dbHelper();
}
