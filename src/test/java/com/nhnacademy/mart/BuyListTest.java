package com.nhnacademy.mart;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuyListTest {
    @Test
    @DisplayName("Item Constructor Amount < 0 Test")
    void amountUnderZeroTest() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> new BuyList.Item("test", -1));
    }

    @Test
    @DisplayName("Item Constructor Test")
    void itemConstructorTest() {
        BuyList.Item item = new BuyList.Item("test", 1);
        Assertions.assertEquals("test", item.getName());
        Assertions.assertEquals(1, item.getAmount());
    }

    @Test
    @DisplayName("buyListAddTest")
    void buyListAddTest() {
        Assertions.assertDoesNotThrow(() -> new Basket().add(new Food("test", 100)));
    }


}