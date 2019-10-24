package com.example.bubbles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

class MyView extends View{
    int count = 12;
    Bubble[] bubbles = new Bubble[count];
    public MyView(Context context){
        super(context);
        for(int i = 0; i < count; i++){
            bubbles[i] = new Bubble((int)(Math.random()*500),
                    (int)(Math.random()*500),
                    (int)(Math.random()*6 - 3),
                    (int)(Math.random()*6 - 3),
                    Color.argb(255, (int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
        }
    }

    Paint paint = new Paint();
    @Override
    public void onDraw(Canvas canvas){
        for(int i = 0; i < count; i++){
            paint.setColor(bubbles[i].color);
            canvas.drawCircle(bubbles[i].x,bubbles[i].y,20,paint);
        }

        invalidate();
    }
}