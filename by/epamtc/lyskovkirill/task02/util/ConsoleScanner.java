package by.epamtc.lyskovkirill.task02.util;

import by.epamtc.lyskovkirill.task02.entity.SimpleColor;

import java.util.Scanner;

public class ConsoleScanner {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static int enterInteger() {
        System.out.println("Введите целое число..");
        int ret = 0;
        while (scanner.hasNext()) {
            try {
                ret = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте ввести число снова");
            }
        }
        return ret;
    }

    public static double enterDouble() {
        System.out.println("Введите число..");
        double ret = 0;
        while (scanner.hasNext()) {
            try {
                ret = Double.parseDouble(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте ввести число снова");
            }
        }
        return ret;
    }

    public static SimpleColor enterColor() {
        System.out.println("Выберите цвет..");
        for (int i = 0; i< SimpleColor.values().length; i++) {
            System.out.println(i + 1 + " - " + SimpleColor.values()[i]);
        }
        int num;
        SimpleColor ret = SimpleColor.WHITE;
        while (scanner.hasNext()) {
            try {
                num = Integer.parseInt(scanner.next()) - 1;
                if (num < 0 || num > SimpleColor.values().length) {
                    System.out.println("Попробуйте ввести число от 1 до " + SimpleColor.values().length + 1);
                    continue;
                }
                ret = SimpleColor.values()[num];
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте ввести число снова");
            }
        }
        return ret;
    }
}
