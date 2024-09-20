package com.ohgiraffers.section04.Problem;

public class Calculrator {


    public void plus(int first, int second) throws  MultipleNotZeroException {

        if (first == 0 || second == 0) {
            throw new MultipleNotZeroException("곱하는 수가 0일수 없습니다.");

        }
    }

    public void plus2(int first, int second) throws DivideNotZeroException {
        if (first == 0 || second == 0) {
            throw new DivideNotZeroException("0 을 나눌수 없습니다.");
        }
    }

    public void hi(int first, int second){
    }
}
