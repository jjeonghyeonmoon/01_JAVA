package com.greedy.level02.normal;



public class Application {

    public static void main(String[] args) {

        RandomMaker randomMaker = new RandomMaker();
        System.out.println("난수 출력 :"+ RandomMaker.randomNumber(-50,50));

      //  System.out.println("정수의 길이의 랜덤한 문자열 :" + RandomMaker.randomUpperAlphabet(10));

        String cois2 = RandomMaker.tossCoin();
        System.out.println("슝! 휘리릭~ 탁! 자 앞면일까요 뒷면일까요?: "+ cois2 + " 입니다^^");

        String rps = RandomMaker.rockPaperScissors();
        System.out.println("안내면 진거 가위바위보!: " + rps );


    }
}
