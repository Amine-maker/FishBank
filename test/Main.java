
import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    static int width = 800;
    static int height = 800;

    private static int numberOfBalls = 600;

    static FishBank fishs = new FishBank(numberOfBalls);

    public Main() {
        setVisible(true);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame f = new JFrame("FishBank");
        f.setSize(width, height);
        Main obj = new Main();
        f.add(obj);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i = 0; i < numberOfBalls; i++) {
            Fish fish = new Fish(obj);
            fishs.getFish().add(fish);
        }
        while (true) {

            obj.repaint();
            obj.getPosition();
            Thread.sleep(10);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < fishs.getFish().size() - 1; i++) {
            Fish fish = fishs.getFish().get(i);
            fish.x = fishs.getFish().get(i + 1).x + 2;
            fish.y = fishs.getFish().get(i + 1).y - 2;
            fish.paint(g);
        }

        update();
    }

    public void update() {
        for (Fish f : fishs.getFish())
            f.move(width / 2, height / 2);
    }

    public void getPosition() {
        System.out.println("Poisson 1 : " + fishs.getFish().get(1).x);
        System.out.println("Poisson 2: " + fishs.getFish().get(2).x);
    }

}
