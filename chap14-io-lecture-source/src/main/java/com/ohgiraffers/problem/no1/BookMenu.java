package com.ohgiraffers.problem.no1;


import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();


    public void mainMenu() {

        // *** 도서 관리 프로그램 ***

        while (true) {
            System.out.println("1.새 도서 추가");
            System.out.println("2.도서 삭제");
            System.out.println("3.도서 검색");
            System.out.println("4.전체 출력");
            System.out.println("5.끝내기");
            System.out.print("메뉴 번호 선택");
            int choice = sc.nextInt();

            switch (choice){
                case 1 :
                    bm.addBook(inputBook());
                    break;

                case 2 :
                    bm.deleteBook(inputBookNo());
                    break;
                case 3 :
                    bm.searchBook(inputBookTitle());
                    break;
            }

        }

    }

    public BookDTO inputBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("도서 제목을 입력하세요 : ");
        int category = sc.nextInt();

        System.out.print("도서 장르를 입력하세요 (1:인문 / 2:자연과학 / 3:의료 / 4:기타): ");
        String title = sc.nextLine();

        System.out.print("도서 저자를 입력하세요 : ");
        String author = sc.nextLine();

        return null;
    }

    public int inputBookNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 도서 번호를 입력하세요 :");
        int bNO = sc.nextInt();

        return bNO;
    }


    public String inputBookTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("찾으실 도서 제목을 입력하세요 : ");
        int category = sc.nextInt();


        return "";
    }




}