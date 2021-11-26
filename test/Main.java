package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Main extends JPanel {

    static int width = 800;
    static int height = 800;

    private static int numberOfBalls = 500;

    static ArrayList<Ball> balls = new ArrayList<Ball>(numberOfBalls);
    public Main() {
        setVisible(true);
    }

    public static void main(String[] args) throws InterruptedException{
        JFrame f = new JFrame("Hello");
        f.setSize(width, height);
        Main obj = new Main();
        obj.addMouseListener(new MyListener(obj));
        f.add(obj);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i=0; i < numberOfBalls; i++){
            Ball b = new Ball(obj);
            balls.add(b);
        }
        while (true){
            obj.repaint();
            Thread.sleep(10);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        for(Ball b:balls)
            b.paint(g);

        g.setColor(Color.GREEN);
        g.fillOval(MyListener.x, MyListener.y, 10, 10);
        update();
    }

    public void update(){
        for(Ball b:balls)
            b.move(400, 400);
    }



}
