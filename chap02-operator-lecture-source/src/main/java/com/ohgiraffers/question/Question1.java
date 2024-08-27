package com.ohgiraffers.question;

public class Question1 {

    public static void main(String[] args) {

        double weight = 55.5;       // 체중
        int heightCm = 160;         // 키(cm)
        double heightM = (double) heightCm/100; // 키(m) = 키(cm)/100
                                                // 키를 실수로 명시적으로 형 변환

        //BMI 계산
        double bmi = weight/(heightM * heightM);

        System.out.println("문정현님의 BMI는 " + bmi + " 입니다.");


    }
}
