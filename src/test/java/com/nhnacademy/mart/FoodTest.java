package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodTest {
    @Test
    @DisplayName("foodConstructorTest")
    void foodConstructorTest() {
        Food food = new Food("test", 1000);
        Assertions.assertEquals("test", food.getName());
        Assertions.assertEquals(1000, food.getPrice());
    }
}