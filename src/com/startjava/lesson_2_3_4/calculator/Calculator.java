package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    // Метод для вычисления результата
    public static double calculate(int num1, String operator, int num2) {
        // Выбор оператора
        switch (operator) {
            case "+":
                // Сложение
                return num1 + num2;
            case "-":
                // Вычитание
                return num1 - num2;
            case "*":
                // Умножение
                return num1 * num2;
            case "/":
                // Деление, если второе число не равно нулю
                if (num2 != 0) {
                    return (double) num1 / num2;
                } else {
                    // Возвращение NaN при делении на ноль
                    return Double.NaN;
                }
            case "^":
                // Возведение в степень
                return Math.pow(num1, num2);
            default:
                // Возвращение NaN при неподдерживаемом операторе
                return Double.NaN;
        }
    }
}






