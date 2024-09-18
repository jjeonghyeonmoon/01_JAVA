package com.ohgiraffers.study.consolegame;
import com.ohgiraffers.study.consolegame.Deck;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        HiLoGame game = new HiLoGame();
        game.playGame();
}

        public static class HiLoGame {
            private Deck deck;
            private Card currentCard;
            private Scanner scanner;

            public HiLoGame() {
                deck = new Deck();  // 덱 생성 및 섞기
                scanner = new Scanner(System.in);
            }

            public void playGame() {
                System.out.println("Hi-Lo 게임에 오신 것을 환영합니다~~~!");

                //첫 번째 카드를 뽑음
                currentCard = Deck.dealCard();
                System.out.println("현재 카드: " + currentCard);

                while (deck.cardsRemaining() > 0) {
                    System.out.print("다음 카드는 더 높을까요 낮을까요? (high/low): ");
                    String guess = scanner.nextLine();

                    Card nextCard = deck.dealCard();
                    System.out.println("다음 카드: " + nextCard);

                    // 플레이어의 추측이 맞는지 확인
                    if ((guess.equalsIgnoreCase("high") && nextCard.getValue() > currentCard.getValue()) ||
                            (guess.equalsIgnoreCase("low") && nextCard.getValue() < currentCard.getValue())) {
                        System.out.println("맞췄습니다!");
                    } else {
                        System.out.println("틀렸습니다! 여기까지!");
                        break;
                    }

                    // 다음 라운드를 위해 현재 카드를 업데이트
                    currentCard = nextCard;
                }

                System.out.println("게임이 끝났습니다.");
            }
        }



}
