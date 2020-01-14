package com.thoughtworks.util;

import org.apache.commons.lang3.StringUtils;

public class FizzBuzzUtil {

    public static boolean contains(Integer digit, Integer searchDigit) {
        return StringUtils.contains(digit.toString(), searchDigit.toString());
    }
}