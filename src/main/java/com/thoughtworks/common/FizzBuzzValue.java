package com.thoughtworks.common;

public enum FizzBuzzValue {
    FIZZ("fizz"),
    BUZZ("buzz"),
    WHIZZ("whizz"),
    FIZZ_BUZZ("fizzbuzz"),
    FIZZ_WHIZZ("fizzwhizz"),
    BUZZ_WHIZZ("buzzwhizz"),
    FIZZ_BUZZ_WHIZZ("fizzbuzzwhizz");

    private String value;

    FizzBuzzValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
