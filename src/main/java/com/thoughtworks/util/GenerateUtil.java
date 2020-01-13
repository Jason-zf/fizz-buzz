package com.thoughtworks.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import org.apache.commons.lang3.StringUtils;

public class GenerateUtil {

    private static Integer START = 0;
    private static String CONTAIN_CHAR;
    private static String NON_CONTAIN_CHAR;
    private static List<Integer> DIVIDERS;

    public static Integer generate(String containChar, String nonContainChar, Integer... dividers) {
        CONTAIN_CHAR = containChar;
        NON_CONTAIN_CHAR = nonContainChar;
        DIVIDERS = Arrays.asList(dividers);
        return generate();
    }

    public static Integer generate(int next, String containChar, String nonContainChar, Integer... dividers) {
        CONTAIN_CHAR = containChar;
        NON_CONTAIN_CHAR = nonContainChar;
        DIVIDERS = Arrays.asList(dividers);
        IntStream.range(0, next - 1).forEach(i -> generate());
        return generate();
    }

    private static Integer generate() {
        for (Integer i = START + 1; i < Integer.MAX_VALUE; i++) {
            Integer finalI = i;
            if (DIVIDERS.stream().allMatch(divider -> finalI % divider == 0)
                && i.toString().contains(CONTAIN_CHAR) && StringUtils.containsNone(i.toString(), NON_CONTAIN_CHAR)) {
                START = i;
                return i;
            }
        }
        return null;
    }
}
