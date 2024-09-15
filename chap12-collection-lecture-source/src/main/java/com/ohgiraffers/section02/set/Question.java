package com.ohgiraffers.section02.set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {


        ArrayList<BookDTO> book = new ArrayList<>();
        book.add(new BookDTO("1","java","문","10000"));
        book.add(new BookDTO("2","mysql","정","20000"));
        book.add(new BookDTO("4","html","현","30000"));
        book.add(new BookDTO("5","css","임","40000"));


        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("책 번호를 입력하세요 : ");
        String a = sc.nextLine();

        System.out.print("책 이름을 입력하세요 : ");
        String b = sc.nextLine();

        System.out.print("책 저자를 입력하세요 : ");
        String c = sc.nextLine();

        System.out.print("책 가격을 입력하세요 :");
        String d = sc.nextLine();

        book.add(2,new BookDTO(a,b,c,d));



        //  일반 for문을 사용해 책 목록 출력
        System.out.println("일반 for문을 사용한 책 목록:");
        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i));
        }

        //  향상된 for문을 사용해 책 목록 출력
        System.out.println("\n향상된 for문을 사용한 책 목록:");
        for (BookDTO bo : book) {
            System.out.println(bo);ㄱㄱㄱㄱ
        }
ㄱㄱㄱㄱ
    }
}
