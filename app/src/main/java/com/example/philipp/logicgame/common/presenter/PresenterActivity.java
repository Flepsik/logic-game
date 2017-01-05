package com.example.philipp.logicgame.common.presenter;

import com.example.philipp.logicgame.common.BaseFragmentActivity;

public abstract class PresenterActivity<T extends Presenter> extends BaseFragmentActivity {

    protected T presenter;
}
