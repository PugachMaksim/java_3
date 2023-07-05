package ru.seminar3.java;
//Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;


public class program {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList <Integer>arrayList = new ArrayList<>();
        int size = random.nextInt(10, 16);
        for (int i = 0; i < size; i++){
            arrayList.add(random.nextInt(0, 11));
        }
        System.out.println("Наш массив:" + arrayList);

        System.out.println("Минимальное значение: " + Collections.min(arrayList));
        System.out.println("Максимальное значение: " + Collections.max(arrayList));
        double sum = 0;
        for (int k = 0; k < size; k++){
            sum = sum + arrayList.get(k);
        }
        double srednee = sum / arrayList.size();
        System.out.println("Среднее значение: " + srednee);

        arrayList.removeIf(num -> num%2==0);
        System.out.println("Удалили четные:" + arrayList);
    }
}