package com.mogi.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by nobuy_000 on 2017/05/14.
 */

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {//(4)
        super.onCreate(bundle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//(5)
        setContentView(new HelloView(this));//(6)
    }
}
