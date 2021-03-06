package com.example.olya.remind;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by Olya on 07.01.2017.
 */

public class Droid {
    private Bitmap bitmap;
    private int x,y;
    private boolean touched;

    public Droid(Bitmap bitmap, int x, int y) {
        this.bitmap = bitmap;
        this.x = x;
        this.y = y;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public boolean isTouched(){
        return  touched;
    }

    public void setTouched(boolean touched){
        this.touched = touched;
    }
    public void draw(Canvas canvas){
        canvas.drawBitmap(bitmap, x-(bitmap.getWidth()/2), y-(bitmap.getHeight()/2),null);
    }

    public void handleActionDown(int eventX, int eventY){
        if(eventX>=(x- bitmap.getWidth()/2)&&(eventX<=(x+ bitmap.getWidth()/2))){
            if(eventY>=(y- bitmap.getHeight()/2)&&(y<=(y+ bitmap.getHeight()/2))){
// переводим робот в режим перетаскивания
                setTouched(true);
            }else{
                setTouched(false);
            }
        }else{
            setTouched(false);
        }

    }
}
