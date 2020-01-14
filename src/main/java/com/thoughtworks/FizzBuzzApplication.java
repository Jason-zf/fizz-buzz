package com.thoughtworks;

import static com.thoughtworks.common.FizzBuzzValue.BUZZ;
import static com.thoughtworks.common.FizzBuzzValue.FIZZ;
import static com.thoughtworks.common.FizzBuzzValue.WHIZZ;

import com.thoughtworks.util.FizzBuzzUtil;
import org.apache.commons.lang3.StringUtils;

public class FizzBuzzApplication {

    private static final Integer THREE = 3;
    private static final Integer FIVE = 5;
    private static final Integer SEVEN = 7;

    public static void main(String[] args) {
        for (int i = 0; i < 120; i++) {
            String result = fizzBuzz(i + 1);
            System.out.println(result);
        }
    }

    static String fizzBuzz(Integer digit) {
        String res = StringUtils.EMPTY;
        boolean contains7OrContainsNone5 = FizzBuzzUtil.containsNone(digit, FIVE) || FizzBuzzUtil.contains(digit, SEVEN);
        if (FizzBuzzUtil.contains(digit, THREE) && contains7OrContainsNone5) {
            return FIZZ.getValue();
        }
        if (FizzBuzzUtil.divide(digit, THREE) && contains7OrContainsNone5) {
            res = StringUtils.join(res, FIZZ.getValue());
        }
        if (FizzBuzzUtil.divide(digit, FIVE) && FizzBuzzUtil.containsNone(digit, SEVEN)) {
            res = StringUtils.join(res, BUZZ.getValue());
        }
        if (FizzBuzzUtil.divide(digit, SEVEN)) {
            res = StringUtils.join(res, WHIZZ.getValue());
        }
        return StringUtils.isNotEmpty(res) ? res : digit.toString();
    }
}
