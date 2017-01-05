package com.example.philipp.logicgame;

import android.support.annotation.NonNull;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<View> {
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

    protected abstract void onDestroy();

    protected abstract void updateView();
}
