public class Piece {
    enum Color {
        BLACK("B"), WHITE("W");

        private String value;

        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return super.toString();
        }

        Color(String value) {
            this.value = value;
        }
    }

    enum Type {
        KING("K"), QUEEN("Q"), ROOK("R"), BISHOP("B"), KNIGHT("H"), PAWN("P");

        private String value;

        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return super.toString();
        }

        Type(String value) {
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

    Piece(Type type, Color color) {
        this.type = type;
        this.color = color;
    }

    public void movePiece() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Piece temp = (Piece) o;
        return (this.type == temp.type && this.color == temp.color);
    }

    @Override
    public String toString() {
        //     return "Piece{" + "type=" + type + ", color=" + color + '}';
        return color.getValue() + type.getValue();
    }
}
