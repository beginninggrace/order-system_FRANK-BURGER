package org.example.domain;

public class Soup implements Menu {

    private String name;
    private int price;

    public Soup() { // arraylist로 각각의 세부 메뉴를 어떻게 담을까?

        this.name = "어쩌구 스프";
        this.price = 5000;
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
