import javax.swing.*;
import java.awt.*;

public class Driver {
    public static void main(String[] args) {
        /*
        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI gui = new GUI();
        frame.add(gui);
        frame.setSize(800, 480);
        frame.setVisible(true);
        */

        Game game = new Game();
        System.out.println();
        Piece[][] board = game.getBoard();
        for (int i = 7, k = 1; i >= 0; i--, k++) {
            System.out.print(i + 1 + ".  ");
            for (int j = 0; j < 8; j++) {
                System.out.print((board[i][j] == null ? "--" : board[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.print("\n" + "    ");
        for (char c = 'A'; c < ((char) (((int) 'A') + 8)); c++) {
            System.out.print(c + ". ");
        }
        System.out.println();

    }
}
