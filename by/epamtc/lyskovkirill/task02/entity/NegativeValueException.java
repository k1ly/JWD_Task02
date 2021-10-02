package by.epamtc.lyskovkirill.task02.entity;

public class NegativeValueException extends Exception {

    private double value;

    public NegativeValueException(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "NegativeValueException: " +
                "value " + value +
                " is below zero.";
    }
}
