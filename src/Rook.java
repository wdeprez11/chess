public class Rook implements Pieces {
    private Color color;

    Rook(Color color) {
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
        return "Rook";
        //return super.toString();
    }
}
