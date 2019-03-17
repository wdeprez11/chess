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
        System.out.println(game.printBoard(game));
    }

    private String printBoard(Game game) {
        Piece[][] board = game.getBoard();
        String s = "";
        s += ("\n\t" + game.getNextTurn() + "\'S TURN\n\n");
        for (int i = 7, k = 1; i >= 0; i--, k++) {
            s += (i + 1 + ".\t");
            for (int j = 0; j < 8; j++) {
                s += ((board[i][j] == null ? "--" : board[i][j]) + " ");
            }
            s += "\n";
        }
        s += ("\n" + "    ");
        for (char c = 'A'; c < ((char) (((int) 'A') + 8)); c++) {
            s += (c + ". ");
        }
        s += "\n";
        return s;
    }
}
