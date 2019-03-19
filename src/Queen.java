public class Queen implements Pieces {
    private Color color;

    Queen(Color color) {
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
        return "Queen";
        //return super.toString();
    }
}
