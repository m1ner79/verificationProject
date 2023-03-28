package cme;

import java.math.BigDecimal;

public class StudentReduction implements Reduction {
    public BigDecimal calculateReduction(BigDecimal totalCost) {
        BigDecimal threshold = new BigDecimal("5.50");
        BigDecimal reductionRate = new BigDecimal("0.33");
        if (totalCost.compareTo(threshold) <= 0) {
            return totalCost;
        }
        return threshold.add((totalCost.subtract(threshold)).multiply(BigDecimal.ONE.subtract(reductionRate)));
    }
}
