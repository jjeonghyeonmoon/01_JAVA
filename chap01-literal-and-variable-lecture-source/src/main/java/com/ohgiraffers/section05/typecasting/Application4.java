package com.ohgiraffers.section05.typecasting;

public class Application4 {

    public static void main(String[] args) {

        /* title. 형 변환 시 주의점을 이해하고 사용할 수 있다.*/

        /* comment.
        *   형변환 시 주의점.
        *   데이터 손실!!!!!!!!!!!!!!!!!!!
        * */

        /* index. 1. 의도하지 않은 데이터 손실*/
        int inum = 290; // 1byte -128 ~ 127
        byte bnum = (byte)inum;

        System.out.println("bnum = " + bnum);

        /* index. 2. 의도한 데이터 손실*/
        double height = 175.5;
        int floorHeight = (int)height;
        System.out.println("floorHeight = " + floorHeight);

        System.out.println("=======================구분선====================");

        double language = 80.5;
        double math = 50.6;
        double english = 70.8;

        int inum4 =(int)(language + math + english);
        System.out.println("inum4 = " + inum4);
        
        int inum5 = inum4/3;
        System.out.println("inum5 = " + inum5);


        System.out.println("======================연습문제풀이==================");

        int ev = 1000;  //엘리베이터 용량
        int hu = 76;    //몸무게

        int person = ev/hu; // 엘리베이터에 탈수있는 인원수
        System.out.println("person = " + person);

        double weight = (double) ev/person; // 평균몸무게
        System.out.println("weight = " + weight);


    }


}
