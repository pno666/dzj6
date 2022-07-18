package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SqrServices service = new SqrServices();

        System.out.println("Квадротов чисел от 10 до 99 в заданом диапозоне: " + service.calcSqr(101,150));
    }
}
