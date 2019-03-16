import javax.swing.*;
import java.awt.*;

public class Driver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI gui = new GUI();
        frame.add(gui);
        frame.setSize(800, 600);
        frame.setVisible(true);
        //

    }
}
