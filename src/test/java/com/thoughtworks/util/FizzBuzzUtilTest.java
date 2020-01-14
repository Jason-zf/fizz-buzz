package com.thoughtworks.util;

import static com.thoughtworks.util.FizzBuzzUtil.contains;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FizzBuzzUtilTest {

    @Test
    public void should_return_true_when_input_35_and_3() {
        assertTrue(contains(35, 3));
    }
}