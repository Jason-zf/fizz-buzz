package com.thoughtworks;

import static com.thoughtworks.FizzBuzzApplication.fizzBuzz;
import static com.thoughtworks.common.FizzBuzzValue.BUZZ;
import static com.thoughtworks.common.FizzBuzzValue.BUZZ_WHIZZ;
import static com.thoughtworks.common.FizzBuzzValue.FIZZ;
import static com.thoughtworks.common.FizzBuzzValue.FIZZ_BUZZ;
import static com.thoughtworks.common.FizzBuzzValue.FIZZ_BUZZ_WHIZZ;
import static com.thoughtworks.common.FizzBuzzValue.WHIZZ;
import static org.junit.Assert.assertEquals;

import com.thoughtworks.util.GenerateUtil;
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
        String result = fizzBuzz(15);
        assertEquals(FIZZ_BUZZ.getValue(), result);
    }

    @Test
    public void should_return_fizzBuzzWhizz_when_digit_can_be_divided_by_3_and_5_and_7() {
        String result = fizzBuzz(105);
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
        Integer generate = GenerateUtil.generate("3", "5", 5, 7);
        String result = fizzBuzz(generate);
        assertEquals(FIZZ.getValue(), result);
    }

    @Test
    public void should_return_buzz_when_digit_contains_5() {
        String result = fizzBuzz(35);
        assertEquals(BUZZ_WHIZZ.getValue(), result);
    }
}