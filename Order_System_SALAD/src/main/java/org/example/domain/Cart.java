package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Order> orderList =  new ArrayList<>(); // 카트에 담아올 공간은 ArrayList로 만들어주기(카트에 몇개가 담길지 모르기 때문에 동적배열인 arraylist가 필요하다)

    public void addOrder(Order order) {

        orderList.add(order); // arraylist 배열에 주문한 음식 순서대로 담아주기
    }

    public void showOrderList() { // 주문 리스트 가져오기
        for (Order order : orderList) { // 배열에 담긴 주문 리스트를 순회해서 다 출력하기
            order.showOrder(); // 주문내역
        }
    }

    public void pay() { // 리스트 순화해서 나온 메뉴의 가격 합쳐주기
        int total = 0; // 0으로 일단 초기화
        for (Order order : orderList) { // 주문 리스트 순회
            total += order.calculatePrice(); // 계산된 가격(calculatePrice)을 여기서 총합하기
        }
        System.out.println("총 가격은 " + total + "원 입니다!");
    }
}

