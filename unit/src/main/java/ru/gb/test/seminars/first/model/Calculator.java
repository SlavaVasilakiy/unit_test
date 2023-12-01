package ru.gb.test.seminars.first.model;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double number) {
        if (number == 0) {
            throw new ArithmeticException("It is not possible to extract the root from 0");
        }
        if (number < 0) {
            throw new ArithmeticException("It is impossible to extract the root from negative numbers");
        }

        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        }
        while ((t - squareRoot) != 0);
        return squareRoot;

        // или просто return Math.sqrt(number);
    }

    /**
     * Рассчитывает сумму покупки с учетом скидки.
     *
     * @param purchaseAmount  сумма покупки
     * @param discountPercent процент скидки
     * @return сумма с учетом скидки
     * @throws ArithmeticException если переданы недопустимые аргументы
     */
    public static double calculateDiscount(double purchaseAmount, int discountPercent) {
        if (purchaseAmount < 0 || discountPercent < 0 || discountPercent > 100) {
            throw new ArithmeticException("Invalid arguments: purchaseAmount and discountPercent must be non-negative," +
                    " and discountPercent must be between 0 and 100 inclusive.");
        }

        double discount = purchaseAmount * discountPercent / 100.0;
        return purchaseAmount - discount;
    }

}