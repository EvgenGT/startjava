package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

// в данном классе вызываются методы и функции из другого класса (Calculator) для выполнения программы

public class CalculatorTest {
    public static void main(String[] args) {
        // Создание объекта Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);
        // Флаг для продолжения вычислений
        boolean continueCalculations = true;
        // Создание объекта DecimalFormat для форматирования вывода
        DecimalFormat df = new DecimalFormat("#.###");

        // Цикл продолжается, пока пользователь не решит прекратить вычисления
        while (continueCalculations) {
            // Запрос на ввод математического выражения
            System.out.print("Введите математическое выражение: ");
            // Чтение ввода пользователя
            String input = scanner.nextLine();
            // Разбиение введенного выражения на части
            String[] expression = input.split(" ");

            // Преобразование первого числа из String в int
            int num1 = Integer.parseInt(expression[0]);
            // Сохранение оператора
            String operator = expression[1];
            // Преобразование второго числа из String в int
            int num2 = Integer.parseInt(expression[2]);

            // Вычисление результата
            double result = Calculator.calculate(num1, operator, num2);

            // Проверка на неподдерживаемый оператор
            if (Double.isNaN(result)) {
                // Вывод сообщения об ошибке
                System.out.println("Ошибка: знак " + operator + " не поддерживается");
            } else {
                // Вывод введенного выражения и результата
                System.out.printf("%s = ", input);
                // Если результат - целое число
                if (result % 1 == 0) {
                    // Вывод результата без дробной части
                    System.out.printf("%.0f%n", result);
                } else {
                    // Вывод результата с дробной частью (три знака после запятой)
                    System.out.println(df.format(result));
                }
            }

            // Запрос на продолжение вычислений
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            // Чтение ответа пользователя
            String continueResponse = scanner.nextLine();
            // Обновление флага для продолжения вычислений
            continueCalculations = continueResponse.equalsIgnoreCase("yes");
        }
    }
}
