package com.startjava.lesson_2_3_4.guess;

// Класс Player представляет игрока
class Player {
    String name; // имя игрока
    int[] numbers = new int[10]; // массив для хранения чисел, которые игрок пытается угадать
    int attempt = 0; // количество попыток игрока

    // Конструктор класса Player
    public Player(String name) {
        this.name = name; // инициализация имени игрока
    }
}