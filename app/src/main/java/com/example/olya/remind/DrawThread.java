package com.example.olya.remind;

import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import android.view.SurfaceHolder;

/**
 * Created by Olya on 05.01.2017.
 */
public class DrawThread extends Thread{
    public static final String TAG= "Log";

    public boolean running;
    private Canvas canvas;
    private SurfaceHolder surfaceHolder;
    private DrawView drawView;

    public DrawThread(SurfaceHolder surfaceHolder, DrawView drawView) {
        super();
        this.surfaceHolder = surfaceHolder;
        this.drawView = drawView;
    }
    public  void setRunning(boolean running){
        this.running = running;
    }
    public  void  run(){
        long tickCount= 0;
        Log.d(TAG,"Starting game loop");
        while(running){
            tickCount++;
// здесь будет обновляться состояние игры
// и формироваться кадр для вывода на экран
//Log.d(TAG,"Game loop executed "+ tickCount+" times");
        }
        Log.d(TAG,"Game loop executed "+ tickCount+" times");
    }
    }






