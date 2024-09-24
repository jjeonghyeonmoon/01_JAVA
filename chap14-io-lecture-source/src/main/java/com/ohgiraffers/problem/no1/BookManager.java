package com.ohgiraffers.problem.no1;

import org.w3c.dom.ls.LSOutput;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<BookDTO> bookList;

    public BookManager() {
        // 리스트를 초기화하는 작업
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {

        bookList.add(book);
        System.out.println("도서가 추가되었습니다. " + book);

    }

    public void deleteBook(int inputBookNo) {
        bookList.remove(inputBookNo);
        System.out.println("도서 번호 " + inputBookNo + "인 도서가 삭제되었습니다.");
    }

    public void searchBook(String inputBookTitle) {

        System.out.println("inputBookTitle = " + inputBookTitle);

        for (BookDTO e : bookList) {

            System.out.println(e);

            if (inputBookTitle.equals(e.getTitle())) {
                System.out.println("검색하신 도서는 " + inputBookTitle + " 입니다.");
            } else {
                System.out.println("검색하신 도서는 없습니다. 안녕히가세요.");
            }

        }
    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("조회 결과가 없습니다..");
        } else {
            for (BookDTO book : bookList) {
                System.out.println("전체목록은 " + book + "입니다.");
            }
        }
    }

}
