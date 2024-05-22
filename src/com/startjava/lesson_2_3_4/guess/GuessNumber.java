package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

// Класс GuessNumber представляет игру
class GuessNumber {
    Player p1; // первый игрок
    Player p2; // второй игрок
    int targetNumber; // число, которое нужно угадать

    // Конструктор класса GuessNumber
    public GuessNumber(String name1, String name2) {
        this.p1 = new Player(name1); // инициализация первого игрока
        this.p2 = new Player(name2); // инициализация второго игрока
    }

    // Метод для начала игры
    public void startGame() {
        Random rand = new Random(); // создание объекта для генерации случайных чисел
        targetNumber = rand.nextInt(100) + 1; // генерация числа, которое нужно угадать
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");

        // Цикл игры
        while (true) {
            if (makeGuess(p1)) { // если первый игрок угадал число, игра заканчивается
                return;
            }
            if (makeGuess(p2)) { // если второй игрок угадал число, игра заканчивается
                return;
            }
        }
    }

    // Метод для выполнения попытки угадать число
    @SuppressWarnings("checkstyle:LineLength")
    private boolean makeGuess(Player p) {
        if (p.attempt == 10) { // если у игрока закончились попытки
            System.out.println("У " + p.name + " закончились попытки");
            return true;
        }

        Scanner scanner = new Scanner(System.in); // создание объекта для чтения ввода пользователя
        System.out.println(p.name + ", ваша очередь угадать число: ");
        p.numbers[p.attempt] = scanner.nextInt(); // чтение числа, которое ввел игрок

        // Проверка, угадал ли игрок число
        if (p.numbers[p.attempt] == targetNumber) {
            System.out.println("Игрок " + p.name + " угадал " + targetNumber + " с " + (p.attempt + 1) + " попытки.");
            return true;
        } else if (p.numbers[p.attempt] > targetNumber) {
            System.out.println("Число " + p.numbers[p.attempt] + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + p.numbers[p.attempt] + " меньше того, что загадал компьютер");
        }

        p.attempt++; // увеличение количества попыток игрока
        return false;
    }
}