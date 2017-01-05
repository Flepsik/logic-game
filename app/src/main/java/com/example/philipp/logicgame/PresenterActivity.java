package com.example.philipp.logicgame;

public abstract class PresenterActivity<T extends Presenter> extends BaseFragmentActivity {

    protected T presenter;
}
