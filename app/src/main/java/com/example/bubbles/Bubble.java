package com.example.bubbles;

import android.graphics.Color;

public class Bubble {
    int x, y = 0;
    int vx, vy = 0;
    int color = Color.argb(255,0,0,0);

    public Bubble(int x, int y, int vx, int vy, int color){
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.color = color;
    }
}
