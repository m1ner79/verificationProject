package cme;

import java.math.BigDecimal;

public class VisitorReduction implements Reduction {
    public BigDecimal calculateReduction(BigDecimal totalCost) {
        BigDecimal freeAmount = new BigDecimal(10);
        BigDecimal reductionRate = new BigDecimal(0.5);
        if(totalCost.compareTo(freeAmount) <= 0){
            return BigDecimal.ZERO;
        }
        return freeAmount.add(totalCost.subtract(freeAmount).multiply(reductionRate));
    }
}
