package com.aleksandrp.daggerexample.inj.componenet;

import com.aleksandrp.daggerexample.activity.MainActivity;
import com.aleksandrp.daggerexample.inj.modules.ActivityNodule;
import com.aleksandrp.daggerexample.inj.scopes.PerActivity;

import dagger.Component;

/**
 * Created by AleksandrP on 17.01.2018.
 */
@PerActivity
@Component(modules={ActivityNodule.class}, dependencies={AppComponent.class})
public interface ActivityComponent {

    void inject(MainActivity activity);

}
