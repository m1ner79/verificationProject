package cme;

import java.math.BigDecimal;

public class StaffReduction implements Reduction {
    public BigDecimal calculateReduction(BigDecimal totalCost) {
        BigDecimal maximumAmount = new BigDecimal("10.00");
        return totalCost.compareTo(maximumAmount) > 0 ? maximumAmount :totalCost;
    }
}
