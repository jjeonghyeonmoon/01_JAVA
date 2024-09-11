package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    /* index. 1. extends 키워드를 통해 Car 클래스 상속 */

    // 기본생성자
    public FireCar(){

        /* comment.
        *   모든 생성자에는 가장 첫 줄에 super() 를 컴파일러가 자동추가 해준다.
        *   super() -> 부모의 기본 생성자를 호출하는 구문이다.
        *   명시적, 묵시적 둘 다 가능하다.
        * */
        super();

        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");

    }

    /* index. 2. soundHorn() 메소드 오버라이딩 */

    @Override
    public void soundHorn() {

        if(isRunning()){
            System.out.println("빠아아아아빠아아아빵~~~빵빵아 옥지얌~~~~~~~~~~빠아빵빠빠아ㅃ아!!!!!");
        }else{
            System.out.println("소방차가 앞으로 갈수 없습니다. 다 뿌셔버리고 가기전에 비키세여!!");
        }
    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다!!!!물을뿌립니다==========>>>>>>>>>>");
    }


}
