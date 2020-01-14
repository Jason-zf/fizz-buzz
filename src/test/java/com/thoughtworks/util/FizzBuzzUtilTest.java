package com.thoughtworks.util;

import static com.thoughtworks.util.FizzBuzzUtil.contains;
import static com.thoughtworks.util.FizzBuzzUtil.containsNone;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FizzBuzzUtilTest {

    @Test
    public void should_return_true_when_check_35_contains_3() {
        assertTrue(contains(35, 3));
    }

    @Test
    public void should_return_false_when_check_35_contains_6() {
        assertFalse(contains(35, 6));
    }

    @Test
    public void should_return_true_when_check_35_containsNone_6() {
        assertTrue(containsNone(35, 6));
    }

    @Test
    public void should_return_false_when_check_35_containsNone_3() {
        assertFalse(containsNone(35, 3));
    }
}