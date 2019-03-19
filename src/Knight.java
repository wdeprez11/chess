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

    @Override
    public String toString() {
        return "Knight";
        //return super.toString();
    }
}
