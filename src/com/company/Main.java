package com.company;

import java.util.Scanner;

public class Main {

    static String name;
    static int age;
    static float temperature;
    // основное задание

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте!Как вас зовут?");
        name = in.nextLine();
        System.out.println("Отлично)" + name + ", сколько вам лет?");
        age = in.nextInt();
        System.out.println("Теперь введите температуру на улице сегодня: ");
        temperature = in.nextFloat();
        in.close();
        if (age < 20 && (temperature < 0 || temperature > 28.0)) {
            message(1);
        } else if (age >= 20 && age < 45 && (temperature >= 30 || temperature <= -20.0)) {
            message(2);
        } else if (age >= 45 && (temperature < -10 || temperature > 25)) {
            message(3);
        } else {
            message(0);
        }

        // на сообразительность

        int max = 107; // задаем максимальное число диапазона переменной max
        int rnd = generateRandomAge(max);//присваиваем значение полученное в методе переменной rnd
        System.out.println("Случайное число(0-107): " + rnd);// вывод в консоль значения перменной rnd

    }

    public static void message(int num) {

        switch (num) {
            case 1:
                System.out.println("Не выходи. Температура меньше 0 или больше +28 градусов опасна для людей в возрасте 0-20 лет.");
                break;
            case 2:
                System.out.println("Не выходи. Температура больше +30 или меньше -20 градусов опасна для людей в возрасте 20-45 лет.");
                break;
            case 3:
                System.out.println("Не выходи. Температура меньше -10 или больше +25 градусов опасна для людей в возрасте 45+ лет.");
                break;
            default:
                System.out.println("Отправляйся в гости к другу. Оптимальная температура.");
                break;
        }
    }


    public static int generateRandomAge(int max) { // возвращаемый int-значение метод
        return (int) (Math.random() * max); // возврат случайного значения с помощью класса Math(метод random)
        // Math.random генерирует случ. число в диапазоне от 0 до 1. Полученное число умножаем на мах т.е 107
        //и тогда случ. число не привысит диапазон 0-107.
    }
}
