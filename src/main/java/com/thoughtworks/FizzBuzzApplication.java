package com.thoughtworks;

public class FizzBuzzApplication {

    public static void main(String[] args) {
        for (int i = 0; i < 120; i++) {
            String result = fizzBuzz(i + 1);
            System.out.println(result);
        }
    }

    static String fizzBuzz(Integer digit) {
        if (digit % 3 == 0) {
            return "fizz";
        }
        if (digit % 5 == 0) {
            return "buzz";
        }
        return digit.toString();
    }
}
