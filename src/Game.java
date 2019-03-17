public class Game {
    private Piece[][] board;
    private Piece.Color nextTurn;
    private boolean turn;

    Game() {
        board = new Piece[8][8];
        nextTurn = Piece.Color.WHITE;
        initPieces();
    }

    void incrementTurn() {
        if (nextTurn.equals(Piece.Color.WHITE)) {
            this.nextTurn = Piece.Color.BLACK;
            turn = true;
        } else {
            this.nextTurn = Piece.Color.WHITE;
            turn = false;
        }
    }

    public Piece[][] getBoard() {
        return board;
    }

    private String getNextTurn() {
        return nextTurn.toString();
    }

    /**
     * Initializes board pieces into traditional positions
     */
    private void initPieces() {
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

    /**
     * Restarts game by nulling board and reinitializing piece positions
     */
    public void restartGame() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = null;
            }
        }
        initPieces();
    }

    /**
     * Returns a string of the board dependent on the current turn (calls getWhiteBoard() or getBlackBoard())
     *
     * @return returns string of board for cli-use
     */
    String print() {
        return (nextTurn.equals(Piece.Color.WHITE) ? getWhiteBoard() : getBlackBoard()).toString();
    }

    private StringBuilder getWhiteBoard() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t" + getNextTurn() + "\'S TURN\n\n");

        appendPieces(stringBuilder);

        appendFileLettering(stringBuilder);

        return stringBuilder;
    }

    private StringBuilder getBlackBoard() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t" + getNextTurn() + "\'S TURN\n\n");

        appendPieces(stringBuilder);

        appendFileLettering(stringBuilder);

        return stringBuilder;
    }

    private void appendPieces(StringBuilder stringBuilder) {
        if (stringBuilder.indexOf("WHITE") != -1) {
            for (int i = 7, k = 1; i >= 0; i--, k++) {
                stringBuilder.append(i + 1 + ".\t");
                for (int j = 0; j < 8; j++) {
                    stringBuilder.append((board[i][j] == null ? "--" : board[i][j]) + " ");
                }
                stringBuilder.append("\n");
            }
        } else {
            for (int i = 0; i < 8; i++) {
                stringBuilder.append(i + 1 + ".\t");
                for (int j = 0; j < 8; j++) {
                    stringBuilder.append((board[i][j] == null ? "--" : board[i][j]) + " ");
                }
                stringBuilder.append("\n");
            }
        }
    }

    private void appendFileLettering(StringBuilder stringBuilder) {
        if (stringBuilder.indexOf("WHITE") != -1) {
            stringBuilder.append("\n" + "\t");
            for (char c = 'A'; c < ((char) (((int) 'A') + 8)); c++) {
                stringBuilder.append(c + ". ");
            }
            stringBuilder.append("\n");
        } else {
            stringBuilder.append("\n" + "\t");
            for (char c = 'H'; c > ((char) (((int) 'H') - 8)); c--) {
                stringBuilder.append(c + ". ");
            }
            stringBuilder.append("\n");
        }
    }

    public String[] getMovablePieces() {
        if (nextTurn.equals(Piece.Color.WHITE)) {
            return new String[]{"Hello", "World"};
        } else {
            return new String[]{"Hello", "World"};
        }
    }

}
