package com.thoughtworks.common;

public enum FizzBuzzValue {
    FIZZ("Fizz"),
    BUZZ("Buzz"),
    WHIZZ("Whizz"),
    FIZZ_BUZZ("FizzBuzz"),
    FIZZ_WHIZZ("FizzWhizz"),
    BUZZ_WHIZZ("BuzzWhizz"),
    FIZZ_BUZZ_WHIZZ("FizzBuzzWhizz");

    private String value;

    FizzBuzzValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
