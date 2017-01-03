package com.example.philipp.logicgame;

import android.util.Log;

import io.realm.DynamicRealm;
import io.realm.Realm;

public class DatabaseUtils {

    static class InitialData implements Realm.Transaction {
        @Override
        public void execute(Realm realm) {
            Log.d("Realm", "Initial");
        }
    }

    static class RealmMigration implements io.realm.RealmMigration {
        @Override
        public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {
            Log.d("Realm", "Migration: oldVersion = " + oldVersion + ", newVersion = " + newVersion);
        }
    }
}
