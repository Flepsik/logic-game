package com.example.philipp.logicgame.main_menu;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.philipp.logicgame.App;
import com.example.philipp.logicgame.R;
import com.example.philipp.logicgame.common.presenter.PresenterFragment;

public class MainMenuFragment extends PresenterFragment<MainMenuPresenter, MainMenuView> implements MainMenuView {
    public static MainMenuFragment newInstance() {
        return new MainMenuFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainMenuComponent loginActivityComponent = App.getComponent().createMainMenuComponent();
        loginActivityComponent.injectMainMenuFragment(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_menu, container, false);
        return rootView;
    }

    @NonNull
    @Override
    public MainMenuView getBindView() {
        return this;
    }
}
