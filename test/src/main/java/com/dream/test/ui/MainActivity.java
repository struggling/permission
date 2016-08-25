package com.dream.test.ui;

import com.dream.test.R;
import com.dream.test.presenter.MainPresenter;

import org.yapp.core.ui.activity.BaseAppCompatActivity;
import org.yapp.core.ui.inject.annotation.ContentInject;

@ContentInject(value = R.layout.activity_main,
        presenter = MainPresenter.class)
public class MainActivity extends BaseAppCompatActivity<MainPresenter> {
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        mPresenter.onRequestPermissionsResult(requestCode, permissions, grantResults);
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
