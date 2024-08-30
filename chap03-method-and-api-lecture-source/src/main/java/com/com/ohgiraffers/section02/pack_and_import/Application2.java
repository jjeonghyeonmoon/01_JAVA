package com.ohgiraffers.section02.pack_and_import;

import com.ohgiraffers.section01.method.Calculator;

public class Application2 {

    public static void main(String[] args) {
        /* title. 임포트에 대해 이해할 수 있다.*/

        /*comment.
        *   imtport 란?
        *   서로 다른 패키지에 존재하는 클래스를 사용하는 경우
        *   패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
        *   하지만, 매번 다른 클래스의 풀 패키지명을 쓰기에는 너무 번거롭다.
        *   그래서 패키지 명을 생략하고 사용할 수 있도록 한 구문이 import 이다.
        *   import는 package 선언문과 class 선언문 사이에 작성하게 되며
        *   어떠한 패키지 내에 있는 킅래스를 사용할 것인지에 대해
        *   미리 선언하는 효과를 갖게된다.
        * */


        /* non-static 메소드 호출*/

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50, 60);
        System.out.println("50과 60중 더 작은 값은 " + min);


        /*static 메소드 호출*/

        int max = Calculator.maxNumberOf(50,60);
        System.out.println(" 50과 60중 더 큰 값은 :" + max);
    }
}
