package com.thoughtworks.common;

public enum FizzBuzzValue {
    FIZZ("fizz"),
    BUZZ("buzz"),
    WHIZZ("whizz");

    private String value;

    FizzBuzzValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
