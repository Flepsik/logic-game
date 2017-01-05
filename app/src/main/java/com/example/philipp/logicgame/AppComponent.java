package com.example.philipp.logicgame;

import com.example.philipp.logicgame.main_menu.MainMenuComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component()
public interface AppComponent {
    MainMenuComponent createMainMenuComponent();
}
