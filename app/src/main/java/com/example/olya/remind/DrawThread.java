package com.example.olya.remind;

import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;

/**
 * Created by Olya on 05.01.2017.
 */
public class DrawThread extends Thread{
    public boolean running;
    public  void setRunning(boolean running){
        this.running = running;
    }
    public  void  run(){
        while (running){

        }
    }
}



