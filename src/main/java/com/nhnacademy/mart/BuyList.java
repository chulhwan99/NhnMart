package com.nhnacademy.mart;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuyList {
    private static final Logger logger = LoggerFactory.getLogger(BuyList.class);

    private final ArrayList<Item> items = new ArrayList<>();

    // TODO add 메서드 생성
    public void add(Item item) {
        items.add(item);
    }

    /**
     * items ArrayList에 담겨져있는 item을 item 배열 형태로 반환하는 함수입니다.
     *
     * @return
     */
    public Item[] getItems() {
        Item[] itemArr = new Item[items.size()];
        for (int i = 0; i < items.size(); i++) {
            itemArr[i] = items.get(i);
        }
        return itemArr;
    }


    public static class Item {
        private final String name;
        private final int amount;

        public Item(String name, int amount) {
            if (amount < 0) {
                logger.warn("0개 이하의 물건은 살 수 없음.");
                throw new IllegalArgumentException("사고싶은 물품의 숫자가 0이하입니다.");
            }
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }
    }
}
