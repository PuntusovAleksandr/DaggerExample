package com.aleksandrp.daggerexample.inj.modules;

import com.aleksandrp.daggerexample.inj.scopes.PerActivity;
import com.aleksandrp.daggerexample.preference.Bus;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AleksandrP on 17.01.2018.
 */
@PerActivity
@Module
public class ActivityNodule {

    @Provides
    Bus provideBus (){return new Bus();}
}
