package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

// Главный класс программы
public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создание объекта для чтения ввода пользователя
        System.out.println("Введите имя первого игрока: ");
        String name1 = scanner.nextLine(); // чтение имени первого игрока
        System.out.println("Введите имя второго игрока: ");
        String name2 = scanner.nextLine(); // чтение имени второго игрока

        GuessNumber game = new GuessNumber(name1, name2); // создание объекта игры

        String userInput;
        do {
            game.startGame(); // начало игры

            // Вывод чисел, которые пытались угадать игроки
            System.out.println(Arrays.toString(Arrays.copyOf(game.p1.numbers, game.p1.attempt)));
            System.out.println(Arrays.toString(Arrays.copyOf(game.p2.numbers, game.p2.attempt)));

            // Сброс чисел и попыток игроков
            Arrays.fill(game.p1.numbers, 0);
            Arrays.fill(game.p2.numbers, 0);
            game.p1.attempt = 0;
            game.p2.attempt = 0;

            // Проверка, хочет ли пользователь продолжить игру
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                userInput = scanner.nextLine();
                if (!userInput.equals("yes") && !userInput.equals("no")) {
                    System.out.println("Введите yes или no");
                }
            } while (!userInput.equals("yes") && !userInput.equals("no"));
        } while (userInput.equals("yes")); // если пользователь хочет продолжить игру, начинается новая игра
    }
}