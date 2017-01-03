package com.example.philipp.logicgame;

import android.app.Application;

import java.io.FileNotFoundException;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initDatabase();
    }

    private void initDatabase() {
        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .schemaVersion(BuildConfig.DATABASE_VERSION)
                .initialData(new DatabaseUtils.InitialData())
                .migration(new DatabaseUtils.RealmMigration())
                .build();
        Realm.setDefaultConfiguration(configuration);
        Realm.getInstance(configuration);
    }
}
