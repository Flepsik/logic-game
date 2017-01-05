package com.example.philipp.logicgame;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class App extends Application {
    private static AppComponent component;

    public static AppComponent getComponent() {
        return component;
    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .build();
    }
    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(new Fabric.Builder(this).kits(new Crashlytics()).debuggable(true).build());
        component = buildComponent();
        initDatabase();
    }


    protected void initDatabase() {
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
