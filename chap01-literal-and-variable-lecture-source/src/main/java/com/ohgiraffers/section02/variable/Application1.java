package com.ohgiraffers.section02.variable;

public class Application1 {

    public static void main(String[] args) {
        System.out.println("보너스를 포함한 급여 : " + (1000000 + 200000) + "원");

        int salary = 1000000;
        int bonus = 200000;

        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        /* 목차. 2. 한 번 저장해둔 값을 재사용하기 위한 목적*/
        System.out.println("================================변수에 저장한 값 재사용 테스트==============");
        // 10명의 고객에게 100 포인트 지급하는 출력문을 만들어보자.

        System.out.println("1번 고객에게 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 100포인트 지급하였습니다.");
        System.out.println("6번 고객에게 100포인트 지급하였습니다.");
        System.out.println("7번 고객에게 100포인트 지급하였습니다.");
        System.out.println("8번 고객에게 100포인트 지급하였습니다.");
        System.out.println("9번 고객에게 100포인트 지급하였습니다.");
        System.out.println("10번 고객에게 100포인트 지급하였습니다.");

        int point = 100;

        System.out.println("1번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("6번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("7번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("8번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("9번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("10번 고객에게 " + point + "포인트를 지급하였습니다.");
        
        /* 목차. 3. 시간에 따라 변경되는 값을 저장하고 사용할 수 있다.*/
        System.out.println("====================================변수에 저장 된 값 변경 테스트=================");
        int sum = 0;

        //soutv : 가까운 변수를 출력해주는 기능
        System.out.println("sum = " + sum);
        
        sum = sum + 10; //대입 연산자 오른쪽은 값이다!!!!!!!!!!!!
        System.out.println("sum 에 10을 더한 2번 째 sum = " + sum);

        sum = sum + 10;
        System.out.println("sum 에 10을 더한 3번 째 sum = " + sum);;



    }
}