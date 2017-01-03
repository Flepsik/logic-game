package com.example.philipp.logicgame;

import android.util.Log;

import io.realm.Realm;

public class InitialData implements Realm.Transaction {
    @Override
    public void execute(Realm realm) {
        Log.d("Realm", "Initial");
    }
}
