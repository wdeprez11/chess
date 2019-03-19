public enum Team {
    BLACK("B"), WHITE("W");

    private String value;

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    Team(String value) {
        this.value = value;
    }
}
