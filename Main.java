package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Задача 1.
        String[] arr = {"jej", "lol", "memes", "problems"};

        System.out.println(Arrays.toString(arr));
        swapElements(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

        //Задача 2.
        List<String> list = convertToList(arr);
        System.out.println("Преобразование : " + list);

        //Задача 3.

        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Масса первого ящика с апельсинами: " + orange1Weigth);
        System.out.println("Масса второго ящика с апельсинами: " + orange2Weigth);
        System.out.println("Масса ящика с яблоками: " + appleWeigth);

        System.out.println("Сравнение масс первых ящиков с апельсинами и с яблоками: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнение масс вторых ящиков с апельсинами и с яблоками: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}
