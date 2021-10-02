package by.epamtc.lyskovkirill.task02.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Basket {

    protected ArrayList<Ball> balls = new ArrayList<>();

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        Collections.copy(this.balls, balls);
    }

    public Ball get(int index) {
        return balls.get(index);
    }

    public void set(int index, Ball ball) {
        balls.set(index, ball);
    }

    public void add(Ball ball) {
        balls.add(ball);
    }

    public void remove(Ball ball) {
        balls.remove(ball);
    }

    public void remove(int index) {
        balls.remove(index);
    }

    public void clear() {
        balls.clear();
    }

    public Basket() {
    }

    public Basket(List<Ball> balls) {
        Collections.copy(this.balls, balls);
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
        return Objects.hash(balls);
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

    public double getBallsWeight() {
        double weight = 0;
        for (var ball :
                balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getBallsAmountByColor(Colors color) {
        int amount = 0;
        for (var ball :
                balls) {
            if (ball.getColor() == color)
                amount++;
        }
        return amount;
    }
}
