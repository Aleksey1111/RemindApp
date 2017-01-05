package com.example.olya.remind;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Olya on 05.01.2017.
 */
public class DrawView extends View {
    Paint p;

    public DrawView(Context context) {
        super(context);
        p = new Paint(Color.GREEN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.GREEN);
    }
}
