package com.com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {

        /* title. java.util.Random 클래스를 사용해서 난수 발생*/

        Random random = new Random();

        /* comment.
        *   random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최솟값;*/




        int randomNumber = random.nextInt(10);          //0~9
        System.out.println("randomNumber = " + randomNumber);

        int randomNumber2 = random.nextInt(10) + 1;      //1~10
        System.out.println("randomNumber = " + randomNumber);

        int randomNumber3 = random.nextInt(5) + 11;      //11~15
        System.out.println("randomeNumber3 = " + randomNumber3);

        int randomNumber4 = random.nextInt(256) -128;     //-128~127
        System.out.println("randomNumber4 = " + randomNumber4);


    }
}
