package com.example.philipp.logicgame;

public interface PresenterFactory<P extends Presenter> {
    P create();
}
