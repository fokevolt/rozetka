package net.serenitybdd.examples.model;

public enum Subcategory {
    Smartphones("Смартфоны");

    private String linkText;

    Subcategory(String linkText) {
        this.linkText = linkText;
    }

    public String linkText() {
        return linkText;
    }
}
