package by.epamtc.lyskovkirill.task02.entity;

import java.util.Objects;

public class Ball {

    private Colors color;

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws NegativeValueException {
        if (weight < 0) throw new NegativeValueException(weight);
        this.weight = weight;
    }

    public Ball(Colors color, double weight) throws Exception {
        if (weight < 0) throw new NegativeValueException(weight);
        this.color = color;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return weight == ball.weight && color == ball.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{color=" + color +
                ", weight=" + weight +
                '}';
    }
}
