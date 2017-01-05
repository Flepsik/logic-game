package com.example.philipp.logicgame.main_menu;

import android.support.v4.app.Fragment;

import com.example.philipp.logicgame.BaseFragmentActivity;


public class MainMenuActivity extends BaseFragmentActivity {

    @Override
    protected Fragment onCreateFirstFragment() {
        return MainMenuFragment.newInstance();
    }
}
