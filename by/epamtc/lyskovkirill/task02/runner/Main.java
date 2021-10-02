package by.epamtc.lyskovkirill.task02.runner;

import by.epamtc.lyskovkirill.task02.entity.Ball;
import by.epamtc.lyskovkirill.task02.entity.Basket;
import by.epamtc.lyskovkirill.task02.entity.Colors;
import by.epamtc.lyskovkirill.task02.util.ConsoleScanner;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();
        try {
            basket.add(new Ball(Colors.WHITE, 2.5));
            basket.add(new Ball(Colors.BLUE, 8.7));
            basket.add(new Ball(Colors.RED, 4.25));
            System.out.println(basket);
            var weight = basket.getBallsWeight();
            var amount = basket.getBallsAmountByColor(Colors.BLUE);
            System.out.println("Вес всех мячей в корзине составляет: " + weight);
            System.out.println("Количество синих мячей в корзине: " + amount);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
