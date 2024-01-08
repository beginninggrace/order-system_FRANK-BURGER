package org.example.service;

import org.example.data.Screen;
import org.example.domain.*;

import java.util.Scanner;

import static org.example.data.ScreenStage.*;

public class Kiosk {
    private Screen screen = new Screen(); // Screen 인스턴스화
    Scanner sc = new Scanner(System.in); // Scanner : 입력 받는 툴 만들기
    Cart cart = new Cart(); // 카트 인스턴스화 - 카트에 받기 위해 미리 생성


    public void on() {

        // 주문 시작
        while (true) {
            System.out.println(screenMap.get(MAIN_MENU)); // 메인메뉴 출력..screenMap이 왜 작동이 안 될까요ㅠㅠ
            int i = sc.nextInt(); // 먹고 싶은 대괄호 메뉴 번호 입력(숫자)


            if (i == 1) {
                System.out.println(screenMap.get(SALAD)); // 샐러드 메뉴 출력
                Salad salad = new Salad(); // 샐러드 생성
                int count = sc.nextInt(); // 먹고 싶은 샐러드 번호 입력(숫자)

                Order saladOrder = new Order(salad, count); // 주문 생성
                cart.addOrder(saladOrder); // 카트에 주문 추가


            } else if (i == 2) {
                System.out.println(screenMap.get(SANDWICH));
                Sandwich sandwich = new Sandwich();
                int count = sc.nextInt();

                Order sandwichOrder = new Order(sandwich, count);
                cart.addOrder(sandwichOrder);


            } else if (i == 3) {
                System.out.println(screenMap.get(SOUP));
                Soup soup = new Soup();
                int count = sc.nextInt();

                Order soupOrder = new Order(soup, count);
                cart.addOrder(soupOrder);


            } else if (i == 4) {
                System.out.println(screenMap.get(DRINK));
                Drink drink = new Drink();
                int count = sc.nextInt();

                Order drinkOrder = new Order(drink, count);
                cart.addOrder(drinkOrder);


            } else if (i == 5) {
                System.out.println(screenMap.get(DECIDE_ORDER)); // '1. 주문 2. 메뉴판으로'인데 여기서 1선택하면 주문, 2선택하면 MAIN_MENU로 가게 하는 방법은?
                cart.showOrderList(); // 카트에 담긴 주문 목록 보여주기
                cart.pay();
                if (i == 1) {
                    System.out.println(screenMap.get(EXIT));
                    System.exit(0);
                }
                else if (i ==2) {
                    System.out.println(screenMap.get(MAIN_MENU));
                }
                else {
                    break;
                }


            }else if (i == 6) {
                System.out.println(screenMap.get(CANCLE)); // 위와 마찬가지로 1선택하면 취소, 2선택하면 MAIN_MENU로 가게 하는 방법은?
                if (i == 1) {
                    // 여기에 가격 초기화하는 부분 들어가야 됨
                    System.out.println(screenMap.get(CANCLE_EXIT));
                }
            }
                else if (i ==2) {
                    System.out.println(screenMap.get(MAIN_MENU));
            }
                else {
                    break;

            }

            else {
                break;
            }
        }


    }

}
