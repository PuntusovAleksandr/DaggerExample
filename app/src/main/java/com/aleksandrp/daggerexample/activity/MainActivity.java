package com.aleksandrp.daggerexample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.aleksandrp.daggerexample.App;
import com.aleksandrp.daggerexample.R;
import com.aleksandrp.daggerexample.inj.componenet.ActivityComponent;
import com.aleksandrp.daggerexample.inj.componenet.DaggerActivityComponent;
import com.aleksandrp.daggerexample.inj.modules.ActivityNodule;
import com.aleksandrp.daggerexample.preference.Bus;
import com.aleksandrp.daggerexample.preference.DbHelper;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DbHelper dbHelper;
    @Inject
    Bus bus;
    ActivityComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerActivityComponent.builder()
                .activityNodule(new ActivityNodule())
                .appComponent(App.getAppComponent())
                .build();
        component.inject(this);

        Log.d("TAG", "db " + dbHelper.toString());
        Log.d("TAG", "bus " + bus.toString());
        Log.d("TAG", "component " + component.toString());

    }
}

