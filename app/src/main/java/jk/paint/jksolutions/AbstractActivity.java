package jk.paint.jksolutions;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import jk.paint.jksolutions.util.StatusBarUtil;

/**
 * Created by lht-Mac on 2017/9/29.
 */

public abstract class AbstractActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StatusBarUtil.setStatusBarColor(this, jk.paint.jksolutions.R.color.colorPrimary);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            StatusBarUtil.StatusBarDarkMode(this, 1);
        }
    }
}
