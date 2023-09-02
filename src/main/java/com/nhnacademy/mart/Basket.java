package com.nhnacademy.mart;

import java.util.ArrayList;

public class Basket {

    public Basket() {

    }

    private final ArrayList<Food> foods = new ArrayList<>();

    public void add(Food food) {
        foods.add(food);
    }

    /**
     * 계산할 때 장바구니에 담긴 물건의 총액을 알려주는 함수입니다.
     *
     * @return
     */
    public int howMuch() {
        int totalPrice = 0;
        for (Food food : foods) {
            totalPrice += food.getPrice();
        }
        return totalPrice;
    }


}
