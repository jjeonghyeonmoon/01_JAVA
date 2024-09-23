package com.ohgiraffers.problem.no1;

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

    public void searchBook(String title) {
        bookList.

    }

    public void displayAll() {
    }

    public List<BookDTO> sortedBookList(int type) {
    }

    public void printBookList(List<BookDTO> printList) {
    }
}