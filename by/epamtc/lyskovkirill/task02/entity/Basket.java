package by.epamtc.lyskovkirill.task02.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basket {
    private List<Ball> balls;
    private int capacity;

    public Basket() {
        balls = new ArrayList<>();
    }

    public Basket(int capacity) {
        balls = new ArrayList<>();
        this.capacity = Math.max(capacity, 0);
    }

    public Basket(int capacity, List<Ball> balls) {
        this.capacity = Math.max(capacity, 0);
        this.balls = balls;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) throws BasketOverflowException {
        if (capacity > balls.size())
            throw new BasketOverflowException("Ошибка: Переполнение корзины");
        this.capacity = capacity;
    }

    public void add(Ball ball) throws NullBallException, BasketOverflowException {
        if (ball == null)
            throw new NullBallException("Ошибка: Параметр является ссылкой на null");
        if (balls.size() + 1 > capacity)
            throw new BasketOverflowException("Ошибка: Переполнение корзины");
        balls.add(ball);
    }

    public Ball findByColor(SimpleColor color) {
        Ball ret = null;
        for (var ball : balls) {
            if (ball.getColor() == color) {
                ret = ball;
                break;
            }
        }
        return ret;
    }

    public void removeByColor(SimpleColor color) {
        balls.remove(findByColor(color));
    }

    public void clear() {
        balls.clear();
    }

    public double calculateBallsWeight() {
        double weight = 0;
        for (var ball :
                balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int calculateBallsByColorAmount(SimpleColor color) {
        int amount = 0;
        for (var ball : balls) {
            if (ball.getColor() == color)
                amount++;
        }
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(balls, basket.balls);
    }

    @Override
    public int hashCode() {
        int hash = 47 * capacity;
        for (var ball :
                balls) {
            hash += ball == null ? 0 : ball.hashCode();
        }
        return hash;
    }

    @Override
    public String toString() {
        String string = getClass().getName() +
                "{balls=\n";
        for (var ball :
                balls) {
            string += ball;
            if (balls.indexOf(ball) < balls.size() - 1) string += ",";
            string += "\n";
        }
        string += '}';
        return string;
    }
}
