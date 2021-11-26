package test;

import java.awt.*;
import java.util.Random;

public class Ball {
    float x;
    float y;
    Color r;
    int dia=10;
    float speed = 5.0f;
    Main m;

    public Ball(Main m){
        this.m = m;
        Random r = new Random();
        x = r.nextInt(m.height-dia);
         y = r.nextInt(m.width-dia);
       // x = r.nextInt(100-dia);
        //y = r.nextInt(100-dia);

        this.r = Color.RED;
    }

    public void move(int desX, int desY){
        float dx = desX - x ;
        float dy = desY - y ;
        if(dx ==0 && dy == 0) return;
        float dir = (float) Math.atan2(dx, dy);


        x = x + (float) (speed*Math.cos(dir));
        y = y - (float) (speed*Math.sin(dir));
    }

    public void paint(Graphics g){
        g.setColor(r);
        g.fillOval((int)x, (int)y, dia, dia);
    }

}
