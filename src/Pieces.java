public interface Pieces {

    void getMoves();

    Team getTeam();

    String toString();

    char firstCharColor();

    char firstCharType();

    Pieces clone();
}
