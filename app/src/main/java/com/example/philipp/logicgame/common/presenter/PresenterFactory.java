package com.example.philipp.logicgame.common.presenter;

public interface PresenterFactory<P extends Presenter> {
    P create();
}
