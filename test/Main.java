package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends JPanel {

    static int width = 1200;
    static int height = 1200;

    private static int numberOfFish = 1000;
    public boolean inverse = false;

    static ArrayList<Fish> fish = new ArrayList<Fish>(numberOfFish);
    public Main() {
        setVisible(true);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        JFrame f = new JFrame("Fish Bank");
        f.setSize(width, height);
        Main obj = new Main();
        obj.addMouseListener(new MyListener(obj));
        f.add(obj);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(5, 65, 90));

        for(int i=0; i < numberOfFish; i++){
            Fish b = new Fish(obj, i, numberOfFish);
            fish.add(b);
        }
        while (true){
            obj.repaint();
            Thread.sleep(10);
        }
        
    }

    public void paint(Graphics g) {
        super.paint(g);
        for(Fish b:fish) {
            try {
                b.paint(g);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        g.setColor(Color.GREEN);
        g.fillOval(400, 400, 10, 10);
        update();
    }

    public void update(){
        for(Fish b:fish)
            b.move(600, 600);
    }

    public boolean getInverse(){
        return this.inverse;
    }

    public void setInverse(){
        this.inverse = !inverse;
    }


}
