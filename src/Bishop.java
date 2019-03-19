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

    @Override
    public String toString() {
        return "Bishop";
        //return super.toString();
    }
}
