package com.ohgiraffers._250429.question.notSorting;

public class Question6 {
    public static void main(String[] args) {
        //6.
        //
        //반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요.
        //
        //-- 출력 예시 --
        //abcdefghijklmnopqrstuvwxyz //97~122

        char a;

        for(a = 97; a <= 122; a++) {
            System.out.print(a);
        }

    }
}
