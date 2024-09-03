package com.ogiraffers.question.no1;

import java.util.Scanner;

public class Problem2 {

    public void moonje() {

        int sum = 0;

        for (int i = 1; i < 11; i++) {

            sum += i;

        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }

    public void moonje2() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {

            sum += i;

        }

        System.out.println("1부터 " + num + " 까지의 합 : " + sum);

    }

    public void moonje3() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {

                sum += i;
            }

        }
        System.out.println("1부터 " + num + " 까지의 짝수의 합 : " + sum);
    }

    public void moonje4() {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {


            System.out.println(i + " : " + str.charAt(i));
        }

    }


    public void moonje5() {

        char c = 'a';

        for (c = 'a'; c <= 'z'; c++) {

            System.out.print(c);
        }

    }


    public void moonje6() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        char ma = '마';
        char to = '토';


        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(ma);
            } else {
                System.out.print(to);
            }

        }
    }

    public void moonje7() {

        Scanner sc = new Scanner(System.in);
        System.out.print("2보다 큰 정수를 입력하세요 : ");
        int num = sc.nextInt();

        if (num < 2) {
            System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
        }

        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("소수가 아닙니다..");
                break;

            } else count++;

        }

        System.out.println("소수입니다.");
    }
}



















