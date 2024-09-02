package com.ogiraffers.question.no1;

import javax.swing.*;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Problem1 {

    public void ramge(){

        Scanner sc = new Scanner(System.in);
        System.out.print("나이가 어떻게 되세요? : ");
        int age = sc.nextInt();

        if (age >= 20) {
            System.out.println("판매 가능합니다.");
        }
        else{
            System.out.println("판매 불가능합니다.음료 코너에서 골라주세요.");
        }
    }

    public void ramge2() {
        System.out.println("짝홀, 그 결과는? ");
        Scanner sc = new Scanner(System.in);
        System.out.print("도토리 갯수를 적어주세요 : ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("짝수입니다~!");
        } else {
            System.out.println("홀수입니다~!");
        }
    }

    public void ramge3(){

            Scanner sc = new Scanner(System.in);
            System.out.print("당첨 번호가 어떻게 되세요? : ");
            int a = sc.nextInt();

            if (a <= 10 && a % 2 == 0){
                System.out.println("짝수네요, 모자 선물입니다.");
            }
            else if (a <= 10 && a % 2 != 0){
                System.out.println("홀수네요, 인형 선물입니다.");
            }
            else{
                System.out.println("당첨 번호는 1~10 사이에만 있어요.");
            }

    }

    public void ramge4(){

        Scanner a =new Scanner(System.in);
        System.out.print("키(m)를 입력해주세요 : ");
        double height = a.nextDouble();

        System.out.print("몸무게(kg)를 입력해주세요 : ");
        double weight = a.nextDouble();

        double bmi = weight / (height * height);

        if (bmi > 30){
            System.out.println("BMI가 " + bmi + " 이시므로 댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!");
        }
        else if (25 <= bmi && bmi < 30) {
            System.out.println("BMI가 " + bmi + " 이시므로 축제에서 10,000보를 걷고오면 선물을 드려요");
        }
        else if (20 <= bmi && bmi < 25) {
            System.out.println("BMI가 " + bmi + " 이시므로 정상 체중입니다. 축제 재미있게 즐기세요~");
        }
        else{
            System.out.println("BMI가 " + bmi + " 이시므로 저체중입니다. 축제 음식을 왕창 드세요!");
        }


    }

    public void ramge5(){

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번쨰 정수를 입력 하시오 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번쨰 정수를 입력 하시오 : ");
        int num2 = sc.nextInt();

        System.out.print("연산 기호(+, -, *, /, % )를 입력하시오 : ");
        char op = sc.next().charAt(0);

        int sum = 0;



        switch (op) {
            case '+' :
                sum = num1 + num2;
                System.out.println("sum = " + sum);
                break;



            case '-' :
                sum = num1 - num2;
                System.out.println("sum = " + sum);
                break;



            case '*' :
                sum = num1 * num2;
                System.out.println("sum = " + sum);
                break;



            case '/' :
                sum = num1 / num2;
                System.out.println("sum = " + sum);
                break;




            case '%' :
                sum = num1 % num2;
                System.out.println("sum = " + sum);
                break;

                default: System.out.println("입력하신 연산은 없습니다.");
        }

    }

    public void ramge6() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Cara,cho,tong,doto 중 어떤 간식을 선택하시겠습니까? ");
        String a = sc.nextLine();
        int price = 0;

        switch (a){
            case "Cara":
                price = 1000;
                System.out.println("Cara : " + price + "원");
                break;



            case "cho":
                price = 2000;
                System.out.println("cho :" + price + "원");
                break;



            case"tong":
                price = 3000;
                System.out.println("tong :" + price + "원");
                break;



            case "doto":
                price = 4000;
                System.out.println("doto :" + price + "원");
                break;

                default:System.out.println("해당 상품은 판매하지 않습니다.");

        }

    }

    public void ramge7(){

        Scanner sc = new Scanner(System.in);
        System.out.println("성실 점수를 입력해주세요 : ");
        int diligence = sc.nextInt();

        System.out.println("서비스 점수를 입력해주세요 : ");
        int service = sc.nextInt();

        System.out.println("미소 점수를 입력해주세요 : ");
        int smile = sc.nextInt();

        int avg = diligence + service + smile;

        if (avg >= 60 && diligence >= 40 && service >= 40 && smile >= 40){
            System.out.println("합격입니다.");
        }
        else if (avg <= 60) {
            System.out.println("평균점수 미달로 불합격입니다.");
        }
        else if (diligence <= 40 || service <= 40 || smile <= 40){
            if ()
        }
        }


    }






    }







