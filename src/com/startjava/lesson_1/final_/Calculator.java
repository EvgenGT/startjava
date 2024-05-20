package com.startjava.lesson_1.final_;

public class Calculator {
    public static void main(String[] args) {
        // Переменные
        int a = 5;
        int b = 3;
        int exponent = a;
        // Переменные для использования в циклах
        int sum = a + b;
        int difference = a - b;
        int multi = a * b;
        int divide = a / b;
        int modul = a % b;
        // Переменные для обозначения математических знаков
        char sumChar = '+';
        char differenceChar = '-';
        char multiChar = '*';
        char divideChar = '/';
        char modulChar = '%';
        char exponentChar = '^';
        // Переменная для проверки правильности выполнения программы. Здесь менять нужный знак char
        int result = sumChar;

        if (result == '+') {
            System.out.println(a + " " + sumChar + " " + b + " = " + sum);

        } else if (result == '-') {
            System.out.println(a + " " + differenceChar + " " + b + " = " + difference);

        } else if (result == '*') {
            System.out.println(a + " " + multiChar + " " + b + " = " + multi);

        } else if (result == '/') {
            System.out.println(a + " " + divideChar + " " + b + " = " + divide);

        } else if (result == '%') {
            System.out.println(a + " " + modulChar + " " + b + " = " + modul);

        } else if (result == '^') {
            for (int i = 1; i < b; i++) {
                exponent *= a;
            }
            System.out.println(a + " " + exponentChar + " " + b + " = " + exponent);
        }
    }
}