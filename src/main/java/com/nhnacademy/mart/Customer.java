package com.nhnacademy.mart;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    private static final Logger logger = LoggerFactory.getLogger(Customer.class);

    // 고객 구매 목록
    private final BuyList buyList;

    private int Money;

    // 고객 장바구니
    private Basket basket;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
        this.Money = 20000;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    /**
     * foodStand에서 장바구니에 food를 담는 함수입니다.
     *
     * @param foodStand
     */
    public void pickFoods(FoodStand foodStand) {
        BuyList.Item[] itemArr = buyList.getItems();

        for (BuyList.Item item : itemArr) {
            if (foodStand.cantBuyFood(item.getName(), item.getAmount())) {
                logger.warn("재고가 사려는 수량보다 적음.");
                throw new IllegalArgumentException("재고가 부족합니다.");
            }
            for (int i = 0; i < item.getAmount(); i++) {
                basket.add(foodStand.deleteFood(item.getName()));
            }
        }

    }
    // TODO pickFoods 메서드 구현


    public int getMoney() {
        return Money;
    }

    // TODO payTox 메서드 구현
    public void payTox(Counter counter) {

        Money = counter.pay(Money, basket.howMuch());
    }

}
