public class Game {
    private Piece[][] board;
    private Piece.Color nextTurn;

    public Game() {
        board = new Piece[8][8];
        nextTurn = Piece.Color.WHITE;
        initPieces();
    }

    public void incrementTurn() {
        if (nextTurn.equals(Piece.Color.WHITE)) {
            this.nextTurn = Piece.Color.BLACK;
        } else {
            this.nextTurn = Piece.Color.WHITE;
        }
    }

    public Piece[][] getBoard() {
        return board;
    }

    public String getNextTurn() {
        return nextTurn.toString();
    }

    public void initPieces() {
        {
            board[0][0] = new Piece(Piece.Type.ROOK, Piece.Color.WHITE);
            board[0][1] = new Piece(Piece.Type.KNIGHT, Piece.Color.WHITE);
            board[0][2] = new Piece(Piece.Type.BISHOP, Piece.Color.WHITE);
            board[0][3] = new Piece(Piece.Type.QUEEN, Piece.Color.WHITE);
            board[0][4] = new Piece(Piece.Type.KING, Piece.Color.WHITE);
            board[0][5] = new Piece(Piece.Type.BISHOP, Piece.Color.WHITE);
            board[0][6] = new Piece(Piece.Type.KNIGHT, Piece.Color.WHITE);
            board[0][7] = new Piece(Piece.Type.ROOK, Piece.Color.WHITE);
        }
        {
            board[7][0] = new Piece(Piece.Type.ROOK, Piece.Color.BLACK);
            board[7][1] = new Piece(Piece.Type.KNIGHT, Piece.Color.BLACK);
            board[7][2] = new Piece(Piece.Type.BISHOP, Piece.Color.BLACK);
            board[7][3] = new Piece(Piece.Type.QUEEN, Piece.Color.BLACK);
            board[7][4] = new Piece(Piece.Type.KING, Piece.Color.BLACK);
            board[7][5] = new Piece(Piece.Type.BISHOP, Piece.Color.BLACK);
            board[7][6] = new Piece(Piece.Type.KNIGHT, Piece.Color.BLACK);
            board[7][7] = new Piece(Piece.Type.ROOK, Piece.Color.BLACK);
        }
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Piece(Piece.Type.PAWN, Piece.Color.WHITE);
            board[6][i] = new Piece(Piece.Type.PAWN, Piece.Color.BLACK);
        }
    }

    public void startGame() {

    }

    public String printBoard(Game game) {
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
