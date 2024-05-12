package com.startjava.lesson_2_3_4.array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTheme {
    public static void main(String[] args) {

        System.out.println("Задача № 1. Реверс значений массива");
        int[] massive = {1, 7, 4, 5, 2, 6, 3};

        int[] reversed = new int[massive.length];
        int j1 = 0;
        for (int number : massive) {
            reversed[massive.length - 1 - j1] = number;
            j1++;
        }
        System.out.println("   " + "До реверса: " + Arrays.toString(massive));
        System.out.println("После реверса: " + Arrays.toString(reversed));


        System.out.println("\n");
        System.out.println("Задача № 2. Вычисление факториала");

        // 1. Заполнение массива цифрами по возрастанию
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        // 2. Вычисление факториала 8!
        int factorial = 1;
        for (int i = 1; i <= 8; i++) {
            factorial *= i;
        }
        // 3. Отображение произведения с использованием тернарного оператора
        String result = "";
        for (int number : numbers) {
            result += ((number == 0) ? "" : (number + " " + ((number == numbers.length - 1) ? "=" : "* ")));
        }
        System.out.println(result + " " + factorial);

        System.out.println("\n");
        System.out.println("Задача № 3. Удаление элементов массива");

        double[] realNumbers = {0.100, 0.11, 0.685, 0.2, 0.07, 0.9, 0.61, 0.12,
                0.55, 0.682, 0.21, 0.71, 0.9, 0.58, 0.007};
        int[] mod = new int[realNumbers.length];
        int zero = 0;
        DecimalFormat df = new DecimalFormat("0.000");

        // вычисление индекса средней ячейки массива
        int middleIndex = (realNumbers.length - 1) / 2;

        // вывод исходного массива
        System.out.println("Исходный массив: " + Arrays.toString(realNumbers));

        // расчет модифицированного массива
        for (int i = 0; i < realNumbers.length; i++) {
            if (realNumbers[i] < realNumbers[middleIndex]) {
                realNumbers[i] = 0;
            }
        }
        // вывод модифицированного массива
        System.out.println("Модифицированный массив: " + Arrays.toString(realNumbers));

        for (double number1 : realNumbers) {
            if (number1 == 0.0) {
                zero++;
            }
        }
        System.out.println("Количество обнуленных ячеек: " + zero);

        for (double number2 : realNumbers) {
            System.out.print(df.format(number2) + "; ");
        }
        System.out.println();

        System.out.println("\n");
        System.out.println("Задача № 4. Вывод алфавита лесенкой");

        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('Z' - i);
        }
        for (int i = 0; i <= alphabet.length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("Задача № 5. Заполнение массива уникальными числами");

        int[] randomNumber = new int[30];
        boolean[] used = new boolean[30];

        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = (int) (Math.random() * (100 - 60)) + 60;
        }
        Arrays.sort(randomNumber);

        for (int i = 0; i < randomNumber.length; i++) {
            System.out.print(randomNumber[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n");
        System.out.println("Задача № 6. Игра “Виселица”");

        String[] words = {"JAVA"}; // Массив слов для угадывания
        int maxAttempts = 7; // Максимальное количество попыток
        String[] hangmanStages = { // Массив строк, представляющих разные стадии виселицы
                "",
                "O",
                "O\n/",
                "O\n/|",
                "O\n/|\\",
                "O\n/|\\\n/",
                "O\n/|\\\n/ \\"
        };

        Random random = new Random(); // Создание объекта Random
        String word = words[random.nextInt(words.length)]; // Выбор случайного слова из массива
        char[] guessedWord = new char[word.length()]; // Создание массива для угаданного слова
        Arrays.fill(guessedWord, '*'); // Заполнение массива символами '*'
        int attempts = maxAttempts; // Установка начального количества попыток
        String wrongLetters = ""; // Создание строки для хранения неправильных букв

        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для чтения ввода пользователя
        while (attempts > 0 && new String(guessedWord).contains("*")) { // Цикл продолжается, пока есть попытки и в угаданном слове есть '*'
            System.out.println("Загаданное слово: " + new String(guessedWord)); // Вывод угаданного слова
            System.out.println("Осталось попыток: " + attempts); // Вывод количества оставшихся попыток
            System.out.println("Виселица:\n" + hangmanStages[maxAttempts - attempts]); // Вывод текущей стадии виселицы
            System.out.println("Ошибочные буквы: " + wrongLetters); // Вывод неправильных букв
            System.out.print("Введите букву: "); // Просьба ввести букву
            String input = scanner.next().toUpperCase(); // Чтение ввода пользователя и преобразование его в верхний регистр

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) { // Проверка, является ли ввод одной буквой
                System.out.println("Ошибка: введите только одну букву."); // Вывод сообщения об ошибке
                continue; // Пропуск оставшейся части цикла и переход к следующей итерации
            }

            char guess = input.charAt(0); // Получение введенной буквы

            if (wrongLetters.contains(String.valueOf(guess)) || new String(guessedWord).contains(String.valueOf(guess))) { // Проверка, была ли уже введена эта буква
                System.out.println("Вы уже вводили эту букву."); // Вывод сообщения об ошибке
                continue; // Пропуск оставшейся части цикла и переход к следующей итерации
            }

            if (word.contains(String.valueOf(guess))) { // Если введенная буква присутствует в слове
                for (int i = 0; i < word.length(); i++) { // Цикл по всем буквам слова
                    if (word.charAt(i) == guess) { // Если буква на текущей позиции совпадает с введенной буквой
                        guessedWord[i] = guess; // Замена соответствующего символа в угаданном слове
                    }
                }
                if (attempts < maxAttempts) { // Если количество попыток меньше максимального
                    attempts++; // Увеличение количества попыток
                }
            } else { // Если введенная буква отсутствует в слове
                attempts--; // Уменьшение количества попыток
                wrongLetters += guess + " "; // Добавление введенной буквы в список неправильных букв
            }
        }

        if (attempts > 0) { // Если остались попытки
            System.out.println("Поздравляем, вы угадали слово: " + word); // Вывод сообщения о победе
        } else { // Если попытки закончились
            System.out.println("К сожалению, вы не угадали слово: " + word); // Вывод сообщения о поражении
        }
    }
}











