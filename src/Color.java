public enum Color {
    BLACK("B"), WHITE("W");

    private String value;

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    Color(String value) {
        this.value = value;
    }
}
