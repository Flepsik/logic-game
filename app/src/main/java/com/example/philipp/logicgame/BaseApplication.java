package com.example.philipp.logicgame;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .schemaVersion(BuildConfig.DATABASE_VERSION)
                .migration(new RealmMigration())
                .build();
        Realm.getInstance(configuration);
    }
}
