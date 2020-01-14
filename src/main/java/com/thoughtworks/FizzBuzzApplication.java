package com.thoughtworks;

import static com.thoughtworks.common.FizzBuzzValue.BUZZ;
import static com.thoughtworks.common.FizzBuzzValue.FIZZ;
import static com.thoughtworks.common.FizzBuzzValue.WHIZZ;

import com.thoughtworks.util.FizzBuzzUtil;
import org.apache.commons.lang3.StringUtils;

public class FizzBuzzApplication {

    private static final Integer THREE = 3;
    private static final Integer SEVEN = 7;

    public static void main(String[] args) {
        for (int i = 0; i < 120; i++) {
            String result = fizzBuzz(i + 1);
            System.out.println(result);
        }
    }

    static String fizzBuzz(Integer digit) {
        String res = StringUtils.EMPTY;
        if (FizzBuzzUtil.contains(digit, THREE) && (StringUtils.containsNone(digit.toString(), "5") || FizzBuzzUtil.contains(digit, SEVEN))) {
            return FIZZ.getValue();
        }
        if (digit % 3 == 0 && (StringUtils.containsNone(digit.toString(), "5") || FizzBuzzUtil.contains(digit, SEVEN))) {
            res = StringUtils.join(res, FIZZ.getValue());
        }
        if (digit % 5 == 0 && StringUtils.containsNone(digit.toString(), "7")) {
            res = StringUtils.join(res, BUZZ.getValue());
        }
        if (digit % 7 == 0) {
            res = StringUtils.join(res, WHIZZ.getValue());
        }
        return StringUtils.isNotEmpty(res) ? res : digit.toString();
    }
}
