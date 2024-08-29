package com.ohgiraffers.question;

public class Question4 {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 5;

        Application1 calculatorr = new Application1();
        calculatorr.sumTwoNumbers(10,20);
        System.out.println("10과 20의 합 : " + (calculatorr.sumTwoNumbers(10,20)));

         int min = calculatorr.minusTwoNumber(num1,num3);
        System.out.println("10과 5의 차 : " + min );

        int multi = calculatorr.multiTwoNumbers(num1,num3);
        System.out.println("10과 5의 곱 : " + multi );

        int divide = calculatorr.divideTwoNumbers(num1,num3);
        System.out.println("10과 5의 나눈 후 몫 : " + divide);
   }

}
