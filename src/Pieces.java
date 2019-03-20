public interface Pieces {

    int[] getMoves();

    Team getTeam();

    String toString();

    char firstCharColor();

    char firstCharType();

    Pieces clone();
}
