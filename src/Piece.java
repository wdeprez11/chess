public class Piece {
    enum Color {
        BLACK("B"), WHITE("W");

        private String value;

        public String getValue() {
            return this.value;
        }

        private Color(String value) {
            this.value = value;
        }
    }

    enum Type {
        KING("K"), QUEEN("Q"), ROOK("R"), BISHOP("B"), KNIGHT("H"), PAWN("P");

        private String value;

        public String getValue() {
            return this.value;
        }

        private Type(String value) {
            this.value = value;
        }
    }

    private Type type;

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    private Color color;

    public Piece(Type type, Color color) {
        this.type = type;
        this.color = color;
    }

    public void movePiece() {

    }

    @Override
    public String toString() {
        //     return "Piece{" + "type=" + type + ", color=" + color + '}';
        return color.getValue() + type.getValue();
    }
}
