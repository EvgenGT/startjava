public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("Задача № 1. Подсчет суммы четных и нечетных чисел");

        int min_m = -10;
        int evenSum = 0;
        int oddSum = 0;

        do {
            if (min_m % 2 == 0) {
                evenSum += min_m;
            } else {
                oddSum += min_m;
            }
            min_m++;
        } while (min_m <= 21);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n");
        System.out.println("Задача № 2. Вывод чисел в порядке убывания");

        int one = -1;
        int two = 5;
        int three = 10;
        int max = one;
        int min = one;

        for (int i = 1; i < 3; i++) {
            if (one > max) {
                max = one;
            } else if (two > max) {
                max = two;
            } else if (three > max) {
                max = three;
            }
            if (one < min) {
                min = one;
            } else if (two < min) {
                min = two;
            } else if (three < min) {
                min = three;
            }
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);

        System.out.println("\n");
        System.out.println("Задача № 3. Вывод реверсивного числа и суммы его цифр");

        int a = 1234;
        int sum = 0;
        
        while (a > 0) {
            System.out.print(a % 10);
            sum += a % 10;
            a /= 10;
        }
        System.out.println();
        System.out.println(sum);

        System.out.println("\n");
        System.out.println("Задача № 4. Вывод чисел в несколько строк");
        
        int hulfMin = 1;
        int hulfMax = 24;
        int counter = 0;
        int zero = 0;

        for (int i = hulfMin; i <= hulfMax; i +=2) {
            if (counter % 5 == 0) {
                System.out.println();
        }
        System.out.printf("%4s", i);
        counter++;
        }
        for (int i = 1; i <= 5; i +=2) {
            if (counter % 5 == 0) {
                System.out.println();
        }
        System.out.printf("%4s", + zero);
        counter++;
        }

        System.out.println("\n");
        System.out.println("Задача № 5. Проверка количества двоек числа на четность/нечетность");

        int number1 = 3242592;
        int number2 = number1;
        int count1 = 0;

        while (number1 > 0) {
            if (number1 % 10 == 2) {
                count1++;
            }
            number1 /= 10;
        }
        System.out.println();
    
        if (count1 % 2 == 0) {
            System.out.println("В " + number2 + " (четное) количество двоек - " + count1);
            } else if (count1 > 0) {
                System.out.println("В " + number2 + " (нечетное) количество двоек - " + count1);
        }

        System.out.println("\n");
        System.out.println("Задача № 6. Отображение геометрических фигур");

        int counter1 = 0;
        String star = "*";

        for (int i = 1; i <= 50; i++) {
            if (counter1 % 10 == 0) {
                System.out.println();
        }
        System.out.printf("%s", star);
        counter1++;
        }

        System.out.println("\n");
        
        int n = 5;
        int i = n; 
        int j = 1;
        
        while (i >= 1) {
            while (j <= i) {
                System.out.print("" + "#");
                j++;
            }
        System.out.println();
        j = 1;
         i--;
        }

        System.out.println("\n");

        int n1 = 1;
        int i1 = n1;
        int j1 = 1;
        
        do {
            while (j1 <= i1) {
                System.out.print("" + "$");
                j1++;
            }
        System.out.println();
        j1 = 1;
        i1++;
        
        } while (i1 <= 3);

        int n2 = 2;
        int i2 = n2;
        int j2 = 1;
        
        do {
            while (j2 <= i2) {
                System.out.print("" + "$");
                j2++;
            }
        System.out.println();
        j2 = 1;
        i2--;
        
        } while (i2 >= 1);
        
        System.out.println("\n");
        System.out.println("Задача № 7. Отображение ASCII-символов");

        System.out.printf("%s %s %s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        
        int a7 = 15;
        int a8 = 25;
        
        for (i = a7; i <= a8; i += 2) {
            System.out.printf("%4s %8s          %-1s %n", i, (char) i, Character.getName(i));
        }
        
        System.out.println("\n");
        System.out.println("Задача № 8. Проверка, является ли число палиндромом");

        int p1 = 1234321;
        int p2 = p1;
        long rev = 0;

        while (p1 > 0) {
            rev = (rev * 10) + (p1 % 10);
            p1 = p1 / 10;
        }
        if (p2 == rev) {
            System.out.println("число " + p2 + " является палиндромом");
        } else {
            System.out.println("число " + p2 + " не является палиндромом");
        }

        System.out.println("\n");
        System.out.println("Задача № 9. Проверка, является ли число счастливым");

        int p3 = 235147;
        int sum1 = 0;
        int sum2 = 0;
        
        // считает сумму первых трех цифр в числе
        for (i = p3 / 1000; i > 0; i /= 10) { 
            sum1 = sum1 + (i % 10);
        }
        // считает сумму последних трех цифр в числе
        for (j = p3 % 1000; j > 0; j /= 10) { 
            sum2 = sum2 + (j % 10);
        }
        if (sum1 == sum2) {
            System.out.println("Число " + p3 + " является счастливым");
            System.out.println("Сумма цифр " + p3 / 1000 + " = " + sum1 + " и " + "сумма цифр " + p3 % 1000 + " = " + sum2);
        } else {
            System.out.println("Число " + p3 + " не является счастливым");
            System.out.println("Сумма цифр " + p3 / 1000 + " = " + sum1 + ", а " + "сумма цифр " + p3 % 1000 + " = " + sum2);
        }
        System.out.println("\n");
        System.out.println("Задача № 10. Отображение таблицы умножения Пифагора");

        System.out.printf("%22s \n","ТАБЛИЦА   ПИФАГОРА");
        System.out.println();
        System.out.printf("%6s%3s%3s%3s%3s%3s%3s%3s", 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println();
        System.out.printf("---------------------------");
        System.out.print("\n");

        for (i = 2; i < 10; i++) {
            for (j = 1; j < 10; j++)
            System.out.printf("%3s", i * j);
            System.out.println();
            System.out.print("\n");
        }
        System.out.println("\n");
        System.out.println("Задача № 11. Отображение таблицы умножения Пифагора");
        System.out.printf("%22s \n","ТАБЛИЦА   ПИФАГОРА");
        System.out.println();
        System.out.print("    ");
        
        for (i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n----------------------------");

        for (i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for (j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
            System.out.print("\n");
        }
    }
}




















































