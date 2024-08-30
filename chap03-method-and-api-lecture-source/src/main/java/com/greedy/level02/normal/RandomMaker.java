package com.greedy.level02.normal;

import java.util.Random;


public class RandomMaker {


        // 최소값부터 최대값까지 범위의 난수를 반환
        public static int randomNumber(int min, int max) {
                Random random = new Random();
                return random.nextInt(max - min + 1) + min;

        }

        // public static int randomUpperAlphabet(int length) {
        //         Random random = new Random();
                 //return(length > 0 ? char('A'));

        //}

         public static String tossCoin(){

                Random random = new Random();
                return random.nextInt(2) == 1 ? "앞면":"뒷면";

         }

         public static String rockPaperScissors(){

                Random random = new Random();
                return random.nextInt(3) == 2 ? "가위": random.nextInt(2) == 1? "바위":"보";
         }

         }

