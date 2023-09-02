package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CounterTest {
    @Test
    @DisplayName("counterLackMoneyTest")
    void counterLackMoneyTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Counter().pay(10, 15));
    }

    @Test
    @DisplayName("counterPayTest")
    void counterPayTest() {
        Counter counter = new Counter();
        Assertions.assertEquals(0, counter.pay(10, 10));
    }
}
