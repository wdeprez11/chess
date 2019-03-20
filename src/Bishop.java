public class Bishop implements Pieces {
    private Team team;

    Bishop(Team team) {
        this.team = team;
    }

    @Override
    public int[] getMoves() {
        /*
        rank + n && file + n,
        rank + n && file - n,
        rank - n && file + n,
        rank - n && file - n,

        Captures on finishing position

        Cannot move in which it would jeopardize the king
         */

        return new int[] {0};
    }

    public Team getTeam() {
        return team;
    }

    public char firstCharColor() {
        return getTeam().toString().charAt(0);
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
    public Pieces clone() {
        return this;
    }
}
