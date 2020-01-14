package com.thoughtworks;

import static com.thoughtworks.FizzBuzzApplication.fizzBuzz;
import static com.thoughtworks.common.FizzBuzzValue.BUZZ;
import static com.thoughtworks.common.FizzBuzzValue.BUZZ_WHIZZ;
import static com.thoughtworks.common.FizzBuzzValue.FIZZ;
import static com.thoughtworks.common.FizzBuzzValue.FIZZ_BUZZ;
import static com.thoughtworks.common.FizzBuzzValue.FIZZ_BUZZ_WHIZZ;
import static com.thoughtworks.common.FizzBuzzValue.WHIZZ;
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
        assertEquals(FIZZ.getValue(), result);
    }

    @Test
    public void should_return_buzz_when_digit_can_be_divided_evenly_by_5() {
        String result = fizzBuzz(5);
        assertEquals(BUZZ.getValue(), result);
    }

    @Test
    public void should_return_whizz_when_digit_can_be_divided_evenly_by_7() {
        String result = fizzBuzz(7);
        assertEquals(WHIZZ.getValue(), result);
    }

    @Test
    public void should_return_fizzbuzz_when_digit_can_be_divided_evenly_by_both_3_and_5() {
        String result = fizzBuzz(60);
        assertEquals(FIZZ_BUZZ.getValue(), result);
    }

    @Test
    public void should_return_fizzBuzzWhizz_when_digit_can_be_divided_by_3_and_5_and_7() {
        String result = fizzBuzz(210);
        assertEquals(FIZZ_BUZZ_WHIZZ.getValue(), result);
    }

    @Test
    public void should_return_fizz_when_digit_contains_3_not_5() {
        String result = fizzBuzz(13);
        assertEquals(FIZZ.getValue(), result);
    }

    @Test
    public void should_return_fizz_when_digit_contains_3_not_5_and_can_be_divided_evenly_by_5() {
        String result = fizzBuzz(30);
        assertEquals(FIZZ.getValue(), result);
    }

    @Test
    public void should_return_fizz_when_digit_contains_3_not_5_and_can_be_divided_evenly_by_multi_divider() {
        String result = fizzBuzz(630);
        assertEquals(FIZZ.getValue(), result);
    }

    @Test
    public void should_return_buzz_when_digit_contains_5_not_7() {
        String result = fizzBuzz(15);
        assertEquals(BUZZ.getValue(), result);
    }

    @Test
    public void should_return_buzz_when_digit_contains_5_not_7_and_can_be_divided_by_5_and_7() {
        String result = fizzBuzz(35);
        assertEquals(BUZZ_WHIZZ.getValue(), result);
    }

    @Test
    public void should_return_fizz_when_digit_contains_7_and_5() {
        String result = fizzBuzz(75);
        assertEquals(FIZZ.getValue(), result);
    }

    @Test
    public void should_return_fizz_when_digit_contains_7_and_5_and_3() {
        String result = fizzBuzz(357);
        assertEquals(FIZZ.getValue(), result);
    }
}