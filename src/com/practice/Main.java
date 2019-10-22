package com.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(true) {
            // input date for get class name
            System.out.println("날짜를 입력하세요. '0'을 입력하시면 종료합니다. ex)20191020");
            String date = new Scanner(System.in).next();
            if (date.equals("0")) { return; }
            String className = "com.practice.Q".concat(date);

            try {
                // find class and get default constructor
                Class<?> Qclass = Class.forName(className);
                Class[] types = {};
                Constructor constructor = Qclass.getConstructor(types);

                // run constructor of the class that I found.
                Object[] parameters = {};
                constructor.newInstance(parameters);

            } catch (ClassNotFoundException | NoSuchMethodException e) {
                // if class or default constructor doesnt exist.
                System.out.println("해당 날짜의 문제는 없습니다.");

            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                // if constructor's parameters have wrong value
                System.out.println("해당 날짜 생성자에 인수 값이 잘못되었습니다.");
                e.printStackTrace();
            }
        }
    }
}
