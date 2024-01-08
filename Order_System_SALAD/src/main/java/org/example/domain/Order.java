package org.example.domain;

public class Order implements Menu {
    private Menu menu;
    private int count; // 세부 메뉴 번호


    public Order(Menu menu, int count) {
        this.menu = menu;
        this.count = count;
    }

    public void showOrder() { // 주문 내역 보여주기
        System.out.println("주문 내역");
        System.out.println("메뉴: " + menu.getName());
        System.out.println("번호: " + count);
        System.out.println(": " + count);
    }

    public int calculatePrice() {
        return menu.getPrice(); // 가격 가져오기
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
