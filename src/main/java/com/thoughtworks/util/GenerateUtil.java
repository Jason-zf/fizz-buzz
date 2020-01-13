package com.thoughtworks.util;

import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public class GenerateUtil {

    public static Integer generate(String containChar, String nonContainChar, Integer... dividers) {
        for (Integer i = 1; i < Integer.MAX_VALUE; i++) {
            Integer finalI = i;
            if (Arrays.stream(dividers).allMatch(divider -> finalI % divider == 0)
                && i.toString().contains(containChar) && StringUtils.containsNone(i.toString(), nonContainChar)) {
                return i;
            }
        }
        return null;
    }
}
