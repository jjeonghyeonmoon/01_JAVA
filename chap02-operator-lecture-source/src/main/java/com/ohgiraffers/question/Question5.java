package com.ohgiraffers.question;

public class Question5 {

    public static void main(String[] args) {

        int lineNum = 1;

        Question5 q = new Question5();
        lineNum = q.string(lineNum,"이승현",50,66,74);
        lineNum = q.string(lineNum,"정은미",37,67,73);
        lineNum = q.string(lineNum,"문정현",85,85,82);
        lineNum = q.string(lineNum,"윤이정",61,34,89);
        lineNum = q.string(lineNum,"박재민",66,88,99);
        lineNum = q.string(lineNum,"김경훈",97,100,24);
        lineNum = q.string(lineNum,"조평훈",0,0,0);

    }

    public int string (int lineNum ,String Name,int a,int b,int c){
        System.out.println(lineNum + ". " + Name +" " + "국어: "+ a + " 영어: "+ b + " 수학:" + c);
        return lineNum+1;

    }
}
