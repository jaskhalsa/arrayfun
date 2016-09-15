package tests;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jkhalsa on 06/09/2016.
 */
public class FizzBuzzTest {
    @Test
    public void shouldReturn1When1IsInput(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.FizzBuzzer(1));
    }

    @Test
    public void shouldReturn2When2IsInput(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.FizzBuzzer(2));
    }

    @Test
    public void shouldReturnFizzWhen3IsInput(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.FizzBuzzer(3));
    }

    @Test
    public void shouldReturnBuzzWhen5IsInput(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.FizzBuzzer(5));
    }

    @Test
    public void shouldReturnFizzBuzzWhen15IsInput(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.FizzBuzzer(15));
    }

    @Test
    public void shouldReturnFizzBuzzWhen30IsInput(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.FizzBuzzer(30));
    }

    @Test
    public void shouldReturnFizzWhen13IsInput(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.FizzBuzzer(13));
    }

    @Test
    public void shouldReturnBuzzWhen51IsInput(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.FizzBuzzer(56));
    }
}