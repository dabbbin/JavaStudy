package com.ohgiraffers.section01.literal;

public class Application1 {

    // /**/ : ctrl + shift + /
    public static void main(String[] args){
/*
        System.out.print("a");
        System.out.print("a");
        System.out.println("b"); // b/개행
*/
//        System.out.println("c");
//        System.out.println("d");
        System.out.println("");
        System.out.print("hello");
        System.out.println(123); //정수 출력
        //shift + enter
        //실수 출력
        System.out.println(1.23);

        //문자 형태 값 출력 ''
        System.out.println('a'); //문자 형태 값은 홑따옴표(single quotation)로 감싸주어야 함

     //   System.out.println('ab'); //두 개 이상의 문자로 취급하지 않기 때문에 에러 발생
     //   System.out.println(''); //아무 문자도 기록되지 않는 경우도 에러가 발생한다.
        System.out.println('1'); //값은 수이지만 홑따옴표로 감싸져서 문자 '1'로 인지한다.

        //문자열 형태 값 출력
        System.out.println("안녕하세요"); //문자열은 문자 여러 개가 나열된 형태를 말하며 쌍따옴표(double-quotation) 감싸야함

        System.out.println("123"); //문자열 123, 정수이지만 "" 이니까 문자열임
        System.out.println(""); //문자열은 아무 값도 없어도 괜찮다.
        System.out.println("a"); //한 개의 문자도 쌍따옴표로 감싸면 문자열이다.(!=  문자 a )

        //논리형태의 값 출력
        System.out.println(true);
        System.out.println(false); //true 혹은 false 값을 논리형이라 한다.

    }
}
