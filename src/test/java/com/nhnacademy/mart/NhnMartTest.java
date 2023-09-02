package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NhnMartTest {
    @Test
    @DisplayName("fillFoodStandTest")
    void fillFoodStandTest() {
        Assertions.assertDoesNotThrow(() -> new NhnMart().prepareMart());
    }

    @Test
    @DisplayName("getFoodStandTest")
    void getFoodStandTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new NhnMart().getFoodStand().cantBuyFood("test", 2));
    }

    @Test
    @DisplayName("getFoodStandTest")
    void getProvideBasketTest() {
        NhnMart nhn = new NhnMart();

        Assertions.assertEquals(0, nhn.provideBasket().howMuch());
    }

    @Test
    @DisplayName("getCounterTest")
    void getCounterTest() {
        NhnMart nhn = new NhnMart();

        Assertions.assertEquals(0, nhn.getCounter().pay(10, 10));
    }


}