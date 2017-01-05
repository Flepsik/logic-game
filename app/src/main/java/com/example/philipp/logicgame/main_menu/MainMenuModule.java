package com.example.philipp.logicgame.main_menu;

import com.example.philipp.logicgame.common.annotations.ActivityScope;
import com.example.philipp.logicgame.common.presenter.PresenterCache;
import com.example.philipp.logicgame.common.presenter.PresenterFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class MainMenuModule {

    @ActivityScope
    @Provides
    MainMenuPresenter provideLoginActivityPresenter() {
        return PresenterCache.getInstance().getPresenter(MainMenuPresenterImpl.TAG,
                (PresenterFactory<MainMenuPresenter>) MainMenuPresenterImpl::new);
    }
}
