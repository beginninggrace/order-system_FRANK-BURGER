package org.example.data;

import java.util.HashMap;
import java.util.Map;

public class Screen {
    private final Map<ScreenStage, String> screenMap = new HashMap<>(); // 캡슐화, 변하지 않을 상수값이라 private final로 지정

    public Screen() { // 생성자 만들기

    }

    public String getScreen(ScreenStage screenStage) {
        return screenMap.get(screenStage); // key(screenStage)에 있는 value값 조회
    }

    private void screenData() { // 메뉴를 화면에 출력만 해주는 거니까 반환값 없이 private로 지정

        screenMap.put(ScreenStage.MAIN_MENU, " \"\uD83E\uDD51HAPPY SALAD가게에 오신 것을 환영합니다!\uD83E\uDD51\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n" +
                "\n" +
                "[ HAPPY SALAD MENU ]\n" +
                "1.  Salad      | 비법소스가 들어있는 맛있는 샐러드\n" +
                "2. Sandwich    | 신선한 야채로 만드는 샌드위치\n" +
                "3. Soup        | 매장에서 직접 만드는 스프\n" +
                "4. Drink       | 다이어트 슈가프리 음료와 생과일 주스\n" +

                "[ ORDER MENU ]\n" +
                "5. Order       | 장바구니를 확인 후 주문합니다.\n" +
                "6. Cancel      | 진행중인 주문을 취소합니다.");

        screenMap.put(ScreenStage.SALAD, " \"\uD83E\uDD51HAPPY SALAD가게에 오신 것을 환영합니다!\uD83E\uDD51\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n" +
                "\n" +
                "[ Salad MENU ]\n" +
                "1. Salad1    | ￦ 10000 | 샐러드 설명 1\n" +
                "2. Salad2    | ￦ 11000 | 샐러드 설명 2\n" +
                "3. Salad3    | ￦ 12000 | 샐러드 설명 3\n" +
                "4. Salad4    | ￦ 13000 | 샐러드 설명 4");

        screenMap.put(ScreenStage.SANDWICH, " \"\uD83E\uDD51HAPPY SALAD가게에 오신 것을 환영합니다!\uD83E\uDD51\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n" +
                "\n" +
                "[ Sandwich MENU ]\n" +
                "1. Sandwich1    | ￦ 8000 | 샌드위치 설명 1\n" +
                "2. Sandwich2    | ￦ 8500 | 샌드위치 설명 2\n" +
                "3. Sandwich3    | ￦ 9000 | 샌드위치 설명 3\n" +
                "4. Sandwich4    | ￦ 9500 | 샌드위치 설명 4");

        screenMap.put(ScreenStage.SOUP, " \"\uD83E\uDD51HAPPY SALAD가게에 오신 것을 환영합니다!\uD83E\uDD51\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n" +
                "\n" +
                "[ Soup MENU ]\n" +
                "1. Soup1    | ￦ 4000 | 스프 설명 1\n" +
                "2. Soup2    | ￦ 4500 | 스프 설명 2\n" +
                "3. Soup3    | ￦ 5000 | 스프 설명 3\n" +
                "4. Soup4    | ￦ 5500 | 스프 설명 4");

        screenMap.put(ScreenStage.DRINK, " \"\uD83E\uDD51HAPPY SALAD가게에 오신 것을 환영합니다!\uD83E\uDD51\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n" +
                "\n" +
                "[ Drink MENU ]\n" +
                "1. Drink1    | ￦ 2000 | 음료 설명 1\n" +
                "2. Drink2    | ￦ 2500 | 음료 설명 2\n" +
                "3. Drink3    | ￦ 3000 | 음료 설명 3\n" +
                "4. Drink4    | ￦ 3500 | 음료 설명 4");

        screenMap.put(ScreenStage.ORDER, "\"선택한 메뉴 : \"\n" + // 여기에 들어갈 메소드는 무엇?
                "위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                "1. 확인        2. 취소");

        screenMap.put(ScreenStage.RE_MENU, " 가 장바구니에 추가되었습니다.\n" + // 여기에 들어갈 메소드는 무엇?
                "아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n" +
                "\n" +
                "[ HAPPY SALAD MENU ]\n" +
                "1.  Salad      | 비법소스가 들어있는 맛있는 샐러드\n" +
                "2. Sandwich    | 신선한 야채로 만드는 샌드위치\n" +
                "3. Soup        | 매장에서 직접 만드는 스프\n" +
                "4. Drink       | 다이어트 슈가프리 음료와 생과일 주스\n" +

                "[ ORDER MENU ]\n" +
                "5. Order       | 장바구니를 확인 후 주문합니다.\n" +
                "6. Cancel      | 진행중인 주문을 취소합니다.");

        screenMap.put(ScreenStage.DECIDE_ORDER, "아래와 같이 주문 하시겠습니까?\n" +
                "\n" +
                "[ Orders ]\n" +
                "주문한 메뉴 이름1\n" + // 여기에 들어갈 메소드는 무엇?
                "주문한 메뉴 이름2\n" + // 여기에 들어갈 메소드는 무엇?
                "\n" +
                "[ Total ]\n" +
                "W 15.8\n" + // 여기에 들어갈 메소드는 무엇?
                "\n" +
                "1. 주문      2. 메뉴판으로");

        screenMap.put(ScreenStage.EXIT, "주문이 완료되었습니다!\n" +
                "\n" +
                "대기번호는 [ 1 ] 번 입니다.\n" + // 여기에 들어갈 메소드는 무엇?
                "(3초후 메뉴판으로 돌아갑니다.)"); // 여기에 들어갈 메소드는 무엇?

        screenMap.put(ScreenStage.CANCLE, "진행하던 주문을 취소하시겠습니까?\n" +
                "1. 확인        2. 취소");

        screenMap.put(ScreenStage.CANCLE_EXIT, "진행하던 주문이 취소되었습니다.\n" +
                "\n" +
                " \"\uD83E\uDD51HAPPY SALAD가게에 오신 것을 환영합니다!\uD83E\uDD51\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n" +
                "\n" +
                "[ HAPPY SALAD MENU ]\n" +
                "1.  Salad      | 비법소스가 들어있는 맛있는 샐러드\n" +
                "2. Sandwich    | 신선한 야채로 만드는 샌드위치\n" +
                "3. Soup        | 매장에서 직접 만드는 스프\n" +
                "4. Drink       | 다이어트 슈가프리 음료와 생과일 주스\n" +

                "[ ORDER MENU ]\n" +
                "5. Order       | 장바구니를 확인 후 주문합니다.\n" +
                "6. Cancel      | 진행중인 주문을 취소합니다.");

    }



}
