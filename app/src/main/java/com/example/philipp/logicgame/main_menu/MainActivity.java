package com.example.philipp.logicgame.main_menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.philipp.logicgame.R;

public class MainActivity extends AppCompatActivity {

    private MainMenuPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
