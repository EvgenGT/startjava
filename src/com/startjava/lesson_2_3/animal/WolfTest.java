package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("мужской");
        wolf.setNickname("Aspen"); 
        wolf.setColor("светлый");
        wolf.setWeight(50);
        wolf.setAge(7);

        System.out.println(wolf.getGender());
        System.out.println(wolf.getNickname());
        System.out.println(wolf.getColor());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}