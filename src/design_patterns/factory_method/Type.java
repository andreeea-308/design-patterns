package design_patterns.factory_method;

public enum Type {
    PERSONAL("personal"), ENTERPRISE("enterprise");
    String name;

    Type(String name) {
        this.name = name;
    }
}

