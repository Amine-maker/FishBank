import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class BounceyDot {

    public static void main(String[] args) {
        new BounceyDot();
    }

    public BounceyDot() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                        | UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {

        private int x = 150;
        private int y = 150;
        private int radius = 10;
        private FishBank fishs;
        // private double randomDirectionX, randomDirectionY;
        private double xDelta = 0.5;
        private int yDelta = (int) Math.floor(Math.random() * (20 - 1 + 1) + 1);
        private boolean initDirection = true;

        public TestPane() {

            fishs = new FishBank(100);

            Timer timer = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    repaint();
                }
            });
            timer.start();
        }

        /*
         * public boolean isCollision() { System.out.println(y + (radius * 2) >
         * (getWidth() - 100) );
         * 
         * boolean collised = false;
         * 
         * if(y + (radius * 2) >= (getWidth() - 100)){ initDirection = false; // yDelta
         * = (int)Math.floor(Math.random()*(20-1+1)+1); //yDelta = 1 * Math.random(); y
         * -= yDelta; } if(x + (radius * 2) >= (getWidth() - 100)){ initDirection =
         * false; xDelta = (int)Math.floor(Math.random()*(20-1+1)+1); x -= xDelta; }
         * 
         * return collised; };
         */
        public boolean isCollisionX(int x) {

            boolean collised = false;

            if (x + (radius * 2) >= (getWidth()) || x + (radius * 2) <= 0) {
                collised = true;
            }

            return collised;
        };

        public boolean isCollisionY(int y) {

            boolean collised = false;
            System.out.println(collised);

            if (y + (radius * 2) >= (getWidth()) || y + (radius * 2) <= 0) {
                collised = true;
            }

            return collised;
        };

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(600, 600);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);

            // Iterator<Fish2> iter = fishs.getFish();
            // while (iter.hasNext()) {
            // generatePoint(g, iter.next());
            // }
        }

        protected void generatePoint(Graphics g, Fish2 fish) {

            double randomDirectionX = Math.random();
            double randomDirectionY = Math.random();

            int xFish = fish.getX();
            int yFish = fish.getY();

            if (randomDirectionX < 0.5) {
                randomDirectionX = 5.0;
            } else {
                randomDirectionX = -5.0;
            }

            if (randomDirectionY < 0.5) {
                randomDirectionY = 5.0;
            } else {
                randomDirectionY = -5.0;
            }

            if (isCollisionX(x))
                randomDirectionX *= -1;
            if (isCollisionY(y))
                randomDirectionY *= -1;

            xFish += (int) randomDirectionX * (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
            fish.setX(xFish);
            yFish += (int) randomDirectionY * (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
            fish.setY(yFish);

            g.fillOval(xFish, yFish, radius, radius);

        }

    }

}