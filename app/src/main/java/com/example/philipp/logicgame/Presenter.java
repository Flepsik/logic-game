package com.example.philipp.logicgame;

import android.support.annotation.NonNull;

public interface Presenter<View> {
    void bindView(@NonNull View view);

    void unbindView();

    void onDestroy();

    void updateView();
}
