
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main extends JPanel {

    static int width = 1200;
    static int height = 1200;

    private static int numberOfFish = 200;
    public boolean inverse = false;

    static FishBank fish = new FishBank(numberOfFish);

    public Main() {
        setVisible(true);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        JFrame f = new JFrame("Fish Bank");
        f.setSize(width, height);
        Main obj = new Main();
        f.add(obj);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(5, 65, 90));

        for (int i = 0; i < numberOfFish; i++) {
            Fish fi = new Fish(obj, i, numberOfFish);
            fish.getFish().add(fi);
        }
        while (true) {

            obj.repaint();
            Thread.sleep(10);
        }

    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Fish f : fish.getFish()) {
            try {
                f.paint(g);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        update();
    }

    public void update() {
        for (Fish f : fish.getFish())
            f.move(600, 600);
    }

    public boolean getInverse() {
        return this.inverse;
    }

    public void setInverse() {
        this.inverse = !inverse;
    }

}
