package com.example.philipp.logicgame.common.presenter;

import android.support.annotation.NonNull;

public interface Presenter<View extends BindView> {
    void bindView(@NonNull View view);

    void unbindView();

    void onDestroy();

    void updateView();
}
