package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {

        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Striker Eureka");
        jaeger1.setMark("Mark-5");
        jaeger1.setWeight(6650);

        Jaeger jaeger2 = new Jaeger("Coyote Tango", "Mark-1", 7450);

        System.out.println(jaeger1.getModelName() + ", " + jaeger1.getMark() + ", " +
                jaeger1.getWeight());

        System.out.println(jaeger2.getModelName() + ", " + jaeger2.getMark() + ", "
                + jaeger2.getWeight());

        jaeger1.move();
        jaeger2.attack();
    }
}