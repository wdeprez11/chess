public class Bishop implements Pieces {
    private Color color;

    Bishop(Color color) {
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
        return "Bishop";
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
