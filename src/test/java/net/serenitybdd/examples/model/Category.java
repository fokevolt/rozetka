package net.serenitybdd.examples.model;

public enum Category {
    Electronics("Смартфоны, ТВ и электроника");

    private String linkText;

    Category(String linkText) {
        this.linkText = linkText;
    }

    public String linkText() {
        return linkText;
    }
}
