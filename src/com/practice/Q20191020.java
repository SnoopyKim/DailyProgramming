package com.practice;

import java.util.Scanner;

// Q: Given an integer, check if it is a power of 4.
public class Q20191020 {

    public Q20191020() {
        printResult(checkPowerOf4(input()));
    }

    private int input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        return scan.nextInt();
    }

    private boolean checkPowerOf4(int num) {
        while(num!=1) {
            if(num%4!=0) { return false; }
            num /= 4;
        }
        return true;
    }

    private void printResult(boolean check) {
        if (check) { System.out.println("4의 거듭제곱입니다."); }
        else { System.out.println("4의 거듭제곱이 아닙니다."); }
    }
}
