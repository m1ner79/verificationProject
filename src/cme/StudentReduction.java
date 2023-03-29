package cme;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StudentReduction implements Reduction {
    public BigDecimal calculateReduction(BigDecimal totalCost) {
        BigDecimal threshold = new BigDecimal(5.5);
        BigDecimal reductionRate = new BigDecimal(0.33);
        if (totalCost.compareTo(threshold) <= 0) {
            return totalCost;
        }
        BigDecimal reducedCost = threshold.add((totalCost.subtract(threshold)).multiply(BigDecimal.ONE.subtract(reductionRate)));
        return reducedCost.setScale(2, RoundingMode.CEILING);
    }
}
