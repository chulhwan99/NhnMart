package com.nhnacademy.mart;

import java.util.ArrayList;


public class FoodStand {

    private final ArrayList<Food> foods = new ArrayList<>();

    /**
     * foods ArrayList에 food를 추가하는 함수입니다.
     *
     * @param food
     */
    public void add(Food food) {
        if (food.getPrice() <= 0) {
            throw new IllegalArgumentException("물품의 가격은 0원 보다 높아야합니다.");
        }
        foods.add(food);
    }

    /**
     * 장바구니에 담은 Food를 FoodStand에서 지우는 함수입니다.
     *
     * @param foodName
     * @return
     */
    public Food deleteFood(String foodName) {
        Food deleteFood = null;
        for (Food food : foods) {
            if (food.getName().equals(foodName)) {
                deleteFood = food;
                break;

            }
        }
        foods.remove(deleteFood);
        return deleteFood;

    }

    /**
     * foodStand에서 해당 상품을 구입할 수 있는지 확인하기 위한 함수입니다.
     *
     * @param foodName
     * @param amount
     * @return
     */
    public boolean cantBuyFood(String foodName, int amount) {
        int count = 0;
        for (Food food : foods) {
            if (food.getName().equals(foodName)) {
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("식품 매대에 존재하지 않는 상품입니다.");
        }
        return amount > count;
    }

}
