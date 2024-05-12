package com.startjava.lesson_1.base;
public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задача № 1. Вывод характеристик компьютера");

        byte memory = 25;
        System.out.println("Объем оперативной памяти, Гб: " + memory);

        int memory1 = 25600;
        System.out.println("Объем оперативной памяти, Мб: " + memory1);

        short hd = 2000;
        System.out.println("Объем жесткого диска, Гб: " + hd);

        long swap = 10;
        System.out.println("Объем SWAP-файла, Гб: " + swap);

        float cpu = 1.8f;
        System.out.println("Частота процессора, Гц: " + cpu);

        double driverVersion = 20.19;
        System.out.println("Версия драйвера: " + driverVersion);

        char nameIntelModel = 105;
        char nameIntelModel1 = 51;
        System.out.println("Модель процессора: " + nameIntelModel + nameIntelModel1);

        int intel = 5;
        int amd = 10;
        boolean i = intel < amd;
        System.out.println("Процессор " + i);

        System.out.println();
        System.out.println("Задача № 2. Расчет стоимости товара со скидкой");

        short pen = 100;
        short book = 200;
        short discount = 11;
        double sumDiscount = (300 * 0.11);
        int sum = pen + book;
        double sumWithoutDiscount = sum - sumDiscount;

        System.out.println("Общая стоимость товаров без скидки, руб.: " + sum);
        System.out.println("Сумма скидки, руб.: " + sumDiscount);
        System.out.println("Общая стоимость товаров со скидкой, руб.: " + sumWithoutDiscount);

        System.out.println();
        System.out.println("Задача № 3. Вывод слова JAVA");

        System.out.println("   J     a  v     v  a");
        System.out.println("   J    a a  v   v  a a");
        System.out.println("J  J   aaaaa  V V  aaaaa");
        System.out.println(" JJ   a     a  V  a     a");

        System.out.println();
        System.out.println("Задача № 4. Вывод min и max значений целых числовых типов");

        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;

        System.out.println("maxByte, первоначальное значение = " + maxByte);
        System.out.println("maxByte, значение после инкремента на единицу = " + (maxByte++));
        System.out.println("maxByte, значение после декремента на единицу = " + (maxByte--));

        System.out.println("maxShort, первоначальное значение = " + maxShort);
        System.out.println("maxShort, значение после инкремента на единицу = " + (maxShort++));
        System.out.println("maxShort, значение после декремента на единицу = " + (maxShort--));

        System.out.println("maxInt, первоначальное значение = " + maxInt);
        System.out.println("maxInt, значение после инкремента на единицу = " + (maxInt++));
        System.out.println("maxInt, значение после декремента на единицу = " + (maxInt--));

        System.out.println("maxLong, первоначальное значение = " + maxLong);
        System.out.println("maxLong, значение после инкремента на единицу = " + (maxLong++));
        System.out.println("maxLong, значение после декремента на единицу = " + (maxLong--));

        System.out.println();
        System.out.println("Задача № 5. Перестановка значений переменных");

        int a = 2;
        int b = 5;
        int c = a;
        int c1 = a + b;

        System.out.println();
        System.out.println("Способ 1: с помощью третьей переменной");
        System.out.println("исходное значение: a = " + a);
        System.out.println("исходное значение: b = " + b);

        System.out.println("новое значение: a = " + b);
        System.out.println("новое значение: b = " + c);
        
        System.out.println();
        System.out.println("Способ 2: с помощью арифметических операций");
        System.out.println("исходное значение: a = " + c);
        System.out.println("исходное значение: b = " + b);
        System.out.println("новое значение: a = " + (c1 - c));
        System.out.println("новое значение: b = " + (c1 - b));

        System.out.println();
        System.out.println("Способ 3: с помощью побитовой операции");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("После замены: a = " + a + ", b = " + b);

        System.out.println();
        System.out.println("Задача № 6. Вывод символов и их кодов");

        char d = 36;
        char e = 42;
        char f = 64;
        char g = 124;
        char h = 126;
        System.out.println("переменная: d = " + (int) d + " и ее символ: " + d);
        System.out.println("переменная: e = " + (int) e + " и ее символ: " + e);
        System.out.println("переменная: f = " + (int) f + " и ее символ: " + f);
        System.out.println("переменная: g = " + (int) g + " и ее символ: " + g);
        System.out.println("переменная: h = " + (int) h + " и ее символ: " + h);

        System.out.println();
        System.out.println("Задача № 7. Вывод в консоль ASCII-арт Дюка");

        char k = '/';
        char l = '\\';
        char m = '_';
        char n = '(';
        char o = ')';

        System.out.println("    " + k + " " + l);
        System.out.println("   " + k +"   " + l);
        System.out.println("  " + k + m + n + "  " + o + l);
        System.out.println(" " + k +"       " + l);
        System.out.println("" + k + m + m + m + m + k + l + m + m + m + l);

        System.out.println();
        System.out.println("Задача № 8. Вывод количества сотен, десятков и единиц числа");

        int num = 123;
        int num1 = num / 100 % 10;
        int num2 = num / 10 % 10;
        int num3 = num % 10;

        System.out.println("число " + num + " содержит: ");
        System.out.println("сотен = " + num1);
        System.out.println("десятков = " + num2);
        System.out.println("единиц = " + num3);
        System.out.println("сумма его цифр = " + (num1 + num2 + num3));
        System.out.println("произведение = " + (num1 * num2 * num3));

        System.out.println();
        System.out.println("Задача № 9. Вывод времени");

        int second = 86399;
        int hour = second / 3600;             // часы
        int min = second % 3600 / 60;         // минуты
        int sec = second % 60;                // секунды

        System.out.println(hour + ":" + min + ":" + sec);
    }
}