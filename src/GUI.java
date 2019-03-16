import java.awt.*;
import javax.swing.*;
import java.util.*;
public class GUI extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(Color.WHITE);

        drawBoard(g);
    }
    private void drawBoard(Graphics g) {
        for(int i = 0, x = 0, y = 0; i < 10; i++, y+=40) {
            for(int j = 0; j < 10; j++, x+=40) {
                if(i%2==0) {
                    if (j % 2 == 0) {
                        g.setColor(Color.BLACK);
                    } else {
                        g.setColor(Color.GRAY);
                    }
                } else {
                    if (j % 2 == 1) {
                        g.setColor(Color.BLACK);
                    } else {
                        g.setColor(Color.GRAY);
                    }

                }
                g.fillRect(x, y, 40, 40);
            }
            x = 0;
        }
    }
}
