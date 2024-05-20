package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задача № 1. Перевод псевдокода на язык Java");
        int age = 18;

        if (age > 18) {
            System.out.println("вы 18 лет или старше");
        } else {
            System.out.println("вам 18 лет или меньше");
        }

        double height = 1.8;

        if (height <= 1.8) {
            System.out.println("ваш рост 1,8 м или меньше");
        } else {
            System.out.println("ваш рост 1,8 м или больше");
        }

        String name = "Michael";
        char x = name.charAt(0);

        if (x == 'M') {
            System.out.println("Первая буква имени - " + x);
        } else if (x == 'I') {
            System.out.println("Ваше имя начинается на букву - " + x);
        } else {
            System.out.println("Имя не начинается на букву M или I");
        }

        System.out.println();
        System.out.println("Задача № 2. Поиск большего числа");

        int a = 10;
        int b = 20;
        int max_a = a > b ? a : b;
        int min_a = a < b ? a : b;

        System.out.println("a = " + a + "; b = " + b);

        if (a > b) {
            System.out.println("переменная a = " + max_a + " и она больше, чем переменная b");
        } else if (a == b) {
            System.out.println("переменные a и b равны");
        } else if (a < b) {
            System.out.println("переменная a = " + min_a + " и она меньше, чем переменная b");
        }

        System.out.println();
        System.out.println("Задача № 3. Проверка числа");
        int unit = 10;

        if (unit < 0 & unit % 2 == 0) {
            System.out.println("число " + unit + " является отрицательным и четным");
        } else if (unit > 0 & unit % 2 == 0) {
            System.out.println("число " + unit + " является положительным и четным");
        } else if (unit < 0) {
            System.out.println("число " + unit + " является отрицательным и нечетным");
        } else if (unit > 0) {
            System.out.println("число " + unit + " является положительным и нечетным");
        }

        System.out.println();
        System.out.println("Задача № 4. Поиск одинаковых цифр в числах");

        int one = 123;
        int two = 223;
        int num1 = one / 100 % 10;
        int num2 = one / 10 % 10;
        int num3 = one % 10;
        int num4 = two / 100 % 10;
        int num5 = two / 10 % 10;
        int num6 = two % 10;
        if (num1 == num4) {
            System.out.println("равны сотни");
        }
        if (num2 == num5) {
            System.out.println("равны десятки");
        }
        if (num3 == num6) {
            System.out.println("равны единицы");
        }

        System.out.println();
        System.out.println("Задача № 5. Определение символа по его коду");

        char arg = '\u005E';
        boolean isArg1 = (arg >= 'a' && arg <= 'z');
        boolean isArg2 = (arg >= 'A' && arg <= 'Z');
        boolean isArg3 = (arg >= '0' && arg <= '9');

        if (isArg1 == true) {
            System.out.println("Символ " + arg + " это строчная буква");

        } else if (isArg2 == true) {
            System.out.println("Символ " + arg + " это прописная буква");

        } else if (isArg3 == true) {
            System.out.println("Символ " + arg + " это цифра");

        } else {
            System.out.println("Символ " + arg + " это не цифра и не буква");
        }

        System.out.println();
        System.out.println("Задача № 6. Подсчет суммы вклада и начисленных банком %");

        double depo = 301000;
        double rate1 = 5;
        double rate2 = 7;
        double rate3 = 10;

        if (depo < 100000) {
            double depo1 = depo * rate1 / 100;
            double sum1 = depo1 + depo;
            System.out.println("Сумма вклада = " + depo + " руб.");
            System.out.println("Сумма начисленных процентов = " + depo1 + " руб.");
            System.out.println("Итоговая сумма с процентами = " + sum1 + " руб.");

        } else if (depo >= 100000 && depo < 300000) {
            double depo2 = depo * rate2 / 100;
            double sum2 = depo2 + depo;
            System.out.println("Сумма вклада = " + depo + " руб.");
            System.out.println("Сумма начисленных процентов = " + depo2 + " руб.");
            System.out.println("Итоговая сумма с процентами = " + sum2 + " руб.");

        } else if (depo >= 300000) {
            double depo3 = depo * rate3 / 100;
            double sum3 = depo3 + depo;
            System.out.println("Сумма вклада = " + depo + " руб.");
            System.out.println("Сумма начисленных процентов = " + depo3 + " руб.");
            System.out.println("Итоговая сумма с процентами = " + sum3 + " руб.");
        }

        System.out.println();
        System.out.println("Задача № 7. Определение оценки по предметам");

        double hist = 73;
        double prog = 92;
        double mediumPercent = (hist + prog) / 2;
        int grade = 2;
        int grade1 = 2;

        if (hist <= 60) {
            grade = 2;
            System.out.println("оценка по истории - " + grade);
        } else if (hist > 60 && hist < 73) {
            grade = 3;
            System.out.println("оценка по истории - " + grade);
        } else if (hist >= 73 && hist < 91) {
            grade = 4;
            System.out.println("оценка по истории - " + grade);
        } else if (hist >= 91) {
            grade = 5;
            System.out.println("оценка по истории - " + grade);
        }
        if (prog <= 60) {
            grade1 = 2;
            System.out.println("оценка по программированию - " + grade1);
        } else if (prog > 60 && prog < 73) {
            grade1 = 3;
            System.out.println("оценка по программированию - " + grade1);
        } else if (prog >= 73 && prog < 91) {
            grade1 = 4;
            System.out.println("оценка по программированию - " + grade1);
        } else if (prog >= 91) {
            grade1 = 5;
            System.out.println("оценка по программированию - " + grade1);
        }
        System.out.println("Средний балл оценок по предметам = " + (grade + grade1) / 2.f);
        System.out.println("Средний % по предметам = " + mediumPercent);

        System.out.println();
        System.out.println("Задача № 8. Расчет годовой прибыли");

        double sale = 13000;
        double rent = 5000;
        double coast = 9000;

        double saleYear = sale * 12;
        double rentYear = rent * 12;
        double coastYear = coast * 12;
        double profit = saleYear - (rentYear + coastYear);
        char plus = '\u002B';

        if (profit > 0) {
            System.out.println("Прибыль за год: " + plus + profit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profit + " руб.");
        }
    }
}
















   














    


    


        




