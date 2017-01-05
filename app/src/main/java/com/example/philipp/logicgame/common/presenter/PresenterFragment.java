package com.example.philipp.logicgame.common.presenter;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

public abstract class PresenterFragment<P extends Presenter, View extends BindView> extends Fragment {
    @Inject
    protected P presenter;

    @Override
    public void onResume() {
        super.onResume();
        presenter.bindView(getBindView());
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.unbindView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @NonNull
    public abstract View getBindView();
}
