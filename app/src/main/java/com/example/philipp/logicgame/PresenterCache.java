package com.example.philipp.logicgame;

import android.support.v4.util.SimpleArrayMap;

public class PresenterCache {
    private static PresenterCache instance = null;

    private SimpleArrayMap<String, Presenter> presenters;

    private PresenterCache() {
    }

    public static PresenterCache getInstance() {
        if (instance == null) {
            instance = new PresenterCache();
        }
        return instance;
    }

    public final <T extends Presenter> T getPresenter(String tag,
                                                      PresenterFactory<T> presenterFactory) {
        if (presenters == null) {
            presenters = new SimpleArrayMap<>();
        }
        T presenter = null;
        try {
            //noinspection unchecked
            presenter = (T) presenters.get(tag);
        } catch (Exception ignored) {
            // it's ok to return null in this case
        }

        if (presenter == null) {
            presenter = presenterFactory.create();
        }
        return presenter;
    }

    /**
     * Remove the presenter associated with the given tag
     *
     * @param tag an unique tag to identify the presenter
     */

    public final void removePresenter(String tag) {
        if (presenters != null) {
            presenters.remove(tag);
        }
    }
}