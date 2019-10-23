package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Given a sorted array of unique values,
// find an element where its value is equal to the index. O(log n).
public class Q20191013 {

    public Q20191013() {
        printResult(getResult(input()));
    }

    private int[] input() {
        System.out.println("정렬된 정수 배열을 입력하세요 ex)[-30, 1, 4, 60]");
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<String>(
                Arrays.asList(scanner.nextLine()
                .replace("[","")
                .replace("]","")
                .split(", ")));

        int[] arr = new int[input.size()];
        for (int i=0; i<input.size(); i++) {
            try {
                arr[i] = Integer.parseInt(input.get(i));
            } catch (NumberFormatException e) {
                arr[i] = -1;
                System.out.println("잘못된 입력 양식입니다. 원하는 결과가 안 나올 수도 있습니다. 입력 예시를 참고해주세요.");
            }
        }

        return arr;
    }

    private int getResult(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (i == arr[i]) {
                return i;
            } else if (i < arr[i]) { break; }
        }
        return -1;
    }

    private void printResult(int result) {
        if (result == -1) { System.out.println("인덱스 값과 같은 원소 값이 없습니다!"); }
        else { System.out.println(result); }
    }

}
