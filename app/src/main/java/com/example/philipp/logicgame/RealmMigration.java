package com.example.philipp.logicgame;

import android.util.Log;

import io.realm.DynamicRealm;

public class RealmMigration implements io.realm.RealmMigration {
    @Override
    public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {
        Log.d("Realm", "Migration: oldVersion = " + oldVersion + ", newVersion = " + newVersion);
    }
}
