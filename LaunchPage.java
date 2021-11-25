
import javax.swing.JFrame;

public class LaunchPage extends JFrame {
    JFrame frame = new JFrame();

    MyPannel panel;

    public LaunchPage() {

        panel = new MyPannel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setSize(700, 700);
        frame.setVisible(true);
    }

}
