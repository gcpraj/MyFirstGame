package com.example.prgc.myfirstgame;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by prgc on 9/26/2015.
 */
public class Background {

    private Bitmap image;
    private int x, y, dx;

    public Background(Bitmap res) {
        image = res;
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
        if (x < 0) {
            canvas.drawBitmap(image, x+GamePanel.WIDTH, y, null );
        }
    }

    public void update()
    {
        x+=dx;
        if (x<-GamePanel.WIDTH) {
            x = 0;
        }
    }

    public void setVector(int dx)
    {
        this.dx = dx;
    }


}
