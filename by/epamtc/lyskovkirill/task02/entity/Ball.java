package by.epamtc.lyskovkirill.task02.entity;

public class Ball {
    private SimpleColor color;
    private double weight;

    public Ball() {
    }

    public Ball(SimpleColor color, double weight){
        this.color = color;
        this.weight = Math.max(weight, 0);
    }

    public SimpleColor getColor() {
        return color;
    }

    public void setColor(SimpleColor color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws NegativeValueException {
        if (weight < 0)
            throw new NegativeValueException("Ошибка: Вес " + weight + " не может быть отрицательным");
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
        return 47 * (int) weight + color.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{color=" + color +
                ", weight=" + weight +
                '}';
    }
}
