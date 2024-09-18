package com.ohgiraffers.study.consolegame;
import java.util.ArrayList;
import java.util.Collections;


    public class Deck {
        private static ArrayList<Card> cards;

        public Deck() {
            cards = new ArrayList<>();
            String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
            String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

            // 모든 무늬와 값의 조합으로 카드 생성
            for (String suit : suits) {
                for (String rank : ranks) {
                    cards.add(new Card(suit, rank));  // 매개변수로 무늬와 값을 넘겨줌
                }
            }
            Collections.shuffle(cards);  // 덱을 섞음
        }

            // 카드 한 장을 나눠주는 메소드
            public static Card dealCard () {
                return cards.remove(0);
            }

            // 덱에 남은 카드 수를 반환
            public int cardsRemaining () {
                return cards.size();
            }
        }


