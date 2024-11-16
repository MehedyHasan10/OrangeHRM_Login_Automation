package constants;

public enum Languages {
    SPANISH("es");

    private final String value;

    Languages(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
