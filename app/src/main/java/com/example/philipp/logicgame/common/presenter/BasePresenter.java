package com.example.philipp.logicgame.common.presenter;

import android.support.annotation.NonNull;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<View extends BindView> implements Presenter<View> {
    private WeakReference<View> view;

    public void bindView(@NonNull View view) {
        this.view = new WeakReference<>(view);
        updateView();
    }

    public void unbindView() {
        this.view = null;
    }

    protected View view() {
        if (view == null) {
            return null;
        } else {
            return view.get();
        }
    }

    public abstract void onDestroy();

    public abstract void updateView();
}
