package ru.gb.test.seminars.first.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {

    @Test
    void calculateDiscount_validArguments_shouldReturnCorrectResult() {
        double purchaseAmount = 100.0;
        int discountPercent = 10;

        double result = Calculator.calculateDiscount(purchaseAmount, discountPercent);

        assertThat(result).isEqualTo(90.0);
    }

    @Test
    void calculateDiscount_negativePurchaseAmount_shouldThrowArithmeticException() {
        double purchaseAmount = -50.0;
        int discountPercent = 10;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountPercent))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments: purchaseAmount and discountPercent must be non-negative," +
                        " and discountPercent must be between 0 and 100 inclusive.");
    }

    @Test
    void calculateDiscount_negativeDiscountPercent_shouldThrowArithmeticException() {
        double purchaseAmount = 100.0;
        int discountPercent = -10;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountPercent))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments: purchaseAmount and discountPercent must be non-negative," +
                        " and discountPercent must be between 0 and 100 inclusive.");
    }

    @Test
    void calculateDiscount_discountPercentGreaterThan100_shouldThrowArithmeticException() {
        double purchaseAmount = 100.0;
        int discountPercent = 110;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountPercent))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments: purchaseAmount and discountPercent must be non-negative," +
                        " and discountPercent must be between 0 and 100 inclusive.");
    }
}
