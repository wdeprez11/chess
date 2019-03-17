import java.awt.*;
import javax.swing.*;
import java.util.*;

public class GUI extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
        Color background = new Color(224, 224, 224);
        this.setBackground(background);

        drawBoard(g);
        drawPieces(g);
    }

    private void drawBoard(Graphics g) {
        //#fdd9b5
        Color color1 = new Color(240, 217, 181);
        Color color2 = new Color(181, 136, 99);
        Color border = new Color(37, 41, 28);

        int spaceSize = 40;
        int boardSize = (8 * spaceSize) + (2 * (int) (0.25 * 40));
        int offset = 30;
        g.setColor(border);
        g.fillRect(spaceSize / 2, spaceSize / 2, boardSize, boardSize);
        for (int i = 0, x = offset, y = offset; i < 8; i++, y += spaceSize) {
            for (int j = 0; j < 8; j++, x += 40) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        g.setColor(color1);
                    } else {
                        g.setColor(color2);
                    }
                } else {
                    if (j % 2 == 1) {
                        g.setColor(color1);
                    } else {
                        g.setColor(color2);
                    }

                }
                g.fillRect(x, y, spaceSize, spaceSize);
            }
            x = 30;
        }
    }

    private void drawPieces(Graphics g) {

    }
}
