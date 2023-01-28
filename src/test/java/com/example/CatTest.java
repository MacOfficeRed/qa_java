package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;

    @Test
    public void getSoundShouldReturnMeow() {
        Cat cat = new Cat(feline);
        String expectedText = "Мяу";
        String actualText = cat.getSound();
        assertEquals("Result should be 'Мяу'", expectedText, actualText);
    }

    @Test
    public void getFoodShouldReturnListWith3Items() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Птичка", "Мышка", "Ящерка"));
        List<String> expected = List.of("Птичка", "Мышка", "Ящерка");
        List<String> actual = cat.getFood();
        assertEquals("getFood method should return a list with 3 items", expected, actual);
    }
}
