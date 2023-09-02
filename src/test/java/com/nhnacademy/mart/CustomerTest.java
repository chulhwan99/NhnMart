package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {
    @Test
    @DisplayName("customerConstructorTest")
    void customerConstructorTest() {
        Customer customer = new Customer(new BuyList());
        Assertions.assertEquals(customer.getMoney(), 20000);
    }

    @Test
    @DisplayName("pickFood재고부족test")
    void pickFoodLackInven() {
        BuyList buylist = new BuyList();
        buylist.add(new BuyList.Item("test", 2));
        Customer customer = new Customer(buylist);
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("test", 1000));
        Assertions.assertThrows(IllegalArgumentException.class, () -> customer.pickFoods(foodStand));
    }

    @Test
    @DisplayName("customerpayToxTest")
    void customerpayToxTest() {
        BuyList buylist = new BuyList();
        buylist.add(new BuyList.Item("test", 2));
        Customer customer = new Customer(buylist);
        Basket basket = new Basket();
        basket.add(new Food("test1", 1000));
        Counter counter = new Counter();
        customer.bring(basket);
        customer.payTox(counter);
        Assertions.assertEquals(customer.getMoney(), 19000);
    }

    @Test
    @DisplayName("customerpickFoodTest")
    void customerpickFoodTest() {
        BuyList buylist = new BuyList();
        buylist.add(new BuyList.Item("test", 1));
        Customer customer = new Customer(buylist);
        FoodStand foodStand = new FoodStand();
        Basket basket = new Basket();
        customer.bring(basket);
        foodStand.add(new Food("test", 1000));
        customer.pickFoods(foodStand);
        Assertions.assertEquals(basket.howMuch(), 1000);
    }
}