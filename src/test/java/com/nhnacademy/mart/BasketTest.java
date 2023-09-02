package com.nhnacademy.mart;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    @DisplayName("basketAddTest")
    void basketAddTest() {
        Assertions.assertDoesNotThrow(() -> new Basket().add(new Food("test", 100)));
    }

    @Test
    @DisplayName("basketHowMuchTest")
    void howMuchTest() {
        Basket basket = new Basket();
        basket.add(new Food("test1", 100));
        basket.add(new Food("test2", 200));
        basket.add(new Food("test3", 300));
        Assertions.assertEquals(basket.howMuch(), 600);
    }

}