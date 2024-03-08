package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {

        /*
         *자료형 별 값의 최대 범위를 벗어나는 경우
         * 발생한 carry 를 버림처리하고 sign bit 를 반전시켜 최소값으로 순환시킨다.
         * */


//        byte num1 = 128;  오류
//        byte num1 = -129; 오류
        byte num1 = 127; //byte 의 최대 저장 범위
        System.out.println(num1);
        num1++;
        System.out.println("num1 overflow =" + num1); //-128, byte 의 최소 저장 범위



    }
}
