package com.aleksandrp.daggerexample.inj.scopes;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by AleksandrP on 17.01.2018.
 */

@Scope
@Retention(RUNTIME)
public @interface PerActivity {
}
