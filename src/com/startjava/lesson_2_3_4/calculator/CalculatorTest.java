package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

// в данном классе вызываются методы и функции из другого класса (Calculator) для выполнения программы

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); 
        Calculator start = new Calculator();

    String answer = "yes";
    while(answer.equals("yes")) {

            System.out.print("Введите первое число: ");
            int numberOne = console.nextInt();
            start.setNumberOne(numberOne);

            System.out.print("Введите знак математической операции: ");
            char sign = console.next().charAt(0);
            start.setSign(sign);

            System.out.print("Введите второе число: ");
            int numberTwo = console.nextInt();
            start.setNumberTwo(numberTwo);

            start.calculation();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = console.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        }
    }
}