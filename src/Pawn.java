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

    @Override
    public String toString() {
        return "Pawn";
        //return super.toString();
    }
}
