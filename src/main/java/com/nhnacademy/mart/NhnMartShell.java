package com.nhnacademy.mart;

import java.util.Scanner;

public class NhnMartShell {

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList buyList = inputBuyListFromShell();

        // TODO 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer chulHwan = new Customer(buyList);

        // 장바구니를 챙긴다.
        chulHwan.bring(mart.provideBasket());

        // 식품을 담는다.
        chulHwan.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        chulHwan.payTox(mart.getCounter());
    }

    /**
     * 사용자에게 입력받은 값으로 buyList를 만드는 함수입니다.
     *
     * @return BuyList
     */
    private static BuyList inputBuyListFromShell() {
        // TODO Scanner 입력을 받아 buyList 만들기
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] split = input.split(" ");
        BuyList buyList = new BuyList();

        for (int i = 0; i < split.length; i += 2) {
            buyList.add(new BuyList.Item(split[i], Integer.parseInt(split[i + 1])));
        }


        return buyList;
    }
}
