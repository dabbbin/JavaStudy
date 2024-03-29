package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        //정수와 정수의 연산
        System.out.println("============== 정수와 정수의 연산 =============");
        System.out.println(123 + 456); //579
        System.out.println(123 - 23);
        System.out.println(123 * 10); //곱
        System.out.println( 123 / 10); //나누기 - 몫 (페이징)
        System.out.println(123 % 10); //나누기 - 나머지 (홀/짝)

        System.out.println("============== 실수와 실수의 연산 =============");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23-0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23/ 10.0);
        System.out.println(1.23 % 5.0); //실수일 땐, 약간의 오차가 생긴다. 해결? 실수 -> 정수 -> 실수 / 금융권**

        //정수와 실수의 연산의 결과는 항상 실수가 나온다.
        System.out.println("============== 정수와 실수의 연산 =============");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5); //정수와 실수 계산 시,,, 무조건 실수로 바뀜!!!!
        System.out.println(123 / 0.5); //246.0
        System.out.println(123 % 0.5); //0.0

        //문자의 연산
        System.out.println("============== 문자와 문자의 연산 =============");
        System.out.println('a' + 'b'); //195
        System.out.println('a' - 'b'); //-1
        System.out.println('a' * 'b'); //9506
        System.out.println('a' / 'b'); //0
        System.out.println('a' % 'b'); //97

        System.out.println("============== 문자와 정수의 연산 =============");
        System.out.println('a' + 1.0); //98
        System.out.println('a' - 1.0); //96
        System.out.println('a' * 2.0); //194
        System.out.println('a' / 2.0); //48
        System.out.println('a' % 2.0) ; //2
        /*
        * 결론은 문자는 내부적으로 숫자 취급을 한다.
        * 결국 지금까지 숫자끼리의 연산을 본 것이고, 숫자(정수 혹은 실수) 형태의 값은 수학의 사칙연산과
        *  mod 연산이 가능하다.
        * */

        //문자열의 연산
        //문자열과 문자열의 '+'  연산 결과는 문자열 합치기(이어 붙이기)가 된다.
        System.out.println("============== 문자열과 문자열의 연산 =============");
        System.out.println("hello" + "world");
//        System.out.println("hello" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");

        //문자열과 다른 형태의 값 연산
        System.out.println("============== 문자열과 다른 형태의 값 연산 =============");
        System.out.println("helloworld" + 123); //helloworld123
        System.out.println("helloworld" + 123.456); //helloworld123.456
        System.out.println("helloworld" + 'a'); //helloworlda : 문자와 문자는 숫자 / 문자열과 문자는 문자열
        System.out.println("helloworld" + true); //helloworldtrue

        //숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기 결과가 된다.
        System.out.println("============== 문자열 형태의 숫자값 '+' 연산 =============");
        System.out.println("123" + "456"); //123456

        //논리값은 사칙연산 불가.
        System.out.println("============== 논리값 '+' 연산 =============");
//        System.out.println(true + false); //에러발생
//        System.out.println(true - false); //에러발생
//        System.out.println(true * false); //에러발생
//        System.out.println(true / false); //에러발생
//        System.out.println(true % false); //에러발생
//        System.out.println(true - true); //에러발생

//        System.out.println(true + 1.0); //에러 발생
//        System.out.println(true - 1.0); //에러 발생
//        System.out.println(true * 1.0); //에러 발생
//        System.out.println(true / 1.0); //에러 발생
//        System.out.println(true % 1.0); //에러 발생

        //문자는 내부적으로 숫자 취급을 하기 때문에 결국 논리값과 숫자의 연산과 동일한 의미이다.
//        System.out.println(true + 'a'); //에러 발생
//        System.out.println(true - 'a'); //에러 발생
//        System.out.println(true * 'a'); //에러 발생
//        System.out.println(true / 'a'); //에러 발생
//        System.out.println(true % 'a'); //에러 발생

        //논리값과 문자열의 연산은 '+'연산만 사용가능하다.
        System.out.println("============== 논리와 문자열의 연산 =============");
        System.out.println(true + "a"); //truea
//        System.out.println(true - "a");
//        System.out.println(true * "a");
//        System.out.println(true / "a");
//        System.out.println(true % "a");
        }
}
