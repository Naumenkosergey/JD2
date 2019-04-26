package lessons;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void addTest() {

        BigDecimal a = BigDecimal.valueOf(2.5);
        BigDecimal b = BigDecimal.valueOf(2.3);

        BigDecimal actual = calculator.add(a, b);
        BigDecimal expected = BigDecimal.valueOf(4.8);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subTest() {
        BigDecimal a = BigDecimal.valueOf(5.0);
        BigDecimal b = BigDecimal.valueOf(3.0);

        BigDecimal actual = calculator.sub(a, b);
        BigDecimal expected = BigDecimal.valueOf(2.0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mulTest() {
        BigDecimal a = BigDecimal.valueOf(5.0);
        BigDecimal b = BigDecimal.valueOf(3.0);

        BigDecimal actual = calculator.mul(a, b);
        BigDecimal expected = BigDecimal.valueOf(15.0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divTest() {
        BigDecimal a = BigDecimal.valueOf(5.0);
        BigDecimal b = BigDecimal.valueOf(4.0);

        BigDecimal actual = calculator.div(a, b);
        BigDecimal expected = BigDecimal.valueOf(1.25);
        Assert.assertEquals(expected, actual);
    }

}