package com.example.olya.remind;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.MainThread;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by Olya on 05.01.2017.
 */
public class DrawView extends SurfaceView implements SurfaceHolder.Callback {
    private static final String TAG = "Log";
    private DrawThread thread;

    public DrawView(Context context) {
        super(context);
        getHolder().addCallback(this);
        thread = new DrawThread(getHolder(),this);

        setFocusable(true);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
            thread.setRunning(true);
            thread.start();
        }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
boolean retry = true;
        while (retry){
            try {
                thread.join();
                retry = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == event.ACTION_DOWN) {
            if (event.getY() > getHeight() - 50) {
                thread.setRunning(false);
                ((Activity) getContext()).finish();

        } else {
            Log.d(TAG, "Coords x: " + event.getX() + ",y: " + event.getY());

        }
    }
            return super.onTouchEvent(event);
        }

    @Override
    protected void onDraw(Canvas canvas) {

        //DrawThread.onDraw(canvas);
         canvas.drawColor(Color.RED);
    }
}
