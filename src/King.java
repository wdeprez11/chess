public class King implements Pieces {
    private Color color;

    King(Color color) {
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
        return "King";
        //return super.toString();
    }
}
