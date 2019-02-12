package com.mavenproject.first;

public class MathsOperations {

    public int addition (int number1, int number2 ) {
        return number1 + number2;
    }

    public int subtraction (int number1, int number2 ) {
        return number1 - number2;
    }

    public int multiplication (int number1, int number2 ) {
        return number1 * number2;
    }

    public int division (int number1, int number2 ) {
        try {
            return number1/number2;
        }
        catch (ArithmeticException e) {
            throw e;
        }
    }
}
