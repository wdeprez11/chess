public class Queen implements Pieces {
    private Team team;

    Queen(Team team) {
        this.team = team;
    }

    @Override
    public int[] getMoves() {

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
        return "Queen";
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
