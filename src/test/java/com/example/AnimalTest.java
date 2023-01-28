package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTest {
    @Test
    public void checkGetFoodWithException() {
        Animal animal = new Animal();
        String expectedTextOfException = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Exception exception = assertThrows(Exception.class, () -> {
            animal.getFood("Bird");
        });
        assertEquals("Incorrect an expected text of this exception", expectedTextOfException, exception.getMessage());
    }

    @Test
    public void sizeOfGetFoodListShouldBeEqual2ForHerbivores() throws Exception {
        Animal animal = new Animal();
        List<String> herbivoreFoodList = animal.getFood("Травоядное");
        assertEquals("The size of this food list should be equal 2 for Herbivores", 2, herbivoreFoodList.size());
    }

    @Test
    public void sizeOfGetFoodListShouldBeEqual3ForPredators() throws Exception {
        Animal animal = new Animal();
        List<String> predatorFoodList = animal.getFood("Хищник");
        assertEquals("The size of this food list should be equal 3 for Predators", 3, predatorFoodList.size());
    }

    @Test
    public void getFamilyShouldReturnCorrectString() {
        Animal animal = new Animal();
        String expectedText = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualText = animal.getFamily();
        assertEquals("getFamily method should return a correct string", expectedText, actualText);
    }
}
