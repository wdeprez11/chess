class Game {
    //private Piece[][] board;
    private Pieces[][] board;
    private boolean turn;
    //private Piece selectedPiece;
    private Pieces selectedPiece;
    private int[] selectedAddress;
    private int[][] selectedPossibleMoves;
    private int stalemateCount;

    /**
     * Initialize game object
     */
    Game() {
        board = new Pieces[8][8];
        selectedAddress = new int[2];
        turn = true;
        stalemateCount = 0;
        initPieces();
    }

    /**
     * If turn attribute is true, then the current turn is WHITE,
     * If turn attribute is false, then the current turn is BLACK
     */
    void incrementTurn() {
        turn = !turn;
    }

    public String getNextTurn() {
        return (turn ? Piece.Color.WHITE : Piece.Color.BLACK).toString();
    }

    /**
     * Initializes board pieces into traditional positions
     */
    private void initPieces() {
        {
            board[0][0] = new Rook(Team.WHITE);
            board[0][1] = new Knight(Team.WHITE);
            board[0][2] = new Bishop(Team.WHITE);
            board[0][3] = new Queen(Team.WHITE);
            board[0][4] = new King(Team.WHITE);
            board[0][5] = new Bishop(Team.WHITE);
            board[0][6] = new Knight(Team.WHITE);
            board[0][7] = new Rook(Team.WHITE);
        }
        {
            board[7][0] = new Rook(Team.BLACK);
            board[7][1] = new Knight(Team.BLACK);
            board[7][2] = new Bishop(Team.BLACK);
            board[7][3] = new Queen(Team.BLACK);
            board[7][4] = new King(Team.BLACK);
            board[7][5] = new Bishop(Team.BLACK);
            board[7][6] = new Knight(Team.BLACK);
            board[7][7] = new Rook(Team.BLACK);
        }
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(Team.WHITE);
            board[6][i] = new Pawn(Team.BLACK);
        }
    }

    /**
     * Restarts game by nulling board and reinitializing piece positions
     */
    void restartGame() {
        for (int i = 2; i < 5; i++) {
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
        StringBuilder stringBuilder = new StringBuilder();
        appendPieces(stringBuilder);
        appendFileLettering(stringBuilder);
        return stringBuilder.toString();
    }

    /**
     * Converts input to board address(array address), then copies old address to new space and sets old address to null
     *
     * @param str string passed over to inputToBoardAddress(String str)
     */
    void movePiece(String str) {
        int[] newAddress = inputToBoardAddress(str);
        board[newAddress[0]][newAddress[1]] = board[selectedAddress[0]][selectedAddress[1]].clone();
        board[selectedAddress[0]][selectedAddress[1]] = null;
    }

    /**
     * @param selectedAddress
     * @return
     */
    private int[][] populatePossibleMoves(int[] selectedAddress) {
        // int[][] possibleMoves = new int[26][2];
        // for(int i = 0; i < selectedPiece.getMoves().length; i++) {
        //    possibleMoves[i] = new int[] {0, 0};
        // }
        // ArrayList<ArrayList<Integer>> possibleMoves = new ArrayList();
        // king has max of 8 moves,
        // knight has max of 8 moves,
        // pawn has maximum of 4 moves,
        // bishop has maximum of 13 moves
        // rook has maximum of 14 moves,
        // queen has maximum of 26 moves,
        // return possibleMoves.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new); // Lambda, need to research
        return new int[][]{{0}, {0}};
    }

    private boolean isValidMove(int[] whereToMove) {
        return false;
    }

    /**
     * Converts input to board address(array address), then sets global variable to that selected address and
     * sets selectedPiece to the memory of that address in the board array
     *
     * @param str string passed over to inputToBoardAddress(String str)
     */
    void selectPiece(String str) {
        selectedAddress = inputToBoardAddress(str);
        selectedPossibleMoves = populatePossibleMoves(selectedAddress);
        selectedPiece = board[selectedAddress[0]][selectedAddress[1]];
    }

    /**
     * @param userInput user input, passed through scanner
     * @return returns array holding board address
     */
    private int[] inputToBoardAddress(String userInput) {
        int row = 0, column = 0;
        for (int i = 0; i < 8; i++) {
            if (userInput.contains(Integer.toString(i))) {
                row = i - 1;
                break;
            }
        }

        for (char c = 'A'; c <= 'H'; c++) {
            if (userInput.indexOf(c) != -1) {
                column = c - 'A';
                break;
            }
        }
        return new int[]{row, column};
    }

    /**
     * if selectedPiece is your team and amount of moves for selectedPiece is greater than 0 then return true, otherwise false
     *
     * @return returns piece's move status
     */
    boolean canSelectedMove() {
        return (turn ? selectedPiece.getTeam().equals(Team.WHITE) : selectedPiece.getTeam().equals(Team.BLACK) && selectedPiece.getMoves().length > 0);
    }

    /**
     * @return returns selectedPiece class attribute
     */
    String getSelectedPiece() {
        try {
            return selectedPiece.toString();
        } catch (NullPointerException e) {
            return e.toString();
        }
    }

    /**
     * Appends rank numbers and the pieces / empty spaces to input StringBuilder object
     *
     * @param stringBuilder pass StringBuilder object to avoid redundancy and recreation
     */
    private void appendPieces(StringBuilder stringBuilder) {
        stringBuilder.append("\n\t" + getNextTurn() + "\'S TURN\n\n");
        if (turn) {
            for (int i = 7, k = 1; i >= 0; i--, k++) {
                stringBuilder.append(i + 1 + ".\t");
                for (int j = 0; j < 8; j++) {
                    stringBuilder.append((board[i][j] == null ? "--" : new String(new char[]{board[i][j].firstCharColor(), board[i][j].firstCharType()})) + " ");
                }
                stringBuilder.append("\n");
            }
        } else {
            for (int i = 0; i < 8; i++) {
                stringBuilder.append(i + 1 + ".\t");
                for (int j = 0; j < 8; j++) {
                    stringBuilder.append((board[i][j] == null ? "--" : new String(new char[]{board[i][j].firstCharColor(), board[i][j].firstCharType()})) + " ");
                }
                stringBuilder.append("\n");
            }
        }
    }

    /**
     * Appends lettering for files to the end of the StringBuilder object passed
     *
     * @param stringBuilder pass StringBuilder object to avoid redundancy and recreation
     */
    private void appendFileLettering(StringBuilder stringBuilder) {
        if (turn) {
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

    /**
     * Returns status of game, is stalemate, checkmate, or draw
     * Stalemate = King is last piece and cannot move into any piece without losing the piece
     * Draw = 15 moves where no piece has been taken and no pawn has been moved
     * Checkmate = King cannot move because he is trapped by enemy pieces
     *
     * @return returns status of game
     */
    boolean getStatus() {
        return false;
    }
}
