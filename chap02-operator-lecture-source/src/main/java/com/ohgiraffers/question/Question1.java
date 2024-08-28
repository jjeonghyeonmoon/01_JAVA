package com.ohgiraffers.question;

public class Question1 {

    public static void main(String[] args) {

        double weight = 55.5;       // 체중
        int heightCm = 160;         // 키(cm)
        double heightM = (double) heightCm / 100; // 키(m) = 키(cm)/100
        // 키를 실수로 명시적으로 형 변환

        //BMI 계산
        double bmi = weight / (heightM * heightM);

        System.out.println("문정현님의 BMI는 " + bmi + " 입니다.");


        int ev = 1000; // 엘리베이터 최대수용 무게
        int hu = 76;    // 인간몸무게

        int evFull = ev / hu; // 1000kg 수용가능한 엘리베이터에 몇명이 탈수있는가?
        System.out.println(evFull);

        double avgWeight = (double) ev / 13; // 엘리베이터에 13명이 탄다면 인간들의 평균몸무게는?
        System.out.println(avgWeight);

        System.out.println("=========================절취선==========================");

        int sausage = 6;  // 1명당 소세지 갯수
        int sausageStudent = 67; // 현재까지 소세지 받아간 학생수

        int sausageConsumption = sausage * sausageStudent; // 현재까지 소세지 소비량
        System.out.println(sausageConsumption);

        int nextStudent = ++sausageStudent; // 다음 학생~
        System.out.println(nextStudent);



               }

        }



