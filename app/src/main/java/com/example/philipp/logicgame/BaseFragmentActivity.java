package com.example.philipp.logicgame;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public abstract class BaseFragmentActivity extends AppCompatActivity {
    @LayoutRes
    private static final int LAYOUT_ID = R.layout.activity_simple;
    @IdRes
    private static final int CONTENT_ID = R.id.content;

    protected FragmentManager fragmentManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initToolbar();
        fragmentManager = getSupportFragmentManager();
        if (getContentId() > 0) {
            Fragment fragment = fragmentManager.findFragmentById(getContentId());
            if (fragment == null) {
                openFirstFragment(onCreateFirstFragment());
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    protected abstract Fragment onCreateFirstFragment();

    @LayoutRes
    protected int getLayoutId() {
        return LAYOUT_ID;
    }

    @IdRes
    protected int getContentId() {
        return CONTENT_ID;
    }

    private void openFirstFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(getContentId(), fragment)
                .commit();
    }

    private void initToolbar() {
        boolean shouldShowArrow = !isTaskRoot();
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(shouldShowArrow);
            getSupportActionBar().setDisplayShowHomeEnabled(shouldShowArrow);
        }
    }
}
