public class Game {
    private Piece[][] board;
    private String nextTurn;

    public Game() {
        board = new Piece[8][8];
        nextTurn = "white";
        initPieces();
    }

    public Piece[][] getBoard() {
        return board;
    }

    public String getNextTurn() {
        return nextTurn;
    }

    public void initPieces() {
        board[0][0] = new Piece(Piece.Type.ROOK, Piece.Color.WHITE);
        board[0][1] = new Piece(Piece.Type.KNIGHT, Piece.Color.WHITE);
        board[0][2] = new Piece(Piece.Type.BISHOP, Piece.Color.WHITE);
        board[0][3] = new Piece(Piece.Type.QUEEN, Piece.Color.WHITE);
        board[0][4] = new Piece(Piece.Type.KING, Piece.Color.WHITE);
        board[0][5] = new Piece(Piece.Type.BISHOP, Piece.Color.WHITE);
        board[0][6] = new Piece(Piece.Type.KNIGHT, Piece.Color.WHITE);
        board[0][7] = new Piece(Piece.Type.ROOK, Piece.Color.WHITE);
        board[7][0] = new Piece(Piece.Type.ROOK, Piece.Color.BLACK);
        board[7][1] = new Piece(Piece.Type.KNIGHT, Piece.Color.BLACK);
        board[7][2] = new Piece(Piece.Type.BISHOP, Piece.Color.BLACK);
        board[7][3] = new Piece(Piece.Type.QUEEN, Piece.Color.BLACK);
        board[7][4] = new Piece(Piece.Type.KING, Piece.Color.BLACK);
        board[7][5] = new Piece(Piece.Type.BISHOP, Piece.Color.BLACK);
        board[7][6] = new Piece(Piece.Type.KNIGHT, Piece.Color.BLACK);
        board[7][7] = new Piece(Piece.Type.ROOK, Piece.Color.BLACK);
        for(int i = 0; i < 8; i++) {
            board[1][i] = new Piece(Piece.Type.PAWN, Piece.Color.WHITE);
            board[6][i] = new Piece(Piece.Type.PAWN, Piece.Color.BLACK);
        }
    }

    public void startGame() {

    }

}
