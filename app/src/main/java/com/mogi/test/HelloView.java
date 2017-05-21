package com.mogi.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by nobuy_000 on 2017/05/14.
 */

public class HelloView extends View {

    //コンストラクタ
    public HelloView(Context context) {
        super(context);
        setBackgroundColor(Color.BLUE);//(8)
    }

    //描画時に呼ばれる
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint=new Paint();//(9)
        paint.setTextSize(48);
        canvas.drawText("Hello World!", 0, 30, paint);//(10)
    }

}
