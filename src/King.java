public class King implements Pieces {
    private Team team;

    King(Team team) {
        this.team = team;
    }

    @Override
    public int[] getMoves() {
        /*
        Operations
        rank + 1 && file + 1,
        rank + 1,
        rank + 1 && file - 1,
        file + 1,
        file - 1,
        rank - 1 && file + 1,
        rank - 1,
        rank - 1 && file - 1,

        Cannot move onto space that allows enemy piece to capture him
        Can capture any direction he moves
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
        return "King";
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
