package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void checkConstructorShouldThrowException() {
        String expectedTextOfException = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Binary", feline);
        });
        assertEquals("Incorrect an expected text of this exception", expectedTextOfException, exception.getMessage());
    }

    @Test
    public void getKittensShouldReturnCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(17);
        int expectedNumber = 17;
        int actualNumber = lion.getKittens();
        assertEquals("Expected number is 17", expectedNumber, actualNumber);
    }

    @Test
    public void getFoodShouldReturnListWith3Items() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Котлета", "Стейк", "Баран"));
        List<String> expected = List.of("Котлета", "Стейк", "Баран");
        List<String> actual = lion.getFood();
        assertEquals("getFood method should return a list with 3 items", expected, actual);
    }
}
