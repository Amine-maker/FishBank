
import java.awt.*;
import java.util.Random;

public class Fish {
    float x;
    float y;
    Color r;
    int dia = 10;
    float speed = 4.0f;
    Main m;

    public Fish(Main m) {
        this.m = m;
        Random r = new Random();

        // x = r.nextInt(300 - dia);
        // y = r.nextInt(300 - dia);

        x = 300;
        y = 300;

        this.r = Color.BLUE;
    }

    public void move(int desX, int desY) {
        float dx = desX - x;
        float dy = desY - y;
        if (dx == 0 && dy == 0)
            return;
        float dir = (float) Math.atan2(dx, dy);

        x = x + (float) (speed * Math.cos(dir));
        y = y - (float) (speed * Math.sin(dir));
    }

    public void paint(Graphics g) {
        g.setColor(r);
        g.fillOval((int) x, (int) y, dia, dia);
    }

}
