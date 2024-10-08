package com.ohgiraffers.section03.constant;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 상수에 대해 이해하고 사용할 수 있다.*/

        /* 필기.
        * 상수란?
        * 변수가 메모리에 변경될 수 있는 값을 저장하기 위한 공간
        * 이라고 한다면, 상수는 반대되는 개념이다.
        * 변하지 않는 값(고정 된 값)을 저장하기 위한
        * 메모리 상의 공간을 상수 라고 한다.
        *
        * 상수의 사용 목적
        * 변경되지 않는 고정된 값을 저장할 목적으로 사용하게 된다.
        * EX) 수학 공식에 사용되는 수치(파이 등등)
        *
        * 사용 방법
        * 1. 상수를 선언(변수 선언과 유사하지만, final 키워드가 붙는다.)
        * 2. 값을 초기화(대입) 한다.
        * 3. 변수와 마찬가지로 필요한 곳에서 호출한다.
        * 
        *      */
            
            /* 목차. 1. 상수 선언*/
            final int AGE; // 상수는 변수와의 차별성을 띄기 위해 대문자로 상수명을 짓는다.
            int age;
            
            /* 목차. 2. 값 초기화(대입) */
            AGE = 20;
//            AGE = 30; 한 번 초기화 한 이후 값을 재 대입하는 것은 불가능하다.
            
            /* 목차. 3. 필요한 위치에서 호출해서 사용*/
        System.out.println("AGE = " + AGE);
    
    
    
    
    
    }


}
