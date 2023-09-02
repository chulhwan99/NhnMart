package com.nhnacademy.mart;


public class Counter {
    /**
     * 마트 결제를 위한 함수입니다.
     *
     * @param Money
     * @param totalPrice
     * @return
     */
    public int pay(int Money, int totalPrice) {
        if (totalPrice > Money) {
            throw new IllegalArgumentException("잔액이 부족합니다.");
        }
        System.out.println("총 가격은 " + totalPrice + "원 입니다. ");
        System.out.println("고객님 결제 후 잔액 :" + (Money - totalPrice));
        return Money - totalPrice;
    }
    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)

}
