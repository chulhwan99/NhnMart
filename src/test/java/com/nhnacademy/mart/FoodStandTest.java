package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodStandTest {

    @Test
    @DisplayName("addUnder0Test")
    void addUnder0Test() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new FoodStand().add(new Food("test", -1222)));
    }

    @Test
    @DisplayName("cantBuyFoodNoProductTest")
    void cantBuyFoodNoProductTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new FoodStand().cantBuyFood("test", 1));
    }

}