package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Salad implements Menu {


    private String name;
    private int price;

    public Salad(SaladType saladType) {
        if (SaladType.CHICKEN.equals(saladType)) {
            this.name = "치킨 샐러드";
            this.price = 4000;
        } else if (SaladType.BEEF.equals(saladType)) {
            this.name = "소고기 샐러드";
            this.price = 6000;
        } else if (SaladType.PORK.equals(saladType)) {
            this.name = "돼지고기 샐러드";
            this.price = 5000;
        } else {
            throw new IllegalArgumentException("잘못된 샐러드 타입입니다.");
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
