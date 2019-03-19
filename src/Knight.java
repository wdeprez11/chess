public class Knight implements Pieces {
    private Team team;

    Knight(Team team) {
        this.team = team;
    }

    @Override
    public void getMoves() {

    }

    public Team getTeam() {
        return team;
    }

    public char firstCharColor() {
        return getTeam().toString().charAt(0);
    }

    public char firstCharType() {
        return 'H';
    }

    @Override
    public String toString() {
        return "Knight";
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
