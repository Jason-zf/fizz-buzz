package com.thoughtworks;

import org.apache.commons.lang3.StringUtils;

public class FizzBuzzApplication {

    public static void main(String[] args) {
        for (int i = 0; i < 120; i++) {
            String result = fizzBuzz(i + 1);
            System.out.println(result);
        }
    }

    static String fizzBuzz(Integer digit) {
        String res = StringUtils.EMPTY;
        if (digit % 3 == 0) {
            res = StringUtils.join(res, "fizz");
        }
        if (digit % 5 == 0) {
            res = StringUtils.join(res, "buzz");
        }
        if (digit % 7 == 0) {
            res = StringUtils.join(res, "whizz");
        }
        return StringUtils.isNotEmpty(res) ? res : digit.toString();
    }
}
