package by.epamtc.lyskovkirill.task02.runner;

import by.epamtc.lyskovkirill.task02.entity.Ball;
import by.epamtc.lyskovkirill.task02.entity.Basket;
import by.epamtc.lyskovkirill.task02.entity.SimpleColor;
import by.epamtc.lyskovkirill.task02.util.ConsoleScanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите размер корзины");
            int capacity = ConsoleScanner.enterInteger();
            Basket basket = new Basket(capacity);

            for (int i = 0; i < capacity; i++) {
                System.out.println("Введите вес мяча");
                double weight = ConsoleScanner.enterDouble();
                SimpleColor color = ConsoleScanner.enterColor();
                basket.add(new Ball(color, weight));
            }
            System.out.println(basket);

            var ballsWeight = basket.calculateBallsWeight();
            var blueBallsAmount = basket.calculateBallsByColorAmount(SimpleColor.BLUE);
            System.out.println("Вес всех мячей в корзине составляет: " + ballsWeight);
            System.out.println("Количество синих мячей в корзине: " + blueBallsAmount);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
