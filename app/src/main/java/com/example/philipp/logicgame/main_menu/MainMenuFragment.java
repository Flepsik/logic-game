package com.example.philipp.logicgame.main_menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.philipp.logicgame.PresenterFragment;
import com.example.philipp.logicgame.R;

public class MainMenuFragment extends PresenterFragment<MainMenuPresenter> {

    public static MainMenuFragment newInstance() {
        Bundle args = new Bundle();
        MainMenuFragment fragment = new MainMenuFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_menu, container, false);
        rootView.setOnClickListener(view -> {
            getActivity().startActivity(new Intent(getActivity(), MainMenuActivity.class));
        });
        return rootView;
    }
}
