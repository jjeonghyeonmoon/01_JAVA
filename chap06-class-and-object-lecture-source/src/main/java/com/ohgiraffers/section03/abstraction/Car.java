package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Car {

    // 관리 해야 할 상태 속력, 시동상태
    private boolean is0n; // 시동 상태
    private int speed; //현재 속력

    public void startUp() {
        if (is0n) {
            System.out.println("이미 시동이 걸려있습니다.");
        } else {
            this.is0n = true;
            System.out.println("시동을 걸었습니다. 출발 준비 완료!!!!!!!!!!!");
        }
    }

    public void go() {

        if (is0n) {
            System.out.println("차가 앞으로 움직입니다~~~~~~~~~~~~");
            this.speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h입니다!!!!!!");
            if (this.speed >= 100) {
                System.out.println();
                System.out.println("축하드립니다.빨간 장갑으로 LEVEL UP 하셨습니다.");
                System.out.println("NEXT LEVEL UP : 200km");
            }
            if (this.speed >= 200) {
                System.out.println();
                System.out.println("축하드립니다.주황 장갑으로 LEVEL UP 하셨습니다.");
                System.out.println("NEXT LEVEL UP : 500km");
            }
            if (this.speed >= 500) {
                System.out.println();
                System.out.println("축하드립니다. 초록 장갑으로 LEVEL UP 하셨습니다. ");
                System.out.println("NEXT LEVEL UP : 1000km");
            }
            if (this.speed >= 1000){
                System.out.println();
                System.out.println("축하드립니다. 초록 장갑으로 LEVEL UP 하셨습니다. ");
                System.out.println("히든 스테이지 진입합니다. 보스를 들이박아 죽여버리고 보상을 획득하세요.");

            }
             else {
                System.out.println("차의 시동을 확인해주세요.");
            }
        }
    }
        public void stop () {
            // 시동이 걸려있고, 달리는 상태인 경우에만 멈출 수 있다.
            if (is0n) {
                if (this.speed > 0) {
                    this.speed = 0;
                    System.out.println("끼~~~~~읶!! 차가 멈췄습니다.");
                } else {
                    System.out.println("이미 차는 0km/h 인데요?");
                }
            } else {
                System.out.println("차의 시동이 걸려있지 않아 너가 얼마나 밟든 힘만 들거야");
            }
        }

        // 시동이 걸려있다면 시동을 끄고,이미 꺼져있다면 끌 수 없고, 움직이고 있다면 브레이크를 먼저 밟아달라
        public void turn0ff () {

            if (is0n) {

                if (this.speed > 0) {
                    System.out.println("달리는 상태에서는 시동을 끄면 큰일납니다.");
                } else {
                    this.is0n = false;
                    System.out.println("시동을 끄겠습니다.");
                }
            } else {
                System.out.println("이미 시동이 꺼져 있는 상태입니다 ㅎㅎ");
            }
        }
        public void boss1(){
            System.out.println("던전에 진입하셨습니다. 조평순(HP:100)을 물리치고 보상을획득하세요!");
            System.out.println("1.깜빡이 안키고 차로변경 후 박치기(데미지: 50) / 2.한 손에 폰들고 노룩운전으로 박치기(데미지: 30)");
            Scanner sc = new Scanner(System.in);
            System.out.println("번호를 선택해주세요 : " );
            int attack = sc.nextInt();

            


        }

    }




