package com.ohgiraffers.problem.Solution;

import java.util.Random;
import java.util.Scanner;

public class Soloution1 {

    public void problem1() {

        Random random = new Random();
        int randomSu = random.nextInt(10) + 1;

        int num;

        Scanner sc = new Scanner(System.in);

        int n = 0;


        do {
            System.out.print("1 ~ 10 사이에 정수를 입력하시오 삐빅 : ");
            num = sc.nextInt();

            if (num < randomSu)
                System.out.println("입력하신 정수보다 큽니다." + (n += 1) + "회차");
            else if (num > randomSu)
                System.out.println("입력하신 정수보다 작습니다." + ( n += 1) + "회차");
            else if (num == randomSu)
                System.out.println("정답입니다! " + (n + 1)  + " 회 만에 맞추셨습니다.");

        } while (num != randomSu);


    }

    public void problem2(){



    }


    }

