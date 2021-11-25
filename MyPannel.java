import javax.swing.*;
import java.awt.*;

public class MyPannel extends JPanel{

    MyPannel(){

    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        g.setColor (Color.black);
        g.drawOval (5, 15, 50, 75);
    }
}
