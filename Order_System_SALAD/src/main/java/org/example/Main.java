package org.example;


import org.example.service.Kiosk;

public class Main {
    public static void main(String[] args) {

        System.out.println(" [ SALAD 가게에 오신 것을 환영합니다 ] ");
        System.out.println("    메뉴 화면으로 들어가는 중입니다     ");

        Kiosk kiosk = new Kiosk(); // // Kiosk 인스턴스화

        kiosk.on(); // Kiosk 실행


    }
}