package com.example.philipp.logicgame.main_menu;

import com.example.philipp.logicgame.common.annotations.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = MainMenuModule.class)
public interface MainMenuComponent {

    void injectMainMenuFragment(MainMenuFragment mainMenuFragment);

}