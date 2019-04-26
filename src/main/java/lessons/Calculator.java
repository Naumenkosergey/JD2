package lessons;

import java.math.BigDecimal;

public class Calculator {

    public BigDecimal add(BigDecimal a, BigDecimal b){
        return a.add(b);
    }

    public BigDecimal sub(BigDecimal a, BigDecimal b){
        return a.subtract(b);
    }

    public BigDecimal mul(BigDecimal a, BigDecimal b){
        return a.multiply(b);
    }

    public BigDecimal div(BigDecimal a, BigDecimal b){
        return a.divide(b);
    }
}
