package com.ohgiraffers.study.consolegame;


    public class Card {
        private String suit;  // 카드의 무늬
        private String rank;  // 카드의 숫자나 그림 (2~10, J, Q, K, A)

        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public String getSuit() {
            return suit;
        }

        public String getRank() {
            return rank;
        }


        // 무늬에 따른 우선순위 설정
        public int getSuitPriority() {
            switch (suit) {
                case "Spades":
                    return 4;
                case "Hearts":
                    return 3;
                case "Clubs":
                    return 2;
                case "Diamonds":
                    return 1;
                default:
                    return 0;  // 예상치 못한 무늬의 경우
            }
        }



        // 카드의 숫자를 비교하기 위해 값 반환
        public int getValue() {
            switch (rank) {
                case "A":
                    return 14;
                case "K":
                    return 13;
                case "Q":
                    return 12;
                case "J":
                    return 11;
                default:
                    return Integer.parseInt(rank);
            }
        }


        // 무늬와 숫자를 모두 고려한 카드 값 반환
        public int getTotalValue() {
            return getValue() * 10 + getSuitPriority();
        }


        @Override
        public String toString() {
            // 카드 이름과 계산된 총값을 함께 출력
            return rank + " " + suit + " (값 : " + getTotalValue() + ")";
        }
    }