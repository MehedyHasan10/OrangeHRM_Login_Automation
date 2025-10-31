package constants;

import lombok.Getter;

public enum Languages {
    SPANISH("es");

    @Getter
    private final String value;
    
    Languages(String value) {
        this.value = value;
    }
}
