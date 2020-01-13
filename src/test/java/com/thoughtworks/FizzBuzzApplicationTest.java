package com.thoughtworks;

import static com.thoughtworks.FizzBuzzApplication.fizzBuzz;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzApplicationTest {

    @Test
    public void should_return_ordinal_string_when_digit_is_1() {
        String result = fizzBuzz(1);
        assertEquals("1", result);
    }

    @Test
    public void should_return_fizz_when_digit_can_be_divided_evenly_by_3() {
        String result = fizzBuzz(3);
        assertEquals("fizz", result);
    }

    @Test
    public void should_return_buzz_when_digit_can_be_divided_evenly_by_5() {
        String result = fizzBuzz(5);
        assertEquals("buzz", result);
    }

    @Test
    public void should_return_whizz_when_digit_can_be_divided_evenly_by_7() {
        String result = fizzBuzz(7);
        assertEquals("whizz", result);
    }
}