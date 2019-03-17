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
        System.out.println(game.printBoard()); // print board
        game.incrementTurn(); // increment turn
        System.out.println(game.printBoard()); // print board
        //Scanner scanner = new Scanner(System.in);

        /*
        boolean gameCont = true;
        while (gameCont) {
            System.out.println(game.printBoard()); // print board
            StringBuilder stringBuilder = new StringBuilder();
            for(String str : game.getMovablePieces()) {
                int i = 0;
                stringBuilder.append(str + "\t");
                if(i % 6 == 0) {
                    stringBuilder.append("\n");
                }
            }
            System.out.println(stringBuilder.toString());
            stringBuilder.setLength(0); // can use 'new StringBuilder()' later once I've calculated the size of the board.
            int in = scanner.nextInt(); // read input for the piece
            // call method from 'game' that can list spaces that 'in' can move to
            // print that method
            in = scanner.nextInt(); // read input for the move
            // call method from 'game' to move that piece
            game.incrementTurn(); // increment turn
            // check win condition (Checkmate or Stalemate) and set 'gameCont' to false
        }
        */
    }
}
