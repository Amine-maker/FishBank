
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Fish {
    float x;
    float y;
    Color r;
    int dia = 10;
    float speed = 4.0f;
    Main m;
    File file;
    String path = "C:\\Users\\amine\\Downloads\\fish-removebg-preview.jpg";
    BufferedImage img;

    public Fish(Main m, int i, int length) throws IOException {
        this.m = m;
        Random r = new Random();
        x = r.nextInt(600 - dia);
        y = r.nextInt(600 - dia);

        this.r = Color.RED;
        file = new File(path);
        img = ImageIO.read(file);
        img = scale(img, 20, 20);

    }

    public void move(int desX, int desY) {
        float dx = desX - x;
        float dy = desY - y;
        if (dx == 0 && dy == 0)
            return;
        float dir = (float) Math.atan2(dx, dy);

        if (m.getInverse()) {
            x = x - (float) (speed * Math.cos(dir) - 1);
            y = y + (float) (speed * Math.sin(dir) - 1);
        } else {
            x = x + (float) (speed * Math.cos(dir) - 1);
            y = y - (float) (speed * Math.sin(dir) - 1);
        }

    }

    public void paint(Graphics g) throws IOException {

        // BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        g.drawImage(img, (int) x, (int) y, null);
        // g.fillOval((int)x , (int)y , dia, dia);

    }

    public static BufferedImage scale(BufferedImage src, int w, int h) {
        BufferedImage img = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
        int x, y;
        int ww = src.getWidth();
        int hh = src.getHeight();
        int[] ys = new int[h];
        for (y = 0; y < h; y++)
            ys[y] = y * hh / h;
        for (x = 0; x < w; x++) {
            int newX = x * ww / w;
            for (y = 0; y < h; y++) {
                int col = src.getRGB(newX, ys[y]);
                img.setRGB(x, y, col);
            }
        }
        return img;
    }

}
