public class Knight implements Pieces {
    private Color color;

    Knight(Color color) {
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
        return 'H';
    }

    @Override
    public String toString() {
        return "Knight";
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
