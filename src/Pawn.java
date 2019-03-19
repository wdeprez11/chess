public class Pawn implements Pieces {
    private Color color;

    Pawn(Color color) {
        this.color = color;
    }

    @Override
    public void movePiece() {

    }

    public Color getColor() {
        return color;
    }

    public char firstCharColor() {
        return getColor().toString().charAt(0);
    }

    public char firstCharType() {
        return toString().charAt(0);
    }

    @Override
    public String toString() {
        return "Pawn";
        //return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public Object clone() {
        return null;
    }
}
